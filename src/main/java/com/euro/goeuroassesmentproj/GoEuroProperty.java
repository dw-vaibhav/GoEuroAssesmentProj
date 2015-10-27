package com.euro.goeuroassesmentproj;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author Vaibhav Dwivedi
 */
public class GoEuroProperty {
    
    private Properties props;
    private static GoEuroProperty instance; 

    private GoEuroProperty() {
        props = new Properties();
        InputStream input = null;
        
        try {

		//input = new FileInputStream("config.properties");
                input = GoEuroAssesment.class.getClassLoader().getResourceAsStream("config.properties");
    		if(input==null){
    	            System.out.println("Sorry, unable to find " + "config.properties");
    		    return;
    		}
		// load a properties file
		props.load(input);
	} catch (IOException ex) {
		ex.printStackTrace();
	} finally {
		if (input != null) {
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

        
    }
    
    public static GoEuroProperty getInstance(){
         if(instance == null) {
         instance = new GoEuroProperty();
      }
      return instance;
    }
    
   public String getProperty(String propName){
       return props.getProperty(propName);
   }
    
    
  
    
}
