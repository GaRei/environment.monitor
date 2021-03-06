package org.yagel.environment.monitor.test.extension.provider;


import org.yagel.environment.monitor.test.util.StatusRandomizer;
import org.yagel.monitor.EnvironmentConfig;
import org.yagel.monitor.Resource;
import org.yagel.monitor.resource.ResourceImpl;
import org.yagel.monitor.resource.Status;

public class DataBaseStatusProvider extends AbstractResourceStatusProvider {


  public DataBaseStatusProvider(EnvironmentConfig config) {
    super(config);
  }

  @Override
  public String getName() {
    return null;
  }

  @Override
  public Status reloadStatus() {
    return StatusRandomizer.random();

  }

  @Override
  public Resource getResource() {
    return new ResourceImpl("DataBase", "Environment DataBase");
  }
}
