package twitterproject;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.util.GenericOptionsParser;
import org.codehaus.jackson.map.ObjectMapper;

import com.cybozu.labs.langdetect.LangDetectException;

import twitterPojo.TwitterPojo;
import detection.DetectLanguage;

public class TweetsFromJackson {
	
	private static String profilePath;

  public static class TokenizerMapper
       extends Mapper<Object, Text, Text, Text>{
	  
    DetectLanguage language;
	String profilePath = TweetsFromJackson.profilePath;
	protected void setup(Context context)
            throws IOException,
                   InterruptedException{
		try {
			language = new DetectLanguage();
			language.init(profilePath);
		} catch (LangDetectException e) {
			System.out.println("Invalid profile files path");
			e.printStackTrace();
		}
	}
     
    public void map(Object key, Text value, Context context
                    ) throws IOException, InterruptedException {
     String line = value.toString();
     TwitterPojo tweet = new ObjectMapper().readValue(line.getBytes(),TwitterPojo.class);
     // get the detected language
     try {
    	 	//System.out.println(tweet.getText());
		if("en".equals(language.detect(tweet.getText()))){
		     // emit the the given data
		     context.write(value 	,new Text(""));
		 }
		else {
			 //context.write(new Text(tweet.getText()+" non english detected"),new IntWritable(1));
		}
	} catch (LangDetectException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
	}
     
    }
  }
 
 
  public static void main(String[] args) throws Exception {
    Configuration conf = new Configuration();
    String[] otherArgs = new GenericOptionsParser(conf, args).getRemainingArgs();
    if (otherArgs.length != 3) {
      System.err.println("Usage: Twitter <in> <out> <profile_path>");
      System.exit(2);
    }
    TweetsFromJackson.profilePath = otherArgs[2];
    Job job = new Job(conf, "Twitter data");
    job.setJarByClass(TweetsFromJackson.class);
    job.setMapperClass(TokenizerMapper.class);
    //job.setCombinerClass(IntSumReducer.class);
    //job.setReducerClass(IntSumReducer.class)
    job.setOutputKeyClass(Text.class);
   // job.setMapOutputValueClass(NullWritable.class);
    job.setOutputValueClass(Text.class);
    FileInputFormat.addInputPath(job, new Path(otherArgs[0]));
    FileOutputFormat.setOutputPath(job, new Path(otherArgs[1]));
    System.exit(job.waitForCompletion(true) ? 0 : 1);
  }
}