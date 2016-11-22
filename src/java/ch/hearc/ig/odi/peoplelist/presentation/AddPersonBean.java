package ch.hearc.ig.odi.peoplelist.presentation;

import ch.hearc.ig.odi.peoplelist.business.Person;
import ch.hearc.ig.odi.peoplelist.service.Services;
import java.util.Date;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author dario.mosca
 */
@Named(value = "addPersonBean")
@RequestScoped
public class AddPersonBean {

    @Inject
    Services services;

    private Person person;

    /**
     * Creates a new instance of AddPersonBean
     */
    public AddPersonBean() {
        person = new Person();
    }

    public String save() {
        services.savePerson(person.getGender(), person.getFirstName(), person.getLastName(), person.getMarried(), person.getBirthDate());
        return "index";
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

}
