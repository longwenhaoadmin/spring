package main.java.spring.pojo;

import main.java.ctable.annotation.Field;
import main.java.ctable.annotation.Table;

@Table("测试表")
public class testpojo {
	
	@Field(caption = "说明")
	private String field;

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}
	
}
