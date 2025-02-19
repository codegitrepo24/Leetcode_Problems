import java.util.Scanner;

class Two_Sums {
    public int[] twoSums(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {}; // No pair found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the number of test cases: ");
        int t = sc.nextInt();
        while (t-- > 0) {
            System.out.println("Enter the terms of the array: ");
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            System.out.println("Enter the target sum: ");
            int target = sc.nextInt();
            Two_Sums obj = new Two_Sums();
            int[] result = obj.twoSums(nums, target);
            if (result.length == 0) {
                System.out.println("No pair found for the given target.");
            } else {
                System.out.println("The indices of the two numbers are: ");
                for (int i = 0; i < result.length; i++) {
                    System.out.print(result[i] + " ");
                }
            }
            sc.close();
        }
    }
}