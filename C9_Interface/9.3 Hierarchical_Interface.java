package Chapter9_INTERFACE;

interface Grandparents // Interface 1
{
    void grandpa();
    void grandma();
}

interface parents extends Grandparents // Interface 2 (interfaces can extend between themselves)
{
    void mom();
    void dad();
}

class kids implements parents // Class 1
{
    public void grandpa() {
        System.out.println("Grandpa Paid 500 Rs");
    }

    public void grandma() {
        System.out.println("Grandma Paid 1500 Rs");
    }

    public void mom() {
        System.out.println("Mom Paid 250 Rs");
    }

    public void dad() {
        System.out.println("Dad Paid 100 Rs");
    }

    public static void main(String[] args) {
        kids k = new kids();
        k.grandpa();
        k.grandma();
        k.dad();
        k.mom();
    }
}