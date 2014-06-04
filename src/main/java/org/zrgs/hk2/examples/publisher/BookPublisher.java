package org.zrgs.hk2.examples.publisher;

import org.zrgs.hk2.examples.author.PublishedAuthor;
import org.zrgs.hk2.examples.book.PublishedBook;

import org.jvnet.hk2.annotations.Contract;

import java.util.List;

/**
 * @author glick
 */
@SuppressWarnings("UnusedDeclaration")
@Contract
public interface BookPublisher
{
  List<PublishedBook> getPublishedBooks();

  void setPublishedBooks(List<PublishedBook> publishedBooks);

  void addPublishedBook(PublishedBook publishedBook);

  List<PublishedAuthor> getPublishedAuthors();

  void setPublishedAuthors(List<PublishedAuthor> publishedAuthors);

  void addPublishedAuthor(PublishedAuthor publishedAuthor);
}
