package inheritance;

/**
 *
 * @author  Maven Scientists (http://blog.mavenscientists.com)
 * @date   Aug 18, 2013
 */
public class CanBox extends Box
{
    double weight;

    public CanBox() {
    }

    public CanBox(double weight, int length, int breadth, int height) {
        super(length, breadth, height);
        this.weight = weight;
    }
    
    public static void main(String[] args)
    {
        CanBox canBox1 = new CanBox(40, 10, 12, 15);
        double volume;
        
        volume = canBox1.getVolume();
        System.out.println("Volume of CanBox1 : " + volume);
        
        System.out.println("Weight of CanBox1 : " + canBox1.weight);
    }
}
