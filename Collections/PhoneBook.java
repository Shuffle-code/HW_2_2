package Collections;

import java.util.*;

public class PhoneBook{

    private final Map<String, Set<String>> phoneBooks = new HashMap<>();

    private void addPhoneBookMap(String name, String number){

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
}
