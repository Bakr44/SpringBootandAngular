package com.example.demo;

import com.example.demo.Enumeration.Status;
import com.example.demo.Model.Server;
import com.example.demo.Repository.ServerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

	@Bean
	CommandLineRunner run(ServerRepo serverRepo){
		return args -> {
			serverRepo.save(new Server(null,"192.122.2.160","Linux","16 GB","PC","http://localhost:8080/api/v1/server/image/server1.png", Status.SERVER_UP));
			serverRepo.save(new Server(null,"163.12.2.10","Linux","128 GB","PC","http://localhost:8080/api/v1/server/image/server2.png", Status.SERVER_UP));
			serverRepo.save(new Server(null,"102.112.24.60","Linux","28 GB","PC","http://localhost:8080/api/v1/server/image/server3.png", Status.SERVER_DOWN));
			serverRepo.save(new Server(null,"112.222.20.190","Linux","256 GB","PC","http://localhost:8080/api/v1/server/image/server4.png", Status.SERVER_DOWN));

		};
	}
	@Bean
	public CorsFilter corsFilter(){
		UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource=new UrlBasedCorsConfigurationSource();
		CorsConfiguration corsConfiguration=new CorsConfiguration();
		corsConfiguration.setAllowCredentials(true);
		corsConfiguration.setAllowedOrigins(Arrays.asList("http://localhost:4200","http://localhost:3000"));
		corsConfiguration.setAllowedHeaders(Arrays.asList("Origin","Access-Control-Request-Headers","Content-Type",
				"Accept","Jwt-Token", "Authorization", "Origin, Accept", "X-Requested-With",
				"Access-Control-Request-Method", "Access-Control-Request-Headers"));
		corsConfiguration.setExposedHeaders(Arrays.asList("Origin", "Content-Type", "Accept","Jwt-Token", "Authorization",
				"Access-Control-Allow-Origin", "Access-Control-Allow-Origin", "Access-Control-Allow-Credentials", "Filename"));
		corsConfiguration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS"));
		urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
		return new CorsFilter(urlBasedCorsConfigurationSource);

	}
}
