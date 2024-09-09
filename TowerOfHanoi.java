
    // Tower of Hanoi
// Only one disk can be moved at a time
// A larger disk cannot be placed on smaller disk

import java.util.Scanner;

public class TowerOfHanoi {
    static void toweOfHanoi(int n, char src, char aux, char dest){
        if(n == 1){
            System.out.println(src+" --> "+dest);
            return;
        }
        toweOfHanoi(n-1,src,dest,aux);
        toweOfHanoi(1,src,aux,dest);
        toweOfHanoi(n-1,aux,src,dest);
    }
    public static void main(String[] args) {
        System.out.println("Enter how many number of disk are there ");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        toweOfHanoi(n,'A','B','C');
    }
}

