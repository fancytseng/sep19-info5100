package Assignment4;

//Q5. (Extra Credit- 2 mks)
//Given a string S that only contains "I" (increase) or "D" (decrease), let N = S.length.
//
//        Return any permutation A of [0, 1, ..., N] such that for all i = 0, ..., N-1:
//
//        If S[i] == "I", then A[i] < A[i+1](means increase because the next value bigger)
//        If S[i] == "D", then A[i] > A[i+1](means decrease because the next value smaller)
//        Example 1:
//
//        Input: "IDID"
//        Output: [0,4,1,3,2]
//        Example 2:
//
//        Input: "III"
//        Output: [0,1,2,3]
//        Example 3:
//
//        Input: "DDI"
//        Output: [3,2,0,1]

public class Question_5 {

    public int[] diStringMatch(String S) {
        int N = S.length();
        int lo = 0, hi = N;
        int[] ans = new int[N + 1];
        for (int i = 0; i < N; ++i) {
            if (S.charAt(i) == 'I')
                ans[i] = lo++;
            else
                ans[i] = hi--;
        }

        ans[N] = lo;
        return ans;
    }
}
