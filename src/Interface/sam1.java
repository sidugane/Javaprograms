package Interface;

//Interface 
public interface sam1
{
        int a=10;       // Variable declaration by default static & final
		void m1();		//public void a1();--Method declaration by default public and void
		void m2();	    //public void b1();--Method declaration by default public and void
	
}

// n number of incomplete methods can be declared inside the interface
//It is one of the oops principle
//It is pure 100% abstract in nature
//Interface is used to declare only incomplete methods in it.

//Features of Interface
//1. Methods declared inside interface are by default public and abstract
//2. Data members/variables declared inside the interface are by default static and final
//3. Constructor concept is not present in interface
//4. Object of interface can not be created
//5. To create object of interface programmer need to use of Implementation class
//using Implements keyword
//6 Interface supports Multiple Inheritance

// Implementation Class :
//A class which provides definitions for all the incomplete methods which are present in
// in Interface with the help of "implements" keyword is called Implementation Class

/* Can 1 interface extends another interface?---Yes */
/* Can 1 class extends another class?---Yes */