
/**
 * Converts Fahrenheit to Celcius
 * 
 * @SophiaBhatti 
 * @9/6/2022
 */
public class TemperatureConverter
{
    
   /**
    * converts fahrenheit to celsius
    * 
    * @param fhar the temperature in fahrenheit
    * @return the temperature in degrees celsius
    */ 
   public double fToC(double fahr){
       int celc = 0;
       celc = (fahr+32) * (5/9);
       return celc; // delete this line of code
   }
       
       
}
