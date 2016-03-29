package br.com.equipejr.managebean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import br.com.equipejr.dao.NextBeerDAO;
import br.com.equipejr.dao.UserDAO;
import br.com.equipejr.entity.NextBeer;
import br.com.equipejr.entity.User;

@ManagedBean
public class PayBrMB {

	private NextBeer nextBeer;
	private UserDAO userDAO = new UserDAO();
	private NextBeerDAO nextBeerDAO = new NextBeerDAO();
	private String motivation;
	private User payer;

	private List<User> allUsers;

	@PostConstruct
	public void init() {
		allUsers = userDAO.getAllUsers();
		nextBeer = new NextBeer();
	}

	public void save() {
		nextBeerDAO.save(nextBeer);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Salvo!!"));
	}

	public String cancel() {
		return "home.xhtml?faces-redirect=true";
	}

	public List<User> getAllUsers() {
		return allUsers;
	}

	public NextBeer getNextBeer() {
		return nextBeer;
	}

	public void setNextBeer(NextBeer nextBeer) {
		this.nextBeer = nextBeer;
	}

	public String getMotivation() {
		return motivation;
	}

	public void setMotivation(String motivation) {
		this.motivation = motivation;
	}

	public User getPayer() {
		return payer;
	}

	public void setPayer(User payer) {
		this.payer = payer;
	}

}
