package org.yagel.monitor;

import org.yagel.monitor.resource.Status;

import java.util.Date;


// todo merge with resource status??
public interface StatusUpdate {

  Status getStatus();

  void setStatus(Status status);

  Date getUpdated();

  void setUpdated(Date updated);
}
