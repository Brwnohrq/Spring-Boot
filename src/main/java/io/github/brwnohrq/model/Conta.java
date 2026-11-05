package io.github.brwnohrq.model;

import java.math.BigDecimal;

public class Conta {

    private int id;
    private BigDecimal saldo;
    private String tipo_conta;
    private String status;


    public Conta(int id, BigDecimal saldo, String tipo_conta, String status) {
        this.id = id;
        this.saldo = saldo;
        this.tipo_conta = tipo_conta;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public String getTipo_conta() {
        return tipo_conta;
    }

    public String getStatus() {
        return status;
    }


}
