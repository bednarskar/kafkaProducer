
package rpf.kawa;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "notifications",
    "profile_use_background_image",
    "statuses_count",
    "profile_background_color",
    "followers_count",
    "profile_image_url",
    "listed_count",
    "profile_background_image_url",
    "description",
    "screen_name",
    "default_profile",
    "verified",
    "time_zone",
    "profile_text_color",
    "is_translator",
    "profile_sidebar_fill_color",
    "location",
    "id_str",
    "default_profile_image",
    "profile_background_tile",
    "lang",
    "friends_count",
    "protected",
    "favourites_count",
    "created_at",
    "profile_link_color",
    "name",
    "show_all_inline_media",
    "follow_request_sent",
    "geo_enabled",
    "profile_sidebar_border_color",
    "url",
    "id",
    "contributors_enabled",
    "following",
    "utc_offset"
})
public class User_ {

    @JsonProperty("notifications")
    private Object notifications;
    @JsonProperty("profile_use_background_image")
    private boolean profileUseBackgroundImage;
    @JsonProperty("statuses_count")
    private long statusesCount;
    @JsonProperty("profile_background_color")
    private String profileBackgroundColor;
    @JsonProperty("followers_count")
    private long followersCount;
    @JsonProperty("profile_image_url")
    private String profileImageUrl;
    @JsonProperty("listed_count")
    private long listedCount;
    @JsonProperty("profile_background_image_url")
    private String profileBackgroundImageUrl;
    @JsonProperty("description")
    private String description;
    @JsonProperty("screen_name")
    private String screenName;
    @JsonProperty("default_profile")
    private boolean defaultProfile;
    @JsonProperty("verified")
    private boolean verified;
    @JsonProperty("time_zone")
    private String timeZone;
    @JsonProperty("profile_text_color")
    private String profileTextColor;
    @JsonProperty("is_translator")
    private boolean isTranslator;
    @JsonProperty("profile_sidebar_fill_color")
    private String profileSidebarFillColor;
    @JsonProperty("location")
    private String location;
    @JsonProperty("id_str")
    private String idStr;
    @JsonProperty("default_profile_image")
    private boolean defaultProfileImage;
    @JsonProperty("profile_background_tile")
    private boolean profileBackgroundTile;
    @JsonProperty("lang")
    private String lang;
    @JsonProperty("friends_count")
    private long friendsCount;
    @JsonProperty("protected")
    private boolean _protected;
    @JsonProperty("favourites_count")
    private long favouritesCount;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("profile_link_color")
    private String profileLinkColor;
    @JsonProperty("name")
    private String name;
    @JsonProperty("show_all_inline_media")
    private boolean showAllInlineMedia;
    @JsonProperty("follow_request_sent")
    private Object followRequestSent;
    @JsonProperty("geo_enabled")
    private boolean geoEnabled;
    @JsonProperty("profile_sidebar_border_color")
    private String profileSidebarBorderColor;
    @JsonProperty("url")
    private Object url;
    @JsonProperty("id")
    private long id;
    @JsonProperty("contributors_enabled")
    private boolean contributorsEnabled;
    @JsonProperty("following")
    private Object following;
    @JsonProperty("utc_offset")
    private long utcOffset;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public User_() {
    }

    /**
     * 
     * @param isTranslator
     * @param friendsCount
     * @param profileBackgroundColor
     * @param profileUseBackgroundImage
     * @param followRequestSent
     * @param location
     * @param favouritesCount
     * @param screenName
     * @param profileImageUrl
     * @param timeZone
     * @param profileSidebarBorderColor
     * @param defaultProfileImage
     * @param lang
     * @param id
     * @param following
     * @param profileSidebarFillColor
     * @param createdAt
     * @param verified
     * @param description
     * @param name
     * @param contributorsEnabled
     * @param geoEnabled
     * @param listedCount
     * @param url
     * @param idStr
     * @param _protected
     * @param profileBackgroundTile
     * @param profileLinkColor
     * @param notifications
     * @param showAllInlineMedia
     * @param utcOffset
     * @param followersCount
     * @param profileTextColor
     * @param profileBackgroundImageUrl
     * @param statusesCount
     * @param defaultProfile
     */
    public User_(Object notifications, boolean profileUseBackgroundImage, long statusesCount, String profileBackgroundColor, long followersCount, String profileImageUrl, long listedCount, String profileBackgroundImageUrl, String description, String screenName, boolean defaultProfile, boolean verified, String timeZone, String profileTextColor, boolean isTranslator, String profileSidebarFillColor, String location, String idStr, boolean defaultProfileImage, boolean profileBackgroundTile, String lang, long friendsCount, boolean _protected, long favouritesCount, String createdAt, String profileLinkColor, String name, boolean showAllInlineMedia, Object followRequestSent, boolean geoEnabled, String profileSidebarBorderColor, Object url, long id, boolean contributorsEnabled, Object following, long utcOffset) {
        super();
        this.notifications = notifications;
        this.profileUseBackgroundImage = profileUseBackgroundImage;
        this.statusesCount = statusesCount;
        this.profileBackgroundColor = profileBackgroundColor;
        this.followersCount = followersCount;
        this.profileImageUrl = profileImageUrl;
        this.listedCount = listedCount;
        this.profileBackgroundImageUrl = profileBackgroundImageUrl;
        this.description = description;
        this.screenName = screenName;
        this.defaultProfile = defaultProfile;
        this.verified = verified;
        this.timeZone = timeZone;
        this.profileTextColor = profileTextColor;
        this.isTranslator = isTranslator;
        this.profileSidebarFillColor = profileSidebarFillColor;
        this.location = location;
        this.idStr = idStr;
        this.defaultProfileImage = defaultProfileImage;
        this.profileBackgroundTile = profileBackgroundTile;
        this.lang = lang;
        this.friendsCount = friendsCount;
        this._protected = _protected;
        this.favouritesCount = favouritesCount;
        this.createdAt = createdAt;
        this.profileLinkColor = profileLinkColor;
        this.name = name;
        this.showAllInlineMedia = showAllInlineMedia;
        this.followRequestSent = followRequestSent;
        this.geoEnabled = geoEnabled;
        this.profileSidebarBorderColor = profileSidebarBorderColor;
        this.url = url;
        this.id = id;
        this.contributorsEnabled = contributorsEnabled;
        this.following = following;
        this.utcOffset = utcOffset;
    }

    @JsonProperty("notifications")
    public Object getNotifications() {
        return notifications;
    }

    @JsonProperty("notifications")
    public void setNotifications(Object notifications) {
        this.notifications = notifications;
    }

    @JsonProperty("profile_use_background_image")
    public boolean isProfileUseBackgroundImage() {
        return profileUseBackgroundImage;
    }

    @JsonProperty("profile_use_background_image")
    public void setProfileUseBackgroundImage(boolean profileUseBackgroundImage) {
        this.profileUseBackgroundImage = profileUseBackgroundImage;
    }

    @JsonProperty("statuses_count")
    public long getStatusesCount() {
        return statusesCount;
    }

    @JsonProperty("statuses_count")
    public void setStatusesCount(long statusesCount) {
        this.statusesCount = statusesCount;
    }

    @JsonProperty("profile_background_color")
    public String getProfileBackgroundColor() {
        return profileBackgroundColor;
    }

    @JsonProperty("profile_background_color")
    public void setProfileBackgroundColor(String profileBackgroundColor) {
        this.profileBackgroundColor = profileBackgroundColor;
    }

    @JsonProperty("followers_count")
    public long getFollowersCount() {
        return followersCount;
    }

    @JsonProperty("followers_count")
    public void setFollowersCount(long followersCount) {
        this.followersCount = followersCount;
    }

    @JsonProperty("profile_image_url")
    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    @JsonProperty("profile_image_url")
    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    @JsonProperty("listed_count")
    public long getListedCount() {
        return listedCount;
    }

    @JsonProperty("listed_count")
    public void setListedCount(long listedCount) {
        this.listedCount = listedCount;
    }

    @JsonProperty("profile_background_image_url")
    public String getProfileBackgroundImageUrl() {
        return profileBackgroundImageUrl;
    }

    @JsonProperty("profile_background_image_url")
    public void setProfileBackgroundImageUrl(String profileBackgroundImageUrl) {
        this.profileBackgroundImageUrl = profileBackgroundImageUrl;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("screen_name")
    public String getScreenName() {
        return screenName;
    }

    @JsonProperty("screen_name")
    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    @JsonProperty("default_profile")
    public boolean isDefaultProfile() {
        return defaultProfile;
    }

    @JsonProperty("default_profile")
    public void setDefaultProfile(boolean defaultProfile) {
        this.defaultProfile = defaultProfile;
    }

    @JsonProperty("verified")
    public boolean isVerified() {
        return verified;
    }

    @JsonProperty("verified")
    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    @JsonProperty("time_zone")
    public String getTimeZone() {
        return timeZone;
    }

    @JsonProperty("time_zone")
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    @JsonProperty("profile_text_color")
    public String getProfileTextColor() {
        return profileTextColor;
    }

    @JsonProperty("profile_text_color")
    public void setProfileTextColor(String profileTextColor) {
        this.profileTextColor = profileTextColor;
    }

    @JsonProperty("is_translator")
    public boolean isIsTranslator() {
        return isTranslator;
    }

    @JsonProperty("is_translator")
    public void setIsTranslator(boolean isTranslator) {
        this.isTranslator = isTranslator;
    }

    @JsonProperty("profile_sidebar_fill_color")
    public String getProfileSidebarFillColor() {
        return profileSidebarFillColor;
    }

    @JsonProperty("profile_sidebar_fill_color")
    public void setProfileSidebarFillColor(String profileSidebarFillColor) {
        this.profileSidebarFillColor = profileSidebarFillColor;
    }

    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    @JsonProperty("id_str")
    public String getIdStr() {
        return idStr;
    }

    @JsonProperty("id_str")
    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    @JsonProperty("default_profile_image")
    public boolean isDefaultProfileImage() {
        return defaultProfileImage;
    }

    @JsonProperty("default_profile_image")
    public void setDefaultProfileImage(boolean defaultProfileImage) {
        this.defaultProfileImage = defaultProfileImage;
    }

    @JsonProperty("profile_background_tile")
    public boolean isProfileBackgroundTile() {
        return profileBackgroundTile;
    }

    @JsonProperty("profile_background_tile")
    public void setProfileBackgroundTile(boolean profileBackgroundTile) {
        this.profileBackgroundTile = profileBackgroundTile;
    }

    @JsonProperty("lang")
    public String getLang() {
        return lang;
    }

    @JsonProperty("lang")
    public void setLang(String lang) {
        this.lang = lang;
    }

    @JsonProperty("friends_count")
    public long getFriendsCount() {
        return friendsCount;
    }

    @JsonProperty("friends_count")
    public void setFriendsCount(long friendsCount) {
        this.friendsCount = friendsCount;
    }

    @JsonProperty("protected")
    public boolean isProtected() {
        return _protected;
    }

    @JsonProperty("protected")
    public void setProtected(boolean _protected) {
        this._protected = _protected;
    }

    @JsonProperty("favourites_count")
    public long getFavouritesCount() {
        return favouritesCount;
    }

    @JsonProperty("favourites_count")
    public void setFavouritesCount(long favouritesCount) {
        this.favouritesCount = favouritesCount;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("profile_link_color")
    public String getProfileLinkColor() {
        return profileLinkColor;
    }

    @JsonProperty("profile_link_color")
    public void setProfileLinkColor(String profileLinkColor) {
        this.profileLinkColor = profileLinkColor;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("show_all_inline_media")
    public boolean isShowAllInlineMedia() {
        return showAllInlineMedia;
    }

    @JsonProperty("show_all_inline_media")
    public void setShowAllInlineMedia(boolean showAllInlineMedia) {
        this.showAllInlineMedia = showAllInlineMedia;
    }

    @JsonProperty("follow_request_sent")
    public Object getFollowRequestSent() {
        return followRequestSent;
    }

    @JsonProperty("follow_request_sent")
    public void setFollowRequestSent(Object followRequestSent) {
        this.followRequestSent = followRequestSent;
    }

    @JsonProperty("geo_enabled")
    public boolean isGeoEnabled() {
        return geoEnabled;
    }

    @JsonProperty("geo_enabled")
    public void setGeoEnabled(boolean geoEnabled) {
        this.geoEnabled = geoEnabled;
    }

    @JsonProperty("profile_sidebar_border_color")
    public String getProfileSidebarBorderColor() {
        return profileSidebarBorderColor;
    }

    @JsonProperty("profile_sidebar_border_color")
    public void setProfileSidebarBorderColor(String profileSidebarBorderColor) {
        this.profileSidebarBorderColor = profileSidebarBorderColor;
    }

    @JsonProperty("url")
    public Object getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(Object url) {
        this.url = url;
    }

    @JsonProperty("id")
    public long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(long id) {
        this.id = id;
    }

    @JsonProperty("contributors_enabled")
    public boolean isContributorsEnabled() {
        return contributorsEnabled;
    }

    @JsonProperty("contributors_enabled")
    public void setContributorsEnabled(boolean contributorsEnabled) {
        this.contributorsEnabled = contributorsEnabled;
    }

    @JsonProperty("following")
    public Object getFollowing() {
        return following;
    }

    @JsonProperty("following")
    public void setFollowing(Object following) {
        this.following = following;
    }

    @JsonProperty("utc_offset")
    public long getUtcOffset() {
        return utcOffset;
    }

    @JsonProperty("utc_offset")
    public void setUtcOffset(long utcOffset) {
        this.utcOffset = utcOffset;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("notifications", notifications).append("profileUseBackgroundImage", profileUseBackgroundImage).append("statusesCount", statusesCount).append("profileBackgroundColor", profileBackgroundColor).append("followersCount", followersCount).append("profileImageUrl", profileImageUrl).append("listedCount", listedCount).append("profileBackgroundImageUrl", profileBackgroundImageUrl).append("description", description).append("screenName", screenName).append("defaultProfile", defaultProfile).append("verified", verified).append("timeZone", timeZone).append("profileTextColor", profileTextColor).append("isTranslator", isTranslator).append("profileSidebarFillColor", profileSidebarFillColor).append("location", location).append("idStr", idStr).append("defaultProfileImage", defaultProfileImage).append("profileBackgroundTile", profileBackgroundTile).append("lang", lang).append("friendsCount", friendsCount).append("_protected", _protected).append("favouritesCount", favouritesCount).append("createdAt", createdAt).append("profileLinkColor", profileLinkColor).append("name", name).append("showAllInlineMedia", showAllInlineMedia).append("followRequestSent", followRequestSent).append("geoEnabled", geoEnabled).append("profileSidebarBorderColor", profileSidebarBorderColor).append("url", url).append("id", id).append("contributorsEnabled", contributorsEnabled).append("following", following).append("utcOffset", utcOffset).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(isTranslator).append(friendsCount).append(profileBackgroundColor).append(profileUseBackgroundImage).append(followRequestSent).append(location).append(favouritesCount).append(screenName).append(timeZone).append(profileImageUrl).append(profileSidebarBorderColor).append(lang).append(defaultProfileImage).append(id).append(following).append(profileSidebarFillColor).append(createdAt).append(verified).append(description).append(name).append(contributorsEnabled).append(geoEnabled).append(listedCount).append(url).append(_protected).append(idStr).append(profileBackgroundTile).append(profileLinkColor).append(notifications).append(additionalProperties).append(showAllInlineMedia).append(utcOffset).append(followersCount).append(profileTextColor).append(profileBackgroundImageUrl).append(statusesCount).append(defaultProfile).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof User_) == false) {
            return false;
        }
        User_ rhs = ((User_) other);
        return new EqualsBuilder().append(isTranslator, rhs.isTranslator).append(friendsCount, rhs.friendsCount).append(profileBackgroundColor, rhs.profileBackgroundColor).append(profileUseBackgroundImage, rhs.profileUseBackgroundImage).append(followRequestSent, rhs.followRequestSent).append(location, rhs.location).append(favouritesCount, rhs.favouritesCount).append(screenName, rhs.screenName).append(timeZone, rhs.timeZone).append(profileImageUrl, rhs.profileImageUrl).append(profileSidebarBorderColor, rhs.profileSidebarBorderColor).append(lang, rhs.lang).append(defaultProfileImage, rhs.defaultProfileImage).append(id, rhs.id).append(following, rhs.following).append(profileSidebarFillColor, rhs.profileSidebarFillColor).append(createdAt, rhs.createdAt).append(verified, rhs.verified).append(description, rhs.description).append(name, rhs.name).append(contributorsEnabled, rhs.contributorsEnabled).append(geoEnabled, rhs.geoEnabled).append(listedCount, rhs.listedCount).append(url, rhs.url).append(_protected, rhs._protected).append(idStr, rhs.idStr).append(profileBackgroundTile, rhs.profileBackgroundTile).append(profileLinkColor, rhs.profileLinkColor).append(notifications, rhs.notifications).append(additionalProperties, rhs.additionalProperties).append(showAllInlineMedia, rhs.showAllInlineMedia).append(utcOffset, rhs.utcOffset).append(followersCount, rhs.followersCount).append(profileTextColor, rhs.profileTextColor).append(profileBackgroundImageUrl, rhs.profileBackgroundImageUrl).append(statusesCount, rhs.statusesCount).append(defaultProfile, rhs.defaultProfile).isEquals();
    }

}
