package com.lethien.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.lethien.demo.TestImgDto;
import com.lethien.demo.entity.TestImg;
import com.lethien.demo.repository.TestImgRepository;
import com.lethien.demo.service.TestImgService;

@Service
public class TestImgServiceImpl implements TestImgService{
	
	private TestImgRepository testImgRepository;
	

	public TestImgServiceImpl(TestImgRepository testImgRepository) {
		super();
		this.testImgRepository = testImgRepository;
	}

	@Override
	public List<TestImgDto> getAll() {
		// TODO Auto-generated method stub
		List<TestImg> testImgs = testImgRepository.findAll();
		List<TestImgDto> dtos = new ArrayList<TestImgDto>();
		
		for(TestImg testImg : testImgs) {
			TestImgDto dto = new TestImgDto(testImg.getId(), testImg.getImg());
			dtos.add(dto);
		}
		
		return dtos;
	}

}
