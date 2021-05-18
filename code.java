package LabExcercise;

import java.util.Scanner;

public class hashmap_table {

	public static void main(String[] args) {
		System.out.println("KISHORE");
		int arr[] = new int[10];
		Scanner input = new Scanner(System.in);
		int number;
		do {
			System.out.println("Enter the number : ");
			number = input.nextInt();
			int temp = number%10;
			if(number!=0) {		
				if(arr[temp]!=0) {
					while(arr[temp]!=0) {
						if(arr[temp] != 0 && temp==arr.length-1) {
							System.out.println("k");
							int temparr[] = new int[arr.length*2];
							System.arraycopy(arr, 0, temparr, 0, arr.length);
							arr = temparr;
							System.out.println("Array size "+arr.length);
						}
						else
							temp++;
					}
					arr[temp] = number;
				}
				else
					arr[temp] = number;
			}
		}while(number!=0);
		
		System.out.println("Enter the key number : ");
		int number1 = input.nextInt();
		int temp1 = number1%10;
		int flag = 0;
		for(int i = temp1;i<arr.length;i++) {
			if(number1==arr[i])
			{
				System.out.println("Your number : "+arr[i]+" index : "+i);
				flag = 1;
				break;
			}		
		}
		if(flag <= 0) {
			System.out.println("Enter valid number");
		}
	}
}
