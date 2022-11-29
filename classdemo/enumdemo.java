public class enumdemo {
  
  enum Level {

    LOW (1),
    MEDIUM (2),
    HIGH (3);

    int value;

    Level (int value){
    this.value = value;
  }
}
  
  public static void main (String[] args) {
    useEnumTypesInSwitch();
  }

    public static void useEnumTypesInSwitch(){

    Level myVar = Level.MEDIUM;
    for (Level myVar1 : Level.values()){
    switch(myVar) {
      case LOW:
      System.out.println("This is Low Level");
      System.out.println("enum is" + myVar + "," + "and its value is" + myVar1.value);
      break;
      case MEDIUM:
      System.out.println("This is Medium level");
      System.out.println("enum is" + myVar + "," + "and its value is" + myVar1.value);
      break;
      case HIGH:
      System.out.println("This is High Level");
      System.out.println("enum is" + myVar + "," + "and its value is" + myVar1.value);
      break;
  }
}
}
  }
