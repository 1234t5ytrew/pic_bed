package 第15届研省;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


/*
 *
 */
public class T_1 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("src/第15届研省/log.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        int cnt = 1;
        int max = 0;
        String[] start = br.readLine().split(" ");
        Long preTime = Long.parseLong(start[2]);
        String s1 = start[0];
        String s2 = start[1];

        while((line = br.readLine()) != null){
            String[] str = line.split(" ");
            String cs1 = str[0];
            String cs2 = str[1];
            Long curTime = Long.parseLong(str[2]);
            if (s1.equals(s2)
                    && (curTime - preTime) <= 1000
                    && cs1.equals(cs2)){
                cnt ++;
                max = Math.max(max, cnt);
            }else{
                cnt = 1;
            }
            preTime = curTime;
            s1 = cs1;
            s2 = cs2;

        }

        System.out.println(max);
    }
}
