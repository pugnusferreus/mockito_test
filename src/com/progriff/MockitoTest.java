package com.progriff;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

public class MockitoTest
{
	private static List<String> arr = new ArrayList<String>();
	private static Class1 class1;

	@BeforeClass
	public static void setUp() throws Exception
	{
		class1 = mock(Class1.class);
		arr.add("foo");
		arr.add("bar");
	}

	@Test
	public void testMethodB_withMockito()
	{
		Class2 class2 = new Class2(class1);
		when(class1.methodA()).thenReturn(arr);
		assertEquals(new Integer(2), class2.callingMethodA());
	}

	@Test
	public void testMethodB_withoutMockito()
	{
		Class2 class2 = new Class2(mock(Class1.class));
		assertEquals(new Integer(0), class2.callingMethodA());
	}

	@Test
	public void testMethodB_withSpecificString()
	{
		Class2 class2 = new Class2(class1);
		when(class1.methodB("foo")).thenReturn("bar");
		assertEquals("bar", class2.callingMethodB("foo"));
	}

	@Test
	public void testMethodB_withAnyString()
	{
		Class2 class2 = new Class2(class1);
		when(class1.methodB(any(String.class))).thenReturn("some other stuff");
		assertEquals("some other stuff", class2.callingMethodB("abc"));
	}
}
