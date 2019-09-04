package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		System.out.println("=== test 1 findById ===");
		Department department = departmentDao.findById(1);
		System.out.println(department);
		
		System.out.println();
		
		System.out.println("=== test 2 findAll ===");
		List<Department> list2 = departmentDao.findAll();
		for (Department obj : list2)	{
			System.out.println(obj);
		}
		
		System.out.println();
		
		System.out.println("=== test 3 insert ===");
		Department department2 = new Department(null, "Teste insert");
		departmentDao.insert(department2);
		System.out.println("Inserted! New Id = " + department2.getId());
		
		System.out.println();
		
		System.out.println(department2);
		
		System.out.println();
		
		System.out.println("=== test 4 update ===");
		department2.setName("setName");
		departmentDao.update(department2);
		System.out.println("Updated! Id = " + department2.getId());
		
		System.out.println();
		
		System.out.println("=== test 5 delete ===");
		int willBeDeleted = department2.getId() - 1;
		departmentDao.deleteById(willBeDeleted);
		System.out.println("Deleted! Id = " + willBeDeleted);
		
	}

}
