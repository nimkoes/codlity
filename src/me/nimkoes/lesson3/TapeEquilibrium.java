package me.nimkoes.lesson3;

public class TapeEquilibrium {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int answer = Integer.MAX_VALUE;
        int right = 0;
        for (int i : A) right += i;
        
        int left = 0;
        for (int i = 0; i < A.length - 1; ++i) {
            left += A[i]; right -= A[i];
            answer = Math.min(answer, Math.abs(left - right));
            if(answer == 0) break;
        }
    
        return answer;
    }
    
    public static void main(String[] args) {
        TapeEquilibrium p = new TapeEquilibrium();
        System.out.println(" :: " + p.solution(new int[] {3, 1, 2, 4, 3}));     // expected : 4
    }
}
