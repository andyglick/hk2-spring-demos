package org.zrgs.hk2.examples.color;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.assertj.core.api.Assertions;

import org.zrgs.hk2.examples.color.domain.RedColor;

import org.jvnet.hk2.testing.junit.HK2Runner;

import javax.inject.Inject;

/**
 * @author glick
 */
public class ColorTest extends HK2Runner
{
  @Inject
  RedColor redColor;

  @Test
  public void testColorInjection()
  {
    Assertions.assertThat(redColor).isNotNull();
  }
}
