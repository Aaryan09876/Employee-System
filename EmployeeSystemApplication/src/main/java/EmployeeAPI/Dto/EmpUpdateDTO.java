package EmployeeAPI.Dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class EmpUpdateDTO {
	@Size(min=1,message="Ename cannot be empty")
	private String ename;
	@Min(value=10000,message="Salary must be atleast 10000")
	private Double sal;
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	

}
