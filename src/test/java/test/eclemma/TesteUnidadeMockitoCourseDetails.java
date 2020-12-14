/*
  Alunos: 
  Filipe Pires da Silva
  Pautércio Ramilson Oliveira da Silva
  Paulo Henrique Soares dos Santos
*/ 

package test.eclemma;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.ArrayList;
import org.junit.Test;

import com.fullteaching.backend.course.Course;
import com.fullteaching.backend.coursedetails.CourseDetails;
import com.fullteaching.backend.filegroup.FileGroup;
import com.fullteaching.backend.forum.Forum;


public class TesteUnidadeMockitoCourseDetails {
	
	@Test
	public void testeSetId() {
		CourseDetails coursedetails = new CourseDetails();
		coursedetails.setId(3L);
		assertEquals(coursedetails.getId(), 3L);
	}
	
	@Test
	public void testeSetInfo() {
		CourseDetails coursedetails = new CourseDetails();
		coursedetails.setInfo("John Doe");
		assertEquals(coursedetails.getInfo(), "John Doe");
	}
	
	@Test
	public void testeSetForum() {
		CourseDetails coursedetails = new CourseDetails();
		Forum forum = new Forum();
		coursedetails.setForum(forum);
		assertEquals(coursedetails.getForum(), forum);
	}
	
	@Test
	public void testeSetFiles() {
		CourseDetails coursedetails = new CourseDetails();
		List<FileGroup> lista = new ArrayList<>();	
		coursedetails.setFiles(lista);
		assertEquals(coursedetails.getFiles(), lista);
	}
	
	@Test
	public void testeSetCourse() {
		CourseDetails coursedetails = new CourseDetails();
		Course course = new Course();
		coursedetails.setCourse(course);
		assertEquals(coursedetails.getCourse(), course);
	}
	
	@Test
	public void testeSetIdCourse() {
		Course course = new Course();
		CourseDetails coursedetails = new CourseDetails(course);
		coursedetails.setId(3L);
		assertEquals(coursedetails.getId(), 3L);
	}
	
	@Test
	public void testeSetInfoCourse() {
		Course course = new Course();
		CourseDetails coursedetails = new CourseDetails(course);
		coursedetails.setInfo("John Doe");
		assertEquals(coursedetails.getInfo(), "John Doe");
	}
	
	@Test
	public void testeSetForumCourse() {
		Course course = new Course();
		CourseDetails coursedetails = new CourseDetails(course);
		Forum forum = new Forum();
		coursedetails.setForum(forum);
		assertEquals(coursedetails.getForum(), forum);
	}
	
	@Test
	public void testeSetFilesCourse() {
		Course course = new Course();
		CourseDetails coursedetails = new CourseDetails(course);
		List<FileGroup> lista = new ArrayList<>();	
		coursedetails.setFiles(lista);
		assertEquals(coursedetails.getFiles(), lista);
	}
	

}
