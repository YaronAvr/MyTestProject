package exercises;

public class UncaughtException {

	public UncaughtException() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread.UncaughtExceptionHandler handler = new Thread.UncaughtExceptionHandler() {
			@Override
			public void uncaughtException(Thread arg0, Throwable arg1) {
				// TODO Auto-generated method stub
				System.out.println(arg0.getName() + ": uncaughtException");
			}
		};

		Thread thread1 = new Thread() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Thread Name: " + this.getName());
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Throw Exception");
				throw new RuntimeException();

			}
		};

		thread1.setUncaughtExceptionHandler(handler);
		Thread thread2 = new Thread() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Thread Name: " + this.getName());
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Throw Exception");
				throw new RuntimeException();

			}
		};
		thread2.setUncaughtExceptionHandler(handler);

		thread2.start();
		thread1.start();

	}

}
