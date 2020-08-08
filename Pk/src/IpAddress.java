import java.util.*;

public class IpAddress {
	class A{
		public List<String> count(String s, int dots){
			List<String> ips = (List<String>) new ArrayList();

		    for(int i =1 ;i<=3 && i < s.length(); i++){

		        String cip = s.substring(0,i);

		        if(Integer.parseInt(cip) < 256){
		            if(dots == 1){
		                if( Integer.parseInt(s.substring(i)) < 256) {
		                    ips.add(cip + "." + s.substring(i));
		                }
		            }else {
		                for (String ip : count(s.substring(i), dots - 1)) {
		                    ips.add(cip + "." + ip);
		                }
		            }
		        }
		    }

		    return ips;		
		}
	}
	class B{
			
		}
	class C{
		
	}
	class D{
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	}

}
