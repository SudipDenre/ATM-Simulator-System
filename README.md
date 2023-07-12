 **ATM-Simulator-System**

   Welcome to the ATM Simulator System, a desktop-based application developed using Java, Java Swing & AWT, MySQL database, Java OOPs concepts, and a touch of HTML.

 **Overview**
 
   The ATM Simulator System is designed to provide a simulated ATM experience, allowing users to perform various banking operations such as signing in, signing up, depositing funds, withdrawing cash, changing PIN, checking balance, generating mini statements, and exiting the system. The application provides a user-friendly interface and follows object-oriented programming principles for efficient and modular code organization.

 **Technologies Used**
 
  - Java: Programming language used for the application logic and backend development.
  - Java Swing & AWT: GUI toolkit used for designing and implementing the graphical user interface.
  - MySQL Database: Backend database management system used to store and retrieve user information and transaction data.
  - Java OOPs Concepts: Object-oriented programming principles utilized for code organization, encapsulation, inheritance, and polymorphism.
  - HTML: Used for integrating some web elements in the application interface.

 **Features**
 
  - Sign in: Users can sign in to access their accounts by providing a valid card number and PIN. Invalid credentials prompt appropriate error messages.
  - Sign up: New users can sign up by completing a 3-page form to create an account with their personal and banking details.
  - ATM Interface: Once signed in, users are presented with an ATM interface offering the following options:
    1. Deposit: Users can deposit funds into their account by entering the desired amount.
    2. Cash Withdrawal: Users can withdraw cash from their account by specifying the withdrawal amount.
    3. Fast Cash: Provides predefined withdrawal amounts for quick cash transactions.
    4. PIN Change: Allows users to change their PIN for enhanced security.
    5. Mini Statement: Generates a mini statement displaying recent transaction details.
    6. Balance Enquiry: Displays the current balance in the user's account.
    7. Exit: Allows users to safely exit the ATM Simulator System.

**Getting Started**

  To run the ATM Simulator System on your local machine, follow these steps:

  1. Prerequisites:
    - Java Development Kit (JDK) installed.
    - MySQL server installed and running.

  2. Clone the repository:
     git clone https://github.com/SudipDenre/ATM-Simulator-System.git

  3. Configure the database:
     Create a MySQL database using the provided SQL script.
     Update the database connection settings in the source code (e.g., src/com/company/DatabaseConnection.java) to match your local MySQL configuration.

  4. Build and run the application:
     Compile the Java source files.
     Execute the main class (e.g., src/bank/management/syatem/Login.java) to start the application.

**Acknowledgments**

  Special thanks to the following resources that contributed to the development of this ATM Simulator System:

     Java Documentation
     MySQL Documentation
     
Feel free to explore, modify, and enhance the application to suit your needs. Contributions and suggestions are always welcome!
Feel free to customize the README file according to your project's specific details and structure.
