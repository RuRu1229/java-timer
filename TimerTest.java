package �Ƶ{;

import java.io.File;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import org.apache.commons.io.FileUtils;

import �Ƶ{.DownloadURLFile;

public class TimerTest extends TimerTask {
	
	
  public void run() {
   // System.out.println("Generating report");
	  DownloadURLFile DR=new DownloadURLFile();
	  long delay = 3000L; // ����}�l���檺�ɶ��]�@��^�A����3��
      long period = 1000L; // ���ƪ��ɶ��]�@��^�A���j1��
      
	  Timer simpleTimer = new Timer();
      simpleTimer.schedule(new DownloadURLFile(), delay); // �u�|����@��
	  //TODO generate report
  }

}

class DownloadURLFile {
	
	

	
	 /** 
    * @param args 
    */  
   public static void main(String[] args) {  
 
   	  
   	long delay = 3000L; // ����}�l���檺�ɶ��]�@��^�A����3��
       long period = 1000L; // ���ƪ��ɶ��]�@��^�A���j1��

      
       String res = downloadFromUrl("https://www.good.nat.gov.tw/regcenter/csv/2022-05-09-new-addressbook.csv","D:");  
       System.out.println(res);  
       
   	
   }  
 
 
   public static String downloadFromUrl(String url,String dir) {  
 
       try {  
           URL httpurl = new URL(url);  
           String fileName = getFileNameFromUrl(url);  
           System.out.println(fileName);  
           File f = new File(dir + fileName);  
           FileUtils.copyURLToFile(httpurl, f);  
       } catch (Exception e) {  
           e.printStackTrace();  
           return "Fault!";  
       }   
       return "Successful!";  
   }  
     
   public static String getFileNameFromUrl(String url){  
       String name = new Long(System.currentTimeMillis()).toString() + ".X";  
       int index = url.lastIndexOf("/");  
       if(index > 0){  
           name = url.substring(index + 1);  
           if(name.trim().length()>0){  
               return name;  
           }  
       }  
       return name;  
   }  
   
   

   }
   



