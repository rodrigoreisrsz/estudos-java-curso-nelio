package com.reis.map;

import java.util.TreeMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Rodrigo"); // chave primeiro argumento → valor em segundo
        cookies.put("email", "rayane15899.com");
        cookies.put("numero", "77787997993");
        cookies.put("zap", "77787997993");

        cookies.remove("numero");

        System.out.println("Contains 'email' key: " + cookies.containsKey("email"));
        System.out.println("zap number: " + cookies.get("zap"));

        for(String key : cookies.keySet()){ // keySet retorna uma coleção na forma de um Set
            System.out.println(key + ": " + cookies.get(key));
        }


    }
}
