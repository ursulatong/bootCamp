public class ComputerUrsula { 

    // create attributes 
        private String Name;
        private int RAM; 
        private String Model;
    
    // create constructor
        public ComputerUrsula (String a, int b, String c) { 
            this.Name = a;
            this.RAM = b;
            this.Model = c;
        }

    // implicit constructor

        public ComputerUrsula (){

        }

    // Method
        public void setName(String a){
            this.Name = a;
        }

        public void setRAM(int b){
            this.RAM = b;
        }

        public void setModel(String c){
            this.Model = c;
        }
        
        public String getName() {
            return Name;
        }
    
        public int getRAM() {
            return RAM;
        }
    
        public String getModel() {
            return Model;
        }
    
        public static void main(String[] args) {
    
            ComputerUrsula computer1 = new ComputerUrsula ();
            computer1.setName("Ursula");
            computer1.setRAM (16);
            computer1.setModel("Model X");

            System.out.println("This new computer is : " + computer1.getName());
            System.out.println("RAM is : " + computer1.getRAM());
            System.out.println("Model is : " + computer1.getModel());

            }
    
        }