package eCommerceSimulation;

import eCommerceSimulation.business.abstracts.UserService;
import eCommerceSimulation.business.concretes.AuthManager;
import eCommerceSimulation.business.concretes.EmailManager;
import eCommerceSimulation.business.concretes.UserManager;
import eCommerceSimulation.business.concretes.UserValidationManager;
import eCommerceSimulation.core.AuthService;
import eCommerceSimulation.core.GoogleAuthManagerAdapter;
import eCommerceSimulation.dataAccess.concretes.InMemoryUserDao;

public class Main {

	public static void main(String[] args) {
		
		UserService userService = new UserManager(new InMemoryUserDao());
		
		AuthService authService = new AuthManager(userService, new EmailManager(), new UserValidationManager());
		
		System.out.println("\n######### Register Tests #########");
		
		
		authService.register(1, "Abdullah", "Aksoy", "cxg2520@gmail.com", "testtest123"); // Sorun yok.
		authService.register(2, "Abdullah", "Aksoy", "yanl�semail", "testtest123"); // E-Mail yanl��.
		authService.register(3, "Abdullah", "Aksoy", "testmail@gmail.com", "invld");  // �ifre 6 haneden az.
		authService.register(4, "A", "A", "testmail2@gmail.com", "validpassword123");  // �sim veya Soyisim 2 karakterden az.
		authService.register(5, "Abdullah", "Aksoy", "cxg2520@gmail.com", "123valid123");  // E-Mail zaten kullan�lm��.
		authService.register(6, "", "", "denemeuye@gmail.com", "denemeuye123");  // �sim veya Soyisim bo�.
		
		
		System.out.println("\n----------------------------------------------------------------\n");

		
		authService.login("cxg2520@gmail.com", "123test123"); // Bilgiler do�ru fakat do�rulama yap�lmam��.
		userService.verifyUser(1); // Kullan�c� do�ruland�.
		authService.login("cxg2520@gmail.com", "123test"); // �ifre yanl��.
		authService.login("cxg25200@gmail.com", "123test123"); // e-mail yanl��.
		authService.login("cxg2520@gmail.com", ""); // �ifre bo�.
		authService.login("", "123test123"); // E-Mail bo�.
		authService.login("cxg2520@gmail.com", "123test123"); // Ba�ar�l�.
		
		userService.getAll(); // Giri� yap�lan b�t�n kullan�c�lar� g�sterir.
		
		
		System.out.println("\n\n\n######### Google Log in Simulation #########");
		
		AuthService googleLoginService = new GoogleAuthManagerAdapter();
		googleLoginService.register(6, "Google", "Test", "googletest@gmail.com", "googletest123");
		googleLoginService.login("googletest@gmail.com", "googletest123");
		



		
		
		
		
		
		


	}

}
