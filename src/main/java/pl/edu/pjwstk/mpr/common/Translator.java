package pl.edu.pjwstk.mpr.common;

public final class Translator {
	public static Integer ROLE_WAITRESS = 0;
	public static Integer ROLE_MENAGER = 1;
	
	public static String getRoleName(Integer role) {
		String roleName;
		switch (role) {
		case 0:
			roleName = "Waitress";
			break;
		case 1:
			roleName = "Menager";
			break;
		default:
			roleName = "No name for given role number";
			break;
		}
		return roleName;
	}
}
