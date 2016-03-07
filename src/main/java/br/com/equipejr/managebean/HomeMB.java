package br.com.equipejr.managebean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Named;

import br.com.equipejr.dao.NextBeerDAO;
import br.com.equipejr.entity.NextBeer;

@ManagedBean
@Named("homeMB")
@RequestScoped
public class HomeMB {

	private NextBeerDAO nextBeerDAO = new NextBeerDAO();
	private List<NextBeer> nextBeers;

	@PostConstruct
	public void init() {
		nextBeers = nextBeerDAO.getAllNextBeers();
	}

	public List<NextBeer> getNextBeers() {
		return nextBeers;
	}

}
