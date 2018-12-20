/**
 * 
 */
package com.myretail.controller;

import java.util.List;

import javax.ws.rs.QueryParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myretail.exception.NotFoundException;
import com.myretail.manager.ProductManager;
import com.myretail.service.beans.Product2Display;

/**
 * This is RESTFul service that provides API to get the product name and price.
 * It also provides API for changing the price of a product.
 * 
 * @author Banu
 * @version 1.0
 *
 */

@RestController
@RequestMapping("/")
public class ServiceController {
	
	@Autowired
	private ProductManager productManager;
	/**
	 * This method is to interpret the error and provide a custom error message. 
	 * @param ex exception to be handled.
	 * @return ResponseEntity<ErrorResponse> This the HTTP response entity object with custom error response object.
	 */
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse> exceptionHandler(Exception ex) {
		
		ErrorResponse error = new ErrorResponse();
		if (ex instanceof  IllegalArgumentException ){
			error.setErrorCode(HttpStatus.BAD_REQUEST.value());
			error.setMessage (ex.getMessage());
		}else if (ex instanceof  NotFoundException){
			error.setErrorCode(HttpStatus.NOT_FOUND.value());
			error.setMessage (ex.getMessage());
		}else{
			error.setErrorCode(500);
			error.setMessage (" Unknown error occured. Contact support center");
		}
		error.setMessage (ex.getMessage());
		return new ResponseEntity<ErrorResponse>(error, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	/**
	 * This method is a HTTP GET method.
	 * It is used to get the product details and price for a given productId.
	 * @param productId Get details of the product identified by this parameter.
	 * @return Product Business object that has the product name and price details. 
	 * @throws Throwable 
	 */
	@RequestMapping(method=RequestMethod.GET, value="/product/{productId}")
	public List<Product2Display> getProductDetails(@PathVariable("productId") Long productId, @QueryParam("label") String label) throws Throwable  { 

		List<Product2Display> products = null;
		
		if (productId == null || productId <= 0) {
			throw new IllegalArgumentException("The 'productId' parameter must not be null or empty or <=0");
	    }
		products = productManager.getProductDetails(productId, label);
		 
		if ((products == null) || (products.isEmpty() )){
	        throw new NotFoundException("The 'productId' Not found");
	    }
		return products;
	}
	

}
