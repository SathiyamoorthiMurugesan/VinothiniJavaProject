package FrameWorkPractice_OrangeHRM;

import org.testng.annotations.Test;

public class OrangeHrmTestcase extends BaseCode{

	
	LoginPage login;
	LeavePage ApplyLeavePage;
	LeaveListPage leavelist;

	@Test(enabled=false)
	public void validateOranceHRMLogin() {
		login = new LoginPage();
		login.loginOrangeHRM();
	}
	
	public void leavelistcalc()
	{
		leavelist = new LeaveListPage();
		leavelist.LeaveListForEmployee("Paul Collings");
	}
	
	@Test
	public void ApplyNewLeaveForEmployee() throws Exception
	{
		login = new LoginPage();
		login.loginOrangeHRM();
		ApplyLeavePage = new LeavePage();
		ApplyLeavePage.ApplyLeave(1,1);
	}
	
//	@BeforeMethod
//	public void pullLeaveListforSpecificDate()
//	{
//		leavelist.pullLeaveListforSpecificDate("01-30-2022","02-01-2022","Pending Approval");
//	}

//	@AfterMethod
//	public void ResetBacktoDefault()
//	{
//		leavelist.ResetLeaveList();
//		System.out.println("reset method");
//	}

}
