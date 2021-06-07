package edu.school21.chat.repositories;

import edu.school21.chat.models.Message;

import java.util.Optional;

public class MessagesRepositoryJdbcImpl implements MessagesRepository{

    public MessagesRepositoryJdbcImpl() {
    }

    @Override
    public Optional<Message> findById(long id) {
        return Optional.empty();
    }
}
