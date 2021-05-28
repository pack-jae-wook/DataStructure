public class BucketSort {
	public static void sort(int[] a, int R) {
		int [] bucket = new int[R];
		for (int i=0; i<R; i++)  bucket[i]=0;  // �ʱ�ȭ
		for (int i=0; i< a.length; i++)  bucket[a[i]]++; // 1�ܰ�:�󵵼� ���
		// 2�ܰ�: ���������� ��Ŷ�� �ε����� �迭 a�� ����
		int j=0;  // j�� ���� ����� �迭 a ������ �ε��� 
		for (int i=0; i<R; i++)   
			while((bucket[i]--)!=0)  //  ��Ŷ  i�� ����� �󵵼��� 0�� �� ������
				a[j++] = i;  // ��Ŷ �ε��� i�� ����
	}
	public static void main(String[] args) {
		int [] a = {2, 0, 5, 0, 3, 2,5, 2, 3, 1, 0, 2};
		sort(a, 10);
		System.out.print("���� ���: ");
		for (int i = 0; i < a.length; i++) {
			System.out.printf(a[i]+"  ");
		}
	}
}
