Library Management System 📚
Overview 🌟
The Library Management System (LMS) is a school project built in Java that helps manage the rental of books in a library. The system allows users to input and display book details, such as book name, author, rental date, available copies, and ratings. It uses JOptionPane for interactive input and output, and LocalDate for managing date entries.

The project includes two main classes:

Book: A base class to store basic book details.
FictionBook: A subclass that adds functionality for book ratings.
Features 🚀
Book Details Input: Users can input information about the book, including name, author, rental date, available copies, and rating.
Book Rating Validation: Ensures the rating entered is between 1 and 5.
Book Information Display: Displays the entered book details in a friendly dialog box.
Interactive UI: The program uses JOptionPane for graphical input and output, making it user-friendly.
Technologies Used 💻
Java: The core programming language for this project.
JOptionPane: A Swing component used for displaying dialog boxes.
LocalDate: A Java class for handling and manipulating date input.
Classes & Methods 📚
LibraryManagementSystem Class 🏠
This is the main class where the program starts. It prompts the user for input, creates a FictionBook object, and displays the details entered.

Key Inputs:
Book Name 📖
Author Name ✍️
Rental Date 📅 (year, month, day)
Copies Left 📦
Book Rating ⭐ (between 1 and 5)
Book Class 📖
This is the base class for books. It contains the following properties:

bookName: The name of the book.
authorName: The name of the author.
rentedDate: The date when the book was rented.
copiesLeft: The number of available copies.
Methods:
Getters and setters for each property to allow modification and retrieval of the book's details.
FictionBook Class 📚
This subclass of Book adds a rating property to manage ratings for books. It ensures the rating is within a valid range of 1 to 5.

Key Features:
Rating Validation: The rating is constrained to a range between 1 and 5.
toString Method: Displays a string representation of the book’s details.
Getting Started 🛠️
To run the Library Management System:

Clone the Repository: Clone or download the project to your local machine.

bash
Copy code
git clone https://github.com/Happt-bot-ux/LibraryManagementSystem.git
cd LibraryManagementSystem
Compile the Code: Use your IDE or the command line to compile the project.

bash
Copy code
javac LibraryManagementSystem.java
Run the Application: After compiling, run the application:

bash
Copy code
java LibraryManagementSystem
Input Information: Follow the prompts to input book details. The system will display a message box with the information you've entered.

Example Usage 👇
When you run the program, you'll be prompted to input the following details for the book:

Book Name: Example - Java Programming 📖
Author Name: Example - John Doe ✍️
Rental Date: Example - 2024-12-01 📅
Number of Copies Left: Example - 5 📦
Book Rating: Example - 4 ⭐
Once you enter all the details, the system will display the following information in a dialog box:

yaml
Copy code
Book Name: Java Programming
Author Name: John Doe
Date: 2024-12-01
Current Copies: 5
Book Rating: 4
License 📜
This project is intended for educational purposes and can be freely used, modified, or distributed for personal or educational use.

Acknowledgments 🙏
This project was created as part of a school assignment to demonstrate knowledge of object-oriented programming in Java.
Thanks to the official Java documentation for useful resources on JOptionPane, LocalDate, and other Java libraries.
