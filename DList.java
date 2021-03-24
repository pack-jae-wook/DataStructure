package Node;

import java.util.NoSuchElementException;

public class DList<E> {
	protected DNode head, tail;
	protected int size;

	public DList() { // ������
		head = new DNode(null, null, null);
		tail = new DNode(null, head, null); // tail�� ���� ��带 head�� �����.
		head.setNext(tail); // head�� ���� ��带 tail�� �����.
		size = 0;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void insertBefore(DNode p, E newItem) { // p�� ����Ű�� ��� �տ� ����
		DNode t = p.getPrevious();
		DNode newNode = new DNode(newItem, t, p);
		p.setPrevious(newNode);
		t.setNext(newNode);
		size++;
	}

	public void insertAfter(DNode p, E newItem) { // p�� ����Ű�� ��� �ڿ� ����
		DNode t = p.getNext();
		DNode newNode = new DNode(newItem, p, t);
		t.setPrevious(newNode);
		p.setNext(newNode);
		size++;
	}

	public void delete(DNode x) { // x�� ����Ű�� ��� ����
		if (x == null)
			throw new NoSuchElementException();
		DNode f = x.getPrevious();
		DNode r = x.getNext();
		f.setNext(r);
		r.setPrevious(f);
		x.setPrevious(null); // x�� previous�� null�� �����.
		x.setNext(null); // x�� next�� null�� �����.
		size--;
	}

	public void print() { // ���� ����Ʈ ������ item���� ���ʷ� ���
		if (size > 0)
			for (DNode p = head.getNext(); p != tail; p = p.getNext())
				System.out.print(p.getItem() + "\t ");
		else
			System.out.println("����Ʈ �������");
		System.out.println();
	}
}