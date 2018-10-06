package com.test.work;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String args[]) {

		int A[][] = new int[6][6];
		System.out.println("Insert Array:");
		for (int i = 0; i < 6; i++) {
			A[i] = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::valueOf).toArray();

		}

		for (int k = 0; k < 6; k++) {
			for (int l = 0; l < 6; l++) {
				System.out.print(A[k][l]+" ");

			}
			System.out.println();
		}
		int frame[][] = new int[3][3];
		int max = Integer.MIN_VALUE;
		System.out.println(max);
		for (int start_ver = 0; start_ver < 4; start_ver++) {

			for (int start_hor = 0; start_hor < 4; start_hor++) {
				int frame_sum = 0;
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						frame[i][j] = A[start_ver + i][start_hor + j];
						System.out.print(frame[i][j]);
						if (i % 2 == 0)
							frame_sum += frame[i][j];
						else {
							if (j % 2 == 1)
								frame_sum += frame[i][j];
						}
					}
					System.out.println();
				}
				if (frame_sum > max)
					max = frame_sum;
				System.out.println(frame_sum + " " + max);
				System.out.println();
				System.out.println();
			}
		}
		System.out.println(max);

	}

}
