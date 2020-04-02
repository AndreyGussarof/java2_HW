package java2_HW.homework3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public  class Phonebook {

    HashMap<String, ArrayList> phonebook = new HashMap<>();



    public  void add(String name, ArrayList  phoneNumber) {

        ArrayList<Integer> ph=  phonebook.get(name);
        phonebook.put(name, phoneNumber );

    }

    public static void get(String name) {

    }


}



