package 第15届研省;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @BelongsProject: untitled
 * @BelongsPackage: 第15届研省
 * @Author: 刘照亮
 * @CreateTime: 2024-12-16  20:47
 * @Description: TODO
 * @Version: 1.0
 */
public class T_4 {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i ++){
            map.put(i + 1, 0);
        }
        int[][] record = new int[m][2] ;
        for(int i = 0; i < m; i ++){
            int l = sc.nextInt();
            int r = sc.nextInt();
            record[i][0] = l;
            record[i][1] = r;
            while(l <= r){
                map.put(l, map.get(l) + 1);
                l ++;
            }
        }

        for (int i = 0; i < m; i ++){
            int l = record[i][0];
            int r = record[i][1];

            while(l <= r){
                map.put(l, map.get(l) - 1);
                l ++;
            }
            int cnt = 0;
            for(Map.Entry<Integer, Integer> item : map.entrySet()){
                if (item.getValue() == 0){
                    cnt ++;
                }
            }
            l = record[i][0];
            r = record[i][1];
            while(l <= r){
                map.put(l, map.get(l) + 1);
                l ++;
            }
            System.out.println(cnt);
        }

    }
}
