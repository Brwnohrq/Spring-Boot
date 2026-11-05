package io.github.brwnohrq.repository;

import io.github.brwnohrq.model.Conta;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ContaRepository {

    public ContaRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private final JdbcTemplate jdbcTemplate;

    public List <Conta> contas (){
        return jdbcTemplate.query("SELECT * FROM CONTA",(rs, rowNum) -> new Conta(
                rs.getInt("ID"),
                rs.getBigDecimal("SALDO"),
                rs.getString("TIPO_CONTA"),
                rs.getString("STATUS")
        ));
    }

    public List <Conta> lisar (){
        return jdbcTemplate.query("SELECT * FROM CONTA WHERE STATUS = 'BLOQUEADA'",(rs, rowNum) -> new Conta(
                rs.getInt("ID"),
                rs.getBigDecimal("SALDO"),
                rs.getString("TIPO_CONTA"),
                rs.getString("STATUS")

        ));

    }

    public List <Conta> contaCliente (){
        return jdbcTemplate.query("SELECT * FROM CONTA WHERE CLIENTE_ID = 1;",(rs, rowNum) -> new Conta(
                rs.getInt("ID"),
                rs.getBigDecimal("SALDO"),
                rs.getString("TIPO_CONTA"),
                rs.getString("STATUS")
        ));
    }

    public List <Conta> contaRica (){
        return jdbcTemplate.query("SELECT * FROM CONTA WHERE SALDO >= 10000 AND STATUS = TRUE",(rs, rowNum) -> new Conta(
                rs.getInt("ID"),
                rs.getBigDecimal("SALDO"),
                rs.getString("TIPO_CONTA"),
                rs.getString("STATUS")
        ));
    }

    public List <Conta> buscarId (int id){
        return jdbcTemplate.query("SELECT * FROM CONTA WHERE ID = ?",(rs, rowNum) -> new Conta(
                rs.getInt("ID"),
                rs.getBigDecimal("SALDO"),
                rs.getString("TIPO_CONTA"),
                rs.getString("STATUS")
        ),id);
    }
}
