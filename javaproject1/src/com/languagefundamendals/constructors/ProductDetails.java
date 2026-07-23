package com.languagefundamendals.constructors;

public class ProductDetails {
	int productid;
	String productName;
	double Price;
	ProductDetails(int id,String Name,double Price){
		productid=id;
		productName=Name;
		this.Price=Price;
		System.out.println("Product Id   :"+id);
		System.out.println("Product Name :"+Name);
		System.out.println("Product Price:"+Price);
		System.out.println();
	}

	public static void main(String[] args) {
		ProductDetails p=new ProductDetails(1,"Laptop",50000);
		ProductDetails p1=new ProductDetails(2,"mouse",5000);
		ProductDetails p2=new ProductDetails(3,"keyboard",2500);
		
	}

}
