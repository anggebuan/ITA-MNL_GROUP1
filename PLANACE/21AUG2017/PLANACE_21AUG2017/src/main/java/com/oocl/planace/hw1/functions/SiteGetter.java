package com.oocl.planace.hw1.functions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class SiteGetter {
	public static String getSite(String site) {
		// String site = "https://www.microsoft.com";
		String text = "";
		try {
			Document siteInfo = Jsoup.connect(site).get();
			text = siteInfo.body().text();
			return text;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return "cant Locate site please input valid site";
		}
	}
}
