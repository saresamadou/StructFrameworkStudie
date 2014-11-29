package com.samadou.strut;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2800260635273223519L;
	private String name;
	
	public String execute() throws Exception 
	{
		if("SECRET".equals(name))
		{
			return SUCCESS;
		} else
		{
			return ERROR;
		}
	}
	
	public String getName() 
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
}
