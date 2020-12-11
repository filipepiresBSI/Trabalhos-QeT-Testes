/*
  Alunos: 
  Filipe Pires da Silva
  Pautércio Ramilson Oliveira da Silva
  Paulo Henrique Soares dos Santos
*/ 

package test.mockito;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3Client;
import com.fullteaching.backend.security.AuthorizationService;

public class TesteUnidadeMockitoApplication {
	
	@Test
	public void testeAuthorizationService() throws Exception {
		
		AuthorizationService autorizacao = Mockito.mock(AuthorizationService.class);
		Mockito.verify(autorizacao);
	}
	
	@Test
	public void testeAWSCredentialsCredential() {
		
	    BasicAWSCredentials credenciais = new BasicAWSCredentials("0001", "ab01");
	    assertEquals(credenciais.getAWSAccessKeyId(), "0001");
	    assertEquals(credenciais.getAWSSecretKey(), "ab01");
	}
	
	@Test
    public void testeAmazonS3S3client() {
	
		BasicAWSCredentials credenciais = new BasicAWSCredentials("0001", "ab01");
	    AmazonS3Client amz = new AmazonS3Client(credenciais);
	    assertTrue(amz != null);
	    
	}
	
}
