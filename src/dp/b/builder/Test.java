package dp.b.builder;

public class Test {

	public static void main(String[] args) {
		AuthUrl authUrl = new AuthUrl.Builder("url", 100)
				.userName("user")
				.isAuthSuccessful(false)
				.build();
		
		System.out.println(authUrl);
	}

}
