CREATE DATABASE DbLibraryASM
GO
USE DbLibraryASM
GO
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
    _borrowedDate DATETIME NOT NULL,
    _returnedDate DATETIME
)

INSERT INTO Book(_code, _name, _author, _status) 
    VALUES ('B0001', 'Book 1', 'Author 1', 1),
            ('B0002', 'Book 2', 'Author 2', 1),
            ('B0003', 'Book 3', 'Author 3', 1)

INSERT INTO BookHistory(_code, _borrowedDate, _returnedDate)
VALUES ('B0001', '20180304', '20180307'),
    ('B0002', '20180304', '20180307')