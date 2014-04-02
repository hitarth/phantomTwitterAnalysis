
package twitterPojo;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "0",
    "1",
    "2",
    "3"
})
public class Sizes {

    @JsonProperty("0")
    private twitterPojo._0 _0;
    @JsonProperty("1")
    private twitterPojo._1 _1;
    @JsonProperty("2")
    private twitterPojo._2 _2;
    @JsonProperty("3")
    private twitterPojo._3 _3;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("0")
    public twitterPojo._0 get0() {
        return _0;
    }

    @JsonProperty("0")
    public void set0(twitterPojo._0 _0) {
        this._0 = _0;
    }

    @JsonProperty("1")
    public twitterPojo._1 get1() {
        return _1;
    }

    @JsonProperty("1")
    public void set1(twitterPojo._1 _1) {
        this._1 = _1;
    }

    @JsonProperty("2")
    public twitterPojo._2 get2() {
        return _2;
    }

    @JsonProperty("2")
    public void set2(twitterPojo._2 _2) {
        this._2 = _2;
    }

    @JsonProperty("3")
    public twitterPojo._3 get3() {
        return _3;
    }

    @JsonProperty("3")
    public void set3(twitterPojo._3 _3) {
        this._3 = _3;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
