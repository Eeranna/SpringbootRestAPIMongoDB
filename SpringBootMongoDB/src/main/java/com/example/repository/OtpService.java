package com.example.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

import org.springframework.stereotype.Service;

import com.example.model.SoftwareEngineer;


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
	
	public List<String> getPassword(){
		// 1. Length should be 8 characters
		// 2. 2,4,6,8 places should be digits
		// 3. 1,3,5,7 places should be upper case and special characters
		Supplier<String> s = () -> {
			Supplier<Integer> d  = ()->(int)(Math.random()*10);
			String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ#@$";
			Supplier<Character> c = ()->symbols.charAt((int)(Math.random()*29));
			String pwd = "";
			for(int i=1;i<9;i++) {
				if(i%2==0) {
					pwd = pwd+d.get();
				}else {
					pwd = pwd+c.get();
				}
			}
			list = new ArrayList<String>();
			list.add(pwd);
			return pwd;
		};
		System.out.println(s.get());
		return list;
	}
	
	public List<SoftwareEngineer> allowedSoftwareEngineers(){
		List<SoftwareEngineer> allowedSoftware = new ArrayList<SoftwareEngineer>();
		List<SoftwareEngineer> list = new ArrayList<>(Arrays.asList(
				new SoftwareEngineer("Eeranna",32,true),
				new SoftwareEngineer("Raja",31,true),
				new SoftwareEngineer("Tejas",23,false),
				new SoftwareEngineer("Anil",39,false),
				new SoftwareEngineer("Sanjoy",40,true),
				new SoftwareEngineer("Arush",27,true),
				new SoftwareEngineer("Bharath",26,true),
				new SoftwareEngineer("Parma",27,true),
				new SoftwareEngineer("Veeru",10,true),
				new SoftwareEngineer("Rakesh",30,true)
				));
		Predicate<SoftwareEngineer> allowed = se -> se.age>=18&&se.isHavingGF == true;
		System.out.println("The allowed members into the pub are:");
		for(SoftwareEngineer s: list) {
			if(allowed.test(s)) {
				System.out.println(s);
				allowedSoftware.add(s);
			}
		}
		return allowedSoftware;
	}


}
