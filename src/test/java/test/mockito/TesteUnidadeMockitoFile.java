/*
  Alunos: 
  Filipe Pires da Silva
  Pautércio Ramilson Oliveira da Silva
  Paulo Henrique Soares dos Santos
*/ 

package test.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.fullteaching.backend.file.File;


public class TesteUnidadeMockitoFile {
	
	@Test
	public void testeSetId() {
		File file = new File();
		file.setId(3L);
		assertEquals(file.getId(), 3L);
	}
	
	@Test
	public void testeSetType() {
		File file = new File();
		file.setType(3);
		assertEquals(file.getType(), 3);
	}
	
	@Test
	public void testeSetName() {
		File file = new File();
		file.setName("John Doe");
		assertEquals(file.getName(), "John Doe");
	}
	
	@Test
	public void testeSetNameIdent() {
		File file = new File();
		file.setNameIdent("John Doe");
		assertEquals(file.getNameIdent(), "John Doe");
	}
	
	@Test
	public void testeSetLink() {
		File file = new File();
		file.setLink("John Doe");
		assertEquals(file.getLink(), "John Doe");
	}
	
	@Test
	public void testeSetIndexOrder() {
		File file = new File();
		file.setIndexOrder(3);
		assertEquals(file.getIndexOrder(), 3);
	}

}
