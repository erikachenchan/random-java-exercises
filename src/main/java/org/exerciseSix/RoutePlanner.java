package org.exerciseSix;

public class RoutePlanner {
    public static boolean routeExists(int fromRow, int fromColumn, int toRow, int toColumn,
                                      boolean[][] mapMatrix) {
        // Check if the destination is outside the map or if it's a blocked road
        if (toRow < 0 || toRow >= mapMatrix.length || toColumn < 0 || toColumn >= mapMatrix[0].length || !mapMatrix[toRow][toColumn]) {
            return false;
        }

        // If the destination is the same as the starting point, we have found a route
        if (fromRow == toRow && fromColumn == toColumn) {
            return true;
        }

        // Mark the current location as visited
        mapMatrix[toRow][toColumn] = false;

        // Check adjacent cells (up, down, left, and right)
        boolean up = routeExists(fromRow, fromColumn, toRow - 1, toColumn, mapMatrix);
        boolean down = routeExists(fromRow, fromColumn, toRow + 1, toColumn, mapMatrix);
        boolean left = routeExists(fromRow, fromColumn, toRow, toColumn - 1, mapMatrix);
        boolean right = routeExists(fromRow, fromColumn, toRow, toColumn + 1, mapMatrix);

        // If any of the adjacent cells have a route to the destination, return true
        if (up || down || left || right) {
            return true;
        }

        return false;  // If no route found in any direction
    }

    public static void main(String[] args) {
        boolean[][] mapMatrix = {
                {true, false, false},
                {true, true, false},
                {false, true, true}
        };

        System.out.println(routeExists(0, 0, 2, 2, mapMatrix)); // Should print true
    }
}
