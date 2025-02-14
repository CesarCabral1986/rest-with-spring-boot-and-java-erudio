package main.exceptions;

import java.io.Serializable;
import java.util.Date;


// a importancia do serializable... no caso de aplicações grandes, fazer cache
public class ExceptionResponse implements Serializable {
	
	private static final long serialVersionUID = 1L;	
	
	private Date timestamp;
	private String message;
	private String details;
	
	

	public ExceptionResponse(Date  timestamp, String message, String details) {
		
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}

	public Date getTimestampo() {
		return timestamp;
	}

	public void setTimestampo(Date timestampo) {
		this.timestamp = timestampo;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
	
}
