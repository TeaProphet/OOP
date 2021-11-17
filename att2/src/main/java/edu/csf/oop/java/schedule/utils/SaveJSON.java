package edu.csf.oop.java.schedule.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

public class SaveJSON {
    public static void saveObjectAs (Object object) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(Paths.get("./saves/schedule.json").toFile(), object);
    }

    public static Object restoreObjectFrom(File file, Class clazz) throws IOException {
        // create object mapper instance
        ObjectMapper mapper = new ObjectMapper();

        // convert JSON string to Book object
        return mapper.readValue(file, clazz);
    }
}
