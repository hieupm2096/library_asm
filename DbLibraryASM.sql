CREATE DATABASE DbLibraryASM
GO
USE DbLibraryASM
GO
CREATE TABLE Reader(
    _id VARCHAR(5) PRIMARY KEY,
    _name VARCHAR(30) NOT NULL
)

CREATE TABLE Book(
    _code VARCHAR(5) PRIMARY KEY,
    _name VARCHAR(100) NOT NULL,
    _author VARCHAR(100) NOT NULL,
    _status BIT
)

CREATE TABLE BookHistory(
    _id INT IDENTITY PRIMARY KEY,
    _code VARCHAR(5),
    CONSTRAINT fk_bookhistory_book_code FOREIGN KEY (_code) REFERENCES Book(_code),
    _reader_id VARCHAR(5),
    CONSTRAINT fk_bookhistory_reader_id FOREIGN KEY (_reader_id) REFERENCES Reader(_id),
    _borrowed_date DATETIME NOT NULL,
    _expire_date DATETIME NOT NULL,
    _returned_date DATETIME
)

INSERT INTO Book(_code, _name, _author, _status) 
    VALUES ('B0001', 'Book 1', 'Author 1', 1),
            ('B0002', 'Book 2', 'Author 2', 1),
            ('B0003', 'Book 3', 'Author 3', 1)

INSERT INTO BookHistory(_code, _readed_id, _borrowed_date, _expire_date, _returned_date)
VALUES ('B0001', 'R0001', '20180304', '20180307', '20180307'),
       ('B0002', 'R0001', '20180304', '20180307', '20180307')