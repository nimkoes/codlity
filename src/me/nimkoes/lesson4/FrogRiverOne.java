package me.nimkoes.lesson4;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {
    public int solution(int X, int[] A) {
        // write your code in Java SE 8
        int answer = -1;
        Set<Integer> mySet = new HashSet<>();
        for (int i = 0; i < A.length; ++i) {
            if (!mySet.contains(A[i])) mySet.add(A[i]);
            if (mySet.size() == X) {
                answer = i;
                break;
            }
        }
        return answer;
    }
    
    public static void main(String[] args) {
        FrogRiverOne p = new FrogRiverOne();
        System.out.println(" :: " + p.solution(5, new int[] {1, 3, 1, 4, 2, 3, 5, 4}));     // expected : 6
    }
}
