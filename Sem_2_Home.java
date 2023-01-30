// 1 Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
// 2 Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
// 3 *Напишите программу, чтобы перевернуть строку с помощью рекурсии.
// 4 Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
// 5 Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
// 6* Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
// 7** Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.

    public class Sem_2_Home {
    public class Sem_2_1_Home {
    public static void main(String[] args) {
        

    // 1. Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).

    String str = "Hello";
    String str2 = "Hello World";
    boolean flag = true;
    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if (str2.indexOf(c) == -1) {
        flag = false;
        break;
      }
    }
    if (flag) {
      System.out.println("str содержит все символы str2");
    } else {
      System.out.println("str не содержит все символы str2");
    }

    // 2. Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).

    // String str = "hello";
    // String str2 = "olleh";
    
    if (str.length() != str2.length()) {
      System.out.println("Строки не являются вращением друг друга");
      return;
    }
    
    String str2Reversed = new StringBuilder(str2).reverse().toString();
    if (str.equals(str2Reversed)) {
      System.out.println("Строки являются вращением друг друга");
    } else {
      System.out.println("Строки не являются вращением друг друга");  
    }

    // 3. *Напишите программу, чтобы перевернуть строку с помощью рекурсии.

//         String str3 = "Hello World";
        
//         if(str3.length() > 0) {
//             reverseString(str3, str3.length() - 1);
//         }
    
//     }
//     public static void reverseString(String s, int index) {
//         if(index == 0) {
//             System.out.println(s.charAt(index));
            
//             return;
//         }
        
//         System.out.print(s.charAt(index));
        
//         reverseString(s, index - 1);
//     }  
    
//     }
// // 4 Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
// // 5 Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
// // 6* Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
// // public class Sem_2_2_Home {
// public static void main(String[] args) {

//     int a = 3;
//     int b = 56;

//     StringBuilder sum = new StringBuilder();
//     sum
//         .append(a)
//         .append(" + ")
//         .append(b)
//         .append(" = ")
//         .append(a + b);
//     sum.deleteCharAt( 7);
//     System.out.println(sum.insert(7, "равно "));
//     // System.out.println(sum.replace(7, 8, "равно"));

//     StringBuilder dif = new StringBuilder();
//     dif
//         .append(a)
//         .append(" - ")
//         .append(b)
//         .append(" = ")
//         .append(a - b);
//         dif.deleteCharAt( 7);
//     System.out.println(dif.insert(7, "равно "));
//     // System.out.println(dif.replace(7, 8, "равно"));

//     StringBuilder mult = new StringBuilder();
//     mult
//         .append(a)
//         .append(" * ")
//         .append(b)
//         .append(" = ")
//         .append(a * b);
//         mult.deleteCharAt( 7);
//     System.out.println(mult.insert(7, "равно "));
//     // System.out.println(mult.replace(7, 8, "равно"));

//     // 7.** Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.
//                 // (6* Замените символ “=” на слово “равно”. Используйте методы .replace().)

//     StringBuilder x1Builder = new StringBuilder();
    
//     for (int i = 0; i < 10_000; i++) {
//         x1Builder.append("= ");   
//     }
//     long start1 = System.currentTimeMillis();
//     System.out.println(x1Builder.toString().replace("= ", "равно "));
//     long end1 = System.currentTimeMillis();

//     System.out.println("Время 'StringBuilder': " + (end1 - start1));

//     String strx2String = "";
//     for (int i = 0; i < 10_000; i++) {
//         strx2String += "= ";
//     }
//     long start2 = System.currentTimeMillis();
//     System.out.println(strx2String.replace("= ", "равно "));
//     long end2 = System.currentTimeMillis();

//     System.out.println("Время 'String': " + (end2 - start2));

//     System.out.println("Разница между 'StringBuilder' и 'String' : " + ((end2 - start2) - (end1 - start1)));

    }
}
    }
