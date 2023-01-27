

// Первый семинар.
// 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
// 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
// 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
// 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

// int i = new Random().nextInt(k); //это кидалка случайных чисел!)


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sem_1_Home {
    public static void main(String[] args) {
        Random rand = new Random();

        int i = rand.nextInt(2001);
        System.out.println("Случайное число: " + i);
        
        int n = (int) (Math.log(i) / Math.log(2)) + 1;
        System.out.println("Номер старшего значащего бита: " + n);
        
  
        List<Short> m1 = new ArrayList<>();
        for (short j = (short)i; j < Short.MAX_VALUE; j++) {
            if (j % n == 0) {
                m1.add(j);
            }
        }
        System.out.println("Кратные " + n + " в диапазоне от " + i + " до " + Short.MAX_VALUE + ":");
        System.out.print(m1);

        List<Short> m2 = new ArrayList<>();
        for (short j = Short.MIN_VALUE; j <= i; j++) {
            if (j % n != 0) {
                m2.add(j);
            }
        }
        System.out.println("Некратные " + n + " в диапазоне от " + Short.MIN_VALUE + " до " + i + ":");
        System.out.print(m2);
}
}
