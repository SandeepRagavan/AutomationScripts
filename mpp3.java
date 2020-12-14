package myprojects;
import java.util.ArrayList;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class mpp3 {
	static WebDriver d;
	SoftAssert assertion=new SoftAssert();
  @Test
  public void MPP_Attribute() {
	  List<String>attribute=new ArrayList<String>();
	  
		attribute.add("Description");
		attribute.add("Title");
		attribute.add("Originator");
		attribute.add("Last Update User");
		attribute.add("Type");
		attribute.add("Revision");
		attribute.add("Originated");
		attribute.add("Phase");
		attribute.add("Owner");
		attribute.add("Segment");
		attribute.add("Structured Release Criteria Required");
		attribute.add("Release Date");
		attribute.add("Effective Date");
		attribute.add("Expiration Date");
		attribute.add("Previous Revision Obsolete Date");
		attribute.add("Reason for Change");
		attribute.add("Other Names");
		attribute.add("Local Description");
		attribute.add("Comments");
		attribute.add("Obsolete Date");
		attribute.add("Obsolete Comment");
		List<String>l=new ArrayList<String>();
		WebElement tt=d.findElement(By.id("Zero"));
		List<WebElement>rows=tt.findElements(By.id("pageheaders"));
		for(WebElement row:rows) {
			String ss=row.getText();
			l.add(ss);
			System.out.println(ss);
		}
		for(String s:attribute) {
			int count=0;
			for(String w:l) {
				
				if(s.equalsIgnoreCase(w)) {
					System.out.println(s+" is present on webpage");	
					break;
			}
				else {
					count+=1;
					if(count>=l.size()) {
						System.out.println(s+" not in webpage");
					}
					continue;
		}
		
  }
  }
  }

	
	@Test
	public void MPP_Performancecharacteristics() throws InterruptedException {
		
		Thread.sleep(5000);
		List<String>performance=new ArrayList<String>();
		performance.add("Characteristic(Ch) Characteristic Specifics(CS)");
		performance.add("Chg");
		performance.add("Test Method(Name) Test Method Logic(TML) Test Method Origin(TMO) Other Test Method Number(TM#) Test Method Specifics(Sp) Test Method Reference Document Number(TMRDN)");
		performance.add("Sampling(SM) Subgroup(SG)");
		performance.add("Plant Testing Level(LVL) Plant Testing: Retesting(RT) Retesting Unit Of Measure(UoM)");
		performance.add("Lower Specification Limit(LSL) Lower Routine Realease Limits(LRRL) Lower Target(LTGT) Target(TGT) Upper Target(UTGT) Upper Routine Realease Limit(URRL),Upper Specification Limit(USL)");
		performance.add("Unit of Measure(UoM) Report to Nearest(RTN) Report Type(RT)");
		performance.add("Release Criteria(RC)");
		performance.add("Action Required(AC) Criticality Factor(CR) Basis(BA)");
		
		performance.add("Name");
		performance.add("TML");
		performance.add("TMO");
		performance.add("TM#");
		performance.add("SP");
		performance.add("TMRDN");
		performance.add("SM");
		performance.add("SG");
		performance.add("LVL");
		performance.add("RT");
		performance.add("UoM");
		performance.add("LSL");
		performance.add("LRRL");
		performance.add("LTGT");
		performance.add("TGT");
		performance.add("UTGT");
		performance.add("URRL");
		performance.add("USL");
		performance.add("UoM");
		performance.add("RTN");
		performance.add("RT");
		performance.add("RC");
		performance.add("AC");
		performance.add("CR");
		performance.add("BA");
		performance.add("TG");
		performance.add("AP");
		List<String>perfo1=new ArrayList<String>();
		
		WebElement table=d.findElement(By.xpath("//*[@id=\"Seven\"]/div/div/table/thead/tr"));
		List<WebElement>rows=table.findElements(By.tagName("tr"));
		
		List<WebElement>cols=rows.get(0).findElements(By.tagName("th"));
		for(WebElement c:cols) {
			String sc=c.getText();
			perfo1.add(sc);
			System.out.println(sc);
	}
	List<String>p=new ArrayList<String>();
	
	WebElement table2=d.findElement(By.xpath("//*[@id=\"Seven\"]/div/div/table/tbody"));
	List<WebElement>rows2=table2.findElements(By.tagName("tr"));
	
		List<WebElement>cols2=rows2.get(0).findElements(By.tagName("bomFontClass"));
	for(WebElement c:cols2) {
		String sc=c.getText();
		p.add(sc);
		System.out.println(sc);    
	}
	for(String s:p) {
		for(String ss:s.split(":")) {
			perfo1.add(ss);
		}
	}
	for(String s:performance) {
		int count=0;
		for(String s1:perfo1) {
			if(s.equalsIgnoreCase(s1)) {
				System.out.println(s+"is present in webpage");
				break;
			}
			else {
				count+=1;
				if(count>=perfo1.size()) {
					System.out.println(s+"is not present in webpage");
				}
				continue;
			}
		}
	}
	}
	@Test
	public void MPP_lifecycle() throws InterruptedException {
		
		Thread.sleep(5000);
		List<String>life=new ArrayList<String>();
		life.add("Tasks/Signatures");
		life.add("Name");
		life.add("Approver");
		life.add("Title");
		life.add("Approval Status");
		life.add("Approval/Due Date");
		life.add("Comments/Instructions");
		List<String>val=new ArrayList<String>();
		WebElement ltable=d.findElement(By.xpath("//*[@id=\"Eight\"]/div/div/table/thead"));
	
		List<WebElement>rows=ltable.findElements(By.tagName("th"));
		int rsize=rows.size();
		for(int i=0;i<rsize;i++) {
			List<WebElement>cols=rows.get(i).findElements(By.tagName("th"));
			for(WebElement c:cols) {
				String sc=c.getText();
				val.add(sc);
				System.out.println(sc);
			}
		}
		
		for(String s:life) {
			int count=0;
			for(String w:val) {
				if(s.equalsIgnoreCase(w)) {
					System.out.println(s+" is present on webpage");
					break;
				}

				else {
					count+=1;
					if(count>=val.size()) {
						System.out.println(s+" not in webpage");
					}

					continue;
				}
			}
		}
		
	}	
	@Test
	public void MPP_Ownership() {
		List<String>ownership=new ArrayList<String>();
		ownership.add("Orginator");
		ownership.add("Co-Owners");
		ownership.add("Last Update User");
		ownership.add("Segment");
		ownership.add("Approvers");
		ownership.add("Last Update Date");
		List<String>ownerlist=new ArrayList<String>();
		WebElement owner=d.findElement(By.id("Nine"));
		List<WebElement>rows=owner.findElements(By.id("pageheaders"));
		for(WebElement row:rows) {
			String ss1=row.getText();
			ownerlist.add(ss1);
			System.out.println(ss1);
		}
		for(String s:ownership) {
			int count=0;
			for(String w:ownerlist) {
				
				if(s.equalsIgnoreCase(w)) {
					System.out.println(s+" is present on webpage");	
					break;
				}
				else {
					count+=1;
					if(count>=ownerlist.size()) {
						System.out.println(s+" not in webpage");
					}
					continue;
				}
			}
		}
	}
		@Test
		public void MPP_IPClasses() {
			List<String>IPclasses=new ArrayList<String>();
			IPclasses.add("Name");
			IPclasses.add("Has Class Access?");
			IPclasses.add("Type");
			IPclasses.add("Description");
			IPclasses.add("State");
			List<String>IPclass=new ArrayList<String>();
			WebElement table=d.findElement(By.id("Ten"));
			List<WebElement> cols=table.findElements(By.tagName("th"));
			for(WebElement c:cols) {
				String ss2=c.getText();
				IPclass.add(ss2);
				System.out.println(ss2);
			}
			for(String s:IPclasses) {
				int count=0;
				for(String w:IPclass) {
					
					if(s.equalsIgnoreCase(w)) {
						System.out.println(s+" is present on webpage");	
						break;
					}
					else {
						count+=1;
						if(count>=IPclass.size()) {
							System.out.println(s+" not in webpage");
						}
						continue;
					}
				}
			}
		}
			@Test
			public void MPP_Organizations() {
				List<String>organizations=new ArrayList<String>();
				organizations.add("Primary Organization");
				organizations.add("Secondary Organization");
				List<String>organ=new ArrayList<String>();
				WebElement table=d.findElement(By.id("Twelve"));
				List<WebElement>cols=table.findElements(By.id("pageheaders"));
				for(WebElement r:cols) {
					String ss=r.getText();
					organ.add(ss);
					System.out.println(ss);
				}
				for(String s:organizations) {
					int count=0;
					for(String w:organ) {
						
						
					if(s.equalsIgnoreCase(w)) {
							System.out.println(s+" is present on webpage");	
							break;
					}
						else {
							count+=1;
							if(count>=organ.size()) {
								System.out.println(s+" not in webpage");
							}
							continue;
				}
				
		  }
		  }
				
			}
			
			@Test
			public void MPP_Notes() {
				System.out.println("\n");
				d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				try {
					if(d.findElement(By.linkText("Notes")).isDisplayed()) {}
				}
				catch(Exception e) {
					System.out.println("Notes webelement not found in webpage");
					System.out.println();
					
				}
			}
			@Test
			public void MPP_Stability_Document() {
				System.out.println("\n");
				d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				try {
					if(d.findElement(By.linkText("Stability Document")).isDisplayed()) {}
				}
				catch(Exception e) {
					System.out.println("Stability Document webelement not found in webpage");
					System.out.println();
					
				}
			}
			@Test
			public void MPP_Bill_of_Materials() {
				System.out.println("\n");
				d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				try {
					if(d.findElement(By.linkText("Bill of Materials")).isDisplayed()) {}
				}
				catch(Exception e) {
					System.out.println("Bill of Materials webelement not found in webpage");
					System.out.println();
					
				}
			}
			@Test
			public void MPP_Substitutes() {
				System.out.println("\n");
				d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				try {
					if(d.findElement(By.linkText("Substitutes")).isDisplayed()) {}
				}
				catch(Exception e) {
					System.out.println("Substitutes webelement not found in webpage");
					System.out.println();
					
				}
			}
			@Test
			public void MPP_Related_Specifications() {
				System.out.println("\n");
				d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				try {
					if(d.findElement(By.linkText("Related Specifications")).isDisplayed()) {}
				}
				catch(Exception e) {
					System.out.println("Related Specifications webelement not found in webpage");
					System.out.println();
					
				}
			}
			@Test
			public void MPP_Reference_Documents() {
				System.out.println("\n");
				d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				try {
					if(d.findElement(By.linkText("Reference Documents")).isDisplayed()) {}
				}
				catch(Exception e) {
					System.out.println("Reference Documents webelement not found in webpage");
					System.out.println();
					
				}
			}
			@Test
			public void MPP_Security_Classes() {
				System.out.println("\n");
				d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				try {
					if(d.findElement(By.linkText("Security Classes")).isDisplayed()) {}
				}
				catch(Exception e) {
					System.out.println("Security Classes webelement not found in webpage");
					System.out.println();
					
				}
			}
			@Test
			public void MPP_Files() {
				System.out.println("\n");
				d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				try {
					if(d.findElement(By.linkText("Files")).isDisplayed()) {}
				}
				catch(Exception e) {
					System.out.println("Files webelement not found in webpage");
					System.out.println();
					
				}
			}
  @BeforeClass
 	public void beforeClass() throws InterruptedException{
 		
 		
 		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandeep\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
 		d=new ChromeDriver();
 		d.get("https://specsqaap.pg.com/login");
 		d.manage().window().maximize();
 		
 		
 		Thread.sleep(1000);
 		d.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
 		d.findElement(By.id("username")).sendKeys("Anywheretwo.im");
 		d.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
 		d.findElement(By.id("password")).sendKeys("Sa061920");
 		d.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);
 		d.findElement(By.id("loginButton")).click();
 		d.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);
 		Thread.sleep(5000);
 		d.findElement(By.id("searchBox")).sendKeys("MPP");
 		d.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
 		d.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div/div/form/div/div[1]/div/button")).click();
 		Thread.sleep(1000);
 		d.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[2]/div/div/div/div/div/div[2]/ul/li[4]/a/span")).click();//page 2
 		Thread.sleep(1000);
 		d.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[2]/div/div/div/div/table/tbody/tr[20]/td[1]/a/span")).click();//last link in page2
 		Thread.sleep(1000);
}
 		@AfterClass
		public void afterClass() {
			
			d.quit();
		
		}
  }
  
  




