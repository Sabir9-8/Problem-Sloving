package JAVA;
import java.util.Scanner;
public class Array4D
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
    int n; int m; int s; int t;
    void arrayInputOutput(Scanner scan)
    {   
        System.out.println("Enter the number of City:");
        n = scan.nextInt();
        System.out.println("Enter the number of Schools:");
        m = scan.nextInt();
        System.out.println("Enter the number of Classrooms:");
        s = scan.nextInt();
        System.out.println("Enter the number of Students:");
        t = scan.nextInt();
        int[][][][] arr = new int[n][m][s][t];
        System.out.println("Enter the marks of the students:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k  = 0; k < s; k++) {
                    for (int l = 0; l < t; l++) {
                        arr[i][j][k][l] = scan.nextInt();
                    }
                }
            }
        }
        System.out.println("The marks are:");
        for (int i = 0; i < n; i++) {
            System.out.println("City-" + (i + 1) + ":");
            for (int j = 0; j < m; j++) {
                System.out.println("School-" + (j + 1) + ":");
                for (int k = 0; k < s; k++) {
                    System.out.println("Classroom-" + (j + 1) + ":");
                    for (int l = 0; l < t; l++) {
                        System.out.print(arr[i][j][k][l] + " ");
                    }
                    System.out.println();
                }
            }
            
        }
    }
}
