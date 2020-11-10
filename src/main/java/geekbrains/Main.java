package geekbrains;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] testArray = {1, 2, 2, 3, 1, 7, 4};
        int[] testArray2 = {1, 1, 1, 1};
        int[] testArray3 = {1, 4, 1, 4, 1};
        System.out.println(Arrays.toString(arrayTest1(testArray)));
        System.out.println(Arrays.toString(arrayTest1(testArray3)));
        System.out.println(arrayTest2(testArray));
        System.out.println(arrayTest2(testArray2));
        System.out.println(arrayTest2(testArray3));
    }

    public static int[] arrayTest1 (int[] arr) throws RuntimeException {
        int[] arrBack = new int[0];
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[arr.length - 1] == 4) {
                return arrBack;
            }
            if (arr[i] == 4) {
                arrBack = Arrays.copyOfRange(arr, i + 1, arr.length);
                break;
            }
        }
        if(arrBack.length > 0) {
            return arrBack;
        } else {
            throw new RuntimeException("В массиве нет четверок");
        }
    }

    public static boolean arrayTest2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1 || arr[i] == 4) {
                continue;
            } else {
                return false;
            }
        }
        if (Arrays.binarySearch(arr, 1) < 0) {
            return false;
        } else if (Arrays.binarySearch(arr, 4) < 0) {
            return false;
        } else {
            return true;
        }
    }
}
