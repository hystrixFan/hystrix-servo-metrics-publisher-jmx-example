package hystrixfan.servopublisher.jmx.example;

import org.apache.commons.lang.math.RandomUtils;
import org.springframework.stereotype.Service;

/**
 * Created by hystrixFan on 13.02.2017.
 */
@Service
public class RemoteService {
  public String call() {
    int randomInt = RandomUtils.nextInt(9);
    if (randomInt == 4) {
      throw new RemoteServiceException("Remote Service Exception");
    } else if (randomInt == 5) {
      delay(3000);
    }

    return "Answer from RemoteService";
  }

  private void delay(int millis) {
    try {
      Thread.sleep(millis);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
