/*
 * This file was automatically generated by EvoSuite
 * Thu Mar 27 20:07:57 GMT 2025
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.LocalDateTime;
import org.joda.time.Period;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.StrictChronology;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeParser;
import org.joda.time.format.DateTimePrinter;
import org.joda.time.tz.UTCProvider;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BasicChronology_ESTest extends BasicChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      julianChronology0.getWeekyear(1356L);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1);
      localDateTime0.toDateTime();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      LocalDateTime localDateTime0 = LocalDateTime.parse("", dateTimeFormatter0);
      Date date0 = localDateTime0.toDate();
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      copticChronology0.assemble(assembledChronology_Fields0);
      assertEquals(1, CopticChronology.AM);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      DateTimeZone dateTimeZone1 = copticChronology0.getZone();
      assertEquals("UTC", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      long long0 = islamicChronology0.getYearMonthMillis(2467, 2467);
      assertEquals(39265948800000L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      long long0 = ethiopicChronology0.getYearMonthDayMillis(365, 17887500, 86400000);
      assertEquals(53778950179200000L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      int int0 = ethiopicChronology0.getYear((-61925644800000L));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      int int0 = copticChronology0.getYear(92454134400000L);
      assertEquals(4616, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      int int0 = islamicChronology0.getYear(9223372036854775807L);
      assertEquals((-301245869), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      int int0 = islamicChronology0.getWeeksInYear(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      int int0 = islamicChronology0.getWeeksInYear(7593750);
      assertEquals(50, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      int int0 = copticChronology0.getWeekOfWeekyear(30962844000000L, (-4567));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      int int0 = islamicChronology0.getWeekOfWeekyear((-42521673600000L));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      JulianChronology julianChronology0 = JulianChronology.getInstance(dateTimeZone0);
      int int0 = julianChronology0.getMonthOfYear((-9223372036854775808L));
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      int int0 = islamicChronology0.getMonthOfYear((-114390748800000L));
      assertEquals((-87), int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      int int0 = gregorianChronology0.getMinimumDaysInFirstWeek();
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      int int0 = copticChronology0.getMillisOfDay((-42521587200000L));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_16_BASED;
      IslamicChronology islamicChronology0 = new IslamicChronology((Chronology) null, (Object) null, islamicChronology_LeapYearPatternType0);
      int int0 = islamicChronology0.getMillisOfDay(1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0, 1);
      int int0 = gregorianChronology0.getMaxMonth();
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      long long0 = islamicChronology0.getFirstWeekOfYearMillis(4774);
      assertEquals(103614681600000L, long0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      long long0 = ethiopicChronology0.getFirstWeekOfYearMillis(0);
      assertEquals((-61925731200000L), long0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) null);
      int int0 = islamicChronology0.getDaysInMonthMax((-612L));
      assertEquals(29, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      StrictChronology strictChronology0 = StrictChronology.getInstance(buddhistChronology0);
      Object object0 = new Object();
      JulianChronology julianChronology0 = new JulianChronology(strictChronology0, object0, 7);
      int int0 = julianChronology0.getDayOfYear(1, 7);
      assertEquals(716974, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      int int0 = copticChronology0.getDayOfYear(2551440384L, 2932);
      assertEquals((-454959), int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      int int0 = islamicChronology0.getDayOfYear((-79240118400000L));
      assertEquals((-10373), int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      int int0 = ethiopicChronology0.getDayOfMonth((-368), 1, 0);
      assertEquals(716397, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(3);
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_INDIAN;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0, islamicChronology_LeapYearPatternType0);
      int int0 = islamicChronology0.getDayOfMonth(685, 1693, (-285));
      assertEquals((-99001), int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      int int0 = gregorianChronology0.getDayOfMonth(0L);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      int int0 = islamicChronology0.getDayOfMonth((-53184211200000L));
      assertEquals((-7), int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      long long0 = islamicChronology0.getDateTimeMillis(1, 1, 11, 1, 11, 1, 1);
      assertEquals((-42520718938999L), long0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0);
      long long0 = gregorianChronology0.getDateTimeMillis(947, 1, 1, 93);
      assertEquals((-32282755199907L), long0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      long long0 = julianChronology0.getDateMidnightMillis(2555, 1, 2);
      assertEquals(18462384000000L, long0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      long long0 = islamicChronology0.getDateMidnightMillis(4, 1, 1);
      assertEquals((-42429744000000L), long0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance((DateTimeZone) null);
      // Undeclared exception!
      try { 
        gregorianChronology0.getYearMonthMillis(2386, 2386);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      // Undeclared exception!
      try { 
        islamicChronology0.getYearMonthMillis(Integer.MIN_VALUE, 1583);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Year is too small: -2147483648 < -292269337
         //
         verifyException("org.joda.time.chrono.IslamicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      // Undeclared exception!
      try { 
        julianChronology0.getYearMonthDayMillis((-413), 0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      // Undeclared exception!
      try { 
        islamicChronology0.getYearMonthDayMillis((-2147483645), (-578), (-1398));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Year is too small: -2147483645 < -292269337
         //
         verifyException("org.joda.time.chrono.IslamicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      IslamicChronology islamicChronology0 = new IslamicChronology(buddhistChronology0, buddhistChronology0, (IslamicChronology.LeapYearPatternType) null);
      // Undeclared exception!
      try { 
        islamicChronology0.getYearMillis(306);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.IslamicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      // Undeclared exception!
      try { 
        islamicChronology0.getYearMillis(2147483646);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Year is too large: 2147483646 > 292271022
         //
         verifyException("org.joda.time.chrono.IslamicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      IslamicChronology islamicChronology0 = new IslamicChronology(julianChronology0, julianChronology0, (IslamicChronology.LeapYearPatternType) null);
      // Undeclared exception!
      try { 
        islamicChronology0.getWeeksInYear(509);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.IslamicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      // Undeclared exception!
      try { 
        islamicChronology0.getWeeksInYear((-2127961068));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Year is too small: -2127961068 < -292269337
         //
         verifyException("org.joda.time.chrono.IslamicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      // Undeclared exception!
      try { 
        islamicChronology0.getWeekOfWeekyear(1, 2147483644);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Year is too large: 2147483644 > 292271022
         //
         verifyException("org.joda.time.chrono.IslamicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      // Undeclared exception!
      try { 
        islamicChronology0.getWeekOfWeekyear((-9223372036854775808L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Year is too small: -301245869 < -292269337
         //
         verifyException("org.joda.time.chrono.IslamicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      // Undeclared exception!
      try { 
        islamicChronology0.getMonthOfYear(9223372036854775807L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Year is too small: -301245869 < -292269337
         //
         verifyException("org.joda.time.chrono.IslamicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      // Undeclared exception!
      try { 
        islamicChronology0.getFirstWeekOfYearMillis((-2147483646));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Year is too small: -2147483646 < -292269337
         //
         verifyException("org.joda.time.chrono.IslamicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      // Undeclared exception!
      try { 
        islamicChronology0.getDaysInMonthMax((-9223372036854775808L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Year is too small: -301245869 < -292269337
         //
         verifyException("org.joda.time.chrono.IslamicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      // Undeclared exception!
      try { 
        islamicChronology0.getDayOfYear(1, (-2147483645));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Year is too small: -2147483645 < -292269337
         //
         verifyException("org.joda.time.chrono.IslamicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      // Undeclared exception!
      try { 
        julianChronology0.getDayOfMonth(2239L, 0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.joda.time.chrono.BasicGJChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      // Undeclared exception!
      try { 
        islamicChronology0.getDayOfMonth(100000000000000L, 2147483644, (-1505));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Year is too large: 2147483644 > 292271022
         //
         verifyException("org.joda.time.chrono.IslamicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      // Undeclared exception!
      try { 
        islamicChronology0.getDayOfMonth((-9223372036854775808L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Year is too small: -301245869 < -292269337
         //
         verifyException("org.joda.time.chrono.IslamicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      int int0 = copticChronology0.getDayOfMonth(31536000000L, 86400000);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-144));
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      try { 
        buddhistChronology0.getDateTimeMillis((-1), (-1), (-144), 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0);
      try { 
        gregorianChronology0.getDateTimeMillis((-896), 1, 1970, 93);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 1970 for dayOfMonth must be in the range [1,31]: year: -896 month: 1
         //
         verifyException("org.joda.time.chrono.BasicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      // Undeclared exception!
      try { 
        ethiopicChronology0.getDateMidnightMillis((-292269337), 1, (-2147483640));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -2147483640 for dayOfMonth must be in the range [1,30]: year: -292269337 month: 1
         //
         verifyException("org.joda.time.chrono.BasicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      int int0 = ethiopicChronology0.getDayOfWeek((-1777L));
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      int int0 = islamicChronology0.getWeekOfWeekyear((-42521673600000L), 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      int int0 = gregorianChronology0.getWeekyear((-42521587200000L));
      assertEquals(622, int0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      int int0 = gregorianChronology0.getWeekOfWeekyear(9814207320000L);
      assertEquals(53, int0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      int int0 = gregorianChronology0.getWeekyear((-199L));
      assertEquals(1970, int0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0);
      int int0 = gregorianChronology0.getDaysInYear(20);
      assertEquals(366, int0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      int int0 = gregorianChronology0.getDaysInYear((-1198));
      assertEquals(365, int0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      String string0 = ethiopicChronology0.toString();
      assertEquals("EthiopicChronology[UTC]", string0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0, 1);
      String string0 = gregorianChronology0.toString();
      assertEquals("GregorianChronology[UTC,mdfw=1]", string0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime(31556952000L, (Chronology) gregorianChronology0);
      DateTime dateTime0 = localDateTime0.toDateTime();
      IslamicChronology islamicChronology1 = new IslamicChronology(gregorianChronology0, dateTime0, islamicChronology0.LEAP_YEAR_16_BASED);
      boolean boolean0 = islamicChronology0.equals(islamicChronology1);
      assertTrue(boolean0);
      assertEquals(31556952000L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      boolean boolean0 = copticChronology0.equals("org/joda/time/tz/data");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      boolean boolean0 = julianChronology0.equals(julianChronology0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      boolean boolean0 = ethiopicChronology0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "org.joda.time.chrono.BasicChronology$YearInfo");
      UTCProvider uTCProvider0 = new UTCProvider();
      uTCProvider0.getZone("--MM-dd");
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_INDIAN;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) null, islamicChronology_LeapYearPatternType0);
      int int0 = (-2147483646);
      // Undeclared exception!
      try { 
        islamicChronology0.getDayOfMonth((-2147483646), (-2147483646));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Year is too small: -2147483646 < -292269337
         //
         verifyException("org.joda.time.chrono.IslamicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      try { 
        islamicChronology0.getDateTimeMillis(1024, (-1161), 11, 988, 11, 1024, 1024);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 988 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      try { 
        islamicChronology0.getDateTimeMillis(292272984, 5062500, 0, (-976));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -976 for millisOfDay must be in the range [0,86399999]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      JulianChronology julianChronology0 = null;
      try {
        julianChronology0 = new JulianChronology(iSOChronology0, buddhistChronology0, 3106);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: 3106
         //
         verifyException("org.joda.time.chrono.BasicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      Duration duration0 = Duration.millis(1);
      DateTime dateTime0 = new DateTime();
      Period period0 = new Period(duration0, dateTime0);
      CopticChronology copticChronology0 = null;
      try {
        copticChronology0 = new CopticChronology(gregorianChronology0, period0, (-292275054));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: -292275054
         //
         verifyException("org.joda.time.chrono.BasicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "_La%{_J");
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      copticChronology0.withUTC();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, false);
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      julianChronology0.getYearMillis(1024);
      julianChronology0.getAverageMillisPerYear();
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      gregorianChronology0.setYear(1, (-1922));
      ethiopicChronology0.isLeapDay(1);
      ethiopicChronology0.getDayOfYear((-29852409600000L));
      julianChronology0.isLeapDay((-1922));
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, true, false);
      ethiopicChronology0.getYearMillis(1970);
      julianChronology0.withUTC();
      copticChronology0.getYearMonthDayMillis(1, 1, 1024);
      gregorianChronology0.getDayOfYear((-1035L));
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-1));
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DateTimeZone dateTimeZone1 = buddhistChronology0.getZone();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = new IslamicChronology.LeapYearPatternType(1, (-1));
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone1, islamicChronology_LeapYearPatternType0);
      islamicChronology0.getDaysInYearMax();
      GregorianChronology gregorianChronology1 = GregorianChronology.getInstance();
      copticChronology0.getMinYear();
      ethiopicChronology0.withUTC();
      GregorianChronology gregorianChronology2 = GregorianChronology.getInstanceUTC();
      assertSame(gregorianChronology2, gregorianChronology1);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      boolean boolean0 = islamicChronology0.isLeapDay(25);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      islamicChronology0.hashCode();
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0, 2);
      int int0 = gregorianChronology0.getDaysInMonthMax();
      assertEquals(31, int0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      int int0 = copticChronology0.getMaxMonth(1870);
      assertEquals(13, int0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      int int0 = copticChronology0.getDaysInYearMax();
      assertEquals(366, int0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      // Undeclared exception!
      try { 
        julianChronology0.assemble((AssembledChronology.Fields) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.BasicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      int int0 = copticChronology0.getDayOfMonth((-315), 622);
      assertEquals(28, int0);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      int int0 = ethiopicChronology0.getDaysInMonthMaxForSet(604800000L, (-368));
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      long long0 = copticChronology0.getYearMonthMillis(13, 1687);
      assertEquals((-48435408000000L), long0);
  }
}
