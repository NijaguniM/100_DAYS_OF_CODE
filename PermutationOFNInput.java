import java.util.*;
public class PermutationOFNInput {
    /*
given a String, print all the permutations of a String.
 
input : The first line of input contains an integer T denoting the number of test cases. 
Each test case contatin a single string in capital letter. 

output: Print all permutations of a given string with single space and all permutations
 should be in lexicographically increasing order. Omit duplicates. 
 
 constraints :
  1 <= T <= 10 
  1 <= size of string <= 5 
 
 sample input :
 2 
 ABC 
 ABSG 
 
 sample output : 
 ABC ACB BAC BCA CAB CBA 
 ABGS ABSG AGBS AGSB ASBG ASGB ASGB BAGS BASG BGA... */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            String str = scanner.next();
            permutation(str);
            System.out.println();
        }
    }

    public static void permutation(String str) {
        Set<String> permutations = new TreeSet<>();
        permutation(str, 0, str.length() - 1, permutations);
        for (String perm : permutations) {
            System.out.print(perm + " ");
        }
    }

    private static void permutation(String str, int l, int r, Set<String> permutations) {
        if (l == r)
            permutations.add(str);
        else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permutation(str, l + 1, r, permutations);
                str = swap(str, l, i);
            }
        }
    }

    public static String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
