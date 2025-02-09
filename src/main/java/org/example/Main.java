package org.example;


import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main {

    //1
    public static boolean checkForPalindrome(String str){
        str=str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        Map<Character,Integer> charCountMap=new HashMap<>();

        for(int i=0;i<str.length();i++){
            char c =str.charAt(i);
            charCountMap.put(c,charCountMap.getOrDefault(c,0)+1);
        }
        int oddCount=0;
        for(int count:charCountMap.values()){
            if(count%2 != 0){
                oddCount++;
            }
        }
        return oddCount <= 1;
    }

    //3
    public static String convertDecimalToBinary(int number){
        Map<Integer,Integer> map=new HashMap<>();

        int position=0;

        while(number > 0){
            map.put(position, number%2);
            number= number/2;
            position++;
        }
        StringBuilder binaryString=new StringBuilder();

        for (int i=0;i<position;i++){
            binaryString.append(map.get(i));
        }
        return binaryString.toString();
    }

    public static void main(String[] args) {
        System.out.println(checkForPalindrome("I did, did I?")); // true
        System.out.println(checkForPalindrome("Racecar")); // true
        System.out.println(checkForPalindrome("hello")); // false
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));

        //2
        WorkintechList<String> stringList=new WorkintechList<>();

        stringList.add("Banana");
        stringList.add("Apple");
        stringList.add("Cherry");
        stringList.add("Banana");

        stringList.sort();
        System.out.println(stringList.getList());

        stringList.remove("Apple");
        System.out.println(stringList.getList());

        stringList.get(0);

        //3
        System.out.println(convertDecimalToBinary(5));
        System.out.println(convertDecimalToBinary(6));
        System.out.println(convertDecimalToBinary(13));


    }

}