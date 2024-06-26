import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

public class ReverseWordsInLine {

    private static final Logger logger = Logger.getLogger(ReverseWordsInLine.class.getName());

    public static void main(String[] args) {

        String inputFile = "D:/Assesment No.1/Task1/files/input.txt";
        String outputFile = "D:/Assesment No.1/Task1/files/output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String wordLine;
            while ((wordLine = reader.readLine()) != null) {
                String reversedwordLine = reverse(wordLine);
                writer.write(reversedwordLine);
                writer.newLine();
            }
            logger.info("Words In file reversed successfully ");
        }catch (IOException e) {
            logger.warning("Error Occurs: " + e.getMessage());
        }
    }

    private static String reverse(String s){
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            sb.append(reverseWord(arr[i])+" ");
        }
        return sb.toString().trim();
    }
    private static String reverseWord(String word) {
        StringBuilder sb = new StringBuilder();
        char ch=' ';
        for (int i=word.length()-1;i>=0;i--) {
            char wordChar = word.charAt(i);
            if ((wordChar>='a'&& wordChar<='z')||(wordChar>='A'&& wordChar<='Z')) {
                sb.append(wordChar); 
            } else {
                ch=wordChar;
            }
        }
        sb.append(ch);
        return sb.toString();
    }

}
