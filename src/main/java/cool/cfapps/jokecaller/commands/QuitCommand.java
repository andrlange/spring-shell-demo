package cool.cfapps.jokecaller.commands;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.commands.Quit;

@ShellComponent
public class QuitCommand implements Quit.Command {

    @ShellMethod(value = "Exit the shell.", key = {"quit", "exit", "terminate"})
    public void quit() {
        System.exit(0);

    }
}
