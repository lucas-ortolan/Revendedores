/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package revendedores.faces.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author a1151207
 */
@FacesValidator("CNPJValidator")
public class CNPJValidator implements Validator {
    
    @Override
    public void validate(FacesContext fc, UIComponent uic, Object o) throws ValidatorException {
        String cnpj = String.format("%014d", (Long) o);
        if (!cnpj.matches("\\d{14}")) {        
            throw new ValidatorException(new FacesMessage("CPF \'" + cnpj + "\' em formato incorreto."));
        } else {
            long oitoDigitos = Long.parseLong(cnpj.substring(0, 8));
            long quatroDigitos = Long.parseLong(cnpj.substring(8, 12));
            if ((oitoDigitos <= 0) || (quatroDigitos <= 0)) {
                throw new ValidatorException(new FacesMessage("CNPJ \'" + cnpj + "\' inválido"));
            }
        }
    }    
}
