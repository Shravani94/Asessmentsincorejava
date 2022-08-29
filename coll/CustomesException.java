package coll;

	public class CustomesException extends Exception {
		String message;

		public CustomesException(String message) {
			super(message);
			this.message = message;
			System.out.println(message);
		}
		public String toString() {
			return message;
			
		}

	}


