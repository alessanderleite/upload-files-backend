package com.example.app;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.app.service.FilesStorageService;

@SpringBootApplication
public class UploadFilesBackendApplication implements CommandLineRunner {

	@Resource
	FilesStorageService storageService;
	
	public static void main(String[] args) {
		SpringApplication.run(UploadFilesBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		storageService.deleteAll();
		storageService.init();
	}

}
