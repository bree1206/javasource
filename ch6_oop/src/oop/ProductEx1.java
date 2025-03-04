package oop;

import java.time.LocalDate;

public class ProductEx1 {
    public static void main(String[] args) {
        //인스턴스 생성, 생성자 호출
    
        Prouduct product1 = new Prouduct();

        //초기화 
        product1.pName ="p12345";
        product1.pcode ="신발";
        product1.price= 10000;
        product1.regiDate = LocalDate.now();


        



        System.out.println(product1);

        
        


        

    }
    
}
