package project.service.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import project.data.DataConfiguration;

@Configuration
@ComponentScan(basePackages = "project.service")
@Import(DataConfiguration.class)
public class ServiceConfiguration {

}
