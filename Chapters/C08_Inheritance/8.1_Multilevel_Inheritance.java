package Chapter8_INHERITANCE;

class homo_erectus {
    void name() {
        System.out.println("my name is homo erectus");
        System.out.println(" I only hunt and eat food ");
    }
}

class homo_neanderthalensis extends homo_erectus {
    void name1() {
        System.out.println("my name is neanderthal");
        System.out.println(" I hunt and cook food ");
    }
}

class humans extends homo_neanderthalensis {
    void name2() {
        System.out.println("my name is human");
        System.out.println("I only cook and eat food ");
    }
}

class advance {
    public static void main(String[] args) {
        humans h = new humans();
        h.name();
        h.name1();
        h.name2();
    }
}