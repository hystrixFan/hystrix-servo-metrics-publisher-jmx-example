package hystrixfan.servopublisher.jmx.example;

import com.netflix.hystrix.contrib.servopublisher.HystrixServoMetricsPublisher;
import com.netflix.hystrix.strategy.HystrixPlugins;

/**
 * Created by hystrixFan on 13.02.2017.
 */
public class HystrixConfig {
  static {
    HystrixPlugins.getInstance().registerMetricsPublisher(HystrixServoMetricsPublisher.getInstance());
  }
}
