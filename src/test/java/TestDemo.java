import org.junit.Assert;
import org.junit.Test;

public class TestDemo {
    @Test
    public void whenGiven_Value_of_FirstName_should_Return_True() {
        UserRegistration obj1 = new UserRegistration();
        boolean result = obj1.checkFirstName("Prasad");
        Assert.assertTrue(result);
    }


}
