package by.itacademy.java.jd1.apetrov.practice.atm;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Slot> slots = new ArrayList<Slot>();
		slots.add(new Slot(10, 0));
		slots.add(new Slot(50, 0));
		slots.add(new Slot(20, 30));
		ATM atm = new ATM(slots);
		System.out.println("�������� ������:" + atm);

		atm.addMoney(10, 200);
		System.out.println("�������� �����:" + atm);

		int sum = 1000;
		System.out.println("������� �����:" + sum);
		Result result = atm.withdraw(sum);
		System.out.println("��������� ������:" + result);

		System.out.println("������� � ���������:" + atm);
	}
}
