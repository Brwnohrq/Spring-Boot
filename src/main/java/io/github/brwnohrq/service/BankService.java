package io.github.brwnohrq.service;

import org.springframework.stereotype.Service;


@Service
public class BankService {



    public String hello(String nome){
        return "hello" + nome;
    }

}
