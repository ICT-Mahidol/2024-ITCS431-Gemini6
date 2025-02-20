import java.time.LocalDateTime;

public class Invoice {
	
	private int invoiceID = 0;
	public static int runningID = 1;
	private LocalDateTime dateTime = LocalDateTime.now();
	
	public Invoice() {
		this.invoiceID = runningID;
    	runningID++;
	}
	
	public int getinvoiceID() {
		return this.invoiceID;
	}
	
	public LocalDateTime getInvoiceDateTime() {
		return this.dateTime;
	}
	
}
