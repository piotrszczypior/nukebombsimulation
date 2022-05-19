package com.example.nukebombsimulation.fileutilities;

import com.example.nukebombsimulation.properties.ApplicationProperties;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {

    List<ApplicationProperties> applicationPropertiesList = new ArrayList<>();

    public List<ApplicationProperties> downloadData(String filePath)
    {
        applicationPropertiesList.clear();
        File file = new File(filePath);

        try {
            Scanner scanner = new Scanner(file);

            while(scanner.hasNext())
            {
                String[] properties = scanner.next().split(",");
                applicationPropertiesList.add(new ApplicationProperties(properties));
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        return applicationPropertiesList;
    }
}
