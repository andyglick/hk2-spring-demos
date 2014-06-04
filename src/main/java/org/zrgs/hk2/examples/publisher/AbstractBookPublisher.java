package org.zrgs.hk2.examples.publisher;

import org.zrgs.hk2.examples.author.PublishedAuthor;
import org.zrgs.hk2.examples.book.PublishedBook;

import com.google.common.collect.ImmutableList;

import java.util.ArrayList;
import java.util.List;

/**
 * @author glick
 */
@SuppressWarnings("UnusedDeclaration")
public class AbstractBookPublisher implements BookPublisher
{
  String publisherName;

  List<PublishedBook> publishedBooks = new ArrayList<>();
  List<PublishedAuthor> publishedAuthors = new ArrayList<>();

  @Override
  public List<PublishedBook> getPublishedBooks()
  {
    ImmutableList<PublishedBook> immutablePublishedBooks = ImmutableList.copyOf(publishedBooks);
    return immutablePublishedBooks;
  }

  @Override
  public void setPublishedBooks(List<PublishedBook> publishedBooks)
  {
    this.publishedBooks = publishedBooks;
  }

  @Override
  public void addPublishedBook(PublishedBook publishedBook)
  {
    publishedBooks.add(publishedBook);
  }

  @Override
  public List<PublishedAuthor> getPublishedAuthors()
  {
    ImmutableList<PublishedAuthor> immutableAuthorList = ImmutableList.copyOf(publishedAuthors);
    return publishedAuthors;
  }

  @Override
  public void setPublishedAuthors(List<PublishedAuthor> publishedAuthors)
  {
    this.publishedAuthors = publishedAuthors;
  }

  @Override
  public void addPublishedAuthor(PublishedAuthor publishedAuthor)
  {
    publishedAuthors.add(publishedAuthor);
  }
}
