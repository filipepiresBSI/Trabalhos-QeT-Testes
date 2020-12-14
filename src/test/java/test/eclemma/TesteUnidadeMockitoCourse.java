/*
  Alunos: 
  Filipe Pires da Silva
  Pautércio Ramilson Oliveira da Silva
  Paulo Henrique Soares dos Santos
*/ 

package test.eclemma;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import java.util.Set;

import com.fullteaching.backend.course.Course;
import com.fullteaching.backend.coursedetails.CourseDetails;
import com.fullteaching.backend.session.Session;
import com.fullteaching.backend.user.User;

public class TesteUnidadeMockitoCourse {
	
	@Test
	public void testeSetId() {
		Course course = new Course();
		course.setId(3L);
		assertEquals(course.getId(), 3L);
	}
	
	@Test
	public void testeSetTitle() {
		Course course = new Course();
		course.setTitle("John Doe");
		assertEquals(course.getTitle(), "John Doe");
	}
	
	@Test
	public void testeSetImage() {
		Course course = new Course();
		course.setImage("John Doe");
		assertEquals(course.getImage(), "John Doe");
	}
	
	@Test
	public void testeSetTeacher() {
		Course course = new Course();
		User user = new User();
		course.setTeacher(user);
		assertEquals(course.getTeacher(), user);
	}
	
	@Test
	public void testeSetCourseDetails() {
		Course course = new Course();
		CourseDetails courseDetails = new CourseDetails();
		course.setCourseDetails(courseDetails);
		assertEquals(course.getCourseDetails(), courseDetails);
	}
	
	@Test
	public void testeSetAttenders() {
		Course course = new Course();
		Set<User> set = null;
		course.setAttenders(set);
		assertEquals(course.getAttenders(), set);
	}
	
	@Test
	public void testeSetSessions() {
		Course course = new Course();
		Set<Session> set = null;
		course.setSessions(set);
		assertEquals(course.getSessions(), set);
	}
	
	@Test
	public void testeCourse3Parametros() {
		String title = "John Doe";
		String image = "Jane Doe";
		User user = new User();
		Course course = new Course(title, image, user);
		assertEquals(course.getTitle(), "John Doe");
		assertEquals(course.getImage(), "Jane Doe");
		assertEquals(course.getTeacher(), user);
	}
	
	@Test
	public void testeCourse4Parametros() {
		String title = "John Doe";
		String image = "Jane Doe";
		User user = new User();
		CourseDetails courseDetails = new CourseDetails();
		Course course = new Course(title, image, user, courseDetails);
		assertEquals(course.getTitle(), "John Doe");
		assertEquals(course.getImage(), "Jane Doe");
		assertEquals(course.getTeacher(), user);
		assertEquals(course.getCourseDetails(), courseDetails);
	}
}

