import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestXQueue {
    MyQueue<String> q;

    @Before
    public void setUp() throws Exception{
        this.q = new MyQueue<String>(5);
        this.q.push("1");
        this.q.push("2");
        this.q.push("3");
    }

    @Test
    public void testPush1() throws Exception{
        Assert.assertEquals(3, this.q.size());
        this.q.push("4");
        Assert.assertEquals(4, this.q.size());
    }

    @Test
    public void testPush2() throws Exception{
        Assert.assertEquals(3, this.q.size());
        this.q.push("4");
        this.q.push("5");
        Assert.assertEquals(5, this.q.size());
    }

    @Test(expected = FullQueueException.class)
    public void testPushFull() throws Exception{
        Assert.assertEquals(3, this.q.size());
        this.q.push("4");
        this.q.push("5");
        this.q.push("6");
        Assert.assertEquals(5, this.q.size());
    }

    @Test
    public void TestPop1() throws Exception
    {
        Assert.assertEquals(3, this.q.size());
        this.q.pop();
        this.q.pop();
        this.q.pop();
        Assert.assertEquals(0, this.q.size());
    }

    @Test(expected = EmptyQueueException.class)
    public void TestPop2() throws Exception
    {
        Assert.assertEquals(3, this.q.size());
        this.q.pop();
        this.q.pop();
        this.q.pop();
        this.q.pop();
        Assert.assertEquals(-1, this.q.size());
    }

    @After
    public void tearDown()
    {
        this.q = null;
    }
}