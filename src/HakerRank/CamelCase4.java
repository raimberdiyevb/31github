package HakerRank;

import java.util.ArrayList;

public class CamelCase4 {
    public static void main(String[] args) {
        camelCase("C;V;mobile phone");
        camelCase("C;M;white sheet of paper");
    }
    public static void camelCase(String s){
        String task = String.valueOf(s.charAt(0));
        String type = String.valueOf(s.charAt(2));
        String input = s.substring(4);
        if(task.equals("S")){
            if(type.equals("C")){
                String res = "";
                ArrayList<Character> arr = new ArrayList<>();
                for( char c : input.toCharArray()){
                    arr.add(c);
                }
                for (int i = 0; i < arr.size(); i++) {
                    if(Character.isUpperCase(arr.get(i))){
                        arr.add(i+1,Character.toLowerCase(arr.get(i)));
                        arr.set(i,' ');

                    }
                }
                for( char c: arr){
                    res = res.concat(String.valueOf(c));
                }
                res = res.trim();
                System.out.println(res);
            } else if (type.equals("V")) {
                String res = "";
                ArrayList<Character> arr = new ArrayList<>();
                for( char c : input.toCharArray()){
                    arr.add(c);
                }
                for (int i = 0; i < arr.size(); i++) {
                    if(Character.isUpperCase(arr.get(i))){
                        arr.add(i+1,Character.toLowerCase(arr.get(i)));
                        arr.set(i,' ');

                    }
                }
                for( char c: arr){
                    res = res.concat(String.valueOf(c));
                }
                res = res.trim();
                System.out.println(Character.toLowerCase(res.charAt(0)) + res.substring(1));
            } else {
                String res = "";
                ArrayList<Character> arr = new ArrayList<>();
                for( char c : input.toCharArray()){
                    arr.add(c);
                }
                for (int i = 0; i < arr.size(); i++) {
                    if(Character.isUpperCase(arr.get(i))){
                        arr.add(i+1,Character.toLowerCase(arr.get(i)));
                        arr.set(i,' ');

                    }
                }
                for( char c: arr){
                    res = res.concat(String.valueOf(c));
                }
                res = res.trim();
                System.out.println(res.substring(0,res.length()-2));
            }
        }else{
            if(type.equals("C")){
                String res = "";
                ArrayList<Character> arr = new ArrayList<>();
                for (char c : input.toCharArray()){
                    arr.add(c);
                }
                for (int i = 0; i < arr.size(); i++) {
                    if(arr.get(i) == ' '){
                        arr.set(i+1,Character.toUpperCase(arr.get(i+1)));
                        arr.remove(i);
                    }
                }
                for( char c : arr){
                    res = res.concat(String.valueOf(c));
                }
                System.out.println(Character.toUpperCase(res.charAt(0)) + res.substring(1));
            } else if (type.equals("V")) {

                String res = "";
                ArrayList<Character> arr = new ArrayList<>();
                for (char c : input.toCharArray()){
                    arr.add(c);
                }
                for (int i = 0; i < arr.size(); i++) {
                    if(arr.get(i) == ' '){
                        arr.set(i+1,Character.toUpperCase(arr.get(i+1)));
                        arr.remove(i);
                    }
                }
                for( char c : arr){
                    res = res.concat(String.valueOf(c));
                }
                System.out.println(res);
            } else {

                String res = "";
                ArrayList<Character> arr = new ArrayList<>();
                for (char c : input.toCharArray()){
                    arr.add(c);
                }
                for (int i = 0; i < arr.size(); i++) {
                    if(arr.get(i) == ' '){
                        arr.set(i+1,Character.toUpperCase(arr.get(i+1)));
                        arr.remove(i);
                    }
                }
                for( char c : arr){
                    res = res.concat(String.valueOf(c));
                }
                System.out.println(res + "()");
            }
        }
    }
}
