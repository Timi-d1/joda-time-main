/*
 * This file was automatically generated by EvoSuite
 * Thu Mar 27 21:43:31 GMT 2025
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.DurationField;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.MonthDay;
import org.joda.time.Months;
import org.joda.time.MutablePeriod;
import org.joda.time.Partial;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableDateTime;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Weeks;
import org.joda.time.Years;
import org.joda.time.chrono.BasicDayOfMonthDateTimeField;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.LimitChronology;
import org.joda.time.chrono.StrictChronology;
import org.joda.time.chrono.ZonedChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BaseChronology_ESTest extends BaseChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      long long0 = buddhistChronology0.add((-346L), (long) 1, (-1));
      assertEquals((-347L), long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(2823L, 1742L);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      LenientChronology lenientChronology0 = LenientChronology.getInstance(copticChronology0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(lenientChronology0, dateTimeZone0);
      MockDate mockDate0 = new MockDate((-1L));
      MonthDay monthDay0 = MonthDay.fromDateFields(mockDate0);
      MonthDay monthDay1 = monthDay0.withDayOfMonth(1);
      int[] intArray0 = monthDay1.getValues();
      zonedChronology0.validate(monthDay1, intArray0);
      assertEquals(2, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      StrictChronology strictChronology0 = StrictChronology.getInstance(buddhistChronology0);
      DurationField durationField0 = strictChronology0.years();
      assertNotNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      DateTimeField dateTimeField0 = islamicChronology0.yearOfEra();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      JulianChronology julianChronology0 = new JulianChronology(copticChronology0, (Object) null, 1);
      DateTimeField dateTimeField0 = julianChronology0.yearOfCentury();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = gJChronology0.year();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null);
      Chronology chronology0 = julianChronology0.withZone((DateTimeZone) null);
      assertSame(chronology0, julianChronology0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      Chronology chronology0 = julianChronology0.withUTC();
      assertSame(chronology0, julianChronology0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      DurationField durationField0 = copticChronology0.weekyears();
      assertNotNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeField dateTimeField0 = iSOChronology0.weekyearOfCentury();
      assertTrue(dateTimeField0.isSupported());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null, 85L, 1);
      DateTimeField dateTimeField0 = gJChronology0.weekyear();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      DurationField durationField0 = julianChronology0.weeks();
      assertEquals("weeks", durationField0.getName());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      JulianChronology julianChronology0 = new JulianChronology(ethiopicChronology0, ethiopicChronology0, 1);
      StrictChronology strictChronology0 = StrictChronology.getInstance(julianChronology0);
      DateTimeField dateTimeField0 = strictChronology0.weekOfWeekyear();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0);
      String string0 = islamicChronology0.toString();
      assertEquals("IslamicChronology[+00:00:00.001]", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      Partial partial0 = new Partial();
      long long0 = copticChronology0.set(partial0, (-1999L));
      assertEquals((-1999L), long0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0);
      DurationField durationField0 = gregorianChronology0.seconds();
      assertEquals("seconds", durationField0.getName());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfMinute();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Object object0 = new Object();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_16_BASED;
      IslamicChronology islamicChronology0 = new IslamicChronology(buddhistChronology0, object0, islamicChronology_LeapYearPatternType0);
      DateTimeField dateTimeField0 = islamicChronology0.secondOfDay();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      DurationField durationField0 = islamicChronology0.months();
      assertNotNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = iSOChronology0.monthOfYear();
      assertTrue(dateTimeField0.isSupported());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DurationField durationField0 = copticChronology0.minutes();
      assertNotNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) null);
      DateTimeField dateTimeField0 = iSOChronology0.minuteOfHour();
      assertEquals(0, dateTimeField0.getMinimumValue());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      DateTimeField dateTimeField0 = buddhistChronology0.minuteOfDay();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = islamicChronology0.millisOfSecond();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.millisOfDay();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null, 85L, 1);
      DurationField durationField0 = gJChronology0.millis();
      assertTrue(durationField0.isSupported());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null, 85L, 1);
      LenientChronology lenientChronology0 = LenientChronology.getInstance(gJChronology0);
      DurationField durationField0 = lenientChronology0.hours();
      assertEquals(3600000L, durationField0.getUnitMillis());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = copticChronology0.hourOfHalfday();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = copticChronology0.hourOfDay();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DurationField durationField0 = iSOChronology0.halfdays();
      assertTrue(durationField0.isPrecise());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.halfdayOfDay();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance(dateTimeZone0);
      DateTimeZone dateTimeZone1 = ethiopicChronology0.getZone();
      assertSame(dateTimeZone0, dateTimeZone1);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null, 85L, 1);
      LenientChronology lenientChronology0 = LenientChronology.getInstance(gJChronology0);
      long long0 = lenientChronology0.getDateTimeMillis(193L, 20, 1, (-2405), 1343);
      assertEquals(69656343L, long0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(gregorianChronology0);
      long long0 = lenientChronology0.getDateTimeMillis((long) (-274), (-274), (-274), (-274), (-274));
      assertEquals((-1089514274L), long0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = gJChronology0.era();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      DurationField durationField0 = ethiopicChronology0.days();
      assertNotNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.dayOfYear();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      BasicDayOfMonthDateTimeField basicDayOfMonthDateTimeField0 = (BasicDayOfMonthDateTimeField)iSOChronology0.dayOfMonth();
      assertEquals(86400000L, basicDayOfMonthDateTimeField0.getUnitMillis());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.clockhourOfHalfday();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = islamicChronology0.clockhourOfDay();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = gJChronology0.centuryOfEra();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      DurationField durationField0 = islamicChronology0.centuries();
      assertNotNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0, 1);
      LocalDate localDate0 = new LocalDate(158L, (Chronology) copticChronology0);
      // Undeclared exception!
      try { 
        buddhistChronology0.validate(localDate0, (int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      // Undeclared exception!
      try { 
        gJChronology0.set((ReadablePartial) null, (-58L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      try { 
        ethiopicChronology0.getDateTimeMillis(0, 30, 1, 30, 1, 0, 1590);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 30 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DurationField durationField0 = copticChronology0.eras();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_INDIAN;
      IslamicChronology islamicChronology0 = new IslamicChronology(copticChronology0, durationField0, islamicChronology_LeapYearPatternType0);
      try { 
        islamicChronology0.getDateTimeMillis(1, 1, 3644, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 3644 for dayOfMonth must be in the range [1,30]: year: 1 month: 1
         //
         verifyException("org.joda.time.chrono.BasicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      // Undeclared exception!
      try { 
        iSOChronology0.get((ReadablePeriod) null, 2588L, 879L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(gregorianChronology0);
      // Undeclared exception!
      try { 
        lenientChronology0.get((ReadablePeriod) null, 6L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      // Undeclared exception!
      try { 
        islamicChronology0.get((ReadablePartial) null, 0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-1031));
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0);
      Years years0 = Years.TWO;
      // Undeclared exception!
      try { 
        gregorianChronology0.add((ReadablePeriod) years0, (long) (-1031), (-292269337));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -584536705 for year must be in the range [-292275054,292278993]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      Months months0 = Months.ELEVEN;
      // Undeclared exception!
      try { 
        copticChronology0.add((ReadablePeriod) months0, 5392L, 2144927119);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Magnitude of add amount is too large: 23594198309
         //
         verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      Weeks weeks0 = Weeks.MIN_VALUE;
      // Undeclared exception!
      try { 
        islamicChronology0.add((ReadablePeriod) weeks0, 19L, (-9));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows a long: 19327352832 * 604800000
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      // Undeclared exception!
      try { 
        gJChronology0.add(9223372036854775807L, 9223372036854775807L, 5);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows a long: 9223372036854775807 * 5
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null);
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_16_BASED;
      IslamicChronology islamicChronology0 = new IslamicChronology(julianChronology0, julianChronology0, islamicChronology_LeapYearPatternType0);
      PeriodType periodType0 = PeriodType.months();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      int[] intArray0 = islamicChronology0.get((ReadablePeriod) mutablePeriod0, (long) 22);
      assertEquals(1, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      Days days0 = Days.TWO;
      int[] intArray0 = copticChronology0.get((ReadablePeriod) days0, (-871L));
      assertArrayEquals(new int[] {0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      Months months0 = Months.ONE;
      int[] intArray0 = iSOChronology0.get((ReadablePeriod) months0, 0L);
      assertEquals(1, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      Period period0 = Period.minutes(1124);
      int[] intArray0 = islamicChronology0.get((ReadablePeriod) period0, (-878L), 1L);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 879}, intArray0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      Period period0 = Period.weeks(2801);
      int[] intArray0 = iSOChronology0.get((ReadablePeriod) period0, (-349L), (-349L));
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      LenientChronology lenientChronology0 = LenientChronology.getInstance(buddhistChronology0);
      MonthDay monthDay0 = new MonthDay((long) 1, (Chronology) lenientChronology0);
      long long0 = buddhistChronology0.set(monthDay0, 1);
      assertEquals(1, monthDay0.getDayOfMonth());
      assertEquals(1, monthDay0.getMonthOfYear());
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      LenientChronology lenientChronology0 = LenientChronology.getInstance(copticChronology0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(lenientChronology0, dateTimeZone0);
      MockDate mockDate0 = new MockDate((-1L));
      MonthDay monthDay0 = MonthDay.fromDateFields(mockDate0);
      int[] intArray0 = zonedChronology0.get((ReadablePartial) monthDay0, (-36865L));
      assertArrayEquals(new int[] {4, 22}, intArray0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) islamicChronology0);
      int[] intArray0 = new int[8];
      intArray0[0] = 1;
      intArray0[1] = 1;
      intArray0[2] = 1;
      intArray0[3] = 1431655765;
      // Undeclared exception!
      try { 
        islamicChronology0.validate(localDateTime0, intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 1431655765 for millisOfDay must not be larger than 86399999
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      long long0 = copticChronology0.add((long) 1, (-604800000L), 0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      long long0 = islamicChronology0.add(0L, 0L, 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      LimitChronology limitChronology0 = LimitChronology.getInstance(islamicChronology0, (ReadableDateTime) null, (ReadableDateTime) null);
      long long0 = limitChronology0.add((ReadablePeriod) null, (long) 1, 1);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      MutablePeriod mutablePeriod0 = new MutablePeriod(1, 1L);
      long long0 = ethiopicChronology0.add((ReadablePeriod) mutablePeriod0, (-3235L), 1);
      assertEquals((-3235L), long0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      PeriodType periodType0 = PeriodType.yearDayTime();
      Period period0 = new Period((-2729L), (-542L), periodType0);
      Weeks weeks0 = Weeks.standardWeeksIn(period0);
      long long0 = islamicChronology0.add((ReadablePeriod) weeks0, 0L, 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      PeriodType periodType0 = PeriodType.millis();
      Period period0 = new Period((long) 1, periodType0, (Chronology) gJChronology0);
      // Undeclared exception!
      try { 
        gJChronology0.get((ReadablePeriod) period0, 100000000000000L, 727L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Value cannot fit in an int: -99999999999273
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      StrictChronology strictChronology0 = StrictChronology.getInstance(ethiopicChronology0);
      MonthDay monthDay0 = MonthDay.now();
      int[] intArray0 = new int[4];
      // Undeclared exception!
      try { 
        strictChronology0.validate(monthDay0, intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 0 for monthOfYear must not be smaller than 1
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      try { 
        buddhistChronology0.getDateTimeMillis(0L, (-340), (-340), (-340), 4060);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -340 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      LenientChronology lenientChronology0 = LenientChronology.getInstance(copticChronology0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(lenientChronology0, dateTimeZone0);
      long long0 = zonedChronology0.getDateTimeMillis(24, 1, 1, 24);
      assertEquals((-52458364799976L), long0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      JulianChronology julianChronology0 = JulianChronology.getInstance(dateTimeZone0);
      LenientChronology lenientChronology0 = LenientChronology.getInstance(julianChronology0);
      long long0 = lenientChronology0.getDateTimeMillis((-2393), 38026, 38026, (-2121294822), 15, 292272992, (-2121294822));
      assertEquals((-7670772489802822L), long0);
  }
}
