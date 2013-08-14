/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package revendedores.faces.convert;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author a1151207
 */
@FacesConverter("CNPJConverter")
public class CNPJConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        return string == null || string.trim().isEmpty() ? null : Long.valueOf(string.replace("-", "").replace(".", "").replace("/", ""));
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        Long cnpj = (Long) o;
        String cnpjString = cnpj.toString();
        return cnpjString.substring(0, 2) + "." + cnpjString.substring(2, 5) + "." + cnpjString.substring(5, 8) + "/" 
                + cnpjString.substring(8, 12) + "-" + cnpjString.substring(12, 14);
    }
    
}
