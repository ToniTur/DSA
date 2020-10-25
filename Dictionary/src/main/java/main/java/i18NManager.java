package main.java;

import java.util.HashMap;
import java.util.ResourceBundle;
import org.apache.log4j.Logger;

public class i18NManager {

    final static Logger logger = Logger.getLogger(i18NManager.class);

    private static i18NManager manager;

    HashMap<String, ResourceBundle> data;

    private i18NManager(){
        this.data = new HashMap<String, ResourceBundle>();
    }

    public static i18NManager getInstance(){
        manager = new i18NManager();
        return manager;
    }

    public String getText(String language, String key){
        logger.warn("language: " + language + ". key: " + key);
        String result = null;
        ResourceBundle rb = this.data.get((language));
        if (rb == null)
        {
            logger.warn("Bundle '" + language + ".properties' no existeix a la caché de textos");
            rb = ResourceBundle.getBundle(language);
            this.data.put(language,rb);
            logger.warn("S'afegeix bundle a la caché de textos");
        }
        else {
            logger.warn("Bundle '" + language + ".properties' existeix a la caché de textos");
        }
        result = rb.getString(key);
        logger.warn("Resultat: " + result);

        return result;
    }

    public void clear(){
        this.data.clear();
    }
}
