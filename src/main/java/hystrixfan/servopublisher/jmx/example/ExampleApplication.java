package hystrixfan.servopublisher.jmx.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by hystrixFan on 13.02.2017.
 */
@EnableScheduling
@EnableCircuitBreaker
@SpringBootApplication
public class ExampleApplication extends SpringBootServletInitializer {
  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    return application.sources(ExampleApplication.class);
  }

  public static void main(String[] args) {
    SpringApplication.run(ExampleApplication.class, args);
  }
}
