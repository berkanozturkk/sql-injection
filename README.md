# sql-injection
Two examples of scripts that i wrote, vulnerable to SQL injection and safe to sql injection.
SQL Injection is an attack technique that works through dynamic strings. With this attack technique hacker might get access to user details, might destroy or fetch data from your database without you can notice. 
Hackers executes malicious SQL commands into web pages login forms (eg. in input boxes). These malicious commands sometimes contain logical operators like OR, AND. With the help of these operators hackers might fetch the data. 
We can use parameterized queries(prepared statements). By using parameterized queries as a developer we should write all the SQL code and pass in each parameter at execution time. This technique allows the database to distinguish wheter input is code or data. By the help of the prepared statements we can be sure that attacker cant change the purpose of the query.
