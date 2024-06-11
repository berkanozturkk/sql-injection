### SQL Injection Vulnerability Examples

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)

#### Overview
This repository provides two Java scripts: one demonstrating vulnerability to SQL injection attacks and another showcasing secure practices against SQL injection. SQL injection is a common attack that exploits improper handling of user input in SQL queries.

#### Features
- ❌ **Vulnerable Script:** Example of SQL injection vulnerability.
- ✔️ **Secure Script:** Example of secure SQL handling using parameterized queries.

#### Technologies
- **Language:** 
  - ![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)

#### Prerequisites
- ![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white) Development Kit (JDK) 
- Basic knowledge of SQL and database operations

#### Getting Started
1. **Clone the repository:**
   ```bash
   git clone https://github.com/berkanozturkk/sql-injection.git
   ```
2. **Navigate to the directory:**
   ```bash
   cd sql-injection
   ```
3. **Run the scripts using Java:**
   ```bash
   javac sqlinjection/VulnerableScript.java
   java sqlinjection/VulnerableScript
   ```

#### Understanding SQL Injection
SQL Injection is an attack technique where malicious SQL commands are inserted into input fields, potentially allowing attackers to access or manipulate the database. Preventive measures include:
- **Parameterized Queries:** Use prepared statements to ensure user inputs are treated as data, not executable code.
- **Input Validation:** Validate and sanitize user inputs to block malicious data.

