
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
public class Sizes_ {

    @JsonProperty("0")
    private _0_ _0;
    @JsonProperty("1")
    private _1_ _1;
    @JsonProperty("2")
    private _2_ _2;
    @JsonProperty("3")
    private _3_ _3;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("0")
    public _0_ get0() {
        return _0;
    }

    @JsonProperty("0")
    public void set0(_0_ _0) {
        this._0 = _0;
    }

    @JsonProperty("1")
    public _1_ get1() {
        return _1;
    }

    @JsonProperty("1")
    public void set1(_1_ _1) {
        this._1 = _1;
    }

    @JsonProperty("2")
    public _2_ get2() {
        return _2;
    }

    @JsonProperty("2")
    public void set2(_2_ _2) {
        this._2 = _2;
    }

    @JsonProperty("3")
    public _3_ get3() {
        return _3;
    }

    @JsonProperty("3")
    public void set3(_3_ _3) {
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
