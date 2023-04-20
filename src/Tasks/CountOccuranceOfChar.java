package Tasks;

  
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOccuranceOfChar {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        Map<Character, Integer> charCountMap = new HashMap<>();

        
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            if (charCountMap.containsKey(c)) {
                
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                
                charCountMap.put(c, 1);
            }
        }

       
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }
}