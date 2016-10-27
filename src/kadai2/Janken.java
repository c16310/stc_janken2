/*
 *ジャンケンのテストプログラム
 */
package kadai2;

import java.util.Scanner;
public class Janken {
    
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        HumanPlayer hp = new HumanPlayer();
        ComputerPlayer cp = new ComputerPlayer();
        String[] hands = {"グー","チョキ","パー"};
        
        //もう一度ジャンケンをするか
        int retry;
        
        do {
            //コンピュータの手を読み込む
            int comp = cp.();
            
            //プレイヤーの手を読み込む
            int user = hp.();
            
            //コンピュータの手とプレイヤーの手を表示する
            System.out.println("私は" + hands[comp] + "で、あなたは" + 
                                hands[user] + "です。");
            
            //勝敗の判定
            int judge = (user - comp + 3) % 3;
            switch (judge) {
            case 0: System.out.println("引き分け");
            case 1: System.out.println("あなたの勝ち");
            case 2: System.out.println("あなたの負け");
            }
            
            //もう一度ジャンケンをするか確認する
            do {
                System.out.println("もう一度しますか？　(0)いいえ　(1)はい");
                retry = stdIn.nextInt();
            } while (retry != 0 && retry != 1);
        } while (retry == 1);
    }    
}
