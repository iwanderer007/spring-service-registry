
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
    "instanceId",
    "hostName",
    "app",
    "ipAddr",
    "status",
    "overriddenstatus",
    "port",
    "securePort",
    "countryId",
    "dataCenterInfo",
    "leaseInfo",
    "metadata",
    "homePageUrl",
    "statusPageUrl",
    "healthCheckUrl",
    "vipAddress",
    "secureVipAddress",
    "isCoordinatingDiscoveryServer",
    "lastUpdatedTimestamp",
    "lastDirtyTimestamp",
    "actionType"
})
public class Instance {

    @JsonProperty("instanceId")
    private String instanceId;
    @JsonProperty("hostName")
    private String hostName;
    @JsonProperty("app")
    private String app;
    @JsonProperty("ipAddr")
    private String ipAddr;
    @JsonProperty("status")
    private String status;
    @JsonProperty("overriddenstatus")
    private String overriddenstatus;
    @JsonProperty("port")
    private Port port;
    @JsonProperty("securePort")
    private SecurePort securePort;
    @JsonProperty("countryId")
    private Integer countryId;
    @JsonProperty("dataCenterInfo")
    private DataCenterInfo dataCenterInfo;
    @JsonProperty("leaseInfo")
    private LeaseInfo leaseInfo;
    @JsonProperty("metadata")
    private Metadata metadata;
    @JsonProperty("homePageUrl")
    private String homePageUrl;
    @JsonProperty("statusPageUrl")
    private String statusPageUrl;
    @JsonProperty("healthCheckUrl")
    private String healthCheckUrl;
    @JsonProperty("vipAddress")
    private String vipAddress;
    @JsonProperty("secureVipAddress")
    private String secureVipAddress;
    @JsonProperty("isCoordinatingDiscoveryServer")
    private String isCoordinatingDiscoveryServer;
    @JsonProperty("lastUpdatedTimestamp")
    private String lastUpdatedTimestamp;
    @JsonProperty("lastDirtyTimestamp")
    private String lastDirtyTimestamp;
    @JsonProperty("actionType")
    private String actionType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The instanceId
     */
    @JsonProperty("instanceId")
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * 
     * @param instanceId
     *     The instanceId
     */
    @JsonProperty("instanceId")
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * 
     * @return
     *     The hostName
     */
    @JsonProperty("hostName")
    public String getHostName() {
        return hostName;
    }

    /**
     * 
     * @param hostName
     *     The hostName
     */
    @JsonProperty("hostName")
    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    /**
     * 
     * @return
     *     The app
     */
    @JsonProperty("app")
    public String getApp() {
        return app;
    }

    /**
     * 
     * @param app
     *     The app
     */
    @JsonProperty("app")
    public void setApp(String app) {
        this.app = app;
    }

    /**
     * 
     * @return
     *     The ipAddr
     */
    @JsonProperty("ipAddr")
    public String getIpAddr() {
        return ipAddr;
    }

    /**
     * 
     * @param ipAddr
     *     The ipAddr
     */
    @JsonProperty("ipAddr")
    public void setIpAddr(String ipAddr) {
        this.ipAddr = ipAddr;
    }

    /**
     * 
     * @return
     *     The status
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The overriddenstatus
     */
    @JsonProperty("overriddenstatus")
    public String getOverriddenstatus() {
        return overriddenstatus;
    }

    /**
     * 
     * @param overriddenstatus
     *     The overriddenstatus
     */
    @JsonProperty("overriddenstatus")
    public void setOverriddenstatus(String overriddenstatus) {
        this.overriddenstatus = overriddenstatus;
    }

    /**
     * 
     * @return
     *     The port
     */
    @JsonProperty("port")
    public Port getPort() {
        return port;
    }

    /**
     * 
     * @param port
     *     The port
     */
    @JsonProperty("port")
    public void setPort(Port port) {
        this.port = port;
    }

    /**
     * 
     * @return
     *     The securePort
     */
    @JsonProperty("securePort")
    public SecurePort getSecurePort() {
        return securePort;
    }

    /**
     * 
     * @param securePort
     *     The securePort
     */
    @JsonProperty("securePort")
    public void setSecurePort(SecurePort securePort) {
        this.securePort = securePort;
    }

    /**
     * 
     * @return
     *     The countryId
     */
    @JsonProperty("countryId")
    public Integer getCountryId() {
        return countryId;
    }

    /**
     * 
     * @param countryId
     *     The countryId
     */
    @JsonProperty("countryId")
    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    /**
     * 
     * @return
     *     The dataCenterInfo
     */
    @JsonProperty("dataCenterInfo")
    public DataCenterInfo getDataCenterInfo() {
        return dataCenterInfo;
    }

    /**
     * 
     * @param dataCenterInfo
     *     The dataCenterInfo
     */
    @JsonProperty("dataCenterInfo")
    public void setDataCenterInfo(DataCenterInfo dataCenterInfo) {
        this.dataCenterInfo = dataCenterInfo;
    }

    /**
     * 
     * @return
     *     The leaseInfo
     */
    @JsonProperty("leaseInfo")
    public LeaseInfo getLeaseInfo() {
        return leaseInfo;
    }

    /**
     * 
     * @param leaseInfo
     *     The leaseInfo
     */
    @JsonProperty("leaseInfo")
    public void setLeaseInfo(LeaseInfo leaseInfo) {
        this.leaseInfo = leaseInfo;
    }

    /**
     * 
     * @return
     *     The metadata
     */
    @JsonProperty("metadata")
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * 
     * @param metadata
     *     The metadata
     */
    @JsonProperty("metadata")
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    /**
     * 
     * @return
     *     The homePageUrl
     */
    @JsonProperty("homePageUrl")
    public String getHomePageUrl() {
        return homePageUrl;
    }

    /**
     * 
     * @param homePageUrl
     *     The homePageUrl
     */
    @JsonProperty("homePageUrl")
    public void setHomePageUrl(String homePageUrl) {
        this.homePageUrl = homePageUrl;
    }

    /**
     * 
     * @return
     *     The statusPageUrl
     */
    @JsonProperty("statusPageUrl")
    public String getStatusPageUrl() {
        return statusPageUrl;
    }

    /**
     * 
     * @param statusPageUrl
     *     The statusPageUrl
     */
    @JsonProperty("statusPageUrl")
    public void setStatusPageUrl(String statusPageUrl) {
        this.statusPageUrl = statusPageUrl;
    }

    /**
     * 
     * @return
     *     The healthCheckUrl
     */
    @JsonProperty("healthCheckUrl")
    public String getHealthCheckUrl() {
        return healthCheckUrl;
    }

    /**
     * 
     * @param healthCheckUrl
     *     The healthCheckUrl
     */
    @JsonProperty("healthCheckUrl")
    public void setHealthCheckUrl(String healthCheckUrl) {
        this.healthCheckUrl = healthCheckUrl;
    }

    /**
     * 
     * @return
     *     The vipAddress
     */
    @JsonProperty("vipAddress")
    public String getVipAddress() {
        return vipAddress;
    }

    /**
     * 
     * @param vipAddress
     *     The vipAddress
     */
    @JsonProperty("vipAddress")
    public void setVipAddress(String vipAddress) {
        this.vipAddress = vipAddress;
    }

    /**
     * 
     * @return
     *     The secureVipAddress
     */
    @JsonProperty("secureVipAddress")
    public String getSecureVipAddress() {
        return secureVipAddress;
    }

    /**
     * 
     * @param secureVipAddress
     *     The secureVipAddress
     */
    @JsonProperty("secureVipAddress")
    public void setSecureVipAddress(String secureVipAddress) {
        this.secureVipAddress = secureVipAddress;
    }

    /**
     * 
     * @return
     *     The isCoordinatingDiscoveryServer
     */
    @JsonProperty("isCoordinatingDiscoveryServer")
    public String getIsCoordinatingDiscoveryServer() {
        return isCoordinatingDiscoveryServer;
    }

    /**
     * 
     * @param isCoordinatingDiscoveryServer
     *     The isCoordinatingDiscoveryServer
     */
    @JsonProperty("isCoordinatingDiscoveryServer")
    public void setIsCoordinatingDiscoveryServer(String isCoordinatingDiscoveryServer) {
        this.isCoordinatingDiscoveryServer = isCoordinatingDiscoveryServer;
    }

    /**
     * 
     * @return
     *     The lastUpdatedTimestamp
     */
    @JsonProperty("lastUpdatedTimestamp")
    public String getLastUpdatedTimestamp() {
        return lastUpdatedTimestamp;
    }

    /**
     * 
     * @param lastUpdatedTimestamp
     *     The lastUpdatedTimestamp
     */
    @JsonProperty("lastUpdatedTimestamp")
    public void setLastUpdatedTimestamp(String lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    }

    /**
     * 
     * @return
     *     The lastDirtyTimestamp
     */
    @JsonProperty("lastDirtyTimestamp")
    public String getLastDirtyTimestamp() {
        return lastDirtyTimestamp;
    }

    /**
     * 
     * @param lastDirtyTimestamp
     *     The lastDirtyTimestamp
     */
    @JsonProperty("lastDirtyTimestamp")
    public void setLastDirtyTimestamp(String lastDirtyTimestamp) {
        this.lastDirtyTimestamp = lastDirtyTimestamp;
    }

    /**
     * 
     * @return
     *     The actionType
     */
    @JsonProperty("actionType")
    public String getActionType() {
        return actionType;
    }

    /**
     * 
     * @param actionType
     *     The actionType
     */
    @JsonProperty("actionType")
    public void setActionType(String actionType) {
        this.actionType = actionType;
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
