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

import com.fullteaching.backend.comment.Comment;
import com.fullteaching.backend.entry.Entry;
import com.fullteaching.backend.user.User;


public class TesteUnidadeMockitoEntry {

	
	@Test
	public void testeSetId() {
		Entry entry = new Entry();
		entry.setId(3L);
		assertEquals(entry.getId(), 3L);
	}
	
	@Test
	public void testeSetTitle() {
		Entry entry = new Entry();
		entry.setTitle("John Doe");
		assertEquals(entry.getTitle(), "John Doe");
	}
	
	@Test
	public void testeSetDate() {
		Entry entry = new Entry();
		entry.setDate(10122020L);
		assertEquals(entry.getDate(), 10122020L);
	}
	
	@Test
	public void testeSetComments() {
		Entry entry = new Entry();
		List<Comment> lista = new ArrayList<>(); 
		entry.setComments(lista);
		assertEquals(entry.getComments(), lista);
	}
	
	@Test
	public void testeSetUser() {
		Entry entry = new Entry();
		User user = new User();
		entry.setUser(user);
		assertEquals(entry.getUser(), user);
	}
	
	@Test
	public void testeEntry3Parametros() {
		String title = "John Doe";
		long id = 0;
		User user = new User();
		Entry entry = new Entry(title, id, user);
		assertEquals(entry.getTitle(), title);
		assertEquals(entry.getId(), id);
		assertEquals(entry.getUser(), user);
	}
}
