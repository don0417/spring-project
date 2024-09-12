package com.project.team3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReservationController {

	@RequestMapping("/rsv.do")
	public String reservation() {
		return "rsv/reservation";
	}
}
