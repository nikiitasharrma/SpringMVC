package com.spring.mvc.controllers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileController {

	@RequestMapping("/uploadfile")
	public String showView() {
		return "uploadFile";
	}

	@RequestMapping(path = "/processupload", method = RequestMethod.POST)
	public String handleUpload(@RequestParam("img") MultipartFile file, HttpSession session, Model m) {
		System.out.println(file.getSize());
		System.out.println(file.getName());
		System.out.println(file.getContentType());
		System.out.println(file.getOriginalFilename());

		String msg = "";

		try {
			
			byte[] data = file.getBytes();
			String path = session.getServletContext().getRealPath("/") + "WEB-INF" + File.separator + "resources"
					+ File.separator + "image" + File.separator + file.getOriginalFilename();
			System.out.println(path);

			FileOutputStream fos = new FileOutputStream(path);
			fos.write(data);
			fos.close();
			msg = "File uploaded successfully!";
			
		} catch (IOException e) {
			msg = "Error occured while uploading file!";
			e.printStackTrace();
		}
		
		m.addAttribute("msg", msg);
		return "success";
	}
}
