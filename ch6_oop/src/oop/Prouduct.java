package oop;

import java.time.LocalDate;

public class Prouduct {
    //속성
    //제품번호(p12345) ,제품명(신발), 가격(10000) ,제조년월(2025-1-02)

    // 기능 -가격변경 
    
    String pcode;
    String pName;
    int price;
    LocalDate regiDate;
    //생성자가 오류가 나지않게 default를 만들어줬다
    //product (){}


    void changeprice(){

    }


    @Override
    public String toString() {
        return "Prouduct [pcode=" + pcode + ", pName=" + pName + ", price=" + price + ", regiDate=" + regiDate + "]";
    }
    

    
}
