import org.junit.Assert;
import org.junit.Test;

public class TestDemo {
    @Test
    public void whenGiven_Value_of_FirstName_should_Return_True() {
        UserRegistration obj1 = new UserRegistration();
        boolean result = obj1.checkFirstName("Prasad");
        Assert.assertTrue(result);
    }

    @Test
    public void whenGiven_Value_of_FirstName_should_Return_False() {
        boolean b=UserRegistration.checkLastName("pRa@123");
        Assert.assertFalse(b);
    }

    @Test
    public void whenGiven_Value_of_LastName_should_Return_True() {
        UserRegistration obj2 = new UserRegistration();
        boolean result = obj2.checkLastName("Palkar");
        Assert.assertTrue(result);
    }

    @Test
    public void whenGiven_Value_of_LastName_should_Return_False() {
        boolean b=UserRegistration.checkLastName("pAlkar");
        Assert.assertFalse(b);
    }

    @Test
    public void check_Whether_Given_Email_IS_Valid() {
        UserRegistration obj3 = new UserRegistration();
        boolean result = obj3.checkEmail("abc_123@gmail.com");
        Assert.assertTrue(result);
    }
}
