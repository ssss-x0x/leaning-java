package main.java.LearningJavaPackage;

/**
 * 比較演算を実行
 */
public class RelationOperator1 {
    /**
     * 比較演算を実行し、その内容を確認する
     * 
     * @param args // コマンドライン引数 今回は使いません
     */
    public static void main(String[] args) {
        // [1] 参照型データを演算子で比較した場合
        boolean result = new Integer("1") == new Integer("1");
        printValue("[1] new Integer(1) == new Integer(1) result -> " + result);

        // [2] 参照型データを equalsメソッドで比較した場合
        result = new Integer("1").equals(new Integer("1"));
        printValue("[2] new Integer(1).equals(new Integer(1) result -> " + result);

        // [3] 参照方データを compareToメソッドで比較した場合
        int resultValue = new Integer("1").compareTo(new Integer("2")); 
        printValue("[3] new Integer(1).compareTo(new Integer(2) resultValue -> " + resultValue);

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