/*
  Alunos: 
  Filipe Pires da Silva
  Pautércio Ramilson Oliveira da Silva
  Paulo Henrique Soares dos Santos
*/ 

package test.eclemma;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.fullteaching.backend.course.Course;
import com.fullteaching.backend.user.User;

import org.junit.Test;

public class TesteUnidadeMockitoUser {
	
	@Test
	public void testeSetId() {
		User user = new User();
		user.setId(3L);
		assertTrue(user.getId() == 3L);
	}
	
	@Test
	public void testeName() {
		User user = new User();
		user.setName("Jane Doe");
		assertEquals(user.getName(), "Jane Doe");
	}
	
	@Test
	public void testeSetPasswordHash() {
		User user = new User();
		user.setPasswordHash("xxxxxx");
		assertEquals(user.getPasswordHash(), "xxxxxx");
	}
	
	@Test
	public void testeSetRoles() {
		User user = new User();
		List<String> lista = new ArrayList<>();
		user.setRoles(lista);
		assertEquals(user.getRoles(), lista);
	}
	
	@Test
	public void testeSetNickName() {
		User user = new User();
		user.setNickName("Jane Doe");
		assertEquals(user.getNickName(), "Jane Doe");
	}
	
	@Test
	public void testeSetPicture() {
		User user = new User();
		user.setPicture("Jane Doe");
		assertEquals(user.getPicture(), "Jane Doe");
	}
	
	
	@Test
	public void testeSetRegistrationDate() {
		User user = new User();
		user.setRegistrationDate(10122020L);
		assertEquals(user.getRegistrationDate(), 10122020);
	}
	
	@Test
	public void testeSetCourses() {
		User user = new User();
		Set<Course> set = null;
		user.setCourses(set);
		assertEquals(user.getCourses(), set);
	}
	
}
