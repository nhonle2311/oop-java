public class Fan {
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;

    int speed;
    boolean on;
    double radius;
    private String color;

    // Phương thức khởi tạo không tham số tạo đối tượng fan mặc định
    public Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5.0;
        this.color = "blue";
    }

    // Getter và setter cho speed
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Getter và setter cho on
    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    // Getter và setter cho radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter và setter cho color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Phương thức toString()
    public String toString() {
        if (on) {
            return "Speed: " + speed + ", Color: " + color + ", Radius: " + radius + " - Fan is on";
        } else {
            return "Color: " + color + ", Radius: " + radius + " - Fan is off";
        }
    }


    public static void main(String[] args) {
        // Tạo đối tượng Fan 1
        Fan fan1 = new Fan();
        fan1.setSpeed(FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        // Tạo đối tượng Fan 2
        Fan fan2 = new Fan();
        fan2.setSpeed(MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);

        // Hiển thị thông tin đối tượng bằng cách gọi phương thức toString
        System.out.println("Fan 1: " + fan1.toString());
        System.out.println("Fan 2: " + fan2.toString());
    }
}
