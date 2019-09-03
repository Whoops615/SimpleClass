package by.htp.hame.main8.Task08;

import java.util.ArrayList;
import java.util.List;

public class CustomerGroup {

	private List<Customer> customers;

	public CustomerGroup() {
		customers = new ArrayList<Customer>();
	}

	public void add(Customer newCustomer) {
		customers.add(newCustomer);
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public Customer getCustomer(int id) {
		return customers.get(id);
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customers == null) ? 0 : customers.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerGroup other = (CustomerGroup) obj;
		if (customers == null) {
			if (other.customers != null)
				return false;
		} else if (!customers.equals(other.customers))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CustomerGroup [customers=" + customers + "]";
	}

}
