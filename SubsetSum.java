// write a program to find the subset sum 


import java.util.Scanner;

class SubsetSum{
    static boolean subsetSum(int[] s, int sum){
        boolean[] bl = new boolean[sum+1];
        bl[0] = true;

        for(int x : s){
            for(int i = sum; i>= x; i--){
                if(bl[i-x]){
                    bl[i] = true;
                }
            }
        }
        return bl[sum];
    }

    public static void main(String[] args){
        int[] a = {3,4,5,3,8,9,7};
        System.out.println("\nEnter the sum you want to find");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean result = subsetSum(a,num);
        System.out.println("Subset sum "+num+ ""+(result ? " exists " : " not exists"));
    }
}
