package app.model;

import app.entities.User;
import com.sun.org.apache.bcel.internal.generic.LUSHR;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Model {
    private static Model instance = new Model();
    private List<User> model = new ArrayList<User>();

    public static Model getInstance(){
    return instance;
    }

    private Model(){
    }

    public void add (User user){
        model.add(user);
    }

    public List<String> list() {
    return model.stream().map(User::getName).collect(Collectors.toList());
    }

    public String delete(User u) {

        if (model.contains(u)) {
            model.remove(u);
            return u.getName();
        }
        return null;
    }
}
