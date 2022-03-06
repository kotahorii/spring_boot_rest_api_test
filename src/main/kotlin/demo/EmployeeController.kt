package demo

import org.springframework.web.bind.annotation.*

@RestController
class EmployeeController(private val employeeService: EmployeeService) {
    @GetMapping("/employees")
    fun getAllEmployees() = employeeService.getAllEmployees()

    @GetMapping("/employees/{id}")
    fun getEmployeeById(@PathVariable("id") employeeId: Long) = employeeService.getEmployeesById(employeeId)

    @PostMapping("/employees")
    fun createEmployee(@RequestBody payload: Employee) = employeeService.createEmployee(payload)

    @PutMapping("/employees/{id}")
    fun updateEmployeeById(@PathVariable("id") employeeId: Long, @RequestBody payload: Employee) =
        employeeService.updateEmployeeById(employeeId, payload)

    @DeleteMapping("/employees/{id}")
    fun deleteEmployeesById(@PathVariable("id") employeeId: Long) = employeeService.deleteEmployeesById(employeeId)

}