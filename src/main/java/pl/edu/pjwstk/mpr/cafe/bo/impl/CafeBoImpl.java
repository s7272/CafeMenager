package pl.edu.pjwstk.mpr.cafe.bo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.edu.pjwstk.mpr.cafe.bo.CafeBo;
import pl.edu.pjwstk.mpr.cafe.dao.CafeDao;
import pl.edu.pjwstk.mpr.cafe.model.Cafe;
 
@Service("cafeBo")
public class CafeBoImpl implements CafeBo {
 
	@Autowired
	CafeDao cafeDao;
 
	public void setStockDao(CafeDao cafeDao) {
		this.cafeDao = cafeDao;
	}
 
	public void save(Cafe cafe){
		cafeDao.save(cafe);
	}
 
	public void update(Cafe cafe){
		cafeDao.update(cafe);
	}
 
	public void delete(Cafe cafe){
		cafeDao.delete(cafe);
	}
 
	public Cafe findByCafeName(String cafeName){
		return cafeDao.findByCafeName(cafeName);
	}
	
	public List<Cafe> listAllCafes(){
		return cafeDao.listAllCafes();
	}
}
