public class EBAC
{
  private final double WATER_IN_BLOOD = .806;
  private final double US_CONVERSION = 1.2;
  
  
  private double standardDrinks;
  private double weight;//kg
  private double drinkingPeriod;//in hours
  private double metabolism;
  private double equation = 0;
  
  private char gender;
  
  public EBAC(double sd, double wt, double dp, char g)
  {
    standardDrinks = sd;
    weight = wt;
    drinkingPeriod = dp;
    gender = g;
  }
  
  //accessors
  public double getStandardDrinks() {return standardDrinks;}
  public double getWeight() {return weight;}
  public double getDrinkingPeriod() {return drinkingPeriod;}
  public char getGender() {return gender;}
  
  
  public double estimatedBAC()
  {
    double bw=0;
    
    if(gender == 'f')
    {
      bw = 0.49;
      metabolism = .017;
    }
    
    else if(gender == 'm')
    {
      bw = .58;
      metabolism = .015;
    }
    equation =  (((WATER_IN_BLOOD * standardDrinks * US_CONVERSION)/
                         (bw * (weight/2.2))) - (metabolism * drinkingPeriod)) * 10;
   
    return equation;
  }
}