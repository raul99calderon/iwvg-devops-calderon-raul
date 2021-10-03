package es.upm.miw.iwvg_devops.searches;

import java.util.Optional;
import java.util.stream.Stream;

public class Searches {
    public Stream<String> findUserNameBySomeImproperFraction() {
        return new UsersDatabase().findAll()
                .filter(user -> user.getFractions()
                        .stream()
                        .anyMatch(Fraction::isNotProper))
                .map(User::getName);
    }

    public Stream<Double> findDecimalFractionByNegativeSignFraction() {
        return new UsersDatabase().findAll()
                .flatMap(user->user.getFractions()
                        .stream())
                .filter(Fraction::isNegative)
                .map(Fraction::decimal);
    }

    public Optional<Fraction> findFractionDivisionByUserId(String id) {
        return new UsersDatabase().findAll()
                .filter(user -> id.equals(user.getId()))
                .flatMap(user -> user.getFractions()
                        .stream())
                .reduce(Fraction::divide);
    }

    public Stream<String> findUserFamilyNameBySomeImproperFraction() {
        return new UsersDatabase().findAll()
                .filter(user -> user.getFractions()
                        .stream()
                        .anyMatch(Fraction::isNotProper))
                .map(User::getFamilyName);
    }
}
