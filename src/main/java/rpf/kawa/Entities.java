
package rpf.kawa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "user_mentions",
    "urls",
    "hashtags"
})
public class Entities {

    @JsonProperty("user_mentions")
    private List<UserMention> userMentions = null;
    @JsonProperty("urls")
    private List<Object> urls = null;
    @JsonProperty("hashtags")
    private List<Object> hashtags = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Entities() {
    }

    /**
     * 
     * @param urls
     * @param hashtags
     * @param userMentions
     */
    public Entities(List<UserMention> userMentions, List<Object> urls, List<Object> hashtags) {
        super();
        this.userMentions = userMentions;
        this.urls = urls;
        this.hashtags = hashtags;
    }

    @JsonProperty("user_mentions")
    public List<UserMention> getUserMentions() {
        return userMentions;
    }

    @JsonProperty("user_mentions")
    public void setUserMentions(List<UserMention> userMentions) {
        this.userMentions = userMentions;
    }

    @JsonProperty("urls")
    public List<Object> getUrls() {
        return urls;
    }

    @JsonProperty("urls")
    public void setUrls(List<Object> urls) {
        this.urls = urls;
    }

    @JsonProperty("hashtags")
    public List<Object> getHashtags() {
        return hashtags;
    }

    @JsonProperty("hashtags")
    public void setHashtags(List<Object> hashtags) {
        this.hashtags = hashtags;
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
        return new org.apache.commons.lang3.builder.ToStringBuilder(this).append("userMentions", userMentions).append("urls", urls).append("hashtags", hashtags).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new org.apache.commons.lang3.builder.HashCodeBuilder().append(additionalProperties).append(urls).append(hashtags).append(userMentions).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Entities) == false) {
            return false;
        }
        Entities rhs = ((Entities) other);
        return new org.apache.commons.lang3.builder.EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(urls, rhs.urls).append(hashtags, rhs.hashtags).append(userMentions, rhs.userMentions).isEquals();
    }

}
