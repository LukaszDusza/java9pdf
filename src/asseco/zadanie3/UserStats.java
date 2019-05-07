package asseco.zadanie3;

import java.util.List;
import java.util.Optional;

public class UserStats {

    Optional<Long> visitCount;
    int a; //typ prosty
    Integer b; //typ opakowaniowy / wraper / reprezentacja obiektowa typu prostego.
    Optional<Integer> c; //typ opakowaniowy dla obiektu Intiger / super wraper


    public void main(String[] args) {
        a = 0; // typ prosty - nie ma funkcji ;(
        b.byteValue();  // mamy kilka funkcji klasy Integer
        c.get().byteValue(); //odpakowujemy Integera z Optional i mamy funkcje Integera
        c.isPresent(); //- tutaj mamy funkcje Optional
    }

}
