public class Box {
    private double length;
    private double width;
    private double height;

    // Constructor
    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Method to validate and adjust dimensions
    public void validateDimensions() {
        if (length != 10) {
            if (length < 10) {
                length += 1; // Increment by 1 if less than 10
            } else {
                length -= 1; // Decrement by 1 if greater than 10
            }
        }

        if (width != 12) {
            if (width < 12) {
                width += 1; // Increment by 1 if less than 12
            } else {
                width -= 1; // Decrement by 1 if greater than 12
            }
        }

        if (height != 8) {
            if (height < 8) {
                height += 2;
            } else {
                height -= 2; 
            }
        }
    }


    public void displayDimensions() {
        System.out.println("Length: " + length + " meters");
        System.out.println("Width: " + width + " meters");
        System.out.println("Height: " + height + " meters");
    }

    public static void main(String[] args) {
       
        Box box = new Box(9, 12, 10);

      
        box.validateDimensions();

        System.out.println("Adjusted Box Dimensions:");
        box.displayDimensions();
    }
}
