import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.java.i18NManager;
import java.util.MissingResourceException;

public class TestIdioms {

    i18NManager i18n;

    @Before
    public void setUp() throws Exception
    {
        this.i18n = i18NManager.getInstance();
    }

    @After
    public void tearDown() throws Exception
    {
        this.i18n.getInstance().clear();
    }

    @Test
    public void TestIdioms() throws Exception{
        Assert.assertEquals("Hola", i18NManager.getInstance().getText("ca", "l1"));
        Assert.assertEquals("Bye", i18NManager.getInstance().getText("en", "l2"));
        Assert.assertEquals("Hallo", i18NManager.getInstance().getText("de", "l1"));
        Assert.assertEquals("Olá", i18NManager.getInstance().getText("po", "l1"));
        Assert.assertEquals("Adiós", i18NManager.getInstance().getText("es", "l2"));
    }

    @Test(expected = MissingResourceException.class)
    public void TestNoIdioms() throws  Exception{
        Assert.assertEquals("Jelou", i18NManager.getInstance().getText("le","l1"));
    }
}
