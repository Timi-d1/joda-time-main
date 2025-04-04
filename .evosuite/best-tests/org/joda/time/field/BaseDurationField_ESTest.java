/*
 * This file was automatically generated by EvoSuite
 * Thu Mar 27 23:09:01 GMT 2025
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.Months;
import org.joda.time.Period;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.Years;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.field.DecoratedDurationField;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.PreciseDurationField;
import org.joda.time.field.ScaledDurationField;
import org.joda.time.field.UnsupportedDurationField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BaseDurationField_ESTest extends BaseDurationField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.weeks();
      Hours hours0 = Hours.TWO;
      DurationFieldType durationFieldType0 = hours0.getFieldType();
      DecoratedDurationField decoratedDurationField0 = new DecoratedDurationField(durationField0, durationFieldType0);
      long long0 = decoratedDurationField0.getValueAsLong((long) 1);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Years years0 = Years.ONE;
      DurationFieldType durationFieldType0 = years0.getFieldType();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 63072000000L);
      long long0 = preciseDurationField0.getValueAsLong(63072000000L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.centuries();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, (-171L));
      DecoratedDurationField decoratedDurationField0 = new DecoratedDurationField(preciseDurationField0, durationFieldType0);
      long long0 = decoratedDurationField0.getValueAsLong(3600L);
      assertEquals((-21L), long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Period period0 = new Period((-1L));
      Weeks weeks0 = Weeks.standardWeeksIn(period0);
      DurationFieldType durationFieldType0 = weeks0.getFieldType();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 31622400000L);
      int int0 = preciseDurationField0.getValue((-2015L), (-2015L));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.hours();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, (-3540L));
      DecoratedDurationField decoratedDurationField0 = new DecoratedDurationField(preciseDurationField0, durationFieldType0);
      int int0 = decoratedDurationField0.getValue((-3540L), (-3540L));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.months();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getRangeDurationType();
      DecoratedDurationField decoratedDurationField0 = new DecoratedDurationField(durationField0, durationFieldType0);
      int int0 = decoratedDurationField0.getValue((-42521587200000L), 7L);
      assertEquals((-16169), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.hours();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, (-3540L));
      DecoratedDurationField decoratedDurationField0 = new DecoratedDurationField(preciseDurationField0, durationFieldType0);
      int int0 = decoratedDurationField0.getValue(0L);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Hours hours0 = Hours.THREE;
      DurationFieldType durationFieldType0 = hours0.getFieldType();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, (-1364L));
      int int0 = preciseDurationField0.getValue((-1364L));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.centuries();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, (-171L));
      int int0 = preciseDurationField0.getValue(845L);
      assertEquals((-4), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 2065L);
      long long0 = preciseDurationField0.getMillis(2065L);
      assertEquals(4264225L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.hours();
      DurationFieldType durationFieldType0 = DurationFieldType.years();
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(durationField0, durationFieldType0, 19);
      long long0 = scaledDurationField0.getMillis((-541L));
      assertEquals((-37004400000L), long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Hours hours0 = Hours.MIN_VALUE;
      DurationFieldType durationFieldType0 = hours0.getFieldType();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 1998L);
      long long0 = preciseDurationField0.getMillis(0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.months();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 2244L);
      long long0 = preciseDurationField0.getMillis((-102));
      assertEquals((-228888L), long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.months();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 2244L);
      int int0 = preciseDurationField0.getDifference(2244L, 2095L);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Months months0 = Months.MAX_VALUE;
      DurationFieldType durationFieldType0 = months0.getFieldType();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, (-1L));
      int int0 = preciseDurationField0.getDifference((-1L), 1220L);
      assertEquals(1221, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 1L);
      int int0 = preciseDurationField0.getDifference(1L, 1305L);
      assertEquals((-1304), int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.months();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, (-4294L));
      // Undeclared exception!
      try { 
        preciseDurationField0.getValue(8971139232000000L, (long) (-1));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Value cannot fit in an int: -2089226649278
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.eras();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 0L);
      // Undeclared exception!
      try { 
        preciseDurationField0.getValue((-5119L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.joda.time.field.BaseDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.weeks();
      DurationFieldType durationFieldType0 = DurationFieldType.weeks();
      ScaledDurationField scaledDurationField0 = new ScaledDurationField(durationField0, durationFieldType0, 2146051992);
      // Undeclared exception!
      try { 
        scaledDurationField0.getMillis((-65L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows a long: -139493379480 * 604800000
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.hours();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 0L);
      // Undeclared exception!
      try { 
        preciseDurationField0.getDifference((-1341L), 2226L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.joda.time.field.PreciseDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.seconds();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 1404L);
      // Undeclared exception!
      try { 
        preciseDurationField0.getDifference((-1650L), 102874060800000L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Value cannot fit in an int: -73272123078
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.hours();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, (-2783L));
      // Undeclared exception!
      try { 
        preciseDurationField0.compareTo((DurationField) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.field.BaseDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.weeks();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 0L);
      String string0 = preciseDurationField0.getName();
      assertEquals("weeks", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.seconds();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 2880L);
      boolean boolean0 = preciseDurationField0.isSupported();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getRangeDurationType();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 0L);
      DurationFieldType durationFieldType1 = preciseDurationField0.getType();
      assertSame(durationFieldType0, durationFieldType1);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Seconds seconds0 = Seconds.seconds(0);
      DurationFieldType durationFieldType0 = seconds0.getFieldType();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 0);
      // Undeclared exception!
      try { 
        preciseDurationField0.getValueAsLong((long) 0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.joda.time.field.BaseDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.seconds();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 1404L);
      UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
      int int0 = preciseDurationField0.compareTo((DurationField) unsupportedDurationField0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.hours();
      DurationFieldType durationFieldType0 = DurationFieldType.minutes();
      DecoratedDurationField decoratedDurationField0 = new DecoratedDurationField(durationField0, durationFieldType0);
      int int0 = decoratedDurationField0.compareTo(durationField0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, (-4320L));
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.seconds();
      int int0 = preciseDurationField0.compareTo(durationField0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      DecoratedDurationField decoratedDurationField0 = null;
      try {
        decoratedDurationField0 = new DecoratedDurationField(millisDurationField0, (DurationFieldType) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The type must not be null
         //
         verifyException("org.joda.time.field.BaseDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getRangeDurationType();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 0L);
      // Undeclared exception!
      try { 
        preciseDurationField0.getValue(0L, 0L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.joda.time.field.PreciseDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.hours();
      DurationFieldType durationFieldType0 = DurationFieldType.minutes();
      DecoratedDurationField decoratedDurationField0 = new DecoratedDurationField(durationField0, durationFieldType0);
      // Undeclared exception!
      try { 
        decoratedDurationField0.getDifference((-9223372036854775808L), 0L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The minuend instant is below the supported minimum of 0001-01-01T00:00:00.000Z (BuddhistChronology[UTC])
         //
         verifyException("org.joda.time.chrono.LimitChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.days();
      DurationFieldType durationFieldType0 = DurationFieldType.centuries();
      DecoratedDurationField decoratedDurationField0 = new DecoratedDurationField(durationField0, durationFieldType0);
      long long0 = decoratedDurationField0.getMillis(1);
      assertEquals(86400000L, long0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.minutes();
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      DecoratedDurationField decoratedDurationField0 = new DecoratedDurationField(durationField0, durationFieldType0);
      long long0 = decoratedDurationField0.getMillis((long) 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.days();
      DurationFieldType durationFieldType0 = DurationFieldType.centuries();
      DecoratedDurationField decoratedDurationField0 = new DecoratedDurationField(durationField0, durationFieldType0);
      String string0 = decoratedDurationField0.toString();
      assertEquals("DurationField[centuries]", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.centuries();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 189L);
      // Undeclared exception!
      try { 
        preciseDurationField0.getValue(1000000000000L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Value cannot fit in an int: 5291005291
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }
}
