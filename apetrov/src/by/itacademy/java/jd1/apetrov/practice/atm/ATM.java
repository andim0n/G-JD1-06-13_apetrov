package by.itacademy.java.jd1.apetrov.practice.atm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ATM {

	private List<Slot> slots;

	public ATM(final List<Slot> slots) {
		super();
		validateUniqueSlots(slots);

		Collections.sort(slots);

		this.slots = slots;
	}

	public Result withdraw(final int initialSum) {
		int remainingSum = initialSum;

		List<ResultItem> resultItems = new ArrayList<>();
		for (Slot slot : slots) {
			int nominal = slot.getNominal();
			int quantityInSlot = slot.getQuantity();
			int potentialFromSlot = remainingSum / nominal;
			int availableQuantity = Math.min(quantityInSlot, potentialFromSlot);
			if (availableQuantity > 0) {
				ResultItem resultItem = new ResultItem(nominal, availableQuantity);
				resultItems.add(resultItem);
			}
			remainingSum = remainingSum - (nominal * availableQuantity);

			if (remainingSum == 0) {
				break;
			}
		}

		if (remainingSum == 0) {
			confirmWithdraw(resultItems);
			return new Result(resultItems);
		} else {
			return new Result("�� ���� ������ ������� � ����������:" + remainingSum);
		}
	}

	private void confirmWithdraw(final List<ResultItem> resultItems) {
		for (ResultItem resultItem : resultItems) {
			withdrawFromSlot(resultItem);
		}
	}

	private void withdrawFromSlot(final ResultItem resultItem) {
		for (Slot slot : slots) {
			if (slot.isApplicable(resultItem.getNominal())) {
				slot.withdraw(resultItem.getQuantity());
				break;
			}
		}
	}

	public void addMoney(final int nominal, final int quantity) {
		for (Slot slot : slots) {
			if (slot.isApplicable(nominal)) {
				slot.add(quantity);
				return;
			}
		}
		throw new RuntimeException("�� ���� ����� ���� ��� ������:" + nominal);
	}

	@Override
	public String toString() {
		return "\nATM [slots=" + slots + "]\n";
	}

	private void validateUniqueSlots(final List<Slot> slots) {
		Set<Integer> uniqueSlots = new HashSet<>();
		for (Slot slot : slots) {
			uniqueSlots.add(slot.getNominal());
		}

		if (uniqueSlots.size() != slots.size()) {
			throw new RuntimeException("��� ����� ������ ���� ���������.");
		}
	}

}
