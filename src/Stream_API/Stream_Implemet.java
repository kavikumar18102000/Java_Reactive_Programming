package Stream_API;

public class Stream_Implemet {

    public static void main(String[] args) {

        // print all the numnber using the stream
        StreamSources.getNumbers().forEach(n -> System.out.println(n));

        // printing number on filtering
        StreamSources.getNumbers().filter(n -> n <= 5).forEach(System.out::println);

        //print second and third number less than 5
        StreamSources.getNumbers().filter(n->n<5)
                .skip(1)
                .limit(2)
                .forEach(s -> System.out.println(s));

        //printing all the Users name
        StreamSources.getUser().forEach(u -> System.out.println(u.getName()));

        //print all User uno
        StreamSources.getUser().forEach(u -> System.out.println(u.getUno()));

        //print the first number from getNumbers that's greater than5
        //if nothing is foung print-1
        Integer value = StreamSources.getNumbers().filter(n -> n<5)
                     .findFirst()
                     .orElse(-1);
        System.out.println(value);

        //print all the user names that have the uno form the getNumber
        StreamSources.getNumbers()
                .flatMap(id -> StreamSources.getUser().filter(user ->user.getUno() == id))
                .map(user -> user.getName())
                .forEach(userName -> System.out.println(userName));


    }
}
