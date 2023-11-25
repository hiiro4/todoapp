package com.todo.entity;

import lombok.Data;

@Data
public class ToDo {
	
	private long id;
	private String title;
	private int done_flg ;
	private String time_limit;
}
