package org.zrgs.hk2.examples.book;

import org.zrgs.hk2.examples.author.PublishedAuthor;

import com.google.common.collect.ImmutableList;

import java.util.ArrayList;
import java.util.List;

/**
 * @author glick
 */
public class AbstractPublishedBook implements PublishedBook
{
  String bookTitle;

  List<PublishedAuthor> publishedAuthors = new ArrayList<>();

  @Override
  public String getBookTitle()
  {
    return bookTitle;
  }

  @Override
  public void setBookTitle(String bookTitle)
  {
    this.bookTitle = bookTitle;
  }

  @Override
  public List<PublishedAuthor> getPublishedAuthors()
  {
    ImmutableList<PublishedAuthor> immutableAuthors = ImmutableList.copyOf(publishedAuthors);
    return immutableAuthors;
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
