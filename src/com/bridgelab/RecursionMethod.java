package com.bridgelab;

public class RecursionMethod {
    private static void swap(char[] ch, int i, int j){
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }
//    Recursive function to generate all permutations of a string
    private static void permutation(char[] ch, int currentIndex){
        if (currentIndex == ch.length -1){
            System.out.print(String.valueOf(ch)+" \t");
        }
        for (int i = currentIndex; i < ch.length; i++){
            swap(ch, currentIndex, i);
            permutation(ch, currentIndex + 1);
            swap(ch, currentIndex, i);
        }
    }

    public static void findPermutations(String str){
        if (str == null || str.length() == 0){
            return;
        }
        permutation(str.toCharArray(), 0);
    }

    public static void main(String[] args) {
        findPermutations("ABC");
    }
}
