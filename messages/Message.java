 
package edu.ucsb.cs290.touch.to.chat.remote.messages;

import java.io.Serializable;
import java.util.Date;

public class Message implements Serializable {
	final String message;
	final Date timeSent;
	
	public Message(String message) {
		this.message = message;
		this.timeSent = new Date(System.currentTimeMillis());
	}
	
	public String toString() {
		return message + "\n Sent at " + timeSent.toString();
	}
	
	public Date getTimeSent() {
		return timeSent;
	}
}
