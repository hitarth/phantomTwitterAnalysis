
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
    "id",
    "url",
    "mediaURL",
    "mediaURLHttps",
    "expandedURL",
    "displayURL",
    "sizes",
    "type",
    "start",
    "end"
})
public class MediaEntity {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("url")
    private String url;
    @JsonProperty("mediaURL")
    private String mediaURL;
    @JsonProperty("mediaURLHttps")
    private String mediaURLHttps;
    @JsonProperty("expandedURL")
    private String expandedURL;
    @JsonProperty("displayURL")
    private String displayURL;
    @JsonProperty("sizes")
    private Sizes sizes;
    @JsonProperty("type")
    private String type;
    @JsonProperty("start")
    private Long start;
    @JsonProperty("end")
    private Long end;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("mediaURL")
    public String getMediaURL() {
        return mediaURL;
    }

    @JsonProperty("mediaURL")
    public void setMediaURL(String mediaURL) {
        this.mediaURL = mediaURL;
    }

    @JsonProperty("mediaURLHttps")
    public String getMediaURLHttps() {
        return mediaURLHttps;
    }

    @JsonProperty("mediaURLHttps")
    public void setMediaURLHttps(String mediaURLHttps) {
        this.mediaURLHttps = mediaURLHttps;
    }

    @JsonProperty("expandedURL")
    public String getExpandedURL() {
        return expandedURL;
    }

    @JsonProperty("expandedURL")
    public void setExpandedURL(String expandedURL) {
        this.expandedURL = expandedURL;
    }

    @JsonProperty("displayURL")
    public String getDisplayURL() {
        return displayURL;
    }

    @JsonProperty("displayURL")
    public void setDisplayURL(String displayURL) {
        this.displayURL = displayURL;
    }

    @JsonProperty("sizes")
    public Sizes getSizes() {
        return sizes;
    }

    @JsonProperty("sizes")
    public void setSizes(Sizes sizes) {
        this.sizes = sizes;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("start")
    public Long getStart() {
        return start;
    }

    @JsonProperty("start")
    public void setStart(Long start) {
        this.start = start;
    }

    @JsonProperty("end")
    public Long getEnd() {
        return end;
    }

    @JsonProperty("end")
    public void setEnd(Long end) {
        this.end = end;
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
