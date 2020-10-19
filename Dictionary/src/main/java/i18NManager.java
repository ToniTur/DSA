package main.java;

import java.util.HashMap;
import java.util.ResourceBundle;

public class i18NManager {

    private static i18NManager manager;

    HashMap<String, ResourceBundle> data;

    private i18NManager(String language){
        this.data = new HashMap<String, ResourceBundle>();
        ResourceBundle resources = ResourceBundle.getBundle(language);
        this.data.put(language,resources);
    }

    public static i18NManager getInstance(String language){
        manager = new i18NManager(language);
        return manager;
    }

    public String getText(String language, String key){
        String result = null;
        result = this.data.get(language).getString(key);
        return result;
    }
}
