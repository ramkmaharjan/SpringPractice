package org.hibernate.hqlexample.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
// (name="USER_TABLE")
@Table(name = "USER_TABLE")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
@NamedQuery(name="findUserDetails",query="from UserDetails where userId =?")
public class UserDetails {

	@Id
	@GeneratedValue
	private int userId;

	@Column(name = "USER_NAME")
	private String userName;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	

}
