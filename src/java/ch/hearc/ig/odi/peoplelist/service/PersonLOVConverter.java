/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.peoplelist.service;

import ch.hearc.ig.odi.peoplelist.business.Person;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Inject;

/**
 *
 * @author dario.mosca
 */
@Named(value = "personLOVConverter")
@RequestScoped
public class PersonLOVConverter implements Converter {

    @Inject
    Services services;

    /**
     * Creates a new instance of PersonLOVConverter
     */
    public PersonLOVConverter() {
    }

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if (value == null) {
            return null;
        } else {
            return services.getPerson(new Long(value));
        }
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value == null) {
            return null;
        } else if (value instanceof Person) {
            return Long.toString(((Person) value).getId());
        } else {
            return "";
        }
    }

}
