package edu.school21.chat.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {
    private long                idUser;
    private String              login;
    private String              password;
    private List<Chatroom> listCreatedRooms;
    private List<Chatroom> listChatRooms;

    public User(long idUser, String login, String password, List<Chatroom> listCreatedRooms, List<Chatroom> listChatRooms) {
        this.idUser = idUser;
        this.login = login;
        this.password = password;
        this.listCreatedRooms = listCreatedRooms;
        this.listChatRooms = listChatRooms;
    }

    public long getIdUser() {
        return idUser;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public List<Chatroom> getListCreatedRooms() {
        return listCreatedRooms;
    }

    public List<Chatroom> getListChatRooms() {
        return listChatRooms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return idUser == user.idUser && Objects.equals(login, user.login) && Objects.equals(password, user.password) && Objects.equals(listCreatedRooms, user.listCreatedRooms) && Objects.equals(listChatRooms, user.listChatRooms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUser, login, password, listCreatedRooms, listChatRooms);
    }

    @Override
    public String toString() {
        return "User{" +
                "idUser=" + idUser +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", listCreatedRooms=" + listCreatedRooms +
                ", listChatRooms=" + listChatRooms +
                '}';
    }
}