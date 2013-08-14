/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package revendedores.persistence.entity;

import java.io.Serializable;

/**
 *
 * @author a1151207
 */
public class Estado implements Serializable{
    
    private String sigla;
    private String nome;

    public Estado(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }
    
    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}