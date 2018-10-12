package mp;

public class Test {
	static int i;
    private synchronized static void countMe(String name){
        i++;
        System.out.println("Current Counter is: " + i + ", updated by: " + name);
    }

    private static Runnable t1 = new Runnable() {
        public void run() {
            try{
                for(int i=0; i<5; i++){
                    countMe("t1");
                }
            } catch (Exception e){}

        }
    };

    private static Runnable t2 = new Runnable() {
        public void run() {
            try{
                for(int i=0; i<5; i++){
                    countMe("t2");
                }
            } catch (Exception e){}
       }
    };
    
    private static void testThread() {
    	new Thread(t1).start();
        new Thread(t2).start();
    }

}
