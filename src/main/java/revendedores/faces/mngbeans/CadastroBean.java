/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package revendedores.faces.mngbeans;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;
import revendedores.persistence.entity.Estado;
import revendedores.persistence.entity.Regiao;
import revendedores.persistence.entity.Revendedor;
import utfpr.faces.support.PageBean;

/**
 *
 * @author a1151207
 */
@ManagedBean
@SessionScoped
public class CadastroBean extends PageBean {

    private Revendedor revendedor = new Revendedor();
    
    private static final Regiao[] regioes = {
        new Regiao("S", "Sul"),
        new Regiao("SE", "Sudeste")
    };
    
    private List<SelectItem> estadosRegioesItemList = new ArrayList<>();
    private List<SelectItem> estadosItemList;
    private List<SelectItem> regioesItemList;
            
    public Revendedor getRevendedor() {
        return revendedor;
    }

    public void setRevendedor(Revendedor revendedor) {
        this.revendedor = revendedor;
    }

    public String cadastrarAction() {
        ListaRevendedoresBean listaRevendedores = (ListaRevendedoresBean) getBean("listaRevendedoresBean");
        if (revendedorValido()) {
            listaRevendedores.adicionarRevendedor(revendedor);
            return "consultar";
        } else {
            error("CNPJ já cadastrado!");
            return null;
        }
    }
    
    public boolean revendedorValido() {
        ListaRevendedoresBean listaRevendedores = (ListaRevendedoresBean) getBean("listaRevendedoresBean");
        for (Revendedor rev : listaRevendedores.getListaRevendedores()) {
            if (revendedor.getCnpj() == rev.getCnpj()) {
                return false;
            }
        }
        return true;
    }
    
    public List<SelectItem> getEstadosRegioesItemList() {
        estadosRegioesItemList.clear();
        
        if(revendedor.getRegiaoAtuacao() == null) {
            revendedor.setRegiaoAtuacao("S");
        }
        if (revendedor.getRegiaoAtuacao().equals("S")) {
            estadosRegioesItemList.add(new SelectItem("RS", "Rio Grande do Sul"));
            estadosRegioesItemList.add(new SelectItem("PR", "Paraná"));
            estadosRegioesItemList.add(new SelectItem("SC", "Santa Catarina"));
        } else {
            estadosRegioesItemList.add(new SelectItem("SP", "São Paulo"));
            estadosRegioesItemList.add(new SelectItem("RJ", "Rio de Janeiro"));
            
        }
        return estadosRegioesItemList;
    }
    
    public List<SelectItem> getRegioesItemList() {
        if (regioesItemList != null) return regioesItemList;
        regioesItemList = new ArrayList<>();
        for (Regiao re: regioes) {
            regioesItemList.add(new SelectItem(re.getSigla(), re.getNome()));
        }
        return regioesItemList;
    }
    
    public List<SelectItem> getEstadosItemList() {
        if (estadosItemList != null) return estadosItemList;
        estadosItemList = new ArrayList<>();
        Estado[] estados = {
            new Estado("PR", "Paraná"),
            new Estado("RS", "Rio Grande do Sul"),
            new Estado("SP", "São Paulo")
        };
        for (Estado re: estados) {
            estadosItemList.add(new SelectItem(re.getSigla(), re.getNome()));
        }
        return estadosItemList;
    }
}
