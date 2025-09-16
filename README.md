Bookstore Management Application

A JavaFX-based desktop application that simulates a simple bookstore system with two types of users: Owner and Customer. The project demonstrates GUI development, object-oriented design with UML diagrams, and the use of the State Design Pattern in managing application states.

Features

Owner:
- Login with username admin and password admin
- Manage books: add and delete books with prices
- Manage customers: add and delete customers, track login credentials and reward points
- Navigate between screens in a single-window GUI
- Logout option

Customer:
- Login with credentials created by the owner
- View available books and their prices
- Buy books normally or using points redemption
- Earn reward points (10 points per CAD spent)
- Redeem points (100 points = 1 CAD discount, cost never less than 0)
- Status system: Silver (< 1000 points) and Gold (≥ 1000 points)
- Logout option

Data Persistence
- Book and customer data stored in books.txt and customers.txt
- Data is automatically loaded on startup and saved on exit

Tech Stack
- Java (JDK 8+)
- JavaFX (Scene Builder for layout design)
- NetBeans IDE
- UML diagrams created in Visual Paradigm
- State Design Pattern for managing screen navigation and system states
