package main.java.LearningJavaPackage;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * BigDemicalのサンプルを実行し、その内容を確認するクラス
 */
public class BigDemicalSample1 {
    /**
     * BigDemicalの計算を実行し、その内容を確認する
     * 
     * @param args // コマンドライン引数 今回は使いません
     */
    public static void main(String[] args) {
        // [1] 足し算
        BigDecimal value1 = new BigDecimal("0.7");
        BigDecimal value2 = new BigDecimal("0.1");
        BigDecimal result = value1.add(value2);
        printValue("[1] 0.7 + 0.1 = " + result);

        // [2] 引き算
        result = value1.subtract(value2);
        printValue("[2] 0.7 - 0.1 = " + result);

        // [3] 掛け算
        result = value1.multiply(value2);
        printValue("[3] 0.7 * 0.1 = " + result);

        // [4] 割り算
        value1 = new BigDecimal("7.0");
        value2 = new BigDecimal("3.0");
        result = value1.divide(value2, 0, RoundingMode.DOWN);
        printValue("[4] 7.0 / 3.0 = " + result);

        // [5] あまり
        value1 = new BigDecimal("7.0");
        value2 = new BigDecimal("3.0");
        result = value1.remainder(value2);
        printValue("[5] 7.0 % 3.0 = " + result);

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