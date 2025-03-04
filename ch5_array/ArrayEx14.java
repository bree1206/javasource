package ch5_array;

public class ArrayEx14 {
    public static void main (String[] args) {
        int score[][] = {
            {100, 72, 89},
            {20, 30, 40},
            {55, 45, 80},
            {37, 45, 40},
            {89, 78, 65},
    };

    System.out.println("번호 국어 영어 수학 총점 평균");
    System.out.println("=================================");

    for (int i = 0; i < score.length; i++) {  // { 100, 72, 89}
        System.out.printf("%3d", i + 1);
        int sum =0; //개인별 총정
        float avg = 0.0f; //개인별 평균

        for (int j = 0; j < score[i].length; j++) 
            sum += score[i][j];
            //개인별 점수출력
            System.out.printf("%5d", i + 1);
            for (int j = 0; j < score[i].length; j++) {

                avg = sum / (float) score[i].length;
        System.out.printf("%5d %5.1f\n", sum, avg);
                
            }
    }

    
            
        
        // 개인별 평균 계산후 출력
        System.out.println("=================================");
}
   
}

