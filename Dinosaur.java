public class Dinosaur {
 private int numTeeth;        //private bc touch = bad
 private boolean hasWings;
 private String color;
 private double height;
 

 //Constructors
 public Dinosaur(int N, boolean W, String C, double H){
    setNumTeeth(N);
    setHasWings(W);
    setColor(C);
    setHeight(H);
 }

 public Dinosaur(){
    this(0,false,"brown",0);
 }

 //Getters
 public int getNumTeeth(){   //bc no touchy, use this instead
    return numTeeth; 
 }

 public boolean getHasWings(){
    return hasWings;
 }

 public String getColor(){
    return color;
 }

 public double getHeight(){
    return height;
 }


 //Setters
 public void setNumTeeth(int T){
    numTeeth = T;
 }

 public void setHasWings(boolean W){
    hasWings = W;
 }

 public void setColor(String C){
    color = C;
 }

 public void setHeight(double H){
    height = H;
 }
}
