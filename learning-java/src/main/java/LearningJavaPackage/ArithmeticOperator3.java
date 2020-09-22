package main.java.LearningJavaPackage;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 算術演算子を確認するクラス
 */
public class ArithmeticOperator3 {
    public static void main(String[] args) {
        double resultDouble = 0.0;
        resultDouble = 0.7 + 0.1;
        printValue("resultDouble: " + resultDouble);
    }

    /**
     * 受け取った値を標準出力
     * 
     * @param value
     */
    private static void printValue(String value) {
        System.out.println(value);
    }
}