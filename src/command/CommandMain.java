package command;

public class CommandMain {
    public static void main(String[] args) {
        Light light = new Light();
        
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);
        
        RemoteControl remote = new RemoteControl();
        
        remote.setCommand(lightOn);
        remote.pressButton();   // this line of code turns the light on.
        
        remote.setCommand(lightOff);
        remote.pressButton();     // this line of code turns the light off.

    }
}
