class longExample{
  public static void main(String agrs[]){
    int lightspeed;
    long days,seconds,distance;
    lightspeed=18600;
    days = 1000;
    seconds= days * 24 * 60 * 60;
    distance= lightspeed * seconds;
    System.out.println("In 1000 days light will travel about " + distance + " miles");
  }
}