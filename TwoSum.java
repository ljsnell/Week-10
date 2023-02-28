import java.util.Scanner;

public class TwoSum {
	static public int[] twoSum(int[] nums, int target) {
		int[] indices = { 0, 0 };
		int i, j;
		int size = nums.length;
		for (i = 0; i < size; i++) {
			for (j = i + 1; j < size; j++) {
				if (nums[i] + nums[j] == target) {
					indices[0] = i;
					indices[1] = j;
				}
			}
		}
		return indices;
	}

	static Scanner userinput = new Scanner(System.in);

	public static void main(String[] args) {
		int[] myNums = {3,6,12,13,15,20,22,36,41,42};
		int myTarget = 51;
		int[] myIndices = twoSum(myNums,myTarget);
		System.out.println("I found the sum " + myTarget + " = " + myNums[myIndices[0]] + " + " + myNums[myIndices[1]]);
	}
