package lesson;

// 1.Сохранить в файл строку и загрузить из файла строку с выводом в консоль используя классы FileWriter и FileReader
// 2.Загрузить из файла многострочный текст формата ФИО возраст и пол через пробелы. Разбить по строкам и вывести в консоль в формате "Иванов И.И. 32 М"
// 3.Загруженный и разбитый по строкам текст загрузить в подготовленные списки. Фамилии, имена, отчества, возрас и пол в отдельных списках.
// 4.Отсортировать по возрасту используя дополнительный список индексов.

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Sem_4 {
    public static void main(String[] args) {
        
        try {
            FileWriter fw = new FileWriter("bd.sql");
            fw.append("Иванов Иван Иванович" + " 25 " + "Мужчина");
            fw.append("\n");
            fw.append("Иванова Мария Ивановна" + " 18 " + "Женщина");
            fw.append("\n");
            fw.append("Сидоров Владимир Игоревич" + " 32 " + "Мужчина");
            fw.append("\n");
            fw.append("Макаров Алесандр Сергеевич" + " 56 " + "Мужчина");
            fw.append("\n");
            fw.append("Самойлова Ирина Валерьевна" + " 48 " + "Женщина");
            fw.flush();
            } 
            catch (IOException e) {
            System.out.println(e.getMessage());
            }

        try {
            FileReader fr = new FileReader("bd.sql");
        
            String s = "";
            while (fr.ready()) {
                s += (char)fr.read();
            }
            String [] parts = s.split("\n");
            System.out.println(Arrays.toString(parts));

            ArrayList<String> firstName = new ArrayList<>();
            ArrayList<String> lastName = new ArrayList<>();
            ArrayList<String> middleName = new ArrayList<>();
            ArrayList<Integer> age = new ArrayList<>();
            ArrayList<Boolean> gender = new ArrayList<>();
            ArrayList<Integer> indices = new ArrayList<>();
            for (int i = 0; i < parts.length; i++) {
                String[] tmp = parts[i].split(" ");
                firstName.add(tmp[0]);
                lastName.add(tmp[1]); 
                middleName.add(tmp[2]); 
                age.add(Integer.valueOf(tmp[3]));
                gender.add(tmp[4].contains("М") ?false:true);
                indices.add(i); 
            }

            indices.sort((i1, i2) -> age.get(i1).compareTo(age.get(i2)));
            System.out.println(indices);
    
            for (Integer index : indices) {
                String first = firstName.get(index);
                String last = lastName.get(index);
                String middle = middleName.get(index);
                int a = age.get(index);
                boolean g = gender.get(index);
                System.out.println(first + " " + last + " " + middle + " " + a + " " + (g ? "Женщина":"Мужчина"));
                }
            }
        
        catch (IOException e) {
            System.out.println(e.getMessage());
            }
         
        }
    }

    



    
    
    