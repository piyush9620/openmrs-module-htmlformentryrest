package org.openmrs.module.htmlformentryrest.web.controller;

import javafx.scene.chart.PieChart;
import org.openmrs.module.webservices.rest.web.v1_0.controller.MainResourceController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.openmrs.module.htmlformentryrest.web.resources.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class RestTestController extends MainResourceController {
	
	private List<String> dataList = new ArrayList<String>(Arrays.asList("Spring", "Rest", "SRC"));
	
	@RequestMapping("/getData")
	public Data getData(@RequestParam(value = "id", defaultValue = "0") Integer id) {
		return new Data(id, dataList.get(id));
	}
}
