package EmployeeAPI.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import EmployeeAPI.Dto.EmpUpdateDTO;
import EmployeeAPI.Exception.EmpAlreadyExistsException;
import EmployeeAPI.Exception.ErrorResponse;
import EmployeeAPI.Exception.NoSuchEmpExistsException;
import EmployeeAPI.Service.EmpService;
import EmployeeAPI.entity.Emp;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/emp")
public class EmpController {
	private EmpService serv;
    @Autowired
	public EmpController(EmpService serv) {
		super();
		this.serv = serv;
	}
    
    @PostMapping("/add")
	public String addEmp(@Valid@RequestBody Emp emp) {
    	return serv.addEmp(emp);
    }
    @GetMapping("/{empId}")
    public Emp getEmp(@PathVariable("empId")Integer empId) {
    	return serv.getEmp(empId);
    }
    
    @PutMapping("/update/{empId}")
    public String updateEmp(@Valid @RequestBody EmpUpdateDTO empDTO,@PathVariable("empId")Integer empId) { 
    return serv.updateEmp(empDTO, empId);	
    }
   
    

}
