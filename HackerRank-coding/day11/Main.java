package com.test.work;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String args[]){

		int A[][] = new int[6][6];
		System.out.println("Insert Array:");
		for(int i=0; i<6; i++){
			A[i]= Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::valueOf).toArray();

		}
		
		for(int k=0; k<6; k++) {
			for(int l=0; l<6; l++) {
				System.out.print(A[k][l]);
			
			}
			System.out.println();
		}
		
		int count1 = 0;
		int count2 = 0;
		int max = 0;
		for(int i=0; i<6; i++) {
			
			for(int j=0; j<6; j++) {
				
				if(i<3) {
					if(i%2==0) {
						if(j<3) count1 +=A[i][j];
						else count2 +=A[i][j];
					}else {
						if(j<3) {
							count1 +=A[i][1];
							j = 2;
						}
						else {
							count2 +=A[i][4];
							j = 5;
						}
					}
					if(i==2 && j==5) {
						if(count1>=count2) max = count1;
						else max = count2;
						System.out.println(count1+ " " + count2+ " "+max);
						count1=0; count2=0;
					}
				}else {
					if(i%2!=0) {
						if(j<3) count1 +=A[i][j];
						else count2 +=A[i][j];
					}else {
						if(j<3) {
							count1 +=A[i][1];
							j = 2;
						}
						else {
							count2 +=A[i][4];
							j = 5;
						}
					}
				}
				if(i==5 && j==5) {
					if(count1>=count2) {
						if(count1>=max) max = count1;
					}else {
						if(count2>=max) max = count2;
					}	
					System.out.println(count1+ " " + count2+ " "+max);
				}
				
			}
			
		}
		
	}

}
