package net.first.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

// 데이터베이스로 지정
@Entity
public class User {
	@Id // 프라이머리 키 지정 어노테이션
	@GeneratedValue // DB에서 자동으로 1씩 증가시킴
	private Long id; // 자동 증가하는 숫자를 프라이머리로 사용 가능.
	
	@Column(nullable=false, length=20) // null이 들어갈 수 없는 데이터로 지정
	private String userId;	
	private String password;
	private String name;
	private String email;

	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + ", name=" + name + ", email=" + email + "]";
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
