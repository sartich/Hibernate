package curso;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import curso.model.Country;
import curso.model.Region;

public class Principal {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("CursoDB");
		EntityManager em = emf.createEntityManager();
		List<Region> result = em.createQuery("from Region").getResultList();
		for(Region r : result) {
			System.out.println(r.getRegionName());
			for(Country c : r.getCountries()) {
				System.out.println(c.getCountryName());
			}
		}
		em.close();
		
	}

}
