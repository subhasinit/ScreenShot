package com.repot;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reprting {
	public static void generateJvmReport(String jsonFile) {
		// mention the path of the report where to store JVM report
		File file = new File("C:\\Users\\Subha\\eclipse-workspace\\Cucumber\\target");
		// create object for the configuration class
		Configuration configuration = new Configuration(file, "OMR Branch Automation");
		// pass the browser,version name, os
		configuration.addClassifications("Browser", "chrome");
		configuration.addClassifications("Browser version", "124");
		configuration.addClassifications("os", "WIN 11");
		configuration.addClassifications("Sprint", "4WIN 11");
		// CREATE OBJECT FOR REPORTBUILDERCLASS--->jsonFile,configuration);
		List<String> jsonFiles = new ArrayList();
		jsonFiles.add(jsonFile);

		ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);
		// generate report
		builder.generateReports();
	}
}
