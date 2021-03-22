package data.dao;

import business.User;
import data.Data;
import java.util.ArrayList;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;

public class UserDAO {

    public static User findByNickname_And_Password(String nickName, String password){
        for(User user : (ArrayList<User>) Data.getUsers()){
            if(nickName.equals(user.getNickname()) && password.equals(user.getPassword())){
                return user;
            }
        }
        return null;
    }
    
}
