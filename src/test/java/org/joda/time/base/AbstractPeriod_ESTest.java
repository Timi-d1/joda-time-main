/*
 * This file was automatically generated by EvoSuite
 * Thu Mar 27 22:09:44 GMT 2025
 */

package org.joda.time.base;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Interval;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.Seconds;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodParser;
import org.joda.time.format.PeriodPrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractPeriod_ESTest extends AbstractPeriod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(0, 17, 17, 93);
      mutablePeriod0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Period period0 = Period.months(2435);
      Period period1 = period0.minusYears(483);
      MutablePeriod mutablePeriod0 = new MutablePeriod(0, 310, 2384, 483, 483, 690, 27, 521);
      boolean boolean0 = period1.equals(mutablePeriod0);
      assertFalse(period1.equals((Object)period0));
      assertFalse(period0.equals((Object)period1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((-2611L), (-2611L));
      Period period0 = mutablePeriod0.toPeriod();
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(periodPrinter0).calculatePrintedLength(any(org.joda.time.ReadablePeriod.class) , any(java.util.Locale.class));
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, (PeriodParser) null);
      String string0 = period0.toString(periodFormatter0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Period period0 = Period.weeks(0);
      String string0 = period0.toString();
      assertEquals("PT0S", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Interval interval0 = new Interval((-1252L), (-1252L), dateTimeZone0);
      Duration duration0 = interval0.toDuration();
      Period period0 = duration0.toPeriod();
      Period period1 = period0.toPeriod();
      assertSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PeriodType periodType0 = PeriodType.hours();
      MutablePeriod mutablePeriod0 = new MutablePeriod(1L, periodType0);
      DurationFieldType durationFieldType0 = DurationFieldType.years();
      boolean boolean0 = mutablePeriod0.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Period period0 = Period.minutes((-10));
      DurationFieldType durationFieldType0 = DurationFieldType.years();
      int int0 = period0.indexOf(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Days days0 = Days.TWO;
      DurationFieldType durationFieldType0 = days0.getFieldType();
      MutablePeriod mutablePeriod0 = new MutablePeriod((long) (-1628));
      int int0 = mutablePeriod0.indexOf(durationFieldType0);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((Object) null);
      int int0 = mutablePeriod0.get((DurationFieldType) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Duration duration0 = Duration.millis(21859200000L);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Period period0 = duration0.toPeriod((PeriodType) null, (Chronology) buddhistChronology0);
      DurationFieldType durationFieldType0 = DurationFieldType.days();
      Period period1 = period0.plusDays((-1359));
      int int0 = period1.get(durationFieldType0);
      assertEquals((-1358), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Period period0 = Period.days((-2216));
      // Undeclared exception!
      try { 
        period0.getFieldType((-2216));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2216
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Duration duration0 = Duration.millis(21859200000L);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Period period0 = duration0.toPeriod((PeriodType) null, (Chronology) buddhistChronology0);
      DurationFieldType durationFieldType0 = DurationFieldType.days();
      int int0 = period0.get(durationFieldType0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((-2611L), (-2611L));
      Period period0 = mutablePeriod0.toPeriod();
      int[] intArray0 = period0.getValues();
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Period period0 = Period.ZERO;
      int int0 = period0.size();
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Duration duration0 = Duration.millis(21859200000L);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Period period0 = duration0.toPeriod((PeriodType) null, (Chronology) buddhistChronology0);
      DurationFieldType durationFieldType0 = period0.getFieldType(0);
      assertEquals("years", durationFieldType0.toString());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Period period0 = Period.minutes(0);
      DurationFieldType durationFieldType0 = DurationFieldType.weekyears();
      int int0 = period0.indexOf(durationFieldType0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Period period0 = Period.minutes(0);
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      PeriodFormatter periodFormatter0 = new PeriodFormatter((PeriodPrinter) null, periodParser0);
      // Undeclared exception!
      try { 
        period0.toString(periodFormatter0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Printing not supported
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Period period0 = Period.months(2435);
      MutablePeriod mutablePeriod0 = new MutablePeriod(0, 2435, 483, 483, 483, 0, 0, 2435);
      boolean boolean0 = mutablePeriod0.equals(period0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Period period0 = Period.hours(1);
      Seconds seconds0 = Seconds.MIN_VALUE;
      boolean boolean0 = period0.equals(seconds0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(0, 2435, 483, 483, 483, 0, 0, 2435);
      Period period0 = Period.millis(0);
      Duration duration0 = Duration.standardMinutes(0);
      mutablePeriod0.setPeriod((ReadableDuration) duration0);
      boolean boolean0 = period0.equals(mutablePeriod0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Period period0 = Period.hours(1);
      boolean boolean0 = period0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Period period0 = Period.hours(1);
      DurationFieldType[] durationFieldTypeArray0 = period0.getFieldTypes();
      assertEquals(8, durationFieldTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Period period0 = Period.months(2435);
      DurationFieldType durationFieldType0 = DurationFieldType.days();
      boolean boolean0 = period0.isSupported(durationFieldType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Period period0 = new Period();
      String string0 = period0.toString((PeriodFormatter) null);
      assertEquals("PT0S", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Seconds seconds0 = Seconds.MIN_VALUE;
      Days days0 = seconds0.toStandardDays();
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      Period period0 = mutablePeriod0.toPeriod();
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      doReturn((-600)).when(periodPrinter0).calculatePrintedLength(any(org.joda.time.ReadablePeriod.class) , any(java.util.Locale.class));
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, periodParser0);
      // Undeclared exception!
      try { 
        period0.toString(periodFormatter0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Duration duration0 = new Duration((-662L), (-662L));
      DateTime dateTime0 = DateTime.now();
      PeriodType periodType0 = PeriodType.yearWeekDayTime();
      Period period0 = duration0.toPeriodTo((ReadableInstant) dateTime0, periodType0);
      MutablePeriod mutablePeriod0 = period0.toMutablePeriod();
      assertNotNull(mutablePeriod0);
  }
}
