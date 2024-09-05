
import java.util.Scanner;
class ReverseAString{
    static String reverseString(String s, String r, int i){
        if(i < 0){
            return r;
        }
         return reverseString(s,r+s.charAt(i), i-1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.nextLine();
        System.out.println(reverseString(s,"",s.length()-1));
    }
}

