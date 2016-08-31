package griffio;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class Tests {

  @Test
  public void expect_b() {
    Hello pants = new Hello("Pants");
    assertThat(pants.toString()).contains("s");
  }
}
