package com.progriff;

public class Class2
{
	private Class1 class1;

	public Class2(Class1 class1)
	{
		this.class1 = class1;
	}

	public Integer callingMethodA()
	{
		return this.class1.methodA().size();
	}

	public String callingMethodB(String x)
	{
		return this.class1.methodB(x);
	}
}
