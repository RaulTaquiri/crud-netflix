package br.com.netflix.model;

import com.fasterxml.jackson.annotation.JsonTypeId;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class C_credito {
    @Id
    @GeneratedValue
    private Integer Id;
    private String numeroCartao;
    private String codigoCartao;
    private String titular;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getCodigoCartao() {
        return codigoCartao;
    }

    public void setCodigoCartao(String codigoCartao) {
        this.codigoCartao = codigoCartao;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}
