public class ArraysStrings {

    public static boolean isUnique(String str){
        int[] asciiTable = new int[128];
        
        System.out.println(str);
        for(int i = 0; i < str.length(); i++) {
            int asciiVal = str.charAt(i);
            if(asciiTable[asciiVal] != 1) {
                asciiTable[asciiVal] = 1;
            }
            else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        /* 
        (Problem 1.1) Is Unique
            - Implement an algorithm to determine if a string has all unique characters 

            Example:
            "Amsterdam" => false 
            "Berlin" => true

            Approaches: 
                - O(n^2) don't do this.. loop through each character in string and check for duplicates.. 
                - O(n) as you loop through each char, put a 1 in ascii array for each char, if you already have a value in that spot, it's a duplicate.
            
        */

        System.out.println(isUnique("berlin"));
        System.out.println(isUnique("amsterdam"));
        System.out.println(isUnique("hamburg!@"));

        /* 
        (Problem 1.2) Check Permutation
            - Given two strings, write a method to check if one is a permutation of another
        */

        
    }
}