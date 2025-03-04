package ch5_array;

import java.util.Scanner;

public class ArrayEx16 {
    public static void main(String[] args) {
        String[][] words= { 
            {"chair", "의자"},
            {"computer", "컴퓨터"},
            {"integer", "정수"}
        };

        Scanner sc =new Scanner(System.in);

        
        // 01. chair 의 뜻은? 의자입
        //정답입니다 (words[0][1].equals(사용자 입력값) )
        //02 . computer 의 뜻은? 의자
        //틀렸습니다.정답은 컴퓨터입니다
        //01. words [0][0] 의 뜻은? 의자입니다
        //02. words [1][0]
        //03 words
     for (int i = 0; i < words.length; i++) {
        System.out.printf("Q%d, %s 의 뜻은?", i+1, words[i][0]);
        
     //사용자 입력
     String input =sc.nextLine();
     if(input.equals(words[i][1])){
        System.out.println("정답입니다");
     } else {
        System.out.printf("틀렸습니다. 정답은 %s 입니다.\n", words[i][1]);

     }

     }
        



        }
     }
        
       
        



    

