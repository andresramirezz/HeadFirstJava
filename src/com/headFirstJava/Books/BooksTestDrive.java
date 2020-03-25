/**
 * 
 */
package com.headFirstJava.Books;

/**
 * @author Andres Ramirez
 *
 */
public class BooksTestDrive {

	public static void main(String[] args) {
		Books [] myBooks = new Books[3];
		int x = 0;
		
		myBooks[0] = new Books();
		myBooks[1] = new Books();
		myBooks[2] = new Books();
		
		myBooks[0].title = "The Grapes of Java";
		myBooks[1].title = "The Java Gatsby";
		myBooks[2].title = "The Java Cookbook";
		myBooks[0].author = "bob";
		myBooks[1].author = "sue";
		myBooks[2].author = "ian";
		
		while ( x< myBooks.length ) {
			System.out.printf(myBooks[x].title);
			System.out.printf(" by ");
			System.out.println(myBooks[x].author);
			x +=1;
		}
	}

}
