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
import org.testng.asserts.SoftAssert;

public class FOP {
	static WebDriver d;
	SoftAssert assertion=new SoftAssert();
  @Test
  public void FOP_Attributes() {
	  
		  List<String> Attributes=new ArrayList<String>();
		  Attributes.add("Title");
		  Attributes.add("Description");
		  Attributes.add("Type");
		  Attributes.add("Formulation Type");
		  Attributes.add("Formulation");
		  Attributes.add("Product Platform");
		  Attributes.add("Business Area");
		  Attributes.add("Product Category Platform");
		  Attributes.add("Product Technology Platform");
		  Attributes.add("Product Technology Chassis");
		  Attributes.add("Franchise");
		  Attributes.add("Structured Release Criteria Required");
		  Attributes.add("Does This Contain a Battery");
		  Attributes.add("Standard Cost");
		  Attributes.add("Is PGP Product diluted for Use?");
		  Attributes.add("Percent Concentrate");
		  Attributes.add("Percent Water");
		  Attributes.add("Dangerous Goods Ready");
		  Attributes.add("Originator");
		  Attributes.add("Last Update User");
		  Attributes.add("Revision");
		  Attributes.add("Originated");
		  Attributes.add("Segment");
		  Attributes.add("Phase");
		  Attributes.add("Owner");
		  Attributes.add("Release Date");
		  Attributes.add("Effective Date");
		  Attributes.add("Expiration Date");
		  Attributes.add("Previous Revision Obsolete Date");
		  Attributes.add("Reason for Change");
		  Attributes.add("Is Product Certification or Local Standards Compliance Statement Required");
		  Attributes.add("Product Dose Per Use");
		  Attributes.add("Product Dose per Use UoM");
		  Attributes.add("Mode of Product Disposal");
		  Attributes.add("Expected Frequency of Use");
		  Attributes.add("Expected Frequency of Use UoM");
		  Attributes.add("Manufacturing Status");
		  Attributes.add("Brand");
		  Attributes.add("Product Form");
		  Attributes.add("Class");
		  Attributes.add("Sub Class");
		  Attributes.add("Reported Function");
		  Attributes.add("Base Unit Of Measure");
		  Attributes.add("On-shelf Product Density");
		  Attributes.add("Density Unit of Measure");
		  Attributes.add("Base Quantity");
		  Attributes.add("Sap BOM Base QTY");
		  Attributes.add("Local Description");
		  Attributes.add("Other Names");
		  Attributes.add("Intended Markets");
		  Attributes.add("Replaced Product Name");
		  Attributes.add("Unique Formula Identifier");
		  Attributes.add("Comments");
		  Attributes.add("Obsolete Date");
		  Attributes.add("Obsolete Comment");
		  WebElement t= d.findElement(By.id("zero"));
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
  public void FOP_Weightcharacteristics() {
	  List<String>weight=new ArrayList<String>();
	  weight.add("Name");
	  weight.add("Type");
	  weight.add("Gross Weight");
	  weight.add("Weight UoM");
	  weight.add("Comments");
	  WebElement t= d.findElement(By.id("one"));
	  List<WebElement> we=t.findElements(By.tagName("th"));
	  for(String s:weight) {
		  int count=0;
		  for(WebElement w:we) {
			  String s1=w.getText();
			  if(s.equalsIgnoreCase(s1)) {
				  Assert.assertEquals(s1,s);
				  System.out.println(s+ "  is present on webpage");
				  break;
			  }
			  else {
				  count+=1;
				  if(count>=we.size()) {
					  System.out.println("desc not there on webpage");
				  }
				  continue;
			  }
		  }
	  }
	  
	  
  }
  @Test
  public void FOP_Storage() {
	  List<String>storage=new ArrayList<String>();
	  	  storage.add("Technology");
	  	storage.add("Is Product Marketed as Children's Product");
	  	storage.add("Does the Product Require Child Safe Design");
	  	storage.add("Is Product Exposed to Children");
	  	storage.add("Warehousing Classification");
	  	storage.add("Shipping Hazard Classification");
	  	storage.add("Shipping Information");
	  	storage.add("Storage Conditions");
	  	storage.add("Storage Temperature Limits");
	  	storage.add("Storage Humidity Limits"); 
	  	 WebElement t= d.findElement(By.id("four"));
		  List<WebElement> st=t.findElements(By.id("pageheaders"));
		  for(String s:storage) {
			  int count=0;
			  for(WebElement w:st) {
				  String s1=w.getText();
				  if(s.equalsIgnoreCase(s1)) {
					  Assert.assertEquals(s1,s);
					  System.out.println(s+ "  is present on webpage");
					  break;
				  }
				  else {
					  count+=1;
					  if(count>=st.size()) {
						  System.out.println("desc not there on webpage");
					  }
					  continue;
				  }
			  }
		  }
		  
	  
  }
  @Test
  public void FOP_Chemicals() {
	  
		  List<String>chemicals=new ArrayList<String>();
		  chemicals.add("Color");
		  chemicals.add("Color Intensity");
		  chemicals.add("Odour");
		  chemicals.add("Heat of Combustion (kJ/g) [calculated or tested value]");
		  chemicals.add("Can Construction");
		  chemicals.add("Gauge Pressure @ 130F/55C (kPa) [maximum value]");
		  chemicals.add("Aerosol Type");
		  chemicals.add("Is aerosol test data needed?");
		  chemicals.add("Ignition Distance - cm [maximum tested value]");
		  chemicals.add("Enclosed Space Ignition Time Equivalent (s/m3) [maximum tested value]");
		  chemicals.add("Foam Flammability Test: Flame Height(cm) [maximum tested value]");
		  chemicals.add("Foam Flammability Test: Flame Duration(sec) [maximum tested value]");
		  chemicals.add("Vapor Pressure(pascals)");
		  chemicals.add("Vapor Density [Mandatory for Air Care products to be sold in the EU]");
		  chemicals.add("Relative Density");
		  chemicals.add("Is the liquid an aqueous solution");
		  chemicals.add("Is pH data available?");
		  chemicals.add("pH [Target]");
		  chemicals.add("pH [minimum]");
		  chemicals.add("pH [maximum]");
		  chemicals.add("pH Dilution");
		  chemicals.add("Are the Contents of the aerosol can Corrosive to Metals (Aluminum or Carbon Steel)?");
		  chemicals.add("Technical Basis for the Corrosive to Metals Determination Provided");
		  chemicals.add("Conductivity of the contents in the aerosol can (microsiemens/cm)");
		  chemicals.add("Closed Cup Flashpoint(C)");
		  chemicals.add("Closed Cup Flashpoint Value(C) [maximum value]");
		  chemicals.add("Boiling Point(C)");
		  chemicals.add("Boiling Point Value(C)");
		  chemicals.add("Does the Product Sustain Combustion?");
		  chemicals.add("Does the Product Contain an Oxidizer as a Raw Material?");
		  chemicals.add("Is the Oxidizer Sodium percarbonate < 60%?");
		  chemicals.add("Is the Oxidizer Hydrogen Peroxide < 8%");
		  chemicals.add("Does the product have the potential to increase the burning rate or intensity of a combustible substance?");
		  chemicals.add("Does product contain an Organic Peroxide as a raw material?");
		  chemicals.add("Available Oxygen content(%)");
		  chemicals.add("Dynamic Viscosity (centipoise) [mandatory for products sold in the EU]");
		  chemicals.add("Relative Evaporation Rate (butyl acetate=1) [Mandatory for Air Care products to be sold in the EU]");
		  chemicals.add("Reserve Alkalinity, % (required if pH[target] or pH [maximum] > 10)");
		  chemicals.add("Reserve Alkalinity/Acidity Unit of Measure");
		  chemicals.add("Kinematic Viscosity - mm/sec");
		  chemicals.add("Evaporation Rate");
		  chemicals.add("pH availability");
		  chemicals.add("Reserve Acidity, % (required if pH < 4)");
		  chemicals.add("Is the Liquid Corrosive to Metal(Aluminum or Carbon Steel)?");
		  chemicals.add("Conductivity of the liquid(microsiemens/cm)");
		  chemicals.add("Is a Flammable Liquid absorbed or Contained within the solid?");
		  chemicals.add("Burn Rate, mm/sec [maximum tested value]");
		  chemicals.add("Does the product have any self-reactive properties or is it thermally unstable?");
		  chemicals.add("Heat of Decomposition [kJ/g]");
		  chemicals.add("Self-Accelerating Decomposition Temperature(SADT)(C)[maximum tested value]");
		  chemicals.add("Content Conductivity(mS/cm)");
		  chemicals.add("Corrosive to Metals");
		  chemicals.add("Sustain Combustion");
		  chemicals.add("Oxidizer-%");
		  chemicals.add("% by Volume ethanol and/or propanol-%");
		  chemicals.add("% by Weight emulsified Liquified flammable gas propellant-%");
		  WebElement t= d.findElement(By.id("five"));
		  List<WebElement> ch=t.findElements(By.id("pageheaders"));
		  for(String s:chemicals) {
			  int count=0;
			  for(WebElement w:ch) {
				  String s1=w.getText();
				  if(s.equalsIgnoreCase(s1)) {
					  Assert.assertEquals(s1,s);
					  System.out.println(s+ "  is present on webpage");
					  break;
				  }
				  else {
					  count+=1;
					  if(count>=ch.size()) {
						  System.out.println("desc not there on webpage");
					  }
					  continue;
				  }
			  }
		  }
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
  }
  @Test
  public void FOP_Product() {
	  List<String>product=new ArrayList<String>();
	  product.add("Product Expiration Date Required");
	  product.add("Total Shelf Life-Days");
	  product.add("Temperature Group");
	  product.add("Humidity Group");
	  product.add("Transport Freeze Protection");
	  product.add("Transport Head Protection");
	  product.add("Boundary Conditions");
	  product.add("Stability Document");
	  WebElement t= d.findElement(By.id("eight"));
	  List<WebElement> pr=t.findElements(By.tagName("th"));
	  for(String s:product) {
		  int count=0;
		  for(WebElement w:pr) {
			  String s1=w.getText();
			  if(s.equalsIgnoreCase(s1)) {
				  Assert.assertEquals(s1,s);
				  System.out.println(s+ "  is present on webpage");
				  break;
			  }
			  else {
				  count+=1;
				  if(count>=pr.size()) {
					  System.out.println("desc not there on webpage");
				  }
				  continue;
			  }
		  }
	  }

  }
  @Test
  public void FOP_Formulation() {
	  List<String>form=new ArrayList<String>();
	  form.add("Formula Number");
	  form.add("Revision");
	  form.add("Title");
	  form.add("Revision Status");
	  form.add("Phase(Pha) State(St)");
	  form.add("Formulation Type(FT) Formula Name(FN)");
	  form.add("Name");
	  form.add("Type");
	  form.add("Title");
	  form.add("Pha");
	  form.add("St");
	  form.add("FT");
	  form.add("FN");
	  List<String>fo=new ArrayList<String>();
		WebElement table=d.findElement(By.id("elevan"));
		
		List<WebElement>rows=table.findElements(By.tagName("th"));
		
		
		for(WebElement c:rows) {
			String sc=c.getText();
			fo.add(sc);
			System.out.println(sc);
		}
		List<String>f=new ArrayList<String>();
		WebElement table2=d.findElement(By.id("elevan"));
		
		
			List<WebElement>cols2=table2.findElements(By.tagName("bomFontClass"));
		for(WebElement c:cols2) {
			String sc=c.getText();
			f.add(sc);
			System.out.println(sc);    
		}
		for(String s:f) {
			for(String ss:s.split(":")) {
				fo.add(ss);
			}
		}
		for(String s:form) {
			int count=0;
			for(String s1:fo) {
				if(s.equalsIgnoreCase(s1)) {
					System.out.println(s+"is present in webpage");
					break;
				}
				else {
					count+=1;
					if(count>=fo.size()) {
						System.out.println(s+"is not present in webpage");
					}
					continue;
				}
			}
		}
	  
  }
  @Test
  public void FOP_Formulation_Formula() {
	  List<String>formula=new ArrayList<String>();
	  formula.add("Name(N) Type(T)");
	  formula.add("Chg");
	  formula.add("SEQ");
	  formula.add("Title/Instruction");
	  formula.add("Min%[w/w][Min] Wet%(w/w)(Wet) Max%[w/w][Max]");
	  formula.add("Target Wet Weight(TWW) Wet Weight Min(WEM) Wet Weight Max(WWM)");
	  formula.add("Dry%(w/w)(Dry) Target Dry Weight(TDW) Processing Loss%(PL)");
	  formula.add("Function(F) Reported Function(RF) Phase(Ph)");
	  formula.add("Virtual Intermediate Name");
	  formula.add("Processing Note");
	  formula.add("Units Value(UV) Certifications(C) Substitute Parts(SP) State(S) Rev(R)");
	  formula.add("N");
	  formula.add("T");
	  formula.add("Min");
	  formula.add("Wet");
	  formula.add("Max");
	  formula.add("TWW");
	  formula.add("WEM");
	  formula.add("WWM");
	  formula.add("Dry");
	  formula.add("TDW");
	  formula.add("PL");
	  formula.add("F");
	  formula.add("RF");
	  formula.add("Ph");
	  formula.add("UV");
	  formula.add("C");
	  formula.add("SP");
	  formula.add("S");
	  formula.add("R");
	  List<String>fo=new ArrayList<String>();
		WebElement table=d.findElement(By.id("twelve"));
		
		List<WebElement>rows=table.findElements(By.tagName("th"));
		
	
		for(WebElement c:rows) {
			String sc=c.getText();
			fo.add(sc);
			System.out.println(sc);
		}
		List<String>f=new ArrayList<String>();
		WebElement table2=d.findElement(By.id("twelve"));
		
		
			List<WebElement>cols2=table2.findElements(By.tagName("bomFontClass"));
		for(WebElement c:cols2) {
			String sc=c.getText();
			f.add(sc);
			System.out.println(sc);    
		}
		for(String s:f) {
			for(String ss:s.split(":")) {
				fo.add(ss);
			}
		}
		for(String s:formula) {
			int count=0;
			for(String s1:fo) {
				if(s.equalsIgnoreCase(s1)) {
					System.out.println(s+"is present in webpage");
					break;
				}
				else {
					count+=1;
					if(count>=fo.size()) {
						System.out.println(s+"is not present in webpage");
					}
					continue;
				}
			}
		}
	  
	  
	  
	  
  }
  @Test
  public void FOP_Reference() {
	  List<String>Reference=new ArrayList<String>();
	  Reference.add("Name");
	  Reference.add("Title");
	  Reference.add("Source");
	  Reference.add("Rev");
	  Reference.add("Type");
	  Reference.add("Description");
	  Reference.add("State");
	  Reference.add("Language");
	  WebElement t= d.findElement(By.id("seventeen"));
	  List<WebElement> re=t.findElements(By.tagName("th"));
	  for(String s:Reference) {
		  int count=0;
		  for(WebElement w:re) {
			  String s1=w.getText();
			  if(s.equalsIgnoreCase(s1)) {
				  Assert.assertEquals(s1,s);
				  System.out.println(s+ "  is present on webpage");
				  break;
			  }
			  else {
				  count+=1;
				  if(count>=re.size()) {
					  System.out.println("desc not there on webpage");
				  }
				  continue;
			  }
		  }
	  }
  }
  @Test
  public void FOP_Materials() {
	  List<String>Materials=new ArrayList<String>();
	  Materials.add("Name(N) Type(T)");
	  Materials.add("Title");
	  Materials.add("Min Quantity(Min) Dry%(w/w)(Dry) Max Quantity(Max)");
	  Materials.add("Quantity UofM(UoM): QS/Target(QS) Usage Flags(UF)");
	  Materials.add("Applications/Functions");
	  Materials.add("Is Impurity(IP) CAS Number(CAS) State(State) Revision(Rev)");
	  Materials.add("Description");
	  Materials.add("N");
	  Materials.add("T");
	  Materials.add("Min");
	  Materials.add("Dry");
	  Materials.add("Max");
	  Materials.add("UoM");
	  Materials.add("QS");
	  Materials.add("UF");
	  Materials.add("IP");
	  Materials.add("CAS");
	  Materials.add("State");
	  Materials.add("Rev");
	  List<String>ma=new ArrayList<String>();
		WebElement table=d.findElement(By.id("nineteen"));
		
		List<WebElement>rows=table.findElements(By.tagName("th"));
		
		for(WebElement c:rows) {
			String sc=c.getText();
			ma.add(sc);
			System.out.println(sc);
		}
		List<String>f=new ArrayList<String>();
		WebElement table2=d.findElement(By.id("nineteen"));
		
		
			List<WebElement>cols2=table2.findElements(By.tagName("bomFontClass"));
		for(WebElement c:cols2) {
			String sc=c.getText();
			f.add(sc);
			System.out.println(sc);    
		}
		for(String s:f) {
			for(String ss:s.split(":")) {
				ma.add(ss);
			}
		}
  }
  @Test
  public void FOP_Plants() {
	  List<String>Plants=new ArrayList<String>();
	  Plants.add("Plants");
	  Plants.add("Authorized To Use");
	  Plants.add("Authorised to Produce");
	  Plants.add("Activated");
	  WebElement t= d.findElement(By.id("twenty"));
	  List<WebElement> pl=t.findElements(By.tagName("th"));
	  for(String s:Plants) {
		  int count=0;
		  for(WebElement w:pl) {
			  String s1=w.getText();
			  if(s.equalsIgnoreCase(s1)) {
				  Assert.assertEquals(s1,s);
				  System.out.println(s+ "  is present on webpage");
				  break;
			  }
			  else {
				  count+=1;
				  if(count>=pl.size()) {
					  System.out.println("desc not there on webpage");
				  }
				  continue;
			  }
		  }
	  }
	  
  }
  @Test
	public void FOP_lifecycle() throws InterruptedException {
		
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
		
	WebElement ltable=d.findElement(By.id("twentytwo"));
		List<WebElement>rows=ltable.findElements(By.tagName("th"));
		
			for(WebElement c:rows) {
				String sc=c.getText();
				val.add(sc);
				System.out.println(sc);
			}
		
		for(String s:life) {
			int count=0;
			for(String w:val) {
				if(s.equalsIgnoreCase(w)) {
					Assert.assertEquals(s,w);
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
	public void FOP_Ownership() {
		List<String>ownership=new ArrayList<String>();
		ownership.add("Orginator");
		ownership.add("Co-Owners");
		ownership.add("Last Update User");
		ownership.add("Segment");
		ownership.add("Approvers");
		ownership.add("Last Update Date");
		List<String>ownerlist=new ArrayList<String>();
		WebElement owner=d.findElement(By.id("twentythree"));
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
		public void FOP_IPClasses() {
			List<String>IPclasses=new ArrayList<String>();
			IPclasses.add("Name");
			IPclasses.add("Has Class Access?");
			IPclasses.add("Type");
			IPclasses.add("Description");
			IPclasses.add("State");
			List<String>IPclass=new ArrayList<String>();
			WebElement table=d.findElement(By.id("twentyfour"));
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
			public void FOP_Organizations() {
				List<String>organizations=new ArrayList<String>();
				organizations.add("Primary Organization");
				organizations.add("Secondary Organization");
				List<String>organ=new ArrayList<String>();
				WebElement table=d.findElement(By.id("twentyseven"));
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
			public void FOP_Goods_Classification() {
				System.out.println("\n");
				d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				try {
					if(d.findElement(By.linkText("Dangerous Goods Classification")).isDisplayed()) {}
				}
				catch(Exception e) {
					System.out.println("Dangerous Goods Classification webelement not found in webpage");
					System.out.println();
					
				}
			}
			@Test
			public void FOP_Global() {
				System.out.println("\n");
				d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				try {
					if(d.findElement(By.linkText("Global Harmonized Standard")).isDisplayed()) {}
				}
				catch(Exception e) {
					System.out.println("Global Harmonized Standard webelement not found in webpage");
					System.out.println();
					
				}
			}
			@Test
			public void FOP_Chemicals_Warehouse() {
				System.out.println("\n");
				d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				try {
					if(d.findElement(By.linkText("Chemicals and physical properties-Warehouse Classification")).isDisplayed()) {}
				}
				catch(Exception e) {
					System.out.println("Chemicals and physical properties-Warehouse Classification webelement not found in webpage");
					System.out.println();
					
				}
			}
			@Test
			public void FOP_Chemicals_Enguinityl() {
				System.out.println("\n");
				d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				try {
					if(d.findElement(By.linkText("Chemicals and physical properties-Enginuity/Legacy Data")).isDisplayed()) {}
				}
				catch(Exception e) {
					System.out.println("Chemicals and physical properties-Enginuity/Legacy Data webelement not found in webpage");
					System.out.println();
					
				}
			}
			@Test
			public void FOP_Product_Part() {
				System.out.println("\n");
				d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				try {
					if(d.findElement(By.linkText("Product Part Stability Document")).isDisplayed()) {}
				}
				catch(Exception e) {
					System.out.println("Product Part Stability Document webelement not found in webpage");
					System.out.println();
					
				}
			}
			@Test
			public void FOP_Master_Part() {
				System.out.println("\n");
				d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				try {
					if(d.findElement(By.linkText("Master Part Stability Document")).isDisplayed()) {}
				}
				catch(Exception e) {
					System.out.println("Master Part Stability Document webelement not found in webpage");
					System.out.println();
					
				}
			}
			@Test
			public void FOP_SAP() {
				System.out.println("\n");
				d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				try {
					if(d.findElement(By.linkText("SAP BOM as Fed")).isDisplayed()) {}
				}
				catch(Exception e) {
					System.out.println("SAP BOM as Fed webelement not found in webpage");
					System.out.println();
					
				}
			}
			@Test
			public void FOP_Substitutes() {
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
			public void FOP_Market() {
				System.out.println("\n");
				d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				try {
					if(d.findElement(By.linkText("Market Clearance")).isDisplayed()) {}
				}
				catch(Exception e) {
					System.out.println("Market Clearance webelement not found in webpage");
					System.out.println();
					
				}
			}
			@Test
			public void FOP_Related() {
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
			public void FOP_Master_Specifications() {
				System.out.println("\n");
				d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				try {
					if(d.findElement(By.linkText("Master Specifications")).isDisplayed()) {}
				}
				catch(Exception e) {
					System.out.println(" Master Specifications webelement not found in webpage");
					System.out.println();
					
				}
			}
			@Test
			public void FOP_Performance_Characteristics() {
				System.out.println("\n");
				d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				try {
					if(d.findElement(By.linkText("Performance Characteristics")).isDisplayed()) {}
				}
				catch(Exception e) {
					System.out.println("Performance Characteristics webelement not found in webpage");
					System.out.println();
					
				}
			}
			@Test
			public void FOP_Materials_Produced() {
				System.out.println("\n");
				d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				try {
					if(d.findElement(By.linkText("Materials Produced")).isDisplayed()) {}
				}
				catch(Exception e) {
					System.out.println("Materials Produced webelement not found in webpage");
					System.out.println();
					
				}
			}
			@Test
			public void FOP_Security_Classes() {
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
			public void FOP_Related_ATS() {
				System.out.println("\n");
				d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				try {
					if(d.findElement(By.linkText("Related_ATS")).isDisplayed()) {}
				}
				catch(Exception e) {
					System.out.println("Related ATS webelement not found in webpage");
					System.out.println();
					
				}
			}
			
			@Test
			public void FOP_Files() {
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
			@Test
			public void FOP_Certifications() {
				System.out.println("\n");
				d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				try {
					if(d.findElement(By.linkText("Certifications")).isDisplayed()) {}
				}
				catch(Exception e) {
					System.out.println("Certifications webelement not found in webpage");
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
			 		d.findElement(By.id("searchBox")).sendKeys("FOP");
			 		d.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
			 		d.findElement(By.id("exact")).click();
			 		Thread.sleep(1000);
			 		d.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[2]/div/div/div/div/table/tbody/tr[8]/td[1]/a/span")).click();
			 		Thread.sleep(1000);
			 		
			}
			  @AfterClass
				public void afterClass() {
					
					d.quit();
				
				}
			
	  


}
