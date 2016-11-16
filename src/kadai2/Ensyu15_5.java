/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kadai2;

import java.util.Scanner;

/**
 *
 * @author c16310
 */
public class Ensyu15_5 {
    
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        HumanPlayer hp = new HumanPlayer();
        ComputerPlayer cp1 = new ComputerPlayer();
        ComputerPlayer cp2 = new ComputerPlayer();
        String[] hands = {"グー","チョキ","パー"};
        
        
        int retry;//もう一度ジャンケンをするか
        
        do {
            //コンピュータの手を読み込む
            int comp1 = cp1.nextHand();
            int comp2= cp2.nextHand();
            
            //プレイヤーの手を読み込む
            int user = hp.nextHand();
            
            //コンピュータの手とプレイヤーの手を表示する
            System.out.println("コンピュータ1は" + hands[comp1] + "で、" +
                               "コンピュータ2は" + hands[comp2] + "で、" +
                               "あなたは" +hands[user] + "です。");
            
            //勝敗の判定
            int judge1 = (user - comp1 + 3) % 3;
            int judge2 = (user - comp2 + 3) % 3;
            
            if (judge1 == 2 && judge2 == 2)
                System.out.println("あなたの勝ち");
            else if (judge1 == 1 && judge2 == 0)
                System.out.println("コンピュータ1の勝ち");
            else if (judge1 == 0 && judge2 == 1)
                System.out.println("コンピュータ2の勝ち");
            else if (judge1 == 0 && judge2 == 2)
                System.out.println("あなたとコンピュータ1の勝ち");
            else if (judge1 == 2 && judge2 == 0)
                System.out.println("あなたとコンピュータ2の勝ち");
            else if (judge1 == 1 && judge2 == 1)
                System.out.println("コンピュータ1とコンピュータ2の勝ち");
            else
                System.out.println("引き分け");
            
            
            //もう一度ジャンケンをするか確認する
            do {
                System.out.println("もう一度しますか？　(0)いいえ　(1)はい");
                retry = stdIn.nextInt();
                } while (retry != 0 && retry != 1);
            } while (retry == 1);
        }
    }    
