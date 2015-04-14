package product;

import demo.MyPlugin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.plugin.core.config.EnablePluginRegistries;

@Configuration
@EnablePluginRegistries(MyPlugin.class)
@ImportResource("classpath*:META-INF/plugin.xml")
public class AppConfig {

    @Bean
    MyProduct product() {
        return new MyProduct();
    }
}
