package sn.atos.project.myCV;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableDiscoveryClient
@SpringBootApplication


public class MyCvApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyCvApplication.class, args);
	}

}
