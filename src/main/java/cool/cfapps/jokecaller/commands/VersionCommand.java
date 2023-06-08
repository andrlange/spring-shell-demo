package cool.cfapps.jokecaller.commands;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.commands.Quit;
import org.springframework.shell.standard.commands.Version;

@ShellComponent
public class VersionCommand implements Version.Command {

    @ShellMethod(value = "Shows the version of this CLI", key = {"version"})
    public String show() {
        return "Version: 1.0.0";

    }
}
