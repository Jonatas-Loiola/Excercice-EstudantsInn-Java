package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Room;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Room[] vect = new Room[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();

		System.out.println();
		
		for (int i=0; i<n; i++) {
			sc.nextLine();
			System.out.println("Room #" + (i+1));
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vect[room] = new Room(name, email);
			
		}
		
		for(int i=0; i<vect.length; i++) {
			if(vect[i] != null) {
			System.out.println(i+","+vect[i]);
			}
		}		
		sc.close();
	}
}
