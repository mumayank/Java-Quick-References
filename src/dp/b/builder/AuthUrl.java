package dp.b.builder;

public class AuthUrl {
	
	/**
	 * mandatory fields
	 */
	private String url;
	private int attempts;
	/**
	 * optional fields
	 */
	private String userName;
	private boolean isAuthSuccessful;
	
	private AuthUrl(Builder builder) {
		this.url = builder.url;
		this.attempts = builder.attempts;
		this.userName = builder.userName;
		this.isAuthSuccessful = builder.isAuthSuccessful;
	}
	
	@Override
	public String toString() {
		return "AuthUrl [url=" + url + ", attempts=" + attempts + ", userName=" + userName + ", isAuthSuccessful="
				+ isAuthSuccessful + "]";
	}

	public static class Builder {
		
		private String url;
		private int attempts;
		private String userName;
		private boolean isAuthSuccessful;
		
		public Builder(String url, int attempts) {
			this.url = url;
			this.attempts = attempts;
		}

		public Builder userName(String userName) {
			this.userName = userName;
			return this;
		}
		
		public Builder isAuthSuccessful(boolean isAuthSuccessful) {
			this.isAuthSuccessful = isAuthSuccessful;
			return this;
		}
		
		public AuthUrl build() {
			return new AuthUrl(this);
		}
		
	}
}
