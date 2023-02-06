import java.util.ArrayList;
import java.util.Collections;

// 1.Создать новый список, добавить несколько строк и вывести коллекцию на экран.
// 2.Итерация всех элементов списка цветов и добавления к каждому символа '!'.
// 3.Вставить элемент в список в первой позиции.
// 4.Извлечь элемент (по указанному индексу) из заданного списка.
// 5.Обновить определенный элемент списка по заданному индексу.
// 6.Удалить третий элемент из списка.
// 7.Поиска элемента в списке по строке.
// 8.Создать новый список и добавить в него несколько елементов первого списка.
// 9.Удалить из первого списка все элементы отсутствующие во втором списке.
// 10.*Сортировка списка.


public class Sem_3_Home {
    public static void main(String[] args) {
        
 // #1
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Hello_World!");
        list1.add("Hello");
        System.out.println(list1);

        list1.add("Hi, worold");
        list1.add("Hi-Hi");
// #2
        for (int i = 0; i < list1.size(); i++) {
            list1.set(i, list1.get(i) + "!");
        }
        System.out.println(list1);

        for (String str : list1) {
            str += "!";
        }
        System.out.println(list1);
// #3
        list1.add(0, "Java" );
        System.out.println(list1);
// #4
        int a;
        a = list1.size();
        list1.remove(a-2);

// #5
        list1.set(2, "Gagarin");
        System.out.println(list1);
// #6
       list1.remove(3);
       System.out.println(list1);
// #7
       System.out.println(list1.contains("Java"));
// #8
       ArrayList<String> list2 = new ArrayList<>();
       list2.add(list1.get(0));
       list2.add(list1.get(2));
       System.out.println(list2);

// #9
        list1.retainAll(list2);
        System.out.println(list1);
// #10  
        Collections.sort(list1);
        System.out.println(list1);
    }
}
