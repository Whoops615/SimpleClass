package by.htp.hame.main8.Task08;

import java.util.ArrayList;
import java.util.List;

public class CustomerGroupLogic {

	public static List<Customer> intervalCreditCard(CustomerGroup gr, int start, int end) {

		List<Customer> result = new ArrayList<Customer>();

		for (Customer cs : gr.getCustomers()) {
			if (CustomerLogic.intervalCreditCard(start, end, cs)) {
				result.add(cs);
			}
		}

		return result;
	}

	public static List<Customer> alphabetOrder(CustomerGroup gr) {

		//Сортируем по алфавиту
		List<Customer> cus = new ArrayList<Customer>();
		cus = gr.getCustomers();

		Customer minCustomer;
		int index;
		Customer temp;

		for (int i = 0; i < cus.size() - 1; i++) {

			minCustomer = cus.get(i);
			index = i;
			for (int j = i; j < cus.size(); j++) {
				String str1 = minCustomer.getSurname();
				String str2 = cus.get(j).getSurname();

				if (str1.compareTo(str2) > 0) {
					minCustomer = cus.get(j);
					index = j;
				}
			}
			temp = cus.get(i);
			cus.set(i, minCustomer);
			cus.set(index, temp);

		}

		return cus;
	}

}
