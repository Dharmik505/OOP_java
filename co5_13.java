package apack;
public class A {
    public int pubVar;
    protected int protVar;
    private int privVar;
    public A(int a, int b, int c) {
        pubVar = a;
        protVar = b;
        privVar = c;
    }
}

package bpack;
import apack.A;
public class B extends A {
    public B(int a, int b, int c) {
        super(a, b, c);
    }
    public void display() {
        System.out.println(pubVar);
        System.out.println(protVar);
    }
}

package cpack;
import apack.A;
public class C {
    public void display() {
        A aObj = new A(1, 2, 3);
        System.out.println(aObj.pubVar);
    }
}

package dpack;
import bpack.B;
import cpack.C;
public class ProtectedDemo {
    public static void main(String[] args) {
        B bObj = new B(10, 20, 30);
        bObj.display();
        C cObj = new C();
        cObj.display();
    }
}
