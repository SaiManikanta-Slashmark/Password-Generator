# Password-Generator
## Overview
This Java Console Application allows users to generate random passwords based on their preferences and check the strength of existing passwords. Additionally, it provides useful tips on password security.

## Features
### Password Generation:
- User can choose to include uppercase letters, lowercase letters, numbers, and symbols.
- User specifies the desired length of the password.
- A random password is generated based on user preferences and displayed in the console.
### Password Strength Check:
Evaluates the strength of a given password based on:
- Use of uppercase letters
- Use of lowercase letters
- Use of numbers
- Use of symbols
- Length of the password (8 or more characters and 16 or more characters)
Displays the password strength as "Weak", "Medium", "Good", or "Great".
### Password Security Tips:
Provides general advice on creating and managing secure passwords.

## Getting Started

### Prerequisites
- Java Development Kit (JDK) installed on your system.

### Installation
1. Clone the repository:

    git clone https://github.com/your-username password-generator.git
    cd password-generator
2. Compile the Java files:

    javac PasswordGenerator.java PasswordStrengthChecker.java Main.java

### Usage
Run the application using the following command:

    java Main

### Menu Options
1. Generate a Password:
- Follow the prompts to specify your preferences and receive a generated password.
2. Check Password Strength:
- Enter an existing password to see its strength evaluation.
3. Display Password Security Tips:
- View general tips and best practices for password security.
4. Exit:
- Exit the application.

### Password Strength Evaluation Criteria
- At least one uppercase letter
- At least one lowercase letter
- At least one digit
- At least one symbol
- Minimum length of 8 characters (for a decent password)
- Minimum length of 16 characters (for a good password)