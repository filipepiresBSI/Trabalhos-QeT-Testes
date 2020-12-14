/*
  Alunos: 
  Filipe Pires da Silva
  Pautércio Ramilson Oliveira da Silva
  Paulo Henrique Soares dos Santos
*/ 

package test.pitest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.fullteaching.backend.file.File;
import com.fullteaching.backend.filegroup.FileGroup;

public class TesteUnidadeMockitoFileGroup {
	
	@Test
	public void testeSetId() {
		FileGroup fg = new FileGroup();
		fg.setId(3L);
		assertEquals(fg.getId(), 3L);
	}
	
	@Test
	public void testeSetTitle() {
		FileGroup fg = new FileGroup();
		fg.setTitle("Jane Doe");
		assertEquals(fg.getTitle(), "Jane Doe");
	}
	
	@Test
	public void testeSetFiles() {
		FileGroup fg = new FileGroup();
		List<File> lista = new ArrayList<>();
		fg.setFiles(lista);
		assertEquals(fg.getFiles(), lista);
	}
	
	@Test
	public void testeSetFileGroups() {
		FileGroup fg = new FileGroup();
		List<FileGroup> lista = new ArrayList<>();
		fg.setFileGroups(lista);
		assertEquals(fg.getFileGroups(), lista);
	}
	
	@Test
	public void testeSetFileGroupParent() {
		FileGroup fg1 = new FileGroup();
		FileGroup fg2 = new FileGroup();
		fg1.setFileGroupParent(fg2);
		assertEquals(fg1.getFileGroupParent(), fg2);
	}
		

}
