package com.company;

import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        var sc = new Scanner(System.in);
        var masu = new ArrayList<Integer>();
        var n = sc.nextInt();
        for (var i = 0; i < n; i++) {
            masu.add(sc.nextInt());
        }
        var sum = saiki(masu, 0);


            System.out.println(sum);
    }

    public static int saiki( List<Integer> list, int pos){

        if(list.size()== pos){

            return list.get(pos-1);
        }

        int a = saiki(list, pos + 1);
        var b = Integer.MIN_VALUE;
        if (list.size() >= pos+2){
             b = saiki(list, pos + 2);
        }

        var z = a > b ? a : b;

        if (pos == 0) {
            return z;
        }

        return z + list.get(pos-1);




    }

}
