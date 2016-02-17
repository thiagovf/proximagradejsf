package br.com.equipejr.managebean;

import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.equipejr.dao.UserDAO;

//@ManagedBean
@Named("homeMB")
@RequestScoped
public class HomeMB {

//	@ManagedProperty(name = "userDAO", value = "#{userDAO}")
	@Inject
	private UserDAO userDAO;
	
	public void test() {
		userDAO.getAllUserMails();
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
}
