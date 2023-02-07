import java.util.HashMap;
import java.util.Random;
import java.util.TreeMap;

// 1.Создать словарь HashMap. Обобщение <Integer, String>.
// 2.Заполнить тремя ключами (индекс, цвет), добавить ключь, если не было!)
// 3.Изменить значения дописав восклицательные знаки.
// 4.*Создать TreeMap, заполнить аналогично.
// 5.*Увеличить количество элементов до 1000 случайными ключами и общей строкой.
// 6.**Сравнить время последовательного и случайного перебора тысячи элементов словарей.

public class Sem_5_Home {
    public static void main(String[] args) {
        
// #1  
//         HashMap<Integer, String> hashMap = new HashMap<>();
// // #2  
//         hashMap.put(1, "Red");
//         hashMap.put(2, "Green");
//         hashMap.put(3, "Blue");
// // #3  
//         hashMap.putIfAbsent(4, "Orange"); 
         
//         hashMap.replaceAll((k, v) -> v + "!");
//         for (String value : hashMap.values()) {
//             System.out.println(value);
//         }

// // #4
//         TreeMap<Integer, String> treeMap = new TreeMap<>();

//         treeMap.put(1, "Red");
//         treeMap.put(2, "Green");
//         treeMap.put(3, "Blue");

//         treeMap.putIfAbsent(4, "Orange"); 

// // #5        
//         Random rand = new Random();

//         for (int i = 0; i < 1000; i++) {
//           int key = rand.nextInt();
//           String value = "Black";
//           treeMap.put(key, value);

//         }
//         System.out.println(treeMap);

// #6
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Red");
        hashMap.put(2, "Green");
        hashMap.put(3, "Blue");

        Random rand = new Random();
        for (int i = 4; i <= 1000; i++) {
          hashMap.put(i, "Black"); 
        }
        
        long startHashMap = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            String value = hashMap.get(i);
          }
        long endHashMap = System.currentTimeMillis();
        System.out.println("Время последовательного перебора HashMap: " + (endHashMap - startHashMap));

        long startHashMapRn = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
          int key = rand.nextInt(1000) + 1;
          String value = hashMap.get(key);
        }
        long endHashMapRn = System.currentTimeMillis();
        System.out.println("Время случайного перебора HashMap: " + (endHashMapRn - startHashMapRn));
      
        
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Red");
        treeMap.put(2, "Green");
        treeMap.put(3, "Blue");
        
        for (int i = 4; i <= 1000; i++) {
          treeMap.put(i, "Black");
        }
        
        long startTreeMap = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            String value = treeMap.get(i);
          }
        long endTreeMap = System.currentTimeMillis();
        System.out.println("Время последовательного перебора TreeMap: " + (endTreeMap - startTreeMap));
      
        long startTreeMapRn = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
          int key = rand.nextInt(1000) + 1;
          String value = treeMap.get(key);
        }
        long endTreeMapRn = System.currentTimeMillis();
        System.out.println("Время случайного перебора TreeMap: " + (endTreeMapRn - startTreeMapRn));

        System.out.println("Разница между НashMap и TreeMap последовательным перебором:  "+ ((endHashMap - startHashMap) - (endTreeMap - startTreeMap)));
        System.out.println("Разница между НashMap и TreeMap случайным перебором:  "+ ((endHashMapRn - startHashMapRn) - (endTreeMapRn - startTreeMapRn)));
    }
}
