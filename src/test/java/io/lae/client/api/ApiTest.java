package io.lae.client.api;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;

import io.lae.interceptor.SignerInterceptor;
import io.lae.client.ApiClient;
import io.lae.client.ApiException;
import io.lae.client.model.CatalogoSegmento;
import io.lae.client.model.PeticionFolioConsulta;
import io.lae.client.model.Respuesta;
import okhttp3.OkHttpClient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ApiTest {
	
	private Logger logger = LoggerFactory.getLogger(ApiTest.class.getName());
	private final LoanAmountEstimatorApi api = new LoanAmountEstimatorApi();
	private String xApiKey = "your_api_key";
	private String username = "your_username";
	private String password = "your_password";	
	
	private ApiClient apiClient = null;

	@Before()
	public void setUp() {
		this.apiClient = api.getApiClient();
		this.apiClient.setBasePath("the_url");
		OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
			    .readTimeout(30, TimeUnit.SECONDS)
			    .addInterceptor(new SignerInterceptor())
			    .build();
		apiClient.setHttpClient(okHttpClient);
	}

	@Test
	public void getLAEByFolioConsultaTest() throws ApiException {
		PeticionFolioConsulta request = new PeticionFolioConsulta();
		
		request.setFolioOtorgante("1");
		request.setSegmento(CatalogoSegmento.PP);
		request.setFolioConsulta("386636538");
		
		Respuesta response = api.getLAEByFolioConsulta(this.xApiKey, this.username, this.password, request);
		logger.info(response.toString());
	}

}
