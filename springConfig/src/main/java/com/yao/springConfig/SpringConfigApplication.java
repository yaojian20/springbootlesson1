package com.yao.springConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class SpringConfigApplication implements EnvironmentAware {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(SpringConfigApplication.class);
		springApplication.setAdditionalProfiles("prod");
		springApplication.run(args);
	}


	@Override
	public void setEnvironment(Environment enviorment){

		System.out.println("当前激活的profile有：" + Arrays.asList(enviorment.getActiveProfiles()));
		if (enviorment instanceof ConfigurableEnvironment){
			ConfigurableEnvironment env = ConfigurableEnvironment.class.cast(enviorment);
			MutablePropertySources mutablePropertySources = ((ConfigurableEnvironment) enviorment).getPropertySources();

			Map<String,Object> source = new HashMap<>();
			source.put("server.port",1234);
			PropertySource propertySource = new MapPropertySource("java-code",source);
			mutablePropertySources.addFirst(propertySource);
		}
	}

}
