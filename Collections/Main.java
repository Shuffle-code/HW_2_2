package Collections;

import java.util.*;

public class Main {
    public static void main(String[] args){
        String[] array = new String[15];
        array = new String[]{"Создать", "массив", "с", "набором", "слов", "Найти", "и", "вывести", "список", "уникальных", "слов", "из", "которых", "состоит", "массив"};

//        printListHash(addList(array));
//        sumRepeatWord(addArray());
        numberRepeatInList(addArray());





    }

    static Map<String, Integer> numberRepeatInList(String[] arr) {
//        Map<String, Integer> values = new HashMap<>();
//        Map<String, Integer> sorted = new TreeMap<>();
        Map<String, Integer> linked = new LinkedHashMap<>();

        for (String s : arr) {
            int sum = 1;
            if(linked.containsKey(s)){
                sum = sum + 1;
            }
            linked.put(s, sum);
        }
        System.out.println(linked);

        return (linked);
    }






    static String[] addArray(){
        String text = "Создать массив с набором слов Найти и вывести список уникальных слов из которых состоит массив";
        String[] arr = text.split(" ");
        return arr;
    }


//    static Set<String> addList(String[] arr){
//        Set<String> word = new LinkedHashSet<>();
//        for (String s : arr) {
//            word.add(s);
//            System.out.print(s + " ");
//        }System.out.println(" ");
//        return word;
//    }

//    static void printListHash(Set<String> word) {
//        for (String w : word) {
//            System.out.println("Word that do not repeat: " + w);
//        }
//    }

}
