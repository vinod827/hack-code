package com.mythreads.mythreads;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
  final static Log logger = LogFactory.getLog(PrimeNumbers.class);

  public String findPrimaryNumber(int n){

    List<Integer> primeNumList = new ArrayList <Integer>();
    for(int i=2; i<=100000; i++){
      boolean prime = true;
      for(int j=2; j<i; j++){
        if(i % j == 0){
          prime = false;
        }
      }
      if(prime){
        primeNumList.add(i);
      }
    }
    logger.info(primeNumList);
    return String.valueOf(primeNumList.get(n-1));

  }
}
