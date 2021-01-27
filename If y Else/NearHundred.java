class NearHundred {
  public static void main(String[] args) {
    System.out.println(nearHundred(93));
    System.out.println(nearHundred(90));
    System.out.println(nearHundred(89));
  }
  static boolean nearHundred(int n) {
    boolean enRangoDe100 = n >= 90 && n <= 110;
    boolean enRangoDe200 = n >= 190 && n <= 210;
    return enRangoDe100 || enRangoDe200;
  }
}
