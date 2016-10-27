/**
 * ジャンケン　プレーヤのクラス
 */
package kadai2;

import java.util.Scanner;

public class HumanPlayer extends Player {
    private static Scanner stdIn;
    
    static {
        stdIn = new Scanner(System.in);
    }
    
    //キーボードからジャンケンの手を読み込むようにする//
    public   {
        do {
            System.out.println("ジャンケン開始ジャンケンの手(0..グー/1..チョキ/2..パー)");
            hand = stdIn.nextInt();
        } while (hand < 0 || hand > 2);
        return ;
    }
}
