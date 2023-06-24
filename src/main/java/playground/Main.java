package playground;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
//        Child child = new Child();
//        child.say();
//        child.hello();
//
//        Parent pch= new Child();
//        pch.say();
//
//        Parent parent = new Parent();
//        parent.hello();
        countOccurrence("Hello my World, Hello my Friend");

    }

    public static void countOccurrence(String str){
        String[] strings = str.split("");
        Map<String, Long> result = Arrays.stream(strings)
                .filter(n->n.matches("\\w"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(result);
        result.entrySet().stream().forEach(entry->{
            System.out.println(String.format("Letter: %s and occurrence %s", entry.getKey(),entry.getValue()));
        });
    }
}
