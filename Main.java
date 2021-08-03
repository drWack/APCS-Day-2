import java.io.*;
import java.util.*; // ArrayList, Collections, Random


class Main {

static boolean isLeapYear(int year){
  if(year%400==0){return true;}
  else if(year%100==0){return false;}
  else if(year%4==0){return true;}
  return false;

}
static int firstDayOfYear(int year)
{
  return 0;
}
static int dayOfYear(int month, int day, int year){
  return 214;
}


static int dayOfWeek(int month, int day, int year){
  int firstWeekday = firstDayOfYear(year); 
  int today = dayOfYear(month,day,year);

  today = today -1;//prevent off by one error

  int daysChanged = today%7;

  return (firstWeekday + daysChanged)%7;
}

  public static void main(String[] args) {

  Random myRandom = new Random();
  
  for(int i =0; i <100; i++){
    System.out.println(myRandom.nextDouble());
    }
  
  }

  
  static int numberOfLeapYears(int firstYear,int secondYear){
    /*
    Write a static method which returns the number of leap years between year1 and year2, inclusive 
    In order to calculate this value, a helper method is provided, isLeapYear(year) which returns true if the given year is a leap year, and false if it is not
    */
    int count =0;
    for(int y = firstYear; y<=secondYear; y++){
      if(isLeapYear(y)){
        count = count +1;
      }
    }
    return count;
  }
  static int CaughtSpeeding(Car theCar,int limit){
    //speed is some speed in mph, that we were given
    //a ticket at.
    //return the size of the ticket.
    // above 55mph is 200
    //above 80 is  500
     int speed = theCar.getSpeed();

    if((speed > limit) && (speed < limit + 20)){
      return 200;
    }
    else if(speed >= limit + 20){
      return 500;
    }
    else{
      return 0;
    }
  }
}
class Car{
  private int MPG;
  private int ModelYear;
  private String name;
  private int speed;

  public Car(int startMPG, int startModelYear,String Name){ //Constructor
    MPG = startMPG;
    ModelYear = startModelYear;
    name = Name;
    speed =0;
  }
  public int getMPG(){
    return MPG;
  }
  public int getModelYear(){
    return ModelYear;
  }
  public String getName(){
    return name;
  }
  public void setSpeed(int _speed){
    speed = _speed;
  }
  public int getSpeed(){
    return speed;
  }
}

class StepTracker{
  private int minimumStepsPerDay;
  private int numActiveDays;
  private int totalDays;
  private int totalSteps;

  public StepTracker(int _minStepsPerDay){
    minimumStepsPerDay = _minStepsPerDay;
    numActiveDays =0;
    totalDays =0;
    totalSteps =0;
  }

  public void addDailySteps(int todaysSteps){
    if(todaysSteps >= minimumStepsPerDay)
    {
      numActiveDays = numActiveDays+1;
    }
    totalDays = totalDays+1;
    totalSteps = todaysSteps + totalSteps;
  }

  public int activeDays(){
    return numActiveDays;
  }
  public double averageSteps(){
    // total number of steps/ toal days
    if(totalDays ==0){
      return 0.0;
  }

    return (double)totalSteps/totalDays;

  }


}
class Delimiter{
  private String openDel;
  private String closeDel;

  public Delimiter(String s1, String s2){
    openDel =s1;
    closeDel =s2;
  }
  public ArrayList<String> getDelimitersList(){
    String[]  tokens = {"(", "x + y", ")" ," * 5"};
    ArrayList<String> DelimiterList = new ArrayList<String>();
    for(String str : tokens){
      if((str.equals(openDel)) || (str.equals(closeDel))){
        DelimiterList.add(str);
      }
    }
    return DelimiterList;
  }


}
class lightBoard{
private  boolean[][] lights;

  public lightBoard(int numRows, int NumCols){


  }

}