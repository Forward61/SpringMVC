package com.ning.javademo;

/**
 * Created by ningli on 2017/8/14.
 */
public class Num_2 {
    public static void main(String[] args) {
        int i=1;
        if(i!=1&&i%2!=0){
            System.out.println("-----------Test不是-----------i值=" + i + "," + "当前类=.()");
        }else {
            boolean b = isN(i);
            System.out.println(i);
            System.out.println("-----------Test-----------b值=" + b + "," + "当前类=.()");
        }





    }
    public static boolean  isN(int n){
        boolean b = false;
        while (true){
            int j = n%2;
             n =n/2;
            if(j==1){
                b = false;
                break;
            }
            if (n==2){
                b= true;
                break;
            }
        }
        return b;
        //while(true){
//        int j=n%2;
//        n=n/2;
//        if(j==1){
//        b=false;
//        break;
//        }if(n==2){
//        b=true;
//        break;
//        }
//
//        }

//        if(i/2 == 1 && i%2==0){
//            return true;
//        }
//        return false;
    }

}
