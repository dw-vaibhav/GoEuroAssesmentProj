package com.euro.goeuroassesmentproj;

import com.euro.model.City;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.codehaus.jackson.map.JsonMappingException;

/**
 *
 * @author Vaibhav Dwivedi
 */
public class GoEuroAssesment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if(args.length < 1){
            System.out.println("Please Enter City Name"); 
            return;
        }
        if(args.length > 1){
            System.out.println("Please Enter One City Name at a Time"); 
            return;
        }
        String cityName = args[0];
        if(cityName.trim().length() <= 0){
            System.out.println("Please Enter a Valid City Name"); 
            return;
        }
        System.out.println("Fetching Data For "+ cityName);
        String URL = GoEuroProperty.getInstance().getProperty("URL");
        URL = URL+cityName;
        
        GoEuroClient client = new GoEuroClient();
        List<City> cityList=null;
        
        try {
            cityList = client.client(URL);
        } catch (JsonMappingException ex) {
            Logger.getLogger(GoEuroAssesment.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GoEuroAssesment.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String outputFile = GoEuroProperty.getInstance().getProperty("DIRECTORY")+"\\"+cityName+".csv";
        try {
            Utilities.generateCsvFile(outputFile, cityList);
            System.out.println("Data for "+cityName+" has been generated in File "+ outputFile); 
        } catch (IOException ex) {
            Logger.getLogger(GoEuroAssesment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
