//   Count the Frequency of Each Character in a String*
// - *Problem*: Write a program to count the frequency of each character in a given string.
// - *Sample Input*: "programming"
// - *Sample Output*: {'p': 1, 'r': 2, 'o': 1, 'g': 2, 'a': 1, 'm': 2, 'i': 1, 'n': 1}


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

class CharFrequency {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String input = sc.nextLine();
        Map<Character, Integer> charFrequency = countCharFreq(input);
        System.out.println(charFrequency);
    }

    public static Map<Character, Integer> countCharFreq(String input) {
        Map<Character, Integer> charFrequency = new LinkedHashMap<>();
        for (char c : input.toCharArray()) {
            if (charFrequency.containsKey(c)) {
                int frequency = charFrequency.get(c) + 1;
                charFrequency.put(c, frequency);
            } else {
                charFrequency.put(c, 1);
            }
        }
        return charFrequency;
    }
}