package pl.edu.pjwstk.mpr.cafe.dao;

import pl.edu.pjwstk.mpr.cafe.model.Cafe;

public interface CafeDao {

	void save(Cafe cafe);

	void update(Cafe cafe);

	void delete(Cafe cafe);

	Cafe findByCafeName(String cafeName);
}
