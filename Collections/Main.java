package Collections;

import java.util.*;

public class Main {
    public static void main(String[] args){
        String[] array = new String[15];
        array = new String[]{"Создать", "массив", "с", "набором", "слов", "Найти", "и", "вывести", "список", "уникальных", "слов", "из", "которых", "состоит", "массив"};

        listHash(addList(addArray()));
        sumRepeatWord(addArray());


        addPhoneBookMap("Ivan","23");


    }

    static void addPhoneBookMap(String name, String number){
        Map<String, Set<String>> phoneBooks = new HashMap<>();
//        Set<String> numbers = phoneBooks.getOrDefault(name, new HashSet<>());
        if(phoneBooks.containsKey(name)){
            phoneBooks.get(name).add(number);
        }else {
            Set<String> numbers = new HashSet<>();
            numbers.add(number);
            phoneBooks.put(name,numbers);
        }
        System.out.println(phoneBooks);
    }

    public Set<String> get(String name){
        Map<String, Set<String>> phoneBooks = new HashMap<>();
        return phoneBooks.getOrDefault(name, Collections.emptySet());
    }


    static String[] addArray(){
        String text = "Создать массив с набором слов Найти и вывести список уникальных слов из которых состоит массив";
        String[] arr = text.split(" ");
        return arr;
    }
    static void sumRepeatWord(String[] arr){

        for (int i = 0; i < arr.length; i++) {
            int sum = 1;
                    for (int j=i+1; j<arr.length; j++) {
                        if(arr[i].equals(arr[j])) {
                            sum = sum + 1;
                            System.out.println("Word: " + arr[i] + " repeat " + sum + " times.");
                        }
            }
        }
    }

    static Set<String> addList(String[] arr){
        Set<String> word = new LinkedHashSet<>();

        for (String s : arr) {
            int sum = 1;
            if(!word.add(s)){
                sum = sum + 1;
                System.out.println("\nWord: " + s + " repeat " + sum + " times.");
            }
            word.add(s);
            System.out.print(s + " ");
        }System.out.println(" ");
        return word;
    }

    static void listHash(Set<String> word) {
        for (String w : word) {
            System.out.println("Word that do not repeat: " + w);
        }
    }

}
