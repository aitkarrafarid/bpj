package td.decoupage.fak;

import org.junit.Test;
import td.decoupage.dto.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test1 {

    private void afficher(List<Person> list) {
        // Displaying the sorted list
        list.forEach(e -> System.out.println(e.name()));
    }

    private List<Person> initData_listPersonne() {
        List<Person> lp = new ArrayList<>();
        Person person1 = new Person("Sofiane", 19);
        Person person2 = new Person("Farid", 46);
        Person person3 = new Person("Erwan", 50);
        lp.add(person1);
        lp.add(person2);
        lp.add(person3);
        return lp;
    }

    @Test
    public void aPrivilegierStreams () {
        // Given
        List<Person> list = initData_listPersonne();
        final String name = "Sofiane";
        Person result = null;
//        startChrono("aPrivilegier");
        // Parcourir la liste des entrepots
        for (Person personne : list) {
            // SI on a trouvé l'élément
            if (personne.name().equals(name)) {
                result = personne;
                System.out.println(result);
                break;
            }
        }
//      afficher(result);
//        stopChrono();
    }

    @Test
    public void alternativeStreams () {
        // Given
        List<Person> list = initData_listPersonne();
        final String name = "Sofiane";
        Person result = null;
//        startChrono("alternative");
        result = list.stream().filter(p -> p.name().equals(name)).findAny().orElse(null);
        System.out.println(result);
//      afficher(result);
//        stopChrono();
    }

    @Test
    public void aPrivilegierLambdaComparaisons () {
        // Given
        List<Person> list = initData_listPersonne();
//        startChrono("aPrivilegier");
        for (int i = 0; i < list.size(); i++) {
            list.sort( (e1, e2) -> {
                final String nom1 = e1.name();
                final String nom2 = e2.name();
                int result = nom1.compareTo(nom2);
                return result;
            });
        }
        afficher(list);
//        stopChrono();
    }

    @Test
    public void alternativeLambdaComparaisons () {
        // Given
        List<Person> list = initData_listPersonne();
//        startChrono("alternative");
        for (int i = 0; i < list.size(); i++) {
            // Définir le Comparator
            Comparator<Person> compElem = new Comparator<Person>() {
                @Override
                public int compare (final Person e1, final Person e2) {
                    final String nom1 = e1.name();
                    final String nom2 = e2.name();
                    int result = nom1.compareTo(nom2);
                    return result;
                }
            };
            // Lancer le trie
            list.sort(compElem);
        }
        afficher(list);
//        stopChrono();
    }

    @Test
    public void aPrivilegierLambdaClasseAnonyme () {
        // Given
//        startChrono("aPrivilegier");
        for (int i = 0; i < 1000; i++) {
            Runnable thread = () -> {
                // Le traitement
                for (int cpt = 0; cpt <= 10; cpt++) {
                    // RAS
                }
                System.out.println("Le traitement du thread terminé");
            };
            new Thread(thread).start();
        }
//        stopChrono();
    }

    @Test
    public void alternativeLambdaClasseAnonyme () {
        // Given
//        startChrono("alternative");
        for (int i = 0; i < 1000; i++) {
            Runnable thread = new Runnable() {
                @Override
                public void run () {
                    // Le traitement
                    for (int i = 0; i <= 10; i++) {
                        // RAS
                    }
                    System.out.println("Le traitement du thread terminé");
                }
            };
            new Thread(thread).start();
        }
//        stopChrono();
    }

}
