package ccc;

import demo.MyPlugin;

public class CccPlugin implements MyPlugin {
    @Override
    public String action(String input) {
        return input.replace("c", "◎");
    }
}
