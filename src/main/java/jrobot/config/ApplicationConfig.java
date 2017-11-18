package jrobot.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EntityScan(basePackages = "com.jrobot.backend.persistence.domain.backend")
public class ApplicationConfig {

}
