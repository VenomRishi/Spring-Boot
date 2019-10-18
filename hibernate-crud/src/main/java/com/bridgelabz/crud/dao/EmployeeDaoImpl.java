package com.bridgelabz.crud.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bridgelabz.crud.model.Employee;

@SuppressWarnings("deprecation")
@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Employee> get() {
		Session session = entityManager.unwrap(Session.class);
		Query<Employee> query = session.createQuery("FROM Employee", Employee.class);
		return query.getResultList();

	}

	@Override
	public Employee get(int id) {
		Session session = entityManager.unwrap(Session.class);
		Employee employee = session.get(Employee.class, id);
		return employee;
	}

	@Override
	public void save(Employee employee) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(employee);

	}

	@Override
	public void delete(int id) {
		Session session = entityManager.unwrap(Session.class);
		Employee employee = session.get(Employee.class, id);
		session.delete(employee);

	}

}
