package Pack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class LogiImportApplication extends SpringBootServletInitializer{
	
	// war deploy
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(LogiImportApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(LogiImportApplication.class, args);
	}

}
