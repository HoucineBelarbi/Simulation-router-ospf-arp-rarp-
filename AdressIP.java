
package routour;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.*;
import java.util.Random;

// Java program to validate an IPv4 address
class AdressIP
{
    public String ipAdress;
	//an IPv4 address
	private static final String INET4ADDRESS = "172.8.9.1";

	private static final String IPV4_REGEX =
					"^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
					"(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
					"(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
					"(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

	private static final Pattern IPV4_PATTERN = Pattern.compile(IPV4_REGEX);

	
	
	
	public static boolean isValidInet4Address(String ip) {
		if (ip == null) {
			return false;
		}

		Matcher matcher = IPV4_PATTERN.matcher(ip);

		return matcher.matches();
	}



public  String randomMACAddress(){
    Random rand = new Random();
    byte[] macAddr = new byte[6];
    rand.nextBytes(macAddr);

    macAddr[0] = (byte)(macAddr[0] & (byte)254);  //zeroing last 2 bytes to make it unicast and locally adminstrated

    StringBuilder sb = new StringBuilder(18);
    for(byte b : macAddr){

        if(sb.length() > 0)
            sb.append(":");

        sb.append(String.format("%02x", b));
    }


    return sb.toString();
}


	/*public static void main(String[] args)
	{

		
		// Validate an IPv4 address
		if (isValidInet4Address("")) {
			System.out.println("The IP address " + INET4ADDRESS + " is valid\n");
		}
		else {
			System.out.println("The IP address " + INET4ADDRESS + " isn't valid");
		}
	}*/
}
