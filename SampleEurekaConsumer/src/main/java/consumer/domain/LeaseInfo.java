
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
    "renewalIntervalInSecs",
    "durationInSecs",
    "registrationTimestamp",
    "lastRenewalTimestamp",
    "evictionTimestamp",
    "serviceUpTimestamp"
})
public class LeaseInfo {

    @JsonProperty("renewalIntervalInSecs")
    private String renewalIntervalInSecs;
    @JsonProperty("durationInSecs")
    private String durationInSecs;
    @JsonProperty("registrationTimestamp")
    private String registrationTimestamp;
    public String getRenewalIntervalInSecs() {
		return renewalIntervalInSecs;
	}
	public void setRenewalIntervalInSecs(String renewalIntervalInSecs) {
		this.renewalIntervalInSecs = renewalIntervalInSecs;
	}
	public String getDurationInSecs() {
		return durationInSecs;
	}
	public void setDurationInSecs(String durationInSecs) {
		this.durationInSecs = durationInSecs;
	}
	public String getRegistrationTimestamp() {
		return registrationTimestamp;
	}
	public void setRegistrationTimestamp(String registrationTimestamp) {
		this.registrationTimestamp = registrationTimestamp;
	}
	public String getLastRenewalTimestamp() {
		return lastRenewalTimestamp;
	}
	public void setLastRenewalTimestamp(String lastRenewalTimestamp) {
		this.lastRenewalTimestamp = lastRenewalTimestamp;
	}
	public String getEvictionTimestamp() {
		return evictionTimestamp;
	}
	public void setEvictionTimestamp(String evictionTimestamp) {
		this.evictionTimestamp = evictionTimestamp;
	}
	public String getServiceUpTimestamp() {
		return serviceUpTimestamp;
	}
	public void setServiceUpTimestamp(String serviceUpTimestamp) {
		this.serviceUpTimestamp = serviceUpTimestamp;
	}
	public Map<String, Object> getAdditionalProperties() {
		return additionalProperties;
	}
	public void setAdditionalProperties(Map<String, Object> additionalProperties) {
		this.additionalProperties = additionalProperties;
	}
	@JsonProperty("lastRenewalTimestamp")
    private String lastRenewalTimestamp;
    @JsonProperty("evictionTimestamp")
    private String evictionTimestamp;
    @JsonProperty("serviceUpTimestamp")
    private String serviceUpTimestamp;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

   

}
