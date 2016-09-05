package griffio;

import com.google.common.truth.Truth;
import griffio.geo.Coordinates;
import org.junit.Test;

public class Tests {

  @Test
  public void expect_thrift() {
    Truth.assertThat(new Coordinates(-34.252229, -58.829800).setElevation(-0.1)).isNotNull();
  }
}
