
package by.itacademy.java.jd1.apetrov.samples.anonymous;

public class Test {

	public static void main(String[] args) {

		Object object = new Object();
		System.out.println(object);
		AbstractButton startButton = new AbstractButton("start torrent") {

			@Override
			public void onClick() {
				System.out.println("Torrent started");
			}

			@Override
			public String toString() {
				return "this is start button";
			}

		};

		AbstractButton stopButton = new AbstractButton("stop torrent") {

			@Override
			public void onClick() {
				System.out.println("Torrent stopped");
			}
		};

		startButton.onClick();
		stopButton.onClick();
	}

}