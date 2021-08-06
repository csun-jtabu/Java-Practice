public class Practice1
{
	 public static void main(String [] main){
        int [] [] nir = new int [2] [3];
        System.out.println("This is the amount of rows " + nir.length);   // nir.length gives the value/length of the rows (1st dimension) 
        System.out.println("This is the length of the first row (how many columns there are) " + nir[0].length); //nir[].length gives the value/length of the columns (2nd dimension)
        saySomething();
    }
    
    static void saySomething()
    {
        System.out.println("Gibberish");
    }
    
}