package twitterproject;

import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.util.GenericOptionsParser;
import org.codehaus.jackson.map.ObjectMapper;

import twitterPojo.TwitterPojo;

public class TweetsFromJackson {

  public static class TokenizerMapper
       extends Mapper<Object, Text, Text, IntWritable>{
   
    private final static IntWritable one = new IntWritable(1);
    private Text word = new Text();
     
    public void map(Object key, Text value, Context context
                    ) throws IOException, InterruptedException {
     String line = value.toString();

    if(line.startsWith("{\"createdAt\":")){
                TwitterPojo tweet = new ObjectMapper().readValue(line.getBytes(),TwitterPojo.class);
                StringBuilder data = new StringBuilder();
                data.append(tweet.getText()).append("¿").append(tweet.getCreatedAt());
                word.set(data.toString());
                System.out.println(data.toString());
                context.write(word, one);
            }
    }
  }
 
 
  public static void main(String[] args) throws Exception {
    Configuration conf = new Configuration();
    String[] otherArgs = new GenericOptionsParser(conf, args).getRemainingArgs();
    if (otherArgs.length != 2) {
      System.err.println("Usage: Twitter <in> <out>");
      System.exit(2);
    }
    Job job = new Job(conf, "Twitter data");
    job.setJarByClass(TweetsFromJackson.class);
    job.setMapperClass(TokenizerMapper.class);
    //job.setCombinerClass(IntSumReducer.class);
    //job.setReducerClass(IntSumReducer.class);
    job.setOutputKeyClass(Text.class);
    job.setOutputValueClass(IntWritable.class);
    FileInputFormat.addInputPath(job, new Path(otherArgs[0]));
    FileOutputFormat.setOutputPath(job, new Path(otherArgs[1]));
    System.exit(job.waitForCompletion(true) ? 0 : 1);
  }
}