package es.upm.miw.iwvg_devops.searches;

import java.util.stream.Stream;

public class Searches {
    public Stream<String> findUserNameBySomeImproperFraction() {
        return new UsersDatabase().findAll()
                .filter(user -> user.getFractions()
                        .stream()
                        .anyMatch(Fraction::isNotProper))
                .map(User::getName);
    }
}
