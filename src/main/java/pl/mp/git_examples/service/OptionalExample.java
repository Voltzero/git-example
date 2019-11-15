package pl.mp.git_examples.service;

import java.util.Optional;
import java.util.function.Consumer;

public class OptionalExample {

    static Optional<String> getFriendsNick(){
        return Optional.ofNullable(null);
        //return Optional.of("dexon");
    }

    public static void main(String[] args) {
        if (getFriendsNick().isPresent()) {
            String nick = getFriendsNick().get();
            System.out.println(nick);
        }
        Optional<String> maybe = getFriendsNick();
        maybe.ifPresent(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Nick: " + s);
            }
        });
        maybe.ifPresent(s -> {
            System.out.println("Nick: " + s);
        });
    }
}
