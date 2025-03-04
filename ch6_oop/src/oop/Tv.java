package oop;

public class Tv {
    // 크기(int),색상{String},채널{int},볼륨{int} tv를 이루고있는 속성
    int size;
    String color;
    int channel;
    int volumne;
    boolean power;

    // 가장많이하는작업:채널변경,전원 on/off, 볼륨조정

    void channelup(){
        channel++;
    }
    void channedown(){
        channel--;

    }
    void power() {
        power = !power;
    }
    @Override
    public String toString() {
        return "Tv [size=" + size + ", color=" + color + ", channel=" + channel + ", volumne=" + volumne + ", power="
                + power + "]";
    }
    
   

}

