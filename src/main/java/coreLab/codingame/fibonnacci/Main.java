package coreLab.codingame.fibonnacci;

import java.util.Scanner;

public class Main {

	public static int fibonacci(int n) {

		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter le nbre  pour avoir sa valeur Fibonnaci  ");
		int x = sc.nextInt();

		System.out.println("Fibonnaci de " + x + " = " + fibonacci(x));
	}

}
