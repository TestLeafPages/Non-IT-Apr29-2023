Saturday 

Agenda for Today:
=================
   08:45 to 09:00->Live Quiz
   09:00 to 09:40->TestNG Introduction & convert normal script to TestNG tests
   09:40 to 10:05->Breakout(15 mins)+Break(10 mins)
   10:05 to 10:35->Sequential Execution 
   10:35 to 11:00->Breakout(15 mins)+Break(10 mins)
   11:00 to 11:35-> Parallel Execution
   11:35 to 12:00->Breakout(15 mins)+Break(10 mins)
   12:00 to 12:40->TestNG Annotations
   12:40 to 01:00->Breakout(20 mins)
   01:00 to 01:10->Recap


   week1-java basic
   week2-selenium basic
   week3-array,string,oops,list
   week4-target locators ,action class
=======================================================
TestNG
================


   TestNG-Test Next Generation

   Execution Framework-Configuration

   TestNG-
   J  unit-java
   N unit-.net

   example
   -moive,shopping,hotel

   moive-createlead
   hotel-editlead
   shopping-deletelead

   TestNG-Execution Framework

   mall-(moive,shopping,hotel)

   TestNG(createlead,editlead,deletelead)
   Sequential & Parallel Execution

selenium basic - no status and no report
TestNG - i can get status and report

Selenium basic - how data pass(hardcode)
TestNG-we can run with different set data

selenium basic-no way to filter the test to run
TestNG-i can run testcase in group


Verbose-To get error log inside  consle
verbose="5"
5= value

default value verbose is 2


Threadcount-how many thread open(browser)
testcase-3
Threadcount-2



Annotation
==========



@Test-mandatory
other annotation are optional


@BeforeSuite-one only _start report
    @BeforeTest-connect DB
      @BeforeClass-common action we use(tc name,desc,author)
         @BeforeMethod-pre condition(launch browser,url,username ,password)
                 @Test(mandatory)
         @AfterMethod-post condition(driver.close)
      @AfterClass    
    @AfterTest
@AfterSuite             












Sequential and Parallel Execution

Steps: Select the testcases with @Test-->rightclick Testng-->convert to TestNg
For Parallel-->select parallel mode-Classes 
Add verbose
Execute from Xml file
