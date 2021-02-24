import br.com.maykmoreira.apiexample.model.Movie;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.ResponseErrorHandler;
import org.springframework.web.client.RestTemplate;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

public class BasicMovieServiceTest {

    @Test
    public void getAllMovies()throws URISyntaxException {
//        RestTemplate restTemplate = new RestTemplate();
//        String port = "8080";
//        final String baseUrl = "http://localhost:"+ port + "/movie";
//        URI uri = new URI(baseUrl);
//
//        ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
//
//        //Verify request succeed
//        Assert.assertEquals(200, result.getStatusCodeValue());
    }


}


