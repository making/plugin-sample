package demo;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class MyProduct {
    @Autowired
    List<MyPlugin> plugins;

    @Autowired
    Map<String, MyPlugin> pluginMap;

    public void execute(String input) {
        System.out.println(pluginMap);
        System.out.println(plugins);
        String result = input;
        for (MyPlugin plugin : plugins) {
            result = plugin.action(result);
        }
        System.out.println(result);
    }
}
