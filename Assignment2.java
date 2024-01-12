package Week2.day3;
public class Assignment2 {
    public static void main(String[] args) {
       
        String text = "We learn Java basics as part of java sessions in java week1";

        
        String[] words = text.split("\\s+");
        int c = 0;

        
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
               
                if (words[i].equalsIgnoreCase(words[j])) {
                    words[j] = ""; // Replace duplicate with empty string
                    c++;
                }
            }
        }

        // duplicate finding
        if (c > 0) {

            System.out.println("Modified Sentence with Duplicates Removed:");
            for (String word : words) {
                System.out.print(word + " ");
            }
        } else {
           
            System.out.println("No duplicates found in the sentence.");
        }
    }
}
