package org.zrgs.hk2.examples.publisher;

import org.jvnet.hk2.annotations.Service;

import javax.inject.Named;

/**
 * @author glick
 */
@Service
@Named
public class Elsevier extends AbstractBookPublisher implements BookPublisher
{
}
