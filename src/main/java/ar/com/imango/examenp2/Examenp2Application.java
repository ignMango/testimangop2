package ar.com.imango.examenp2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Examenp2Application {

	public static void main(String[] args) {
		SpringApplication.run(Examenp2Application.class, args);
	}
}
