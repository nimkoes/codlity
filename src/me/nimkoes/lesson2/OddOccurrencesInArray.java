package me.nimkoes.lesson2;

import java.util.HashSet;

public class OddOccurrencesInArray {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int answer = 0;
        
        /*
        HashSet<Integer> hs = new HashSet<>();
    
        for (int elem : A) {
            if(hs.contains(elem)) hs.remove(elem);
            else hs.add(elem);
        }
        
        answer = hs.iterator().next();
        */
        
        /*
        using XOR
         */
    
        for (int e : A) answer ^= e;
        return answer;
    }
    
    public static void main(String[] args) {
        OddOccurrencesInArray p = new OddOccurrencesInArray();
        System.out.println(p.solution(new int[] {9, 3, 9, 3, 9, 7, 9}));   // expected : 7
    }
}
