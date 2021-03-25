package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//
//        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor\n" +
//                "incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis\n" +
//                "nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.\n" +
//                "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu\n" +
//                "fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in\n" +
//                "culpa qui officia deserunt mollit anim id est laborum.\n";
//
//        text.replaceAll("(\\s|^)([l|L][a-z]*)", "*******");
//        String[] words = text.split("\\s");
//        for(String word: words){
//            System.out.println(word);
//        }
//        String[] words1 = text.split(",");
//        for(String word : words1){
//            System.out.println(word + ",");
//        }

        List <String>emails = new ArrayList();

        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";

        Pattern pattern = Pattern.compile(regex);

        for(String email : emails){
            Matcher matcher = pattern.matcher(email);
            System.out.println(email +" : "+ matcher.matches());
        }







    }





}
