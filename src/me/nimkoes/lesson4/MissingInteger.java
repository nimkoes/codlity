package me.nimkoes.lesson4;

import java.util.HashSet;

public class MissingInteger {
    public int solution(int[] A) {
        int answer = 1;
        HashSet<Integer> hs = new HashSet<>();
        
        for (int i : A) if(i > 0) hs.add(i);
        if(hs.size() == 0) return 1;
        for(int i = 1; hs.contains(i); ++i) ++answer;
        
        return answer;
    }
    
    public static void main(String[] args) {
        MissingInteger p = new MissingInteger();
        System.out.println(" :: " + p.solution(new int[] {1, 3, 6, 4, 1, 2}));     // expected : 5
        System.out.println(" :: " + p.solution(new int[] {1, 2, 3}));              // expected : 4
        System.out.println(" :: " + p.solution(new int[] {-1, -3}));               // expected : 1
    }
}
