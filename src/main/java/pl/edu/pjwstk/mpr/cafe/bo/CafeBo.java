package pl.edu.pjwstk.mpr.cafe.bo;

import pl.edu.pjwstk.mpr.cafe.model.Cafe;

public interface CafeBo {
	void save(Cafe cafe);

	void update(Cafe cafe);

	void delete(Cafe cafe);

	Cafe findByCafeName(String cafeName);
}
