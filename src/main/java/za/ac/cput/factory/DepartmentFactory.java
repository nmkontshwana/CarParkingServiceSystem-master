package za.ac.cput.factory;


import za.ac.cput.entity.Department;

public class DepartmentFactory {

    public static Department createDepartment(String departmentName, String campusLocation, String departmentID) {
        return new Department.Builder().setDepartmentName(departmentName)
                .setCampusLocation(campusLocation)
                .setDepartmentID(departmentID)
                .build();

    }
}
