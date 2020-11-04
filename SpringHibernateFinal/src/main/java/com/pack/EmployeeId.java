package com.pack;

import java.io.Serializable;

public class EmployeeId implements Serializable {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String branch;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getId() {
		return id;
	}

	public String getBranch() {
		return branch;
	}

	public EmployeeId(int id, String branch) {
		super();
		this.id = id;
		this.branch = branch;
	}

	public EmployeeId() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((branch == null) ? 0 : branch.hashCode());
		result = prime * result + id;
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
		EmployeeId other = (EmployeeId) obj;
		if (branch == null) {
			if (other.branch != null)
				return false;
		} else if (!branch.equals(other.branch))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

}
