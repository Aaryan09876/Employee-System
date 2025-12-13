package EmployeeAPI.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import EmployeeAPI.Dto.EmpUpdateDTO;
import EmployeeAPI.Exception.EmpAlreadyExistsException;
import EmployeeAPI.Exception.NoSuchEmpExistsException;
import EmployeeAPI.entity.Emp;
import EmployeeAPI.repository.EmpRepository;

@Service
public class EmpService {
	private EmpRepository empRepo;
	@Autowired
	public EmpService(EmpRepository empRepo) {
		this.empRepo=empRepo;
	}
	public String addEmp(Emp emp) {
	Emp e=empRepo.findByEname(emp.getEname()).orElse(null);
	if(e!=null) {
		throw new EmpAlreadyExistsException("Emp with "+emp.getEname()+"already exists");
	   }
	empRepo.save(emp);
	return "Emp saved successfully!";
	}
	public Emp getEmp(Integer empId) {
		Emp e=empRepo.findById(empId).orElse(null);
		if(e==null) {
			throw new NoSuchEmpExistsException("Emp with id"+empId+"does not exist");
		   }
		return e;
	}
	public String updateEmp(EmpUpdateDTO empDTO,Integer empId) {
		Emp e=empRepo.findById(empId).orElse(null);
		if(e==null) {
			throw new NoSuchEmpExistsException("Emp with id"+empId+"does not exist");
		   }
		if(empDTO.getEname()==null  && empDTO.getSal()==null) {
			throw new RuntimeException("Empty object not allowed for updation");
		}
		if(empDTO.getEname()!=null) {
			e.setEname(empDTO.getEname());
		}
		if(empDTO.getSal()!=null) {
			e.setSal(empDTO.getSal());
		}
		
		empRepo.save(e);
		return "Emp updated successfully";
	}
	public List<Emp> getEmpAll() {
		 return empRepo.findAll();
	}
	

}
