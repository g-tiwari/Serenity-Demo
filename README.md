# Serenity-Demo
This project is all about a demonstration of a BDD project using JBehave and Selenium. This project has an updated version of Thucydides (Serenity)

#How to do set up 

For doing set up follow following steps
	 	
1. Clone this project in to your local folder using below command (this will work only if you have Git installed on your machine)

	 git clone https://github.com/g-tiwari/Serenity-Demo.git
	 
2. Now you can see a folder names Serenity-Demo in your local system

	 Note: Assuming you have installed maven on your machine
3. Now open the project in command line and hit following command

	 mvn eclipse:eclipse
4. Above command will download all related dependencies and configure your project in such a way that it can be imported using Eclipse
5. Now on the same command line, hit following command for executing the test

	 mvn verify
	 
6. This command will compile the code and start the test execution

Now you are good to go 

# Few additional features of Serenity:
	 
1. Sometimes during your releases, you find that certain functionality is not a good condidate for automation and its better to do a manual run of that test case,
but you would still like to see in the overall test reports. then use a @manual tag in Meta: section of scenario
	 
	 Scenario: Display social media links for a product
	 Meta:
	 @manual
	
2. Now in your report just hovering on the screenhsot will show you the image as overlay, which helps in quick test analysis
	 
3. Added the deep.step.execution.after.failures system property. 
This allows you to decide whether @Step methods should simply be skipped after a previous step has failed (the default: this is faster, but it means that only top-level steps will be reported), or if the subsequent steps will be executed in “dry-run” mode (will report on nested steps as well as the top level ones)
	 
4. Improved error and exception reporting for RestAssured(REST Api) tests.
	 
5. Many other smaller bug fixes and performance improvements
	 
6. New commands are added for implicit and explicitg waits.
	 
7. Latest Serenity has the libraries for latest version of Selenium
