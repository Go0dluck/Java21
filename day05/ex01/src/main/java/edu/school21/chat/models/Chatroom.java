package edu.school21.chat.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Chatroom {
    private long                idRoom;
    private String              name;
    private User                owner;
    private List<Message> listMessages;

    public Chatroom(long idRoom, String name, User owner, List<Message> listMessages) {
        this.idRoom = idRoom;
        this.name = name;
        this.owner = owner;
        this.listMessages = listMessages;
    }

    public long getIdRoom() {
        return idRoom;
    }

    public String getName() {
        return name;
    }

    public User getOwner() {
        return owner;
    }

    public List<Message> getListMessages() {
        return listMessages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chatroom chatroom = (Chatroom) o;
        return idRoom == chatroom.idRoom && Objects.equals(name, chatroom.name) && Objects.equals(owner, chatroom.owner) && Objects.equals(listMessages, chatroom.listMessages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idRoom, name, owner, listMessages);
    }

    @Override
    public String toString() {
        return "Chatroom{" +
                "idRoom=" + idRoom +
                ", name='" + name + '\'' +
                ", owner=" + owner +
                ", listMessages=" + listMessages +
                '}';
    }
}