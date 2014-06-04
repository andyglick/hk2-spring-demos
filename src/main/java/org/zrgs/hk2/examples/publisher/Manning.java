package org.zrgs.hk2.examples.publisher;

import org.jvnet.hk2.annotations.Service;

import javax.inject.Named;

/**
 * @author glick
 */
@SuppressWarnings("UnusedDeclaration")
@Service
@Named
public class Manning extends AbstractBookPublisher implements BookPublisher
{

}
