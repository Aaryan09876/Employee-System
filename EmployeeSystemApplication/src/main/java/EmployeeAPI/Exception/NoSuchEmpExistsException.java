package EmployeeAPI.Exception;

public class NoSuchEmpExistsException extends RuntimeException {
	public NoSuchEmpExistsException(String message) {
		super(message);
	}

}
