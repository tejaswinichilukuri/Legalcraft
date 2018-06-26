package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class example {
	public example() {
		System.out.println("constructor");
	}
	public void add() {
		System.out.println("add method");
	}
}
