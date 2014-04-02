
package twitterPojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "createdAt",
    "id",
    "text",
    "source",
    "isTruncated",
    "inReplyToStatusId",
    "inReplyToUserId",
    "isFavorited",
    "retweetCount",
    "isPossiblySensitive",
    "contributorsIDs",
    "userMentionEntities",
    "urlEntities",
    "hashtagEntities",
    "mediaEntities",
    "currentUserRetweetId",
    "user"
})
public class RetweetedStatus {

    @JsonProperty("createdAt")
    private String createdAt;
    @JsonProperty("id")
    private Long id;
    @JsonProperty("text")
    private String text;
    @JsonProperty("source")
    private String source;
    @JsonProperty("isTruncated")
    private Boolean isTruncated;
    @JsonProperty("inReplyToStatusId")
    private Long inReplyToStatusId;
    @JsonProperty("inReplyToUserId")
    private Long inReplyToUserId;
    @JsonProperty("isFavorited")
    private Boolean isFavorited;
    @JsonProperty("retweetCount")
    private Long retweetCount;
    @JsonProperty("isPossiblySensitive")
    private Boolean isPossiblySensitive;
    @JsonProperty("contributorsIDs")
    private List<Object> contributorsIDs = new ArrayList<Object>();
    @JsonProperty("userMentionEntities")
    private List<Object> userMentionEntities = new ArrayList<Object>();
    @JsonProperty("urlEntities")
    private List<Object> urlEntities = new ArrayList<Object>();
    @JsonProperty("hashtagEntities")
    private List<HashtagEntity> hashtagEntities = new ArrayList<HashtagEntity>();
    @JsonProperty("mediaEntities")
    private List<MediaEntity> mediaEntities = new ArrayList<MediaEntity>();
    @JsonProperty("currentUserRetweetId")
    private Long currentUserRetweetId;
    @JsonProperty("user")
    private User user;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("createdAt")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("createdAt")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    @JsonProperty("isTruncated")
    public Boolean getIsTruncated() {
        return isTruncated;
    }

    @JsonProperty("isTruncated")
    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }

    @JsonProperty("inReplyToStatusId")
    public Long getInReplyToStatusId() {
        return inReplyToStatusId;
    }

    @JsonProperty("inReplyToStatusId")
    public void setInReplyToStatusId(Long inReplyToStatusId) {
        this.inReplyToStatusId = inReplyToStatusId;
    }

    @JsonProperty("inReplyToUserId")
    public Long getInReplyToUserId() {
        return inReplyToUserId;
    }

    @JsonProperty("inReplyToUserId")
    public void setInReplyToUserId(Long inReplyToUserId) {
        this.inReplyToUserId = inReplyToUserId;
    }

    @JsonProperty("isFavorited")
    public Boolean getIsFavorited() {
        return isFavorited;
    }

    @JsonProperty("isFavorited")
    public void setIsFavorited(Boolean isFavorited) {
        this.isFavorited = isFavorited;
    }

    @JsonProperty("retweetCount")
    public Long getRetweetCount() {
        return retweetCount;
    }

    @JsonProperty("retweetCount")
    public void setRetweetCount(Long retweetCount) {
        this.retweetCount = retweetCount;
    }

    @JsonProperty("isPossiblySensitive")
    public Boolean getIsPossiblySensitive() {
        return isPossiblySensitive;
    }

    @JsonProperty("isPossiblySensitive")
    public void setIsPossiblySensitive(Boolean isPossiblySensitive) {
        this.isPossiblySensitive = isPossiblySensitive;
    }

    @JsonProperty("contributorsIDs")
    public List<Object> getContributorsIDs() {
        return contributorsIDs;
    }

    @JsonProperty("contributorsIDs")
    public void setContributorsIDs(List<Object> contributorsIDs) {
        this.contributorsIDs = contributorsIDs;
    }

    @JsonProperty("userMentionEntities")
    public List<Object> getUserMentionEntities() {
        return userMentionEntities;
    }

    @JsonProperty("userMentionEntities")
    public void setUserMentionEntities(List<Object> userMentionEntities) {
        this.userMentionEntities = userMentionEntities;
    }

    @JsonProperty("urlEntities")
    public List<Object> getUrlEntities() {
        return urlEntities;
    }

    @JsonProperty("urlEntities")
    public void setUrlEntities(List<Object> urlEntities) {
        this.urlEntities = urlEntities;
    }

    @JsonProperty("hashtagEntities")
    public List<HashtagEntity> getHashtagEntities() {
        return hashtagEntities;
    }

    @JsonProperty("hashtagEntities")
    public void setHashtagEntities(List<HashtagEntity> hashtagEntities) {
        this.hashtagEntities = hashtagEntities;
    }

    @JsonProperty("mediaEntities")
    public List<MediaEntity> getMediaEntities() {
        return mediaEntities;
    }

    @JsonProperty("mediaEntities")
    public void setMediaEntities(List<MediaEntity> mediaEntities) {
        this.mediaEntities = mediaEntities;
    }

    @JsonProperty("currentUserRetweetId")
    public Long getCurrentUserRetweetId() {
        return currentUserRetweetId;
    }

    @JsonProperty("currentUserRetweetId")
    public void setCurrentUserRetweetId(Long currentUserRetweetId) {
        this.currentUserRetweetId = currentUserRetweetId;
    }

    @JsonProperty("user")
    public User getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(User user) {
        this.user = user;
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
