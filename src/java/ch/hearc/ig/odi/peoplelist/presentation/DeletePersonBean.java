package ch.hearc.ig.odi.peoplelist.presentation;

import ch.hearc.ig.odi.peoplelist.business.Person;
import ch.hearc.ig.odi.peoplelist.service.Services;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author dario.mosca
 */
@Named(value = "deletePerson")
@RequestScoped
public class DeletePersonBean {

    @Inject
    Services service;

    private Person person;

    public DeletePersonBean() {
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String delPerson() {
        service.deletePerson(person);
        return "index.xhtml";
    }

}
