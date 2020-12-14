/*
  Alunos: 
  Filipe Pires da Silva
  Pautércio Ramilson Oliveira da Silva
  Paulo Henrique Soares dos Santos
*/ 

package test.eclemma;

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
		assertEquals(session.getDate(), 10122020L);
	}
	
	@Test
	public void testeSetCourse() {
		Session session = new Session();
		Course course = new Course();
		session.setCourse(course);
		assertEquals(session.getCourse(), course);
	}
	
	@Test
	public void testeSession3Parametros() {
		String title = "John Doe";
		String description = "Jane Doe";
		long date = 13122020L;
		Session session = new Session(title, description, date);
		assertEquals(session.getTitle(), "John Doe");
		assertEquals(session.getDescription(), "Jane Doe");
		assertEquals(session.getDate(), 13122020L);
		
	}
	
	@Test
	public void testeSession4Parametros() {
		String title = "John Doe";
		String description = "Jane Doe";
		long date = 13122020L;
		Course course = new Course();
		Session session = new Session(title, description, date, course);
		assertEquals(session.getTitle(), "John Doe");
		assertEquals(session.getDescription(), "Jane Doe");
		assertEquals(session.getDate(), 13122020L);
		assertEquals(session.getCourse(), course);
	}
}
