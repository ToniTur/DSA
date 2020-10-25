import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.java.i18NManager;
import java.util.MissingResourceException;

public class TestIdioms {

    @Test
    public void TestIdioms() throws Exception{
        Assert.assertEquals("Hola", i18NManager.getInstance("ca").getText("ca", "l1"));
        Assert.assertEquals("Bye", i18NManager.getInstance("en").getText("en", "l2"));
        Assert.assertEquals("Hallo", i18NManager.getInstance("de").getText("de", "l1"));
        Assert.assertEquals("Olá", i18NManager.getInstance("po").getText("po", "l1"));
        Assert.assertEquals("Adiós", i18NManager.getInstance("es").getText("es", "l2"));
    }

    @Test(expected = MissingResourceException.class)
    public void TestNoIdioms() throws  Exception{
        Assert.assertEquals("Jelou", i18NManager.getInstance("le").getText("le","l1"));
    }
}
