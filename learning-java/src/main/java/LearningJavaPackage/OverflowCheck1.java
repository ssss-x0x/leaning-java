package main.java.LearningJavaPackage;

/**
 * intが最大値を超える際の動きを確認するクラス
 */
public class OverflowCheck1 {
    /**
     * 最大値に１を加算した際の値を標準出力します
     * 
     * @param args // コマンドライン引数 今回は使いません
     */
    public static void main(String[] args) {
        int i = Integer.MAX_VALUE;
        printValue("MAX_VALUE: "+i);
        i += 1;
        printValue("MAX_VALUE+1: "+i);
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