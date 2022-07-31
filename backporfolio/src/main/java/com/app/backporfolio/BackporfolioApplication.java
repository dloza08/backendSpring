package com.app.backporfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan
public class BackporfolioApplication extends SpringBootServletInitializer {
        
        public static void main(final  String[] args) {
		SpringApplication.run(BackporfolioApplication.class, args);
	}
        
         @Override
        protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
            
                
        return application.sources(BackporfolioApplication.class);
        }
}