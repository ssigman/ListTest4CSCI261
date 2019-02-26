import cs.cscollections.SinglyLinkedList;

public class ListTestApp {
    public static void main(String [] args) {
        SinglyLinkedList<Student> roster = new SinglyLinkedList<Student>();

        // test empty list
        System.out.println("Length of empty SinglyLinkedList is: " + roster.getLength());
        System.out.println("The SinglyLinkedList should be empty. Empty:" + roster.isEmpty());

        // add at head of list
        Student sam = new Student("Sam", "Fresh");
        roster.prepend(sam);
        System.out.println("Roster should have one student. Length?: " + roster.getLength());

        Student sally = new Student("Sally", "Soph");
        roster.prepend(sally);
        System.out.println("Roster should have two students. Length?: " + roster.getLength());

        // add at tail of list
        // start with new list
        SinglyLinkedList<Student> roster2 = new SinglyLinkedList<Student>();

        // roster two is empty - report it
        System.out.println ("Roster 2 is empty. Empty?: " + roster2.isEmpty());

        // add sam at end of list
        roster2.append(sam);
        System.out.println("Roster 2 should have one student. Length?: " + roster2.getLength());

        // add sally at end of list
        roster2.append(sally);
        System.out.println("Roster 2 should have two students. Length?: " + roster2.getLength());

    }
}
