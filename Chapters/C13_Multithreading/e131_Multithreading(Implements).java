package Chapters.C13_Multithreading;

class Multi_thr1 implements Runnable // Runnable class is an interface
{
  public static void main(String[] args) {
    Multi_thr1 obj = new Multi_thr1();
    Thread thread = new Thread(obj);
    thread.start();
    obj.test();
    System.out.println("This code is outside of the thread");
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Runnable#run()
   */
  public void run() {
    System.out.println("This code is running in a thread");
    int i = 0;
    while (i < 20) {
      System.out.println("hi");
      i++;
    }
  }

  public void test() {
    System.out.println("this is normal method");
    int i = 0;
    while (i < 10) {
      System.out.println("hello");
      i++;
    }
  }
}