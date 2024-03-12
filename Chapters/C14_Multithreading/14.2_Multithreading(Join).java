package Chapter14_MULTITHREADING;

class Multi_thr2 extends Thread {
  public void run() {
    for (int i = 1; i <= 5; i++) {
      try {
        Thread.sleep(1000);
      } catch (Exception e) {
        System.out.println(e);
      }
      System.out.println(i);
    }
  }

  public static void main(String args[]) {
    Multi_thr2 t1 = new Multi_thr2();
    Multi_thr2 t2 = new Multi_thr2();
    Multi_thr2 t3 = new Multi_thr2();
    t1.start();
    try {
      t1.join();
    } catch (Exception e) {
      System.out.println(e);
    }

    t2.start();
    t3.start();
  }
}