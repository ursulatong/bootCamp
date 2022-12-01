package com.vtxlab.demo.bookstore;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.Id;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.vtxlab.demo.bookstore.controller.BooksOperation;
import com.vtxlab.demo.bookstore.controller.impl.BooksStoreController;
import com.vtxlab.demo.bookstore.entity.Authors;
import com.vtxlab.demo.bookstore.entity.Books;
import com.vtxlab.demo.bookstore.response.ApiResponse;
import com.vtxlab.demo.bookstore.service.BooksService;

import net.bytebuddy.asm.Advice.Local;

@ExtendWith(SpringExtension.class) //Mock, 
public class BookstoreControllerUnitTest {

  @Mock
  BooksService booksService;

  //@InjectMocks // simliar to autowired
  BooksOperation booksOperation;

  @BeforeEach
  void setup() {
    booksOperation = new BooksStoreController(booksService);
  }


  private void testFindAllBooks(List<Books> booksFromService, int size) {

    //Given
      when(booksService.findAll()).thenReturn(booksFromService);
      //when 
      List<Books> books = booksOperation.findAll().getBody().getData();
      // then
      assertThat(books).hasSize(size);
     // assertThat(result.get(0).getBookName()).isNull();
      //assertThat(result.get(1).getBookName()).isNull();
    }

  @Test
  void testCaseForFindAllBooks() {
    testFindAllBooks(List.of(new Books(), new Books()), 2);
    testFindAllBooks(List.of(new Books()), 1);
    testFindAllBooks(new ArrayList<>(), 0);
  }


  private void testFindBookById(Books book, Long id) {
    //Given
    when(booksService.findById(anyLong())).thenReturn(Optional.ofNullable(book));
  // when
  ResponseEntity<Books> aBook = booksOperation.findById(id);
  // then
  if(book!=null)
  {
    assertThat(aBook.getBody().getBookName()).isEqualTo(book.getBookName());
    assertThat(aBook.getBody().getId()).isEqualTo( book.getId());
    assertThat(aBook.getBody().getPublicationDate()).isEqualTo(book.getPublicationDate());
  }else
  {
    assertThat(aBook.getBody()).isEqualTo(null);
  }
}

  @Test
  void testCaseForFindBookById() {
    testFindBookById(null, 1l);
  //  testFindBookById(
//      new Books(2l, "Tommy Book", LocalDate.of(2022, 10, 2), new Authors()),2l);

  }

  private void testCreateBook(Books book, Books returnBooks) {
    // Given
      when(booksService.createBooks(book)).thenReturn(book);
      //when
     ResponseEntity<Books> newBook = booksOperation.createBooks(book);
     //then
     if (returnBooks != null) {
      assertThat(returnBooks.getBookName()).isEqualTo(newBook.getBody().getBookName());
      assertThat(newBook.getStatusCode()).isEqualTo(HttpStatus.OK);
     } else {
      assertThat(newBook.getStatusCode()).isEqualTo(HttpStatus.NO_CONTENT);
     }
    }

 @Test
  void testCaseForCreateBook() {
 //   Books book = new Books(1l, "Steve Book", LocalDate.of(2022, 11, 30), new Authors());

    //  testCreateBook(book, book);

  }

  private void testDeleteBookById(Long id, Books returnBooks){

    //Given
      // when(booksService.findById(anyLong())).thenReturn(Optional.ofNullable(returnBooks));
   //   when(booksService.deleteBooksById(anyLong())).thenReturn(returnBooks);

// when
//ResponseEntity<Books>controllerReturnBook = booksOperation.deleteBooksById(id);

// then
if(returnBooks != null) {
  //assertThat(controllerReturnBook.getBody().getId()).isEqualTo(returnBooks.getId());
 // assertThat(controllerReturnBook.getBody().getId()).isEqualTo(id);
  //assertThat(controllerReturnBook.getStatusCode()).isEqualTo(HttpStatus.OK);
} else {
  //assertThat(controllerReturnBook.getStatusCode()).isEqualTo(HttpStatus.NO_CONTENT);
}
  }

 //@Test
  void testCaseForDeleteBookById() {
    testDeleteBookById(1l, null);
  //  testDeleteBookById(2l,
  //  new Books(2l, "Vincent Book", LocalDate.of(2000, 1, 20), new Authors()));

  }
}
