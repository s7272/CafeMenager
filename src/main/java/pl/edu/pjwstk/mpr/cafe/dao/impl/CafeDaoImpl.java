package pl.edu.pjwstk.mpr.cafe.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import pl.edu.pjwstk.mpr.cafe.dao.CafeDao;
import pl.edu.pjwstk.mpr.cafe.model.Cafe;
import pl.edu.pjwstk.mpr.util.CustomHibernateDaoSupport;

@Repository("cafeDao")
public class CafeDaoImpl extends CustomHibernateDaoSupport implements CafeDao {

	public void save(Cafe cafe) {
		getHibernateTemplate().save(cafe);
	}

	public void update(Cafe stock) {
		getHibernateTemplate().update(stock);
	}

	public void delete(Cafe stock) {
		getHibernateTemplate().delete(stock);
	}

	public Cafe findByCafeName(String cafeName) {
		List list = getHibernateTemplate().find("from Cafe where cafeName=?",
				cafeName);
		return (Cafe)list.get(0);
	}
	
	public List<Cafe> listAllCafes() {
		List<Cafe> list = getHibernateTemplate().find("from Cafe");
		return list;
	}

}
