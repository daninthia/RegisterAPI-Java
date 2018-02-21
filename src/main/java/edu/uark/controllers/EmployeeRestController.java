package edu.uark.controllers;

import java.util.UUID;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import edu.uark.commands.products.ProductByLookupCodeQuery;
import edu.uark.commands.products.ProductCreateCommand;
import edu.uark.commands.products.ProductDeleteCommand;
import edu.uark.commands.products.ProductQuery;
import edu.uark.commands.products.ProductUpdateCommand;
import edu.uark.commands.products.ProductsQuery;
import edu.uark.models.api.Product;


@RestController
@RequestMapping(value = "/employee")
public class EmployeeRestController {
	@RequestMapping(value = "{employeeId}", method = RequestMethod.GET)
	public Employee getEmployees {
		return (new EmployeeQuery()).
			setEmployeeId(employeeId).
			execute();
	}

} 
