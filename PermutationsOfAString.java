class PermutationsOfAString{
    
    public static void main(String[] args) {
        String input = "abcdef";
        permutation(input,0,input.length()-1);
    }
    static void permutation(String input, int left, int right) {
        if (left == right) {
            System.out.println(input);
        }
        else {
            for (int i = left; i <= right; i++) {
                input = swap(input, left, i);
                permutation(input, left + 1, right);
                input = swap(input, left, i); // backtrack
            }
        }
    }

    static String swap(String input, int i, int j) {
        char[] chars = input.toCharArray();
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        return new String(chars);
    }
}