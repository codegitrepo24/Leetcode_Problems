import java.util.Scanner;

public class PalindromicString {
    public boolean isPalindrome(int x) {
    if(x<0 || (x % 10 == 0 && x != 0)){
        return false;
    }
    int revNum = 0;

    while(x>revNum){
        revNum = revNum *10 + x % 10;
        x /= 10;
    }

    return x == revNum || x == revNum/10;
     
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x = sc.nextInt();
        PalindromicString obj = new PalindromicString();
        boolean result = obj.isPalindrome(x);
        if (result) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
        sc.close();
    }
} 
    

