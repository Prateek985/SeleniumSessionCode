package TestNgSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenCartTest {


//	BS ---- DB Connection
//	BT ---- Create User
//	BC ---- launch browser
	
	
//	BM ---- Login to app
//	header Test
//	AM ---- logout
	
	
//	BM ---- Login to app
//	title Test
//	AM ---- logout
	
	
//	BM ---- Login to app
//	url Test
//	AM ---- logout
	
	
//	AC ---- close browser
//	AT ---- deleteuser
//	AS ---- disconnectWithDB

	// before annotations:
	
	//1
	@BeforeSuite
	public void dbConnections()
	{
		System.out.println("BS ---- DB Connection");
	}
	
	//2
	@BeforeTest
	public void createUser()
	{
		System.out.println("BT ---- Create User");
	}
	
	//3
	@BeforeClass
	public void launchBrowser()
	{
		System.out.println("BC ---- launch browser");
	}
	
	
	//4 7 10
	@BeforeMethod
	public void login()
	{
		System.out.println("BM ---- Login to app");
	}
	
	//8
	@Test
	public void titleTest()
	{
		System.out.println("title Test");
	}
	
	//5
	@Test
	public void headerTest()
	{
		System.out.println("header Test");
	}
	
	//11
	@Test
	public void urlTest()
	{
		System.out.println("url Test");
	}
	
	
	// after annotations
	//6 9 12
	@AfterMethod
	public void logout()
	{
		System.out.println("AM ----- logout");
	}
     
	//13
	@AfterClass
	public void closebrowser()
	{
		System.out.println("AC ------- close browser");
	}
	
	//14
	@AfterTest
	public void deleteUser()
	{
		System.out.println("AT ---- deleteuser");
	}
	
	//15
	@AfterSuite
	public void disconnectdb()
	{
		System.out.println("AS ---- disconnectWithDB");
	}
	
}
