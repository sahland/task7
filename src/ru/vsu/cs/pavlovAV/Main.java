package ru.vsu.cs.pavlovAV;

public class Main {

    public static void main(String[] args) {
        int[] arr1 = {5, 10, 22, 45, 3};
        int[] arr2 = {0, 0, 0, 0, 0, 0};
        int[] arr3 = {-5, 21, -251, -1,5, 16};
        int[] arr4 = {-2, -4, -6, -1, -1, -3};
        int[] arr5 = {3000000, 12345, 63456, 546777, 644, 2};
        int[] arr6 = {-1, 5628392, 42321, -21262, -12354, 6223, 943323};
        int[] arr7 = {97, 91, 84, 56, 23, 21};
        int[] arr8 = {18};
        int[] arr9 = {1, 3, -2, 11, 7, 3, 3, 2, 4, 2, -7, 12};

        System.out.println("sum arr = " + solution(arr9));
    }
    public static int solution(int[] array) {
        int indexOfMax = 0;
        int indexOfMin = 0;
        int sum = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[indexOfMin]) {
                indexOfMin = i;
            }
        }
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] == indexOfMin) {
                indexOfMin = i;
                break;
            }
        }

        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[indexOfMax]) {
                indexOfMax = i;
                break;
            }
        }

        for (int i = indexOfMax + 1; i < indexOfMin; i++) {
            sum += array[i];
        }
        return sum;

    }
}
