package base;

import PropertyFile.PropertyFile;
import org.junit.After;
import org.junit.Before;

import java.util.HashMap;

public class Hooks extends BaseTest{

    public HashMap<String, String> testData;

    @Before
    public void setUp(){
        initiateDriver();
        String className = this.getClass().getSimpleName();
        PropertyFile propertyFile = new PropertyFile(className);
        testData = propertyFile.getAllValues();
    }

    @After
    public void clearEnv(){

    }
}
