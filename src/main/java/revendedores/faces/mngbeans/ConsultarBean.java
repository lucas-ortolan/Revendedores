/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package revendedores.faces.mngbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.ListDataModel;
import revendedores.persistence.entity.Revendedor;
import utfpr.faces.support.PageBean;

/**
 *
 * @author a1151207
 */
@ManagedBean
@SessionScoped
public class ConsultarBean extends PageBean {

    private ListDataModel<Revendedor> revendedoresDataModel;
    private ListaRevendedoresBean beanRevendedores;

    public ConsultarBean() {
        beanRevendedores = (ListaRevendedoresBean) getBean("listaRevendedoresBean");
        revendedoresDataModel = new ListDataModel<>(beanRevendedores.getListaRevendedores());
    }

    public ListDataModel<Revendedor> getRevendedoresDataModel() {
        return revendedoresDataModel;
    }
}
