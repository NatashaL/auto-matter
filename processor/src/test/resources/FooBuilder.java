package foo;

import java.util.Arrays;

import javax.annotation.Generated;

@Generated("io.norberg.automatter.processor.AutoMatterProcessor")
public final class FooBuilder {

  private boolean aBoolean;
  private byte aByte;
  private short aShort;
  private int aInt;
  private long aLong;
  private char aChar;
  private float aFloat;
  private double aDouble;
  private Object object;
  private Object[] array;

  public FooBuilder() {
  }

  private FooBuilder(Foo v) {
    this.aBoolean = v.aBoolean();
    this.aByte = v.aByte();
    this.aShort = v.aShort();
    this.aInt = v.aInt();
    this.aLong = v.aLong();
    this.aChar = v.aChar();
    this.aFloat = v.aFloat();
    this.aDouble = v.aDouble();
    this.object = v.object();
    this.array = v.array();
  }

  private FooBuilder(FooBuilder v) {
    this.aBoolean = v.aBoolean;
    this.aByte = v.aByte;
    this.aShort = v.aShort;
    this.aInt = v.aInt;
    this.aLong = v.aLong;
    this.aChar = v.aChar;
    this.aFloat = v.aFloat;
    this.aDouble = v.aDouble;
    this.object = v.object;
    this.array = v.array;
  }

  public FooBuilder aBoolean(boolean aBoolean) {
    this.aBoolean = aBoolean;
    return this;
  }

  public FooBuilder aByte(byte aByte) {
    this.aByte = aByte;
    return this;
  }

  public FooBuilder aShort(short aShort) {
    this.aShort = aShort;
    return this;
  }

  public FooBuilder aInt(int aInt) {
    this.aInt = aInt;
    return this;
  }

  public FooBuilder aLong(long aLong) {
    this.aLong = aLong;
    return this;
  }

  public FooBuilder aChar(char aChar) {
    this.aChar = aChar;
    return this;
  }

  public FooBuilder aFloat(float aFloat) {
    this.aFloat = aFloat;
    return this;
  }

  public FooBuilder aDouble(double aDouble) {
    this.aDouble = aDouble;
    return this;
  }

  public FooBuilder object(Object object) {
    this.object = object;
    return this;
  }

  public FooBuilder array(Object[] array) {
    this.array = array;
    return this;
  }

  public Foo build() {
    return new Value(
        aBoolean,
        aByte,
        aShort,
        aInt,
        aLong,
        aChar,
        aFloat,
        aDouble,
        object,
        array);
  }

  public static FooBuilder from(Foo v) {
    return new FooBuilder(v);
  }

  public static FooBuilder from(FooBuilder v) {
    return new FooBuilder(v);
  }

  private static final class Value
      implements Foo {

    private final boolean aBoolean;
    private final byte aByte;
    private final short aShort;
    private final int aInt;
    private final long aLong;
    private final char aChar;
    private final float aFloat;
    private final double aDouble;
    private final Object object;
    private final Object[] array;

    private Value(
        @io.norberg.automatter.AutoMatterField("aBoolean") boolean aBoolean,
        @io.norberg.automatter.AutoMatterField("aByte") byte aByte,
        @io.norberg.automatter.AutoMatterField("aShort") short aShort,
        @io.norberg.automatter.AutoMatterField("aInt") int aInt,
        @io.norberg.automatter.AutoMatterField("aLong") long aLong,
        @io.norberg.automatter.AutoMatterField("aChar") char aChar,
        @io.norberg.automatter.AutoMatterField("aFloat") float aFloat,
        @io.norberg.automatter.AutoMatterField("aDouble") double aDouble,
        @io.norberg.automatter.AutoMatterField("object") Object object,
        @io.norberg.automatter.AutoMatterField("array") Object[] array
    ) {
      this.aBoolean = aBoolean;
      this.aByte = aByte;
      this.aShort = aShort;
      this.aInt = aInt;
      this.aLong = aLong;
      this.aChar = aChar;
      this.aFloat = aFloat;
      this.aDouble = aDouble;
      this.object = object;
      this.array = array;
    }

    @io.norberg.automatter.AutoMatterField
    @Override
    public boolean aBoolean() {
      return aBoolean;
    }

    @io.norberg.automatter.AutoMatterField
    @Override
    public byte aByte() {
      return aByte;
    }

    @io.norberg.automatter.AutoMatterField
    @Override
    public short aShort() {
      return aShort;
    }

    @io.norberg.automatter.AutoMatterField
    @Override
    public int aInt() {
      return aInt;
    }

    @io.norberg.automatter.AutoMatterField
    @Override
    public long aLong() {
      return aLong;
    }

    @io.norberg.automatter.AutoMatterField
    @Override
    public char aChar() {
      return aChar;
    }

    @io.norberg.automatter.AutoMatterField
    @Override
    public float aFloat() {
      return aFloat;
    }

    @io.norberg.automatter.AutoMatterField
    @Override
    public double aDouble() {
      return aDouble;
    }

    @io.norberg.automatter.AutoMatterField
    @Override
    public Object object() {
      return object;
    }

    @io.norberg.automatter.AutoMatterField
    @Override
    public Object[] array() {
      return array;
    }

    @Override
    public FooBuilder builder() {
      return new FooBuilder(this);
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (!(o instanceof Foo)) {
        return false;
      }

      final Foo that = (Foo) o;

      if (aBoolean != that.aBoolean()) {
        return false;
      }
      if (aByte != that.aByte()) {
        return false;
      }
      if (aShort != that.aShort()) {
        return false;
      }
      if (aInt != that.aInt()) {
        return false;
      }
      if (aLong != that.aLong()) {
        return false;
      }
      if (aChar != that.aChar()) {
        return false;
      }
      if (Float.compare(that.aFloat(), aFloat) != 0) {
        return false;
      }
      if (Double.compare(that.aDouble(), aDouble) != 0) {
        return false;
      }
      if (object != null ? !object.equals(that.object()) : that.object() != null) {
        return false;
      }
      if (!Arrays.equals(array, that.array())) {
        return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      long temp;

      result = 31 * result + (aBoolean ? 1231 : 1237);
      result = 31 * result + (int) aByte;
      result = 31 * result + (int) aShort;
      result = 31 * result + aInt;
      result = 31 * result + (int) (aLong ^ (aLong >>> 32));
      result = 31 * result + (int) aChar;
      result = 31 * result + (aFloat != +0.0f ? Float.floatToIntBits(aFloat) : 0);
      temp = Double.doubleToLongBits(aDouble);
      result = 31 * result + (int) (temp ^ (temp >>> 32));
      result = 31 * result + (object != null ? object.hashCode() : 0);
      result = 31 * result + (array != null ? Arrays.hashCode(array) : 0);
      return result;
    }

    @Override
    public String toString() {
      return "Foo{" +
             "aBoolean=" + aBoolean +
             ", aByte=" + aByte +
             ", aShort=" + aShort +
             ", aInt=" + aInt +
             ", aLong=" + aLong +
             ", aChar=" + aChar +
             ", aFloat=" + aFloat +
             ", aDouble=" + aDouble +
             ", object=" + object +
             ", array=" + Arrays.toString(array) +
             '}';
    }
  }
}