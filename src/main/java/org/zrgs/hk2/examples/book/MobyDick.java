package org.zrgs.hk2.examples.book;

import org.jvnet.hk2.annotations.Service;

import javax.inject.Named;

/**
 * @author glick
 */
@Service
@Named
public class MobyDick extends AbstractPublishedBook implements PublishedBook
{
}
