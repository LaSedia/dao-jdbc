package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println("=== test 1 findById ===");
		Seller seller = sellerDao.findById(1);
		System.out.println(seller);
		
		System.out.println();
		
		System.out.println("=== test 2 findByDepartment ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list)	{
			System.out.println(obj);
		}
		
		System.out.println();
		
		System.out.println("=== test 3 findAll ===");
		List<Seller> list2 = sellerDao.findAll();
		for (Seller obj : list2)	{
			System.out.println(obj);
		}
		
		System.out.println();
		
		System.out.println("=== test 4 insert ===");
		Seller seller2 = new Seller(null, "Teste insert", "teste", new Date(), 2800.99, department);
		sellerDao.insert(seller2);
		System.out.println("Inserted! New Id = " + seller2.getId());
		
	}

}
