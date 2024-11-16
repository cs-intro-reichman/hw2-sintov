// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	   int num = Integer.parseInt(args[0]);
	   double approxPi = 1;
	   double divider = 3;
	   for (int i = 0; i < num - 1; i++){
		if (i % 2 == 0){
			approxPi = approxPi - (1.0 / divider);
		} else {
			approxPi = approxPi + (1.0 / divider);
		}
		divider += 2;
	   }

	   System.out.println("pi according to Java: " + Math.PI);
	   System.out.println("pi, approximated:     " + (approxPi * 4.0));
	}
}
