package com.read.apk;

public class ReadApk {

	/**
	 * 
	 * @param args
	 * @return void
	 * @author hsx
	 * @time 2013-4-24下午03:20:24
	 */
	public static void main(String[] args) {
		String path = "./src//com//read//apk//tianyiyonghuzhongxin_Vver-3.0.6.1_mumayi_686da.apk";
		String[] messag = AnalysisApk.unZip(path, "E://11.png");
		System.out.println("package："+messag[0]+"  " + "versionName：" + messag[1]+"  "+"versionCode："+messag[2]);
	}

}
