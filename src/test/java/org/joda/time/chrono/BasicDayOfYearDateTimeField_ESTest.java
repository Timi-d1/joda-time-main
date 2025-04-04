/*
 * This file was automatically generated by EvoSuite
 * Thu Mar 27 22:52:05 GMT 2025
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.MonthDay;
import org.joda.time.ReadablePartial;
import org.joda.time.Years;
import org.joda.time.chrono.BasicChronology;
import org.joda.time.chrono.BasicDayOfYearDateTimeField;
import org.joda.time.chrono.BasicYearDateTimeField;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.PreciseDurationField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BasicDayOfYearDateTimeField_ESTest extends BasicDayOfYearDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DurationField durationField0 = copticChronology0.hours();
      BasicDayOfYearDateTimeField basicDayOfYearDateTimeField0 = new BasicDayOfYearDateTimeField(copticChronology0, durationField0);
      int int0 = basicDayOfYearDateTimeField0.getMaximumValueForSet((-1591L), 365);
      assertEquals(365, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      BasicDayOfYearDateTimeField basicDayOfYearDateTimeField0 = new BasicDayOfYearDateTimeField(copticChronology0, millisDurationField0);
      // Undeclared exception!
      try { 
        basicDayOfYearDateTimeField0.isLeap((-9223372036854775808L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The instant is below the supported minimum of 0001-01-01T00:00:00.000Z (CopticChronology[UTC])
         //
         verifyException("org.joda.time.chrono.LimitChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      BasicDayOfYearDateTimeField basicDayOfYearDateTimeField0 = new BasicDayOfYearDateTimeField((BasicChronology) null, millisDurationField0);
      // Undeclared exception!
      try { 
        basicDayOfYearDateTimeField0.isLeap(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.BasicDayOfYearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Years years0 = Years.TWO;
      DurationFieldType durationFieldType0 = years0.getFieldType();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 2102L);
      BasicDayOfYearDateTimeField basicDayOfYearDateTimeField0 = new BasicDayOfYearDateTimeField((BasicChronology) null, preciseDurationField0);
      // Undeclared exception!
      try { 
        basicDayOfYearDateTimeField0.getRangeDurationField();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.BasicDayOfYearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DurationField durationField0 = copticChronology0.millis();
      BasicDayOfYearDateTimeField basicDayOfYearDateTimeField0 = new BasicDayOfYearDateTimeField((BasicChronology) null, durationField0);
      // Undeclared exception!
      try { 
        basicDayOfYearDateTimeField0.getMaximumValueForSet(0L, (-708));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.BasicDayOfYearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      BasicDayOfYearDateTimeField basicDayOfYearDateTimeField0 = new BasicDayOfYearDateTimeField(gregorianChronology0, millisDurationField0);
      int[] intArray0 = new int[1];
      // Undeclared exception!
      try { 
        basicDayOfYearDateTimeField0.getMaximumValue((ReadablePartial) null, intArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.BasicDayOfYearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      BasicDayOfYearDateTimeField basicDayOfYearDateTimeField0 = new BasicDayOfYearDateTimeField(gregorianChronology0, millisDurationField0);
      LocalDate localDate0 = new LocalDate((Object) null);
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        basicDayOfYearDateTimeField0.getMaximumValue((ReadablePartial) localDate0, intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.joda.time.chrono.BasicDayOfYearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      BasicDayOfYearDateTimeField basicDayOfYearDateTimeField0 = new BasicDayOfYearDateTimeField(gregorianChronology0, millisDurationField0);
      // Undeclared exception!
      try { 
        basicDayOfYearDateTimeField0.getMaximumValue((ReadablePartial) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.BasicDayOfYearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DurationField durationField0 = copticChronology0.seconds();
      BasicDayOfYearDateTimeField basicDayOfYearDateTimeField0 = new BasicDayOfYearDateTimeField((BasicChronology) null, durationField0);
      // Undeclared exception!
      try { 
        basicDayOfYearDateTimeField0.getMaximumValue((long) 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.BasicDayOfYearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DurationField durationField0 = copticChronology0.minutes();
      BasicDayOfYearDateTimeField basicDayOfYearDateTimeField0 = new BasicDayOfYearDateTimeField((BasicChronology) null, durationField0);
      // Undeclared exception!
      try { 
        basicDayOfYearDateTimeField0.getMaximumValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.BasicDayOfYearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      BasicDayOfYearDateTimeField basicDayOfYearDateTimeField0 = new BasicDayOfYearDateTimeField((BasicChronology) null, millisDurationField0);
      // Undeclared exception!
      try { 
        basicDayOfYearDateTimeField0.get(0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.BasicDayOfYearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      BasicDayOfYearDateTimeField basicDayOfYearDateTimeField0 = null;
      try {
        basicDayOfYearDateTimeField0 = new BasicDayOfYearDateTimeField(ethiopicChronology0, (DurationField) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.field.PreciseDurationDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null);
      DurationFieldType durationFieldType0 = DurationFieldType.weekyears();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, (-12219292800000L));
      BasicDayOfYearDateTimeField basicDayOfYearDateTimeField0 = null;
      try {
        basicDayOfYearDateTimeField0 = new BasicDayOfYearDateTimeField(julianChronology0, preciseDurationField0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The unit milliseconds must be at least 1
         //
         verifyException("org.joda.time.field.PreciseDurationDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      BasicYearDateTimeField basicYearDateTimeField0 = new BasicYearDateTimeField(ethiopicChronology0);
      DurationField durationField0 = basicYearDateTimeField0.getLeapDurationField();
      BasicDayOfYearDateTimeField basicDayOfYearDateTimeField0 = new BasicDayOfYearDateTimeField(ethiopicChronology0, durationField0);
      int int0 = basicDayOfYearDateTimeField0.getMaximumValue(0L);
      assertEquals(365, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      BasicDayOfYearDateTimeField basicDayOfYearDateTimeField0 = new BasicDayOfYearDateTimeField(ethiopicChronology0, millisDurationField0);
      int int0 = basicDayOfYearDateTimeField0.getMinimumValue();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      BasicDayOfYearDateTimeField basicDayOfYearDateTimeField0 = new BasicDayOfYearDateTimeField(gregorianChronology0, millisDurationField0);
      int int0 = basicDayOfYearDateTimeField0.getMaximumValueForSet(365, 0);
      assertEquals(365, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      BasicDayOfYearDateTimeField basicDayOfYearDateTimeField0 = new BasicDayOfYearDateTimeField(copticChronology0, millisDurationField0);
      LocalDateTime localDateTime0 = new LocalDateTime((Object) null, copticChronology0);
      int[] intArray0 = new int[7];
      int int0 = basicDayOfYearDateTimeField0.getMaximumValue((ReadablePartial) localDateTime0, intArray0);
      assertEquals(365, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      BasicDayOfYearDateTimeField basicDayOfYearDateTimeField0 = new BasicDayOfYearDateTimeField(ethiopicChronology0, millisDurationField0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      MonthDay monthDay0 = MonthDay.now(dateTimeZone0);
      int[] intArray0 = new int[7];
      int int0 = basicDayOfYearDateTimeField0.getMaximumValue((ReadablePartial) monthDay0, intArray0);
      assertEquals(366, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      BasicDayOfYearDateTimeField basicDayOfYearDateTimeField0 = new BasicDayOfYearDateTimeField(copticChronology0, millisDurationField0);
      LocalDateTime localDateTime0 = new LocalDateTime((Object) null, copticChronology0);
      int int0 = basicDayOfYearDateTimeField0.getMaximumValue((ReadablePartial) localDateTime0);
      assertEquals(365, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      BasicDayOfYearDateTimeField basicDayOfYearDateTimeField0 = new BasicDayOfYearDateTimeField(ethiopicChronology0, millisDurationField0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      MonthDay monthDay0 = MonthDay.now(dateTimeZone0);
      int int0 = basicDayOfYearDateTimeField0.getMaximumValue((ReadablePartial) monthDay0);
      assertEquals(366, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      BasicYearDateTimeField basicYearDateTimeField0 = new BasicYearDateTimeField(copticChronology0);
      DurationField durationField0 = basicYearDateTimeField0.getLeapDurationField();
      BasicDayOfYearDateTimeField basicDayOfYearDateTimeField0 = new BasicDayOfYearDateTimeField(gregorianChronology0, durationField0);
      boolean boolean0 = basicDayOfYearDateTimeField0.isLeap(1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      BasicDayOfYearDateTimeField basicDayOfYearDateTimeField0 = new BasicDayOfYearDateTimeField(gregorianChronology0, millisDurationField0);
      int int0 = basicDayOfYearDateTimeField0.getMaximumValue();
      assertEquals(366, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      BasicDayOfYearDateTimeField basicDayOfYearDateTimeField0 = new BasicDayOfYearDateTimeField(gregorianChronology0, millisDurationField0);
      DurationField durationField0 = basicDayOfYearDateTimeField0.getRangeDurationField();
      assertNotNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      BasicYearDateTimeField basicYearDateTimeField0 = new BasicYearDateTimeField(copticChronology0);
      DurationField durationField0 = basicYearDateTimeField0.getLeapDurationField();
      BasicDayOfYearDateTimeField basicDayOfYearDateTimeField0 = new BasicDayOfYearDateTimeField(gregorianChronology0, durationField0);
      int int0 = basicDayOfYearDateTimeField0.getMaximumValueForSet(1, 594);
      assertEquals(365, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      BasicYearDateTimeField basicYearDateTimeField0 = new BasicYearDateTimeField(copticChronology0);
      DurationField durationField0 = basicYearDateTimeField0.getLeapDurationField();
      BasicDayOfYearDateTimeField basicDayOfYearDateTimeField0 = new BasicDayOfYearDateTimeField(gregorianChronology0, durationField0);
      int int0 = basicDayOfYearDateTimeField0.get(365);
      assertEquals(1, int0);
  }
}
