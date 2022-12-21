  class Book implements Product  {
   double price;
Book(double price )
{
setPrice(price);}
      @Override
      public void setPrice(double price) {
       this.price   =price;
      }

      @Override
     public double getPrice() {
         return price;
     }
 }
