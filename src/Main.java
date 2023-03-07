import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Java", "Python", "Ruby", "Kotlin");

        List<String> modifiedNames = names.stream()
                .map(name -> name.substring(1)) // удаляем первую букву из каждого имени
                .sorted() // сортируем список
                .collect(Collectors.toList()); // преобразовываем стрим к списку

        System.out.println(modifiedNames); // [ava, otlin, uby, ython]

    }

}