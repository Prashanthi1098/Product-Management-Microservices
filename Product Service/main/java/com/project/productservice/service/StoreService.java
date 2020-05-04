package com.project.productservice.service;

import java.util.List;

import com.project.productservice.pojo.ProductPojo;
import com.project.productservice.pojo.StorePojo;

public interface StoreService {

	StorePojo getStores(Integer storeId);

	ProductPojo addStore(ProductPojo prodPojo);




}
