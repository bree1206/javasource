package oop;

import java.rmi.StubNotFoundException;

public class Student {
    

//멤버 변수, 멤버 메소드, 생성자,

//속성 :학번(s1024125),이름(홍길동),학년(1),반(1),전화번호(010-1234-1234),이메일(hong1024@gmail.com)
String stuId;
String name;
int grade;
int classNum;
String phone;
String email;

//생성자 : 개발자가 명시하지 않으면 컴파일러가 자동으로 만들어진다
//클래스명(){}
// 기본 생성자
//속성 생성자 필수 아님
//메소드만 가지고있는 클래스도 있다 속성,생성자가 필수 구성요소가 아니다



//기능 :전화번호 변경,이메일 변경,학년을 변경,반을 변경
void changeTel(){
}
// int grade, int classNum -지역변수(전달일자)
public Student(int grade, int classNum) {
    this.grade = grade;
    this.classNum = classNum;
}
//생성자목적
// 멤버 변수 초기화
public Student(String stuId, String name, int grade, int classNum, String phone, String email) {
    this.stuId = stuId;
    this.name = name;
    this.grade = grade;
    this.classNum = classNum;
    this.phone = phone;
    this.email = email;
}

public Student() {
    // 위에 식은 기본생성자이다 (디폴트 생성자)
}      //생성자= Student(){}면 생성자식이다  (가로안은 달라야한다)
        


void changeEmail() {
 }
void changeGrade() {

}
void changeClassNum(){

}

@Override
public String toString() {
    return "Student [stuId=" + stuId + ", name=" + name + ", grade=" + grade + ", classNum=" + classNum + ", phone="
            + phone + ", email=" + email + "]";
}


}