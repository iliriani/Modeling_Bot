package boraproj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import RefClasses.Controls;
import boraproj.controller.AttributeGet;
import boraproj.controller.ConnectionController;
import boraproj.controller.NGram;
import boraproj.controller.RLController;
import boraproj.evaluation.EvaluationForKfoldValidation;
import boraproj.evaluation.Evaluation_2;
import boraproj.evaluation.NLEvaluation;
import boraproj.evaluation.PrintEvaluationResults;
import boraproj.services.AddWeights;
import boraproj.services.AttributeService;
import boraproj.services.BotService;
import boraproj.services.ConnectionService;
import boraproj.services.FormConnection;
import boraproj.services.NLPService;
import boraproj.services.RankResults;
import boraproj.services.RepoConnect;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class BoraMain {

	public static void main(String[] args) {

		SpringApplication.run(BoraMain.class, args);

		System.out.println("BORA is running successfully!");
		

		BotService botService = new BotService(); botService.getMatchingModels("Can I have a RetailBarcodeMaskTable class?");

	
	  // Method for calculating the average of an ArrayList, required for the mAP calculation
	  
	  public static double calculateAverage(ArrayList<Double> my_list) { 
		  return my_list.stream().mapToDouble(d -> d).average().orElse(0.0); }
	 


}
