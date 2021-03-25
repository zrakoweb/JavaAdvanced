package uzduotis1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {

        BiFunction<List<String>, List<String>, List<String>> listMergeSorter =
                (list1, list2) -> Stream.concat(list1.stream(), list2.stream())
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());


        List<String> list1 = new ArrayList<>();
        list1.add("vienas");
        list1.add("du");
        list1.add("trys");
        list1.add("keturi");
        list1.add("penki");


        List<String> list2 = new ArrayList<>();
        list2.add("5");
        list2.add("1");
        list2.add("3");
        list2.add("4");
        list2.add("2");

        System.out.println(listMergeSorter.apply(list1,list2));
    }

}
