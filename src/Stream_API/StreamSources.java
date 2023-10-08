package Stream_API;
import java.util.stream.Stream;

public class StreamSources {
    
    public static Stream<Integer> getNumbers(){
        return Stream.of(1,2,3,4,5,6,7,8,9,10);
    }

    public static Stream<String> getNumberStream(){
        return Stream.of("one", "two","three", "four", "five", "six", "seven", "eight");
    }

    public static Stream<User> getUser(){
        return Stream.of(
            new User(10,"Arya"),
            new User(20,"kumar"),
            new User(30,"kavi")
        );
    }
}
