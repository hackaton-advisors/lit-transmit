package com.capgroup.digital.literature;

import org.springframework.boot.SpringApplication;

public class Main {
	  public static void main(String [] args) {
	    System.exit(SpringApplication.exit(SpringApplication.run(
	    		com.capgroup.digital.literature.BatchConfiguration.class, args)));
	  }
	}