public class ChilldrenBook extends Book {
    ChilldrenBook(double price)
    {
        super(price);
    }

    @Override
    public double getPrice() {
        return price*0.3;
    }


}
