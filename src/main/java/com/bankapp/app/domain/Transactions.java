package com.bankapp.app.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="transactions", catalog="bankproject")
public class Transactions {

	 @Id
	 @GeneratedValue(strategy= GenerationType.AUTO)
	private int transactionId;
	private int amount;
	private String type;
    private String accNo;
    
    @Transient 
	private String statusMessage;
	
	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}
	
	@Temporal(TemporalType.DATE)
	private Date date=new Date();
	    
	@Temporal(TemporalType.TIME)
	private Date time=new Date();

	      
	    public Transactions() {
	        super();
	        // TODO Auto-generated constructor stub
	    }
	    public Transactions(int amount, String type, String accNo) {
	        super();
	        this.amount = amount;
	        this.type = type;
	        this.accNo=accNo;
	    }
	    public int getTransactionId() {
	        return transactionId;
	    }
	    public void setId(int transactionId) {
	        this.transactionId = transactionId;
	    }
	    public int getAmount() {
	        return amount;
	    }
	    public void setAmount(int amount) {
	        this.amount = amount;
	    }
	    public String getType() {
	        return type;
	    }
	    public void setType(String type) {
	        this.type = type;
	    }
	    public String getAccNo() {
	        return accNo;
	    }
	    public void setAccNo(String accNo) {
	        this.accNo = accNo;
	    }
	    
}
	
