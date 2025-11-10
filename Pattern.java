// Idress Ahmadzai 11/7
// this program draws different patterns how the patterns look can be changed by what number you plug in


public class Pattern{

    //pre condition: rows must be a positive number
    //post condition: prints a right triangle made of stars 
    public static void stars(int rows){
        int i =0;
        String stars = "*";
        while(i<rows){
            //prints stars
            System.out.println(stars);
            i++;
            //adds one more star to the string
            stars= stars + "**";
        }
    }
    // pre condition: rows must be a positive number
    // post condition: prints a staircase of numbers with rows as the bottom and longest step
    public static void triangle(int rows){
        int n=0;
        while(n<rows){
            n++;
            int p = 0;
            
            while(p<n){
                p++;
                System.out.print(n);
            }
            System.out.println();
            
            
        }
    }
    // pre condition: start must be a positive odd number
    // post condition: prints an upside down staircase with odd number steps
    public static void odds(int start){
        for (int i = start; i>=1; i-=2){
            
            for (int g = 0; g<i; g++){
                System.out.print(i);
            }
             System.out.println();   
        }
    }
    
   
    // pre conditions : maxE must be a positive number
    //post conditions prints a double staircase of E's and O's
    public static void eo(int maxE){
       if (maxE <= 0) return;

        // Decide starting character: if maxE is even start with 'O', otherwise start with 'E'
        char letter = 'E';
        if(maxE %2==0){
            letter = 'O';
        }


        // Ascending part: 1..maxE
        for (int i = 1; i <= maxE; i++) {

           
            for (int j = 0; j < i; j++) {
                System.out.print(letter);
            }
            //swap to the "other" letter
            if(letter =='E'){
                letter = 'O';
            }
            else{
                letter = 'E';
            }
            System.out.println();
        }

         
        for (int i = maxE - 1; i >= 1; i--) {
             
            for (int j = 0; j < i; j++) {
                System.out.print(letter); 
             }
             
            if (letter == 'O'){
                letter='E';
             }
            else{
                letter='O';
            }
            System.out.println();
        }
          
        }
    //pre condition: rows must be a positive number
    //post condition: prints an upside down pyramid of numbers  
    public static void pyramid(int rows){
        //prints the spaces
        int f = rows;
        for (int l = 1; l <= f; l++){
            for (int s = 0; s < l-1; s++) 
            System.out.print(" ");
            // prints the numbers
            int count = 2 * (f - l) + 1;
            for (int k = 0; k < count; k++) 
            System.out.print(l);
            System.out.println();
        }
    }
    
    
        
    
    //calls all the methods to demonstrate them
    public static void main(String[] args){
        // keep existing demos
        stars(7);
        triangle(9);
        odds(9);
        eo(5);
        pyramid(5);
    }
}