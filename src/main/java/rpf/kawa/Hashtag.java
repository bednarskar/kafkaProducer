
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
    "text",
    "indices"
})
public class Hashtag {

    @JsonProperty("text")
    private String text;
    @JsonProperty("indices")
    private List<Long> indices = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Hashtag() {
    }

    /**
     * 
     * @param text
     * @param indices
     */
    public Hashtag(String text, List<Long> indices) {
        super();
        this.text = text;
        this.indices = indices;
    }

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    @JsonProperty("indices")
    public List<Long> getIndices() {
        return indices;
    }

    @JsonProperty("indices")
    public void setIndices(List<Long> indices) {
        this.indices = indices;
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
        return new org.apache.commons.lang3.builder.ToStringBuilder(this).append("text", text).append("indices", indices).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new org.apache.commons.lang3.builder.HashCodeBuilder().append(text).append(additionalProperties).append(indices).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Hashtag) == false) {
            return false;
        }
        Hashtag rhs = ((Hashtag) other);
        return new org.apache.commons.lang3.builder.EqualsBuilder().append(text, rhs.text).append(additionalProperties, rhs.additionalProperties).append(indices, rhs.indices).isEquals();
    }

}
