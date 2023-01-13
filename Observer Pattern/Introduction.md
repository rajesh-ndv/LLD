Notify Me Feature Of Amazon 

Two entities --> observable, observer 

when state changed for observable , observer is notified 

Methods in observable interface 

add() This method registers an observer
remove() This method de registers an observer
notify() This method notifies all the notifiers (Iterates for all observer interface from list and calls update method)
setData() changes data , call notify method
getData() returns available data

Keep track of all observers in a list

Methods in observer interface

update()

Observable has Many Observers (has many relationship , list)

A concrete class extends observable interface which implements methods of observable 

similarly a concrete class extends observer interface and implements notify() method

There's a catch here, a single observer listens to a lot of observables, so the update method of observer must have an explicit check on the object of observable to keep track of what is changed
as a result the notify method of observable has to pass the instance of observable for validation

Writing if else for all the observables is a tedious task 

Instead, follow the below approach 

Make a has A relationship between observer and observable 

Inject observable in observer using constructor injection.

In the notify method , use getData of observable to read the data state change 



Example : -

There's a Weather Station , It's duty is to update current temperature to observers (TV display , Mobile display)

## Refer Code