package ch5_array;

import java.util.Arrays;

import javax.sound.midi.SysexMessage;

public class ArrayEx11 {
    public static void main(String[] args) {

        int[] score = {75, 88, 91, 33, 100, 55, 95};

        // 정렬 (오름차순),(내림차순)  : 메소드 이용
        
        for (int i = 0; i < score.length-1; i++) {
            for (int j = 0; j < score.length-1-i; j++) {
                if (score[j] > score[j+1]) {
                    int temp =score [j];
                    score[j] = score[j+1];
                    score[j+1] = temp;

                }
                
            }
            
        }
        System.out.println(Arrays.toString(score));
    

    }
}
