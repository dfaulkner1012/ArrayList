package com.company;

import javax.print.DocFlavor;
import java.util.ArrayList;

public class LibraryUsers {
    private ArrayList<String> libraryUsers = new ArrayList<>();

    public void addUsers(String user) {
        this.libraryUsers.add(user);
    }

    // Remove users
    public void removeUsers(String user) {
        this.libraryUsers.remove(user);
    }

    public void searchUsers(String user) {
        this.libraryUsers.contains("Mom");
    }
}
