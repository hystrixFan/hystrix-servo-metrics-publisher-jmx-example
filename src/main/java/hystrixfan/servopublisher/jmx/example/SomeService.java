package hystrixfan.servopublisher.jmx.example;

import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * Created by hystrixFan on 13.02.2017.
 */
@Service
public class SomeService {
  private final RemoteService remoteService;

  public SomeService(RemoteService remoteService) {
    this.remoteService = remoteService;
  }

  @HystrixCommand(fallbackMethod = "fallBack")
  public String callRemoteService() {
    return remoteService.call();
  }

  public String fallBack() {
    return "fallBack called";
  }
}
