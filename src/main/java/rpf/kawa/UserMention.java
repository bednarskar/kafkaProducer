
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
    "indices",
    "screen_name",
    "id_str",
    "name",
    "id"
})
public class UserMention {

    @JsonProperty("indices")
    private List<Long> indices = null;
    @JsonProperty("screen_name")
    private String screenName;
    @JsonProperty("id_str")
    private String idStr;
    @JsonProperty("name")
    private String name;
    @JsonProperty("id")
    private long id;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public UserMention() {
    }

    /**
     * 
     * @param id
     * @param name
     * @param screenName
     * @param indices
     * @param idStr
     */
    public UserMention(List<Long> indices, String screenName, String idStr, String name, long id) {
        super();
        this.indices = indices;
        this.screenName = screenName;
        this.idStr = idStr;
        this.name = name;
        this.id = id;
    }

    @JsonProperty("indices")
    public List<Long> getIndices() {
        return indices;
    }

    @JsonProperty("indices")
    public void setIndices(List<Long> indices) {
        this.indices = indices;
    }

    @JsonProperty("screen_name")
    public String getScreenName() {
        return screenName;
    }

    @JsonProperty("screen_name")
    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    @JsonProperty("id_str")
    public String getIdStr() {
        return idStr;
    }

    @JsonProperty("id_str")
    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("id")
    public long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(long id) {
        this.id = id;
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
        return new org.apache.commons.lang3.builder.ToStringBuilder(this).append("indices", indices).append("screenName", screenName).append("idStr", idStr).append("name", name).append("id", id).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new org.apache.commons.lang3.builder.HashCodeBuilder().append(id).append(additionalProperties).append(name).append(screenName).append(indices).append(idStr).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserMention) == false) {
            return false;
        }
        UserMention rhs = ((UserMention) other);
        return new org.apache.commons.lang3.builder.EqualsBuilder().append(id, rhs.id).append(additionalProperties, rhs.additionalProperties).append(name, rhs.name).append(screenName, rhs.screenName).append(indices, rhs.indices).append(idStr, rhs.idStr).isEquals();
    }

}
