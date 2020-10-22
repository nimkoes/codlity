package me.nimkoes.lesson2;

import java.util.Arrays;

public class CyclicRotation {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        int size = A.length;
        
        int[] answer = new int[size];
        if(size == 0) return answer;
        
        int startIndex = size - (K % size);
        
        int count = 0;
        for (int i = startIndex; count < size; ++i) {
            if(i >= size) i %= size;
            answer[count++] = A[i];
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
        CyclicRotation p = new CyclicRotation();
        System.out.println(Arrays.toString(p.solution(new int[] {3, 8, 9, 7, 6}, 3)));   // expected : [9, 7, 6, 3, 8]
        System.out.println(Arrays.toString(p.solution(new int[] {0, 0, 0}, 1)));         // expected : [0, 0, 0]
        System.out.println(Arrays.toString(p.solution(new int[] {1, 2, 3, 4}, 4)));      // expected : [1, 2, 3, 4]
        System.out.println(Arrays.toString(p.solution(new int[] {}, 4)));                // expected : []
    }
}
