/*
 * This file was automatically generated by EvoSuite
 * Thu Mar 27 23:13:38 GMT 2025
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DurationField;
import org.joda.time.chrono.BasicSingleEraDateTimeField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BasicSingleEraDateTimeField_ESTest extends BasicSingleEraDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("");
      Locale locale0 = Locale.US;
      long long0 = basicSingleEraDateTimeField0.set((-720L), "", locale0);
      assertEquals((-720L), long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("f'qX'");
      long long0 = basicSingleEraDateTimeField0.set(0L, 1);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("");
      long long0 = basicSingleEraDateTimeField0.set(865L, 1);
      assertEquals(865L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("");
      Locale locale0 = new Locale("");
      int int0 = basicSingleEraDateTimeField0.getMaximumTextLength(locale0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField((String) null);
      Locale locale0 = Locale.CANADA;
      String string0 = basicSingleEraDateTimeField0.getAsText(1, locale0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("l{I|/9.bdo|c5J^xY{");
      Locale locale0 = Locale.KOREA;
      String string0 = basicSingleEraDateTimeField0.getAsText(0, locale0);
      assertEquals("l{I|/9.bdo|c5J^xY{", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField((String) null);
      Locale locale0 = Locale.GERMANY;
      // Undeclared exception!
      try { 
        basicSingleEraDateTimeField0.set((long) (-1879048189), (String) null, locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("");
      // Undeclared exception!
      try { 
        basicSingleEraDateTimeField0.set((-1734L), (-1554));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1554 for era must be in the range [1,1]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField((String) null);
      Locale locale0 = Locale.CANADA;
      // Undeclared exception!
      try { 
        basicSingleEraDateTimeField0.getMaximumTextLength(locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.BasicSingleEraDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("");
      Locale locale0 = Locale.forLanguageTag("");
      // Undeclared exception!
      try { 
        basicSingleEraDateTimeField0.set(0L, (String) null, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value null for era is not supported
         //
         verifyException("org.joda.time.chrono.BasicSingleEraDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("");
      Locale locale0 = Locale.FRANCE;
      long long0 = basicSingleEraDateTimeField0.set(0L, "1", locale0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("");
      Locale locale0 = Locale.FRANCE;
      String string0 = basicSingleEraDateTimeField0.getAsText((-2889), locale0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("f'qX'");
      int int0 = basicSingleEraDateTimeField0.get((-1973L));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("Specified date does not exist");
      long long0 = basicSingleEraDateTimeField0.set((-9223372036854775808L), 1);
      assertEquals((-9223372036854775808L), long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("org.joda.time.chrono.BasicSingleEraDateTimeField");
      Locale locale0 = Locale.UK;
      long long0 = basicSingleEraDateTimeField0.set(9223372036854775807L, "org.joda.time.chrono.BasicSingleEraDateTimeField", locale0);
      assertEquals(9223372036854775807L, long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("S6");
      long long0 = basicSingleEraDateTimeField0.roundFloor(0);
      assertEquals((-9223372036854775808L), long0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("org.joda.time.chrono.BasicSingleEraDateTimeField");
      int int0 = basicSingleEraDateTimeField0.getMaximumValue();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("org.joda.time.chrono.BasicSingleEraDateTimeField");
      long long0 = basicSingleEraDateTimeField0.roundHalfCeiling((-9223372036854775808L));
      assertEquals((-9223372036854775808L), long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("org.joda.time.chrono.BasicSingleEraDateTimeField");
      int int0 = basicSingleEraDateTimeField0.getMinimumValue();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("org.joda.time.chrono.BasicSingleEraDateTimeField");
      long long0 = basicSingleEraDateTimeField0.roundHalfEven(1);
      assertEquals((-9223372036854775808L), long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("org.joda.time.chrono.BasicSingleEraDateTimeField");
      DurationField durationField0 = basicSingleEraDateTimeField0.getRangeDurationField();
      assertNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("org.joda.time.chrono.BasicSingleEraDateTimeField");
      Locale locale0 = Locale.UK;
      int int0 = basicSingleEraDateTimeField0.getMaximumTextLength(locale0);
      assertEquals(48, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("org.joda.time.chrono.BasicSingleEraDateTimeField");
      long long0 = basicSingleEraDateTimeField0.roundCeiling(48);
      assertEquals(9223372036854775807L, long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("org.joda.time.chrono.BasicSingleEraDateTimeField");
      long long0 = basicSingleEraDateTimeField0.roundHalfFloor(1);
      assertEquals((-9223372036854775808L), long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("org.joda.time.chrono.BasicSingleEraDateTimeField");
      DurationField durationField0 = basicSingleEraDateTimeField0.getDurationField();
      assertEquals("eras", durationField0.getName());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BasicSingleEraDateTimeField basicSingleEraDateTimeField0 = new BasicSingleEraDateTimeField("org.joda.time.chrono.BasicSingleEraDateTimeField");
      boolean boolean0 = basicSingleEraDateTimeField0.isLenient();
      assertFalse(boolean0);
  }
}
