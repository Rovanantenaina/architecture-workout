package mg.era.architect.web;

import mg.era.architect.novice.NoviceConfiguration;
import mg.era.architect.web.configuration.SwaggerConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/**
 * Hello world!
 */

@SpringBootApplication
@ComponentScan(basePackageClasses = NoviceConfiguration.class)
@Import(
    SwaggerConfiguration.class
)
public class NoviceApp {

  public static void main(String[] args) {
    SpringApplication.run(NoviceApp.class, args);
  }
}
