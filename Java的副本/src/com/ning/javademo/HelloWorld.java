package com.ning.javademo;

/**
 * Created by ningli on 2017/7/25.
 */
public class HelloWorld {
    public static void main(String[] args) {
        String s = "ss";
        System.out.println("-----------YouMeek.com-----------s值=" + s + "," + "当前类=helloword.main()");
        System.out.println("HelloWorld");
        int [] a = {3,4,2,11,5,78,7,90,6};
        sort(a);
    }

    public static void sort (int [] a){
        int length = a.length;
        for (int i=0;i<length;i++) {
            for (int j=0;j<i;j++){
                if(a[j] >a [i]) {
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for (int i = 0;i<length;i++){
            System.out.println(a[i]);
        }
    }
    public static int add(int a,int b){
        return a+b;
    }
}
