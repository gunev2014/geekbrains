package DZ3;

import java.util.Scanner;

public class HomeWorkApp3 {
    public static void main(String[] args) {
        arr1();
        arr2();
        System.out.println();
        arr3();
        System.out.println();
        arr4();
        arr5();
    }

    public static void arr1() {
        int[] arr1 = {1, 0, 1, 1, 0, 0, 0, 1};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0) {
                arr1[i] = 1;
            } else {
                arr1[i] = 0;
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);

        }
    }

    public static void arr2() {
        int[] arr2 = new int[101];
        System.out.println(arr2.length);
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i;
            System.out.print(arr2[i] + " ");
        }

    }

    public static void arr3() {
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] = arr3[i] * 2;
            }

        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }


    }

    public static void arr4() {
        int[][] arr4 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            arr4[i][i] = 2;
        }

        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4.length; j++) {
                System.out.print(arr4[i][j]);

            }
            System.out.println("");
        }
    }

    public static void arr5() {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int value = scanner.nextInt();

        int[] arr5 = new int[len];
        for (int i = 0;i<arr5.length;i++) {
            arr5[i] = value;
        }
        for (int i = 0;i<arr5.length;i++) {
            System.out.print(arr5[i]+ " ");
        }
    }
}

