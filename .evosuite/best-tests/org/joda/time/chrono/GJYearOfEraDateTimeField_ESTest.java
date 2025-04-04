/*
 * This file was automatically generated by EvoSuite
 * Thu Mar 27 23:11:00 GMT 2025
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.BasicChronology;
import org.joda.time.chrono.BasicSingleEraDateTimeField;
import org.joda.time.chrono.BasicYearDateTimeField;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJEraDateTimeField;
import org.joda.time.chrono.GJMonthOfYearDateTimeField;
import org.joda.time.chrono.GJYearOfEraDateTimeField;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOYearOfEraDateTimeField;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.field.DelegatedDateTimeField;
import org.joda.time.field.OffsetDateTimeField;
import org.joda.time.field.SkipUndoDateTimeField;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeParser;
import org.joda.time.format.DateTimePrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GJYearOfEraDateTimeField_ESTest extends GJYearOfEraDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(gregorianChronology0);
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(gJEraDateTimeField0, gregorianChronology0);
      long long0 = gJYearOfEraDateTimeField0.set(0L, 1);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.secondOfDay();
      DelegatedDateTimeField delegatedDateTimeField0 = new DelegatedDateTimeField(dateTimeField0);
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(delegatedDateTimeField0, copticChronology0);
      long long0 = gJYearOfEraDateTimeField0.set(2L, 1);
      assertEquals(1002L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 0);
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = copticChronology0.dayOfYear();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      long long0 = gJYearOfEraDateTimeField0.roundFloor(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = copticChronology0.millisOfSecond();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      long long0 = gJYearOfEraDateTimeField0.roundFloor(917L);
      assertEquals(917L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.millisOfSecond();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      long long0 = gJYearOfEraDateTimeField0.roundCeiling(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = copticChronology0.millisOfSecond();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      long long0 = gJYearOfEraDateTimeField0.roundCeiling((-66L));
      assertEquals((-66L), long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      CopticChronology copticChronology0 = new CopticChronology(buddhistChronology0, "_:A8uV-dsGc1u", 1);
      DateTimeField dateTimeField0 = copticChronology0.weekOfWeekyear();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      long long0 = gJYearOfEraDateTimeField0.remainder(1);
      assertEquals(259200001L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = copticChronology0.centuryOfEra();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      long long0 = gJYearOfEraDateTimeField0.remainder((-1L));
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-2450));
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = copticChronology0.halfdayOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      OffsetDateTimeField offsetDateTimeField0 = new OffsetDateTimeField(dateTimeField0, dateTimeFieldType0, (-2450));
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(offsetDateTimeField0, islamicChronology0);
      int int0 = gJYearOfEraDateTimeField0.getMaximumValue();
      assertEquals((-2449), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.secondOfDay();
      DelegatedDateTimeField delegatedDateTimeField0 = new DelegatedDateTimeField(dateTimeField0);
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(delegatedDateTimeField0, copticChronology0);
      long long0 = gJYearOfEraDateTimeField0.getDifferenceAsLong(650L, (-1742L));
      assertEquals(2L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.secondOfDay();
      DelegatedDateTimeField delegatedDateTimeField0 = new DelegatedDateTimeField(dateTimeField0);
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(delegatedDateTimeField0, copticChronology0);
      long long0 = gJYearOfEraDateTimeField0.getDifferenceAsLong(2L, 86399);
      assertEquals((-86L), long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.millisOfSecond();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      int int0 = gJYearOfEraDateTimeField0.getDifference(2L, 1L);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.secondOfMinute();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      int int0 = gJYearOfEraDateTimeField0.getDifference((-1035L), 1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      CopticChronology copticChronology0 = new CopticChronology(buddhistChronology0, "_:A8uV-dsGc1u", 1);
      DateTimeField dateTimeField0 = copticChronology0.weekOfWeekyear();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeParser0);
      LocalDate localDate0 = LocalDate.parse("", dateTimeFormatter0);
      int[] intArray0 = new int[3];
      int[] intArray1 = gJYearOfEraDateTimeField0.addWrapField((ReadablePartial) localDate0, 0, intArray0, 1);
      assertArrayEquals(new int[] {1, 1, 1}, intArray1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(copticChronology0);
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(gJMonthOfYearDateTimeField0, copticChronology0);
      long long0 = gJYearOfEraDateTimeField0.addWrapField(0L, 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      BasicYearDateTimeField basicYearDateTimeField0 = new BasicYearDateTimeField(gregorianChronology0);
      OffsetDateTimeField offsetDateTimeField0 = new OffsetDateTimeField(basicYearDateTimeField0, 1);
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(offsetDateTimeField0, gregorianChronology0);
      long long0 = gJYearOfEraDateTimeField0.addWrapField((-62167219199999L), (-818));
      assertEquals((-87980774399999L), long0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.year();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      long long0 = gJYearOfEraDateTimeField0.add(0L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.minuteOfDay();
      SkipUndoDateTimeField skipUndoDateTimeField0 = new SkipUndoDateTimeField((Chronology) null, dateTimeField0, 1);
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(skipUndoDateTimeField0, copticChronology0);
      long long0 = gJYearOfEraDateTimeField0.add((long) 1, (-1962L));
      assertEquals((-117719999L), long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.millisOfSecond();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      long long0 = gJYearOfEraDateTimeField0.add((-1L), 1);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(889);
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = copticChronology0.hourOfHalfday();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      long long0 = gJYearOfEraDateTimeField0.add(36L, (-2699));
      assertEquals((-9716399964L), long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = copticChronology0.minuteOfHour();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      // Undeclared exception!
      try { 
        gJYearOfEraDateTimeField0.remainder((-98388604800000L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The instant is below the supported minimum of 0001-01-01T00:00:00.000Z (CopticChronology[UTC])
         //
         verifyException("org.joda.time.chrono.LimitChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(23);
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0, 1);
      DateTimeField dateTimeField0 = copticChronology0.monthOfYear();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, (BasicChronology) null);
      // Undeclared exception!
      try { 
        gJYearOfEraDateTimeField0.getRangeDurationField();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.GJYearOfEraDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField(julianChronology0);
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, julianChronology0);
      // Undeclared exception!
      try { 
        gJYearOfEraDateTimeField0.getDifferenceAsLong(3285L, 30672000000L);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // eras field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("");
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(basicSingleEraDateTimeField0, (BasicChronology) null);
      // Undeclared exception!
      try { 
        gJYearOfEraDateTimeField0.getDifference(2748L, 0L);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // eras field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = copticChronology0.millisOfSecond();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      // Undeclared exception!
      try { 
        gJYearOfEraDateTimeField0.getDifference(30672000000L, 0L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Value cannot fit in an int: 30672000000
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField((BasicChronology) null);
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(gJEraDateTimeField0, islamicChronology0);
      // Undeclared exception!
      try { 
        gJYearOfEraDateTimeField0.get(575L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.GJEraDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(iSOYearOfEraDateTimeField0, ethiopicChronology0);
      int[] intArray0 = new int[6];
      // Undeclared exception!
      try { 
        gJYearOfEraDateTimeField0.addWrapField((ReadablePartial) null, 1, intArray0, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("");
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(basicSingleEraDateTimeField0, ethiopicChronology0);
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) null);
      int[] intArray0 = new int[8];
      // Undeclared exception!
      try { 
        gJYearOfEraDateTimeField0.addWrapField((ReadablePartial) localDateTime0, 1, intArray0, 4543);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // MIN > MAX
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.weekyear();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      DelegatedDateTimeField delegatedDateTimeField0 = new DelegatedDateTimeField(dateTimeField0, dateTimeFieldType0);
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(delegatedDateTimeField0, copticChronology0);
      // Undeclared exception!
      try { 
        gJYearOfEraDateTimeField0.addWrapField((long) 1, (-2658));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The resulting instant is below the supported minimum of 0001-01-01T00:00:00.000Z (CopticChronology[UTC])
         //
         verifyException("org.joda.time.chrono.LimitChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("");
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(basicSingleEraDateTimeField0, ethiopicChronology0);
      // Undeclared exception!
      try { 
        gJYearOfEraDateTimeField0.addWrapField((long) 1, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // MIN > MAX
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.clockhourOfHalfday();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      OffsetDateTimeField offsetDateTimeField0 = new OffsetDateTimeField(dateTimeField0, dateTimeFieldType0, 1, 1, 1);
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(offsetDateTimeField0, copticChronology0);
      // Undeclared exception!
      try { 
        gJYearOfEraDateTimeField0.add(0L, (-4467L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 10 for yearOfEra must be in the range [2,1]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.year();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      // Undeclared exception!
      try { 
        gJYearOfEraDateTimeField0.add(0L, (-22879238399239L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Value cannot fit in an int: -22879238399239
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = copticChronology0.centuryOfEra();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      // Undeclared exception!
      try { 
        gJYearOfEraDateTimeField0.add(3798L, (-433));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The resulting instant is below the supported minimum of 0001-01-01T00:00:00.000Z (CopticChronology[UTC])
         //
         verifyException("org.joda.time.chrono.LimitChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) null);
      GJEraDateTimeField gJEraDateTimeField0 = new GJEraDateTimeField(copticChronology0);
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(gJEraDateTimeField0, copticChronology0);
      // Undeclared exception!
      try { 
        gJYearOfEraDateTimeField0.add((long) (-1), 1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // eras field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = null;
      try {
        gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField((DateTimeField) null, copticChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field must not be null
         //
         verifyException("org.joda.time.field.DecoratedDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(iSOYearOfEraDateTimeField0, islamicChronology0);
      // Undeclared exception!
      try { 
        gJYearOfEraDateTimeField0.set((-62135596799999L), 184);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -183 for yearOfEra must be in the range [0,292278993]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = copticChronology0.secondOfMinute();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      int int0 = gJYearOfEraDateTimeField0.getMaximumValue();
      assertEquals(59, int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LocalDate localDate0 = new LocalDate(1, 1, 1);
      LocalDate localDate1 = localDate0.minusWeeks(1);
      LocalDate localDate2 = localDate1.withYearOfEra(80);
      assertNotSame(localDate2, localDate1);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = copticChronology0.minuteOfHour();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      int int0 = gJYearOfEraDateTimeField0.get(1057L);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = copticChronology0.year();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      int int0 = gJYearOfEraDateTimeField0.get(0);
      assertEquals(1686, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.clockhourOfDay();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      long long0 = gJYearOfEraDateTimeField0.addWrapField(0L, 1);
      assertEquals(3600000L, long0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = copticChronology0.year();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      long long0 = gJYearOfEraDateTimeField0.roundCeiling(0L);
      assertEquals(21859200000L, long0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.year();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      long long0 = gJYearOfEraDateTimeField0.set(761L, 1);
      assertEquals((-53174534399239L), long0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = copticChronology0.year();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      int int0 = gJYearOfEraDateTimeField0.getDifference(1, 1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = copticChronology0.year();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      DurationField durationField0 = gJYearOfEraDateTimeField0.getRangeDurationField();
      assertEquals("eras", durationField0.getName());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = copticChronology0.year();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        gJYearOfEraDateTimeField0.addWrapField((ReadablePartial) null, 1, intArray0, (-741));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.clockhourOfDay();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      long long0 = gJYearOfEraDateTimeField0.add((long) 1, (long) 1);
      assertEquals(3600001L, long0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = copticChronology0.clockhourOfHalfday();
      DelegatedDateTimeField delegatedDateTimeField0 = new DelegatedDateTimeField(dateTimeField0);
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(delegatedDateTimeField0, copticChronology0);
      long long0 = gJYearOfEraDateTimeField0.remainder(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = copticChronology0.year();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      int int0 = gJYearOfEraDateTimeField0.getMinimumValue();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = copticChronology0.year();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      long long0 = gJYearOfEraDateTimeField0.roundFloor(2908L);
      assertEquals((-9676800000L), long0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = copticChronology0.year();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      long long0 = gJYearOfEraDateTimeField0.add((-9676800000L), 1686);
      assertEquals(53196480000000L, long0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = copticChronology0.clockhourOfHalfday();
      DelegatedDateTimeField delegatedDateTimeField0 = new DelegatedDateTimeField(dateTimeField0);
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(delegatedDateTimeField0, copticChronology0);
      gJYearOfEraDateTimeField0.getDifferenceAsLong(1, 1);
      assertEquals(1, gJYearOfEraDateTimeField0.getMinimumValue());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(iSOYearOfEraDateTimeField0, (BasicChronology) null);
      // Undeclared exception!
      try { 
        gJYearOfEraDateTimeField0.set((-564L), 1970);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.GJYearOfEraDateTimeField", e);
      }
  }
}
