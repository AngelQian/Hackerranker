Angry Professor

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tests = scan.nextInt();
        for(int i=0; i<tests; i++){
            int stds = scan.nextInt();
            int bar = scan.nextInt();
            int cur=0;
            for(int j=0; j<stds; j++){
                if(scan.nextInt()<=0)
                    cur++;
            }
            System.out.println(cur>=bar?"NO":"YES");
        }
    }
}
