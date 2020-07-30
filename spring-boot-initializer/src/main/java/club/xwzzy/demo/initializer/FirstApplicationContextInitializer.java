package club.xwzzy.demo.initializer;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;

import java.util.HashMap;
import java.util.Map;

public class FirstApplicationContextInitializer implements ApplicationContextInitializer {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        Map<String,Object> objectMap = new HashMap<>();
        objectMap.put("name","xw");

        MapPropertySource mapPropertySource = new MapPropertySource("first",objectMap);
        environment.getPropertySources().addLast(mapPropertySource);
        System.out.println("first applicationContextInitializer run");

    }
}
