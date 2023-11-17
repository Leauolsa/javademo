// package com.pgdo.slpro;

// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication
// public class SlproApplication {

// 	public static void main(String[] args) {
// 		SpringApplication.run(SlproApplication.class, args);
// 	}

// }

package com.pgdo.slpro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Slpro extends SpringBootServletInitializer {

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Slpro.class);
    }
	public static void main(String[] args) {
		SpringApplication.run(Slpro.class, args);
	}

}
