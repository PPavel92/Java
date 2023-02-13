import java.util.ArrayList;

// Разработать программу, имитирующую поведение коллекции HashSet.
// В программе содать метод add добавляющий элемент, 
// метод toString возвращающий строку с элементами множества и метод позволяющий читать элементы по индексу.
// Формат данных Integer.
    
public class Sem_6_Home {

    private ArrayList<Integer> set;

    public Sem_6_Home() {
        set = new ArrayList<Integer>();
    }

    public void add(Integer element) {
        if (!set.contains(element)) {
            set.add(element);
        }
    }

    public String toString() {
        String result = "";
        for (Integer element : set) {
            result += element + " ";
        }
        return result;
    }

    public Integer get(int index) {
        if (index >= set.size() || index < 0) {
            return null;
        }
        return set.get(index);
    }

    public static void main(String[] args) {
        Sem_6_Home mySet = new Sem_6_Home();
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        mySet.add(5);
        mySet.add(6);
        System.out.println(mySet.toString());
        System.out.println(mySet.get(3));
    }
}
