
// Check if Two Strings are Anagrams*
// - *Problem*: Write a program to check if two given strings are anagrams of each other.
// - *Sample Input*: "listen", "silent"
// - *Sample Output*: True



import java.util.Arrays;

public class Anagram {
    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; 
        }

        char[] str1Array = str1.toLowerCase().toCharArray();
        char[] str2Array = str2.toLowerCase().toCharArray();

        Arrays.sort(str1Array);
        Arrays.sort(str2Array);

        return Arrays.equals(str1Array, str2Array);
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(areAnagrams(str1, str2)); // Output: true
    }
}
