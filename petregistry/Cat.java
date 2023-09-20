package petregistry;

import java.util.HashMap;
import java.util.Map;

public class Cat extends Animal{
    private Map<Integer, String> commands;

    public Cat(String name) {
        super(name, "Cat");
        commands = new HashMap<>();
    }

    @Override
    public void showCommands() {
        if (commands.isEmpty()) {
            System.out.println("No commands available for this cat.");
        } else {
            System.out.println("Commands for " + name + ":");
            for (Map.Entry<Integer, String> entry : commands.entrySet()) {
                System.out.println(entry.getKey() + ". " + entry.getValue());
            }
        }
    }

    @Override
    public void teachCommand(String command) {
        int commandNumber = commands.size() + 1;
        commands.put(commandNumber, command);
        System.out.println("Command '" + command + "' has been added for " + name);
    }
}
