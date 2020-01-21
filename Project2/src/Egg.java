import java.util.ArrayList;
import java.util.Arrays;

public class Egg {
	String utensil;
	short timer;
	int numOfEggs;
	static ArrayList<String> type = new ArrayList<String>(Arrays.asList("Jezve", "Can", "Pot"));

	public Egg(int numberEggs) {
		this.numOfEggs = numberEggs;
	}

	public void chooseUtensil(int numOfEggs) throws InterruptedException {
		if (numOfEggs == 1) {
			System.out.println("The utensil chosen for " + numOfEggs + " eggs is a " + type.get(0) + "!");
			utensil = type.get(0);
		}
		if (numOfEggs == 2) {
			System.out.println("The utensil chosen for " + numOfEggs + " eggs is a " + type.get(1) + "!");
			utensil = type.get(1);
		}
		if (numOfEggs > 2) {
			System.out.println("The utensil chosen for " + numOfEggs + " eggs is a " + type.get(2) + "!");
			utensil = type.get(2);
		}
		timer+=2;
		Thread.sleep(2000);
	}

	public void wash() throws InterruptedException {
		System.out.println("The eggs are being washed!");
		timer+=4;
		Thread.sleep(4000);
	}

	public void putEggsInUtensil() throws InterruptedException {
		switch (utensil) {
		case "Jezve":
			System.out.println("The eggs are in the jezve!");
			break;
		case "Can":
			System.out.println("The eggs are in the can!");
			break;
		case "Pot":
			System.out.println("The eggs are in the pot!");
		}
		timer+=2;
		Thread.sleep(2000);
	}

	public void sink() throws InterruptedException {
		System.out.println("The eggs are submerged in water now!");
		timer+=2;
		Thread.sleep(2000);
	}

	public void countEggs() throws InterruptedException {
		if (this.numOfEggs <= 0) {
			System.out.println("Put some eggs!");
		} else 	System.out.println("You have put " + this.numOfEggs + " eggs in the machine!");
		timer+=1;
		Thread.sleep(1000);
	}

	public void softBoil() throws InterruptedException {
		for (int i = 1; i <= 3; i++) {
			System.out.print(" *");
			timer+=1;
			Thread.sleep(1000);
		}
		System.out.println("\nThe eggs are Soft-Boiled!");
	}

	public void mediumBoil() throws InterruptedException {
		for (int i = 1; i <= 5; i++) {
			System.out.print(" *");
			timer+=1;
			Thread.sleep(1000);
		}
		System.out.println("\nThe eggs are Medium-Boiled!");
	}

	public void hardBoil() throws InterruptedException {
		for (int i = 1; i <= 10; i++) {
			System.out.print(" *");
			timer+=1;
			Thread.sleep(1000);
		}
		System.out.println("\nThe eggs are Hard-Boiled!");
	}
	public void coolEggs() throws InterruptedException{
		System.out.println("The eggs are being cooled!");
		timer+=1;
		Thread.sleep(2000);
	}
	public void peelEggs() throws InterruptedException{
		System.out.println("The eggs are being peeled!");
		timer+=3;
		Thread.sleep(3000);
	}
	public void timer() {
		System.out.println("Estimated time: "+timer+" minutes!");
	}
}
