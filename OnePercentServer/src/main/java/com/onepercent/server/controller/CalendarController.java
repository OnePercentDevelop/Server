package com.onepercent.server.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CalendarController {
	@RequestMapping(value = "calendar.do", method = RequestMethod.GET)
	public String calendarView(Locale locale, Model model) throws Exception {
		return "calendar";
	}
	@RequestMapping(value = "test.do", method = RequestMethod.GET)
	public String testtes(Locale locale, Model model) throws Exception {
		return "test";
	}
}
