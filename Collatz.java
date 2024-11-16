// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int highestSeed = Integer.parseInt(args[0]);
		String mood = args[1];
		int successCounter = 0;
		for (int i = 1; i <= highestSeed; i++){
			int counter = 1;
			int collatzNum = i;
			if (mood.equals("v")){
				System.out.print(collatzNum + " ");
			}
			do{
				if (collatzNum % 2 == 0){
					collatzNum = collatzNum / 2;
				} else{
					collatzNum = (collatzNum * 3) + 1;
				}
				if (mood.equals("v")){
					System.out.print(collatzNum + " ");
				}
				counter ++;
			}while (collatzNum != 1);
			if (mood.equals("v")){
				System.out.println("(" + counter + ")");
			}
			successCounter ++;
		}
		System.out.println("Every one of the first " + successCounter +
							 " hailstone sequences reached 1.");


	}
}
