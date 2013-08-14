/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package revendedores.faces.mngbeans;

import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import revendedores.persistence.entity.Revendedor;

/**
 *
 * @author a1151207
 */
@ManagedBean
@ApplicationScoped
public class ListaRevendedoresBean implements Serializable {
    
     private ArrayList<Revendedor> listaRevendedores = new ArrayList<Revendedor>();

    public ListaRevendedoresBean() {
    }

    public void setListaRevendedores(ArrayList<Revendedor> listaRevendedores) {
        this.listaRevendedores = listaRevendedores;
    }

    public ArrayList<Revendedor> getListaRevendedores() {
        if (listaRevendedores != null) {
            return listaRevendedores;
        }
        listaRevendedores = new ArrayList<Revendedor>();
        return listaRevendedores;
    }

    public void adicionarRevendedor(Revendedor revendedor) {
        if (listaRevendedores != null) {
            listaRevendedores.add(revendedor);
        }
    }   
}