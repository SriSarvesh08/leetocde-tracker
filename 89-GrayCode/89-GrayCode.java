// Last updated: 7/8/2026, 3:37:59 PM
class Solution {
    public List<Integer> grayCode(int n) {
    List<Integer> result = new LinkedList<>();
    for (int i = 0; i < 1<<n; i++) result.add(i ^ i>>1);
    return result;
}
}