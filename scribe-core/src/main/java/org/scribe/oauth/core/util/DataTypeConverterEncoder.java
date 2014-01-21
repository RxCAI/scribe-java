package org.scribe.oauth.core.util;

import javax.xml.bind.DatatypeConverter;

public class DataTypeConverterEncoder extends Base64Encoder
{
  @Override
  public String encode(byte[] bytes)
  {
    return DatatypeConverter.printBase64Binary(bytes);
  }

  @Override
  public String getType()
  {
    return "DatatypeConverter";
  }
}
