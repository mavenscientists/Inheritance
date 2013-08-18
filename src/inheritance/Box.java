package inheritance;

/**
 *
 * @author  Maven Scientists (http://blog.mavenscientists.com)
 * @date   Aug 18, 2013
 */
public class Box
{
    int length;
    int breadth;
    int height;

    public Box() {
    }

    public Box( int length, int breadth, int height)
    {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    
    public double getVolume()
    {
        double volume = length * breadth * height;
        return volume;
    }

}
