package Lectures.L1_Intro;

public class Member implements Comparable<Member> {
    private String name;
    private int height;

    public Member(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return this.name;
    }

    public int getHeight() {
        return this.height;
    }

    @Override
    public String toString() {
        return this.getName() + " (" + this.getHeight() + ")";
    }

    @Override
    public int compareTo(Member member) {
//        if (this.height == member.getHeight()) {
//            return 0;
//        }
//        else if (this.height > member.getHeight()) {
//            return 1;
//        } else {
//            return -1;
//        }

        // As returning a negative number from compareTo() is enough
        // if the "this" object is smaller than the parameter object,
        // and returning zero is sufficient when the lengths are
        // the same, the compareTo method described above can also be
        // implemented as follows.
        return this.height - member.getHeight();

        /*
        Since the Member class implements the Comparable interface,
        it is possible to sort the list by using the sorted method.
        In fact, objects of any class that implement the Comparable
        interface can be sorted using the sorted method.

        ==============================================================
        Be aware, however, that a stream does not sort the
        original list - only the items in the stream are sorted.
        ==============================================================

        If a programmer wants to organize the original list, the sort
        method of the Collections class should be used. This, of course,
        assumes that the objects on the list implement the Comparable interface.
         */
    }

}
