package com.app.exceptions;

public class ExceptionLineTooLong extends Exception{

	public ExceptionLineTooLong(){};
	public ExceptionLineTooLong(String message){
		super(message);
	};
}
