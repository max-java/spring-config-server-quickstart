package by.jrr.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
@EnableConfigServer
public class ConfigserverApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(ConfigserverApplication.class, args);
		Environment env = ctx.getBean(Environment.class);
		String secret = env.getProperty("secret");
		System.out.println(secret);
	}
}
