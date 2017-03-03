package com.onepercent.server.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.android.gcm.server.Message;
import com.google.android.gcm.server.MulticastResult;
import com.google.android.gcm.server.Sender;

@Controller
public class PushController {
	@RequestMapping(value = "push.do", method = RequestMethod.GET)
	public void sendPush(String msg) {
		PushMessage("etnFS2aWZU0:APA91bF0ha1aguAH4mvhLI7XcLaAPZgHWVTUBOSsZtvUCzRGbik63OSooYMWBHqhmvMA1u-Z3dHDK1SjDpSMnlNyZZYSfABeZAj13k2ov7qwv4o_Js86SdKJc87JZEQiqQqP_qcva5OY", "hello");
	}
	public void PushMessage(String deviceToken, String sendMsg) { // 디바이스 토큰, 보낼
																	// 메세지
		Sender sender = new Sender("AIzaSyCxE2vBXE_-3aWxKO62K9-caos_6iauXTk"); // 서버
																				// API
																				// Key
																				// 입력
		String regId = deviceToken;
		try {
			sendMsg = URLEncoder.encode(sendMsg, "euc-kr");
		
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Message message = new Message.Builder().addData("message", sendMsg).build();
		List<String> list = new ArrayList<String>();
		list.add(regId);
		MulticastResult multiResult;
		try {
			multiResult = sender.send(message, list, 5);
			if (multiResult != null) {
				List<com.google.android.gcm.server.Result> resultList = multiResult.getResults();
				for (com.google.android.gcm.server.Result result : resultList) {
					System.out.println(result.getMessageId());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
