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
    public void ensureCannotCreateUserWithoutAName(){
        User user =  new User("teste","teste","","teste");
        Assert.assertEquals(business.create(user), null);
    }

    /*@Test
    public void ensureCannotCreateUserWithoutAMail(){
        User user =  new User("teste","","teste","teste");
        Assert.assertEquals(business.create(user), null);
    }

    @Test
    public void ensureCannotCreateUserWithoutALogin(){
        User user =  new User("","teste","teste","teste");
        Assert.assertEquals(business.create(user), null);
    }

    @Test
    public void ensureCannotCreateUserWithoutAPassword(){
        User user =  new User("teste","teste","teste","");
        Assert.assertEquals(business.create(user), null);
    }

    @Test
    public void ensureEmailsIsNotValid(){
        User user =  new User("teste","teste","teste","");
        boolean valid = business.validateEmail(user.mail);
        Assert.assertEquals(valid, false);

    }*/

    @Test
    public void ensureEmailIsValid(){
        User user =  new User("teste","teste@email.com","teste","");
        boolean valid = business.validateEmail(user.mail);
        Assert.assertEquals(valid, true);

    }

    @Test
    public void ensureNameIsValid(){
        User user =  new User("teste","teste@email.com","Leandro","123");
        boolean valid = business.validateUserName(user.fullName);
        Assert.assertEquals(valid, true);
    }

    @Test
    public void ensureNameIsNotValid(){
        User user =  new User("teste","teste@email.com","Leandro2","123");
        boolean valid = business.validateUserName(user.fullName);
        Assert.assertEquals(valid, false);
    }

}
