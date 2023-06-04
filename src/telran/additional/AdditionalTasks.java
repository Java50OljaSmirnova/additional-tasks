package telran.additional;

public class AdditionalTasks {
	public static int maxSubsequenceLength(int[] arr) {
		int res = 0;
		int count = 1;
		if(arr.length == 0) {
			count = 0;
		} else {
			for(int i = 0; i < arr.length - 1; i++) {
				if(arr[i] == arr[i+1]) {
					count++;
					if(count >= res) {
						res = count; 
					}
				} else {
					count = 1;
				}
			}
		}
		return  res > count ? res : count;
	}
	public static String toBinaryStr(int number) {
		int rem = 0;
		String res = "";
		do {
			rem = number % 2;
			number /= 2;
			res = rem + res;
		}while(number != 0);
		return res;
	}
}