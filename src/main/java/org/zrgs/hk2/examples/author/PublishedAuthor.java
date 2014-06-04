package org.zrgs.hk2.examples.author;

import org.zrgs.hk2.examples.book.PublishedBook;

import org.jvnet.hk2.annotations.Contract;

import java.util.List;

/**
 * @author glick
 */
@Contract
public interface PublishedAuthor
{
  String getAuthorName();

  void setAuthorName(String authorName);

  List<PublishedBook> getPublishedBooks();

  void setPublishedBooks(List<PublishedBook> publishedBooks);

  void addPublishedBook(PublishedBook publishedBook);
}
