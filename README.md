# Employee-System
The *EmployeeSystem* is a Spring Boot application for managing employee records. It provides RESTful APIs to perform CRUD operations on employee data.The system handles employee information like names, ages, departments, salaries, etc. It may include features like adding, updating, deleting, and retrieving employee records.

Features
- Add new employees.
- Retrieve employee details by ID or search criteria.
- Update and delete employee records.
- Exception handling and validation.


Setup
1. Clone the repo.
2. Configure database in application.properties.
3. Run EmployeeSystemApplication.

API Endpoints
- GET /employees – Get all employees.
- POST /employees – Add an employee.
- GET /employees/{id} – Get employee by ID.
- PUT /employees/{id} – Update employee.
- DELETE /employees/{id} – Delete employee.
