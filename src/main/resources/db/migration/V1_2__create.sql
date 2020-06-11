/*
Пункты выдачи
*/

CREATE TABLE PointOfIssue
(
	ID integer PRIMARY KEY AUTO_INCREMENT
);

CREATE TABLE Ticket
(
	ID int PRIMARY KEY,
	FOREIGN KEY (ID) REFERENCES PointOfIssue(ID)
);

CREATE TABLE ReadingRoom
(
	ID int PRIMARY KEY,
	FOREIGN KEY (ID) REFERENCES PointOfIssue(ID)
);

/*
Читатели
*/

CREATE TABLE Reader
(
	ID integer PRIMARY KEY AUTO_INCREMENT,
	FirstName varchar(50) NOT NULL,
	SecondName varchar(50) NOT NULL,
	LastName varchar(50) NOT NULL,
	BirthDay date NOT NULL
);

CREATE TABLE Faculty
(
	ID integer PRIMARY KEY AUTO_INCREMENT,
	Name varchar(50) NOT NULL
);

CREATE TABLE StudyGroup
(
	ID integer PRIMARY KEY AUTO_INCREMENT,
	Number integer,
	FacultyID integer,
	FOREIGN KEY (FacultyID) REFERENCES Faculty(ID)
);

CREATE TABLE Student
(
	ID integer,
	GroupID integer,
	POIID integer,
	FOREIGN KEY (ID) REFERENCES Reader(ID),
	PRIMARY KEY (ID),
	FOREIGN KEY (GroupID) REFERENCES StudyGroup(ID),
	FOREIGN KEY (POIID) REFERENCES PointOfIssue(ID)
);

CREATE TABLE Department
(
	ID integer PRIMARY KEY AUTO_INCREMENT,
	FacultyID integer,
	FOREIGN KEY (FacultyID) REFERENCES Faculty(ID),
	Name varchar(50) NOT NULL
);

CREATE TABLE Degree
(
	ID integer PRIMARY KEY AUTO_INCREMENT,
	Name varchar(50) NOT NULL
);

CREATE TABLE Grade
(
	ID integer PRIMARY KEY AUTO_INCREMENT,
	Name varchar(50) NOT NULL
);

CREATE TABLE Teacher
(
	DepartmentID int,
	ID int PRIMARY KEY,
	DegreeID int,
	GradeID int,
	POIID int,
	FOREIGN KEY (ID) REFERENCES Reader(ID),
	FOREIGN KEY (DepartmentID) REFERENCES Department(ID),
	FOREIGN KEY (DegreeID) REFERENCES Degree(ID),
	FOREIGN KEY (GradeID) REFERENCES Grade(ID),
	FOREIGN KEY (POIID) REFERENCES PointOfIssue(ID)
);

CREATE TABLE OneTimeReader
(
	ID int PRIMARY KEY,
	ReadingRoomID int,
	TakeDate date NOT NULL,
	FOREIGN KEY (ID) REFERENCES Reader(ID),
	FOREIGN KEY (ReadingRoomID) REFERENCES ReadingRoom(ID)
);

/*
Книги
*/

CREATE TABLE FileCabinet
(
	ID integer PRIMARY KEY AUTO_INCREMENT,
	POIID int,
	FOREIGN KEY (POIID) REFERENCES PointOfIssue(ID)
);

CREATE TABLE Issue
(
	ID integer PRIMARY KEY AUTO_INCREMENT,
	FileCabinetID int,
	FOREIGN KEY (FileCabinetID) REFERENCES FileCabinet(ID),
	BooksCount integer NOT NULL,
	BookName varchar(100) NOT NULL,
	ReceiptDate date NOT NULL
);

CREATE TABLE BookTake
(
	ID integer PRIMARY KEY AUTO_INCREMENT,
	ReaderID int,
	IssueID int,
	POIID int,
	FOREIGN KEY (ReaderID) REFERENCES Reader(ID),
	FOREIGN KEY (IssueID) REFERENCES Issue(ID),
	FOREIGN KEY (POIID) REFERENCES PointOfIssue(ID),
	TakeDate date NOT NULL,
	ReturnDate date
);

/*
Нарушения
*/

CREATE TABLE Offence
(
	ID integer PRIMARY KEY AUTO_INCREMENT,
	AccrualDate date NOT NULL,
	EndDate date NOT NULL,
	ReaderID int,
	BookTakeID int,
	FOREIGN KEY (ReaderID) REFERENCES Reader(ID),
	FOREIGN KEY (BookTakeID) REFERENCES BookTake(ID)
);

CREATE TABLE Penalty
(
	ID integer PRIMARY KEY AUTO_INCREMENT,
	AccrualDate date NOT NULL,
	Cost integer NOT NULL,
	PayDate date,
	OffenceID int,
	FOREIGN KEY (OffenceID) REFERENCES Offence(ID)
);

DELIMITER $$
CREATE TRIGGER study_group_create_checker
	BEFORE INSERT ON StudyGroup
	FOR EACH ROW
	BEGIN
		IF (SELECT COUNT(*) FROM StudyGroup WHERE Number = NEW.Number) > 0 THEN
			CALL GroupExist;
		END IF;
	END $$
DELIMITER ;