package com.qc.ssm.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@Controller
public class Test {

	@RequestMapping("/reviceInfo")
	public void reviceInfo(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException {

		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");

		//获取HTTP请求的输入流
		InputStream is = request.getInputStream();

		//已HTTP请求输入流建立一个BufferedReader对象
		BufferedReader br = new BufferedReader(new InputStreamReader(is,"UTF-8"));

		StringBuilder sb = new StringBuilder();

		//读取HTTP请求内容
		String buffer = null;
		while((buffer=br.readLine())!=null){
			sb.append(buffer);
		}

		String content = sb.toString().substring(sb.toString().indexOf("<?xml"),sb.toString().indexOf("</plist>")+8);
		//content就是接收到的xml字符串
		//进行xml解析即可
		System.out.println(content);
		String udid = "";
		response.setStatus(301);//301之后iOS设备会自动打开safari浏览器
		response.setHeader("Location","http://192.168.76.10:8080/jsp/test.html?UDID="+udid);
	}

	@RequestMapping("/downloadLocal")
	public void downloadLocal(HttpServletResponse response) throws FileNotFoundException {
		// 下载本地文件
		String fileName = "yzwk.mobileconifg".toString(); // 文件的默认保存名
		// 读到流中
		InputStream inStream = new FileInputStream("D:\\IdeaProjects\\advertisement\\web\\download\\yzwk.mobileconifg");// 文件的存放路径
		// 设置输出的格式
		response.reset();
		response.setContentType("application/x-apple-aspen-config");
		response.addHeader("Content-Disposition", "attachment; filename=\"" + fileName + "\"");
		// 循环取出流中的数据
		byte[] b = new byte[100];
		int len;
		try {
			while ((len = inStream.read(b)) > 0)
				response.getOutputStream().write(b, 0, len);
			inStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
