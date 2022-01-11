package com.company;

class A
{
    static
    {
        System.out.println("THIRD");
    }
}

class B extends A
{
    static
    {
        System.out.println("SECOND");
    }
}

class C extends B
{
    static
    {
        System.out.println("FIRST");
    }
}

public class Main
{
    public static void main(String[] args)
    {
        C c = new C();
        System.out.println("LLL");
    }
}