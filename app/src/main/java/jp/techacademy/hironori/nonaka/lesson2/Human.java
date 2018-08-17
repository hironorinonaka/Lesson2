package jp.techacademy.hironori.nonaka.lesson2;


import android.util.Log;

public class Human extends Animal implements Thinkable{

    String hobby;

    // コンストラクタ
    public Human(String name,int age,String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }


    @Override
    public void say() {
        Log.d("javatest","私の名前は" + this.name + "です．" + "年は" + this.age + "歳です．");
    }


    public void think(){
        Log.d("javatest","私は" + this.hobby + "について考える．");

    }
}
