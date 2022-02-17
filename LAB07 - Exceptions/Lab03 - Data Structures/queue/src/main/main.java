package main;

import Classes.qeue;

public class main {

    public static void main(String args []){
        qeue testeQeue = new qeue();
        testeQeue.push(1);
        testeQeue.push(2);
        testeQeue.push(3);
        testeQeue.push(4);
        System.out.println(testeQeue.print());
        System.out.println(String.format("tamanho: %d",testeQeue.size()));
        testeQeue.pop();
        System.out.println(testeQeue.print());
        System.out.println(String.format("frente:%d",testeQeue.front()));
    }
}
