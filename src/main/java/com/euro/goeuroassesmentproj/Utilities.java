package com.euro.goeuroassesmentproj;

import com.euro.model.City;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Vaibhav Dwivedi
 */
public class Utilities {

    public static void generateCsvFile(String sFileName, List<City> cityList) throws IOException {
        try {

            File file = new File(sFileName);
            file.getParentFile().mkdir();
            // creates the file
            file.createNewFile();
            // creates a FileWriter Object
            FileWriter writer = new FileWriter(file);

            if (cityList == null || cityList.size() <= 0) {
                writer.append("There is No Data available for this City");
            } else {

                writer.append("ID");
                writer.append(',');
                writer.append("NAME");
                writer.append(',');
                writer.append("TYPE");
                writer.append(',');
                writer.append("LATITUDE");
                writer.append(',');
                writer.append("LONGITUDE");
                writer.append('\n');

                for (City city : cityList) {
                    writer.append(city.getId());
                    writer.append(',');
                    writer.append(city.getName());
                    writer.append(',');
                    writer.append(city.getType());
                    writer.append(',');
                    writer.append(city.getGeo_position().getLatitude());
                    writer.append(',');
                    writer.append(city.getGeo_position().getLongitude());
                    writer.append('\n');

                }
            }

            writer.flush();
            writer.close();
        } catch (IOException e) {
            throw new IOException("An Error Occured During File Writting Operation", e.getCause());
        }
    }
}
