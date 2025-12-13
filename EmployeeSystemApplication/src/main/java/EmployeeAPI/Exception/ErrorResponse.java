package EmployeeAPI.Exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ErrorResponse {
	private int statusCode;
	private String messageString;
	public ErrorResponse(int statusCode, String messageString) {
		super();
		this.statusCode = statusCode;
		this.messageString = messageString;
	}
	
	

}
