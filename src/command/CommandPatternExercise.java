package command;

import java.util.ArrayList;
import java.util.List;

// client
public class CommandPatternExercise {

    public static void main(String args[]) {
        Light bedroomLight = new Light();
        Light kitchenLight = new Light();
        Switch lightSwitch = new Switch();

        Command toggleCommand = new ToggleCommand(bedroomLight);
        lightSwitch.storeAndExecute(toggleCommand);
        // lightSwitch.storeAndExecute(toggleCommand);
        //  lightSwitch.storeAndExecute(toggleCommand);
        //  lightSwitch.storeAndExecute(toggleCommand);
        List<Light> lights = new ArrayList<>();
        lights.add(bedroomLight);
        lights.add(kitchenLight);

        Command alllightsCommand = new AllLightsCommand(lights);
        lightSwitch.storeAndExecute(alllightsCommand);

    }
}
