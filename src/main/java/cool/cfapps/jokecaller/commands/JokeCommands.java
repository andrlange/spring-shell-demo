package cool.cfapps.jokecaller.commands;

import cool.cfapps.jokecaller.client.JokeClient;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

import java.util.Objects;

@ShellComponent
public class JokeCommands {

    private final JokeClient jokeClient;

    public JokeCommands(JokeClient jokeClient) {
        this.jokeClient = jokeClient;
    }

    @ShellMethod(key = "random",value = "Get a random joke")
    public String getRandomJoke(){

        return Objects.requireNonNull(jokeClient.random().block()).joke();
    }
}
