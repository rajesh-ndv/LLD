A class should be open for extension and closed for modification 

Let's consider a class InvoiceDao which saves an invoice to Database 

```
class InvoiceDao{
    private Invoice invoice;
    public void saveToDb(){};
}
```

Let's say we want to add the functionality to save the invoice to a file in the above InvoiceDao class 
But this method discouraged because the InvoiceDao class is already tested and running and deployed , if we try to add some more functionality to this class, it may potentially introduce bugs 

so we will extend the above class to provide the functionality using inheritence 

```
class InvoiceFileDao extends InvoiceDao{
    public void saveToFile(){};
}
```

A more efficient method to solve this issue is to use interfaces

```
interface InvoicePersistence{
    public void save();
}
```

```
class DatabaseInvoiceDao implements InvoicePersistence{
    @override
    //Provide logic to method below
    public void save();
}
```

```
class FileInvoiceDao implements InvoicePersistence{
    @override
    //Provide logic to method below
    public void save();
}
```
