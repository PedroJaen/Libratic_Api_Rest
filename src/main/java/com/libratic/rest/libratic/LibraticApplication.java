package com.libratic.rest.libratic;

import java.util.Map;
import java.util.TreeMap;

import com.libratic.rest.libratic.pojos.Book;
import com.libratic.rest.libratic.pojos.Item;
import com.libratic.rest.libratic.pojos.Library;
import com.libratic.rest.libratic.pojos.User;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibraticApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraticApplication.class, args);

	}

}
