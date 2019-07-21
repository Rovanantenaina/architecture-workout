package mg.era.architect.web;

import mg.era.architect.novice.NoviceConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 */

@SpringBootApplication
@ComponentScan(basePackageClasses = NoviceConfiguration.class)
public class NoviceApp {

  public static void main(String[] args) {
    System.out.println("Hello World!");
    SpringApplication.run(NoviceApp.class, args);
  }
}
