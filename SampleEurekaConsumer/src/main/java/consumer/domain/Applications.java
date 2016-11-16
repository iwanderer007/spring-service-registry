
package consumer.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "versions__delta",
    "apps__hashcode",
    "application"
})
public class Applications {

    @JsonProperty("versions__delta")
    private String versionsDelta;
    @JsonProperty("apps__hashcode")
    private String appsHashcode;
    @JsonProperty("application")
    private List<Application> application = new ArrayList<Application>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The versionsDelta
     */
    @JsonProperty("versions__delta")
    public String getVersionsDelta() {
        return versionsDelta;
    }

    /**
     * 
     * @param versionsDelta
     *     The versions__delta
     */
    @JsonProperty("versions__delta")
    public void setVersionsDelta(String versionsDelta) {
        this.versionsDelta = versionsDelta;
    }

    /**
     * 
     * @return
     *     The appsHashcode
     */
    @JsonProperty("apps__hashcode")
    public String getAppsHashcode() {
        return appsHashcode;
    }

    /**
     * 
     * @param appsHashcode
     *     The apps__hashcode
     */
    @JsonProperty("apps__hashcode")
    public void setAppsHashcode(String appsHashcode) {
        this.appsHashcode = appsHashcode;
    }

    /**
     * 
     * @return
     *     The application
     */
    @JsonProperty("application")
    public List<Application> getApplication() {
        return application;
    }

    /**
     * 
     * @param application
     *     The application
     */
    @JsonProperty("application")
    public void setApplication(List<Application> application) {
        this.application = application;
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
