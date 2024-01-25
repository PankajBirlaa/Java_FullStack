package com.expleo.Emp;

import java.util.List;

public interface EmpDao {
 
	int save(EmpModel e);
	EmpModel getEmp(int id);
	List<EmpModel> getAllEmp();
}
