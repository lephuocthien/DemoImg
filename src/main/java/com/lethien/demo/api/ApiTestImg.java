package com.lethien.demo.api;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lethien.demo.TestImgDto;
import com.lethien.demo.entity.TestImg;
import com.lethien.demo.service.TestImgService;

@RestController
@RequestMapping("api/test")
public class ApiTestImg {
	
	private TestImgService testImgService;

	public ApiTestImg(TestImgService testImgService) {
		super();
		this.testImgService = testImgService;
	}
	
	@GetMapping("get-all")
	public ResponseEntity<Object> getAll() {
		try {
			System.out.println("Vao get");
			List<TestImgDto> testImgs = testImgService.getAll();
			System.out.println("Vao get");
			return new ResponseEntity<Object>(testImgs, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}

}
