package petregistry;

public abstract class Animal {
    protected String name;
    protected String type;

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public abstract void showCommands();

    public abstract void teachCommand(String command);

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
    }
}

