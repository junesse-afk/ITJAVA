package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test3 {
	public static void main(String[] args) {
		
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("start Thread");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("end Thread");
			}
		});
//		thread.start();
		
		Thread thread2 = new Thread(() -> {
			System.out.println("start Thread2");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("end Thread2");
		});
//		thread2.start();
		
		List<String> list = new ArrayList<String>();
		list.add("요소1");
		list.add("요소2");
		list.add("요소3");
		
		list.forEach(x -> System.out.println(x));
		
		Stream<String> stream = list.stream();
		stream.forEach(x -> System.out.println(x));
		list.stream().sorted().forEach(x -> System.out.println(x));
		list.stream()
			.filter(x -> x.equals("요소2"))
			.forEach(x -> System.out.println(x));
		
		int arr[] = {1, 2, 3, 4, 5};
		Arrays.stream(arr).forEach(n -> System.out.println(n));
		
		int sum = Arrays.stream(arr).sum();
		int count = (int)Arrays.stream(arr).count();
		System.out.println("배열합 : " + sum);
		System.out.println("배열개수 : " + count);
		
		
		
	}
}
