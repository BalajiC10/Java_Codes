package productcrudapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import productcrudapp.model.Product;

import org.springframework.orm.hibernate5.HibernateTemplate;

@Component
public class ProductDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	//create 
	@Transactional
	private void createProduct(Product product) {
		this.hibernateTemplate.save(product);
	}
	
	//get all products
	public List<Product> getProducts(){
		List<Product> products = this.hibernateTemplate.loadAll(Product.class);
		return products;
	}
	
	//delete single product
	@Transactional	
	public void deleteProduct(int pid) {
		Product p = this.hibernateTemplate.load(Product.class, 	pid);
		this.hibernateTemplate.delete(p);
	}
	
	//get the single product
	
	public Product getproduct(int pid) {
		return this.hibernateTemplate.get(Product.class, pid);
	}
	
}
