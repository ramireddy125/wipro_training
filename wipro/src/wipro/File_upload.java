package wipro;

public class File_upload {
	String fileName;
	double filesize;
	
	void uploadfile(String name, double size) 
	{
		 fileName = name;
		 filesize = size;
	     System.out.println("File uploaded: " + fileName + filesize);
	}
	
	 void downloadFile() 
	 {
	     System.out.println("Downloading file: " + fileName + filesize);
	 }

	public static void main(String[] args) {
		 
		File_upload f = new File_upload();
		f.uploadfile("venkat.pdf", 2);
		f.downloadFile();
		 

	}

}
