package main;

import Classes.stack;

// todos os metodos estão funcionando
public class main {

    public static void main(String args[]) {
        stack testeStack = new stack();
        testeStack.push(1);
        testeStack.push(2);
        testeStack.push(3);
        testeStack.push(4);
        System.out.println(testeStack.print());
        System.out.println(String.format("tamanho: %d", testeStack.size()));
        testeStack.pop();
        System.out.println(testeStack.print());
        System.out.println(String.format("frente:%d", testeStack.top()));
    }
}
