package exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ReadFromHTMLByPoolThreadApp {

	public final static List<String> urls = new ArrayList<String>();
	public final static ExecutorService executor = Executors
			.newCachedThreadPool();
	public static Object[] resultArr;

	public ReadFromHTMLByPoolThreadApp() {
		//Path path = Paths.get("");
		//String p = path.toAbsolutePath().toString();
		
		urls.add("http://www.sport5.co.il/");
		urls.add("https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/ExecutorService.html");
		urls.add("https://docs.oracle.com/javase/tutorial/networking/urls/readingURL.html");
		urls.add("http://www.israelhayom.co.il/");
		resultArr = new Object[urls.size()];
	}

	public static void main(String[] args) {

		ReadFromHTMLByPoolThreadApp app = new ReadFromHTMLByPoolThreadApp();

		for (int i = 0; i < urls.size(); i++) {
			executor.submit(new ReadHtmlThread(i, urls.get(i), resultArr));
		}

		executor.shutdown();

		try {
			executor.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int i = 0; i < resultArr.length; i++) {
			System.out.println(String.valueOf(resultArr[i]).substring(1,200));
		}

	}

}

class ReadHtmlThread implements Runnable {

	int id;
	String url;
	Object[] resultArr;

	public ReadHtmlThread(int id, String url, Object[] resultArr) {

		this.id = id;
		this.url = url;
		this.resultArr = resultArr;
	}

	@Override
	public void run() {

		try {
			long start =  Calendar.getInstance().getTimeInMillis();
			System.out.println(Thread.currentThread().getName() + " start.");
			Object result = readHTML();
			this.resultArr[this.id] = result;
			long end =  Calendar.getInstance().getTimeInMillis();
			
			System.out.println(Thread.currentThread().getName() + " diff: " + (end - start) + " end.");
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	private Object readHTML() {
		// TODO Auto-generated method stub
		StringBuilder contentBuilder = new StringBuilder();

		try {
			URL url = new URL(this.url);
			BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

			String str;

			while ((str = in.readLine()) != null) {
				contentBuilder.append(str);
			}
			in.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return contentBuilder.toString();
	}

}