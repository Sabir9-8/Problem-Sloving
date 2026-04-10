package JAVA;

import java.util.Scanner;

public class ArrayIntro
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
    int n;
    void arrayInputOutput(Scanner scan)
    {   
        System.out.println("Enter the number of Students:");
        n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the marks of student-"+(i+1) + ":");
            arr[i] = scan.nextInt();
        }
        System.out.println("The marks are:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
