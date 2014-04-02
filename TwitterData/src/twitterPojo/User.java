
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
    "id",
    "name",
    "screenName",
    "location",
    "description",
    "descriptionURLEntities",
    "isContributorsEnabled",
    "profileImageUrl",
    "profileImageUrlHttps",
    "url",
    "isProtected",
    "followersCount",
    "profileBackgroundColor",
    "profileTextColor",
    "profileLinkColor",
    "profileSidebarFillColor",
    "profileSidebarBorderColor",
    "profileUseBackgroundImage",
    "showAllInlineMedia",
    "friendsCount",
    "createdAt",
    "favouritesCount",
    "utcOffset",
    "timeZone",
    "profileBackgroundImageUrl",
    "profileBackgroundImageUrlHttps",
    "profileBannerImageUrl",
    "profileBackgroundTiled",
    "lang",
    "statusesCount",
    "isGeoEnabled",
    "isVerified",
    "translator",
    "listedCount",
    "isFollowRequestSent"
})
public class User {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("screenName")
    private String screenName;
    @JsonProperty("location")
    private String location;
    @JsonProperty("description")
    private String description;
    @JsonProperty("descriptionURLEntities")
    private List<Object> descriptionURLEntities = new ArrayList<Object>();
    @JsonProperty("isContributorsEnabled")
    private Boolean isContributorsEnabled;
    @JsonProperty("profileImageUrl")
    private String profileImageUrl;
    @JsonProperty("profileImageUrlHttps")
    private String profileImageUrlHttps;
    @JsonProperty("url")
    private String url;
    @JsonProperty("isProtected")
    private Boolean isProtected;
    @JsonProperty("followersCount")
    private Long followersCount;
    @JsonProperty("profileBackgroundColor")
    private String profileBackgroundColor;
    @JsonProperty("profileTextColor")
    private String profileTextColor;
    @JsonProperty("profileLinkColor")
    private String profileLinkColor;
    @JsonProperty("profileSidebarFillColor")
    private String profileSidebarFillColor;
    @JsonProperty("profileSidebarBorderColor")
    private String profileSidebarBorderColor;
    @JsonProperty("profileUseBackgroundImage")
    private Boolean profileUseBackgroundImage;
    @JsonProperty("showAllInlineMedia")
    private Boolean showAllInlineMedia;
    @JsonProperty("friendsCount")
    private Long friendsCount;
    @JsonProperty("createdAt")
    private String createdAt;
    @JsonProperty("favouritesCount")
    private Long favouritesCount;
    @JsonProperty("utcOffset")
    private Long utcOffset;
    @JsonProperty("timeZone")
    private String timeZone;
    @JsonProperty("profileBackgroundImageUrl")
    private String profileBackgroundImageUrl;
    @JsonProperty("profileBackgroundImageUrlHttps")
    private String profileBackgroundImageUrlHttps;
    @JsonProperty("profileBannerImageUrl")
    private String profileBannerImageUrl;
    @JsonProperty("profileBackgroundTiled")
    private Boolean profileBackgroundTiled;
    @JsonProperty("lang")
    private String lang;
    @JsonProperty("statusesCount")
    private Long statusesCount;
    @JsonProperty("isGeoEnabled")
    private Boolean isGeoEnabled;
    @JsonProperty("isVerified")
    private Boolean isVerified;
    @JsonProperty("translator")
    private Boolean translator;
    @JsonProperty("listedCount")
    private Long listedCount;
    @JsonProperty("isFollowRequestSent")
    private Boolean isFollowRequestSent;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("screenName")
    public String getScreenName() {
        return screenName;
    }

    @JsonProperty("screenName")
    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("descriptionURLEntities")
    public List<Object> getDescriptionURLEntities() {
        return descriptionURLEntities;
    }

    @JsonProperty("descriptionURLEntities")
    public void setDescriptionURLEntities(List<Object> descriptionURLEntities) {
        this.descriptionURLEntities = descriptionURLEntities;
    }

    @JsonProperty("isContributorsEnabled")
    public Boolean getIsContributorsEnabled() {
        return isContributorsEnabled;
    }

    @JsonProperty("isContributorsEnabled")
    public void setIsContributorsEnabled(Boolean isContributorsEnabled) {
        this.isContributorsEnabled = isContributorsEnabled;
    }

    @JsonProperty("profileImageUrl")
    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    @JsonProperty("profileImageUrl")
    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    @JsonProperty("profileImageUrlHttps")
    public String getProfileImageUrlHttps() {
        return profileImageUrlHttps;
    }

    @JsonProperty("profileImageUrlHttps")
    public void setProfileImageUrlHttps(String profileImageUrlHttps) {
        this.profileImageUrlHttps = profileImageUrlHttps;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("isProtected")
    public Boolean getIsProtected() {
        return isProtected;
    }

    @JsonProperty("isProtected")
    public void setIsProtected(Boolean isProtected) {
        this.isProtected = isProtected;
    }

    @JsonProperty("followersCount")
    public Long getFollowersCount() {
        return followersCount;
    }

    @JsonProperty("followersCount")
    public void setFollowersCount(Long followersCount) {
        this.followersCount = followersCount;
    }

    @JsonProperty("profileBackgroundColor")
    public String getProfileBackgroundColor() {
        return profileBackgroundColor;
    }

    @JsonProperty("profileBackgroundColor")
    public void setProfileBackgroundColor(String profileBackgroundColor) {
        this.profileBackgroundColor = profileBackgroundColor;
    }

    @JsonProperty("profileTextColor")
    public String getProfileTextColor() {
        return profileTextColor;
    }

    @JsonProperty("profileTextColor")
    public void setProfileTextColor(String profileTextColor) {
        this.profileTextColor = profileTextColor;
    }

    @JsonProperty("profileLinkColor")
    public String getProfileLinkColor() {
        return profileLinkColor;
    }

    @JsonProperty("profileLinkColor")
    public void setProfileLinkColor(String profileLinkColor) {
        this.profileLinkColor = profileLinkColor;
    }

    @JsonProperty("profileSidebarFillColor")
    public String getProfileSidebarFillColor() {
        return profileSidebarFillColor;
    }

    @JsonProperty("profileSidebarFillColor")
    public void setProfileSidebarFillColor(String profileSidebarFillColor) {
        this.profileSidebarFillColor = profileSidebarFillColor;
    }

    @JsonProperty("profileSidebarBorderColor")
    public String getProfileSidebarBorderColor() {
        return profileSidebarBorderColor;
    }

    @JsonProperty("profileSidebarBorderColor")
    public void setProfileSidebarBorderColor(String profileSidebarBorderColor) {
        this.profileSidebarBorderColor = profileSidebarBorderColor;
    }

    @JsonProperty("profileUseBackgroundImage")
    public Boolean getProfileUseBackgroundImage() {
        return profileUseBackgroundImage;
    }

    @JsonProperty("profileUseBackgroundImage")
    public void setProfileUseBackgroundImage(Boolean profileUseBackgroundImage) {
        this.profileUseBackgroundImage = profileUseBackgroundImage;
    }

    @JsonProperty("showAllInlineMedia")
    public Boolean getShowAllInlineMedia() {
        return showAllInlineMedia;
    }

    @JsonProperty("showAllInlineMedia")
    public void setShowAllInlineMedia(Boolean showAllInlineMedia) {
        this.showAllInlineMedia = showAllInlineMedia;
    }

    @JsonProperty("friendsCount")
    public Long getFriendsCount() {
        return friendsCount;
    }

    @JsonProperty("friendsCount")
    public void setFriendsCount(Long friendsCount) {
        this.friendsCount = friendsCount;
    }

    @JsonProperty("createdAt")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("createdAt")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("favouritesCount")
    public Long getFavouritesCount() {
        return favouritesCount;
    }

    @JsonProperty("favouritesCount")
    public void setFavouritesCount(Long favouritesCount) {
        this.favouritesCount = favouritesCount;
    }

    @JsonProperty("utcOffset")
    public Long getUtcOffset() {
        return utcOffset;
    }

    @JsonProperty("utcOffset")
    public void setUtcOffset(Long utcOffset) {
        this.utcOffset = utcOffset;
    }

    @JsonProperty("timeZone")
    public String getTimeZone() {
        return timeZone;
    }

    @JsonProperty("timeZone")
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    @JsonProperty("profileBackgroundImageUrl")
    public String getProfileBackgroundImageUrl() {
        return profileBackgroundImageUrl;
    }

    @JsonProperty("profileBackgroundImageUrl")
    public void setProfileBackgroundImageUrl(String profileBackgroundImageUrl) {
        this.profileBackgroundImageUrl = profileBackgroundImageUrl;
    }

    @JsonProperty("profileBackgroundImageUrlHttps")
    public String getProfileBackgroundImageUrlHttps() {
        return profileBackgroundImageUrlHttps;
    }

    @JsonProperty("profileBackgroundImageUrlHttps")
    public void setProfileBackgroundImageUrlHttps(String profileBackgroundImageUrlHttps) {
        this.profileBackgroundImageUrlHttps = profileBackgroundImageUrlHttps;
    }

    @JsonProperty("profileBannerImageUrl")
    public String getProfileBannerImageUrl() {
        return profileBannerImageUrl;
    }

    @JsonProperty("profileBannerImageUrl")
    public void setProfileBannerImageUrl(String profileBannerImageUrl) {
        this.profileBannerImageUrl = profileBannerImageUrl;
    }

    @JsonProperty("profileBackgroundTiled")
    public Boolean getProfileBackgroundTiled() {
        return profileBackgroundTiled;
    }

    @JsonProperty("profileBackgroundTiled")
    public void setProfileBackgroundTiled(Boolean profileBackgroundTiled) {
        this.profileBackgroundTiled = profileBackgroundTiled;
    }

    @JsonProperty("lang")
    public String getLang() {
        return lang;
    }

    @JsonProperty("lang")
    public void setLang(String lang) {
        this.lang = lang;
    }

    @JsonProperty("statusesCount")
    public Long getStatusesCount() {
        return statusesCount;
    }

    @JsonProperty("statusesCount")
    public void setStatusesCount(Long statusesCount) {
        this.statusesCount = statusesCount;
    }

    @JsonProperty("isGeoEnabled")
    public Boolean getIsGeoEnabled() {
        return isGeoEnabled;
    }

    @JsonProperty("isGeoEnabled")
    public void setIsGeoEnabled(Boolean isGeoEnabled) {
        this.isGeoEnabled = isGeoEnabled;
    }

    @JsonProperty("isVerified")
    public Boolean getIsVerified() {
        return isVerified;
    }

    @JsonProperty("isVerified")
    public void setIsVerified(Boolean isVerified) {
        this.isVerified = isVerified;
    }

    @JsonProperty("translator")
    public Boolean getTranslator() {
        return translator;
    }

    @JsonProperty("translator")
    public void setTranslator(Boolean translator) {
        this.translator = translator;
    }

    @JsonProperty("listedCount")
    public Long getListedCount() {
        return listedCount;
    }

    @JsonProperty("listedCount")
    public void setListedCount(Long listedCount) {
        this.listedCount = listedCount;
    }

    @JsonProperty("isFollowRequestSent")
    public Boolean getIsFollowRequestSent() {
        return isFollowRequestSent;
    }

    @JsonProperty("isFollowRequestSent")
    public void setIsFollowRequestSent(Boolean isFollowRequestSent) {
        this.isFollowRequestSent = isFollowRequestSent;
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
