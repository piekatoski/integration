import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class UserBusinessTest {

    @InjectMocks
    UserBusiness business;

    @Test
    public void CannotCreateUserWithoutAName(){
        User user =  new User("teste","teste","","teste");
        Assert.assertEquals(business.create(user), null);
    }

    @Test
    public void CannotCreateUserWithoutAMail(){
        User user =  new User("teste","","teste","teste");
        Assert.assertEquals(business.create(user), null);
    }

    @Test
    public void CannotCreateUserWithoutALogin(){
        User user =  new User("","teste","teste","teste");
        Assert.assertEquals(business.create(user), null);
    }

    @Test
    public void CannotCreateUserWithoutAPassword(){
        User user =  new User("teste","teste","teste","");
        Assert.assertEquals(business.create(user), null);
    }

}
