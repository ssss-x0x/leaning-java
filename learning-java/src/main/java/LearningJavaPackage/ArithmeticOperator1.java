package main.java.LearningJavaPackage;

/**
 * 算術演算子を確認するクラス
 */
public class ArithmeticOperator1 {
    public static void main(String[] args) {
        // [1] 特殊な計算
        int result = 1;
        result += 2;
        System.out.println("[1]: result = 1 -> result += 2 -> result = " + result);

        // [2] 特殊な計算
        System.out.println("[2]: result = 1 -> ++result");
        result = 1;
        printValue(++result);
        System.out.println("result = " + result);

        // [3] 特殊な計算
        System.out.println("[2]: result = 1 -> result++");
        result = 1;
        printValue(result++);
        System.out.println("result = " + result);
    }

    /**
     * 受け取った値を標準出力
     * 
     * @param value
     */
    private static void printValue(int value) {
        System.out.println("受け取った値：value = " + value);
    }
}