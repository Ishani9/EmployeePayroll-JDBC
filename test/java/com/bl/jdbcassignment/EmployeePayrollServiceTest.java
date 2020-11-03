package com.bl.jdbcassignment;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.sql.SQLException;
import java.util.List;

import com.bl.jdbcassignment.EmployeePayrollService.IOService;

public class EmployeePayrollServiceTest {
	public static EmployeePayrollService employeeService;

	@Test
	public void givenEmployeePayrollDB_WhenRetrieved_ShouldMatchEmployeeCount() throws SQLException {
		EmployeePayrollService employeePayrollService = new EmployeePayrollService(); 
		List<EmployeePayrollData> employeePayrollData = employeePayrollService.readEmployeeData(IOService.DB_IO);
		assertEquals(4, employeePayrollData.size());
	}
}
