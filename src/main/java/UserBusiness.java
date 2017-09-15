public class UserBusiness {

    public User create(User user){
        if(user.fullName.length() == 0) {
            return null;
        }

        if(user.fullName.length() < 5)
            return null;

        if(user.fullName.length() == 0)
            return null;

        if(validate(user))
            return new User(user.login,user.mail,user.fullName,user.password);
        else
            return null;
    }

    public boolean validate(User user){
        if(user.fullName == "Leandro")
            return true;
        else
            return false;
    }
}
