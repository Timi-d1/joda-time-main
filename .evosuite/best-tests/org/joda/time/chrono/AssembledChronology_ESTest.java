/*
 * This file was automatically generated by EvoSuite
 * Thu Mar 27 19:57:35 GMT 2025
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.BasicFixedMonthChronology;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GJDayOfWeekDateTimeField;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.field.PreciseDateTimeField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AssembledChronology_ESTest extends AssembledChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      Object object0 = copticChronology0.getParam();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      Object object0 = buddhistChronology0.getParam();
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(islamicChronology0);
      long long0 = lenientChronology0.getDateTimeMillis(1890, 1, 1, 1, (-1535), 5, 1327);
      assertEquals(15314397906327L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      long long0 = buddhistChronology0.getDateTimeMillis(1, 1, 1, 1, 1, 1, 1);
      assertEquals((-79271564338999L), long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = islamicChronology0.getZone();
      assertNotNull(dateTimeZone0);
      
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      long long0 = iSOChronology0.getDateTimeMillis(4245, 1, 1, 17887500);
      assertEquals(71792110687500L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      Chronology chronology0 = gregorianChronology0.getBase();
      assertNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(47);
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_INDIAN;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0, islamicChronology_LeapYearPatternType0);
      Chronology chronology0 = islamicChronology0.getBase();
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      try { 
        julianChronology0.getDateTimeMillis(0L, 12, 292272992, 292272992, (-1106));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 292272992 for minuteOfHour must be in the range [0,59]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-636));
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      DateTimeZone dateTimeZone1 = iSOChronology0.getZone();
      assertNotSame(dateTimeZone1, dateTimeZone0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.clockhourOfHalfday();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      DurationField durationField0 = ethiopicChronology0.days();
      assertNotNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = copticChronology0.weekOfWeekyear();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      DurationField durationField0 = ethiopicChronology0.years();
      assertNotNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gJChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.millisOfDay();
      assertEquals("millisOfDay", dateTimeField0.getName());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = iSOChronology0.halfdayOfDay();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeField dateTimeField0 = gJChronology0.monthOfYear();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      DurationField durationField0 = gregorianChronology0.centuries();
      assertTrue(durationField0.isSupported());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(47);
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_INDIAN;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0, islamicChronology_LeapYearPatternType0);
      DateTimeField dateTimeField0 = islamicChronology0.centuryOfEra();
      assertEquals("centuryOfEra", dateTimeField0.getName());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = gJChronology0.year();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      DurationField durationField0 = gregorianChronology0.hours();
      assertTrue(durationField0.isPrecise());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      GJDayOfWeekDateTimeField gJDayOfWeekDateTimeField0 = (GJDayOfWeekDateTimeField)iSOChronology0.dayOfWeek();
      assertEquals(86400000L, gJDayOfWeekDateTimeField0.getUnitMillis());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DurationField durationField0 = gJChronology0.weekyears();
      assertNotNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DurationField durationField0 = iSOChronology0.weeks();
      assertEquals("weeks", durationField0.getName());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeField dateTimeField0 = gJChronology0.hourOfHalfday();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DurationField durationField0 = gJChronology0.months();
      assertNotNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = copticChronology0.secondOfMinute();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = gregorianChronology0.yearOfCentury();
      assertEquals(100, dateTimeField0.getMaximumValue());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2824);
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = copticChronology0.era();
      assertEquals("era", dateTimeField0.getName());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      DateTimeField dateTimeField0 = buddhistChronology0.minuteOfHour();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeField dateTimeField0 = iSOChronology0.weekyear();
      assertTrue(dateTimeField0.isSupported());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      PreciseDateTimeField preciseDateTimeField0 = (PreciseDateTimeField)julianChronology0.hourOfDay();
      assertEquals(24, preciseDateTimeField0.getRange());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_15_BASED;
      IslamicChronology islamicChronology0 = new IslamicChronology(buddhistChronology0, assembledChronology_Fields0, islamicChronology_LeapYearPatternType0);
      DateTimeField dateTimeField0 = islamicChronology0.yearOfEra();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = julianChronology0.minuteOfDay();
      assertEquals(0, dateTimeField0.getMinimumValue());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = copticChronology0.weekyearOfCentury();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.seconds();
      assertNotNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-636));
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      DurationField durationField0 = iSOChronology0.halfdays();
      assertTrue(durationField0.isSupported());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DurationField durationField0 = iSOChronology0.eras();
      assertEquals("eras", durationField0.getName());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfYear();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfMonth();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeField dateTimeField0 = gJChronology0.secondOfDay();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      DurationField durationField0 = gregorianChronology0.minutes();
      assertEquals("minutes", durationField0.getName());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.millisOfSecond();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DurationField durationField0 = gJChronology0.millis();
      assertEquals("DurationField[millis]", durationField0.toString());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 15);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      long long0 = BasicFixedMonthChronology.MILLIS_PER_YEAR;
      buddhistChronology0.clockhourOfDay();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_15_BASED;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0, islamicChronology_LeapYearPatternType0);
      assertEquals(1, IslamicChronology.AH);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(gregorianChronology0);
      long long0 = lenientChronology0.getDateTimeMillis((long) 0, 0, 0, 0, 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      try { 
        buddhistChronology0.getDateTimeMillis((-2755), 6, 2925, 2925, 1046, 78, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 2925 for dayOfMonth must be in the range [1,30]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      long long0 = buddhistChronology0.getDateTimeMillis(1, 1, 1, 1);
      assertEquals((-79271567999999L), long0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(copticChronology0);
      try { 
        lenientChronology0.getDateTimeMillis(0, 2, 1963, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The resulting instant is below the supported minimum of 0001-01-01T00:00:00.000Z (CopticChronology[UTC])
         //
         verifyException("org.joda.time.chrono.LimitChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      long long0 = buddhistChronology0.getDateTimeMillis(0L, 1, 1, 1, 1);
      assertEquals(3661001L, long0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      assembledChronology_Fields0.copyFieldsFrom(iSOChronology0);
  }
}
