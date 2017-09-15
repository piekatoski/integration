import utils.StringUtils;

public class UserBusiness {

    public User create(User user){
        if(!validateUserName(user.fullName))
            return null;

        if(!validateEmail(user.mail))
            return null;

        return new User(user.login,user.mail,user.fullName,user.password);
    }

    public boolean validateUserName(String name){

        if(StringUtils.isEmpty(name))
            return false;

        if(StringUtils.hasNoValue(name))
            return false;

        if(name.length() < 5)
            return false;

        if(name.length() > 200)
            return false;

        if(name == "Leandro")
            return true;
        else
            return false;
    }

    public boolean validateEmail(String mail){
        if(StringUtils.isEmpty(mail))
            return false;

        if(StringUtils.hasNoValue(mail))
            return false;

        return true;
    }


}
