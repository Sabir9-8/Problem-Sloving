package JAVA;
import java.util.Scanner;
public class Array2D
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Array array = new Array();
		array.arrayInputOutput(scanner);
		scanner.close();
	}
}

class Array
{   
    int n; int m;
    void arrayInputOutput(Scanner scan)
    {   
        System.out.println("Enter the number of Classrooms:");
        n = scan.nextInt();
        System.out.println("Enter the number of Students:");
        m = scan.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Enter the marks of student" + (j + 1) + "in classroom-" + (i + 1) + ":");
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.println("The marks are:");
        for (int i = 0; i < n; i++) {
            System.out.println("Classroom-" + (i + 1) + ":");
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
