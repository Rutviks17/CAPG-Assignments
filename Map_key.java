package com.rutviks.java;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

class NameSub implements Comparator<String>{
    @Override
    public int compare(String a, String b){
        return a.compareTo(b);
    }
}
public class Map_key {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>(new NameSub());
        map.put("Rutvik", "IOT");
        map.put("Omkar","AI");
        map.put("Prathamesh", "ML");
        map.forEach((k,v)-> System.out.println(k +" "+v));
    }
}
