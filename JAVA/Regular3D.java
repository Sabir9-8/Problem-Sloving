package JAVA;
import java.util.Scanner;
public class Array3D
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
    int n; int m; int s;
    void arrayInputOutput(Scanner scan)
    {   
        System.out.println("Enter the number of Schools:");
        n = scan.nextInt();
        System.out.println("Enter the number of Classrooms:");
        m = scan.nextInt();
        System.out.println("Enter the number of Students:");
        s = scan.nextInt();
        int[][][] arr = new int[n][m][s];
        System.out.println("Enter the marks of the students:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k  = 0; k < s; k++) {
                    arr[i][j][k] = scan.nextInt();
                }
            }
        }
        System.out.println("The marks are:");
        for (int i = 0; i < n; i++) {
            System.out.println("School-" + (i + 1) + ":");
            for (int j = 0; j < m; j++) {
                System.out.println("Classroom-" + (j + 1) + ":");
                for (int k = 0; k < s; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            
        }
    }
}
