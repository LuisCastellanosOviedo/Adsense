package com.coreKL.coreJsoup;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class JSoupPOC {
	
	public static void main(String[] args) {
		
		try {
			Document doc = Jsoup.connect("http://www.bing.com/search?q=dell").get();
			doc.data();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
