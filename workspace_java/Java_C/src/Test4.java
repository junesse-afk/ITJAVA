
public class Test4 {

	public static void printArray (int[] arr) {
		// 배열의 모든 요소를 우측으로 출력
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
		System.out.println();
	}
	
	public static void rotation (int[] arr) {
		// 배열안에 데이터를 옮기는 작업 (한바퀴 돌리기)
		int temp = arr[0];
		for (int j = 0; j < arr.length - 1; j++) {
			arr[j] = arr[j+1];
		}
	 	arr[arr.length - 1] = temp;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		
		for (int i = 0; i < arr.length; i++) {
			printArray(arr);
			rotation(arr);
		}
		
	}

}
