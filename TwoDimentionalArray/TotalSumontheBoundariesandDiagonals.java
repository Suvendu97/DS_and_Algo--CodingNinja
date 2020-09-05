//Total Sum on the Boundaries and Diagonals

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int M = sc.nextInt();
    int[][] arr = new int[M][M];
    for (int row = 0; row < M; row++) {
        for (int col = 0; col < M; col++) {
            arr[row][col] = sc.nextInt();
        }
    }
    int boundrySum = 0, requiredSum = 0;
    for (int row = 0; row < M; row++) {
        for (int col = 0; col < M; col++) {
            if (row == 0 || col == 0 || row == M - 1 || col == M - 1) {
                boundrySum = boundrySum + arr[row][col];
            }
        }
    }
    int diagonal1Sum = 0, diagonal2Sum = 0;
    for (int row = 0; row < M; row++) {
        for (int col = 0; col < M; col++) {
            if (row == col)
                diagonal1Sum = diagonal1Sum + arr[row][col];

            else if ((row + col) == (M - 1))
                diagonal2Sum = diagonal2Sum + arr[row][col];
        }
    }
    requiredSum = boundrySum + diagonal1Sum + diagonal2Sum
            - (arr[0][0] + arr[0][M - 1] + arr[M - 1][0] + arr[M - 1][M - 1]);
    System.out.println(requiredSum);
	}
}