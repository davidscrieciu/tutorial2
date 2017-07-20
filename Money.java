/**
 * A Money object models money as dollars and cents
 **/
 
public class Money{
  
  /* attributes */ 
  private int dollars = -1;
  private int cents = -1;

  
  public Money(){
		// create an object with zero dollars and cents.
		dollars = 0;
		cents = 0;
  }
 
  public Money(int c){
		// create an object with c cents
		// (adjusting dollars and cents so that 0<=cents<=99)
		//dollars = 0;
		//if (c<100){
		//cents = c;
		//}while (c>=100){
		//c = c - 100;
		//dollars += 1;
		//}
		//cents = c;
		dollars = c/100;
		cents = c % 100;
  }
  
  public Money(int d, int c){
		// create an object with d dollars and c cents
		// (adjusting dollars and cents so that 0<=cents<=99)
		while (c>=100){
		c = c - 100;
		d += 1;
		}
		cents = c;
		dollars = d;
  }
  
  public void add(int c){
	// adds c cents to the current value 
	int total = dollars * 100 + cents + c;
	dollars = total/100;
	cents = total % 100;
  }

  public void add(int d, int c){
  // adds d dollars and c cents to the current value
  	int total = (dollars + d) * 100 + cents + c;
	dollars = total/100;
	cents = total % 100;
  }

  public int remove(int c){
  // removes c cents from current value if current 
  // value is large enough. Otherwise, removes as much as it can.
  // Returns the actual amount of cents removed (may be > 100)
  	
	int total = dollars * 100 + cents;
	if (c>=100){
	 dollars = 0;
	 cents = 0;
	}else{
		total = total - c;
	}
	return total;
  }

  
  /** 
   * Returns a String representation of the value of the current object. 
   * 
   * @return The value of the current object is returned as the <code>String</code>"$D.cc"
   * where D is the number of dollars and cc is the cents of the value.  Uses the <code>format()</code>
   * method from the <code>String</code> class to ensure that the cents are displayed properly (2 spaces
   * with leading zeros if needed).
   **/
  public String getMoney(){
    return "$" + String.format("%01d", dollars) + "." + String.format("%02d", cents);
  }
  
}