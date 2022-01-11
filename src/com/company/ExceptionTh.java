package com.company;

public class ExceptionTh {

    public static int div(int a, int b) throws ArithmeticException{
        int res = a/b;
        return res;
    }
    public static void main(String[] args) {
        try {
            int c = div(10, 0);
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}


