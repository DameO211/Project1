public class Weight {

  
  //It should have five public methods and two private methods

  /*1. A public constructor that allows the pounds and ounces
  to be initialized to the values supplied as parameters.*/
  private int pounds;
  private int ozs;
  private static final int OUNCES_TO_POUNDS = 16;

  Weight(int pounds, int ozs){

    this.pounds = pounds;
    this.ozs = ozs;

  }


  /*2. A public instance method named lessThan that accepts one weight as a
   parameter and returns whether the weight object on which it is invoked
    is less than the weight supplied as a parameter.*/

    public void lessThan(int weight){

    }

    /*3. A public instance method named addTo that accepts one weight as a parameter
    and adds the weight supplied as a parameter to the weight object on
    which it is invoked. It should normalize the result.*/

    public void addTo(int weight){

    }


    /*4. A public instance method named divide that accepts an integer divisor as a parameter.
   It should divide the weight object on which the method is invoked
   by the supplied divisor and normalize the result.*/

   public void divide(int divisor){

   }


   /*5. A public instance toString method that returns a string that looks as follows:
    x lbs y oz, where x is the number of pounds and y the number of ounces.
    The number of ounces should be displayed with three places to the right of the decimal.*/

    public String toString() {
        return null;

    }


    /*6. A private instance method toOunces that returns the total
    number of ounces in the weight object on which is was invoked.*/
    
    private int toOunces(){
      return 0;

    }


    /*7. A private instance method normalize that normalizes the weight
    on which it was invoked by ensuring that the number of ounces
    is less than the number of ounces in a pound.*/
    private void normalize(){
        return;

    }



    /*Both instance variable must be private.
In addition the class should contain a private named constant
that defines the number of ounces in a pound, which is 16.
The must not contain any other public methods.

   */

}
