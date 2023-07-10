// A recursive solution for subset sum
/*Write a program to find a subset of a given set S = {Sl, S2,.....,Sn} of n positive
integers whose SUM is equal to a given positive integer d. For example, if S ={1, 2,
    5, 6, 8} and d= 9, there are two solutions {1,2,6}and {1,8}. Display a suitable
    message, if the given problem instance doesn't have a solution.*/
import java.io.*;
class Week9 {
	static boolean isSubsetSum(int set[], int n, int sum)
	{
		if (sum == 0)
			return true;
		if (n == 0)
			return false;
		if (set[n - 1] > sum)
			return isSubsetSum(set, n - 1, sum);

		return isSubsetSum(set, n - 1, sum)
			|| isSubsetSum(set, n - 1, sum - set[n - 1]);
	}

	public static void main(String args[])
	{
		int set[] = { 3, 34, 4, 12, 5, 2 };
		int sum = 9;
		int n = set.length;
		if (isSubsetSum(set, n, sum) == true)
			System.out.println("Found a subset"
							+ " with given sum");
		else
			System.out.println("No subset with"
							+ " given sum");
	}
}

/* This code is contributed by Rajat Mishra */
