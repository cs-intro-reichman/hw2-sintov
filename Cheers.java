// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
            String anLetters = "AEFHILNMNOR";
            String crowdWord = args[0].toUpperCase();
            int numberOfTimes = Integer.parseInt(args[1]);
            for (int i = 0; i < crowdWord.length(); i++){
                char letter = crowdWord.charAt(i);
                if (anLetters.indexOf(letter) > 0){
                        System.out.println("Give me an " + letter + ": " + letter + "!");        
                } else {
                        System.out.println("Give me a " + letter + ": " + letter + "!");
                }
            }
            System.out.println("What does that spell?");
            for (int i =0; i < numberOfTimes; i++){
                System.out.println(crowdWord + "!!!");
            }
        }
}
