package com.MyApp.Contoller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class GetImage {
	
	@GetMapping(value = "getImage" , produces = MediaType.IMAGE_JPEG_VALUE)
	public ByteArrayResource GetImageWithStream() throws IOException {
		
		String path = "D:\\Image\\yolo_loss.png";
		File file = new File(path);
		Path p = file.toPath();
		
		InputStream in = getClass().getResourceAsStream(path);
		byte [] bt = Files.readAllBytes(p);
		ByteArrayResource byetArray = new ByteArrayResource(bt);
		
		return byetArray;
		 
	}

}
