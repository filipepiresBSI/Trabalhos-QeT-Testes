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

import org.assertj.core.util.Arrays;
import org.junit.Test;

import com.fullteaching.backend.comment.Comment;
import com.fullteaching.backend.user.User;


public class TesteUnidadeMockitoComment {
	
	@Test
	public void testeSetId() {
		Comment comment = new Comment();
		comment.setId(3L);
		assertEquals(comment.getId(), 3L);
	}
	
	@Test
	public void testeSetMessage() {
		Comment comment = new Comment();
		comment.setMessage("John Doe");
		assertEquals(comment.getMessage(), "John Doe");
	}
	
	@Test
	public void testeSetDate() {
		Comment comment = new Comment();
		comment.setDate(10122020L);
		assertEquals(comment.getDate(), 10122020L);
	}
	
	@Test
	public void testeSetReplies() {
		Comment comment1 = new Comment();
		Comment comment2 = new Comment();
		Comment comment3 = new Comment();
		comment1.setId(1L);
		comment2.setId(2L);
		comment3.setId(3L);
		comment1.setMessage("Doe1");
		comment2.setMessage("Doe2");
		comment3.setMessage("Doe3");
		comment1.setDate(10122020L);
		comment2.setDate(10122020L);
		comment3.setDate(10122020L);
		comment1.setCommentParent(null);
		comment2.setCommentParent(null);
		comment3.setCommentParent(null);
		List<Comment> lista = new ArrayList<>();
		lista.add(comment1);
		lista.add(comment2);
		lista.add(comment3);
		
		
		Comment teste = new Comment();
		teste.setReplies(lista);
		assertEquals(teste.getReplies(), lista);
	}
	
	@Test
	public void testeSetComment() {
		Comment comment1 = new Comment();
		Comment comment2 = new Comment();
		comment2.setCommentParent(comment1);
		assertEquals(comment2.getCommentParent(), comment1);
	}
	
	@Test
	public void testeSetUser() {
		User user = new User();
		Comment comment = new Comment();
		comment.setUser(user);
		assertEquals(comment.getUser(), user);
	}
	
	@Test
	public void testeStringToString() {
		Comment comment = new Comment();
		Comment comment1 = new Comment();
		Comment comment2 = new Comment();
		Comment comment3 = new Comment();
		comment.setMessage("John Doe 1, John Doe 2 , John Doe 3");
		comment.setDate(10122020L);
		
		String comentario = "Comment[message: \"" + comment.getMessage() + "\", author: \"" + "" + "\", parent: \"" + "null" + "\", #replies: " + 0 + "date: \"" + comment.getDate() + "\"]";
		assertEquals(comment.toString(), comentario);
	}
	
	@Test
	public void testeComment3Parametros() {
		String message = "John Doe";
		long id = 3L;
		User user = new User();
		Comment comment = new Comment(message, id, user);
		comment.setId(3L);
		assertEquals(comment.getId(), 3L);
		assertEquals(comment.getMessage(), "John Doe");
		assertEquals(comment.getUser(), user);
	}
	
	@Test
	public void testeComment4Parametros() {
		String message = "John Doe";
		long id = 3L;
		User user = new User();
		Comment commentParent = new Comment();
		Comment comment = new Comment(message, id, user, commentParent);
		comment.setId(3L);
		assertEquals(comment.getId(), 3L);
		assertEquals(comment.getMessage(), "John Doe");
		assertEquals(comment.getUser(), user);
		assertEquals(comment.getUser(), user);
		
	}

}