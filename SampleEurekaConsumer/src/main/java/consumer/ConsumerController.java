package consumer;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import consumer.domain.Application;
import consumer.domain.Applications;
import consumer.domain.Instance;
import consumer.domain.ApplicationsJsonWrapper;

@RestController
public class ConsumerController {
	@Autowired
	RestTemplate consumerRestTempate;

	@RequestMapping("/consumer")
	public String testConsumer() {
		System.out.println(" inside test consumer");
		URI consumerRestUri = UriComponentsBuilder.fromUriString("//sample-eureka-client/client").build().toUri();
		String clientResponse = consumerRestTempate.getForObject(consumerRestUri, String.class);
		return clientResponse;
	}

	@RequestMapping(value = "/getInstances", method = RequestMethod.GET, produces="application/json")
	public List<String> getMeRegisteredAndActiveInstances() {

		List<String> activeInstancesList = new ArrayList<String>();
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<ApplicationsJsonWrapper> entity = new HttpEntity<ApplicationsJsonWrapper>(headers);

		ResponseEntity<ApplicationsJsonWrapper> activeInstances = consumerRestTempate
				.exchange("http://localhost:8761/eureka/apps", HttpMethod.GET, entity, ApplicationsJsonWrapper.class);
		for (Application application : activeInstances.getBody().getApplications().getApplication()) {
			for (Instance registeredInstances : application.getInstance()) {
				System.out.println(registeredInstances);
				activeInstancesList.add(registeredInstances.getHostName() + ":"+ registeredInstances.getPort().get$());
			}

		}
		// System.out.println(clientResponse);
		return activeInstancesList;
	}



}