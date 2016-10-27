/*
 * コンピュータのクラス
 */
package kadai2;
import java.util.Random;

public class ComputerPlayer extends  Player{
    private static Random rand;
    
    static {
        rand = new Random();
    }
    
    //コンピュータの手を乱数で生成するようにする//
    public int {
        return rand.nextInt(3);
    }
}
