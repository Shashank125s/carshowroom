# Car Showroom Management System

This Java-based Car Showroom Management System allows users to manage showrooms, employees, and cars through a console interface. Users can add new showrooms, employees, and cars, and view detailed information for each category.

## Features
- **Showroom Management**: Add new showrooms and view showroom details.
- **Employee Management**: Add employees to specific showrooms and view employee details.
- **Car Management**: Add cars to showrooms with specifications and view car details.
- **Console Menu**: Provides an interactive menu for navigation and selection.

## Program Structure

The program consists of the following classes:
1. **Showroom**: Represents a showroom with details such as name, address, manager, employees, and stock.
2. **Employee**: Represents an employee with ID, name, age, department, and associated showroom.
3. **Cars**: Represents a car with specifications like color, fuel type, type, transmission, and price.
4. **Utility Interface**: Provides methods `getDetails` and `setDetails` implemented in each class for setting and displaying details.
5. **Main**: Entry point with a menu-driven interface for managing the showroom, employees, and cars.

## Folder Structure 
   ```bash
CarShowroomManagementSystem/
│
├── carshowroom/
│   └── src/
│       ├── Showroom.java         # Contains the Showroom class, represents a showroom with its details.
│       ├── Employee.java         # Contains the Employee class, represents an employee with showroom association.
│       ├── Cars.java             # Contains the Cars class, represents a car with specifications.
│       ├── Utility.java          # Interface containing methods for setting and retrieving details.
│       └── Main.java             # Entry point of the application, contains the main menu and program flow.
│
└── README.md                     # Project description, features, and setup instructions.
  ```


### Class Breakdown

- **Showroom**:
  - Stores and manages showroom details and implements the `utility` interface methods.
  - Methods:
    - `setDetails()`: Prompts for showroom details input.
    - `getDetails()`: Displays showroom information.

- **Employee**:
  - Stores employee information and the associated showroom.
  - Automatically generates a unique ID for each employee.
  - Implements `utility` interface methods:
    - `setDetails()`: Prompts for employee information input.
    - `getDetails()`: Displays employee information.

- **Cars**:
  - Stores car specifications such as name, color, fuel type, type, transmission, and price.
  - Implements `utility` interface methods:
    - `setDetails()`: Prompts for car information input.
    - `getDetails()`: Displays car information.

- **Utility Interface**:
  - Declares two methods (`setDetails()` and `getDetails()`) that are implemented by `Showroom`, `Employee`, and `Cars`.

- **Main**:
  - Contains a menu-driven interface allowing users to:
    - Add showrooms, employees, and cars.
    - View showroom, employee, and car information.
  - Manages arrays of `Showroom`, `Employee`, and `Cars` objects with separate counters for each type.

### Main Program Flow

1. **Start the Program**:
   - Launches the interactive menu with options to add or view showrooms, employees, and cars.

2. **Menu Options**:
   - **Add Showroom**: Input and store details of a new showroom.
   - **Add Employees**: Input and store details of an employee associated with a showroom.
   - **Add Cars**: Input and store details of a car with specifications.
   - **Get Showroom**: Display details of all added showrooms.
   - **Get Employee**: Display details of all added employees.
   - **Get Cars**: Display details of all added cars.

3. **Example Walkthrough**:
   - **Adding a Car**:
     ```plaintext
     ===================== *** WELCOME TO SHOWROOM MANAGEMENT SYSTEM *** =====================
     1].ADD SHOWROOM                 2].ADD EMPLOYEES                 3].ADD CARS
     
     Enter your choice: 3
     
     ===================== *** ENTER CAR DETAILS *** =====================
     Car Name: Toyota Corolla
     Car Color: Silver
     Fuel Type(Petrol/Diesel): Petrol
     Car Type(Sedan): Sedan
     Transmission Type(Automatic): Automatic
     Car Price: 25000
     
     Car added successfully.
     ```
   - **Viewing Employee Information**:
     ```plaintext
     ===================== *** WELCOME TO SHOWROOM MANAGEMENT SYSTEM *** =====================
     5].GET EMPLOYEE
     
     Enter your choice: 5
     
     ID: 1234-5678-UUID
     Name: John Smith
     Age: 30
     Department: Sales
     Showroom Name: SuperCars Showroom
     
     Employee information displayed successfully.
     ```

## Getting Started

### Prerequisites
 - **Java**: Ensure Java is installed on your system.

### Running the Program
1. Compile the program:
    ```bash
   javac -d . Main.java
    ```
2. Run the program:
   ```bash
    java carshowroom.src.Main
   ```



