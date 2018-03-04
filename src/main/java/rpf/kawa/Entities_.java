
package rpf.kawa;

import java.util.HashMap;
import java.util.List;
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
    "user_mentions",
    "urls",
    "hashtags"
})
public class Entities_ {

    @JsonProperty("user_mentions")
    private List<Object> userMentions = null;
    @JsonProperty("urls")
    private List<Object> urls = null;
    @JsonProperty("hashtags")
    private List<Hashtag> hashtags = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Entities_() {
    }

    /**
     * 
     * @param urls
     * @param hashtags
     * @param userMentions
     */
    public Entities_(List<Object> userMentions, List<Object> urls, List<Hashtag> hashtags) {
        super();
        this.userMentions = userMentions;
        this.urls = urls;
        this.hashtags = hashtags;
    }

    @JsonProperty("user_mentions")
    public List<Object> getUserMentions() {
        return userMentions;
    }

    @JsonProperty("user_mentions")
    public void setUserMentions(List<Object> userMentions) {
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
    public List<Hashtag> getHashtags() {
        return hashtags;
    }

    @JsonProperty("hashtags")
    public void setHashtags(List<Hashtag> hashtags) {
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
        return new ToStringBuilder(this).append("userMentions", userMentions).append("urls", urls).append("hashtags", hashtags).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(urls).append(hashtags).append(userMentions).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Entities_) == false) {
            return false;
        }
        Entities_ rhs = ((Entities_) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(urls, rhs.urls).append(hashtags, rhs.hashtags).append(userMentions, rhs.userMentions).isEquals();
    }

}
