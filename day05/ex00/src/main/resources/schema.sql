CREATE TABLE public."user"(ID SERIAL PRIMARY KEY, ID_USER INTEGER NOT NULL UNIQUE, LOGIN VARCHAR(20) NOT NULL UNIQUE, PASSWORD VARCHAR(20) NOT NULL);
CREATE TABLE public."chatroom"(ID SERIAL PRIMARY KEY, ID_CHATROOM INTEGER NOT NULL UNIQUE, NAME VARCHAR(20) NOT NULL UNIQUE, OWNER INTEGER REFERENCES "user"(ID));
CREATE TABLE public."user_in_chatroom"(ID SERIAL PRIMARY KEY, ID_USER INTEGER REFERENCES "user"(ID), ID_ROOM INTEGER REFERENCES chatroom(ID));
CREATE TABLE public."message"(ID SERIAL PRIMARY KEY, ID_MESSAGE INTEGER NOT NULL, AUTHOR INTEGER REFERENCES "user"(ID), ROOM INTEGER REFERENCES chatroom(ID), MESSAGE VARCHAR(20) NOT NULL, DATE_TIME TIMESTAMP NOT NULL);
-- DROP TABLE user_in_chatroom;
-- DROP TABLE message;
-- DROP TABLE chatroom;
-- DROP TABLE "user";