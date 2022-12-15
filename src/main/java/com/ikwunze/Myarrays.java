package com.ikwunze;

import java.util.Arrays;

public class Myarrays {
    public static void main(String[] args) {

        int[] arr = new int[6];
        arr[0] = 12;
        arr[1] = 224;
        arr[2] = 32;
        arr[3] = 442;
        arr[4] = 52;
        arr[5] = 62;



        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
