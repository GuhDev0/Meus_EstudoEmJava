import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
public class SetList {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();

        hashSet.add("Gustavo");
        hashSet.add("Guilherme");
        hashSet.add("Lucas");
        System.out.println(hashSet);
        boolean existeEsseNome = hashSet.contains("Gustavo");
        System.out.println(existeEsseNome);
        int tamanhoDaLista = hashSet.size();
        System.out.println(tamanhoDaLista);

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Otavio");
        linkedHashSet.add("Emanuelly");
        linkedHashSet.add("Miguel");
        linkedHashSet.add("Miguel");
        System.out.println(linkedHashSet);

    }
}
