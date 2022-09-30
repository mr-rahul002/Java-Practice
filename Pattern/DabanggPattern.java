import java.util.Scanner;

/*
 1 2 3 4 5 5 4 3 2 1
 1 2 3 4 * * 4 3 2 1
 1 2 3 * * * * 3 2 1
 1 2 * * * * * * 2 1      
 1 * * * * * * * * 1    
 
 
            row-col+1=1-1+1=1

 */

public class DabanggPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        while (row <= n) {
            int col = 1;
            // First triangle
            while (col <= n - row + 1) {
                System.out.print(col);
                col++;

            }
            // For star(2 triangle)
            int pt = row - 1;
            while (pt > 0) {
                System.out.print("*");
                pt--;
            }
            // for staar(3 triangle)
            int pt2 = row - 1;
            while (pt2 > 0) {
                System.out.print("*");
                pt2--;
            }
            // for 4 triangle
            int col1 = n - row + 1;
            while (col1 >= 1) {
                System.out.print(col1);
                col1--;
            }

            System.out.println();
            row++;
        }

        sc.close();

    }
}