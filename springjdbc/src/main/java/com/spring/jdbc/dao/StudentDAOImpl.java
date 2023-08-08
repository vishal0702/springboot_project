package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entities.Student;

@Component("studentDao")
public class StudentDAOImpl implements StudentDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insert(Student student) {

		// insert query
		String query = "insert into student(id, name, city) values(?,?,?)";
		int r = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
		return r;
	}

	public int change(Student student) {

		// Updating data
		String query = "update student set name=?, city=? where id=?";
		int r = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
		return r;
	}

	public int delete(int studentId) {
		// Deleting data
		String query = "delete from student where id=?";
		int r = this.jdbcTemplate.update(query, studentId);
		return r;
	}

	public Student getStudent(int studentId) {
		// selecting single student data
		String query = "select * from student where id=?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper, studentId);
		return student;
	}

	public List<Student> getStudentList() {
		// selecting multiple rows
		String query = "select * from student";
		List<Student> students = this.jdbcTemplate.query(query, new RowMapperImpl());
		return students;
	}

}
