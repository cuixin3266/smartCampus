package com.campus.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 
 * @ClassName: User
 * @Description: 用户实体类
 * @Author 12878
 * @DateTime 2020年6月29日 下午4:16:22
 */
@Entity
public class User {

	@Id
	private String id;
	private String username;
	private String password;
	private String role;
	private Boolean status;
	public User() {
		super();
	}
	public User(String id, String username, String password, String role, Boolean status) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.role = role;
		this.status = status;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", role=" + role + ", status="
				+ status + "]";
	}
	
}
