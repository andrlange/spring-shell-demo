package cool.cfapps.jokecaller.commands;

import cool.cfapps.jokecaller.client.LinkClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import java.util.*;

@ShellComponent
@Slf4j
public class LinkCommands {

    private final LinkClient linkClient;

    public LinkCommands(LinkClient linkClient) {
        this.linkClient = linkClient;
    }

    @ShellMethod(key = "hello",value = "Say hello")
    public String hello(@ShellOption(help = "give a name to greet", defaultValue = "World!") String name){
        return "Hello "+name;
    }

    @ShellMethod(key = "categories",value = "List all categories")
    public String getCategries(){
        List<String> categories = new ArrayList<>();
        linkClient.categories().map(
                category -> categories.add(category.id() + ": " + category.title())
        ).collectList().block();

        StringJoiner joiner = new StringJoiner("\n");
        for(String category : categories){
            joiner.add(category);
            log.info(category);
        }

        return joiner.toString();
    }

    @ShellMethod(key = "links",value = "List all links")
    public String getLinks(){
        List<String> links = new ArrayList<>();
        linkClient.links().map(
                link -> links.add(link.id() +" ("+link.categoryTitle()+")"+ " : " + link.title()+ " -> " + link.url())
        ).collectList().block();

        StringJoiner joiner = new StringJoiner("\n");
        for(String category : links){
            joiner.add(category);
            log.info(category);
        }

        return joiner.toString();
    }
}
