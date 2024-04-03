package assesment;

public class StringTrim {

	public static void main(String[] args) {
		String s=" ";
        System.out.println("Check is empty or not ===>"+s.isEmpty());
        String s1=" ";
        System.out.println("Check is blank or not ===>"+s.isBlank());
        String s2="      hello     ";
        System.out.println("Length:" +s2.length());
        String s3=s2.trim();
        System.out.println("Length of s3 :" +s3.length());
	}

}
