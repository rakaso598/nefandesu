CREATE TABLE POST(
    ID NUMBER(6) GENERATED ALWAYS AS IDENTITY,
    TITLE VARCHAR2(100),
    CONTENT VARCHAR2(2000)
);

INSERT INTO POST(TITLE,CONTENT)
VALUES('POST_3','CONTENT_3');

COMMIT;