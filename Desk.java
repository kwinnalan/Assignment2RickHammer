
/**
 * This is a program to add features to and calculate the total price of a desk 
 *  built by Rick Hammer
 *  
 * @author Kwinn Danforth
 * @version 1.0.1
 */
public class Desk
{
    // instance variables - replace the example below with your own
    final int drawerPrice = 30;
    
    private int orderNum;
    private String customerName;
    private int basePrice;
    private int length;
    private int width;
    private String wood;
    private int numDrawers;
    private int totPrice;
    private int woodPrice;
    private boolean overSized;
    

    /**
     * Constructor for objects of class Desk
     */
    public Desk(int inOrderNum, String inCustName, int inLength, int inWidth, String inWood, int inNumDrawers)
    {
        // initialise instance variables
        orderNum = inOrderNum;
        customerName = inCustName;
        basePrice = 200;
        length = inLength;
        width = inWidth;
        wood = inWood;
        woodPrice = calcWoodPrice();
        numDrawers = inNumDrawers;
        totPrice = calcTotal();
        overSized = false;
    } 

    /**
     * This is an accessor method for order number
     *
     *
     * @return    orderNum
     */
    public int getOrderNum()
    {
        return orderNum;
    }
    
    /**
     * This is an accessor method for customer name
     *
     *
     * @return    customerName
     */
    public String getCustName()
    {
        return customerName;
    }
    
    /**
     * This is an accessor method for Base Price
     *
     *
     * @return    basePrice
     */
    public int getBasePrice()
    {
        return basePrice;
    }
    
    /**
     * This is an accessor method for Length
     *
     *
     * @return    length
     */
    public int getLength()
    {
        return length;
    }
    
    /**
     * This is an accessor method for width
     *
     *
     * @return    width
     */
    public int getWidth()
    {
        return width;
    }
    
    /**
     * This is an accessor method for Wood Type
     *
     *
     * @return    wood
     */
    public String getWood()
    {
        return wood;
    }
    
    /**
     * This is an accessor method for number of drawers in the desk.
     *
     *
     * @return    numDrawers
     */
    public int getNumDrawers()
    {
        return numDrawers;
    }
    
    /**
     * This is an accessor method for the total price of the desk.
     *
     *
     * @return    totPrice
     */
    public int totPrice()
    {
        return totPrice;
    }
    
    /**
     * This is a mutator method for the changing the type of wood of the desk.
     *
     *
     * @return    wood
     */
    public String changeWood(String newWood)
    {
        wood = newWood;
        calcWoodPrice();
        calcTotal();
        return wood;
    }
    
    /**
     * This is a mutator method for the changing the order Number.
     *
     *
     * @return    orderNum
     */
    public int changeOrderNumber(int newOrderNum)
    {
        orderNum = newOrderNum;
        return orderNum;
    }
    
    /**
     * This is a mutator method for the changing the customer Name.
     *
     *
     * @return    customerName
     */
   public String changeCustomerName(String newCustomerName)
   {
        customerName = newCustomerName;
        return customerName;
    }
    
   /**
     * This is a mutator method for the changing the base price.
     *
     *
     * @return    basePrice
     */
   public int changeBasePrice(int newBasePrice)
   {
        basePrice = newBasePrice;
        calcTotal();
        return basePrice;
   }
   
   /**
     * This is a mutator method for the changing the number of drawers in the desk.
     *
     *
     * @return    numDrawers
     */
   public int changeNumDrawers(int newNumDrawers)
   {
        numDrawers = newNumDrawers;
        calcTotal();
        return numDrawers;
   }
   
   /**
     * This is a mutator method for the changing the length of the desk.
     *
     *
     * @return    length
     */
   public int changeLength(int newLength)
   {
        length = newLength;
        calcTotal();
        return length;
   }
   
      /**
     * This is a mutator method for the changing the width of the desk.
     *
     *
     * @return    width
     */
   public int changeWidth(int newWidth)
   {
        width = newWidth;
        calcTotal();
        return width;
   }
    
    /**
     * This method is used to calculate the total price of the desk
     *
     *
     * @return    totPrice
     */
    public int calcTotal()
    {
        totPrice = basePrice + (numDrawers * drawerPrice) + woodPrice;
        if ((width * length) > 750){
        overSized = true;
        totPrice += 50;
        }
        return totPrice;
    }
    
    /**
     * This method is used to calculate the price of the wood type
     *
     *
     * @return    woodPrice
     */
    public int calcWoodPrice()
    {
        if (wood == "pine"){
        woodPrice = 0;
        }
        else if (wood == "mahogany"){
        woodPrice = 150;
        }
        else if (wood == "oak"){
        woodPrice = 125;
        }
        else {
        System.out.println("######INVALID#########Not a valid Wood Type########INVALID#########");
        }
        return woodPrice;
    }
    
    /**
     * This is a method to print the total cost and breakdown of the bill.
     * 
     * @return void
     */
    public void printBill()
    {
        System.out.println("##ORDER NUMBER==> " + orderNum);
        System.out.println("##CUSTOMER NAME==> " + customerName);
        System.out.println("##BASE PRICE==> " + basePrice);
        System.out.println("##WOOD TYPE==> " + wood + " (price +" + woodPrice + ")");
        System.out.println("##NUM OF DRAWERS==> " + numDrawers + " x30 each (price +" + (numDrawers*drawerPrice) + ")");
        System.out.println("##LENGTH==> " + length);
        System.out.println("##WIDTH==> " + width);
        System.out.println("##OVERSIZED==> " + overSized + " (true = +50)");
        System.out.println("##TOTAL PRICE==>" + totPrice);
    }
     
    
}
