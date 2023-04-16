import org.example.mymavenassignment.WebApp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,classes = WebApp.class)
 public class WebAppIntegrationTest {
    @LocalServerPort
    public int port=8080;
     private final TestRestTemplate restTemplate = new TestRestTemplate(TestRestTemplate.HttpClientOption.ENABLE_REDIRECTS);

     @Test
     public void testGetMessage() throws Exception {
         String url = "http://localhost:"+port+"/webapp";
         String response = restTemplate.getForObject (url, String.class);
         assertThat(response).isEqualTo("Hello, world!");
     }
 }
