package demo;

import aaa.AaaPlugin;
import bbb.BbbPlugin;
import ccc.CccPlugin;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@ComponentScan(basePackages = {"aaa", "bbb", "ccc"},
//        includeFilters = @ComponentScan.Filter(value = MyPlugin.class, type = FilterType.ASSIGNABLE_TYPE))
//@ImportResource("classpath*:META-INF/plugins.xml")
@Configuration
public class AppConfig {
    //    @Bean
//    AaaPlugin aaaPlugin() {
//        return new AaaPlugin();
//    }
//
//    @Bean
//    BbbPlugin bbbPlugin() {
//        return new BbbPlugin();
//    }
//
//    @Bean
//    CccPlugin cccPlugin() {
//        return new CccPlugin();
//    }
//
    @Bean
    InitializingBean pluginRegisterer() {
        return new InitializingBean() {
            @Autowired
            AnnotationConfigApplicationContext context;

            @Override
            public void afterPropertiesSet() throws Exception {
                context.register(AaaPlugin.class, BbbPlugin.class, CccPlugin.class);
            }
        };
    }

    @Bean
    MyProduct myProduct() {
        return new MyProduct();
    }
}
