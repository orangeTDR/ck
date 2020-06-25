package com.orange.pojo;

public class Empoy {

	private String id;
	private String name;
	private String dname;
	private String age;
	private String gender;
	private String money;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getdname() {
		return dname;
	}
	public void setDname(String dName) {
		this.dname = dName;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "Empoy [id=" + id + ", name=" + name + ", dName=" + dname + ", age=" + age + ", gender=" + gender
				+ ", money=" + money + "]";
	}

	
	
}
