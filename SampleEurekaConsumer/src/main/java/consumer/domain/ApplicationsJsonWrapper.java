package consumer.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ApplicationsJsonWrapper {

	@JsonProperty("applications")
	private Applications applications;

	public Applications getApplications() {
		return applications;
	}

	public void setApplications(Applications applications) {
		this.applications = applications;
	}
	
}
