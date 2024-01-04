package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: seller findById ====");
		Department department = departmentDao.findById(3);
		System.out.println(department);
		
		System.out.println("\n=== TEST 2: seller findAll ====");
		List<Department> list = departmentDao.findAll();
		list = departmentDao.findAll();
		
		for (Department dep : list) {		
			System.out.println(dep);
		}
		
		System.out.println("\n=== TEST 3: seller insert ====");
		Department newDapartment = new Department(null, "Music");
		departmentDao.insert(newDapartment);
		System.out.println("Inserted! New id: " + newDapartment.getId());

		System.out.println("\n==== TEST 4: update =======");
		Department dep2 = departmentDao.findById(1);
		dep2.setName("Food");
		departmentDao.update(dep2);
		System.out.println("Update completed");
		
		System.out.println("\n=== TEST 5: delete =======");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");
		
		
		
		
		sc.close();
	}
}
