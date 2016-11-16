
package consumer.domain;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "$",
    "@enabled"
})
public class SecurePort {

    @JsonProperty("$")
    private Integer $;
    @JsonProperty("@enabled")
    private String enabled;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The $
     */
    @JsonProperty("$")
    public Integer get$() {
        return $;
    }

    /**
     * 
     * @param $
     *     The $
     */
    @JsonProperty("$")
    public void set$(Integer $) {
        this.$ = $;
    }

    /**
     * 
     * @return
     *     The enabled
     */
    @JsonProperty("@enabled")
    public String getEnabled() {
        return enabled;
    }

    /**
     * 
     * @param enabled
     *     The @enabled
     */
    @JsonProperty("@enabled")
    public void setEnabled(String enabled) {
        this.enabled = enabled;
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
