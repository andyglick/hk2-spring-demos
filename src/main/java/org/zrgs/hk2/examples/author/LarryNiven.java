package org.zrgs.hk2.examples.author;

import org.jvnet.hk2.annotations.Service;

import javax.inject.Named;

/**
 * @author glick
 */
@Service
@Named
public class LarryNiven extends AbstractPublishedAuthor implements PublishedAuthor
{
}
