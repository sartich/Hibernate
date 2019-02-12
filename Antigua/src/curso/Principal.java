package curso;

import java.util.List;

import org.hibernate.Session;

import curso.model.Countries;
import curso.model.Regions;

public class Principal {

	public static void main(String[] args) {
			Session session = HibernateUtil.getSessionFactory().openSession();
			List<Regions> result = session.createQuery("from Regions").list();
			for(Regions r : result) {
				System.out.println(r.getRegionName());
			}
			session.close();
	}

}
