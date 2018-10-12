package com.mythreads.mythreads;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MyThread implements Runnable {
  final static Log logger = LogFactory.getLog(MyThread.class);

  private int id;

  private String name;

  public MyThread(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  @Override public void run() {
    logger.info("Thread started");
    logger.info("Id: "+id+"Name: "+name);
    logger.info("Thread stopping");
  }
}
