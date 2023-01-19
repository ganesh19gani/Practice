package com.practice.app.controller;

import java.util.HashMap;
import java.util.Map;

// how to find duplicate characters in a given String
public class PracticeController {

    public static void duplicates() {
        String str = "Ganeshadapagnsh";
        Map<Character, Integer> hmap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
                if(hmap.containsKey(str.charAt(i))) {
                      int count = hmap.get(str.charAt(i));
                      hmap.put(str.charAt(i), ++count);
                  } else {
                      hmap.put(str.charAt(i), 1);
                  }

        }
        System.out.println(hmap);
    }
}
