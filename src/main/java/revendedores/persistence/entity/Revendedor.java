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
public class Revendedor implements Serializable{
    
    private Long cnpj;
    private String razaoSocial;
    private String nomeFantasia;
    private String endereco;
    private String cidade;
    private String estado;
    private String estadoAtuacao;
    private String regiaoAtuacao;
    
    public Revendedor() {
    }

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstadoAtuacao() {
        return estadoAtuacao;
    }

    public void setEstadoAtuacao(String estadoAtuacao) {
        this.estadoAtuacao = estadoAtuacao;
    }

    public String getRegiaoAtuacao() {
        return regiaoAtuacao;
    }

    public void setRegiaoAtuacao(String regiaoAtuacao) {
        this.regiaoAtuacao = regiaoAtuacao;
    }

}
