package lesson;

import java.util.HashMap;
import java.util.Set;

public class Sem_5 {
    public static void main(String[] args) {
        
        HashMap<String, String> map = new HashMap<>();

map.put("One", "1");
map.put("Два", "2");
map.put("Three", "3");
map.put("Четыре", "4");
System.out.println(map.putIfAbsent("Five", "5"));
System.out.println(map.putIfAbsent("Five", "6"));
System.out.println(map.get("Два"));

Set<String> keySet = map.keySet();

// map.forEach((k, v) -> System.out.println(k + " " +v));

// for (String tmp: keySet) {
// System.out.println(map.get(tmp));
// }

// Iterator<String> iterator = map.keySet().iterator();
// while (iterator.hasNext()) {
// String tmp = iterator.next();
// System.out.println(tmp);
// iterator.remove();
// }

// for (int i = 0; i < keySet.size(); i++) {
// System.out.println("" +keySet.toArray()[i] + " " + map.get(keySet.toArray()[i]));
// }
    }
}
