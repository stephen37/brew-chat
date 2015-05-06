package com.example.brewchat;

import java.util.ArrayList;

public interface IChatService {

    void login(String username, String password);

    void register(String username, String password);

    void loadContacts();

    void logout();

    void getChatDialogs();

    void addChatGroup(String title, ArrayList<Integer> userIds);
}
