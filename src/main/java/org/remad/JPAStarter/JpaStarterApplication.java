package org.remad.JPAStarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("org.remad")
@EnableJpaRepositories("org.remad.repositories")
@EntityScan("org.remad.entities")
public class JpaStarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaStarterApplication.class, args);
	}

}
