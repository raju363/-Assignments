
public class EmployeeEmpidComparator  implements comparartor<Employee>{
  public int compare(Employee e1, Employee e2) {
	  return e1.getEmployeeId()-e2.getEmployeeId();
  }
}
public class EmployeeEmployeeNamecomparator implements comparator<Employee> extends EmployeeEmpidComparator {
public int compare(Employee e1,Employee e2) {
	e1.getEmployeeName().compareTo(e2.getEmployeeName());
}
}
