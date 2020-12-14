/*
  Alunos: 
  Filipe Pires da Silva
  Pautércio Ramilson Oliveira da Silva
  Paulo Henrique Soares dos Santos
*/ 

package test.eclemma;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.fullteaching.backend.entry.Entry;
import com.fullteaching.backend.forum.Forum;

public class TesteUnidadeMockitoForum {
	
	@Test
	public void testeSetId() {
		Forum forum = new Forum();
		forum.setId(3L);
		assertEquals(forum.getId(), 3L);
	}
	
	@Test
	public void testeIsActivated() {
		Forum forum = new Forum();
		forum.setActivated(true);
		assertEquals(forum.isActivated(), true);
	}
	
	@Test
	public void testeSetEntries() {
		Forum forum = new Forum();
		List<Entry> lista = new ArrayList<>();
		forum.setEntries(lista);
		assertEquals(forum.getEntries(), lista);
	}
	
	@Test
	public void testeSetIdActivated() {
		Forum forum = new Forum(true);
		forum.setId(3L);
		assertEquals(forum.getId(), 3L);
	}
	
	@Test
	public void testeIsActivatedActivated() {
		Forum forum = new Forum(true);
		forum.setActivated(true);
		assertEquals(forum.isActivated(), true);
	}
	
	@Test
	public void testeStringToString() {
		Forum forum = new Forum();
		forum.setActivated(true);
		List<Entry> lista = new ArrayList<>();
		forum.setEntries(lista);
		String comparacao = "Forum[activated: \"" + forum.isActivated() + "\", #entries: \"" + 0 + "\", #comments: \"" + 0 + "\"]";
		assertEquals(forum.toString(), comparacao);
	}
	

}
