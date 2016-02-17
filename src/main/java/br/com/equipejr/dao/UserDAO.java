package br.com.equipejr.dao;

import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.com.equipejr.entity.User;

@Named("userDAO")
public class UserDAO {

	@PersistenceContext(unitName = "equipePU")
	private EntityManagerFactory factory;
	
	public User getUser(String email) {
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createQuery("select u from User as u where u.email = :email ");
		query.setParameter("email", email);
		
		return (User)query.getSingleResult();
	}
	
	@SuppressWarnings("unchecked")
	public List<String> getAllUserMails() {
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createQuery("select u.email from User as u order by u.email");
		
		return query.getResultList();
	}
}
