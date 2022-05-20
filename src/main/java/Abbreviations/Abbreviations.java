package Abbreviations;


import java.util.HashMap;
//Mooci HashMap Abbreviations Exercise
public class Abbreviations {
    //Manages common abbreviations utilizing a HashMap
    HashMap<String, String> abbreviationsMap = new HashMap<>();

    public Abbreviations(){}

    public void addAbbreviation(String abbreviated, String unAbbreviated){
        abbreviationsMap.put(abbreviated.toLowerCase(), unAbbreviated.toLowerCase());
    }
    public boolean hasAbbreviation(String abbreviated){
        return abbreviationsMap.containsKey(abbreviated);
    }
    public String findExplanationFor(String abbreviated){
        return abbreviationsMap.get(abbreviated.toLowerCase());
    }
}
