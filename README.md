Make sure to download mysql connector depedency from here

https://dev.mysql.com/downloads/connector/j/

DATABASE

TABLE :
tbl_user
userId (PK, Auto Increment), email, password

TABLE :
tbl_book
bookId (PK, Auto Increment), userId (FK), title, author, status, currentPage, totalPage, coverBook
