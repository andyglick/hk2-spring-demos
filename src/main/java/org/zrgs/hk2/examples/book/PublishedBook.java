package org.zrgs.hk2.examples.book;

import org.zrgs.hk2.examples.author.PublishedAuthor;

import org.jvnet.hk2.annotations.Contract;

import java.util.List;

/**
 * @author glick
 */
@Contract
public interface PublishedBook
{
  String getBookTitle();

  void setBookTitle(String bookTitle);

  List<PublishedAuthor> getPublishedAuthors();

  void setPublishedAuthors(List<PublishedAuthor> publishedAuthors);

  void addPublishedAuthor(PublishedAuthor publishedAuthor);
}
