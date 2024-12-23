package 第15届研省;


import java.math.BigInteger;

/**
 * @BelongsProject: untitled
 * @BelongsPackage: 第15届研省
 * @Author: 刘照亮
 * @CreateTime: 2024-12-16  19:40
 * @Description: TODO
 * @Version: 1.0
 */
public class T_2 {
    public static void main(String[] args) {

        long end = 2024041331404202L;
        long t = 45;
        int max = 0;
        for (long i = 11; i < end; i ++){
            t += i;
            if (t % 100 == 0){
                max ++;

            }
        }
        System.out.println(max);
    }
}
