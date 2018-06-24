package 滴滴_地下迷宫;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    private static int m, n;
    private static int p;
    private static int[][] grid;
    private static int minCost;
    private static List<Position> curPath;
    private static String path;
    private static final int[][] shift = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    private static final int[] costs = {1, 1, 3, 0};

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        p = in.nextInt();
        minCost = Integer.MAX_VALUE;
        curPath = new ArrayList<>();
        grid = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = in.nextInt();
            }
        }
        dfs(0, 0, 0);
        System.out.println(path == null ? "Can not escape!" : path);
    }

    private static void dfs(int x, int y, int cost)
    {
        if (x < 0 || x >= n || y < 0 || y >= m || cost > p || grid[x][y] == 0) {
            return;
        }
        grid[x][y] = 0;
        curPath.add(new Position(x, y));
        if (x == 0 && y == m - 1) {
            if (cost < minCost) {
                minCost = cost;
                path = "";
                for (int i = 0; i < curPath.size(); i++) {
                    Position position = curPath.get(i);
                    path += "[" + position.x + "," + position.y + "]";
                    if (i != curPath.size() - 1) path += ",";
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            dfs(x + shift[i][0], y + shift[i][1], cost + costs[i]);
        }
        curPath.remove(curPath.size() - 1);
        grid[x][y] = 1;
    }

    private static class Position
    {
        int x, y;

        Position(int x, int y)
        {
            this.x = x;
            this.y = y;
        }
    }
}
