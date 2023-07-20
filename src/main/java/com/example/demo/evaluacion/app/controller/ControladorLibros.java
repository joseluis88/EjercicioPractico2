package com.example.demo.evaluacion.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorLibros {

	@GetMapping({ "/libros/menu", "/libros/menu/" })
	public String showLibrosMenu() {
		return "libros/book-menu";
	}

	public class Book {
		private String title;
		private String author;
		private int quantity;
		private Genre genre;

		public Book(String title, String author, int quantity, Genre genre) {
			this.title = title;
			this.author = author;
			this.quantity = quantity;
			this.genre = genre;
		}

		// Getters y setters (omitiendo por simplicidad)

		// toString() para imprimir la información del libro
		@Override
		public String toString() {
			return "Title: " + title + ", Author: " + author + ", Quantity: " + quantity + ", Genre: " + genre;
		}

		// Enum para los géneros de los libros
		public enum Genre {
			FANTASY, ROMANCE, MYSTERY, SCIENCE_FICTION, DRAMA, HORROR, THRILLER, NON_FICTION, ADVENTURE
		}

		public static List<Book> generateBookList() {
			List<Book> bookList = new ArrayList<>();

			bookList.add(new Book("The Hobbit", "J.R.R. Tolkien", 20, Genre.FANTASY));
			bookList.add(new Book("Pride and Prejudice", "Jane Austen", 15, Genre.ROMANCE));
			bookList.add(new Book("Sherlock Holmes", "Arthur Conan Doyle", 10, Genre.MYSTERY));
			bookList.add(new Book("Dune", "Frank Herbert", 8, Genre.SCIENCE_FICTION));
			bookList.add(new Book("Hamlet", "William Shakespeare", 5, Genre.DRAMA));
			bookList.add(new Book("Dracula", "Bram Stoker", 12, Genre.HORROR));
			bookList.add(new Book("Gone Girl", "Gillian Flynn", 7, Genre.THRILLER));
			bookList.add(new Book("Sapiens: A Brief History of Humankind", "Yuval Noah Harari", 25, Genre.NON_FICTION));
			bookList.add(new Book("To Kill a Mockingbird", "Harper Lee", 18, Genre.DRAMA));
			bookList.add(new Book("1984", "George Orwell", 22, Genre.SCIENCE_FICTION));
			bookList.add(new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 30, Genre.FANTASY));
			bookList.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 14, Genre.DRAMA));
			bookList.add(new Book("The Da Vinci Code", "Dan Brown", 11, Genre.MYSTERY));
			bookList.add(new Book("The Catcher in the Rye", "J.D. Salinger", 16, Genre.DRAMA));
			bookList.add(new Book("The Lord of the Rings", "J.R.R. Tolkien", 25, Genre.FANTASY));
			bookList.add(new Book("The Girl with the Dragon Tattoo", "Stieg Larsson", 9, Genre.THRILLER));
			bookList.add(new Book("The Chronicles of Narnia", "C.S. Lewis", 18, Genre.FANTASY));
			bookList.add(new Book("The Hunger Games", "Suzanne Collins", 13, Genre.SCIENCE_FICTION));
			bookList.add(new Book("The Shining", "Stephen King", 10, Genre.HORROR));
			bookList.add(new Book("The Alchemist", "Paulo Coelho", 20, Genre.FANTASY));
			bookList.add(new Book("Gone with the Wind", "Margaret Mitchell", 6, Genre.DRAMA));
			bookList.add(new Book("The Godfather", "Mario Puzo", 8, Genre.THRILLER));
			bookList.add(new Book("The Little Prince", "Antoine de Saint-Exupéry", 12, Genre.FANTASY));
			bookList.add(new Book("The Maze Runner", "James Dashner", 15, Genre.SCIENCE_FICTION));
			bookList.add(new Book("The Fault in Our Stars", "John Green", 7, Genre.ROMANCE));
			bookList.add(new Book("To Kill a Mockingbird", "Harper Lee", 18, Genre.DRAMA));
			bookList.add(new Book("1984", "George Orwell", 22, Genre.SCIENCE_FICTION));
			bookList.add(new Book("The Catcher in the Rye", "J.D. Salinger", 14, Genre.DRAMA));
			bookList.add(new Book("The Da Vinci Code", "Dan Brown", 30, Genre.MYSTERY));
			bookList.add(new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 25, Genre.FANTASY));
			bookList.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 12, Genre.DRAMA));
			bookList.add(new Book("The Lord of the Rings", "J.R.R. Tolkien", 10, Genre.FANTASY));
			bookList.add(new Book("The Girl with the Dragon Tattoo", "Stieg Larsson", 9, Genre.THRILLER));
			bookList.add(new Book("Brave New World", "Aldous Huxley", 20, Genre.SCIENCE_FICTION));
			bookList.add(new Book("The Hunger Games", "Suzanne Collins", 15, Genre.SCIENCE_FICTION));
			bookList.add(new Book("The Alchemist", "Paulo Coelho", 17, Genre.NON_FICTION));
			bookList.add(new Book("The Shining", "Stephen King", 11, Genre.HORROR));
			bookList.add(new Book("The Adventures of Tom Sawyer", "Mark Twain", 8, Genre.ADVENTURE));
			bookList.add(new Book("The Picture of Dorian Gray", "Oscar Wilde", 6, Genre.DRAMA));
			bookList.add(new Book("Murder on the Orient Express", "Agatha Christie", 13, Genre.MYSTERY));

			return bookList;

		}
	}
}
