package java2_HW.homework3;

import java.util.*;

public class Part_1 {


   private static String [] words = {"Иванов","Петров","Сидоров","Кузнецов","Воробьёв","Киселёв","Соколов","Иванов","Петров","Скворцов"};

    public static void main(String[] args) {
        Map<String,Integer> wordsMap = new HashMap<>();
        for (String word: words)
              {Integer counter = wordsMap.get(word);
            wordsMap.put(word , counter ==null ? 1: counter ++);
        }
        System.out.println(wordsMap);
    }


}
