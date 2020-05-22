INSERT INTO PointOfIssue VALUES 
(1), (2), (3), (4), (5), (6), (7), (8), (9), (10),
(11), (12), (13), (14), (15), (16), (17), (18), (19), (20);

INSERT INTO Ticket VALUES
(1), (2), (3), (4), (5), (6), (7), (8), (9), (10);

INSERT INTO ReadingRoom VALUES
(11), (12), (13), (14), (15), (16), (17), (18), (19), (20);

INSERT INTO Reader (LastName, FirstName, SecondName, BirthDay) VALUES
("Петров", "Алексей", "Андреевич", "1965-04-23"),
("Шестак", "Антон", "Васильевич", "1989-03-10"),
("Павлов", "Сергей", "Родионович", "1993-08-12"),
("Зуев", "Данил", "Викторович", "1957-10-07"),
("Ельков", "Константин", "Данилович", "1991-01-14"),
("Артюхов", "Евгений", "Игоревич", "1978-06-03"),
("Важева", "Дарья", "Викторовна", "1969-06-09"),
("Доманова", "Елена", "Дмитриевна", "1970-04-20"),
("Гнездилов", "Александр", "Олегович", "1972-03-17"),
("Чуркин", "Валерий", "Авдеевич", "1948-09-29"),

("Камбалин", "Дмитрий", "Александрович", "1998-12-25"),
("Голиков", "Максим", "Олегович", "1999-10-23"),
("Шевяков", "Илья", "Гарьевич", "1999-06-27"),
("Боксбергер", "Артем", "Валерьевич", "2001-05-12"),
("Савватеев", "Андрей", "Андреевич", "1999-02-21"),
("Янголь", "Ольга", "Артемовна", "1999-11-03"),
("Чагина", "Полина", "Матвеевна", "1998-02-17"),
("Кудинов", "Антон", "Ильич", "1998-05-06"),
("Масыч", "Матвей", "Максимович", "2000-03-15"),
("Черкасов", "Антон", "Владиславович", "2001-01-03"),

("Золотухин", "Валентин", "Данилович", "1997-09-30"),
("Акинина", "Дарья", "Александровна", "1998-04-24"),
("Клыкова", "Александра", "Сергеевна", "1993-07-09"),
("Новичков", "Илья", "Степанович", "1986-12-07"),
("Сидоров", "Александр", "Михайлович", "1971-02-28"),
("Зарипов", "Марат", "Станиславович", "1980-09-01"),
("Бондоров", "Роман", "Павлович", "1995-05-19"),
("Ерофеев", "Кирилл", "Федорович", "2002-11-02"),
("Потапов", "Никита", "Юрьевич", "1992-01-16"),
("Кожевникова", "Диана", "Олеговна", "1997-10-11");

INSERT INTO Faculty (Name) VALUES 
("Геолого-геофизический факультет"),
("Гуманитарный институт"),
("Институт медицины и психологии"),
("Институт философии и права"),
("Механико-математический факультет"),
("Факультет естественных наук"),
("Факультет информационных технологий"),
("Физический факультет"),
("Экономический факультет");

INSERT INTO StudyGroup (ID, FacultyID) VALUES
(17503, 1),
(18816, 2),
(14451, 3),
(16923, 4),
(17122, 5),
(18404, 6),
(17204, 7),
(18205, 7),
(16315, 8),
(19707, 9);

INSERT INTO Student VALUES 
(20, 17503, 8),
(11, 17204, 5),
(12, 18205, 2),
(13, 18816, 7),
(14, 14451, 3),
(15, 16923, 4),
(16, 17122, 10),
(17, 18404, 2),
(18, 16315, 5),
(19, 19707, 1);

INSERT INTO Department (FacultyID, Name) VALUES
(1, "Кафедра минералогии и петрографии"),
(2, "Кафедра всеобщей истории"),
(3, "Кафедра нейронаук"),
(4, "Кафедра истории философии"),
(5, "Кафедра вычислительной математики"),
(6, "Кафедра общей химии"),
(7, "Кафедра параллельных вычислений"),
(7, "Кафедра компьютерных технологий"),
(8, "Кафедра физики элементарных частиц"),
(9, "Кафедра общей социологии");

INSERT INTO Degree (Name) VALUES 
("Бакалавр"),
("Магистр"),
("Кандидат"),
("Доктор");

INSERT INTO Grade (Name) VALUES
("Доцент"),
("Профессор");

INSERT INTO Teacher VALUES 
(10, 6, 1, 1, 6),
(1, 8, 2, 1, 5),
(2, 2, 1, 1, 9),
(3, 9, 3, 2, 10),
(4, 4, 1, 1, 4),
(5, 7, 2, 1, 8),
(6, 10, 4, 2, 1),
(7, 5, 4, 2, 7),
(8, 1, 3, 1, 2),
(9, 3, 4, 2, 3);

INSERT INTO OneTimeReader VALUES
(30, 14, "2019-08-03"),
(21, 20, "2019-07-16"),
(22, 15, "2019-05-01"),
(23, 12, "2019-04-03"),
(24, 17, "2019-09-21"),
(25, 11, "2019-09-27"),
(26, 19, "2019-03-10"),
(27, 18, "2019-07-28"),
(28, 13, "2019-08-07"),
(29, 16, "2019-10-10");

INSERT INTO FileCabinet (POIID) VALUES
(10), (1), (2), (3), (4), (5), (6), (7), (8), (9);

INSERT INTO Issue (FileCabinetID, BooksCount, BookName, ReceiptDate) VALUES
(1, 10, "Властелин Колец", "2019-04-12"),
(2, 5, "Два капитана", "2019-04-23"),
(3, 20, "Пикник на обочине", "2019-04-15"),
(4, 30, "Война и мир", "2019-03-19"),
(5, 100, "Курс дифференциального и интегрального исчислений", "2019-04-03"),
(6, 10, "9 принцев Амбера", "2019-03-26"),
(7, 50, "Язык программирования C++", "2019-05-01"),
(8, 5, "Лунный Король", "2019-04-29"),
(9, 120, "Математическая логика и теория алгоритмов", "2019-05-02"),
(10, 5, "Метро 2033", "2019-03-27");

INSERT INTO BookTake (ReaderID, IssueID, POIID, TakeDate, ReturnDate) VALUES
(1, 5, 2, "2019-05-05", NULL),
(24, 1, 5, "2019-05-10", NULL),
(9, 9, 3, "2019-05-16", "2019-06-12"),
(13, 3, 2, "2019-05-21", "2019-05-28"),
(7, 8, 1, "2019-05-22", "2019-06-02"),
(2, 2, 4, "2019-05-24", "2019-05-25"),
(20, 6, 3, "2019-05-25", NULL),
(15, 7, 4, "2019-06-13", "2019-06-24"),
(1, 10, 2, "2019-06-29", NULL),
(8, 1, 1, "2019-07-03", "2019-08-02"),
(12, 3, 3, "2019-07-10", "2019-09-15"),
(19, 4, 4, "2019-07-16", "2019-07-17"),
(25, 10, 6, "2019-08-25", "2019-09-16"),
(14, 9, 2, "2019-08-27", NULL),
(23, 7, 5, "2019-08-30", "2019-09-28"),
(30, 3, 6, "2019-08-31", "2019-09-02"),
(5, 1, 4, "2019-09-01", "2019-10-18"),
(3, 5, 2, "2019-09-06", "2019-09-09"),
(26, 6, 5, "2019-09-12", NULL),
(21, 7, 5, "2019-09-14", "2019-10-01"),
(14, 10, 2, "2019-09-15", NULL),
(21, 8, 6, "2019-09-16", "2019-09-18"),
(10, 2, 1, "2019-09-16", "2019-09-16"),
(27, 5, 5, "2019-09-18", "2019-10-17"),
(29, 4, 6, "2019-09-19", NULL);

INSERT INTO Offence (AccrualDate, EndDate, ReaderID) VALUES
("2019-06-05", "2019-08-05", 1),
("2019-06-10", "2019-12-10", 24),
("2019-06-25", "2019-07-25", 20),
("2019-08-29", "2019-10-29", 1),
("2019-09-10", "2019-10-10", 12),
("2019-09-27", "2019-12-27", 14),
("2019-10-01", "2020-01-01", 5),
("2019-10-12", "2019-11-12", 26),
("2019-10-15", "2020-02-15", 14),
("2019-10-19", "2019-11-19", 29);

INSERT INTO Penalty (AccrualDate, Cost, PayDate, OffenceID) VALUES
("2019-06-06", 1000, "2019-06-14", 1),
("2019-06-10", 5000, NULL, 2),
("2019-06-29", 500, "2019-09-02", 3),
("2019-08-30", 1000, "2019-09-21", 4),
("2019-09-16", 500, NULL, 6),
("2019-10-01", 1500, "2019-10-03", 7),
("2019-10-10", 500, "2019-10-25", 5),
("2019-10-14", 500, NULL, 8),
("2019-10-15", 2000, NULL, 9),
("2019-10-19", 500, "2019-10-26", 10);
