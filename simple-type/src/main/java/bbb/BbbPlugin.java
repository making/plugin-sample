package bbb;

import demo.MyPlugin;

public class BbbPlugin implements MyPlugin {
    @Override
    public String action(String input) {
        return input.replace("b", "●");
    }
}
