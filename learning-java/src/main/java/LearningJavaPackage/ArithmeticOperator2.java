package main.java.LearningJavaPackage;

/**
 * 算術演算子を確認するクラス
 */
public class ArithmeticOperator2 {
    public static void main(String[] args) {
        // [1] 括弧なし
        printValue("[1]: 1 + 1 = " + 1 + 1);

        // [2] 括弧あり
        printValue("[2]: 1 + 1 = " + (1 + 1));

        // [3] 数値が左
        printValue(1 + 2 + "3");
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