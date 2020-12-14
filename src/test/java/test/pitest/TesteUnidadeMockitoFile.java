/*
  Alunos: 
  Filipe Pires da Silva
  Pautércio Ramilson Oliveira da Silva
  Paulo Henrique Soares dos Santos
*/ 

package test.pitest;

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
	
	@Test
	public void testeFile2Parametros() {
		int type = 1;
		String name = "John Doe";
		File file = new File(type, name);
		assertEquals(file.getType(), 1);
		assertEquals(file.getName(), "John Doe");
	}
    
	@Test
	public void testeFile3Parametros() {
		int type = 1;
		String name = "John Doe";
		String link = "www.teste.com";
		File file = new File(type, name, link);
		assertEquals(file.getType(), 1);
		assertEquals(file.getName(), "John Doe");
		assertEquals(file.getLink(), "www.teste.com");
	}
	
	@Test
	public void testeFile4Parametros() {
		int type = 1;
		String name = "John Doe";
		String link = "www.teste.com";
		int indexOrder = 2;
		File file = new File(type, name, link, indexOrder);
		assertEquals(file.getType(), 1);
		assertEquals(file.getName(), "John Doe");
		assertEquals(file.getLink(), "www.teste.com");
		assertEquals(file.getIndexOrder(), 2);
	}
	
	@Test
	public void testeStringToString() {
		int type = 1;
		String name = "John Doe";
		String link = "www.teste.com";
		int indexOrder = 2;
		String nameIdent = "JD";
		File file = new File(type, name, link, indexOrder);
		file.setNameIdent(nameIdent);
		String comparacao = "File[name: \"" + name + "\", id: \"" + nameIdent + "\", link: \"" + link + ", indexOrder: " + indexOrder + "]";
		assertEquals(file.toString(), comparacao);
		
	}
	public void testeGetFileExtension(){
		String nameIdent = "JD.pdf";
		File file = new File();
		file.setNameIdent(nameIdent);
		assertEquals(file.getFileExtension(), ".pdf");
	}
}
