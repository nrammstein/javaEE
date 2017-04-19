package ru.killing.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * Session Bean implementation class EjbOne
 */
@Stateless(mappedName = "ejbOne")
@LocalBean
public class EjbOne {
	
	
    TestEjb testEjb;
	
}
