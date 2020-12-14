/*
  Alunos: 
  Filipe Pires da Silva
  Pautércio Ramilson Oliveira da Silva
  Paulo Henrique Soares dos Santos
*/ 

package test.eclemma;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.fullteaching.backend.user.User;
import com.fullteaching.backend.user.UserComponent;

public class TesteUnidadeMockitoUserComponent {
	
	@Test
	public void testeSetLoggedUser() {
		UserComponent uc = new UserComponent();
		User user = new User();
		uc.setLoggedUser(user);
		assertEquals(uc.getLoggedUser(), user);
	}
	
	@Test
	public void testeIsLoggedUser() {
		UserComponent uc = new UserComponent();
		User user = new User();
		uc.setLoggedUser(user);
		assertTrue(uc.isLoggedUser() == (user != null));
	}
	

}
