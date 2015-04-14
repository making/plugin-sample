package aaa;

import demo.MyPlugin;

public class AaaPlugin implements MyPlugin {
    @Override
    public String action(String input) {
        return input.replace("a", "◯");
    }
}
