package product;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class App {
    public static void main(String[] args) {
        try (GenericApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
            MyProduct product = context.getBean(MyProduct.class);
            String input = "blackberry";
            product.execute(input);
        }
    }
}
