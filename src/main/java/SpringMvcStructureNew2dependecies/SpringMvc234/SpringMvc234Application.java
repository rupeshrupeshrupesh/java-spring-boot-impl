package SpringMvcStructureNew2dependecies.SpringMvc234;

import com.sendgrid.SendGrid;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringMvc234Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvc234Application.class, args);



	}

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	@Bean
	public SendGrid getSendGrid() {
		return new SendGrid("value");
	}

}
