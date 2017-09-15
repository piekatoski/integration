package utils;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class StringUtilsTest {

    @Test
    public void ensureStringIsEmpty(){
        Assert.assertTrue(StringUtils.isEmpty(""));
    }

    @Test
    public void ensureStringIsNotEmpty(){
        Assert.assertFalse(StringUtils.isEmpty(" "));
    }

    @Test
    public void ensureStringHasValue(){
        Assert.assertTrue(StringUtils.hasNoValue(" "));
    }

    @Test
    public void ensureStringHasNoValue(){
        Assert.assertFalse(StringUtils.isEmpty(" "));
    }

}
