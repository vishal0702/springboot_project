package springmvcsearch;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class StudentEntity {

	private String name;
	private Long id;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dob;
	private List<String> courses;
	private String gender;
	private String studentType;
	private Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getStudentType() {
		return studentType;
	}

	public void setStudentType(String studentType) {
		this.studentType = studentType;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "StudentEntity [Name=" + name + ", ID=" + id + ", DOB=" + dob + ", Courses=" + courses + ", Gender="
				+ gender + ", StudentType=" + studentType + ", Address=" + address + "]";
	}

	
	
	

}
