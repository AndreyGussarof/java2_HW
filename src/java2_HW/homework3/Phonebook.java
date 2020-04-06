package java2_HW.homework3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Phonebook {

    HashMap<String, ArrayList> phonebook = new HashMap<>();


    public void add(String name, Integer phoneNumber) {

        if (phonebook.containsKey(name)) {
            phonebook.get(name).add(phoneNumber);
            System.out.println(name + " Уже есть в справочнике ");
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(phoneNumber);
            phonebook.put(name, list);
            System.out.println(name + " " + phoneNumber + " Добавлен в справочник ");

        }
        System.out.println(phonebook);
    }

    public void get(String name ) {
        if (phonebook.containsKey(name)) {
            System.out.println(" Абонент : "+ name  + " " + phonebook.get(name));
        } else {
            System.out.println(" Абонент " + name + " отстутствует в справочнике ");
        }
    }
}
