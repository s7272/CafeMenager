package pl.edu.pjwstk.mpr.cafe.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import pl.edu.pjwstk.mpr.cafe.dao.CafeDao;
import pl.edu.pjwstk.mpr.cafe.model.Cafe;
import pl.edu.pjwstk.mpr.util.CafeMenagerHibernateDaoSupport;

@Repository("cafeDao")
public class CafeDaoImpl extends CafeMenagerHibernateDaoSupport implements CafeDao {

	public void save(Cafe cafe) {
		getHibernateTemplate().save(cafe);
	}

	public void update(Cafe cafe) {
		getHibernateTemplate().update(cafe);
	}

	public void delete(Cafe cafe) {
		getHibernateTemplate().delete(cafe);
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
