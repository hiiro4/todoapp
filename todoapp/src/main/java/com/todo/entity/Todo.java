package com.todo.entity;

import lombok.Data;

@Data
public class Todo {
	
	private long id;
	private String title;
	private String done_flg ;
	private String time_limit;
}
