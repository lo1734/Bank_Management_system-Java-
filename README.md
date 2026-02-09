# 💳 Banking System Simulator (Java)

A console-based Banking System Simulator built using **Core Java** that simulates real-world banking operations such as account creation, deposits, withdrawals, transfers, and transaction history tracking.

This project demonstrates strong understanding of:

- Object-Oriented Programming (OOP)
- System Design Principles
- Java Collections Framework
- Clean Code Architecture

---

## 🚀 Features

- Create Savings and Checking Accounts
- Deposit funds
- Withdraw funds
- Transfer funds between accounts
- View account balance
- Track transaction history
- Store updated balance after every transaction
- Overdraft support for Checking Accounts

---

## 🧠 OOP Concepts Implemented

### 🔹 Encapsulation
- Balance is private and updated only through controlled methods.

### 🔹 Abstraction
- `Account` is defined as an abstract class.

### 🔹 Inheritance
- `SavingsAccount` and `CheckingAccount` extend `Account`.

### 🔹 Polymorphism
- Different implementations of `withdraw()` for each account type.

### 🔹 Composition
- Each `Account` contains a list of `Transaction` objects.

---

## 🏗️ System Design Overview

### 📌 High-Level Architecture

The system is structured around a central `Bank` class that manages all accounts using a `HashMap` for efficient O(1) lookup.  
Each `Account` maintains its own transaction history.

---

### 📌 Class Diagram

```
+-------------------+
|       Bank        |
+-------------------+
| - accounts : Map<String, Account>
+-------------------+
| + addAccount()    |
| + getAccount()    |
+-------------------+

                ▲
                |
+-----------------------------------+
|            Account (abstract)     |
+-----------------------------------+
| # accountNumber : String          |
| # holderName : String             |
| # balance : double                |
| # transactions : List<Transaction>|
+-----------------------------------+
| + deposit(amount)                 |
| + withdraw(amount) (abstract)     |
| + transfer(toAccount, amount)     |
| + getBalance()                    |
| + showTransactions()              |
+-----------------------------------+

                ▲
                |
+---------------------------+      +---------------------------+
|      SavingsAccount       |      |     CheckingAccount       |
+---------------------------+      +---------------------------+
| - interestRate : double   |      | - overdraftLimit : double |
+---------------------------+      +---------------------------+
| + withdraw(amount)        |      | + withdraw(amount)        |
+---------------------------+      +---------------------------+


+---------------------------+
|        Transaction        |
+---------------------------+
| - type : String           |
| - amount : double         |
| - balanceAfterTransaction |
| - timestamp : LocalDateTime |
+---------------------------+
| + toString()              |
+---------------------------+
```

---

## 📂 Project Structure

```
Banking-System-Simulator/
│
├── Main.java
├── Bank.java
├── Account.java
├── SavingsAccount.java
├── CheckingAccount.java
└── Transaction.java
```

---

## 🛠️ Technologies Used

- Java (JDK 8+)
- Java Collections Framework
- Java Time API (`LocalDateTime`)
- Object-Oriented Programming

---

## ▶️ How to Run the Project

### 1️⃣ Clone the repository

```bash
git clone https://github.com/lo1734/banking-system-simulator.git
```

### 2️⃣ Navigate into the project directory

```bash
cd banking-system-simulator
```

### 3️⃣ Compile all Java files

```bash
javac *.java
```

### 4️⃣ Run the application

```bash
java Main
```

---

## ⚡ Time Complexity Analysis

| Operation        | Time Complexity |
|------------------|----------------|
| Create Account   | O(1) |
| Get Account      | O(1) |
| Deposit          | O(1) |
| Withdraw         | O(1) |
| Transfer         | O(1) |

Efficient lookup is achieved using `HashMap`.

---

## 🔐 Future Enhancements

- Add unique transaction IDs
- Add authentication system
- Persist data using JDBC + MySQL
- Implement thread-safety
- Convert to REST API using Spring Boot
- Add GUI using JavaFX
- Implement double-entry accounting model
- Add unit testing using JUnit

---

## 🎯 Learning Outcomes

- Real-world object modeling
- Low-Level System Design thinking
- Clean architecture practices
- Efficient data structure usage
- Banking domain simulation

---

## 👨‍💻 Author

**Lohit**

If you found this project helpful, consider giving it a ⭐ on GitHub!
