package kr.co.strato.demo.controller;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;


@RestController
@Slf4j
public class MainController {
	@Value("${spring.application.name}")
	private String appNm;
	
	@RequestMapping("/")
	public String main(HttpServletRequest req, HttpServletResponse res, Model model) {
		log.info("▶▶ "+req.getRequestURL() + " ◀◀  " + req.getRemoteAddr());
		return "Hello World!   -   "+ appNm;
	}
	
	
	@RequestMapping("/test")
	public String test(HttpServletRequest req, HttpServletResponse res) {
		log.info("▶▶ "+req.getRequestURL() + " ◀◀  " + req.getRemoteAddr());
		return "test   :   "+appNm;
	}
}
