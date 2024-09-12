package com.example.test.service;

import com.example.test.bean.Product;
import com.example.test.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Value;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductDao dao;

    @Value("${cloud-upload.accessKey}")
    private String accessKey;
    public Product findByLabel(String label) {
        return dao.findByLabel(label);
    }

    public List<Product> findAll() {
        return dao.findAll();
    }
}
