package in.com.halding_Exception;

public class TestLoginException {
public static void main(String[] args) {
	String name = "dipu";
	if (name.equals("dipu")) {
		System.out.println("valide user");
	}
	else {
		LoginException e = new LoginException();
		try {
			throw e;
		} catch (Exception e2) {
			System.out.println(e);
		}
	}
}
}
