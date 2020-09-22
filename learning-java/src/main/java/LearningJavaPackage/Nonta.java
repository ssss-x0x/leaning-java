package main.java.LearningJavaPackage;

import java.util.Date;

class Nonta {
    String name = "のんた";
    String hobby = "たまちゃん遊び";

    Nonta(String name, String hobby){
        this.name = name;
        this.hobby = hobby;
    }

    /**
     * Nonta Class 実行時処理
     * @param args : コマンドライン引数。今回は使いません
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    void WhoIam(){
        SayHello();
        System.out.println(name);
        System.out.println(hobby);
    }

    void SayHello(){
        String word = "こんにちは";
        System.out.println(word);
    }

}