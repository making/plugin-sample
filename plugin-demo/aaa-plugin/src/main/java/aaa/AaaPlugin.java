package aaa;


import demo.MyPlugin;

public class AaaPlugin implements MyPlugin {

    @Override
    public boolean supports(String s) {
        return s != null;
    }

    @Override
    public String action(String input) {
        return input.replace("a", "◯");
    }

}
