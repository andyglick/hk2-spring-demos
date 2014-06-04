package org.zrgs.hk2.examples.author;

import org.zrgs.hk2.examples.book.PublishedBook;

import com.google.common.collect.ImmutableList;

import java.util.ArrayList;
import java.util.List;

/**
 * @author glick
 */
public class AbstractPublishedAuthor implements PublishedAuthor
{
  String authorName;

  @Override
  public String getAuthorName()
  {
    return authorName;
  }

  @Override
  public void setAuthorName(String authorName)
  {
    this.authorName = authorName;
  }

  List<PublishedBook> publishedBooks = new ArrayList<>();

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
}
