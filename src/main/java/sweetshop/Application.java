package sweetshop;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Application {
	//SweetRepository sweetRepository = SweetRepository.getInstance();
	//UserInterface userInterface = UserInterface.getInstance();

	public void handleUserSelection(int choice) {
		SweetRepository sweetRepository = SweetRepository.getInstance();
		UserInterface userInterface = UserInterface.getInstance();

		Set sweetSet = sweetRepository.getSweetList();
		switch (choice) {
			case 1:
				addSweet();
				break;
			case 2:
				System.out.println("enter Sweet name which you want to delete");
				Scanner scanner = new Scanner(System.in);
				String sweetName = scanner.next();
				Sweet sweet = sweetRepository.getSweet(sweetName);
				sweetRepository.delete(sweet);
				break;
			case 3:
				break;
			case 4:
				userInterface.print(sweetSet);
				break;
			case 5:
				System.out.println("\nPrinting IDietSweet\n");
				userInterface.printDietSweets(sweetSet);
				break;
			case 6:
				System.out.println("\nPrinting INormalSweet\n");
				userInterface.printNormalSweets(sweetSet);
				break;
			case 7:
				break;
			default:
				System.out.println("Enter correct choice");
		}
	}
		public void addSweet () {
			Modak modak = new Modak();
			modak.id = "m001";
			modak.price = 100;

			Jalebi jalebi = new Jalebi();
			jalebi.id = "j001";
			jalebi.price = 80;

			Laddu laddu = new Laddu();
			laddu.id = "l001";
			laddu.price = 65;

			Rasgulla rasgulla = new Rasgulla();
			rasgulla.id = "r001";
			rasgulla.price = 120;

			Peda peda = new Peda();
			peda.id = "p001";
			peda.price = 95;

			SweetRepository sweetRepository = SweetRepository.getInstance();
			sweetRepository.add(modak);
			sweetRepository.add(jalebi);
			sweetRepository.add(laddu);
			sweetRepository.add(rasgulla);
			sweetRepository.add(peda);

		}
		public static void main (String [] args){
			System.out.println("Welcome to Sweet Shop Management program");
			Application application = new Application();
			UserInterface userInterface = UserInterface.getInstance();

			int choice =0;
			while (choice != 7) {
				choice = userInterface.showUserMenu();
				application.handleUserSelection(choice);
			}
			System.out.println("Good Bye!......");

		}
	}
