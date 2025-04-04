/*
 * This file was automatically generated by EvoSuite
 * Thu Mar 27 20:50:26 GMT 2025
 */

package org.joda.time.base;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.Minutes;
import org.joda.time.MonthDay;
import org.joda.time.MutableDateTime;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeParser;
import org.joda.time.format.DateTimePrinter;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodParser;
import org.joda.time.format.PeriodPrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BasePeriod_ESTest extends BasePeriod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PeriodType periodType0 = PeriodType.weeks();
      MutablePeriod mutablePeriod0 = new MutablePeriod(2437L, 12L, periodType0, (Chronology) null);
      // Undeclared exception!
      try { 
        mutablePeriod0.addMillis((-942));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'millis'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      PeriodType periodType0 = minutes0.getPeriodType();
      MutablePeriod mutablePeriod0 = new MutablePeriod(163L, periodType0);
      // Undeclared exception!
      try { 
        mutablePeriod0.setHours(1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'hours'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      DateTime dateTime0 = DateTime.parse("", dateTimeFormatter0);
      Duration duration0 = new Duration(dateTime0, dateTime0);
      Period period0 = duration0.toPeriodFrom((ReadableInstant) dateTime0);
      Period period1 = period0.plusHours(2481);
      Minutes minutes0 = duration0.toStandardMinutes();
      PeriodType periodType0 = minutes0.getPeriodType();
      // Undeclared exception!
      try { 
        period1.withPeriodType(periodType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'hours'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PeriodType periodType0 = PeriodType.time();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      mutablePeriod0.setValue(2, (-272));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Period period0 = new Period(0L);
      Period period1 = period0.minusWeeks(1);
      MutableDateTime mutableDateTime0 = new MutableDateTime(0L, (Chronology) null);
      Duration duration0 = period1.toDurationTo(mutableDateTime0);
      assertEquals((-10080L), duration0.getStandardMinutes());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Period period0 = Period.days((-1890));
      Period period1 = period0.negated();
      Duration duration0 = period1.toDurationTo((ReadableInstant) null);
      assertEquals(163296000000L, duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Period period0 = Period.seconds((-5085));
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      LocalDate localDate0 = LocalDate.now((Chronology) gJChronology0);
      DateTime dateTime0 = localDate0.toDateTimeAtCurrentTime();
      Duration duration0 = period0.toDurationTo(dateTime0);
      assertEquals((-5085L), duration0.getStandardSeconds());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Period period0 = new Period(164, 1919, 1011, (-3846));
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      Instant instant0 = gJChronology0.getGregorianCutover();
      Duration duration0 = period0.toDurationFrom(instant0);
      assertEquals(706547154L, duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Days days0 = Days.days((-315));
      Period period0 = days0.toPeriod();
      Instant instant0 = new Instant();
      Duration duration0 = period0.toDurationFrom(instant0);
      assertEquals((-27216000000L), duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PeriodType periodType0 = PeriodType.time();
      Instant instant0 = Instant.ofEpochMilli(1L);
      Chronology chronology0 = instant0.getChronology();
      MutablePeriod mutablePeriod0 = new MutablePeriod((-2411L), 1L, periodType0, chronology0);
      int int0 = mutablePeriod0.getValue(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.plusSeconds(7);
      int int0 = period1.getValue(6);
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Duration duration0 = Duration.standardMinutes(10000000000L);
      Duration duration1 = duration0.multipliedBy(0L);
      Duration duration2 = duration1.withDurationAdded((-1L), (-45));
      MutableDateTime mutableDateTime0 = new MutableDateTime((Object) null);
      PeriodType periodType0 = PeriodType.standard();
      Period period0 = duration2.toPeriodFrom((ReadableInstant) mutableDateTime0, periodType0);
      Period period1 = period0.minusMinutes(5);
      int int0 = period1.getValue(5);
      assertEquals((-5), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      MutablePeriod mutablePeriod0 = new MutablePeriod(duration0, (ReadableInstant) null);
      mutablePeriod0.add((-1185L));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Weeks weeks0 = Weeks.TWO;
      Days days0 = weeks0.toStandardDays();
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      Period period0 = new Period();
      Seconds seconds0 = period0.toStandardSeconds();
      mutablePeriod0.mergePeriod(seconds0);
      assertEquals(1, seconds0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PeriodType periodType0 = PeriodType.millis();
      MutablePeriod mutablePeriod0 = new MutablePeriod(0, 0L, periodType0);
      // Undeclared exception!
      try { 
        mutablePeriod0.addMinutes(29);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'minutes'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PeriodType periodType0 = PeriodType.seconds();
      MutablePeriod mutablePeriod0 = new MutablePeriod(775L, periodType0);
      mutablePeriod0.addHours(0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      doReturn(3273).when(periodParser0).parseInto(any(org.joda.time.ReadWritablePeriod.class) , anyString() , anyInt() , any(java.util.Locale.class));
      PeriodFormatter periodFormatter0 = new PeriodFormatter((PeriodPrinter) null, periodParser0);
      Seconds seconds0 = Seconds.seconds((-1));
      PeriodType periodType0 = seconds0.getPeriodType();
      PeriodFormatter periodFormatter1 = periodFormatter0.withParseType(periodType0);
      MutablePeriod mutablePeriod0 = periodFormatter1.parseMutablePeriod("_Al15E=aC>j|\\F);%");
      // Undeclared exception!
      try { 
        mutablePeriod0.setYears((-2492));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'years'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PeriodType periodType0 = PeriodType.seconds();
      MutablePeriod mutablePeriod0 = new MutablePeriod(775L, periodType0);
      DurationFieldType durationFieldType0 = DurationFieldType.months();
      mutablePeriod0.set(durationFieldType0, 0);
      assertEquals("months", durationFieldType0.getName());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Period period0 = new Period((Object) null);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Hours hours0 = Hours.TWO;
      Duration duration0 = hours0.toStandardDuration();
      Minutes minutes0 = Minutes.ZERO;
      PeriodType periodType0 = minutes0.getPeriodType();
      Period period0 = new Period(duration0, (ReadableInstant) null, periodType0);
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null);
      mutablePeriod0.setPeriod((-249), 0, 0, 4, 719527, (-835), 1, 0);
      // Undeclared exception!
      try { 
        period0.withFields(mutablePeriod0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'years'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      doReturn(3273).when(periodParser0).parseInto(any(org.joda.time.ReadWritablePeriod.class) , anyString() , anyInt() , any(java.util.Locale.class));
      PeriodFormatter periodFormatter0 = new PeriodFormatter((PeriodPrinter) null, periodParser0);
      MutablePeriod mutablePeriod0 = MutablePeriod.parse("_Al15E=aC>j|\\F);%", periodFormatter0);
      assertNotNull(mutablePeriod0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      LocalDate localDate0 = new LocalDate((Chronology) islamicChronology0);
      Period period0 = new Period(localDate0, localDate0, (PeriodType) null);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      LocalDate localDate0 = new LocalDate((Chronology) islamicChronology0);
      Period period0 = null;
      try {
        period0 = new Period(localDate0, (ReadablePartial) null, (PeriodType) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      LocalDate localDate0 = new LocalDate((Chronology) islamicChronology0);
      Period period0 = null;
      try {
        period0 = new Period((ReadablePartial) null, localDate0, (PeriodType) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      MutableDateTime mutableDateTime0 = new MutableDateTime((Object) null, julianChronology0);
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, mutableDateTime0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PeriodType periodType0 = PeriodType.standard();
      DateTime dateTime0 = DateTime.now();
      MutablePeriod mutablePeriod0 = new MutablePeriod(dateTime0, dateTime0, periodType0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((-2744), (-2744), 4876, (-2744));
      mutablePeriod0.addYears(0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      PeriodType periodType0 = PeriodType.weeks();
      MutablePeriod mutablePeriod0 = new MutablePeriod(2437L, 12L, periodType0, (Chronology) null);
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      Duration duration0 = mutablePeriod0.toDurationFrom(mutableDateTime0);
      assertEquals(0L, duration0.getStandardMinutes());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      MutablePeriod mutablePeriod0 = new MutablePeriod(0L, 1167L, copticChronology0);
      mutablePeriod0.setYears((-15));
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay((long) (-1485));
      Period period0 = new Period(monthDay0, monthDay0);
      Duration duration0 = period0.toDurationTo((ReadableInstant) null);
      assertEquals(0L, duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((-2744), (-2744), 4876, (-2744));
      PeriodType periodType0 = mutablePeriod0.getPeriodType();
      Period period0 = Period.seconds(0);
      Period period1 = period0.normalizedStandard(periodType0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      Instant instant0 = Instant.parse("", dateTimeFormatter0);
      Days days0 = Days.THREE;
      Minutes minutes0 = days0.toStandardMinutes();
      Duration duration0 = minutes0.toStandardDuration();
      Period period0 = new Period(instant0, duration0);
      // Undeclared exception!
      try { 
        period0.getValue(99);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
