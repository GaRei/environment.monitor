package org.yagel.monitor.resource;

import org.yagel.monitor.StatusUpdate;

import java.util.Date;

public class StatusUpdateImpl implements StatusUpdate {

  private Status status;
  private Date updated = new Date();


  public StatusUpdateImpl(Status status, Date updated) {
    this.status = status;
    this.updated = updated;
  }

  @Override
  public Status getStatus() {
    return status;
  }

  @Override
  public void setStatus(Status status) {
    this.status = status;
  }

  @Override
  public Date getUpdated() {
    return updated;
  }

  @Override
  public void setUpdated(Date updated) {
    this.updated = updated;
  }
}
