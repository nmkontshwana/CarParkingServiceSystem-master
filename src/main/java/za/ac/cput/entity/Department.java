package za.ac.cput.entity;

public class Department{
    private String departmentName;
    private String campusLocation;
    private String departmentID;

    public Department(Department.Builder builder) {
        this.departmentName = builder.departmentName;
        this.campusLocation = builder.campusLocation;
        this.departmentID = builder.departmentID;
}
    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getCampusLocation() {
        return campusLocation;
    }

    public void setCampusLocation(String campusLocation) {
        this.campusLocation = campusLocation;
    }

    public String getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(String departmentID) {
        this.departmentID = departmentID;
    }
    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                ", campusLocation='" + campusLocation + '\'' +
                ", departmentID='" + departmentID + '\'' +
                '}';
    }
public static class Builder {
    private String departmentName;
    private String campusLocation;
    private String departmentID;

    public Department.Builder setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
        return this;
    }

    public Department.Builder setCampusLocation(String campusLocation) {
        this.campusLocation = campusLocation;
        return this;
    }

    public Department.Builder setDepartmentID(String departmentID) {
        this.departmentID= departmentID;
        return this;
    }

    public Department.Builder copy(Department department) {
        this.departmentName = department.departmentName;
        this.campusLocation = department.campusLocation;
        this.departmentID = department.departmentID;
        return this;
    }

    public Department build() {
        return new Department(this);
    }
}
}





