package pl.mp.git_examples.OptionalTest;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        Person someone = new Person("Staszek","Zabłocki");

        Optional<Person> maybePeson = Optional.of(someone);
        Optional<Person> maybeNotPeson = Optional.empty();

        getName(someone);
        getName(null);
    }

    private static String getName(Person person){
        return Optional.ofNullable(person)
                .map(person1 -> person1.getImie())
                .orElse("");
    }

}
