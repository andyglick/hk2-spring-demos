package org.zrgs.hk2.examples.color.service;

import org.zrgs.hk2.examples.color.Blue;
import org.zrgs.hk2.examples.color.Color;
import org.zrgs.hk2.examples.color.Red;
import org.zrgs.hk2.examples.color.Yellow;

import org.jvnet.hk2.annotations.Service;

import javax.inject.Inject;
import javax.inject.Provider;

/**
 * @author glick
 */
@Service
public class ColorMixer {
  @Inject
  @Red
  private Provider<Color> redProvider;

  @Inject
  @Blue
  private Provider<Color> blueProvider;

  @Inject
  @Yellow
  private Provider<Color> yellowProvider;

  public Color mix(Color aColor, Color... otherColors)
  {
    return null;
  }

  public Color fetchPurpleMixture()
  {
    return mix(redProvider.get(), blueProvider.get());
  }
}
