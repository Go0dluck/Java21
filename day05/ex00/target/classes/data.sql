INSERT INTO "user"(ID_USER, LOGIN, PASSWORD) values (5, 'Test1', '111');
INSERT INTO "user"(ID_USER, LOGIN, PASSWORD) values (6, 'Test2', '222');
INSERT INTO "user"(ID_USER, LOGIN, PASSWORD) values (7, 'Test3', '333');
INSERT INTO "user"(ID_USER, LOGIN, PASSWORD) values (8, 'Test4', '444');
INSERT INTO "user"(ID_USER, LOGIN, PASSWORD) values (9, 'Test5', '555');

INSERT INTO "chatroom"(ID_CHATROOM, NAME, OWNER) VALUES (66, 'Room1', 1);
INSERT INTO "chatroom"(ID_CHATROOM, NAME, OWNER) VALUES (77, 'Room2', 2);
INSERT INTO "chatroom"(ID_CHATROOM, NAME, OWNER) VALUES (88, 'Room3', 3);
INSERT INTO "chatroom"(ID_CHATROOM, NAME, OWNER) VALUES (99, 'Room4', 4);
INSERT INTO "chatroom"(ID_CHATROOM, NAME, OWNER) VALUES (100, 'Room5', 5);

INSERT INTO "user_in_chatroom"(ID_USER, ID_ROOM) VALUES (1, 1);
INSERT INTO "user_in_chatroom"(ID_USER, ID_ROOM) VALUES (2, 2);
INSERT INTO "user_in_chatroom"(ID_USER, ID_ROOM) VALUES (3, 3);
INSERT INTO "user_in_chatroom"(ID_USER, ID_ROOM) VALUES (4, 4);
INSERT INTO "user_in_chatroom"(ID_USER, ID_ROOM) VALUES (5, 5);

INSERT INTO "message"(ID_MESSAGE, AUTHOR, ROOM, MESSAGE, DATE_TIME) VALUES (1000, 1, 1, 'Message1', '06-06-2021 23:10:51');
INSERT INTO "message"(ID_MESSAGE, AUTHOR, ROOM, MESSAGE, DATE_TIME) VALUES (1001, 2, 2, 'Message2', '06-06-2021 23:10:51');
INSERT INTO "message"(ID_MESSAGE, AUTHOR, ROOM, MESSAGE, DATE_TIME) VALUES (1002, 3, 3, 'Message3', '06-06-2021 23:10:51');
INSERT INTO "message"(ID_MESSAGE, AUTHOR, ROOM, MESSAGE, DATE_TIME) VALUES (1003, 4, 4, 'Message4', '06-06-2021 23:10:51');
INSERT INTO "message"(ID_MESSAGE, AUTHOR, ROOM, MESSAGE, DATE_TIME) VALUES (1004, 5, 5, 'Message5', '06-06-2021 23:10:51');