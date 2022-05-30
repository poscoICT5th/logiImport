package Pack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Pack.vo.TestVo;
import Pack.service.ImportService;
import Pack.service.TestService;
import Pack.vo.LogiImportVo;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/")
public class MainController {
	@Autowired
	TestService testService;
	@Autowired
	ImportService importService;
	
	@GetMapping("/test")
	public List test() {
	    List<TestVo> testList = testService.selectTest();
	    System.out.println(testList);
	

	    return testList;
	}
	
	@GetMapping("/import")
	public List importAll() {
		System.out.println("import all");
	    List<LogiImportVo> importAll = importService.selectAll();
	    System.out.println(importAll);

	    return importAll;
	}
}
