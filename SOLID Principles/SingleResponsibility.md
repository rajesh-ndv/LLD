A class shall have only a single responsibility to change 

Consider a class called Marker 

```
class Marker{
    private int price;
}
```

There is another class Invoice which currently has 3 responsibilities 

1. Calculate price with GST 
2. print the invoice
3. Save to DB 

```
class Invoice{
    private int gst;
    public void calculatePrice(){};
    public void saveToDb(){};
    public void printInvoice(){};
}
```

The above Invoice class now is not following single responsibility patten , as it has 3 responsibilities and can change 

Applying single responsibility principle to above example 

Class Invoice will be segregated into multiple classes

```
class Invoice{
    private int gst;
    public void calculatePrice(){};
}
```

```
class InvoicePrinter{
    private Invoice invoice;
    public void printInvoice(){};
}
```

```
class InvoiceDao{
    private Invoice invoice;
    public void saveToDb(){};
}
```