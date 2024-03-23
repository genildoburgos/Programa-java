package com.genildoburgos.banco.app;

import com.genildoburgos.banco.modelo.Pessoa;

import java.util.HashSet;
import java.util.List;

import java.util.ArrayList;
import java.util.Set;

public class Principal2 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João da silva", "121232323");
        Pessoa pessoa2 = new Pessoa("Maria elena", "344345");

//        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        Set<Pessoa> pessoas = new HashSet<Pessoa>();
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);

//        System.out.println(pessoas);
//        Pessoa pessoaum = pessoas.get(0);
//        System.out.println(pessoaum);

//        for ( int i = 0; i < pessoas.size(); i++){
//            System.out.println(pessoas.get(i).getNome());
//        }

//        for (Pessoa pessoa : pessoas){
//            System.out.println(pessoa.getNome());
//        }

        Pessoa pessoa4 = new Pessoa("João da silva", "121232323");

        boolean existe = pessoas.contains(pessoa4);
        System.out.println(existe);

//        System.out.println(pessoa1.equals((pessoa4)));
    }
}
