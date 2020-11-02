import java.util.ArrayList;
public class BasicJava {
    public static void OneTo255() {
		for(int i = 0; i <= 255; i++)
			System.out.println(i);
    }
    public static void PrintOdds() {
        for (int i= 0; i <= 255; i++)
            if (i % 2 == 1)
            System.out.println(i);
    }
    public static void PrintSum() {
        int sum = 0;
        for (int i = 0; i <= 255; i++) {
            sum += i;
            System.out.println(String.format("New number: %d,Sum: %d", i, sum));
        }
    }
    public static void main(String[] args) {
        // OneTo255();
        // PrintOdds();
        // PrintSum();
       int[] nums = {1,3,4,7,9,13};
        // LoopArray(nums);
        // FindMax(nums);
        // GetAvg(nums);
        // OddArray();
    }
   public static void LoopArray(int[] arr) {
        for(int val: arr)
           System.out.println(val);
    }

    public static int FindMax(int[] arr) {
        int currMax = Integer.MIN_VALUE;
        for(int val: arr){
            if(val > currMax)
                currMax = val;
        }
        return currMax;
    }
    public static int FindMin(int[] arr) {
        int currMax = Integer.MAX_VALUE;
        for(int val: arr){
            if(val < currMin)
                currMin = val;
        }
        return currMin;
    } 
    public static int GetArraySum(int[] numbers) {
        int sum = 0;
        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }
    public static double GetAvg(int[] nums) {
        int sum = GetArraySum(nums);
        double avg =(double)sum/nums.length;
        System.out.println(String.format("Sum:%d, Average: %f",sum, avg));
        return avg;
    }
    public static ArrayList<Integer> OddArray() {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for(int i = 0; i <=255; i++) {
            if(i % 2 !=0)
                nums.add(i);
        }
        return nums;
    }
    public static int GreaterThanY(int[] arr, int y) {
        int count = 0;
        for(int num:arr) {
            if(num > y)
                count++;
        }
        return count;
    } 
    public static void SquareArray(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums [i];
        }
        System.out.println(nums);
    }
    public static void EliminateNegatives(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < 0)
                nums[i] = 0;
        }
    }
    public static void MaxMinAverage(int[] nums) {
		int min = FindMin(nums);
		int max = FindMax(nums);
		double avg = GetAverage(nums);
		System.out.println(String.format("Max: %d, Min: %d, Average: %f", max, min, avg));
    }
}
	
