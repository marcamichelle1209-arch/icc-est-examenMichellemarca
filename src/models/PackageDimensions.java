package models;

public class PackageDimensions {
  private double lenght;
   private double width;
    private double height;
     private double weight;
     public PackageDimensions(double lenght, double width, double height, double weight) {
      this.lenght = lenght;
      this.width = width;
      this.height = height;
      this.weight = weight;
     }
     public double getLenght() {
       return lenght;
     }
     public void setLenght(double lenght) {
       this.lenght = lenght;
     }
     public double getWidth() {
       return width;
     }
     public void setWidth(double width) {
       this.width = width;
     }
     public double getHeight() {
       return height;
     }
     public void setHeight(double height) {
       this.height = height;
     }
     public double getWeight() {
       return weight;
     }
     public void setWeight(double weight) {
       this.weight = weight;
     }
     //METODO
     public double getVolume(){
      double result = 0;
      result = (double) (lenght*weight*height);
      return result;
     }
     @Override
     public String toString() {
      return "PackageDimensions [lenght=" + lenght + ", width=" + width + ", height=" + height + ", weight=" + weight
          + "]";
     }
     
}
