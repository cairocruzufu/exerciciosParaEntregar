package main;

import Classes.listaEncadeada;
import Classes.qeue;
import Classes.stack;

// todos os metodos estão funcionando
public class main {

    public static void main(String args[]){
        listaEncadeada lista = new listaEncadeada();

        lista.insert(0,3);
        lista.insert(1,2);
        lista.insert(2,4);
       // lista.insert_sort(lista.getPrimeiroNo());
        System.out.println(lista.front());
        System.out.println(lista.back());
        lista.pop_back();
        System.out.println(lista.print());
        System.out.println(lista.find_pos(2));

    }

}
