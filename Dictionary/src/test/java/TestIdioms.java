import org.junit.Test;
import org.junit.Assert;

public class TestIdioms {

    @Test
    public void TestIdioms() throws Exception{
        Assert.assertEquals("Hola", main.java.i18NManager.getInstance("ca").getText("ca", "l1"));
        Assert.assertEquals("Bye", main.java.i18NManager.getInstance("en").getText("en", "l2"));
        Assert.assertEquals("Hallo", main.java.i18NManager.getInstance("de").getText("de", "l1"));
        Assert.assertEquals("Olá", main.java.i18NManager.getInstance("po").getText("po", "l1"));
        Assert.assertEquals("Adiós", main.java.i18NManager.getInstance("es").getText("es", "l2"));
    }

    @Test
    public void TestNoIdioms() throws  Exception{
        Assert.assertEquals("Jelou", main.java.i18NManager.getInstance("le").getText("le","l1"));
    }
}
