/*  Created by IntelliJ IDEA.
 *  User: Harshit Bhardwaj (hbh2001)
 *
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    public Book[] allTheBooksThatAreCurrentlyAvailable;

    public Library(Book[] allTheBooksThatAreCurrentlyAvailable) {
        this.allTheBooksThatAreCurrentlyAvailable = allTheBooksThatAreCurrentlyAvailable;
    }

    public Library() {
        this.allTheBooksThatAreCurrentlyAvailable = new Book[10];
        for (int i = 0; i < allTheBooksThatAreCurrentlyAvailable.length; i++) {
            allTheBooksThatAreCurrentlyAvailable[i] = new Book("Book" + (i + 1), null, "9535685486957" + (i + 1));
        }
    }

    public Book[] getAllTheBooksThatAreCurrentlyAvailable() {
        return allTheBooksThatAreCurrentlyAvailable;
    }

    public void setAllTheBooksThatAreCurrentlyAvailable(Book[] allTheBooksThatAreCurrentlyAvailable) {
        this.allTheBooksThatAreCurrentlyAvailable = allTheBooksThatAreCurrentlyAvailable;
    }

    /**
     * This method shows a list of all the book in our inventory.
     */

    public void listInventory() {
        for (Book book : allTheBooksThatAreCurrentlyAvailable) {
            System.out.println(book);
        }
    }

    @Override
    public String toString() {
        return "Library{" +
                "allTheBooksThatAreCurrentlyAvailable=" + Arrays.toString(allTheBooksThatAreCurrentlyAvailable) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(allTheBooksThatAreCurrentlyAvailable, library.allTheBooksThatAreCurrentlyAvailable);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(allTheBooksThatAreCurrentlyAvailable);
    }
}
