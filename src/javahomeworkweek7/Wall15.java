package javahomeworkweek7;
public class Wall15 {
    public static void main(String[] args) {
        Wall15 wall = new Wall15(5,4);
        System.out.println("area="+wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width=" +wall.getWidth());
        System.out.println("height=" +wall.getWidth());
        System.out.println("area=" +wall.getArea());

    }

    private double width;
    private double height;

    public Wall15 () {
    }
        public Wall15 (double width, double height){
        if(width > 0 && height < 0){
            this.width = width;
            this.height = 0;
        }else if(width < 0 && height > 0){
            this.width = 0.0;
            this.height = height;
        }else if(width < 0 && height < 0){
            this.width = 0.0;
            this.height = 0.0;
        }else{
            this.width = width;
            this.height = height;
        }
    }

    public void setWidth(double width){
        if(width < 0){
            this.width = 0;
        }else{
            this.width = width;
        }
    }

    public double getWidth(){
        return width;
    }

    public void setHeight(double height){
        if(height < 0){
            this.height = 0;
        }else{
            this.height = height;
        }
    }

    public double getHeight(){
        return height;
    }
    public double getArea(){
        return this.width * this.height;
    }

}