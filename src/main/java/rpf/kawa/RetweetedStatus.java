
package rpf.kawa;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "text",
    "truncated",
    "in_reply_to_user_id",
    "in_reply_to_status_id",
    "favorited",
    "source",
    "in_reply_to_screen_name",
    "in_reply_to_status_id_str",
    "id_str",
    "entities",
    "contributors",
    "retweeted",
    "in_reply_to_user_id_str",
    "place",
    "retweet_count",
    "created_at",
    "user",
    "id",
    "coordinates",
    "geo"
})
public class RetweetedStatus {

    @JsonProperty("text")
    private String text;
    @JsonProperty("truncated")
    private boolean truncated;
    @JsonProperty("in_reply_to_user_id")
    private Object inReplyToUserId;
    @JsonProperty("in_reply_to_status_id")
    private Object inReplyToStatusId;
    @JsonProperty("favorited")
    private boolean favorited;
    @JsonProperty("source")
    private String source;
    @JsonProperty("in_reply_to_screen_name")
    private Object inReplyToScreenName;
    @JsonProperty("in_reply_to_status_id_str")
    private Object inReplyToStatusIdStr;
    @JsonProperty("id_str")
    private String idStr;
    @JsonProperty("entities")
    private Entities_ entities;
    @JsonProperty("contributors")
    private Object contributors;
    @JsonProperty("retweeted")
    private boolean retweeted;
    @JsonProperty("in_reply_to_user_id_str")
    private Object inReplyToUserIdStr;
    @JsonProperty("place")
    private Object place;
    @JsonProperty("retweet_count")
    private long retweetCount;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("user")
    private User user;
    @JsonProperty("id")
    private long id;
    @JsonProperty("coordinates")
    private Object coordinates;
    @JsonProperty("geo")
    private Object geo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public RetweetedStatus() {
    }

    /**
     * 
     * @param text
     * @param contributors
     * @param geo
     * @param inReplyToUserIdStr
     * @param retweeted
     * @param retweetCount
     * @param inReplyToScreenName
     * @param truncated
     * @param entities
     * @param idStr
     * @param id
     * @param inReplyToStatusId
     * @param source
     * @param favorited
     * @param inReplyToStatusIdStr
     * @param createdAt
     * @param inReplyToUserId
     * @param place
     * @param user
     * @param coordinates
     */
    public RetweetedStatus(String text, boolean truncated, Object inReplyToUserId, Object inReplyToStatusId, boolean favorited, String source, Object inReplyToScreenName, Object inReplyToStatusIdStr, String idStr, Entities_ entities, Object contributors, boolean retweeted, Object inReplyToUserIdStr, Object place, long retweetCount, String createdAt, User user, long id, Object coordinates, Object geo) {
        super();
        this.text = text;
        this.truncated = truncated;
        this.inReplyToUserId = inReplyToUserId;
        this.inReplyToStatusId = inReplyToStatusId;
        this.favorited = favorited;
        this.source = source;
        this.inReplyToScreenName = inReplyToScreenName;
        this.inReplyToStatusIdStr = inReplyToStatusIdStr;
        this.idStr = idStr;
        this.entities = entities;
        this.contributors = contributors;
        this.retweeted = retweeted;
        this.inReplyToUserIdStr = inReplyToUserIdStr;
        this.place = place;
        this.retweetCount = retweetCount;
        this.createdAt = createdAt;
        this.user = user;
        this.id = id;
        this.coordinates = coordinates;
        this.geo = geo;
    }

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    @JsonProperty("truncated")
    public boolean isTruncated() {
        return truncated;
    }

    @JsonProperty("truncated")
    public void setTruncated(boolean truncated) {
        this.truncated = truncated;
    }

    @JsonProperty("in_reply_to_user_id")
    public Object getInReplyToUserId() {
        return inReplyToUserId;
    }

    @JsonProperty("in_reply_to_user_id")
    public void setInReplyToUserId(Object inReplyToUserId) {
        this.inReplyToUserId = inReplyToUserId;
    }

    @JsonProperty("in_reply_to_status_id")
    public Object getInReplyToStatusId() {
        return inReplyToStatusId;
    }

    @JsonProperty("in_reply_to_status_id")
    public void setInReplyToStatusId(Object inReplyToStatusId) {
        this.inReplyToStatusId = inReplyToStatusId;
    }

    @JsonProperty("favorited")
    public boolean isFavorited() {
        return favorited;
    }

    @JsonProperty("favorited")
    public void setFavorited(boolean favorited) {
        this.favorited = favorited;
    }

    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    @JsonProperty("in_reply_to_screen_name")
    public Object getInReplyToScreenName() {
        return inReplyToScreenName;
    }

    @JsonProperty("in_reply_to_screen_name")
    public void setInReplyToScreenName(Object inReplyToScreenName) {
        this.inReplyToScreenName = inReplyToScreenName;
    }

    @JsonProperty("in_reply_to_status_id_str")
    public Object getInReplyToStatusIdStr() {
        return inReplyToStatusIdStr;
    }

    @JsonProperty("in_reply_to_status_id_str")
    public void setInReplyToStatusIdStr(Object inReplyToStatusIdStr) {
        this.inReplyToStatusIdStr = inReplyToStatusIdStr;
    }

    @JsonProperty("id_str")
    public String getIdStr() {
        return idStr;
    }

    @JsonProperty("id_str")
    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    @JsonProperty("entities")
    public Entities_ getEntities() {
        return entities;
    }

    @JsonProperty("entities")
    public void setEntities(Entities_ entities) {
        this.entities = entities;
    }

    @JsonProperty("contributors")
    public Object getContributors() {
        return contributors;
    }

    @JsonProperty("contributors")
    public void setContributors(Object contributors) {
        this.contributors = contributors;
    }

    @JsonProperty("retweeted")
    public boolean isRetweeted() {
        return retweeted;
    }

    @JsonProperty("retweeted")
    public void setRetweeted(boolean retweeted) {
        this.retweeted = retweeted;
    }

    @JsonProperty("in_reply_to_user_id_str")
    public Object getInReplyToUserIdStr() {
        return inReplyToUserIdStr;
    }

    @JsonProperty("in_reply_to_user_id_str")
    public void setInReplyToUserIdStr(Object inReplyToUserIdStr) {
        this.inReplyToUserIdStr = inReplyToUserIdStr;
    }

    @JsonProperty("place")
    public Object getPlace() {
        return place;
    }

    @JsonProperty("place")
    public void setPlace(Object place) {
        this.place = place;
    }

    @JsonProperty("retweet_count")
    public long getRetweetCount() {
        return retweetCount;
    }

    @JsonProperty("retweet_count")
    public void setRetweetCount(long retweetCount) {
        this.retweetCount = retweetCount;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("user")
    public User getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(User user) {
        this.user = user;
    }

    @JsonProperty("id")
    public long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(long id) {
        this.id = id;
    }

    @JsonProperty("coordinates")
    public Object getCoordinates() {
        return coordinates;
    }

    @JsonProperty("coordinates")
    public void setCoordinates(Object coordinates) {
        this.coordinates = coordinates;
    }

    @JsonProperty("geo")
    public Object getGeo() {
        return geo;
    }

    @JsonProperty("geo")
    public void setGeo(Object geo) {
        this.geo = geo;
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
        return new org.apache.commons.lang3.builder.ToStringBuilder(this).append("text", text).append("truncated", truncated).append("inReplyToUserId", inReplyToUserId).append("inReplyToStatusId", inReplyToStatusId).append("favorited", favorited).append("source", source).append("inReplyToScreenName", inReplyToScreenName).append("inReplyToStatusIdStr", inReplyToStatusIdStr).append("idStr", idStr).append("entities", entities).append("contributors", contributors).append("retweeted", retweeted).append("inReplyToUserIdStr", inReplyToUserIdStr).append("place", place).append("retweetCount", retweetCount).append("createdAt", createdAt).append("user", user).append("id", id).append("coordinates", coordinates).append("geo", geo).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new org.apache.commons.lang3.builder.HashCodeBuilder().append(contributors).append(text).append(geo).append(inReplyToUserIdStr).append(retweeted).append(retweetCount).append(inReplyToScreenName).append(truncated).append(entities).append(idStr).append(id).append(inReplyToStatusId).append(source).append(inReplyToStatusIdStr).append(favorited).append(additionalProperties).append(createdAt).append(inReplyToUserId).append(place).append(user).append(coordinates).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RetweetedStatus) == false) {
            return false;
        }
        RetweetedStatus rhs = ((RetweetedStatus) other);
        return new org.apache.commons.lang3.builder.EqualsBuilder().append(contributors, rhs.contributors).append(text, rhs.text).append(geo, rhs.geo).append(inReplyToUserIdStr, rhs.inReplyToUserIdStr).append(retweeted, rhs.retweeted).append(retweetCount, rhs.retweetCount).append(inReplyToScreenName, rhs.inReplyToScreenName).append(truncated, rhs.truncated).append(entities, rhs.entities).append(idStr, rhs.idStr).append(id, rhs.id).append(inReplyToStatusId, rhs.inReplyToStatusId).append(source, rhs.source).append(inReplyToStatusIdStr, rhs.inReplyToStatusIdStr).append(favorited, rhs.favorited).append(additionalProperties, rhs.additionalProperties).append(createdAt, rhs.createdAt).append(inReplyToUserId, rhs.inReplyToUserId).append(place, rhs.place).append(user, rhs.user).append(coordinates, rhs.coordinates).isEquals();
    }

}
