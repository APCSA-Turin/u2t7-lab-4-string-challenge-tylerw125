package com.example.project;
public class StringProblems{
    public StringProblems(){}

    public boolean endsLy(String x){
        if(x.length() < 2) return false;
        return x.endsWith("ly");
    }

    public String conCat(String s1, String s2){
        if(s1.length() == 0) return s2;
        if(s2.length() == 0) return s1;
        if(s1.charAt(s1.length()-1) == s2.charAt(0)){
            return s1 + s2.substring(1);
        }
        return s1 + s2;
    }

    public String deFont(String s1){
        String result = "";
        if(s1.length() > 0 && s1.charAt(0) == 'a'){
            result += 'a';
        }
        if(s1.length() > 1 && s1.charAt(1) == 'b'){
            result += 'b';
        }
        if(s1.length() > 2){
            result += s1.substring(2);
        }
        return result;
    }

    public String withoutX(String s1){
        if(s1.length() == 0) return s1;
        if(s1.charAt(0) == 'x'){
            s1 = s1.substring(1);
        }
        if(s1.length() > 0 && s1.charAt(s1.length()-1) == 'x'){
            s1 = s1.substring(0, s1.length()-1);
        }
        return s1;
    }

    public String testfizzString(String s1){
        boolean startsWithF = s1.startsWith("f");
        boolean endsWithB = s1.endsWith("b");


        if(startsWithF && endsWithB) return "FizzBuzz";
        if(startsWithF) return "Fizz";
        if(endsWithB) return "Buzz";
        return s1;
    }

    public String testfizzString2(int x){
        if(x % 3 == 0 && x % 5 == 0) return "FizzBuzz!";
        if(x % 3 == 0) return "Fizz!";
        if(x % 5 == 0) return "Buzz!";
        return x + "!";
    }
}
