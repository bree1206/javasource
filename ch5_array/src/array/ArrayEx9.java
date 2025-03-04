package array;

import java.util.Arrays;

public class ArrayEx9 

    public static void main(String[] args) 
        int[] numArr = new int[10];

        // numArr 0~9 초기화하기
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = i;
        }
    System.out.println(Arrays.toString(numArr));  // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9,]
    int a = 10, b = 15;
    // int temp= b;
    // b = a;
    // a= temp;

    for (int i = 0; i < 100; i++) {
    // 교환위치 임의 생성 : 0~9
    for (int j = 0; j < 100; j++) {
        int pos = (int) (Math.random() * 10);

        int temp = numArr[0];
        numArr[0] = numArr[pos];
        numArr[pos] = temp;

        System.out.println(Arrays. toString(numArr));



        
    }    

    

