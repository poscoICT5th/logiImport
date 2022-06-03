package Pack.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

import Pack.vo.TestVo;
import Pack.service.ImportService;
import Pack.service.TestService;
import Pack.vo.LogiImportDTO;
import Pack.vo.LogiImportSearchDTO;
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
	
	@GetMapping("/search")
	public List importSearch(LogiImportSearchDTO logiImportSearchDTO) {
		System.out.println("import search");
		System.out.println(logiImportSearchDTO);
//		Object json = (Object) myHeader.get("conditions");
//		System.out.println(json);
	    List<LogiImportVo> importSearch = importService.selectSome(logiImportSearchDTO);
		return importSearch;
	}
	
	@PostMapping("/import")
	public boolean importAdd(@RequestBody LogiImportDTO data) {
//	public boolean importAdd(@RequestBody LogiImportVo data) {
		System.out.println("post 들어감");
		System.out.println(data); 
		int result = importService.insert(data);
		return result==1?true:false;
	}
	
	@DeleteMapping("import/{instructionNo}")
	public boolean importDelete(@PathVariable String instructionNo) {
		System.out.println(instructionNo);
		int result = importService.delete(instructionNo);
		return result==1?true:false;
	}
	
	@PutMapping("import/{instructionNo}")
	public boolean importConfirm(@PathVariable String instructionNo) {
		System.out.println(instructionNo);
		int result = importService.confirm(instructionNo);
		return result==1?true:false;
	}
}
