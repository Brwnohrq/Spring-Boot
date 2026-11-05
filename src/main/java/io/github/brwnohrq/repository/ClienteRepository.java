package io.github.brwnohrq.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import io.github.brwnohrq.model.Cliente;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClienteRepository {


    private final JdbcTemplate jdbcTemplate;

    public ClienteRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List <Cliente> listar (){
            return jdbcTemplate.query("SELECT * FROM CLIENTE",(rs, rowNum) -> new Cliente(
                    rs.getInt("ID"),
                    rs.getString("NOME"),
                    rs.getString("CPF"),
                    rs.getString("EMAIL"),
                    rs.getString("CIDADE")
            ));

    }

}
