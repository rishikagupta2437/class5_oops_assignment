package class5;

import java.util.Scanner;

public class subarray {
	
	public static void main(String[] args) {
			
			Scanner scan=new Scanner(System.in);
			System.out.println("No. of elements in array:");
			int size=scan.nextInt();
			int arr[]=new int[size];
			System.out.println(+size+" Elements :");
			for(int a=0;a<size;a++) {
				arr[a]=scan.nextInt();
			}
			int count=1;
			int arry[]=new int[size];
			int max=0;
			for(int a=0;a<size-1;a++) {
				if(arr[a]<arr[a+1]) {
					count=count+1;
					if(max<count) {
					max=count;
					}
				}
				if(arr[a]>arr[a+1]) {
					count=0;
					continue;
				}
				
			}
			System.out.print("length of array is :"+max);
			
		}
	}
		
		
	


