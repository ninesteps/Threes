public class threes {


    private static int gcd(int a, int b) {
        return (b==0) ? a : gcd(b,a%b);
    }
    private static int gcd(int a, int b, int c) {
        return gcd(gcd(a,b),c);
    }

    private static void smallestZ() {
        System.out.println("First 350 Sets in order of Smallest Z");
        int count = 0;
        int z = 1;
        int y = 2;

        while(count<350){
            int x = (int)Math.sqrt(z*z + y*y);
            if(x*x == z*z + y*y && x%5==0 && gcd(z,y,x)==1) {
                System.out.println(x + " " + y + " " + z);
                count++;
            }
            y++;
        }
    }

    private static void evenY() {
        System.out.println("First 350 Sets in order of Unique Even Y");
        int count =0;

        for(int y=4;count<140;y+=2) {
            int num = (int) Math.pow((y/2),2);
            if((y*y + (num-1)*(num-1)) == (num+1)*(num+1) && ((num+1)%5==0) && gcd(y,num-1,num+1)==1) {
                System.out.println((num+1) + " " + y + " " + (num-1));
                count++;
            }
        }
    }


    private static void increasingX() {
        System.out.println("First 350 Sets in increasing order of X");
        int count = 0;
        int y;
        int x = 5;

        while(count<350){
            for(int z = 1; z<20000; z++) {
                y = (int) Math.sqrt(1+ (x*x - z*z));
                if((y*y + z*z) == x*x && z<y && gcd(x,y,z)==1) {
                    System.out.println(x + " " + y + " " + z);
                    count++;
                }
            }
            x+=5;
        }
    }

    public static void main(String[] args) {
        increasingX();
        evenY();
        smallestZ();
    }

}