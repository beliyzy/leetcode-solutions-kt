class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    helper(grid, i, j);
                }
            }
        }

        return count;
    }

    private void helper(char[][] grid, int x, int y) {
        if (x < 0 
        || x >= grid.length 
        || y >= grid[x].length 
        || y < 0
        || grid[x][y] == '0') {
            return;
        }
        
        grid[x][y] = '0';

        helper(grid, x + 1, y);
        helper(grid, x - 1, y);
        helper(grid, x, y + 1);
        helper(grid, x, y - 1);
    }
}