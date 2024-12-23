package 第15届研省;


import java.util.Scanner;

/**
 * @BelongsProject: untitled
 * @BelongsPackage: 第15届研省
 * @Author: 刘照亮
 * @CreateTime: 2024-12-16  21:46
 * @Description: TODO
 * @Version: 1.0
 */
public class T_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i ++){
            String s = sc.nextLine();
            if(canHuiWen(new StringBuffer(s))){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }

    }

    public static boolean isHuiWen(StringBuffer s){
        for(int i = 0; i < s.length() / 2; i ++){
            if(s.charAt(i) != s.charAt(s.length() - i - 1)){
                return false;
            }
        }
        return true;
    }

    public static boolean canHuiWen(StringBuffer s){
        ;

        for(int i =  s.length() - 1;i >= 0; i -- ){
            if (s.charAt(i) == 'q' || s.charAt(i) == 'b' || s.charAt(i) == 'l') {
                s = s.deleteCharAt(i);
            }
        }

        return isHuiWen(s);

    }
}
