package com.example.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import org.springframework.stereotype.Service;

@Service
public class OtpService {
	List<String> list;
	public List<String> getOtp(){
		Supplier<String> s = () -> {
			String otp = "";
			for(int i=0;i<6;i++) {
				otp = otp+(int)(Math.random()*10);
			}
			list = new ArrayList<String>();
			list.add(otp);
			return otp;
		};
		System.out.println(s.get());
		return list;
	}

}
