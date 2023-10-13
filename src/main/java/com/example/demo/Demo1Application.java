package com.example.demo;

import com.example.demo.Enumeration.Status;
import com.example.demo.Model.Server;
import com.example.demo.Repository.ServerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

	@Bean
	CommandLineRunner run(ServerRepo serverRepo){
		return args -> {
			serverRepo.save(new Server(null,"192.122.2.160","Linux","16 GB","PC","http://localhost:8080/server/image/server1", Status.SERVER_UP));
			serverRepo.save(new Server(null,"163.12.2.10","Linux","128 GB","PC","http://localhost:8080/server/image/server2", Status.SERVER_UP));
			serverRepo.save(new Server(null,"102.112.24.60","Linux","28 GB","PC","http://localhost:8080/server/image/server3", Status.SERVER_DOWN));
			serverRepo.save(new Server(null,"112.222.20.190","Linux","256 GB","PC","http://localhost:8080/server/image/server4", Status.SERVER_DOWN));

		};
	}
}
