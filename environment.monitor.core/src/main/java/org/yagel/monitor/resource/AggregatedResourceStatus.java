package org.yagel.monitor.resource;

import org.yagel.monitor.Resource;

import java.util.List;

public class AggregatedResourceStatus {

  private Resource resource;
  private List<AggregatedStatus> resourceStatuses;

  private long count;

  public Resource getResource() {
    return resource;
  }

  public void setResource(Resource resource) {
    this.resource = resource;
  }

  public List<AggregatedStatus> getResourceStatuses() {
    return resourceStatuses;
  }

  public void setResourceStatuses(List<AggregatedStatus> resourceStatuses) {
    this.resourceStatuses = resourceStatuses;
  }

  public long getCount() {
    return count;
  }

  public void setCount(long count) {
    this.count = count;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("AggregatedResourceStatus{");
    sb.append("resource=").append(resource);
    sb.append(", resourceStatuses=").append(resourceStatuses);
    sb.append(", count=").append(count);
    sb.append('}');
    return sb.toString();
  }
}
