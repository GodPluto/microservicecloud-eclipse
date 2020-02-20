package com.three.springcloud.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable{
	private Integer dept;//主键
	private String dname;//部门名称
	private String db_source;//来自哪个数据库

	public Integer getDept() {
		return dept;
	}

	public void setDept(Integer dept) {
		this.dept = dept;
	}

	public String getDname() {
		return dname;
	}


	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getDb_source() {
		return db_source;
	}

	public void setDb_source(String db_source) {
		this.db_source = db_source;
	}

	public static void main(String[] args) {
		Dept dept=new Dept();
	}

	@Override
	public String toString() {
		return "Dept [dept=" + dept + ", dname=" + dname + ", db_source=" + db_source + "]";
	}
	
	
}