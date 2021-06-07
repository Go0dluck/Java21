package edu.school21.chat.models;

import java.time.LocalDateTime;
import java.util.Objects;

public class Message {
    private long            idMessage;
    private User            author;
    private Chatroom        room;
    private String          message;
    private LocalDateTime   dateTime;

    public Message(long idMessage, User author, Chatroom room, String message, LocalDateTime dateTime) {
        this.idMessage = idMessage;
        this.author = author;
        this.room = room;
        this.message = message;
        this.dateTime = dateTime;
    }

    public long getIdMessage() {
        return idMessage;
    }

    public User getAuthor() {
        return author;
    }

    public Chatroom getRoom() {
        return room;
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message1 = (Message) o;
        return idMessage == message1.idMessage && Objects.equals(author, message1.author) && Objects.equals(room, message1.room) && Objects.equals(message, message1.message) && Objects.equals(dateTime, message1.dateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMessage, author, room, message, dateTime);
    }

    @Override
    public String toString() {
        return "Message{" +
                "idMessage=" + idMessage +
                ", author=" + author +
                ", room=" + room +
                ", message='" + message + '\'' +
                ", dateTime=" + dateTime +
                '}';
    }
}