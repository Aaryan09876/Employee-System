package EmployeeAPI.Exception;

public class EmpAlreadyExistsException extends RuntimeException{
	public EmpAlreadyExistsException(String message) {
		super(message);
	}

}
