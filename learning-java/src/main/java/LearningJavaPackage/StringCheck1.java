package main.java.LearningJavaPackage;

import sun.print.PrinterGraphicsConfig;

/**
 * 文字列のデータ参照先をチェックするクラス
 */
public class StringCheck1 {
    /**
     * 1つのStringのデータに同じダブルクォーテで囲った文字列を参照させた場合、同じものを指しているのかを確認する
     * 
     * @param args // コマンドライン引数 今回は使いません
     */
    public static void main(String[] args) {
        String a = "あいうえお";
        String b = "あいうえお";

        boolean result = (a == b);
        printValue("a == b : "+ result);
    }

    /**
     * 
     * 
     * @param value
     */
    private static void printValue(String value) {
        System.out.println(value);
    }
}