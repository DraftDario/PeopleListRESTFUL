package ch.hearc.ig.odi.peoplelist.presentation;

import ch.hearc.ig.odi.peoplelist.service.Services;
import java.util.List;
import javax.inject.Named;
// Correctif :
// import javax.faces.bean.RequestScoped;
import javax.enterprise.context.RequestScoped;

import javax.inject.Inject;

/**
 *
 * @author dario.mosca
 */
@Named(value = "peopleListBean")
@RequestScoped
public class PeopleListBean {

    @Inject Services services;
    /**
     * Creates a new instance of PeopleListBean
     */
    public PeopleListBean() {
    }
    
    public List getPeopleList(){
        return services.getPeopleList();
    }
    
}
