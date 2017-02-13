package hystrixfan.servopublisher.jmx.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hystrixFan on 13.02.2017.
 */
@RestController
public class ExampleController {
  private static final Logger LOG = LoggerFactory.getLogger(ExampleController.class);
  private final SomeService someService;

  public ExampleController(SomeService someService) {
    this.someService = someService;
  }

  @RequestMapping("/")
  public ResponseEntity<String> index() {
    return new ResponseEntity<>("Demo project for hystrix-servo-metrics-publisher via JMX", HttpStatus.INTERNAL_SERVER_ERROR);
  }

  @RequestMapping("/remotecall")
  public String remotecall() {
    String answer = someService.callRemoteService();
    LOG.debug("/call-remote-service: " + answer);
    return answer;
  }
}
