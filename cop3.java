package myprojects;
import java.util.ArrayList;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
//import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;


public class cop3 {
	static WebDriver d;
	SoftAssert assertion=new SoftAssert();
  @Test
  public void COP_Attribute() {
	  List<String> Attributes=new ArrayList<String>();
	  Attributes.add("Title");
	  Attributes.add("Specification Sub Type");
	  Attributes.add("Revision");
	  Attributes.add("Owner");
	  Attributes.add("Release Date");
	  Attributes.add("Previous Revision Obsolete Date");
	  Attributes.add("Product Dose Per Use UoM");
	  Attributes.add("Mode of Product Disposal");
	  Attributes.add("Base Unit Of Measure");
	  Attributes.add("Other Names");
	  Attributes.add("Packaging Size UoM");
	  Attributes.add("Obsolete Date");
	  Attributes.add("Description");
	  Attributes.add("Originator");
	  Attributes.add("Originated");
	  Attributes.add("Segment");
	  Attributes.add("Is Product Certification or Local");
	  Attributes.add("Standards Compliance Statement");
	  Attributes.add("Required");
	  Attributes.add("Expected Frequency of Use");
	  Attributes.add("Reason for Change");
	  Attributes.add("Alternative Unit Of Measure");
	  Attributes.add("Packaging Type");
	  Attributes.add("Comments");
	  Attributes.add("Obsolete Comment");
	  Attributes.add("Type");
	  Attributes.add("Last Update User");
	  Attributes.add("Phase");
	  Attributes.add("Structured Release Criteria Required");
	  Attributes.add("Expiration Date");
	  Attributes.add("Product Dose Per Use");
	  Attributes.add("Expected Frequency of Use UoM");
	  Attributes.add("Brand");
	  Attributes.add("Local Description");
	  Attributes.add("Packaging Size");
	  Attributes.add("Crush Index");
	  Attributes.add("Classification");
	  WebElement t= d.findElement(By.id("collapseZero"));
	  List<WebElement> l=t.findElements(By.id("pageheaders"));
	  for(String s:Attributes) {
		  int count=0;
		  for(WebElement w:l) {
			  String s1=w.getText();
			  if(s.equalsIgnoreCase(s1)) {
				  Assert.assertEquals(s1,s);
				  System.out.println(s+ "  is present on webpage");
				  break;
			  }
			  else {
				  count+=1;
				  if(count>=l.size()) {
					  System.out.println("desc not there on webpage");
				  }
				  continue;
			  }
		  }
	  }
	  
	  
	  
  }
  @Test
  public void COP_Weightcharacteristics() {
	  List<String> Attributes=new ArrayList<String>();
	  Attributes.add("Gross Weight:");
	  Attributes.add("Legacy Product Weight:");
	  Attributes.add("Legacy Weight Factor UoM:");
	  Attributes.add("Net Weight UoM:");
	  Attributes.add("Weight UoM:");
	  Attributes.add("Legacy Weight Factor:");
	  Attributes.add("Net Weight of Product In ConsumerUnit:");
	  
	 
	  
	  WebElement t= d.findElement(By.id("collapseOne"));
	  List<WebElement> l=t.findElements(By.id("pageheaders"));
	  for(String s:Attributes) {
		  int count=0;
		  for(WebElement w:l) {
			  String s1=w.getText();
			  if(s.equalsIgnoreCase(s1)) {
				  Assert.assertEquals(s1,s);
				  System.out.println(s+ " is present on webpage");
				  break;
			  }
			  else {
				  count+=1;
				  if(count>=l.size()) {
					  System.out.println("desc not there on webpage");
				  }
				  continue;
			  }
		  }
	  }
  }
	  @Test
	  public void COP_BillOfMaterials() {
		  List<String> Attributes=new ArrayList<String>();
	      Attributes.add("N");
	      Attributes.add("R");
	      Attributes.add("SP");      
	      Attributes.add("Alt");        
	      Attributes.add("OSPD");     
	      Attributes.add("DUOM");
	     
	      List<String>perfolist=new ArrayList<String>();
	      WebElement table =d.findElement(By.xpath("//*[@id=\"collapseFive\"] "));
	      List<WebElement>rows=table.findElements(By.tagName("tr"));
	      List<WebElement>cols=rows.get(0).findElements(By.tagName("th"));
	      for(WebElement col:cols){
	      String ss=col.getText();
	      perfolist.add(ss);}
	      List<String>p=new ArrayList<String>();
	      WebElement table2 =d.findElement(By.xpath("//*[@id=\"collapseFour\"] "));
	      List<WebElement>rows2=table2.findElements(By.tagName("tr"));
	      List<WebElement>cols2=rows2.get(0).findElements(By.className("bomFontClass"));
	      for(WebElement col:cols2){
	    	  String ss=col.getText();
		      p.add(ss);}
		      for(String s:p){
		      for(String ss:s.split(":")){
		      perfolist.add(ss);}}
		      
		      for(String s:Attributes){
		      int count=0;
		      for(String s1:perfolist){
		      if(s.equalsIgnoreCase(s1)){
		      System.out.println(s +" present on webpage");
		      break;}
		      else{
		      count+=1;
		      if(count>=perfolist.size()){
		      System.out.println(s+" not found on webpage");}
		      continue;}}}
	      }
	  @Test
	  public void COP_Substitutes() {
		  List<String> Attributes=new ArrayList<String>();
	      Attributes.add("SP");
	      Attributes.add("REV");
	      Attributes.add("SCN");
	      Attributes.add("Title");
	      Attributes.add("T");
	      Attributes.add("SST");
	      Attributes.add("SF");
	      Attributes.add("REV");
	      Attributes.add("T");
	      Attributes.add("Ti");
	      Attributes.add("SST");
	      Attributes.add("OC");
	      List<String>perfolist=new ArrayList<String>();
	      WebElement table =d.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div[2]/div/div[4]/div[2]/div/div/table/thead"));
	      List<WebElement>rows=table.findElements(By.tagName("tr"));
	      List<WebElement>cols=rows.get(0).findElements(By.tagName("th"));
	      for(WebElement col:cols){
	      String ss=col.getText();
	      perfolist.add(ss);}
	      List<String>p=new ArrayList<String>();
	      WebElement table2 =d.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div[2]/div/div[4]/div[2]/div/div/table/tbody"));
	      List<WebElement>rows2=table2.findElements(By.tagName("tr"));
	      List<WebElement>cols2=rows2.get(0).findElements(By.className("bomFontClass"));
	      for(WebElement col:cols2){
	      String ss=col.getText();
	      p.add(ss);}
	      for(String s:p){
	      for(String ss:s.split(":")){
	      perfolist.add(ss);}}
	      
	      for(String s:Attributes){
	      int count=0;
	      for(String s1:perfolist){
	      if(s.equalsIgnoreCase(s1)){
	      System.out.println(s +" present on webpage");
	      break;}
	      else{
	      count+=1;
	      if(count>=perfolist.size()){
	      System.out.println(s+" not found on webpage");}
	      continue;}}}}
	  @Test
		public void COP_lifecycle() throws InterruptedException {
			//PropertyConfigurator.configure("log4j.properties");
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
		//	WebElement ltable=d.findElement(By.xpath("//*[@id=\"thirty\"]/div/div/table/thead"));
		WebElement ltable=d.findElement(By.id("collapseElevan"));
			List<WebElement>rows=ltable.findElements(By.tagName("tr"));
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
						break;}
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
			public void COP_Ownership() {
				List<String>Ownership=new ArrayList<String>();
				Ownership.add("Originator");
				Ownership.add("Co-Owners");
				Ownership.add("Last Update User");
				Ownership.add("Segment");
				Ownership.add("Approvers");
				Ownership.add("Last Update Date");
				
				List<String>ownerlist=new ArrayList<String>();
				WebElement table=d.findElement(By.id("collapseTwelve"));
				List<WebElement>cols=table.findElements(By.id("pageheaders"));
				for(WebElement c:cols) {
					String ss2=c.getText();
					ownerlist.add(ss2);
					System.out.println(ss2);
}
				for(String s:Ownership) {
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
			public void COP_IPClasses() {
				List<String>IPclasses=new ArrayList<String>();
				IPclasses.add("Name");
				IPclasses.add("Has Class Access?");
				IPclasses.add("Type");
				IPclasses.add("Description");
				IPclasses.add("State");
				List<String>IPclass=new ArrayList<String>();
				WebElement table=d.findElement(By.id("collapseThirteen"));
				List<WebElement>cols=table.findElements(By.tagName("th"));
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
				}}
			  @Test
			  public void COP_Organizations() {
				   
						List<String>organizations=new ArrayList<String>();
						organizations.add("Primary Organization");
						organizations.add("Secondary Organization");
						List<String>organ=new ArrayList<String>();
						WebElement table=d.findElement(By.id("collapseSixteen"));
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
							  }}
	@Test
	public void COP_Reference_Documents() throws InterruptedException {
	  d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			if(d.getPageSource().contains("Reference Documents")) {
			    System.out.println();}
			else {
				System.out.println();
				System.out.println("Reference Documents is present in template but missing in webpage");
				
				System.out.println();
				
				
			}
	}
	@Test
	public void COP_Performance_Characterstics() throws InterruptedException {
	 d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	if(d.getPageSource().contains("Performance_Characterstics")) {
	    System.out.println();}
	else {
		System.out.println();
		System.out.println("Performance_Characterstics is present in template but missing in webpage");
		
		System.out.println();
		
		
	}
	}
	@Test
	public void COP_Plants() throws InterruptedException {
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if(d.getPageSource().contains("Plants")) {
		    System.out.println();}
		else {
			System.out.println();
			System.out.println("Plants is present in template but missing in webpage");
			
			System.out.println();
			
			
		}
	}
	@Test
	public void COP_DerivedTo() throws InterruptedException {
		 d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			if(d.getPageSource().contains(" Derived To")) {
			    System.out.println();}
			else {
				System.out.println();
				System.out.println("Derived To is present in template but missing in webpage");
				
				System.out.println();
				
				
			}
	}
	@Test
	public void COP_Security_Classes() throws InterruptedException {
		 d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			if(d.getPageSource().contains("Security Classes")) {
			    System.out.println();}
			else {
				System.out.println();
				System.out.println("Security Classes is present in template but missing in webpage");
				
				System.out.println();
				
				
			}
	}
	@Test
	public void COP_Related_ATS() throws InterruptedException {
		 d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			if(d.getPageSource().contains("Related ATS")) {
			    System.out.println();}
			else {
				System.out.println();
				System.out.println("Related ATS is present in template but missing in webpage");
				
				System.out.println();
				
				
			}
	}
	@Test
	public void COP_Files() throws InterruptedException {
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if(d.getPageSource().contains("Files")) {
		    System.out.println();}
		else {
			System.out.println();
			System.out.println("Files are present in template but not there in webpage");
			
			System.out.println();
			
			
		}
	}
	@Test
	public void COP_RelatedSpecifications() throws InterruptedException {
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if(d.getPageSource().contains("Related Specifications")) {
		    System.out.println();}
		else {
			System.out.println();
			System.out.println("Related Specifications  is presnt in template but not present in webpage");
			
			System.out.println();
			
			
		}
	}
	@Test
	public void COP_Master_Specifications() throws InterruptedException {

		  d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if(d.getPageSource().contains("Master Specifications")) {
		    System.out.println();}
		else {
			System.out.println();
			System.out.println("Master Specifications is present in template but  not present in webpage");
			
			System.out.println();
			
			
		}
	}
	@Test
	public void COP_Notes() throws InterruptedException {

		  d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if(d.getPageSource().contains("Notes")) {
		    System.out.println();}
		else {
			System.out.println();
			System.out.println("Notes is presnt in template but  not present in webpage");
			
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
 		d.findElement(By.id("searchBox")).sendKeys("COP");
 		d.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

	      d.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div/form/div/div[1]/div/button")).click();
	      Thread.sleep(2000);
	      if(d.findElement(By.linkText("COP-00000005")).isDisplayed()) {
	    	  d.findElement(By.linkText("COP-00000005")).click();
	      }
 		
 		Thread.sleep(1000);

 	}
 		@AfterClass
 		public void AfterClass() {
 			d.quit();
 		}
 		

 		
 



  }


 

