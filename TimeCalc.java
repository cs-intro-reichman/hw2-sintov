public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
	    int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutesToAdd = Integer.parseInt(args[1]);

        int totalMinutes = (hours * 60) + minutes + minutesToAdd;
        int newHours = (totalMinutes / 60) % 24;
        int newMinutes = totalMinutes - ((totalMinutes / 60) * 60);

        String hoursToPrint = String.valueOf(newHours);
        String minutesToPrint = String.valueOf(newMinutes);

        if (newHours < 10) {
            hoursToPrint = "0" + hoursToPrint;
        }
        if (newMinutes < 10) {
            minutesToPrint = "0" + minutesToPrint;
        }

        System.out.println(hoursToPrint + ":" + minutesToPrint);

        



    }
}
