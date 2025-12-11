package rvt;

public class Chapter50 {
    static class Box {
        double width, height, lenght;

        public Box(double width, double height, double lenght) {
            this.width = width;
            this.height = height;
            this.lenght = lenght;
        }

        public double length() {
            return lenght;
        }
        public double height() {
            return height;
        }
        public double width() {
            return width;
        }

        public double volume(){
            return width * height * lenght;
        }

        private double faceArea() {
            return lenght * height;
        }
        private double topArea() {
            return lenght * width;
        }
        private double sideArea() {
            return width * height;
        }

        public double area(){
            return 2 * faceArea() + 2 * topArea() + 2 * sideArea() ;
        }

        public Box biggerBox(Box Box){
            return new Box( 1.25*Box.width(), 1.25*Box.height(), 1.25*Box.length() );
        }

        public Box smallerBox(Box Box){
            return new Box( 0.75*Box.width(), 0.75*Box.height(), 0.75*Box.length() );
        }
        public boolean nests( Box outsideBox ) {
            return width < outsideBox.width && lenght < outsideBox.lenght && height < outsideBox.height;
        }
    }

    public static void main ( String[] args ){
    Box box = new  Box( 2.5, 5.0, 6.0 ) ;
    
    System.out.println( "length: " + box.lenght + " height: " + box.height +
                         "width:  " + box.width );
    
    Box Bbox = box.biggerBox(box);
    System.out.println( "length: " + Bbox.lenght + " height: " + Bbox.height +
                         "width:  " + Bbox.width );

    Box Sbox = box.smallerBox(box);
    System.out.println( "length: " + Sbox.lenght + " height: " + Sbox.height +
                         "width:  " + Sbox.width );

    System.out.println(Sbox.nests(box));
    System.out.println(box.nests(Bbox));
    System.out.println(box.nests(Sbox));
    }
}
