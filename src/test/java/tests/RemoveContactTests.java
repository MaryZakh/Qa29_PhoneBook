package tests;

import models.User;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RemoveContactTests extends TestBase{

    @BeforeMethod
    public void preCondition(){
        if(!app.getHelperUser().isLogged()){
            app.getHelperUser().login(new User().withEmail("margo@gmail.com").withPassword("Mmar123456$"));
        }

       // app.getHelperContact().provideContacts();
    }

    @Test
    public void removeFirstContact(){
        //Asset size list less by one
    }

    @Test
    public void removeAllContacts(){
        //"No Contacts Here"
    }


}
