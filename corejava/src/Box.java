
class Box1 {
double width;
double height;
double depth;

Box1(double width, double height, double depth) {
this.width = width;
this.height = height;
this.depth = depth;
}

double volume() {
return width * height * depth;
}
}
class Box {
public static void main(String args[]) {

Box1 mybox1 = new Box1(10, 20, 21);

double vol;

vol = mybox1.volume();
System.out.println("Volume is " + vol);

}
}