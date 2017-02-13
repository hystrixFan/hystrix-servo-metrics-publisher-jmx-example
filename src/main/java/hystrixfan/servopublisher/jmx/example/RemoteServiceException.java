package hystrixfan.servopublisher.jmx.example;

/**
 * Created by hystrixFan on 13.02.2017.
 */
public class RemoteServiceException extends RuntimeException {
  public RemoteServiceException(String message) {
    super(message);
  }
}
