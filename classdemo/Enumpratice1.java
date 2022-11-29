enum Color {
  RED('R'), YELLOW('Y'), CYAN('C'), BLACK('B'), WHITE('W'), GREEN('G');

  private final char shortname; // features of enum Color

  private Color(char shortname) { // declare value
    this.shortname = shortname;
  }

  public char getShortName() {
    return this.shortname;
  }
}

class Toner {

  private String itemName;
  private Color color;
  private int code;

  public Toner() {

  }

  Toner(String itemName, Color color, int code) {
    this.itemName = itemName;
    this.color = color;
    this.code = code;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public String getItemName() {
    return this.itemName;
  }

  public int getCode() {
    return this.code;
  }

  public Color getColor() {
    return this.color;
  }

  public class Enumpratice1 {

    public static void main(String[] args) {

      Toner toner1 = new Toner();
      toner1.setItemName("HP TONER");
      toner1.setCode(001);
      toner1.color = Color.RED;
      System.out.println(toner1.getItemName);
      System.out.println(toner1.getCode);

    }
  }
}
