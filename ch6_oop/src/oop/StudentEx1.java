package oop;

public class StudentEx1 {
    public static void main(String[] args) {
        //Stundent 인스턴스 생성,사용
        //인스턴스 생성 시 생성자를 사용함
        Student student1 = new Student(); //student 파일안에있는 생성자를 가지고온다
        Student student2 = new Student(1, 5);
        Student student3 = new Student("s1234567", "홍길동", 2, 3, "010-1234-1234", "hong1206@gmail.com");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);


        

    }
    
}
