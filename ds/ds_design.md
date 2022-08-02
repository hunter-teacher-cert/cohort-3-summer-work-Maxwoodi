# Data Structure Design Challenge: PhoneBook
Roster: Kate Maschmeyer, Will LaMorie, Maxwell Yearwood, Jerusha Theobald

```java
public class PhoneBook{
	// ArrayList for each letter of the alphabet.
}

```

Each person in PhoneBook stored as:

```java
public class Person {
  private String lastName;
  private String firstName;
  private String phoneNumber;
  
  // other members not shown
}	
```

## Instance variables
// Creating 26 ArrayLists of type Person.  Note that we create and maintain each ArrayList as sorted, since optimized searching is always faster than optimized sorting.

// We are making the assumption that while both add and find should happen as quick as we can, but that the use case of a phone book is one where finding a member occurs more often. Based on that, while these are both priorites, find seems to be the greater of the two priorties.

// Best case scenario: there is an even distribution of first letters of last names (search time will be 1/26 of n) 

// Worst case scenario: every person's last name starts with the same letter (treat like search time is with n)
* ArrayList<Person> A
* ArrayList<Person> B
* ....
* ArrayList<Person> Z

  
## Constructors
Takes in no parameters: Instantiate all ArrayLists above


## Methods

### Helper method: determineArrayList(Person p)
* **Description**: Determines which ArrayList (A-Z) Person p falls under (match first letter of p's lastName) 
* **Returns**: ArrayList (that matches first letter of p's lastName)
* **Inner workings**:  Determine which ArrayList that Person P will be inserted into (conditional based on first letter of lastName)
* **Runtime**: O(1)


### add(String lastName, Person p)
* **Description**: Adds new people in to the PhoneBook by lastName.
* **Returns**: void
* **Inner workings**:  // maintains sorted ArrayLists at all times
  1. Use helper method determineArrayList(Person p): O(1)
  2. Binary search on P's ArrayList to determine location for placement: O(lg n)
      * Starting with the second letter, get the char value of the middle.
      * Once the next lowest is found (preceeding) then check this result + 1
      * If the value of middle + 1 is higher then you are in the right place
      * Otherwise, move to the next letter and do the same process. <-- we realize this is an O(lg m*lg n .... ) case, but since m is sooooo much smaller than n, we are ignoring it for this purposes of this assignment.
  3. Insert Person P at specified location:  O(1)
* **Runtime**: O(1) + O(lg n) + O(1) = O(lg n)


### find(String lastName)
* **Description**: Find a person by lastName. For example, pb.find("Smith") would return the person in the phone book with last name "Smith". Assume that last names are unique. Find should return null if the person is not in the phone book. 
* **Returns**: Person
* **Inner Workings**: // Recall that, due to our add, all ArrayLists are sorted
  1. Use helper method determineArrayList(Person p): O(1)
  2. Use helper method findIndex(String lastName): O(lg n)
* **Runtime**: O(1) + O(lg n) = O(lg n)


### Helper method: findIndex(String lastName) 
* **Description**: Find a person by lastName. For example, pb.find("Smith") would return the person in the phone book with last name "Smith". Assume that last names are unique. Find should return null if the person is not in the phone book. 
* **Returns**: index of Person p's location
* **Inner Workings**: // Recall that, due to our add, all ArrayLists are sorted
  1. Use helper method determineArrayList(Person p): O(1)
  2. Binary search on p's ArrayList to find p: O(lg n)
      * Starting with the second letter, get the char value of the middle.
      * Once the next lowest is found (preceeding) then check this result + 1
      * If the value of middle + 1 is higher then you are in the right place
      * Otherwise, move to the next letter and do the same process. <-- we realize this is an O(lg m*lg n .... ) case, but since m is sooooo much smaller than n, we are ignoring it for this purposes of this assignment.
* **Runtime**: O(1) + O(lg n) + O(1) = O(lg n)


### remove(Person p)
* **Description**: remove a person from the list based on lastName. This operation does not have to be optimized.
* **Returns**: void
* **Inner Workings**:
   1. Use helper method determineArrayList(Person p): O(1)
   2. Use helper method findIndex(Person p) to determine index of Person to remove:  O(lg n)
   3.  Use ArrayList's remove(int index) to remove: O(1) ? (most of the time)
* **Runtime**: O(lg n)


### printList()
* **Description**: prints out an entire phone book. This operation does not have to be optimized.
* **Returns**: void
* **Inner Workings**: loop through all ArrayLists: within a given ArrayList, loop through all Persons, printing each Person. 
* **Runtime**: O(n)
 
## Implementation hints
Make sure to consider that you want add and find to operate as quickly as possible.

Note that you are finding (searching) based on last name. Last names are strings and you can access an individual letter via charAt. So, if `lastName` is "Smith" then lastName.charAt(0) would be the char 'S'.

Also note that chars have numeric values. For example, the char 'a' has a value of 97, 'b' is 98 etc. 'A' is 65, 'B" is 66 etc. You can access these values by assigning a char to an int.

String s = "ABC";
int i = s.charAt(a); // I will now hold 65
You can use this char to int mapping to help in efficiently storing items.


## Additions (not required)
Reverse lookup
In addition to looking up people by last name, you might want to do a reverse lookup - that is look up someone by number.

Describe an algorithm that you could use to implement a revese lookup by number on your data structure. What is the runtime?

How might you augment the data structure to implement reverse lookup more quickly? What would the algorithm look like now? What is the new runtime?
