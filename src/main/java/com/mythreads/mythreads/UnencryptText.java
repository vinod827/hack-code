package com.mythreads.mythreads;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class UnencryptText {
  final static Log logger = LogFactory.getLog(UnencryptText.class);
  
  public String getUnencryptedText(String encryptedText){
    StringBuffer word = new StringBuffer();
    for(int i=0; i<encryptedText.length(); i++){
      int charValue = encryptedText.charAt(i);
      String nextChar = String.valueOf((char) (charValue + 3));
      word.append(nextChar);
    }
    return word.toString();
  }
  
}
