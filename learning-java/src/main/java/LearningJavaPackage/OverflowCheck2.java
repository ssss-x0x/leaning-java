package main.java.LearningJavaPackage;

/**
 * Java8での符号なし Integer と Long についての限界値の際の動きを確認するクラス
 */
public class OverflowCheck2 {
    /**
     * Java8での符号なし Integer と Long についての限界値のサンプルを標準出力
     * 
     * @param args // コマンドライン引数 今回は使いません
     */
    public static void main(String[] args) {
        // Java8 以降
        int i = Integer.MAX_VALUE + 1;
        String value = Integer.toUnsignedString(i);
        printValue(value);

        i = Integer.MAX_VALUE + Integer.MAX_VALUE + 1;
        value = Integer.toUnsignedString(i);
        printValue(value);

        i = i + 1;
        value = Integer.toUnsignedString(i);
        printValue(value);

        long l = Long.MAX_VALUE + Long.MAX_VALUE + 1;
        value = Long.toUnsignedString(l);
        printValue(value);

        l = l + 1;
        value = Long.toUnsignedString(i);
        printValue(value);
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