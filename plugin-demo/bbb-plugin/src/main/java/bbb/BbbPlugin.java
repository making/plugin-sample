package bbb;


import demo.MyPlugin;

public class BbbPlugin implements MyPlugin {

    @Override
    public boolean supports(String s) {
        return s != null;
    }

    @Override
    public String action(String input) {
        return input.replace("b", "●");
    }

}
