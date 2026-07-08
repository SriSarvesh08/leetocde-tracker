// Last updated: 7/8/2026, 3:38:44 PM
class Solution {
        /*
        #########################################################################
        #                                                                       #
        #  =============================================                        #
        #                  SIDDARDHA CHILUVERU                                  #
        #  =============================================                        #
        #                                                                       #
        #  Author      : Siddardha Chiluveru                                    #
        #  Description : Solution / Code / Project                              #
        #  Date        : 2026-05-27                                             #
        #                                                                       #
        #########################################################################
        */
    public String getPermutation(int n, int k) {
    //     ArrayList<String> l = new ArrayList<>();
    //     boolean[] visit = new boolean[n + 1];
    //     func(n, new StringBuilder(), visit, l);
    //     return l.get(k - 1);
    // }

    // public void func(int n, StringBuilder s, boolean[] visit, ArrayList<String> l) {
    //     if (s.length() == n) {
    //         l.add(s.toString());
    //         return;
    //     }
    //     for (int i = 1; i <= n; i++) {
    //         if (visit[i] == true)
    //             continue;
    //         visit[i] = true;
    //         s.append(i);
    //         func(n, s, visit, l);
    //         s.deleteCharAt(s.length() - 1);
    //         visit[i] = false;
    //     }


        StringBuilder ans = new StringBuilder();
        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 1; i <= n; i++)
            l.add(i);
        int f = 1;
        for (int i = 1; i < n; i++)
            f *= i;
        k -= 1;
        while (n > 0) {
            int i = k / f;
            ans.append(l.get(i));
            l.remove(i);
            n -= 1;
            k %= f;
            if (n != 0)
                f /= n;
        }
        return ans.toString();
    }
}