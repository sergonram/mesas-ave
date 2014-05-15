package com.bigomby.tables;

import com.bigomby.compartemesa.City;
import com.bigomby.compartemesa.Departure;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by diego on 14/05/14.
 */
public class Table {

    List<User> users;
    City destiny;
    City origin;
    Departure departure;

    Table(){
        users = new ArrayList<User>();
    }

    public void addUser(User user) {
        this.users.add(user);
    }

    public void removeUser(User user) {
        this.users.remove(user);
    }

    City getOrigin() {
        return origin;
    }

    City getDestiny() {
        return destiny;
    }
}
