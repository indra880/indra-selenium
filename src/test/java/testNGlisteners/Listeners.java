package testNGlisteners;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;


import baseClasses.baseclass;

public class Listeners implements ITestListener
{
	baseclass b = new baseclass();
 public void onTestFailure(ITestResult result)
 {
	 String TCname = result.getName();
	 try {
		b.takescreenshot(TCname);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	// TODO Auto-generated method stub
	
}
 public void onTestStart(ITestResult result) 
 {
	 Reporter.log("Tc is start",true);
	 Reporter.log("start test case name is"+result.getName(),true);
	 
	
}
 public void onTestSuccess(ITestResult result)
 {
	 Reporter.log("TC is passed",true);
	 Reporter.log("success TC name is"+result.getName(),true);
	// TODO Auto-generated method stub
	
}
}
