/*
 * This file was automatically generated by EvoSuite
 * Thu Mar 27 22:29:49 GMT 2025
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.field.LenientDateTimeField;
import org.joda.time.field.OffsetDateTimeField;
import org.joda.time.field.SkipDateTimeField;
import org.joda.time.field.UnsupportedDateTimeField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SkipDateTimeField_ESTest extends SkipDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.minuteOfDay();
      SkipDateTimeField skipDateTimeField0 = new SkipDateTimeField(islamicChronology0, dateTimeField0);
      int int0 = skipDateTimeField0.get(1L);
      assertEquals((-1), int0);
      assertEquals(1, skipDateTimeField0.getMinimumValue());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.weekOfWeekyear();
      SkipDateTimeField skipDateTimeField0 = new SkipDateTimeField(iSOChronology0, dateTimeField0);
      long long0 = skipDateTimeField0.set(0L, 1);
      assertEquals(1, skipDateTimeField0.getMinimumValue());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.millisOfDay();
      SkipDateTimeField skipDateTimeField0 = new SkipDateTimeField(buddhistChronology0, dateTimeField0);
      long long0 = skipDateTimeField0.set((-3L), 86399997);
      assertEquals((-3L), long0);
      assertEquals(1, skipDateTimeField0.getMinimumValue());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      SkipDateTimeField skipDateTimeField0 = new SkipDateTimeField((Chronology) null, dateTimeField0, 630);
      int int0 = skipDateTimeField0.getMinimumValue();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.yearOfEra();
      SkipDateTimeField skipDateTimeField0 = new SkipDateTimeField(ethiopicChronology0, dateTimeField0, 764);
      int int0 = skipDateTimeField0.getMinimumValue();
      assertEquals((-292268512), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.yearOfEra();
      SkipDateTimeField skipDateTimeField0 = new SkipDateTimeField(ethiopicChronology0, dateTimeField0, 764);
      int int0 = skipDateTimeField0.get((-79240032000001L));
      assertEquals(0, int0);
      assertEquals((-292268512), skipDateTimeField0.getMinimumValue());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfMonth();
      LenientDateTimeField lenientDateTimeField0 = new LenientDateTimeField(dateTimeField0, (Chronology) null);
      SkipDateTimeField skipDateTimeField0 = new SkipDateTimeField((Chronology) null, lenientDateTimeField0, (-389));
      // Undeclared exception!
      try { 
        skipDateTimeField0.set((long) (-389), 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.field.LenientDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      DurationField durationField0 = buddhistChronology0.seconds();
      UnsupportedDateTimeField unsupportedDateTimeField0 = UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField0);
      SkipDateTimeField skipDateTimeField0 = null;
      try {
        skipDateTimeField0 = new SkipDateTimeField(buddhistChronology0, unsupportedDateTimeField0, 401);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // yearOfEra field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      SkipDateTimeField skipDateTimeField0 = null;
      try {
        skipDateTimeField0 = new SkipDateTimeField(buddhistChronology0, (DateTimeField) null, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field must not be null
         //
         verifyException("org.joda.time.field.DelegatedDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      DurationField durationField0 = buddhistChronology0.millis();
      UnsupportedDateTimeField unsupportedDateTimeField0 = UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField0);
      SkipDateTimeField skipDateTimeField0 = null;
      try {
        skipDateTimeField0 = new SkipDateTimeField(copticChronology0, unsupportedDateTimeField0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // era field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) null);
      SkipDateTimeField skipDateTimeField0 = null;
      try {
        skipDateTimeField0 = new SkipDateTimeField(copticChronology0, (DateTimeField) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field must not be null
         //
         verifyException("org.joda.time.field.DelegatedDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.era();
      SkipDateTimeField skipDateTimeField0 = new SkipDateTimeField(copticChronology0, dateTimeField0, 1);
      assertEquals(2, skipDateTimeField0.getMinimumValue());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.yearOfEra();
      SkipDateTimeField skipDateTimeField0 = new SkipDateTimeField(iSOChronology0, dateTimeField0, 292272992);
      // Undeclared exception!
      try { 
        skipDateTimeField0.set((-79240031999999L), 292272992);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 292272992 for year is not supported
         //
         verifyException("org.joda.time.field.SkipDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.ofHours(0);
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.hourOfHalfday();
      SkipDateTimeField skipDateTimeField0 = new SkipDateTimeField(iSOChronology0, dateTimeField0, 292272992);
      long long0 = skipDateTimeField0.set((long) 1, 1);
      assertEquals(7200001L, long0);
      assertEquals((-1), skipDateTimeField0.getMinimumValue());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.halfdayOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      OffsetDateTimeField offsetDateTimeField0 = new OffsetDateTimeField(dateTimeField0, dateTimeFieldType0, 1);
      SkipDateTimeField skipDateTimeField0 = new SkipDateTimeField((Chronology) null, offsetDateTimeField0);
      int int0 = skipDateTimeField0.get(1);
      assertEquals(1, skipDateTimeField0.getMinimumValue());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.halfdayOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      OffsetDateTimeField offsetDateTimeField0 = new OffsetDateTimeField(dateTimeField0, dateTimeFieldType0, 1);
      SkipDateTimeField skipDateTimeField0 = new SkipDateTimeField((Chronology) null, offsetDateTimeField0);
      int int0 = skipDateTimeField0.getMinimumValue();
      assertEquals(1, int0);
  }
}
