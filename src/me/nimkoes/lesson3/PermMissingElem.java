package me.nimkoes.lesson3;

public class PermMissingElem {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int answer = 0;
        for (int i = 0; i <= A.length; ++i) {
            answer ^= (i+1);
            if (i < A.length) answer ^= A[i];
        }
        return answer;
    }
    
    public static void main(String[] args) {
        PermMissingElem p = new PermMissingElem();
        System.out.println(p.solution(new int[] {2, 3, 1, 5}));     // expected : 4
        System.out.println(p.solution(new int[] {1, 3, 4, 5, 6}));  // expected : 2
        System.out.println(p.solution(new int[] {2, 3, 4, 5}));     // expected : 1
        System.out.println(p.solution(new int[] {1, 2, 3, 4}));     // expected : 5
        System.out.println(p.solution(new int[] {1}));              // expected : 2
        System.out.println(p.solution(new int[] {2}));              // expected : 1
        
        
    }
}
