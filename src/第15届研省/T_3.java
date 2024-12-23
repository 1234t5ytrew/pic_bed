package 第15届研省;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @BelongsProject: untitled
 * @BelongsPackage: 第15届研省
 * @Author: 刘照亮
 * @CreateTime: 2024-12-16  19:59
 * @Description: TODO
 * @Version: 1.0
 */

class Item implements Comparable{
    int val;
    Map<Integer, Integer> map;
    public Item(int val){
        this.val = val;
        map = new HashMap<>();
        map.put(1,0);
        map.put(2,0);
        map.put(3,0);
        map.put(4,1);
        map.put(5,0);
        map.put(6,1);
        map.put(7,0);
        map.put(8,2);
        map.put(9,1);
    }

    @Override
    public int compareTo(Object o) {
        int ov = ((Item) o).val;
        int t = val;
        int cnt_val = 0;
        while(t > 0){
            int tem = t % 10;
            cnt_val += map.get(tem);
            t /= 10;
        }
        int cnt_ov = 0;
        t = ((Item) o).val;
        while(t > 0){
            int tem = t % 10;
            cnt_ov += map.get(tem);
            t /= 10;
        }




        if (cnt_val < cnt_ov){
            return -1;
        }else if (cnt_val == cnt_ov){
            return val - ov;
        }else{
            return 0;
        }
    }

}
public class T_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Item[] arr = new Item[n];

        for (int i = 0; i < n; i ++){
            arr[i] = new Item(sc.nextInt());
//            System.out.println(arr[i].val);
        }
        Arrays.sort(arr);

        System.out.print(arr[0].val);
        for(int i = 1; i < n; i ++){
            System.out.print(arr[i].val + " ");
        }
    }
}
