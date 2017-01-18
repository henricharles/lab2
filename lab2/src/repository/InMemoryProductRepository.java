package repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import model.Product;
@Repository
public class InMemoryProductRepository  implements ProductRepository{
	private  List<Product> listOfProduct;
	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return InMemoryProductRepository() ;
	}
	
	
	public List<Product>  InMemoryProductRepository() {
		listOfProduct= new ArrayList<>();
	
		Product product1= new Product();
		Product product2= new Product();

		product1.setCategory("mobile");
		product1.setCondition("new");
		product1.setManufacturer("SamSung");
		product1.setProductId("s11");
		product1.setName("s7");
		product1.setUnitPrice(new BigDecimal(500));
		
		product2.setCategory("mobile");
		product2.setCondition("new");
		product2.setManufacturer("mac");
		product2.setProductId("iphon11");
		product2.setName("Iphone7");
		product2.setUnitPrice(new BigDecimal(1600));
		listOfProduct.add(product1);
		listOfProduct.add(product2);
		return listOfProduct;
}
	


	@Override
	public Product getProductById(String id) {
		List<Product> pl=	InMemoryProductRepository();
		for(Product p:pl )

			if(id.equals(p.getProductId()))
				return p;
	
	return null;
}

}