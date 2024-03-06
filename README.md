Problem Statement : FINDING HOSPITALS
Website           : "https://www.practo.com"

----------------------------------------------------------------------	    	 
1.Navigate to Practo website
2.Display Doctors information and display list of surgeries 
3.In Health & wellness, fill the form with valid and invalid details

Detailed Description: Hackathon Project
----------------------------------------------------------------------
1.Navigate to Practo website
2.Search doctors for any city. Apply filters for Patient Stories, Experience, All filters and Sort filter.
3.Fetch & display the first five Doctor details
4.Go to "Surgeries". Extract & store all the surgeries in a List and display them.
5.Under "For Corporate" -> click "Health and Wellness Plan"
6.Fill the form with invalid email id & valid details for other fields.
7.Click "Schedule a demo" button and validate if button is disabled.
8.Provide email in valid format and click the button.
9.validate "Thank You" message is displayed after submitting and display the message in console.

Key Automation Scope
----------------------------------------------------------------------
-> Extract multiple options items & store in collections
-> Filling form (in different objects in web page)
-> Capture message   
-> Taking Screenshots

Technology/Automation Tools Used
-------------------------------------------------------------------------
1)  Selenium Webdriver and it's concepts.
2)  Maven
3)  Cucumber framework and it's concepts.
4)  Data Driven approach
5)  Page Object Model
6)  Cucumber Extent Report/ Cucumber Report
7)  Excel, Property file concepts
8)  Multiple Browser testing concepts
9) Selenium grid
10) Jenkins
11) Sanity and Regression suite

**********************************************************STEPS TO EXECUTE*************************************************************

-Unzip the folder
-On eclipse, goto file->import->select the maven->click on existing maven project->next->browse the location where you unzip the folder-> click on finish
-Now go to the MasterTestNg.xml file and run as TestNGSuite.
-Now the file will Execute and will give the expected output as shown below.

*******************************************************FOLDER DESCRIPTION**************************************************************

1.src/test/java- There are Six packages present in this folder.

->factory : In this package we have BaseClass.java file in which we Firstly initializing the browser and capturing screenshots where ever possible.

-> pageObjects : In this package there are five java files and there are BasePage.java, HomePage.java is the page object model for all elements present in Practo home page for searching city and search doctors speciality, DoctorPage.java is the page object model for all elements present in Doctor page for displaying the doctor details, SurgeriesPage.java is the page object model for all elements in surgeries  page, HealthAndWellnessPage.java is the page object model for all elements in health and wellness page under for corporates header.

-> stepDefinitions : In this package there are four java files used for Cucumber framework and there are Hooks.java for opening the selected browser for the Practo home page (https://www.practo.com) and closing the browser, doctorStep responsible for methods in displayDoctor feature file,healthStep responsible for methods in scheduleDemo feature file and surgeryStep responsible for methods in displaySurgery feature file.

->testCases : In this package there is three classes TC_01_DoctorTest.java, TC_02_SurgeryTest.java, TC_03_HealthTest.java and these test cases will extend BaseClass.java and in this all the methods are under testng annotations which will run in the priority base.

->testRunner : In this package, there is one runner file for running the project in cucumber framework

->utilities : In this package we have two files, excelUtility.java for printing data's in excel and ExtentReportmanager for report generation.

2.src/test/resources- In this folder, there are three files

->config.properties : In this File we have to give common inputs we are using from execution. we have given appUrl,os,browser in that page for opening website 

->extent.properties : This file is used for cucumber extent report generation

->log4j2.xml: This file is for generating logs while entire execution

3.JRE System Library: In this File we have all dependencies of JAR.files.         

4.Maven Dependencies: In this File we have all the directory on the local machine, where all the project artifacts are stored. when a Maven build is executed, Maven automatically downloads all the dependency jars into the local repository. Usually, this directory is named.

5.TestNG: This is a plugin for adding TestNG framework

6.Features: In this folder, there are three feature files named displayDoctor, displaySurgery, scheduleDemo for cucumber scenerios scripting required for step definitions.

7.logs: All the logs generated after executing the code will be stored in this folder.

8.report: In this folder all the reports of the project are stored.

9.screenShots: All the screenshots captured during execution are stored in this folder.

10.src: In this, there are two folders
	-main:It is an empty folder
	-test:It is an empty folder

11.target: It is an empty folder

12.testdata: This folder is used for reading and writing the data in the excel

->read.xlsx: for reading the data from the excel
->write.xlsx: for writing the data in the excel.

13.test-ouput: This folder is used for storing cucumber extent reports

14.CrossBrowser.xml: In this file, the test classes are defined and for cross browser execution.

15.MasterTestNg.xml : In this file, the test classes are defined and for executing only one browser. 

16.pom.xml: The pom.xml file contains information of project and configuration information for the maven to build the project such as dependencies,build directory, source directory, test source directory, plugin, goals etc. Maven reads the pom.xml file, then executes the goal.

17.run.bat: This batch file is used for running the project in command prompt

 
***************************************************************************************************************************************

                                                        OUTPUT ON CONSOLE

***************************************************************************************************************************************

TESTNG OUTPUT
--------------------------------------------------------------------------------------------------------------------------------

12:35:31.718 [main] INFO  factory.BaseClass - ********Starting TC_01_DoctorTest********
12:35:33.426 [main] INFO  factory.BaseClass - ********Location has been selected********
12:36:17.461 [main] INFO  factory.BaseClass - ********Hospitals has been selected********
12:36:18.053 [main] INFO  factory.BaseClass - ********Navigated to Doctor page********
12:36:18.561 [main] INFO  factory.BaseClass - ********Patient Filter has been selected********
12:37:15.095 [main] INFO  factory.BaseClass - ********Experience Filter has been selected********
12:37:55.463 [main] INFO  factory.BaseClass - ********All Filters has been selected********
12:37:59.537 [main] INFO  factory.BaseClass - ********Select Fees Filter under All Filters has been selected********
12:39:22.480 [main] INFO  factory.BaseClass - ********Sort Filter has been selected********
12:39:23.189 [main] INFO  factory.BaseClass - ********All Filters has been selected********
12:39:23.190 [main] INFO  factory.BaseClass - ********All Filters has been selected********
12:39:25.318 [main] INFO  factory.BaseClass - ********Availability Filter under All Filters has been selected********

Dr. Kishor's Dentistry
7 Dentist
1 - 25 years experience
Kilpauk
₹500Consultation Fees
99%1118 Patient Stories

Dr. Ajay Mohan
Dentist
15 years experience overall
Mylapore,Chennai  Impressions Dental, Cosmetic, Craniofacial Centre + 1 more
₹500 Consultation fee at clinic
100% 104 Patient Stories

Dr. Sanjay Jacob
Dentist
22 years experience overall
Tambaram East,Chennai  Dr Jacobs Dentacare Clinic
₹550 Consultation fee at clinic
98% 125 Patient Stories

Dr. V.S. Hariharan
Dentist
22 years experience overall
Anna Nagar West,Chennai  Kidz N Teenz + 2 more
₹500 Consultation fee at clinic
99% 174 Patient Stories

Dr. Rajesh Kumar
Dentist
30 years experience overall
Mylapore,Chennai  Thangam's Dental Clinic
₹500 Consultation fee at clinic
99% 174 Patient Stories

12:40:22.944 [main] INFO  factory.BaseClass - ********First Five Doctors Information has been captured********
12:40:22.946 [main] INFO  factory.BaseClass - ********Ending TC_01_DoctorTest********
12:40:23.328 [main] INFO  factory.BaseClass - ********Starting TC_02_SurgeryTest********
12:40:45.651 [main] INFO  factory.BaseClass - ********Surgeries under nav header is clicked********
12:40:45.652 [main] INFO  factory.BaseClass - ********Navigated to Surgeries page********
12:40:45.727 [main] INFO  factory.BaseClass - ********Popular surgeries in surgeries page has been scrolled********

Piles
Hernia Treatment
Kidney Stone
Cataract
Circumcision
Lasik
Varicose Veins
Gallstone
Anal Fistula
Gynaecomastia
Anal Fissure
Lipoma Removal
Sebaceous cyst
Pilonidal Sinus
Lump in Breast
TURP
Hydrocele
Knee Replacement
Hair Transplant

12:40:55.112 [main] INFO  factory.BaseClass - ********All the popular surgeries has been listed********
12:40:55.113 [main] INFO  factory.BaseClass - ********Ending TC_02_SurgeryTest********
12:40:56.001 [main] INFO  factory.BaseClass - ********Starting TC_03_HealthTest********
12:41:39.034 [main] INFO  factory.BaseClass - ********Health & Wellness under FOR CORPORATES header has been clicked********
12:41:39.254 [main] INFO  factory.BaseClass - ********Navigated to Health and Wellness Plan page********
12:41:40.048 [main] INFO  factory.BaseClass - ********Negative testing by providing invalid email has been started********

Take a demo button is disabled because email id is invalid

12:41:43.122 [main] INFO  factory.BaseClass - ********Negative testing has been done********
12:42:38.567 [main] INFO  factory.BaseClass - ********Health page has been refreshed to refresh the form********
12:42:38.588 [main] INFO  factory.BaseClass - ********Positive testing by providing valid email has been started********
12:42:55.640 [main] INFO  factory.BaseClass - ********Positive testing has been done********

THANK YOU
Your demo request has been received. Our team will contact you shortly to follow-up.

12:43:09.446 [main] INFO  factory.BaseClass - ********Message After successful form submission has been captured********
12:43:09.447 [main] INFO  factory.BaseClass - ********Ending TC_03_HealthTest********

===============================================
Suite
Total tests run: 15, Passes: 15, Failures: 0, Skips: 0
===============================================

-------------------------------------------------------------------------------------------------------------------------------------------

CUCUMBER OUTPUT
-------------------------------------------------------------------------------------------------------------------------------------------
@sanity @regression
Scenario: Display Doctors Based on Filters        # Features/displayDoctor.feature:4
  Given Navigate to Practo doctors page           # stepDefinitions.doctorStep.navigate_to_practo_doctors_page()

    Embedding Display Doctors Based on Filters [image/png 378323 bytes]

12:49:06.618 [main] INFO  factory.BaseClass - ********Starting doctorStep********
12:49:08.689 [main] INFO  factory.BaseClass - ********Location has been selected********
12:49:51.708 [main] INFO  factory.BaseClass - ********Hospitals has been selected********
  When the user search for location and doctor    # stepDefinitions.doctorStep.the_user_search_for_location_and_doctor()

    Embedding Display Doctors Based on Filters [image/png 191448 bytes]

12:49:52.104 [main] INFO  factory.BaseClass - ********Navigated to Doctor page********
12:49:52.474 [main] INFO  factory.BaseClass - ********Patient Filter has been selected********
12:50:35.054 [main] INFO  factory.BaseClass - ********Experience Filter has been selected********
  And the user click on the dropdowns             # stepDefinitions.doctorStep.the_user_click_on_the_dropdowns()

    Embedding Display Doctors Based on Filters [image/png 243964 bytes]

12:50:35.694 [main] INFO  factory.BaseClass - ********All Filters has been selected********
12:50:38.795 [main] INFO  factory.BaseClass - ********Select Fees Filter under All Filters has been selected********
12:51:46.932 [main] INFO  factory.BaseClass - ********Sort Filter has been selected********
12:51:47.631 [main] INFO  factory.BaseClass - ********All Filters has been selected********
12:51:49.712 [main] INFO  factory.BaseClass - ********Availability Filter under All Filters has been selected********
  And user selects the option from the dropdowns  # stepDefinitions.doctorStep.user_selects_the_option_from_the_dropdowns()

    Embedding Display Doctors Based on Filters [image/png 234250 bytes]

Dr. Kishor's Dentistry
7 Dentist
1 - 25 years experience
Kilpauk
₹500Consultation Fees
99%1118 Patient Stories

Dr. Udhayaraja
Dentist
44 years experience overall
T Nagar,Chennai  Dr. Udhayarajas Dental & Orthodontic Centre + 1 more
₹500 Consultation fee at clinic
99% 204 Patient Stories

Dr. D Arunachalam
Dentist
36 years experience overall
Adyar,Chennai  Smiles India Family Dentistry + 1 more
₹500 Consultation fee at clinic
98% 243 Patient Stories

Dr. Rajesh Kumar
Dentist
30 years experience overall
Mylapore,Chennai  Thangam's Dental Clinic
₹500 Consultation fee at clinic
99% 174 Patient Stories

Dr. Roshan Rayen
Dentist
24 years experience overall
Nungambakkam,Chennai  Rayen Dental Care Center + 1 more
₹500 Consultation fee at clinic
98% 216 Patient Stories

12:52:19.026 [main] INFO  factory.BaseClass - ********First Five Doctors Information has been captured********
12:52:19.027 [main] INFO  factory.BaseClass - ********Ending doctorStep********
  Then display the first five doctors information # stepDefinitions.doctorStep.display_the_first_five_doctors_information()

    Embedding Display Doctors Based on Filters [image/png 234250 bytes]


@sanity @regression
Scenario: Display Surgeries provided by Practo # Features/displaySurgery.feature:4
  Given Navigate to Practo surgeries page      # stepDefinitions.surgeryStep.navigate_to_practo_surgeries_page()

    Embedding Display Surgeries provided by Practo [image/png 378323 bytes]

12:53:48.751 [main] INFO  factory.BaseClass - ********Starting SurgeryStep********
12:53:57.880 [main] INFO  factory.BaseClass - ********Surgeries under nav header is clicked********
12:53:57.881 [main] INFO  factory.BaseClass - ********Navigated to Surgeries page********
12:54:02.949 [main] INFO  factory.BaseClass - ********Popular surgeries in surgeries page has been scrolled********
  When the user scroll down to popular surgery # stepDefinitions.surgeryStep.the_user_scroll_down_to_popular_surgery()

    Embedding Display Surgeries provided by Practo [image/png 233685 bytes]

Piles
Hernia Treatment
Kidney Stone
Cataract
Circumcision
Lasik
Varicose Veins
Gallstone
Anal Fistula
Gynaecomastia
Anal Fissure
Lipoma Removal
Sebaceous cyst
Pilonidal Sinus
Lump in Breast
TURP
Hydrocele
Knee Replacement
Hair Transplant

12:54:16.498 [main] INFO  factory.BaseClass - ********All the popular surgeries has been listed********
12:54:16.501 [main] INFO  factory.BaseClass - ********Ending surgeryStep********
  Then display the popular surgeries provided  # stepDefinitions.surgeryStep.display_the_popular_surgeries_provided()

    Embedding Display Surgeries provided by Practo [image/png 233750 bytes]


@sanity @regression
Scenario: Fill the schedule a demo form                                 # Features/scheduleDemo.feature:5
  Given Navigate to Health & Wellness Plans Page                        # stepDefinitions.healthStep.navigate_to_health_wellness_plans_page()

    Embedding Fill the schedule a demo form [image/png 378323 bytes]

12:55:49.205 [main] INFO  factory.BaseClass - ********Starting healthStep********
12:56:30.502 [main] INFO  factory.BaseClass - ********Health & Wellness under FOR CORPORATES header has been clicked********
12:56:30.522 [main] INFO  factory.BaseClass - ********Navigated to Health and Wellness Plan page********
  When the user click on health and wellness plans under for corporates # stepDefinitions.healthStep.the_user_click_on_health_and_wellness_plans_under_for_corporates()

    Embedding Fill the schedule a demo form [image/png 306744 bytes]

12:56:31.203 [main] INFO  factory.BaseClass - ********Negative testing by providing invalid email has been started********
  And the user fill the form by reading input from excel                # stepDefinitions.healthStep.the_user_fill_the_form_by_reading_input_from_excel()

    Embedding Fill the schedule a demo form [image/png 306381 bytes]

  And scrolls the page and passes the invalid email                     # stepDefinitions.healthStep.scrolls_the_page_and_passes_the_invalid_email()

    Embedding Fill the schedule a demo form [image/png 458200 bytes]


Take a demo button is disabled because email id is invalid

12:56:34.843 [main] INFO  factory.BaseClass - ********Negative testing has been done********
  Then user validates whether the button is disabled                    # stepDefinitions.healthStep.user_validates_whether_the_button_is_disabled()

    Embedding Fill the schedule a demo form [image/png 458200 bytes]

12:57:21.779 [main] INFO  factory.BaseClass - ********Health page has been refreshed to refresh the form********
12:57:21.781 [main] INFO  factory.BaseClass - ********Positive testing by providing valid email has been started********
  When the user refresh the health and wellness page                    # stepDefinitions.healthStep.the_user_refresh_the_health_and_wellness_page()

    Embedding Fill the schedule a demo form [image/png 308015 bytes]

  And scrolls the page and passes the valid email                       # stepDefinitions.healthStep.scrolls_the_page_and_passes_the_valid_email()

    Embedding Fill the schedule a demo form [image/png 460302 bytes]

12:57:46.961 [main] INFO  factory.BaseClass - ********Positive testing has been done********
  Then user validates whether the button is enabled                     # stepDefinitions.healthStep.user_validates_whether_the_button_is_enabled()

    Embedding Fill the schedule a demo form [image/png 149063 bytes]


THANK YOU
Your demo request has been received. Our team will contact you shortly to follow-up.

12:57:47.642 [main] INFO  factory.BaseClass - ********Message After successful form submission has been captured********
12:57:47.642 [main] INFO  factory.BaseClass - ********Ending healthStep********
  And capture the message displayed after successful form submission    # stepDefinitions.healthStep.capture_the_message_displayed_after_successful_form_submission()

    Embedding Fill the schedule a demo form [image/png 149063 bytes]

┌──────────────────────────────────────────────────────────────────────────┐
│ View your Cucumber Report at:                                            │
│ https://reports.cucumber.io/reports/a0530fce-c7a5-45d7-9120-89935f1a2181 │
│                                                                          │
│ This report will self-destruct in 24h.                                   │
│ Keep reports forever: https://reports.cucumber.io/profile                │
└──────────────────────────────────────────────────────────────────────────┘

 
                                  ----------------------------
                                  |                          |
                                  |      IMPORTANT NOTE      |
                                  |                          |
                                  ----------------------------

    -> For multiple browsers (chrome and Edge), The browser name is read from 'Config.properties' file
    -> If you want to use chrome brower, please go to 'Config.properties' file and set browser name as 'chrome'.
    -> If you want to use edge brower, please go to 'Config.properties' file and set browser name as 'edge'.
    -> Then execute the Test.
