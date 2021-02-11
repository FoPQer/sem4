package Prac2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ListSet {
    List<Human> list = new ArrayList<>();
    int sum = 0;

    void findMid(int sup){
        sum += sup;
    }

    ListSet() {
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            list.add(new Human());
        }
        Stream<Human> stream = list.stream();
        stream.filter(list -> list.age > 20).forEach(System.out::println);
        stream.sorted(Comparator.comparing(list->list.firstName.charAt(list.firstName.length()-1))).forEach(System.out::println);
        stream.forEach(list -> list.setAge(list.getAge()+3));
        stream.forEach(list -> findMid(list.age));
        System.out.println(sum/4);
    }
}
