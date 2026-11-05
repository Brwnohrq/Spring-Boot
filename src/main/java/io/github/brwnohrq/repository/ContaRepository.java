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
}
