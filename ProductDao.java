package api;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Jbk.dao.ProductDaoImpl;
import com.jbk.entity.Student;

@Repository
public class ProductDao implements ProductDaoImpl {

	@Autowired
	SessionFactory sessionFactory;

	public Product getProductDao(int id) {
		Session session = sessionFactory.openSession();
		Product pro = session.get(Product.class, id);

		return pro;
	}

	public List<Product> getProductsDao() {
		Session session = sessionFactory.openSession();

		Criteria criteria = session.createCriteria(Product.class);
		List<Product> products = criteria.list();
		return products;
	}

	public String addStudentDao(Product pro) {
		try {
			Session session = sessionFactory.openSession();

			session.save(pro);
			session.beginTransaction().commit();
			return "Product added";
		} catch (Exception ex) {
			return "Error occured while adding Product : " + ex.getMessage();
		}
	}

	public String deleteStudentDao(int id) {
		try {

			Session session = sessionFactory.openSession();
			Product student = session.get(Product.class, id);

			if (pro == null) {
				return " Product not found";
			}

			session.delete(pro);
			session.beginTransaction().commit();
			return " Product deleted";
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			return "Error occured while deleting Student : " + ex.getMessage();
		}
	}

	public String updateStudentDao(int id, Product student) {
		Session session = sessionFactory.openSession();
		Product pro1 = session.get(Product.class, id);

		if (pro1 == null) {
			return "Product not found";
		}
		
		student1.setId(pro .getId());
		student1.setName(pro .getName());
		student1.setAge(pro .getAge());
		
		session.update(pro1);
		session.beginTransaction().commit();
		return "Product updated";
	}
}
