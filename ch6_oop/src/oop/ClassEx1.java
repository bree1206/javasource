package oop;

import oop.Tv;

public class ClassEx1 {
    //OOP(Object Oriented Programming - 객체지향)
//재사용성 높음
// 코드의 관리가 용이함
// 신뢰성이 높은 프로그램 작성

// 기본코드 단위가 클래스다:객체를 정의,설계도,틀
// 클래스 목적:객체 생성용도 

//객체 : 사물,개념(수학공식)
// 붕어빵기계= 클래스   안에있는 재료들 =객체
// 객체와 인스턴스
// 인스턴스 : 어떤 클래스로부터 만들어진 객체
// 책상은  책상 클래스의 인스턴스다 



public static void main(String[] args) {
    // 인스턴스 생성
    //클래스명 변수명 =new 클래스명();

    Tv tv = new Tv();
    Tv tv2 = new Tv();

    // 첫번쨰 Tv의 속성
    System.out.println(tv);
    System.out.println(tv2);

    //
    
    
}
}