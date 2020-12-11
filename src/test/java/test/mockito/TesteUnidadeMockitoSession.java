/*
  Alunos: 
  Filipe Pires da Silva
  Pautércio Ramilson Oliveira da Silva
  Paulo Henrique Soares dos Santos
*/ 

package test.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.fullteaching.backend.course.Course;
import com.fullteaching.backend.session.Session;

public class TesteUnidadeMockitoSession {
	
	@Test
	public void testeSetId() {
		Session session = new Session();
		session.setId(3L);
		assertEquals(session.getId(), 3L);
	}
	
	@Test
	public void testeSetTitle() {
		Session session = new Session();
		session.setTitle("Jane Doe");
		assertEquals(session.getTitle(), "Jane Doe");
	}
	
	@Test
	public void testeSetDescription() {
		Session session = new Session();
		session.setDescription("Jane Doe");
		assertEquals(session.getDescription(), "Jane Doe");
	}
	
	
	@Test
	public void testeSetDate() {
		Session session = new Session();
		session.setDate(10122020L);
		assertEquals(session.getTitle(), 10122020L);
	}
	
	@Test
	public void testeSetCourse() {
		Session session = new Session();
		Course course = new Course();
		session.setCourse(course);
		assertEquals(session.getCourse(), course);
	}
	
}
