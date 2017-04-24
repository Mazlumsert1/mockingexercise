package exercise;

import exercise.IUserFacade;
import exercise.UserFacadeTest;
import exercise.realdatabase.UserFacadeRealDB;

/**
 * Created by mazlumsert on 24/04/2017.
 */
public class UserFacadeTestIT extends UserFacadeTest {

    @Override
    public IUserFacade makeUserFacade() {
        return new UserFacadeRealDB("pu_localDB");
    }




}
