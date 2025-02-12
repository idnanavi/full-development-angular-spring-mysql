package com.example.test.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.test.entity.ImageModel;
import com.example.test.repository.ImageRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path="check")
public class TestController {
@Autowired
ImageRepository imageRepository;
	@PostMapping("/upload")
	public ImageModel uploadImage(@RequestParam("myFile") MultipartFile file) throws IOException{
		ImageModel img = new ImageModel(file.getOriginalFilename(),file.getContentType(),file.getBytes());
		final ImageModel savedImage = imageRepository.save(img);
		return savedImage;
	}
}
