package com.artemnizhnyk.servletpractice.web.converter;

import com.artemnizhnyk.servletpractice.domain.model.TelephoneType;
import com.artemnizhnyk.servletpractice.web.controller.TelephoneTypeController;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.convert.Converter;
import jakarta.faces.convert.FacesConverter;

@FacesConverter(forClass = TelephoneType.class)
public class TelephoneTypeConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent component, String string) {
        if (string == null || string.length() == 0) {
            return null;
        }
        Integer id = Integer.valueOf(string);
        TelephoneTypeController controller = (TelephoneTypeController) facesContext.getApplication().getELResolver().getValue(facesContext.getELContext(), null, "telephoneTypeController");
        return controller.getDao().findTelephoneType(id);
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
        if (object == null) {
            return null;
        }
        if (object instanceof TelephoneType) {
            TelephoneType o = (TelephoneType) object;
            return o.getTelephoneTypeId() == null ? "" : o.getTelephoneTypeId().toString();
        } else {
            throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: com.ensode.jakartaeealltogether.entity.TelephoneType");
        }
    }

}
