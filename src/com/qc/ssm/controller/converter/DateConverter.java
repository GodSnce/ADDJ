package com.qc.ssm.controller.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter implements Converter<String, Date> {

	@Override
	public Date convert(String source) {

		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			return sdf.parse(source);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Date();
	}

}
