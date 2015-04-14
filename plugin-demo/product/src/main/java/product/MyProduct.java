package product;

import demo.MyPlugin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.plugin.core.PluginRegistry;

import java.util.List;

public class MyProduct {
    @Autowired
    PluginRegistry<MyPlugin, String> pluginRegistry;

    public void execute(String input) {
        System.out.println(pluginRegistry.getPlugins());
        String result = input;
        List<MyPlugin> plugins = pluginRegistry.getPluginsFor(input);
        for (MyPlugin plugin : plugins) {
            result = plugin.action(result);
        }
        System.out.println(result);
    }
}
