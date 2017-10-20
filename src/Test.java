import java.lang.reflect.Method;


public class Test {
	
	public static int getInt(){
		try {
			return 1;
		} catch (Exception e) {
			
		}finally{
			
		}
		return 2;
	}

	public static void main(String[] args) throws Exception {
		System.out.println("");
		//test		
		String str = "{'name':null}";
		System.out.println(str);
		System.out.println(str);
		//System.out.println(str);
	}

}
