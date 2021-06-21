package net.marakaner.gamehandler.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;
import java.io.IOException;

public class ConfigService {

    private static ConfigService instance;

    private ObjectMapper mapper;

    private ConfigService() {
        mapper = new ObjectMapper(new YAMLFactory());
    }

    public <T> void parseFile(String path, T t) {

        String tempPath = "";
        String[] seperatedPath = path.split("/");

        for(String all : seperatedPath) {
            if(all.contains(".")) {

                tempPath = tempPath + all;

                File file = new File(tempPath);

                if(!file.exists()) {
                    try {
                        file.createNewFile();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            } else {
                tempPath = tempPath + all;

                File file = new File(tempPath);

                if(!file.exists()) {
                    file.mkdir();
                }

                tempPath = tempPath + "/";
            }
        }

        try {
            mapper.writeValue(new File(path), t);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public <T> T readFile(String path, Class<? extends T> clazz) {
        try {
            return mapper.readValue(new File(path), clazz);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public boolean fileExists(String path) {
        return new File(path).exists();
    }

    public static ConfigService getInstance() {
        if(instance == null) instance = new ConfigService();
        return instance;
    }
}
