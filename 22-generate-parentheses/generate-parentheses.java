class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        helper("", 0, 0, n, res);
        return res;
    }

    public void helper(String curr, int open, int closed, int n, List<String> memo) {
        if (curr.length() == 2 * n) {
            memo.add(curr);
            return;
        }

        if (open < n) {
            helper(curr + "(", open + 1, closed, n, memo);
        }

        if (closed < open) {
            helper(curr + ")", open, closed + 1, n, memo);
        }
    }
}