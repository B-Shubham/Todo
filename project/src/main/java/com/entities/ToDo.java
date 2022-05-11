package com.entities;

import java.util.Date;

public class ToDo {
	private String todoTitle;
	private String todoContent;
	private Date TodoDate;
	public ToDo(String todoTitle, String todoContent, Date todoDate) {
		super();
		this.todoTitle = todoTitle;
		this.todoContent = todoContent;
		this.TodoDate = todoDate;
	}
	
	
	
	public ToDo() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getTodoTitle() {
		return todoTitle;
	}
	public void setTodoTitle(String todoTitle) {
		this.todoTitle = todoTitle;
	}
	public String getTodoContent() {
		return todoContent;
	}
	public void setTodoContent(String todoContent) {
		this.todoContent = todoContent;
	}
	public Date getTodoDate() {
		return TodoDate;
	}
	public void setTodoDate(Date todoDate) {
		TodoDate = todoDate;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getTodoTitle()+" : "+this.todoContent;
	}
	
	
}
