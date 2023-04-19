class ThreadCounter implements Runnable{
    int number = ScannerNumber.getNumber();
    int start;
    int end;
    private  static int counter = 0;

    public ThreadCounter(int start, int end) {
        this.start = start;
        this.end = end;
    }



    @Override
    public void run() {

        for (int i = start; i < end; i++) {
            if (i % number == 0) counter++;
        }

    }




    public static void countNumberMultithreading(){

        ThreadCounter threadCounter = new ThreadCounter(Integer.MIN_VALUE, Integer.MAX_VALUE/2);
        Thread thread1 = new Thread(threadCounter);
        try{
        thread1.start();
        System.out.println("Numbers of the 1st thread: " + threadCounter.counter);}
        catch (Exception e){
            e.printStackTrace();
        }


        ThreadCounter threadCounter1 = new ThreadCounter(Integer.MAX_VALUE/2 +1, Integer.MAX_VALUE);
        Thread thread2 = new Thread(threadCounter1);
        try {
            thread2.start();
            System.out.println("Numbers of the 2st thread: " + threadCounter1.counter);
        }
        catch(Exception e){
            e.printStackTrace();
        }

        try {
            thread1.join();
            thread2.join();
            System.out.println("Total amount of numbers: " + (threadCounter.counter +threadCounter1.counter));
        } catch (InterruptedException e){
            e.printStackTrace();
        }

    }

}
