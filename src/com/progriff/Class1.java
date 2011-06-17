package com.progriff;

import java.util.List;

public class Class1
{
	String a = null;
	List<String> b = null;

	public Class1(String a, List<String> b)
	{
		this.a = a;
		this.b = b;
	}

	public List<String> methodA()
	{
		return b;
	}

	public String methodB(String x)
	{
		return x.toLowerCase();
	}
}
