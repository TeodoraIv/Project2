import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int button;
		int number = 0;
		String num;
		do {
			System.out.print("Please enter number of eggs(input only '0's, one 0 for each egg):  ");
			num = a.next();
			for (int i = 0; i < num.length(); i++) {
				if (num.charAt(i) == '0')
					number++;
			}
		} while (number <= 0);
		Egg egg = new Egg(number);
		try {
			egg.chooseUtensil(number);
			do {
				System.out.print("  ______________________________________________"
						+ "\n |                   * MENU *                   |   "
						+ "\n |   Please enter hardness of boiling(1/2/3):   |"
						+ "\n | 1: Soft-Boiled     - boiled for 3 minutes    |"
						+ "\n | 2: Medium-Boiled   - boiled for 5 minutes    |"
						+ "\n | 3: Hard-Boiled     - boiled for 10 minutes   | \n"
						+ " |______________________________________________|\n");
				button = a.nextInt();
			} while (button != 1 && button != 2 && button != 3);

			egg.countEggs();
			egg.wash();
			egg.putEggsInUtensil();
			egg.sink();
			switch (button) {
			case 1:
				egg.softBoil();
				break;
			case 2:
				egg.mediumBoil();
				break;
			case 3:
				egg.hardBoil();
			}
			char choice;
			do {
				System.out.print("  ______________________________________________"
						+ "\n |                   * MENU *                   |   "
						+ "\n |    Would you like your eggs cooled(y/n)?     |"
						+ "\n | Yes: Cool                                    |"
						+ "\n | No: Don't Cool                               | \n"
						+ " |______________________________________________|\n");
				choice = a.next().charAt(0);
			} while (choice != 'y' && choice != 'n');
			if (choice == 'y')
				egg.coolEggs();
			do {
				System.out.print("  ______________________________________________"
						+ "\n |                   * MENU *                   |   "
						+ "\n |    Would you like your eggs peeled(y/n)?     |"
						+ "\n | Yes: Peel                                    |"
						+ "\n | No: Don't Peel                               | \n"
						+ " |______________________________________________|\n");
				choice = a.next().charAt(0);
			} while (choice != 'y' && choice != 'n');
			if (choice == 'y')
				egg.peelEggs();
			Thread.sleep(1000);
			System.out.println("Your Boiled Eggs Are Ready!");
			Thread.sleep(1000);
			egg.timer();
		} catch (InterruptedException e) {
			System.out.println("Something went wrong!! Please Restart the Program!!!");
			e.printStackTrace();
		}

	}
}
