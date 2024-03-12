package Chapter9_INTERFACE;

interface tamilnadu {
  void chennai();

  interface pudukkottai {
    void alangudi();
    void arimalam();
  }
}

class cm implements tamilnadu, tamilnadu.pudukkottai {
  public void chennai() {
    System.out.println(" Chennai is the capital of tamilnadu");
  }

  public void alangudi() {
    System.out.println(" Alangudi is near to pudukkottai");
  }

  public void arimalam() {
    System.out.println(" Arimalam is near to pudukkottai");
  }

  public static void main(String[] args) {
    tamilnadu.pudukkottai tnp = new cm();
    tamilnadu tn = new cm();

    tnp.alangudi();
    tnp.arimalam();
    tn.chennai();
  }
}