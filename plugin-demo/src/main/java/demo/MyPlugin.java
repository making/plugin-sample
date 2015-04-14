package demo;

import org.springframework.plugin.core.Plugin;

public interface MyPlugin extends Plugin<String> {

    String action(String input);
}
