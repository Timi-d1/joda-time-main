import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        int int0 = org.joda.time.DateTimeConstants.FRIDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay1 = org.joda.time.YearMonthDay.fromCalendarFields(calendar0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The calendar must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.joda.time.field.DividedDateTimeField dividedDateTimeField0 = null;
        org.joda.time.DurationField durationField1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.RemainderDateTimeField remainderDateTimeField3 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField0, durationField1, dateTimeFieldType2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-35) + "'", int1 == (-35));
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((int) (short) 1, 10, (-1), (int) (byte) 1, (int) (short) 1, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfMonth must be in the range [1,31]: year: 1 month: 10");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        int int0 = org.joda.time.DateTimeConstants.JULY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.joda.time.Chronology chronology0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now(chronology0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Chronology must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.joda.time.tz.Provider provider0 = null;
        org.joda.time.DateTimeZone.setProvider(provider0);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.joda.time.Chronology chronology1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((java.lang.Object) (byte) 10, chronology1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds2 = org.joda.time.Seconds.secondsBetween(readablePartial0, readablePartial1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.joda.time.Chronology chronology2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth(5, (int) (short) 0, chronology2);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must not be smaller than 1");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property2 = dateTime1.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((java.lang.Object) property2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.DateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime3 = dateTimeFormatter0.parseMutableDateTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        java.io.DataInput dataInput0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.tz.DateTimeZoneBuilder.readFrom(dataInput0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Months months2 = org.joda.time.Months.monthsBetween(readablePartial0, readablePartial1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth yearMonth1 = new org.joda.time.YearMonth((java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth yearMonth4 = new org.joda.time.YearMonth(0, (int) (byte) 100, (org.joda.time.Chronology) julianChronology3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must not be larger than 12");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology3);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap0 = org.joda.time.DateTimeUtils.getDefaultTimeZoneNames();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((java.lang.Object) strMap0, (org.joda.time.Chronology) julianChronology2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.util.Collections$UnmodifiableMap");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap0);
        org.junit.Assert.assertNotNull(julianChronology2);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.ReadablePartial readablePartial2 = null;
        org.joda.time.PeriodType periodType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period4 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDateTime1, readablePartial2, periodType3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.FormatUtils.appendUnpaddedInteger(stringBuffer0, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.OffsetDateTimeField offsetDateTimeField2 = new org.joda.time.field.OffsetDateTimeField(dateTimeField0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.forStyle("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style specification: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property2 = dateTime1.dayOfWeek();
        org.joda.time.LocalDate localDate3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime4 = dateTime1.withDate(localDate3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.fullTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth yearMonth2 = org.joda.time.YearMonth.parse("", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.hourMinuteSecond();
        java.lang.StringBuffer stringBuffer1 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property4 = dateTime3.dayOfWeek();
        int int5 = dateTime3.getWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(stringBuffer1, (org.joda.time.ReadableInstant) dateTime3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1970 + "'", int5 == 1970);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        int int0 = org.joda.time.chrono.CopticChronology.AM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property3 = dateTime1.property(dateTimeFieldType2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.JulianChronology julianChronology5 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((java.lang.Object) property3, (org.joda.time.Chronology) julianChronology5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.DateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(julianChronology5);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0, leapYearPatternType1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.FormatUtils.appendPaddedInteger(stringBuffer0, (int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Months months1 = org.joda.time.Months.parseMonths("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime3 = property1.set((int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(property1);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod();
        mutablePeriod0.addYears((int) (byte) 10);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.FormatUtils.appendPaddedInteger(stringBuffer0, 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone3);
        org.joda.time.Days days5 = org.joda.time.Days.THREE;
        int[] intArray8 = gregorianChronology4.get((org.joda.time.ReadablePeriod) days5, (long) 0, (-1L));
        org.joda.time.DurationField durationField9 = gregorianChronology4.halfdays();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((int) 'a', 10, 20179, (org.joda.time.Chronology) gregorianChronology4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 20179 for dayOfMonth must be in the range [1,31]: year: 97 month: 10");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 0 });
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks1 = org.joda.time.Weeks.parseWeeks("0");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"0\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((java.lang.Object) 0.0d, (org.joda.time.Chronology) gregorianChronology2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology2);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology1.weekyearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = gregorianChronology1.getDateTimeMillis(26, 1, (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for dayOfMonth must be in the range [1,31]: year: 26 month: 1");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.ONE;
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.plus((org.joda.time.ReadablePeriod) weeks3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight6 = dateMidnight2.withWeekOfWeekyear((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(dateMidnight4);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.addMonths((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime0.setDayOfWeek((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime0);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withField(dateTimeFieldType2, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfHalfday must be in the range [0,11]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property5 = dateTime3.property(dateTimeFieldType4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone6);
        org.joda.time.Chronology chronology8 = julianChronology7.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType4.getField((org.joda.time.Chronology) julianChronology7);
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology7);
        org.joda.time.Hours hours11 = org.joda.time.Hours.MIN_VALUE;
        // The following exception was thrown during execution in test generation
        try {
            mutableInterval10.setPeriodAfterStart((org.joda.time.ReadablePeriod) hours11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater than the start instant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(julianChronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(hours11);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        java.io.Writer writer2 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusMinutes((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minusWeeks(1970);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusMinutes((int) (byte) 100);
        org.joda.time.Hours hours13 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadablePartial) localDateTime8, (org.joda.time.ReadablePartial) localDateTime10);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(writer2, (org.joda.time.ReadablePartial) localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(hours13);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone1);
        org.joda.time.Days days3 = org.joda.time.Days.THREE;
        int[] intArray6 = gregorianChronology2.get((org.joda.time.ReadablePeriod) days3, (long) 0, (-1L));
        org.joda.time.DurationField durationField7 = gregorianChronology2.halfdays();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property10 = dateTime9.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = property10.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.DividedDateTimeField dividedDateTimeField12 = new org.joda.time.field.DividedDateTimeField(remainderDateTimeField0, durationField7, dateTimeFieldType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0 });
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusMinutes((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusWeeks(1970);
        int int6 = localDateTime5.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 13 + "'", int6 == 13);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        int int0 = org.joda.time.DateTimeConstants.MINUTES_PER_HOUR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 60 + "'", int0 == 60);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology1.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.JulianChronology julianChronology5 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone4);
        org.joda.time.Chronology chronology6 = julianChronology5.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay((java.lang.Object) gregorianChronology1, chronology6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.GregorianChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(julianChronology5);
        org.junit.Assert.assertNotNull(chronology6);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.Days days2 = org.joda.time.Days.THREE;
        int[] intArray5 = gregorianChronology1.get((org.joda.time.ReadablePeriod) days2, (long) 0, (-1L));
        org.joda.time.DurationField durationField6 = gregorianChronology1.halfdays();
        java.lang.String str7 = durationField6.toString();
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0 });
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DurationField[halfdays]" + "'", str7, "DurationField[halfdays]");
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        int int0 = org.joda.time.DateTimeConstants.AUGUST;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        int int0 = org.joda.time.DateTimeConstants.DAYS_PER_WEEK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusMinutes((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusWeeks(1970);
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusMinutes((int) (byte) 100);
        org.joda.time.Hours hours10 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadablePartial) localDateTime5, (org.joda.time.ReadablePartial) localDateTime7);
        int int11 = hours10.getHours();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 330958 + "'", int11 == 330958);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.Days days2 = org.joda.time.Days.THREE;
        int[] intArray5 = gregorianChronology1.get((org.joda.time.ReadablePeriod) days2, (long) 0, (-1L));
        org.joda.time.DurationField durationField6 = gregorianChronology1.halfdays();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology8 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone7);
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology11 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone10);
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology11);
        org.joda.time.DateTimeField dateTimeField13 = gregorianChronology11.weekyearOfCentury();
        int int14 = dateMidnight9.get(dateTimeField13);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime dateTime18 = dateTime16.withYear((-35));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.LimitChronology limitChronology19 = org.joda.time.chrono.LimitChronology.getInstance((org.joda.time.Chronology) gregorianChronology1, (org.joda.time.ReadableDateTime) dateMidnight9, (org.joda.time.ReadableDateTime) dateTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The lower limit must be come before than the upper limit");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0 });
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(gregorianChronology8);
        org.junit.Assert.assertNotNull(gregorianChronology11);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 26 + "'", int14 == 26);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime3 = dateTimeFormatter1.parseDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.addMonths((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime0.setMillisOfSecond(20179);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 20179 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime0);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicTime();
        java.lang.StringBuilder stringBuilder1 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(stringBuilder1, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = localDate0.withField(dateTimeFieldType1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'hourOfHalfday' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = org.joda.time.Instant.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        int int0 = org.joda.time.DateTimeConstants.DECEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone dateTimeZone2 = provider0.getZone("hi!");
        org.junit.Assert.assertNotNull(provider0);
        org.junit.Assert.assertNull(dateTimeZone2);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        int int0 = org.joda.time.DateTimeConstants.WEDNESDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(10, 0, (int) ' ', (-35));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -35 for millisOfSecond must not be smaller than 0");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.joda.time.IllegalInstantException illegalInstantException2 = new org.joda.time.IllegalInstantException((long) (short) 0, "hi!");
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.joda.time.Days days0 = org.joda.time.Days.THREE;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property3.getFieldType();
        boolean boolean5 = days0.equals((java.lang.Object) property3);
        org.joda.time.DateTime dateTime6 = property3.getDateTime();
        org.joda.time.DateTime.Property property7 = dateTime6.era();
        int int8 = property7.get();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property3 = dateTime1.property(dateTimeFieldType2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.JulianChronology julianChronology5 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone4);
        org.joda.time.Chronology chronology6 = julianChronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType2.getField((org.joda.time.Chronology) julianChronology5);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeField7.getAsShortText((int) (byte) 0, locale9);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property14 = dateTime12.property(dateTimeFieldType13);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField18 = new org.joda.time.field.OffsetDateTimeField(dateTimeField7, dateTimeFieldType13, (int) (byte) -1, (int) (byte) -1, (-35));
        int int20 = offsetDateTimeField18.getLeapAmount((long) (short) 0);
        java.util.Locale locale23 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long24 = offsetDateTimeField18.set((long) 60, "0", locale23);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for hourOfHalfday must be in the range [-1,-35]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(julianChronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 100, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = localTime2.compareTo((org.joda.time.ReadablePartial) localDateTime4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.joda.time.Days days0 = org.joda.time.Days.THREE;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property3.getFieldType();
        boolean boolean5 = days0.equals((java.lang.Object) property3);
        org.joda.time.DateTime dateTime6 = property3.getDateTime();
        org.joda.time.DurationField durationField7 = property3.getDurationField();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = property3.setCopy("GregorianChronology[UTC]");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"GregorianChronology[UTC]\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The calendar must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property2 = dateTime1.dayOfWeek();
        int int3 = dateTime1.getWeekyear();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime1.plus(readableDuration4);
        org.joda.time.DateTime.Property property6 = dateTime5.era();
        boolean boolean8 = dateTime5.isBefore(26L);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property14 = dateTime12.property(dateTimeFieldType13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.chrono.JulianChronology julianChronology16 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone15);
        org.joda.time.Chronology chronology17 = julianChronology16.withUTC();
        org.joda.time.DateTimeField dateTimeField18 = dateTimeFieldType13.getField((org.joda.time.Chronology) julianChronology16);
        org.joda.time.MutableInterval mutableInterval19 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology16);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.chrono.JulianChronology julianChronology21 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone20);
        org.joda.time.Chronology chronology22 = julianChronology21.withUTC();
        mutableInterval19.setChronology((org.joda.time.Chronology) julianChronology21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((java.lang.Object) boolean8, (org.joda.time.Chronology) julianChronology21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1970 + "'", int3 == 1970);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(julianChronology16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(julianChronology21);
        org.junit.Assert.assertNotNull(chronology22);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property5 = dateTime3.property(dateTimeFieldType4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone6);
        org.joda.time.Chronology chronology8 = julianChronology7.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType4.getField((org.joda.time.Chronology) julianChronology7);
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology7);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.chrono.JulianChronology julianChronology12 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone11);
        org.joda.time.Chronology chronology13 = julianChronology12.withUTC();
        mutableInterval10.setChronology((org.joda.time.Chronology) julianChronology12);
        mutableInterval10.setEndMillis((long) 'a');
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property19 = dateTime18.dayOfWeek();
        int int20 = dateTime18.getWeekyear();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime22 = dateTime18.plus(readableDuration21);
        boolean boolean23 = mutableInterval10.contains((org.joda.time.ReadableInstant) dateTime22);
        int int24 = dateTime22.getSecondOfMinute();
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(julianChronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(julianChronology12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1970 + "'", int20 == 1970);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        int int0 = org.joda.time.DateTimeConstants.MILLIS_PER_DAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 86400000 + "'", int0 == 86400000);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property3 = dateTime1.property(dateTimeFieldType2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.JulianChronology julianChronology5 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone4);
        org.joda.time.Chronology chronology6 = julianChronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType2.getField((org.joda.time.Chronology) julianChronology5);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property12 = dateTime10.property(dateTimeFieldType11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.chrono.JulianChronology julianChronology14 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone13);
        org.joda.time.Chronology chronology15 = julianChronology14.withUTC();
        org.joda.time.DateTimeField dateTimeField16 = dateTimeFieldType11.getField((org.joda.time.Chronology) julianChronology14);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.Chronology chronology18 = julianChronology14.withZone(dateTimeZone17);
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((long) '#', chronology18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay20 = new org.joda.time.TimeOfDay((java.lang.Object) dateTimeFieldType2, chronology18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(julianChronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(julianChronology14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(chronology18);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusMinutes((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusWeeks(1970);
        int int6 = localDateTime5.getDayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withDayOfWeek((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        boolean boolean0 = org.joda.time.tz.ZoneInfoLogger.verbose();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.joda.time.Days days0 = org.joda.time.Days.MIN_VALUE;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds1 = days0.toStandardSeconds();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -2147483648 * 86400");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days0);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) -1, chronology1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.withMonthOfYear(13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 13 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property3 = dateTime1.property(dateTimeFieldType2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.JulianChronology julianChronology5 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone4);
        org.joda.time.Chronology chronology6 = julianChronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType2.getField((org.joda.time.Chronology) julianChronology5);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = julianChronology5.getDateTimeMillis(0L, 5, 60, 7, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 60 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(julianChronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.Days days2 = org.joda.time.Days.THREE;
        int[] intArray5 = gregorianChronology1.get((org.joda.time.ReadablePeriod) days2, (long) 0, (-1L));
        org.joda.time.DurationField durationField6 = gregorianChronology1.halfdays();
        long long9 = durationField6.subtract((long) 7, (int) '#');
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0 });
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1511999993L) + "'", long9 == (-1511999993L));
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property3 = dateTime1.property(dateTimeFieldType2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.JulianChronology julianChronology5 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone4);
        org.joda.time.Chronology chronology6 = julianChronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType2.getField((org.joda.time.Chronology) julianChronology5);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeField7.getAsShortText((int) (byte) 0, locale9);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property14 = dateTime12.property(dateTimeFieldType13);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField18 = new org.joda.time.field.OffsetDateTimeField(dateTimeField7, dateTimeFieldType13, (int) (byte) -1, (int) (byte) -1, (-35));
        // The following exception was thrown during execution in test generation
        try {
            long long21 = offsetDateTimeField18.set((long) (byte) 0, "GregorianChronology[UTC]");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"GregorianChronology[UTC]\" for hourOfHalfday is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(julianChronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property5 = dateTime3.property(dateTimeFieldType4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone6);
        org.joda.time.Chronology chronology8 = julianChronology7.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType4.getField((org.joda.time.Chronology) julianChronology7);
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology7);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.chrono.JulianChronology julianChronology13 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone12);
        org.joda.time.Chronology chronology14 = julianChronology13.withUTC();
        java.util.Locale locale15 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, (org.joda.time.Chronology) julianChronology13, locale15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology18 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone17);
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology21 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone20);
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology21);
        org.joda.time.DateTimeField dateTimeField23 = gregorianChronology21.weekyearOfCentury();
        int int24 = dateMidnight19.get(dateTimeField23);
        org.joda.time.field.SkipDateTimeField skipDateTimeField25 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) julianChronology13, dateTimeField23);
        mutableInterval10.setChronology((org.joda.time.Chronology) julianChronology13);
        mutableInterval10.setEndMillis((long) 31);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(julianChronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(julianChronology13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(gregorianChronology18);
        org.junit.Assert.assertNotNull(gregorianChronology21);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 26 + "'", int24 == 26);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.joda.time.format.PeriodFormatter periodFormatter0 = org.joda.time.format.ISOPeriodFormat.alternateExtended();
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.format.PeriodFormatter periodFormatter2 = periodFormatter0.withParseType(periodType1);
        java.io.Writer writer3 = null;
        org.joda.time.Years years4 = org.joda.time.Years.MIN_VALUE;
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter0.printTo(writer3, (org.joda.time.ReadablePeriod) years4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodFormatter0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodFormatter2);
        org.junit.Assert.assertNotNull(years4);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property4 = dateTime2.property(dateTimeFieldType3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.JulianChronology julianChronology6 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone5);
        org.joda.time.Chronology chronology7 = julianChronology6.withUTC();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType3.getField((org.joda.time.Chronology) julianChronology6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.Chronology chronology10 = julianChronology6.withZone(dateTimeZone9);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((long) '#', chronology10);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime.Property property13 = localTime11.property(dateTimeFieldType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(julianChronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property2 = dateTime1.dayOfWeek();
        int int3 = dateTime1.getWeekyear();
        int int4 = dateTime1.getSecondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = dateTime1.withDate((int) (short) 1, 3, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfMonth must be in the range [1,31]: year: 1 month: 3");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1970 + "'", int3 == 1970);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.joda.time.Days days0 = org.joda.time.Days.THREE;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property3.getFieldType();
        boolean boolean5 = days0.equals((java.lang.Object) property3);
        org.joda.time.DateTime dateTime6 = property3.getDateTime();
        org.joda.time.DurationField durationField7 = property3.getDurationField();
        long long10 = durationField7.getDifferenceAsLong(0L, (long) ' ');
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (short) 100, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 101L + "'", long2 == 101L);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.Partial partial2 = new org.joda.time.Partial((org.joda.time.Chronology) gregorianChronology1);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = partial2.getValue(3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology1);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property5 = dateTime3.property(dateTimeFieldType4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone6);
        org.joda.time.Chronology chronology8 = julianChronology7.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType4.getField((org.joda.time.Chronology) julianChronology7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = julianChronology7.withZone(dateTimeZone10);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) '#', chronology11);
        org.joda.time.LocalTime localTime14 = localTime12.plusSeconds((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = localDate0.toDateTime(localTime14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The chronology of the time does not match");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(julianChronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(localTime14);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone2);
        org.joda.time.Days days4 = org.joda.time.Days.THREE;
        int[] intArray7 = gregorianChronology3.get((org.joda.time.ReadablePeriod) days4, (long) 0, (-1L));
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology3.dayOfMonth();
        org.joda.time.DurationField durationField9 = gregorianChronology3.eras();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval((long) 1970, (long) (byte) 1, (org.joda.time.Chronology) gregorianChronology3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater than the start instant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 0 });
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property2 = dateTime1.dayOfWeek();
        int int3 = dateTime1.getWeekyear();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime1.plus(readableDuration4);
        org.joda.time.DateTime.Property property6 = dateTime5.era();
        boolean boolean8 = dateTime5.isBefore(26L);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property13 = dateTime11.property(dateTimeFieldType12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.chrono.JulianChronology julianChronology15 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone14);
        org.joda.time.Chronology chronology16 = julianChronology15.withUTC();
        org.joda.time.DateTimeField dateTimeField17 = dateTimeFieldType12.getField((org.joda.time.Chronology) julianChronology15);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.Chronology chronology19 = julianChronology15.withZone(dateTimeZone18);
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((long) '#', chronology19);
        org.joda.time.DateTime dateTime21 = dateTime5.withChronology(chronology19);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1970 + "'", int3 == 1970);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(julianChronology15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTime21);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateHourMinuteSecondFraction();
        java.lang.Integer int1 = dateTimeFormatter0.getPivotYear();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.joda.time.Hours hours0 = org.joda.time.Hours.FOUR;
        org.joda.time.Days days2 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType3 = days2.getFieldType();
        org.joda.time.PeriodType periodType4 = days2.getPeriodType();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property10 = dateTime8.property(dateTimeFieldType9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.chrono.JulianChronology julianChronology12 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone11);
        org.joda.time.Chronology chronology13 = julianChronology12.withUTC();
        org.joda.time.DateTimeField dateTimeField14 = dateTimeFieldType9.getField((org.joda.time.Chronology) julianChronology12);
        org.joda.time.MutableInterval mutableInterval15 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology12);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.chrono.JulianChronology julianChronology17 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone16);
        org.joda.time.Chronology chronology18 = julianChronology17.withUTC();
        mutableInterval15.setChronology((org.joda.time.Chronology) julianChronology17);
        org.joda.time.Period period20 = new org.joda.time.Period((long) (byte) 0, periodType4, (org.joda.time.Chronology) julianChronology17);
        org.joda.time.PeriodType periodType21 = periodType4.withDaysRemoved();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.chrono.JulianChronology julianChronology23 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone22);
        org.joda.time.MonthDay monthDay24 = org.joda.time.MonthDay.now((org.joda.time.Chronology) julianChronology23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((java.lang.Object) hours0, periodType4, (org.joda.time.Chronology) julianChronology23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'hours'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(julianChronology12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(julianChronology17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(julianChronology23);
        org.junit.Assert.assertNotNull(monthDay24);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property6 = dateTime4.property(dateTimeFieldType5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.chrono.JulianChronology julianChronology8 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone7);
        org.joda.time.Chronology chronology9 = julianChronology8.withUTC();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType5.getField((org.joda.time.Chronology) julianChronology8);
        org.joda.time.MutableInterval mutableInterval11 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay((java.lang.Object) "GregorianChronology[UTC]", (org.joda.time.Chronology) julianChronology8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"GregorianChronology[UTC]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(julianChronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        java.lang.String[] strArray6 = new java.lang.String[] { "26", "26", "", "hi!", "[]" };
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "26", "[]", "0", "days" };
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder14 = periodFormatterBuilder0.appendPrefix(strArray6, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "26", "26", "", "hi!", "[]" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "26", "[]", "0", "days" });
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property3 = dateTime1.property(dateTimeFieldType2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.JulianChronology julianChronology5 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone4);
        org.joda.time.Chronology chronology6 = julianChronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType2.getField((org.joda.time.Chronology) julianChronology5);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeField7.getAsShortText((int) (byte) 0, locale9);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property14 = dateTime12.property(dateTimeFieldType13);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField18 = new org.joda.time.field.OffsetDateTimeField(dateTimeField7, dateTimeFieldType13, (int) (byte) -1, (int) (byte) -1, (-35));
        int int20 = offsetDateTimeField18.getLeapAmount((long) (short) 0);
        org.joda.time.ReadablePartial readablePartial21 = null;
        int[] intArray25 = new int[] { (short) 10, 60 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = offsetDateTimeField18.addWrapPartial(readablePartial21, 0, intArray25, 7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2147483630 for hourOfHalfday must be in the range [-1,-35]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(julianChronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 2147483630, 60 });
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfMonth((int) (byte) 1);
        org.joda.time.Instant instant4 = dateTime3.toInstant();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.Instant instant6 = instant4.minus(readableDuration5);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(instant6);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property5 = dateTime3.property(dateTimeFieldType4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone6);
        org.joda.time.Chronology chronology8 = julianChronology7.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType4.getField((org.joda.time.Chronology) julianChronology7);
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology7);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.chrono.JulianChronology julianChronology12 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone11);
        org.joda.time.Chronology chronology13 = julianChronology12.withUTC();
        mutableInterval10.setChronology((org.joda.time.Chronology) julianChronology12);
        mutableInterval10.setEndMillis((long) 'a');
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime dateTime20 = dateTime18.withYearOfCentury(60);
        // The following exception was thrown during execution in test generation
        try {
            mutableInterval10.setEnd((org.joda.time.ReadableInstant) dateTime20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater than the start instant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(julianChronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(julianChronology12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTime20);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property2 = dateTime1.dayOfWeek();
        int int3 = dateTime1.getWeekyear();
        int int4 = dateTime1.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology6 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone5);
        org.joda.time.Days days7 = org.joda.time.Days.THREE;
        int[] intArray10 = gregorianChronology6.get((org.joda.time.ReadablePeriod) days7, (long) 0, (-1L));
        org.joda.time.Duration duration11 = days7.toStandardDuration();
        org.joda.time.DateTime dateTime13 = dateTime1.withDurationAdded((org.joda.time.ReadableDuration) duration11, 26);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property20 = dateTime18.property(dateTimeFieldType19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.chrono.JulianChronology julianChronology22 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone21);
        org.joda.time.Chronology chronology23 = julianChronology22.withUTC();
        org.joda.time.DateTimeField dateTimeField24 = dateTimeFieldType19.getField((org.joda.time.Chronology) julianChronology22);
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology22);
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) (short) -1, (org.joda.time.Chronology) julianChronology22);
        boolean boolean27 = duration11.equals((java.lang.Object) (short) -1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1970 + "'", int3 == 1970);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(gregorianChronology6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(julianChronology22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.JodaTimePermission jodaTimePermission1 = new org.joda.time.JodaTimePermission("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: name can't be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.Chronology chronology3 = julianChronology2.withUTC();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, (org.joda.time.Chronology) julianChronology2, locale4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology7 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone6);
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology10 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone9);
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology10);
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology10.weekyearOfCentury();
        int int13 = dateMidnight8.get(dateTimeField12);
        org.joda.time.field.SkipDateTimeField skipDateTimeField14 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) julianChronology2, dateTimeField12);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = julianChronology2.getDateTimeMillis(1, 12, 0, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(gregorianChronology7);
        org.junit.Assert.assertNotNull(gregorianChronology10);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 26 + "'", int13 == 26);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicDateTimeNoMillis();
        java.lang.StringBuilder stringBuilder1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.now();
        mutableDateTime2.addMonths((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(stringBuilder1, (org.joda.time.ReadableInstant) mutableDateTime2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(mutableDateTime2);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.setMillis((-1L));
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime dateTime6 = dateTime4.withYearOfCentury(60);
        mutableDateTime0.setMillis((org.joda.time.ReadableInstant) dateTime6);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime0.setDayOfWeek((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withYearOfEra(10);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusHours((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.dayOfYear();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Years years9 = org.joda.time.Years.yearsBetween((org.joda.time.ReadablePartial) localDate2, (org.joda.time.ReadablePartial) localDateTime6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must have the same set of fields");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.joda.time.Hours hours0 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.PeriodType periodType1 = hours0.getPeriodType();
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(periodType1);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((int) ' ', 0, (int) (byte) 10, (int) (byte) 0, (org.joda.time.Chronology) gregorianChronology5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology5);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.date();
        java.lang.StringBuilder stringBuilder1 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(stringBuilder1, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) gregorianChronology1, dateTimeZone3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DateTimeZone must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology1);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property4 = dateTime2.property(dateTimeFieldType3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.JulianChronology julianChronology6 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone5);
        org.joda.time.Chronology chronology7 = julianChronology6.withUTC();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType3.getField((org.joda.time.Chronology) julianChronology6);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeField8.getAsShortText((int) (byte) 0, locale10);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property15 = dateTime13.property(dateTimeFieldType14);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField19 = new org.joda.time.field.OffsetDateTimeField(dateTimeField8, dateTimeFieldType14, (int) (byte) -1, (int) (byte) -1, (-35));
        // The following exception was thrown during execution in test generation
        try {
            int int20 = localDate0.get(dateTimeFieldType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'hourOfHalfday' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(julianChronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0" + "'", str11, "0");
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property2 = dateTime1.dayOfWeek();
        int int3 = dateTime1.getWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.toDateTime();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property8 = dateTime6.property(dateTimeFieldType7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = dateTime4.withField(dateTimeFieldType7, 13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 13 for hourOfHalfday must be in the range [0,11]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1970 + "'", int3 == 1970);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.JulianChronology julianChronology1 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone0);
        org.joda.time.MonthDay monthDay2 = org.joda.time.MonthDay.now((org.joda.time.Chronology) julianChronology1);
        // The following exception was thrown during execution in test generation
        try {
            long long10 = julianChronology1.getDateTimeMillis(20179, (int) 'a', (-35), 31, 0, 60, 20179);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 31 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology1);
        org.junit.Assert.assertNotNull(monthDay2);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = dateTimeFormatter1.parseLocalDate("GregorianChronology[UTC]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"GregorianChronology[UTC]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.weekOfWeekyear();
        org.junit.Assert.assertNotNull(property2);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusMinutes((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusWeeks(1970);
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusMinutes((int) (byte) 100);
        org.joda.time.Hours hours10 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadablePartial) localDateTime5, (org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property14 = dateTime12.property(dateTimeFieldType13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.chrono.JulianChronology julianChronology16 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone15);
        org.joda.time.Chronology chronology17 = julianChronology16.withUTC();
        org.joda.time.DateTimeField dateTimeField18 = dateTimeFieldType13.getField((org.joda.time.Chronology) julianChronology16);
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeField18.getAsShortText((int) (byte) 0, locale20);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property25 = dateTime23.property(dateTimeFieldType24);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField29 = new org.joda.time.field.OffsetDateTimeField(dateTimeField18, dateTimeFieldType24, (int) (byte) -1, (int) (byte) -1, (-35));
        org.joda.time.Partial partial31 = new org.joda.time.Partial(dateTimeFieldType24, 2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime33 = localDateTime7.withField(dateTimeFieldType24, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfHalfday must be in the range [0,11]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(julianChronology16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0" + "'", str21, "0");
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(property25);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.dateHourMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.parse("days", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"days\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        int int0 = org.joda.time.DateTimeConstants.OCTOBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property5 = dateTime3.property(dateTimeFieldType4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone6);
        org.joda.time.Chronology chronology8 = julianChronology7.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType4.getField((org.joda.time.Chronology) julianChronology7);
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology7);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.chrono.JulianChronology julianChronology12 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone11);
        org.joda.time.Chronology chronology13 = julianChronology12.withUTC();
        mutableInterval10.setChronology((org.joda.time.Chronology) julianChronology12);
        mutableInterval10.setEndMillis((long) 'a');
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property19 = dateTime18.dayOfWeek();
        int int20 = dateTime18.getWeekyear();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime22 = dateTime18.plus(readableDuration21);
        boolean boolean23 = mutableInterval10.contains((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.Interval interval24 = mutableInterval10.toInterval();
        java.lang.String str25 = mutableInterval10.toString();
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(julianChronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(julianChronology12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1970 + "'", int20 == 1970);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1969-12-19T00:00:00.007Z/1969-12-19T00:00:00.097Z" + "'", str25, "1969-12-19T00:00:00.007Z/1969-12-19T00:00:00.097Z");
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.weekyear();
        int int4 = dateMidnight2.getDayOfWeek();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod();
        org.joda.time.Days days6 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType7 = days6.getFieldType();
        org.joda.time.PeriodType periodType8 = days6.getPeriodType();
        mutablePeriod5.add((org.joda.time.ReadablePeriod) days6);
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight2.plus((org.joda.time.ReadablePeriod) mutablePeriod5);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod();
        mutablePeriod11.setMonths(0);
        boolean boolean14 = mutablePeriod5.equals((java.lang.Object) 0);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.dayOfYear();
        java.util.Locale locale5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight6 = property3.setCopy("hi!", locale5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"hi!\" for dayOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property2 = dateTime1.dayOfWeek();
        org.joda.time.DurationField durationField3 = property2.getRangeDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(durationField3);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(10, 10, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property3 = dateTime1.property(dateTimeFieldType2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.JulianChronology julianChronology5 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone4);
        org.joda.time.Chronology chronology6 = julianChronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType2.getField((org.joda.time.Chronology) julianChronology5);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeField7.getAsShortText((int) (byte) 0, locale9);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property14 = dateTime12.property(dateTimeFieldType13);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField18 = new org.joda.time.field.OffsetDateTimeField(dateTimeField7, dateTimeFieldType13, (int) (byte) -1, (int) (byte) -1, (-35));
        org.joda.time.Partial partial20 = new org.joda.time.Partial(dateTimeFieldType13, 2);
        org.joda.time.Days days22 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType23 = days22.getFieldType();
        org.joda.time.PeriodType periodType24 = days22.getPeriodType();
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property30 = dateTime28.property(dateTimeFieldType29);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.chrono.JulianChronology julianChronology32 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone31);
        org.joda.time.Chronology chronology33 = julianChronology32.withUTC();
        org.joda.time.DateTimeField dateTimeField34 = dateTimeFieldType29.getField((org.joda.time.Chronology) julianChronology32);
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology32);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.chrono.JulianChronology julianChronology37 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone36);
        org.joda.time.Chronology chronology38 = julianChronology37.withUTC();
        mutableInterval35.setChronology((org.joda.time.Chronology) julianChronology37);
        org.joda.time.Period period40 = new org.joda.time.Period((long) (byte) 0, periodType24, (org.joda.time.Chronology) julianChronology37);
        org.joda.time.Partial partial41 = partial20.plus((org.joda.time.ReadablePeriod) period40);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period43 = period40.withHours((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(julianChronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(julianChronology32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(julianChronology37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(partial41);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime dateTime3 = dateTime1.withYear((-35));
        org.joda.time.DateTime dateTime5 = dateTime1.plusMillis(1970);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfWeek();
        int int9 = dateTime7.getWeekyear();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime7.plus(readableDuration10);
        org.joda.time.DateTime dateTime13 = dateTime11.minusMillis((-1));
        boolean boolean14 = dateTime5.equals((java.lang.Object) (-1));
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Years years1 = org.joda.time.Years.parseYears("91");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"91\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.joda.time.Hours hours0 = org.joda.time.Hours.FOUR;
        org.joda.time.Hours hours2 = hours0.dividedBy((int) (short) -1);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property5 = dateTime4.dayOfWeek();
        int int6 = dateTime4.getWeekyear();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime4.plus(readableDuration7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) hours2, (org.joda.time.ReadableInstant) dateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater than the start instant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight1 = org.joda.time.DateMidnight.parse("GregorianChronology[UTC]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"GregorianChronology[UTC]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfMonth((int) (byte) 1);
        org.joda.time.Years years4 = org.joda.time.Years.MIN_VALUE;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = dateTime1.minus((org.joda.time.ReadablePeriod) years4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 2147483648");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(years4);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        int int0 = org.joda.time.DateTimeConstants.BCE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.dayOfYear();
        org.joda.time.DateMidnight dateMidnight4 = property3.roundHalfEvenCopy();
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.plusWeeks((int) (byte) 10);
        boolean boolean8 = dateMidnight6.isBefore((long) (byte) 1);
        boolean boolean9 = dateMidnight6.isEqualNow();
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.Chronology chronology3 = julianChronology2.withUTC();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, (org.joda.time.Chronology) julianChronology2, locale4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology7 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone6);
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology10 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone9);
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology10);
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology10.weekyearOfCentury();
        int int13 = dateMidnight8.get(dateTimeField12);
        org.joda.time.field.SkipDateTimeField skipDateTimeField14 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) julianChronology2, dateTimeField12);
        int int15 = skipDateTimeField14.getMinimumValue();
        java.util.Locale locale17 = null;
        java.lang.String str18 = skipDateTimeField14.getAsShortText(26, locale17);
        org.joda.time.ReadablePartial readablePartial19 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property24 = dateTime22.property(dateTimeFieldType23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.chrono.JulianChronology julianChronology26 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone25);
        org.joda.time.Chronology chronology27 = julianChronology26.withUTC();
        org.joda.time.DateTimeField dateTimeField28 = dateTimeFieldType23.getField((org.joda.time.Chronology) julianChronology26);
        java.util.Locale locale30 = null;
        java.lang.String str31 = dateTimeField28.getAsShortText((int) (byte) 0, locale30);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property35 = dateTime33.property(dateTimeFieldType34);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField39 = new org.joda.time.field.OffsetDateTimeField(dateTimeField28, dateTimeFieldType34, (int) (byte) -1, (int) (byte) -1, (-35));
        int int41 = offsetDateTimeField39.getLeapAmount((long) (short) 0);
        org.joda.time.DateTimeField dateTimeField42 = org.joda.time.field.StrictDateTimeField.getInstance((org.joda.time.DateTimeField) offsetDateTimeField39);
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property47 = dateTime45.property(dateTimeFieldType46);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.chrono.JulianChronology julianChronology49 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone48);
        org.joda.time.Chronology chronology50 = julianChronology49.withUTC();
        org.joda.time.DateTimeField dateTimeField51 = dateTimeFieldType46.getField((org.joda.time.Chronology) julianChronology49);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.Chronology chronology53 = julianChronology49.withZone(dateTimeZone52);
        org.joda.time.LocalTime localTime54 = new org.joda.time.LocalTime((long) '#', chronology53);
        org.joda.time.LocalTime localTime56 = localTime54.plusSeconds((int) 'a');
        int[] intArray60 = new int[] { 26, '#', 31 };
        int int61 = offsetDateTimeField39.getMinimumValue((org.joda.time.ReadablePartial) localTime56, intArray60);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray63 = skipDateTimeField14.set(readablePartial19, (int) '4', intArray60, 1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for weekyearOfCentury must be in the range [1,100]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(gregorianChronology7);
        org.junit.Assert.assertNotNull(gregorianChronology10);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 26 + "'", int13 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "26" + "'", str18, "26");
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(julianChronology26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "0" + "'", str31, "0");
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeFieldType46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(julianChronology49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(localTime56);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertArrayEquals(intArray60, new int[] { 26, 35, 31 });
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateHourMinuteSecond();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        java.lang.Appendable appendable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.FormatUtils.appendPaddedInteger(appendable0, (long) (-35), 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.JulianChronology julianChronology1 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone0);
        org.joda.time.Chronology chronology2 = julianChronology1.withUTC();
        org.joda.time.DurationField durationField3 = julianChronology1.hours();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = julianChronology1.getDateTimeMillis((long) 2, 2, 330958, (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 330958 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(durationField3);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = iSOChronology0.getDateTimeMillis(12, (int) '#', (int) '4', 26, (-35), (int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.joda.time.Months months0 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months2 = months0.multipliedBy(100);
        org.junit.Assert.assertNotNull(months0);
        org.junit.Assert.assertNotNull(months2);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.setDayOfYear(8);
        int int3 = mutableDateTime0.getYearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime0.setDayOfYear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 25 + "'", int3 == 25);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.JulianChronology julianChronology1 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone0);
        org.joda.time.Chronology chronology2 = julianChronology1.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = julianChronology1.getDateTimeMillis(1970, 26, (int) (short) 100, 31, 7, (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 31 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology1);
        org.junit.Assert.assertNotNull(chronology2);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property3 = dateTime1.property(dateTimeFieldType2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.JulianChronology julianChronology5 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone4);
        org.joda.time.Chronology chronology6 = julianChronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType2.getField((org.joda.time.Chronology) julianChronology5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.Chronology chronology9 = julianChronology5.withZone(dateTimeZone8);
        org.joda.time.chrono.StrictChronology strictChronology10 = org.joda.time.chrono.StrictChronology.getInstance(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology9.yearOfCentury();
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(julianChronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(strictChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone2);
        org.joda.time.Days days4 = org.joda.time.Days.THREE;
        int[] intArray7 = gregorianChronology3.get((org.joda.time.ReadablePeriod) days4, (long) 0, (-1L));
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology3.dayOfMonth();
        org.joda.time.DurationField durationField9 = gregorianChronology3.years();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial10 = new org.joda.time.Partial(dateTimeFieldType0, 31, (org.joda.time.Chronology) gregorianChronology3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 31 for hourOfHalfday must not be larger than 11");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 0 });
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((java.lang.Object) dateTimeZone0, dateTimeZone2);
        int int4 = mutableDateTime3.getRoundingMode();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime3.setDayOfWeek(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        int int0 = org.joda.time.TimeOfDay.MILLIS_OF_SECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property3 = dateTime1.property(dateTimeFieldType2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.JulianChronology julianChronology5 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone4);
        org.joda.time.Chronology chronology6 = julianChronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType2.getField((org.joda.time.Chronology) julianChronology5);
        java.lang.String str9 = dateTimeField7.getAsText((long) 86400000);
        org.joda.time.DurationField durationField10 = dateTimeField7.getLeapDurationField();
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(julianChronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
        org.junit.Assert.assertNull(durationField10);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.joda.time.Duration duration1 = new org.joda.time.Duration(101L);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone0, 3);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology2.clockhourOfDay();
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.ONE;
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.plus((org.joda.time.ReadablePeriod) weeks3);
        org.joda.time.DateMidnight.Property property5 = dateMidnight2.dayOfYear();
        int int6 = dateMidnight2.getMinuteOfDay();
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.ONE;
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.plus((org.joda.time.ReadablePeriod) weeks3);
        java.util.Date date5 = dateMidnight2.toDate();
        org.joda.time.YearMonthDay yearMonthDay6 = org.joda.time.YearMonthDay.fromDateFields(date5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = yearMonthDay6.toDateMidnight(dateTimeZone7);
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay6.plusMonths(8);
        org.joda.time.YearMonthDay.Property property11 = yearMonthDay6.monthOfYear();
        java.util.Locale locale13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay14 = property11.setCopy("31", locale13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"31\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Mon Mar 31 20:00:00 EDT 2025");
        org.junit.Assert.assertNotNull(yearMonthDay6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.MIN_VALUE;
        boolean boolean2 = minutes0.isGreaterThan(minutes1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((java.lang.Object) minutes1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.Minutes");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval1 = org.joda.time.Interval.parse("GregorianChronology[UTC]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Format requires a '/' separator: GregorianChronology[UTC]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            long long3 = dateTimeFormatter1.parseMillis("31");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"31\" is too short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(31, (int) (byte) 100, 7, 10, 86400000, 2, dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86400000 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone7);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) -1, chronology1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.withDayOfWeek(330958);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 330958 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.ONE;
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.plus((org.joda.time.ReadablePeriod) weeks3);
        org.joda.time.DateMidnight.Property property5 = dateMidnight2.dayOfYear();
        java.util.Locale locale6 = null;
        int int7 = property5.getMaximumTextLength(locale6);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.joda.time.Months months0 = org.joda.time.Months.MAX_VALUE;
        org.joda.time.Months months1 = org.joda.time.Months.EIGHT;
        org.joda.time.Months months2 = months0.minus(months1);
        org.joda.time.Months months4 = months1.minus((int) 'a');
        org.junit.Assert.assertNotNull(months0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertNotNull(months2);
        org.junit.Assert.assertNotNull(months4);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime2 = property1.roundFloor();
        org.joda.time.DateTimeField dateTimeField3 = property1.getField();
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.Partial partial2 = new org.joda.time.Partial((org.joda.time.Chronology) gregorianChronology1);
        java.lang.String str3 = partial2.toStringList();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((long) 100, dateTimeZone5);
        org.joda.time.Days days7 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType8 = days7.getFieldType();
        boolean boolean9 = localTime6.isSupported(durationFieldType8);
        java.lang.String str10 = durationFieldType8.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial12 = partial2.withFieldAddWrapped(durationFieldType8, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'days' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "days" + "'", str10, "days");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        int int1 = mutableDateTime0.getMillisOfDay();
        org.junit.Assert.assertNotNull(mutableDateTime0);
// flaky "1) test0157(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 70067048 + "'", int1 == 70067048);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("[]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"[]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = org.joda.time.Instant.parse("[]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"[]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = org.joda.time.format.ISODateTimeFormat.dateHourMinuteSecondFraction();
        boolean boolean10 = dateTimeZone8.equals((java.lang.Object) dateTimeFormatter9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(12, 0, 1, 32, 12, 7, (int) (byte) 10, dateTimeZone8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusHours((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.dayOfYear();
        org.joda.time.LocalDateTime.Property property5 = localDateTime3.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology7 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone6);
        org.joda.time.Days days8 = org.joda.time.Days.THREE;
        int[] intArray11 = gregorianChronology7.get((org.joda.time.ReadablePeriod) days8, (long) 0, (-1L));
        org.joda.time.Duration duration12 = days8.toStandardDuration();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime3.minus((org.joda.time.ReadableDuration) duration12);
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod();
        mutablePeriod14.addWeeks((-1));
        org.joda.time.LocalDateTime localDateTime18 = localDateTime13.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod14, 5);
        java.lang.String str19 = mutablePeriod14.toString();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(gregorianChronology7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "P-1W" + "'", str19, "P-1W");
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusHours((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology6 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone5);
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology6);
        org.joda.time.DateMidnight.Property property8 = dateMidnight7.dayOfYear();
        org.joda.time.DateMidnight dateMidnight9 = property8.roundHalfEvenCopy();
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.plusWeeks((int) (byte) 10);
        org.joda.time.Days days12 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType13 = days12.getFieldType();
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight11.withFieldAdded(durationFieldType13, 26);
        boolean boolean16 = localDateTime3.isSupported(durationFieldType13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime18 = localDateTime3.withSecondOfMinute(1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(gregorianChronology6);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.setMillis((-1L));
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime dateTime6 = dateTime4.withYearOfCentury(60);
        mutableDateTime0.setMillis((org.joda.time.ReadableInstant) dateTime6);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime0.setTime(4, (-1), (int) (byte) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property2 = dateTime1.dayOfWeek();
        int int3 = dateTime1.getWeekyear();
        int int4 = dateTime1.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology6 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone5);
        org.joda.time.Days days7 = org.joda.time.Days.THREE;
        int[] intArray10 = gregorianChronology6.get((org.joda.time.ReadablePeriod) days7, (long) 0, (-1L));
        org.joda.time.Duration duration11 = days7.toStandardDuration();
        org.joda.time.DateTime dateTime13 = dateTime1.withDurationAdded((org.joda.time.ReadableDuration) duration11, 26);
        org.joda.time.Duration duration15 = duration11.multipliedBy((long) (short) 1);
        org.joda.time.Duration duration16 = duration15.toDuration();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property19 = dateTime18.dayOfWeek();
        org.joda.time.format.PeriodFormatter periodFormatter20 = org.joda.time.format.ISOPeriodFormat.alternateExtended();
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.format.PeriodFormatter periodFormatter22 = periodFormatter20.withParseType(periodType21);
        org.joda.time.Period period23 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration15, (org.joda.time.ReadableInstant) dateTime18, periodType21);
        int int24 = period23.getHours();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1970 + "'", int3 == 1970);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(gregorianChronology6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(periodFormatter20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodFormatter22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        org.junit.Assert.assertNotNull(strSet0);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        int int0 = org.joda.time.DateTimeConstants.SECONDS_PER_DAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 86400 + "'", int0 == 86400);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (short) -1, (long) 2025);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2024L + "'", long2 == 2024L);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 100, dateTimeZone1);
        org.joda.time.Days days3 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType4 = days3.getFieldType();
        boolean boolean5 = localTime2.isSupported(durationFieldType4);
        java.lang.String str6 = durationFieldType4.toString();
        java.lang.String str7 = durationFieldType4.toString();
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "days" + "'", str6, "days");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "days" + "'", str7, "days");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone3);
        org.joda.time.Days days5 = org.joda.time.Days.THREE;
        int[] intArray8 = gregorianChronology4.get((org.joda.time.ReadablePeriod) days5, (long) 0, (-1L));
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology4.dayOfMonth();
        org.joda.time.DurationField durationField10 = gregorianChronology4.millis();
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 26, (org.joda.time.Chronology) gregorianChronology4, locale11);
        org.joda.time.Chronology chronology13 = gregorianChronology4.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth yearMonth14 = new org.joda.time.YearMonth(10, (int) '#', (org.joda.time.Chronology) gregorianChronology4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for monthOfYear must not be larger than 12");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 0 });
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        int int0 = org.joda.time.MonthDay.DAY_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        int int0 = org.joda.time.DateTimeConstants.MARCH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.dayOfYear();
        org.joda.time.DateMidnight dateMidnight4 = property3.roundHalfEvenCopy();
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.withYearOfCentury(100);
        java.lang.String str7 = dateMidnight4.toString();
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2025-04-01T00:00:00.000Z" + "'", str7, "2025-04-01T00:00:00.000Z");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight5 = property3.setCopy("");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for dayOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.joda.time.Months months0 = org.joda.time.Months.ELEVEN;
        org.junit.Assert.assertNotNull(months0);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        java.lang.Appendable appendable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.FormatUtils.appendPaddedInteger(appendable0, 0L, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicOrdinalDateTime();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime dateTime3 = dateTime1.withYear((-35));
        org.joda.time.DateTime dateTime5 = dateTime1.plusMillis(1970);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property9 = dateTime7.property(dateTimeFieldType8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.chrono.JulianChronology julianChronology11 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone10);
        org.joda.time.Chronology chronology12 = julianChronology11.withUTC();
        org.joda.time.DateTimeField dateTimeField13 = dateTimeFieldType8.getField((org.joda.time.Chronology) julianChronology11);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeField13.getAsShortText((int) (byte) 0, locale15);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property20 = dateTime18.property(dateTimeFieldType19);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField24 = new org.joda.time.field.OffsetDateTimeField(dateTimeField13, dateTimeFieldType19, (int) (byte) -1, (int) (byte) -1, (-35));
        org.joda.time.Partial partial26 = new org.joda.time.Partial(dateTimeFieldType19, 2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime28 = dateTime1.withField(dateTimeFieldType19, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfHalfday must be in the range [0,11]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(julianChronology11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0" + "'", str16, "0");
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(property20);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone0, 3);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology2.minuteOfDay();
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.ZoneInfoProvider zoneInfoProvider1 = new org.joda.time.tz.ZoneInfoProvider(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No file directory provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property5 = dateTime3.property(dateTimeFieldType4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone6);
        org.joda.time.Chronology chronology8 = julianChronology7.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType4.getField((org.joda.time.Chronology) julianChronology7);
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology7);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.chrono.JulianChronology julianChronology12 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone11);
        org.joda.time.Chronology chronology13 = julianChronology12.withUTC();
        mutableInterval10.setChronology((org.joda.time.Chronology) julianChronology12);
        mutableInterval10.setEndMillis((long) 'a');
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property19 = dateTime18.dayOfWeek();
        int int20 = dateTime18.getWeekyear();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime22 = dateTime18.plus(readableDuration21);
        boolean boolean23 = mutableInterval10.contains((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.Interval interval24 = mutableInterval10.toInterval();
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property30 = dateTime28.property(dateTimeFieldType29);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.chrono.JulianChronology julianChronology32 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone31);
        org.joda.time.Chronology chronology33 = julianChronology32.withUTC();
        org.joda.time.DateTimeField dateTimeField34 = dateTimeFieldType29.getField((org.joda.time.Chronology) julianChronology32);
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology32);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.chrono.JulianChronology julianChronology37 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone36);
        org.joda.time.Chronology chronology38 = julianChronology37.withUTC();
        mutableInterval35.setChronology((org.joda.time.Chronology) julianChronology37);
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property45 = dateTime43.property(dateTimeFieldType44);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.chrono.JulianChronology julianChronology47 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone46);
        org.joda.time.Chronology chronology48 = julianChronology47.withUTC();
        org.joda.time.DateTimeField dateTimeField49 = dateTimeFieldType44.getField((org.joda.time.Chronology) julianChronology47);
        org.joda.time.MutableInterval mutableInterval50 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology47);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.chrono.JulianChronology julianChronology52 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone51);
        org.joda.time.Chronology chronology53 = julianChronology52.withUTC();
        mutableInterval50.setChronology((org.joda.time.Chronology) julianChronology52);
        mutableInterval50.setEndMillis((long) 'a');
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property59 = dateTime58.dayOfWeek();
        int int60 = dateTime58.getWeekyear();
        org.joda.time.ReadableDuration readableDuration61 = null;
        org.joda.time.DateTime dateTime62 = dateTime58.plus(readableDuration61);
        boolean boolean63 = mutableInterval50.contains((org.joda.time.ReadableInstant) dateTime62);
        org.joda.time.Interval interval64 = mutableInterval50.toInterval();
        mutableInterval35.setInterval((org.joda.time.ReadableInterval) interval64);
        org.joda.time.Interval interval66 = interval24.overlap((org.joda.time.ReadableInterval) interval64);
        org.joda.time.DateTime dateTime70 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType71 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property72 = dateTime70.property(dateTimeFieldType71);
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        org.joda.time.chrono.JulianChronology julianChronology74 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone73);
        org.joda.time.Chronology chronology75 = julianChronology74.withUTC();
        org.joda.time.DateTimeField dateTimeField76 = dateTimeFieldType71.getField((org.joda.time.Chronology) julianChronology74);
        org.joda.time.MutableInterval mutableInterval77 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology74);
        org.joda.time.DateTimeZone dateTimeZone78 = null;
        org.joda.time.chrono.JulianChronology julianChronology79 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone78);
        org.joda.time.Chronology chronology80 = julianChronology79.withUTC();
        mutableInterval77.setChronology((org.joda.time.Chronology) julianChronology79);
        mutableInterval77.setEndMillis((long) 'a');
        org.joda.time.DateTime dateTime85 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property86 = dateTime85.dayOfWeek();
        int int87 = dateTime85.getWeekyear();
        org.joda.time.ReadableDuration readableDuration88 = null;
        org.joda.time.DateTime dateTime89 = dateTime85.plus(readableDuration88);
        boolean boolean90 = mutableInterval77.contains((org.joda.time.ReadableInstant) dateTime89);
        org.joda.time.Interval interval91 = mutableInterval77.toInterval();
        org.joda.time.ReadableInterval readableInterval92 = null;
        boolean boolean93 = mutableInterval77.isBefore(readableInterval92);
        boolean boolean94 = interval24.isAfter(readableInterval92);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(julianChronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(julianChronology12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1970 + "'", int20 == 1970);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(julianChronology32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(julianChronology37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(julianChronology47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(julianChronology52);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1970 + "'", int60 == 1970);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(interval64);
        org.junit.Assert.assertNotNull(interval66);
        org.junit.Assert.assertNotNull(dateTimeFieldType71);
        org.junit.Assert.assertNotNull(property72);
        org.junit.Assert.assertNotNull(julianChronology74);
        org.junit.Assert.assertNotNull(chronology75);
        org.junit.Assert.assertNotNull(dateTimeField76);
        org.junit.Assert.assertNotNull(julianChronology79);
        org.junit.Assert.assertNotNull(chronology80);
        org.junit.Assert.assertNotNull(property86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 1970 + "'", int87 == 1970);
        org.junit.Assert.assertNotNull(dateTime89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(interval91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        int int1 = timeOfDay0.getMinuteOfHour();
        org.junit.Assert.assertNotNull(timeOfDay0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property5 = dateTime3.property(dateTimeFieldType4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone6);
        org.joda.time.Chronology chronology8 = julianChronology7.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType4.getField((org.joda.time.Chronology) julianChronology7);
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology7);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.chrono.JulianChronology julianChronology12 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone11);
        org.joda.time.Chronology chronology13 = julianChronology12.withUTC();
        mutableInterval10.setChronology((org.joda.time.Chronology) julianChronology12);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property20 = dateTime18.property(dateTimeFieldType19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.chrono.JulianChronology julianChronology22 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone21);
        org.joda.time.Chronology chronology23 = julianChronology22.withUTC();
        org.joda.time.DateTimeField dateTimeField24 = dateTimeFieldType19.getField((org.joda.time.Chronology) julianChronology22);
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology22);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.chrono.JulianChronology julianChronology27 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone26);
        org.joda.time.Chronology chronology28 = julianChronology27.withUTC();
        mutableInterval25.setChronology((org.joda.time.Chronology) julianChronology27);
        mutableInterval25.setEndMillis((long) 'a');
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property34 = dateTime33.dayOfWeek();
        int int35 = dateTime33.getWeekyear();
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.DateTime dateTime37 = dateTime33.plus(readableDuration36);
        boolean boolean38 = mutableInterval25.contains((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.Interval interval39 = mutableInterval25.toInterval();
        mutableInterval10.setInterval((org.joda.time.ReadableInterval) interval39);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology42 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone41);
        org.joda.time.Days days43 = org.joda.time.Days.THREE;
        int[] intArray46 = gregorianChronology42.get((org.joda.time.ReadablePeriod) days43, (long) 0, (-1L));
        org.joda.time.Duration duration47 = days43.toStandardDuration();
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property50 = dateTime49.dayOfWeek();
        int int51 = dateTime49.getWeekyear();
        int int52 = dateTime49.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology54 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone53);
        org.joda.time.Days days55 = org.joda.time.Days.THREE;
        int[] intArray58 = gregorianChronology54.get((org.joda.time.ReadablePeriod) days55, (long) 0, (-1L));
        org.joda.time.Duration duration59 = days55.toStandardDuration();
        org.joda.time.DateTime dateTime61 = dateTime49.withDurationAdded((org.joda.time.ReadableDuration) duration59, 26);
        boolean boolean62 = duration47.isShorterThan((org.joda.time.ReadableDuration) duration59);
        org.joda.time.Interval interval63 = interval39.withDurationAfterStart((org.joda.time.ReadableDuration) duration47);
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property69 = dateTime67.property(dateTimeFieldType68);
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.chrono.JulianChronology julianChronology71 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone70);
        org.joda.time.Chronology chronology72 = julianChronology71.withUTC();
        org.joda.time.DateTimeField dateTimeField73 = dateTimeFieldType68.getField((org.joda.time.Chronology) julianChronology71);
        org.joda.time.MutableInterval mutableInterval74 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology71);
        org.joda.time.DateTimeZone dateTimeZone75 = null;
        org.joda.time.chrono.JulianChronology julianChronology76 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone75);
        org.joda.time.Chronology chronology77 = julianChronology76.withUTC();
        mutableInterval74.setChronology((org.joda.time.Chronology) julianChronology76);
        mutableInterval74.setEndMillis((long) 'a');
        org.joda.time.DateTime dateTime82 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property83 = dateTime82.dayOfWeek();
        int int84 = dateTime82.getWeekyear();
        org.joda.time.ReadableDuration readableDuration85 = null;
        org.joda.time.DateTime dateTime86 = dateTime82.plus(readableDuration85);
        boolean boolean87 = mutableInterval74.contains((org.joda.time.ReadableInstant) dateTime86);
        org.joda.time.MutableInterval mutableInterval88 = mutableInterval74.copy();
        mutableInterval88.setStartMillis((long) (byte) 0);
        boolean boolean91 = interval39.isAfter((org.joda.time.ReadableInterval) mutableInterval88);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(julianChronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(julianChronology12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(julianChronology22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(julianChronology27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1970 + "'", int35 == 1970);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(interval39);
        org.junit.Assert.assertNotNull(gregorianChronology42);
        org.junit.Assert.assertNotNull(days43);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1970 + "'", int51 == 1970);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(gregorianChronology54);
        org.junit.Assert.assertNotNull(days55);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertArrayEquals(intArray58, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration59);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(interval63);
        org.junit.Assert.assertNotNull(dateTimeFieldType68);
        org.junit.Assert.assertNotNull(property69);
        org.junit.Assert.assertNotNull(julianChronology71);
        org.junit.Assert.assertNotNull(chronology72);
        org.junit.Assert.assertNotNull(dateTimeField73);
        org.junit.Assert.assertNotNull(julianChronology76);
        org.junit.Assert.assertNotNull(chronology77);
        org.junit.Assert.assertNotNull(property83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1970 + "'", int84 == 1970);
        org.junit.Assert.assertNotNull(dateTime86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(mutableInterval88);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusHours((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.dayOfYear();
        org.joda.time.LocalDateTime.Property property5 = localDateTime3.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology7 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone6);
        org.joda.time.Days days8 = org.joda.time.Days.THREE;
        int[] intArray11 = gregorianChronology7.get((org.joda.time.ReadablePeriod) days8, (long) 0, (-1L));
        org.joda.time.Duration duration12 = days8.toStandardDuration();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime3.minus((org.joda.time.ReadableDuration) duration12);
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod();
        mutablePeriod14.addWeeks((-1));
        org.joda.time.LocalDateTime localDateTime18 = localDateTime13.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod14, 5);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minusMinutes(32);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.monthOfYear();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(gregorianChronology7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.Chronology chronology3 = julianChronology2.withUTC();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, (org.joda.time.Chronology) julianChronology2, locale4);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfWeek();
        int int9 = dateTime7.getWeekyear();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime7.plus(readableDuration10);
        org.joda.time.DateTime.Property property12 = dateTime11.era();
        boolean boolean13 = dateTimeParserBucket5.restoreState((java.lang.Object) property12);
        org.joda.time.DateTime dateTime14 = property12.roundFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = property12.addToCopy((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.addMonths((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime0.setDate((int) '4', (-19), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -19 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime0);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        int int0 = org.joda.time.DateTimeConstants.MONDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        int int0 = org.joda.time.DateTimeConstants.JANUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("DurationField[halfdays]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"DurationField[halfdays]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.ONE;
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.plus((org.joda.time.ReadablePeriod) weeks3);
        java.util.Date date5 = dateMidnight2.toDate();
        org.joda.time.YearMonthDay yearMonthDay6 = org.joda.time.YearMonthDay.fromDateFields(date5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = yearMonthDay6.toDateMidnight(dateTimeZone7);
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay6.plusMonths(8);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.chrono.JulianChronology julianChronology13 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone12);
        org.joda.time.Chronology chronology14 = julianChronology13.withUTC();
        java.util.Locale locale15 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, (org.joda.time.Chronology) julianChronology13, locale15);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property19 = dateTime18.dayOfWeek();
        int int20 = dateTime18.getWeekyear();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime22 = dateTime18.plus(readableDuration21);
        org.joda.time.DateTime.Property property23 = dateTime22.era();
        boolean boolean24 = dateTimeParserBucket16.restoreState((java.lang.Object) property23);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeParserBucket16.getZone();
        org.joda.time.DateTime dateTime26 = yearMonthDay10.toDateTimeAtCurrentTime(dateTimeZone25);
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate29 = localDate27.withYearOfEra(10);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.chrono.JulianChronology julianChronology32 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone31);
        org.joda.time.Chronology chronology33 = julianChronology32.withUTC();
        java.util.Locale locale34 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, (org.joda.time.Chronology) julianChronology32, locale34);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property38 = dateTime37.dayOfWeek();
        int int39 = dateTime37.getWeekyear();
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.DateTime dateTime41 = dateTime37.plus(readableDuration40);
        org.joda.time.DateTime.Property property42 = dateTime41.era();
        boolean boolean43 = dateTimeParserBucket35.restoreState((java.lang.Object) property42);
        org.joda.time.DateTimeZone dateTimeZone44 = dateTimeParserBucket35.getZone();
        org.joda.time.DateTime dateTime45 = localDate27.toDateTimeAtCurrentTime(dateTimeZone44);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology47 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone25, (org.joda.time.ReadableInstant) dateTime45, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Mon Mar 31 20:00:00 EDT 2025");
        org.junit.Assert.assertNotNull(yearMonthDay6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(julianChronology13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1970 + "'", int20 == 1970);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(julianChronology32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1970 + "'", int39 == 1970);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(dateTime45);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod();
        org.joda.time.Days days1 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType2 = days1.getFieldType();
        org.joda.time.PeriodType periodType3 = days1.getPeriodType();
        mutablePeriod0.add((org.joda.time.ReadablePeriod) days1);
        mutablePeriod0.addMonths(7);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(periodType3);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes2 = minutes0.multipliedBy((int) (short) 1);
        org.joda.time.Minutes minutes3 = null;
        boolean boolean4 = minutes2.isGreaterThan(minutes3);
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.fromCalendarFields(calendar0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The calendar must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.chrono.JulianChronology julianChronology4 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = julianChronology4.halfdayOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay(0, 26, (int) 'a', (org.joda.time.Chronology) julianChronology4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for secondOfMinute must not be larger than 59");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property3 = dateTime1.property(dateTimeFieldType2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.JulianChronology julianChronology5 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone4);
        org.joda.time.Chronology chronology6 = julianChronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType2.getField((org.joda.time.Chronology) julianChronology5);
        long long10 = dateTimeField7.add((long) 26, 0L);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = dateTimeField7.set((long) '#', 12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 12 for hourOfHalfday must be in the range [0,11]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(julianChronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 26L + "'", long10 == 26L);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.setDayOfYear(8);
        mutableDateTime0.setDayOfYear(31);
        org.joda.time.Instant instant5 = mutableDateTime0.toInstant();
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(instant5);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.dayOfYear();
        org.joda.time.DateMidnight dateMidnight4 = property3.roundHalfEvenCopy();
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.withYearOfCentury(100);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MonthDay monthDay8 = new org.joda.time.MonthDay((java.lang.Object) dateMidnight4, chronology7);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray9 = monthDay8.getFieldTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType11 = monthDay8.getFieldType(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray9);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property3 = dateTime1.property(dateTimeFieldType2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.JulianChronology julianChronology5 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone4);
        org.joda.time.Chronology chronology6 = julianChronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType2.getField((org.joda.time.Chronology) julianChronology5);
        org.joda.time.DurationField durationField8 = julianChronology5.halfdays();
        long long9 = durationField8.getUnitMillis();
        long long11 = durationField8.getMillis((long) '#');
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(julianChronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 43200000L + "'", long9 == 43200000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1512000000L + "'", long11 == 1512000000L);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.joda.time.YearMonth yearMonth0 = org.joda.time.YearMonth.now();
        org.junit.Assert.assertNotNull(yearMonth0);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.weekyear();
        int int4 = dateMidnight2.getDayOfWeek();
        org.joda.time.Chronology chronology5 = dateMidnight2.getChronology();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight2.minusWeeks((-35));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight9 = dateMidnight7.withYearOfEra((-35));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -35 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateMidnight7);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.Days days2 = org.joda.time.Days.THREE;
        int[] intArray5 = gregorianChronology1.get((org.joda.time.ReadablePeriod) days2, (long) 0, (-1L));
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology1.dayOfMonth();
        org.joda.time.DurationField durationField7 = gregorianChronology1.millis();
        long long10 = durationField7.getMillis(0L, 2024L);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0 });
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.Chronology chronology3 = julianChronology2.withUTC();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, (org.joda.time.Chronology) julianChronology2, locale4);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfWeek();
        int int9 = dateTime7.getWeekyear();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime7.plus(readableDuration10);
        org.joda.time.DateTime.Property property12 = dateTime11.era();
        boolean boolean13 = dateTimeParserBucket5.restoreState((java.lang.Object) property12);
        org.joda.time.DateTime dateTime15 = property12.setCopy(0);
        org.joda.time.DateTime.Property property16 = dateTime15.year();
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.joda.time.Months months0 = org.joda.time.Months.FOUR;
        org.joda.time.DurationFieldType durationFieldType1 = months0.getFieldType();
        org.junit.Assert.assertNotNull(months0);
        org.junit.Assert.assertNotNull(durationFieldType1);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((java.lang.Object) dateTimeZone0, dateTimeZone2);
        int int4 = mutableDateTime3.getRoundingMode();
        mutableDateTime3.addWeekyears((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime3.setMinuteOfHour(60);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 60 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property2 = dateTime1.dayOfWeek();
        int int3 = dateTime1.getWeekyear();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime1.plus(readableDuration4);
        org.joda.time.DateTime.Property property6 = dateTime5.era();
        boolean boolean8 = dateTime5.isBefore(26L);
        org.joda.time.DateTime dateTime10 = dateTime5.minusMinutes((-19));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = dateTime5.withMonthOfYear((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1970 + "'", int3 == 1970);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property3 = dateTime1.property(dateTimeFieldType2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.JulianChronology julianChronology5 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone4);
        org.joda.time.Chronology chronology6 = julianChronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType2.getField((org.joda.time.Chronology) julianChronology5);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeField7.getAsShortText((int) (byte) 0, locale9);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property14 = dateTime12.property(dateTimeFieldType13);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField18 = new org.joda.time.field.OffsetDateTimeField(dateTimeField7, dateTimeFieldType13, (int) (byte) -1, (int) (byte) -1, (-35));
        int int20 = offsetDateTimeField18.getLeapAmount((long) (short) 0);
        org.joda.time.DateTimeField dateTimeField21 = org.joda.time.field.StrictDateTimeField.getInstance((org.joda.time.DateTimeField) offsetDateTimeField18);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property26 = dateTime24.property(dateTimeFieldType25);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.chrono.JulianChronology julianChronology28 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone27);
        org.joda.time.Chronology chronology29 = julianChronology28.withUTC();
        org.joda.time.DateTimeField dateTimeField30 = dateTimeFieldType25.getField((org.joda.time.Chronology) julianChronology28);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.Chronology chronology32 = julianChronology28.withZone(dateTimeZone31);
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime((long) '#', chronology32);
        org.joda.time.LocalTime localTime35 = localTime33.plusSeconds((int) 'a');
        int[] intArray39 = new int[] { 26, '#', 31 };
        int int40 = offsetDateTimeField18.getMinimumValue((org.joda.time.ReadablePartial) localTime35, intArray39);
        // The following exception was thrown during execution in test generation
        try {
            long long43 = offsetDateTimeField18.addWrapField(31795200000L, 20179);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(julianChronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(julianChronology28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { 26, 35, 31 });
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology1.weekyearOfCentury();
        org.joda.time.Period period5 = org.joda.time.Period.days(7);
        org.joda.time.Period period7 = period5.plusMonths(60);
        int[] intArray10 = gregorianChronology1.get((org.joda.time.ReadablePeriod) period5, (long) 4, (long) (short) 10);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 0, 0, 0, 0, 0, 0, 0, 6 });
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.joda.time.Period period1 = org.joda.time.Period.days(7);
        org.joda.time.Period period3 = period1.plusMonths(60);
        org.joda.time.Period period4 = period1.negated();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.Days days2 = org.joda.time.Days.THREE;
        int[] intArray5 = gregorianChronology1.get((org.joda.time.ReadablePeriod) days2, (long) 0, (-1L));
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology1.dayOfMonth();
        org.joda.time.DurationField durationField7 = gregorianChronology1.eras();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology1.era();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = gregorianChronology1.getDateTimeMillis((int) 'a', (-35), 13, 1970, 1970, 330958, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0 });
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.year();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusMinutes((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusWeeks(1970);
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusMinutes((int) (byte) 100);
        org.joda.time.Hours hours10 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadablePartial) localDateTime5, (org.joda.time.ReadablePartial) localDateTime7);
        int int11 = localDateTime5.size();
        org.joda.time.LocalDateTime.Property property12 = localDateTime5.millisOfDay();
        java.lang.String str13 = property12.getName();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "millisOfDay" + "'", str13, "millisOfDay");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.ordinalDateTime();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        int int0 = org.joda.time.DateTimeConstants.FEBRUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod();
        mutablePeriod0.setMonths(0);
        mutablePeriod0.addMonths((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology8 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone7);
        org.joda.time.Days days9 = org.joda.time.Days.THREE;
        int[] intArray12 = gregorianChronology8.get((org.joda.time.ReadablePeriod) days9, (long) 0, (-1L));
        java.lang.String str13 = gregorianChronology8.toString();
        mutablePeriod0.setPeriod((long) 1, (long) (short) 1, (org.joda.time.Chronology) gregorianChronology8);
        mutablePeriod0.setMonths(20179);
        org.junit.Assert.assertNotNull(gregorianChronology8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 0 });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "GregorianChronology[UTC]" + "'", str13, "GregorianChronology[UTC]");
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.dayOfYear();
        org.joda.time.DateMidnight dateMidnight4 = property3.roundHalfEvenCopy();
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.plusWeeks((int) (byte) 10);
        boolean boolean8 = dateMidnight6.isBefore((long) (byte) 1);
        int int9 = dateMidnight6.getWeekyear();
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2025 + "'", int9 == 2025);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(1512000000L);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.LocalDate localDate3 = localDate0.plusDays(20179);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate5 = localDate0.withMonthOfYear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(localDate3);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.joda.time.Days days1 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType2 = days1.getFieldType();
        org.joda.time.PeriodType periodType3 = days1.getPeriodType();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property9 = dateTime7.property(dateTimeFieldType8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.chrono.JulianChronology julianChronology11 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone10);
        org.joda.time.Chronology chronology12 = julianChronology11.withUTC();
        org.joda.time.DateTimeField dateTimeField13 = dateTimeFieldType8.getField((org.joda.time.Chronology) julianChronology11);
        org.joda.time.MutableInterval mutableInterval14 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology11);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.chrono.JulianChronology julianChronology16 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone15);
        org.joda.time.Chronology chronology17 = julianChronology16.withUTC();
        mutableInterval14.setChronology((org.joda.time.Chronology) julianChronology16);
        org.joda.time.Period period19 = new org.joda.time.Period((long) (byte) 0, periodType3, (org.joda.time.Chronology) julianChronology16);
        org.joda.time.Days days20 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType21 = days20.getFieldType();
        org.joda.time.PeriodType periodType22 = days20.getPeriodType();
        boolean boolean23 = periodType3.equals((java.lang.Object) periodType22);
        org.joda.time.PeriodType periodType24 = periodType22.withWeeksRemoved();
        org.joda.time.PeriodType periodType25 = periodType24.withMinutesRemoved();
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(julianChronology11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(julianChronology16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodType25);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.fullTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.parse("26", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"26\" is too short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.joda.time.YearMonth yearMonth1 = new org.joda.time.YearMonth(101L);
        org.joda.time.YearMonth.Property property2 = yearMonth1.year();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property5 = dateTime4.dayOfWeek();
        org.joda.time.DateTime dateTime6 = property5.roundHalfFloorCopy();
        int int7 = property2.compareTo((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.YearMonth yearMonth9 = property2.addWrapFieldToCopy(26);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(yearMonth9);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property3 = dateTime1.property(dateTimeFieldType2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.JulianChronology julianChronology5 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone4);
        org.joda.time.Chronology chronology6 = julianChronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType2.getField((org.joda.time.Chronology) julianChronology5);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeField7.getAsShortText((int) (byte) 0, locale9);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property14 = dateTime12.property(dateTimeFieldType13);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField18 = new org.joda.time.field.OffsetDateTimeField(dateTimeField7, dateTimeFieldType13, (int) (byte) -1, (int) (byte) -1, (-35));
        int int20 = offsetDateTimeField18.getLeapAmount((long) (short) 0);
        int int21 = offsetDateTimeField18.getMaximumValue();
        long long24 = offsetDateTimeField18.getDifferenceAsLong((long) 13, (long) 10);
        // The following exception was thrown during execution in test generation
        try {
            long long27 = offsetDateTimeField18.add((long) 20179, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfHalfday must be in the range [-1,-35]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(julianChronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-35) + "'", int21 == (-35));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(2, 70067048, (int) '4', 0, 70067048, 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70067048 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.Days days2 = org.joda.time.Days.THREE;
        int[] intArray5 = gregorianChronology1.get((org.joda.time.ReadablePeriod) days2, (long) 0, (-1L));
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology1.dayOfMonth();
        org.joda.time.DurationField durationField7 = gregorianChronology1.weeks();
        org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.now((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology1.yearOfEra();
        java.util.Locale locale10 = null;
        int int11 = dateTimeField9.getMaximumShortTextLength(locale10);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0 });
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.joda.time.Days days0 = org.joda.time.Days.MIN_VALUE;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days1 = days0.negated();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Integer.MIN_VALUE cannot be negated");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days0);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Days days1 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType2 = days1.getFieldType();
        org.joda.time.LocalDate localDate4 = localDate0.withFieldAdded(durationFieldType2, 1);
        org.joda.time.LocalDate.Property property5 = localDate4.era();
        org.joda.time.LocalDate localDate6 = property5.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate7 = property5.roundHalfCeilingCopy();
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate7);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.dayOfYear();
        org.joda.time.DateMidnight dateMidnight4 = property3.roundHalfEvenCopy();
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.plusWeeks((int) (byte) 10);
        org.joda.time.Days days7 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType8 = days7.getFieldType();
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight6.withFieldAdded(durationFieldType8, 26);
        org.joda.time.DateMidnight.Property property11 = dateMidnight10.dayOfWeek();
        org.joda.time.DateMidnight.Property property12 = dateMidnight10.dayOfWeek();
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days1 = org.joda.time.Days.parseDays("P-1W");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weeks'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfMonth((int) (byte) 1);
        org.joda.time.TimeOfDay timeOfDay4 = dateTime3.toTimeOfDay();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property7 = dateTime6.dayOfWeek();
        int int8 = dateTime6.getWeekyear();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime6.plus(readableDuration9);
        org.joda.time.DateTime.Property property11 = dateTime10.era();
        boolean boolean13 = dateTime10.isBefore(26L);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Chronology chronology15 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime10, readableInstant14);
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay4.withChronologyRetainFields(chronology15);
        org.joda.time.TimeOfDay.Property property17 = timeOfDay16.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay19 = property17.setCopy("hi!");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"hi!\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1970 + "'", int8 == 1970);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property5 = dateTime3.property(dateTimeFieldType4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone6);
        org.joda.time.Chronology chronology8 = julianChronology7.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType4.getField((org.joda.time.Chronology) julianChronology7);
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology7);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.chrono.JulianChronology julianChronology12 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone11);
        org.joda.time.Chronology chronology13 = julianChronology12.withUTC();
        mutableInterval10.setChronology((org.joda.time.Chronology) julianChronology12);
        mutableInterval10.setEndMillis((long) 'a');
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property19 = dateTime18.dayOfWeek();
        int int20 = dateTime18.getWeekyear();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime22 = dateTime18.plus(readableDuration21);
        boolean boolean23 = mutableInterval10.contains((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology25 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone24);
        org.joda.time.Days days26 = org.joda.time.Days.THREE;
        int[] intArray29 = gregorianChronology25.get((org.joda.time.ReadablePeriod) days26, (long) 0, (-1L));
        org.joda.time.Duration duration30 = days26.toStandardDuration();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property33 = dateTime32.dayOfWeek();
        int int34 = dateTime32.getWeekyear();
        int int35 = dateTime32.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology37 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone36);
        org.joda.time.Days days38 = org.joda.time.Days.THREE;
        int[] intArray41 = gregorianChronology37.get((org.joda.time.ReadablePeriod) days38, (long) 0, (-1L));
        org.joda.time.Duration duration42 = days38.toStandardDuration();
        org.joda.time.DateTime dateTime44 = dateTime32.withDurationAdded((org.joda.time.ReadableDuration) duration42, 26);
        boolean boolean45 = duration30.isShorterThan((org.joda.time.ReadableDuration) duration42);
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.plusHours((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property50 = localDateTime49.dayOfYear();
        org.joda.time.LocalDateTime.Property property51 = localDateTime49.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology53 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone52);
        org.joda.time.Days days54 = org.joda.time.Days.THREE;
        int[] intArray57 = gregorianChronology53.get((org.joda.time.ReadablePeriod) days54, (long) 0, (-1L));
        org.joda.time.Duration duration58 = days54.toStandardDuration();
        org.joda.time.LocalDateTime localDateTime59 = localDateTime49.minus((org.joda.time.ReadableDuration) duration58);
        org.joda.time.Duration duration60 = duration30.minus((org.joda.time.ReadableDuration) duration58);
        mutableInterval10.setDurationAfterStart((org.joda.time.ReadableDuration) duration30);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(julianChronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(julianChronology12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1970 + "'", int20 == 1970);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(gregorianChronology25);
        org.junit.Assert.assertNotNull(days26);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1970 + "'", int34 == 1970);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(gregorianChronology37);
        org.junit.Assert.assertNotNull(days38);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(gregorianChronology53);
        org.junit.Assert.assertNotNull(days54);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration58);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertNotNull(duration60);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withFieldAdded(durationFieldType2, 1969);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.joda.time.Years years0 = org.joda.time.Years.MAX_VALUE;
        org.joda.time.PeriodType periodType1 = years0.getPeriodType();
        org.joda.time.Seconds seconds2 = org.joda.time.Seconds.MIN_VALUE;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = years0.compareTo((org.joda.time.base.BaseSingleFieldPeriod) seconds2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.joda.time.Years cannot be compared to class org.joda.time.Seconds");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(years0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(seconds2);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.forStyle("1969-12-19T00:00:00.007Z/1969-12-19T00:00:00.097Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style specification: 1969-12-19T00:00:00.007Z/1969-12-19T00:00:00.097Z");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((int) (short) 0, 25);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25 + "'", int2 == 25);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfWeek();
        mutableDateTime0.addMonths(26);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths(0);
        org.joda.time.DateTime dateTime8 = dateTime5.toDateTimeISO();
        mutableDateTime0.setDate((org.joda.time.ReadableInstant) dateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.joda.time.Months months0 = org.joda.time.Months.EIGHT;
        org.joda.time.Months months2 = months0.minus((int) ' ');
        org.joda.time.Months months3 = org.joda.time.Months.MAX_VALUE;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Months months4 = months0.plus(months3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: 8 + 2147483647");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(months0);
        org.junit.Assert.assertNotNull(months2);
        org.junit.Assert.assertNotNull(months3);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(8, (int) (byte) 1);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 100, dateTimeZone1);
        boolean boolean4 = localTime2.equals((java.lang.Object) 26);
        int int5 = localTime2.size();
        org.joda.time.LocalTime localTime7 = localTime2.minusSeconds(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(localTime7);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) 60);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.joda.time.Days days0 = org.joda.time.Days.THREE;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property3.getFieldType();
        boolean boolean5 = days0.equals((java.lang.Object) property3);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = property3.getFieldType();
        java.lang.String str7 = property3.getAsText();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Thursday" + "'", str7, "Thursday");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = org.joda.time.format.ISODateTimeFormat.dateHourMinuteSecondFraction();
        boolean boolean3 = dateTimeZone1.equals((java.lang.Object) dateTimeFormatter2);
        java.lang.StringBuffer stringBuffer4 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime dateTime8 = dateTime6.withDayOfMonth((int) (byte) 1);
        org.joda.time.Instant instant9 = dateTime8.toInstant();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer4, (org.joda.time.ReadableInstant) dateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(instant9);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullTime();
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now();
        mutableDateTime1.setDayOfYear(8);
        mutableDateTime1.setDayOfYear(31);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        mutableDateTime1.setZone(dateTimeZone6);
        mutableDateTime1.setDayOfYear(26);
        int int12 = dateTimeFormatter0.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime1, "100", 86400);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-86401) + "'", int12 == (-86401));
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property5 = dateTime3.property(dateTimeFieldType4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone6);
        org.joda.time.Chronology chronology8 = julianChronology7.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType4.getField((org.joda.time.Chronology) julianChronology7);
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology7);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.chrono.JulianChronology julianChronology12 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone11);
        org.joda.time.Chronology chronology13 = julianChronology12.withUTC();
        mutableInterval10.setChronology((org.joda.time.Chronology) julianChronology12);
        mutableInterval10.setEndMillis((long) 'a');
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property19 = dateTime18.dayOfWeek();
        int int20 = dateTime18.getWeekyear();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime22 = dateTime18.plus(readableDuration21);
        boolean boolean23 = mutableInterval10.contains((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.Interval interval24 = mutableInterval10.toInterval();
        org.joda.time.ReadableInterval readableInterval25 = null;
        boolean boolean26 = mutableInterval10.isBefore(readableInterval25);
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property32 = dateTime30.property(dateTimeFieldType31);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.chrono.JulianChronology julianChronology34 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone33);
        org.joda.time.Chronology chronology35 = julianChronology34.withUTC();
        org.joda.time.DateTimeField dateTimeField36 = dateTimeFieldType31.getField((org.joda.time.Chronology) julianChronology34);
        org.joda.time.MutableInterval mutableInterval37 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology34);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.chrono.JulianChronology julianChronology39 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone38);
        org.joda.time.Chronology chronology40 = julianChronology39.withUTC();
        mutableInterval37.setChronology((org.joda.time.Chronology) julianChronology39);
        mutableInterval37.setEndMillis((long) 'a');
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property46 = dateTime45.dayOfWeek();
        int int47 = dateTime45.getWeekyear();
        org.joda.time.ReadableDuration readableDuration48 = null;
        org.joda.time.DateTime dateTime49 = dateTime45.plus(readableDuration48);
        boolean boolean50 = mutableInterval37.contains((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.Days days51 = org.joda.time.Days.THREE;
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property54 = dateTime53.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = property54.getFieldType();
        boolean boolean56 = days51.equals((java.lang.Object) property54);
        org.joda.time.DateTime dateTime57 = property54.getDateTime();
        org.joda.time.DateTime dateTime58 = dateTime57.withEarlierOffsetAtOverlap();
        mutableInterval37.setStart((org.joda.time.ReadableInstant) dateTime58);
        mutableInterval10.setInterval((org.joda.time.ReadableInterval) mutableInterval37);
        org.joda.time.Days days61 = org.joda.time.Days.daysIn((org.joda.time.ReadableInterval) mutableInterval10);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(julianChronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(julianChronology12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1970 + "'", int20 == 1970);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(julianChronology34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(julianChronology39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1970 + "'", int47 == 1970);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(days51);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(dateTimeFieldType55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(days61);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property5 = dateTime3.property(dateTimeFieldType4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone6);
        org.joda.time.Chronology chronology8 = julianChronology7.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType4.getField((org.joda.time.Chronology) julianChronology7);
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology7);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.chrono.JulianChronology julianChronology12 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone11);
        org.joda.time.Chronology chronology13 = julianChronology12.withUTC();
        mutableInterval10.setChronology((org.joda.time.Chronology) julianChronology12);
        mutableInterval10.setEndMillis((long) 'a');
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property19 = dateTime18.dayOfWeek();
        int int20 = dateTime18.getWeekyear();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime22 = dateTime18.plus(readableDuration21);
        boolean boolean23 = mutableInterval10.contains((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.Days days24 = org.joda.time.Days.THREE;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property27 = dateTime26.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = property27.getFieldType();
        boolean boolean29 = days24.equals((java.lang.Object) property27);
        org.joda.time.DateTime dateTime30 = property27.getDateTime();
        org.joda.time.DateTime dateTime31 = dateTime30.withEarlierOffsetAtOverlap();
        mutableInterval10.setStart((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.Interval interval33 = mutableInterval10.toInterval();
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(julianChronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(julianChronology12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1970 + "'", int20 == 1970);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(interval33);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfMonth((int) (byte) 1);
        org.joda.time.Instant instant4 = dateTime3.toInstant();
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardDays((long) 8);
        org.joda.time.Instant instant7 = instant4.minus((org.joda.time.ReadableDuration) duration6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology10 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone9);
        org.joda.time.Days days11 = org.joda.time.Days.THREE;
        int[] intArray14 = gregorianChronology10.get((org.joda.time.ReadablePeriod) days11, (long) 0, (-1L));
        org.joda.time.DateTimeField dateTimeField15 = gregorianChronology10.dayOfMonth();
        org.joda.time.DurationField durationField16 = gregorianChronology10.millis();
        java.util.Locale locale17 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) 26, (org.joda.time.Chronology) gregorianChronology10, locale17);
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay((java.lang.Object) instant4, (org.joda.time.Chronology) gregorianChronology10);
        org.joda.time.Instant instant21 = instant4.withMillis((long) 13);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(gregorianChronology10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 0 });
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(instant21);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        int int0 = org.joda.time.MutableDateTime.ROUND_FLOOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property5 = dateTime3.property(dateTimeFieldType4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone6);
        org.joda.time.Chronology chronology8 = julianChronology7.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType4.getField((org.joda.time.Chronology) julianChronology7);
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology7);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.chrono.JulianChronology julianChronology12 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone11);
        org.joda.time.Chronology chronology13 = julianChronology12.withUTC();
        mutableInterval10.setChronology((org.joda.time.Chronology) julianChronology12);
        mutableInterval10.setEndMillis((long) 'a');
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property19 = dateTime18.dayOfWeek();
        int int20 = dateTime18.getWeekyear();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime22 = dateTime18.plus(readableDuration21);
        boolean boolean23 = mutableInterval10.contains((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.Interval interval24 = mutableInterval10.toInterval();
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.now();
        mutableDateTime25.setDayOfYear(8);
        mutableDateTime25.setDayOfYear(31);
        // The following exception was thrown during execution in test generation
        try {
            mutableInterval10.setStart((org.joda.time.ReadableInstant) mutableDateTime25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater than the start instant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(julianChronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(julianChronology12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1970 + "'", int20 == 1970);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(mutableDateTime25);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property3 = dateTime1.property(dateTimeFieldType2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.JulianChronology julianChronology5 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone4);
        org.joda.time.Chronology chronology6 = julianChronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType2.getField((org.joda.time.Chronology) julianChronology5);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeField7.getAsShortText((int) (byte) 0, locale9);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property14 = dateTime12.property(dateTimeFieldType13);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField18 = new org.joda.time.field.OffsetDateTimeField(dateTimeField7, dateTimeFieldType13, (int) (byte) -1, (int) (byte) -1, (-35));
        org.joda.time.DurationField durationField19 = offsetDateTimeField18.getLeapDurationField();
        int int21 = offsetDateTimeField18.get((long) 330958);
        org.joda.time.DateTimeField dateTimeField22 = offsetDateTimeField18.getWrappedField();
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(julianChronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNull(durationField19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(dateTimeField22);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property2 = dateTime1.dayOfWeek();
        int int3 = dateTime1.getWeekyear();
        int int4 = dateTime1.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology6 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone5);
        org.joda.time.Days days7 = org.joda.time.Days.THREE;
        int[] intArray10 = gregorianChronology6.get((org.joda.time.ReadablePeriod) days7, (long) 0, (-1L));
        org.joda.time.Duration duration11 = days7.toStandardDuration();
        org.joda.time.DateTime dateTime13 = dateTime1.withDurationAdded((org.joda.time.ReadableDuration) duration11, 26);
        org.joda.time.Duration duration15 = duration11.multipliedBy((long) (short) 1);
        org.joda.time.Duration duration17 = duration11.multipliedBy((long) (-35));
        org.joda.time.Duration duration19 = duration11.withMillis((long) (short) -1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1970 + "'", int3 == 1970);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(gregorianChronology6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(duration19);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod();
        mutablePeriod0.addWeeks(13);
        boolean boolean4 = mutablePeriod0.equals((java.lang.Object) (-3600000L));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.dayOfYear();
        org.joda.time.DateMidnight dateMidnight4 = property3.roundHalfEvenCopy();
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.plusWeeks((int) (byte) 10);
        org.joda.time.Days days7 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType8 = days7.getFieldType();
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight6.withFieldAdded(durationFieldType8, 26);
        org.joda.time.DateMidnight.Property property11 = dateMidnight10.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration12 = new org.joda.time.Duration((java.lang.Object) dateMidnight10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: org.joda.time.DateMidnight");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.setMillis((-1L));
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property6 = dateTime4.property(dateTimeFieldType5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.chrono.JulianChronology julianChronology8 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone7);
        org.joda.time.Chronology chronology9 = julianChronology8.withUTC();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType5.getField((org.joda.time.Chronology) julianChronology8);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeField10.getAsShortText((int) (byte) 0, locale12);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property17 = dateTime15.property(dateTimeFieldType16);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField21 = new org.joda.time.field.OffsetDateTimeField(dateTimeField10, dateTimeFieldType16, (int) (byte) -1, (int) (byte) -1, (-35));
        org.joda.time.DurationField durationField22 = offsetDateTimeField21.getLeapDurationField();
        mutableDateTime0.setRounding((org.joda.time.DateTimeField) offsetDateTimeField21);
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(julianChronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNull(durationField22);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType0 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_16_BASED;
        org.junit.Assert.assertNotNull(leapYearPatternType0);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod();
        boolean boolean2 = mutablePeriod0.equals((java.lang.Object) (-1L));
        mutablePeriod0.setPeriod(86400000, 13, (int) (byte) -1, (int) ' ', 26, (-35), (int) (short) -1, (int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod();
        boolean boolean14 = mutablePeriod12.equals((java.lang.Object) (-1L));
        mutablePeriod12.addYears(100);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology18 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone17);
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology18);
        org.joda.time.DateMidnight.Property property20 = dateMidnight19.dayOfYear();
        org.joda.time.DateMidnight dateMidnight21 = property20.roundHalfEvenCopy();
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight21.plusWeeks((int) (byte) 10);
        org.joda.time.Days days24 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType25 = days24.getFieldType();
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight23.withFieldAdded(durationFieldType25, 26);
        mutablePeriod12.add(durationFieldType25, 1);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property35 = dateTime33.property(dateTimeFieldType34);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.chrono.JulianChronology julianChronology37 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone36);
        org.joda.time.Chronology chronology38 = julianChronology37.withUTC();
        org.joda.time.DateTimeField dateTimeField39 = dateTimeFieldType34.getField((org.joda.time.Chronology) julianChronology37);
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology37);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.chrono.JulianChronology julianChronology42 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone41);
        org.joda.time.Chronology chronology43 = julianChronology42.withUTC();
        mutableInterval40.setChronology((org.joda.time.Chronology) julianChronology42);
        mutablePeriod12.add((org.joda.time.ReadableInterval) mutableInterval40);
        mutableInterval40.setEndMillis((long) 86400);
        mutablePeriod0.setPeriod((org.joda.time.ReadableInterval) mutableInterval40);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(gregorianChronology18);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateMidnight21);
        org.junit.Assert.assertNotNull(dateMidnight23);
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertNotNull(dateMidnight27);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(julianChronology37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(julianChronology42);
        org.junit.Assert.assertNotNull(chronology43);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property3 = dateTime1.property(dateTimeFieldType2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.JulianChronology julianChronology5 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone4);
        org.joda.time.Chronology chronology6 = julianChronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType2.getField((org.joda.time.Chronology) julianChronology5);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeField7.getAsShortText((int) (byte) 0, locale9);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property14 = dateTime12.property(dateTimeFieldType13);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField18 = new org.joda.time.field.OffsetDateTimeField(dateTimeField7, dateTimeFieldType13, (int) (byte) -1, (int) (byte) -1, (-35));
        int int20 = offsetDateTimeField18.getLeapAmount((long) (short) 0);
        org.joda.time.DurationField durationField21 = offsetDateTimeField18.getRangeDurationField();
        // The following exception was thrown during execution in test generation
        try {
            long long24 = offsetDateTimeField18.set((long) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfHalfday must be in the range [-1,-35]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(julianChronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(durationField21);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.setDayOfYear(8);
        int int3 = mutableDateTime0.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime0.dayOfWeek();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime dateTime8 = dateTime6.withYear((-35));
        int int9 = dateTime6.getMinuteOfDay();
        org.joda.time.DateTime dateTime11 = dateTime6.withYearOfEra(7);
        int int12 = dateTime6.getWeekOfWeekyear();
        boolean boolean13 = mutableDateTime0.isAfter((org.joda.time.ReadableInstant) dateTime6);
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 25 + "'", int3 == 25);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property3 = dateTime1.property(dateTimeFieldType2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.JulianChronology julianChronology5 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone4);
        org.joda.time.Chronology chronology6 = julianChronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType2.getField((org.joda.time.Chronology) julianChronology5);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeField7.getAsShortText((int) (byte) 0, locale9);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property14 = dateTime12.property(dateTimeFieldType13);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField18 = new org.joda.time.field.OffsetDateTimeField(dateTimeField7, dateTimeFieldType13, (int) (byte) -1, (int) (byte) -1, (-35));
        org.joda.time.DurationField durationField19 = offsetDateTimeField18.getDurationField();
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(julianChronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(durationField19);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime3 = dateTimeFormatter0.parseDateTime("1970-01-01T00:00:00.001Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"1970-01-01T00:00:00.001Z\" is malformed at \"70-01-01T00:00:00.001Z\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.days();
        org.junit.Assert.assertNotNull(periodType0);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property7 = dateTime5.property(dateTimeFieldType6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.JulianChronology julianChronology9 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone8);
        org.joda.time.Chronology chronology10 = julianChronology9.withUTC();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType6.getField((org.joda.time.Chronology) julianChronology9);
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology9);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.chrono.JulianChronology julianChronology14 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone13);
        org.joda.time.Chronology chronology15 = julianChronology14.withUTC();
        mutableInterval12.setChronology((org.joda.time.Chronology) julianChronology14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval(100L, 0L, (org.joda.time.Chronology) julianChronology14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater than the start instant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(julianChronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(julianChronology14);
        org.junit.Assert.assertNotNull(chronology15);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.joda.time.Hours hours0 = org.joda.time.Hours.FOUR;
        org.joda.time.Hours hours2 = hours0.dividedBy((int) (short) -1);
        org.joda.time.Hours hours3 = org.joda.time.Hours.MAX_VALUE;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours4 = hours2.minus(hours3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: -4 + -2147483647");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(hours3);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.weekyear();
        int int4 = dateMidnight2.getDayOfWeek();
        org.joda.time.Chronology chronology5 = dateMidnight2.getChronology();
        int int6 = dateMidnight2.getEra();
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.Chronology chronology3 = julianChronology2.withUTC();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, (org.joda.time.Chronology) julianChronology2, locale4);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfWeek();
        int int9 = dateTime7.getWeekyear();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime7.plus(readableDuration10);
        org.joda.time.DateTime.Property property12 = dateTime11.era();
        boolean boolean13 = dateTimeParserBucket5.restoreState((java.lang.Object) property12);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeParserBucket5.getZone();
        org.joda.time.DateTimeZone dateTimeZone15 = dateTimeParserBucket5.getZone();
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone15.getName((long) 59, locale17);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property24 = dateTime22.property(dateTimeFieldType23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.chrono.JulianChronology julianChronology26 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone25);
        org.joda.time.Chronology chronology27 = julianChronology26.withUTC();
        org.joda.time.DateTimeField dateTimeField28 = dateTimeFieldType23.getField((org.joda.time.Chronology) julianChronology26);
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology26);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.chrono.JulianChronology julianChronology31 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone30);
        org.joda.time.Chronology chronology32 = julianChronology31.withUTC();
        mutableInterval29.setChronology((org.joda.time.Chronology) julianChronology31);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property39 = dateTime37.property(dateTimeFieldType38);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.chrono.JulianChronology julianChronology41 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone40);
        org.joda.time.Chronology chronology42 = julianChronology41.withUTC();
        org.joda.time.DateTimeField dateTimeField43 = dateTimeFieldType38.getField((org.joda.time.Chronology) julianChronology41);
        org.joda.time.MutableInterval mutableInterval44 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology41);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.chrono.JulianChronology julianChronology46 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone45);
        org.joda.time.Chronology chronology47 = julianChronology46.withUTC();
        mutableInterval44.setChronology((org.joda.time.Chronology) julianChronology46);
        boolean boolean49 = mutableInterval29.overlaps((org.joda.time.ReadableInterval) mutableInterval44);
        boolean boolean50 = dateTimeZone15.equals((java.lang.Object) mutableInterval44);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology52 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone51);
        org.joda.time.Days days53 = org.joda.time.Days.THREE;
        int[] intArray56 = gregorianChronology52.get((org.joda.time.ReadablePeriod) days53, (long) 0, (-1L));
        org.joda.time.DateTimeField dateTimeField57 = gregorianChronology52.dayOfMonth();
        org.joda.time.DurationField durationField58 = gregorianChronology52.weeks();
        org.joda.time.DateTime dateTime59 = org.joda.time.DateTime.now((org.joda.time.Chronology) gregorianChronology52);
        boolean boolean60 = mutableInterval44.isAfter((org.joda.time.ReadableInstant) dateTime59);
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Coordinated Universal Time" + "'", str18, "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(julianChronology26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(julianChronology31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeFieldType38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(julianChronology41);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(julianChronology46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(gregorianChronology52);
        org.junit.Assert.assertNotNull(days53);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertArrayEquals(intArray56, new int[] { 0 });
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertNotNull(durationField58);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusHours((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.dayOfYear();
        org.joda.time.LocalDateTime.Property property5 = localDateTime3.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology7 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone6);
        org.joda.time.Days days8 = org.joda.time.Days.THREE;
        int[] intArray11 = gregorianChronology7.get((org.joda.time.ReadablePeriod) days8, (long) 0, (-1L));
        org.joda.time.Duration duration12 = days8.toStandardDuration();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime3.minus((org.joda.time.ReadableDuration) duration12);
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod();
        mutablePeriod14.addWeeks((-1));
        org.joda.time.LocalDateTime localDateTime18 = localDateTime13.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod14, 5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType20 = mutablePeriod14.getFieldType((-86401));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -86401");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(gregorianChronology7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.Instant instant1 = gJChronology0.getGregorianCutover();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = gJChronology0.getDateTimeMillis(1970, (-35), (int) (short) -1, (int) 'a', 8, 70067048, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(instant1);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.Chronology chronology3 = julianChronology2.withUTC();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, (org.joda.time.Chronology) julianChronology2, locale4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology7 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone6);
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology10 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone9);
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology10);
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology10.weekyearOfCentury();
        int int13 = dateMidnight8.get(dateTimeField12);
        org.joda.time.field.SkipDateTimeField skipDateTimeField14 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) julianChronology2, dateTimeField12);
        int int16 = skipDateTimeField14.getLeapAmount((long) 60);
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(gregorianChronology7);
        org.junit.Assert.assertNotNull(gregorianChronology10);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 26 + "'", int13 == 26);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.joda.time.Days days0 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType1 = days0.getFieldType();
        org.joda.time.PeriodType periodType2 = days0.getPeriodType();
        org.joda.time.PeriodType periodType3 = periodType2.withMonthsRemoved();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("DaysNoDays");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"DaysNoDays\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        int int0 = org.joda.time.chrono.IslamicChronology.AH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.joda.time.Days days0 = org.joda.time.Days.ONE;
        org.junit.Assert.assertNotNull(days0);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-19), 59, 13, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.joda.time.JodaTimePermission jodaTimePermission1 = new org.joda.time.JodaTimePermission("millisOfDay");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone1);
        org.joda.time.Days days3 = org.joda.time.Days.THREE;
        int[] intArray6 = gregorianChronology2.get((org.joda.time.ReadablePeriod) days3, (long) 0, (-1L));
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology2.dayOfMonth();
        org.joda.time.DurationField durationField8 = gregorianChronology2.weeks();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property12 = dateTime10.property(dateTimeFieldType11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.chrono.JulianChronology julianChronology14 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone13);
        org.joda.time.Chronology chronology15 = julianChronology14.withUTC();
        org.joda.time.DateTimeField dateTimeField16 = dateTimeFieldType11.getField((org.joda.time.Chronology) julianChronology14);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeField16.getAsShortText((int) (byte) 0, locale18);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property23 = dateTime21.property(dateTimeFieldType22);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField27 = new org.joda.time.field.OffsetDateTimeField(dateTimeField16, dateTimeFieldType22, (int) (byte) -1, (int) (byte) -1, (-35));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.DividedDateTimeField dividedDateTimeField28 = new org.joda.time.field.DividedDateTimeField(remainderDateTimeField0, durationField8, dateTimeFieldType22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0 });
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(julianChronology14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0" + "'", str19, "0");
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(property23);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.joda.time.tz.UTCProvider uTCProvider0 = new org.joda.time.tz.UTCProvider();
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.addMonths((int) (short) 100);
        mutableDateTime0.addYears((int) (byte) 100);
        mutableDateTime0.addWeeks(10);
        org.junit.Assert.assertNotNull(mutableDateTime0);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = org.joda.time.format.ISODateTimeFormat.dateHourMinuteSecondFraction();
        boolean boolean3 = dateTimeZone1.equals((java.lang.Object) dateTimeFormatter2);
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeParser4);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeParser dateTimeParser2 = dateTimeFormatter1.getParser();
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter1.printTo(stringBuffer3, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeParser2);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.joda.time.Months months0 = org.joda.time.Months.TWO;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = months0.getValue(330958);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 330958");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(months0);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property3 = dateTime1.property(dateTimeFieldType2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.JulianChronology julianChronology5 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone4);
        org.joda.time.Chronology chronology6 = julianChronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType2.getField((org.joda.time.Chronology) julianChronology5);
        org.joda.time.DurationField durationField8 = julianChronology5.halfdays();
        org.joda.time.Period period11 = new org.joda.time.Period((long) 31, (long) 25);
        int[] intArray13 = julianChronology5.get((org.joda.time.ReadablePeriod) period11, (-1924473598031L));
        org.joda.time.Period period15 = period11.plusMillis((int) (byte) 100);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(julianChronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 0, 0, (-3181), (-6), (-23), (-59), (-58), (-31) });
        org.junit.Assert.assertNotNull(period15);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.forStyle("DurationField[halfdays]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style specification: DurationField[halfdays]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.joda.time.Period period1 = org.joda.time.Period.days(7);
        org.joda.time.Period period3 = period1.plusMonths(60);
        org.joda.time.Period period5 = period3.minusSeconds(8);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.joda.time.Months months0 = org.joda.time.Months.MAX_VALUE;
        org.joda.time.Months months1 = org.joda.time.Months.EIGHT;
        org.joda.time.Months months2 = months0.minus(months1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes3 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) months0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot convert period to duration as months is not precise in the period P2147483647M");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(months0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertNotNull(months2);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.Partial partial2 = new org.joda.time.Partial((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology1.dayOfWeek();
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeField3.getAsText((long) (short) -1, locale5);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Wednesday" + "'", str6, "Wednesday");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology2.millisOfDay();
        java.util.Locale locale5 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 100, (org.joda.time.Chronology) gregorianChronology2, locale5, (java.lang.Integer) 13);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.addMonths((int) (short) 100);
        mutableDateTime0.setMillis((long) (byte) 1);
        java.lang.String str5 = mutableDateTime0.toString();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime0.setDayOfMonth((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01T00:00:00.001Z" + "'", str5, "1970-01-01T00:00:00.001Z");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.MIN_VALUE;
        boolean boolean2 = minutes0.isGreaterThan(minutes1);
        org.joda.time.Minutes minutes3 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes4 = org.joda.time.Minutes.MIN_VALUE;
        boolean boolean5 = minutes3.isGreaterThan(minutes4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes6 = minutes1.plus(minutes4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: -2147483648 + -2147483648");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(minutes3);
        org.junit.Assert.assertNotNull(minutes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.weekyear();
        int int4 = dateMidnight2.getDayOfWeek();
        org.joda.time.Chronology chronology5 = dateMidnight2.getChronology();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = property8.getFieldType();
        int int10 = dateMidnight2.get(dateTimeFieldType9);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod();
        mutablePeriod11.setHours(5);
        int int14 = mutablePeriod11.getSeconds();
        org.joda.time.Interval interval15 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight2, (org.joda.time.ReadablePeriod) mutablePeriod11);
        int int16 = dateMidnight2.getMonthOfYear();
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusHours((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.dayOfYear();
        org.joda.time.LocalDateTime.Property property5 = localDateTime3.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology7 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone6);
        org.joda.time.Days days8 = org.joda.time.Days.THREE;
        int[] intArray11 = gregorianChronology7.get((org.joda.time.ReadablePeriod) days8, (long) 0, (-1L));
        org.joda.time.Duration duration12 = days8.toStandardDuration();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime3.minus((org.joda.time.ReadableDuration) duration12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.weekyear();
        org.joda.time.LocalDateTime.Property property15 = localDateTime13.yearOfEra();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(gregorianChronology7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        int int0 = org.joda.time.DateTimeConstants.MINUTES_PER_DAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1440 + "'", int0 == 1440);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.joda.time.IllegalInstantException illegalInstantException1 = new org.joda.time.IllegalInstantException("hi!");
        boolean boolean2 = org.joda.time.IllegalInstantException.isIllegalInstant((java.lang.Throwable) illegalInstantException1);
        java.lang.String str3 = illegalInstantException1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.joda.time.IllegalInstantException: hi!" + "'", str3, "org.joda.time.IllegalInstantException: hi!");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.addMonths((int) (short) 100);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime0.hourOfDay();
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.joda.time.Chronology chronology2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay((int) '#', 330958, chronology2);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateTimeParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.ONE;
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.plus((org.joda.time.ReadablePeriod) weeks3);
        java.util.Date date5 = dateMidnight2.toDate();
        org.joda.time.YearMonthDay yearMonthDay6 = org.joda.time.YearMonthDay.fromDateFields(date5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = yearMonthDay6.toDateMidnight(dateTimeZone7);
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay6.plusMonths(8);
        org.joda.time.YearMonthDay.Property property11 = yearMonthDay6.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay12 = property11.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) 100, dateTimeZone14);
        boolean boolean17 = localTime15.equals((java.lang.Object) 26);
        int int18 = localTime15.size();
        org.joda.time.LocalTime localTime20 = localTime15.withMillisOfDay((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = property11.compareTo((org.joda.time.ReadablePartial) localTime20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'monthOfYear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Mon Mar 31 20:00:00 EDT 2025");
        org.junit.Assert.assertNotNull(yearMonthDay6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(yearMonthDay12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(localTime20);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.JulianChronology julianChronology1 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone0);
        org.joda.time.MonthDay monthDay2 = org.joda.time.MonthDay.now((org.joda.time.Chronology) julianChronology1);
        org.joda.time.MonthDay monthDay4 = monthDay2.withMonthOfYear((int) (byte) 10);
        org.joda.time.Hours hours5 = org.joda.time.Hours.FOUR;
        org.joda.time.Hours hours7 = hours5.dividedBy((int) (short) -1);
        org.joda.time.MonthDay monthDay8 = monthDay2.plus((org.joda.time.ReadablePeriod) hours7);
        org.junit.Assert.assertNotNull(julianChronology1);
        org.junit.Assert.assertNotNull(monthDay2);
        org.junit.Assert.assertNotNull(monthDay4);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertNotNull(hours7);
        org.junit.Assert.assertNotNull(monthDay8);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusMinutes((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusWeeks(1970);
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.hourOfDay();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.dayOfYear();
        org.joda.time.DateMidnight dateMidnight4 = property3.roundHalfEvenCopy();
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.plusWeeks((int) (byte) 10);
        boolean boolean8 = dateMidnight6.isBefore((long) (byte) 1);
        org.joda.time.DateMidnight.Property property9 = dateMidnight6.monthOfYear();
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        int int0 = org.joda.time.DateTimeConstants.MILLIS_PER_SECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1000 + "'", int0 == 1000);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendWeeks();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder2 = periodFormatterBuilder1.printZeroNever();
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder2);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfMonth((int) (byte) 1);
        org.joda.time.TimeOfDay timeOfDay4 = dateTime3.toTimeOfDay();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property7 = dateTime6.dayOfWeek();
        int int8 = dateTime6.getWeekyear();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime6.plus(readableDuration9);
        org.joda.time.DateTime.Property property11 = dateTime10.era();
        boolean boolean13 = dateTime10.isBefore(26L);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Chronology chronology15 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime10, readableInstant14);
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay4.withChronologyRetainFields(chronology15);
        org.joda.time.TimeOfDay.Property property17 = timeOfDay16.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay19 = property17.setCopy(0);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1970 + "'", int8 == 1970);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(timeOfDay19);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.ONE;
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.plus((org.joda.time.ReadablePeriod) weeks3);
        java.util.Date date5 = dateMidnight2.toDate();
        org.joda.time.YearMonthDay yearMonthDay6 = org.joda.time.YearMonthDay.fromDateFields(date5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = yearMonthDay6.toDateMidnight(dateTimeZone7);
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay6.plusMonths(8);
        org.joda.time.YearMonthDay.Property property11 = yearMonthDay6.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay12 = property11.withMinimumValue();
        org.joda.time.YearMonthDay yearMonthDay13 = property11.withMinimumValue();
        java.util.Locale locale15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay16 = property11.setCopy("100", locale15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"100\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Mon Mar 31 20:00:00 EDT 2025");
        org.junit.Assert.assertNotNull(yearMonthDay6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(yearMonthDay12);
        org.junit.Assert.assertNotNull(yearMonthDay13);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusHours((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology6 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone5);
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology6);
        org.joda.time.DateMidnight.Property property8 = dateMidnight7.dayOfYear();
        org.joda.time.DateMidnight dateMidnight9 = property8.roundHalfEvenCopy();
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.plusWeeks((int) (byte) 10);
        org.joda.time.Days days12 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType13 = days12.getFieldType();
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight11.withFieldAdded(durationFieldType13, 26);
        boolean boolean16 = localDateTime3.isSupported(durationFieldType13);
        int int17 = localDateTime3.getHourOfDay();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(gregorianChronology6);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 22 + "'", int17 == 22);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ONE;
        org.junit.Assert.assertNotNull(minutes0);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.dateHourMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight2 = org.joda.time.DateMidnight.parse("1969-12-19T00:00:00.007Z/1969-12-19T00:00:00.097Z", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"1969-12-19T00:00:00.007Z/1969-12-19T00:00:00.097Z\" is malformed at \":00.007Z/1969-12-19T00:00:00.097Z\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MonthDay monthDay1 = org.joda.time.MonthDay.fromCalendarFields(calendar0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The calendar must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.Chronology chronology3 = julianChronology2.withUTC();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, (org.joda.time.Chronology) julianChronology2, locale4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology7 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone6);
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology10 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone9);
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology10);
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology10.weekyearOfCentury();
        int int13 = dateMidnight8.get(dateTimeField12);
        org.joda.time.field.SkipDateTimeField skipDateTimeField14 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) julianChronology2, dateTimeField12);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property21 = dateTime19.property(dateTimeFieldType20);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.chrono.JulianChronology julianChronology23 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone22);
        org.joda.time.Chronology chronology24 = julianChronology23.withUTC();
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType20.getField((org.joda.time.Chronology) julianChronology23);
        org.joda.time.MutableInterval mutableInterval26 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology23);
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) (short) -1, (org.joda.time.Chronology) julianChronology23);
        java.util.Locale locale29 = null;
        java.lang.String str30 = skipDateTimeField14.getAsText((org.joda.time.ReadablePartial) localDateTime27, 0, locale29);
        long long32 = skipDateTimeField14.roundCeiling((long) '4');
        long long34 = skipDateTimeField14.remainder(2024L);
        int int36 = skipDateTimeField14.get(410659200097L);
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(gregorianChronology7);
        org.junit.Assert.assertNotNull(gregorianChronology10);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 26 + "'", int13 == 26);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(julianChronology23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "0" + "'", str30, "0");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 31795200000L + "'", long32 == 31795200000L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 259202024L + "'", long34 == 259202024L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 84 + "'", int36 == 84);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.joda.time.Days days3 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType4 = days3.getFieldType();
        org.joda.time.PeriodType periodType5 = days3.getPeriodType();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property11 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.chrono.JulianChronology julianChronology13 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone12);
        org.joda.time.Chronology chronology14 = julianChronology13.withUTC();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType10.getField((org.joda.time.Chronology) julianChronology13);
        org.joda.time.MutableInterval mutableInterval16 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology13);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.chrono.JulianChronology julianChronology18 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone17);
        org.joda.time.Chronology chronology19 = julianChronology18.withUTC();
        mutableInterval16.setChronology((org.joda.time.Chronology) julianChronology18);
        org.joda.time.Period period21 = new org.joda.time.Period((long) (byte) 0, periodType5, (org.joda.time.Chronology) julianChronology18);
        org.joda.time.Days days22 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType23 = days22.getFieldType();
        org.joda.time.PeriodType periodType24 = days22.getPeriodType();
        boolean boolean25 = periodType5.equals((java.lang.Object) periodType24);
        org.joda.time.Period period26 = new org.joda.time.Period(10L, (long) 25, periodType5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period28 = period26.withMinutes(9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(julianChronology13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(julianChronology18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        int int0 = org.joda.time.YearMonthDay.MONTH_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusHours((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusMillis(2);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.millisOfSecond();
        org.joda.time.Chronology chronology9 = localDateTime7.getChronology();
        org.joda.time.Period period10 = new org.joda.time.Period((-1924473598031L), 259202024L, chronology9);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfMonth((int) (byte) 1);
        org.joda.time.Instant instant4 = dateTime3.toInstant();
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardDays((long) 8);
        org.joda.time.Instant instant7 = instant4.minus((org.joda.time.ReadableDuration) duration6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology10 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone9);
        org.joda.time.Days days11 = org.joda.time.Days.THREE;
        int[] intArray14 = gregorianChronology10.get((org.joda.time.ReadablePeriod) days11, (long) 0, (-1L));
        org.joda.time.DateTimeField dateTimeField15 = gregorianChronology10.dayOfMonth();
        org.joda.time.DurationField durationField16 = gregorianChronology10.millis();
        java.util.Locale locale17 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) 26, (org.joda.time.Chronology) gregorianChronology10, locale17);
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay((java.lang.Object) instant4, (org.joda.time.Chronology) gregorianChronology10);
        org.joda.time.YearMonthDay yearMonthDay21 = yearMonthDay19.plusDays(8);
        int int22 = yearMonthDay21.getMonthOfYear();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(gregorianChronology10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 0 });
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(yearMonthDay21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.Days days2 = org.joda.time.Days.THREE;
        int[] intArray5 = gregorianChronology1.get((org.joda.time.ReadablePeriod) days2, (long) 0, (-1L));
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology1.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusHours((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.dayOfYear();
        org.joda.time.LocalDateTime.Property property12 = localDateTime10.dayOfMonth();
        int int13 = localDateTime10.getEra();
        int int14 = localDateTime10.getCenturyOfEra();
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeField6.getAsShortText((org.joda.time.ReadablePartial) localDateTime10, 2025, locale16);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0 });
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 19 + "'", int14 == 19);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2025" + "'", str17, "2025");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfMonth((int) (byte) 1);
        org.joda.time.TimeOfDay timeOfDay4 = dateTime3.toTimeOfDay();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property7 = dateTime6.dayOfWeek();
        int int8 = dateTime6.getWeekyear();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime6.plus(readableDuration9);
        org.joda.time.DateTime.Property property11 = dateTime10.era();
        boolean boolean13 = dateTime10.isBefore(26L);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Chronology chronology15 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime10, readableInstant14);
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay4.withChronologyRetainFields(chronology15);
        org.joda.time.TimeOfDay.Property property17 = timeOfDay16.millisOfSecond();
        java.util.Locale locale18 = null;
        int int19 = property17.getMaximumTextLength(locale18);
        org.joda.time.TimeOfDay timeOfDay20 = property17.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay22 = property17.setCopy("GregorianChronology[UTC]");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"GregorianChronology[UTC]\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1970 + "'", int8 == 1970);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(timeOfDay20);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.addMonths((int) (short) 100);
        mutableDateTime0.setMillis((long) (byte) 1);
        java.lang.String str5 = mutableDateTime0.toString();
        mutableDateTime0.setWeekyear(84);
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01T00:00:00.001Z" + "'", str5, "1970-01-01T00:00:00.001Z");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology8 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone7);
        org.joda.time.Days days9 = org.joda.time.Days.THREE;
        int[] intArray12 = gregorianChronology8.get((org.joda.time.ReadablePeriod) days9, (long) 0, (-1L));
        org.joda.time.DurationField durationField13 = gregorianChronology8.halfdays();
        org.joda.time.Chronology chronology14 = gregorianChronology8.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(9, (int) (short) -1, 70067048, (int) '#', 2, 22, 60, (org.joda.time.Chronology) gregorianChronology8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 0 });
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(chronology14);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateOptionalTimeParser();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(1000, (-19), 70067048, 330958, 86400, (int) (byte) 1, 2025);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 330958 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.tz.DateTimeZoneBuilder.readFrom(inputStream0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.joda.time.Days days1 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType2 = days1.getFieldType();
        org.joda.time.PeriodType periodType3 = days1.getPeriodType();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property9 = dateTime7.property(dateTimeFieldType8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.chrono.JulianChronology julianChronology11 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone10);
        org.joda.time.Chronology chronology12 = julianChronology11.withUTC();
        org.joda.time.DateTimeField dateTimeField13 = dateTimeFieldType8.getField((org.joda.time.Chronology) julianChronology11);
        org.joda.time.MutableInterval mutableInterval14 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology11);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.chrono.JulianChronology julianChronology16 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone15);
        org.joda.time.Chronology chronology17 = julianChronology16.withUTC();
        mutableInterval14.setChronology((org.joda.time.Chronology) julianChronology16);
        org.joda.time.Period period19 = new org.joda.time.Period((long) (byte) 0, periodType3, (org.joda.time.Chronology) julianChronology16);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType21 = dateTimeFieldType20.getRangeDurationType();
        boolean boolean22 = period19.isSupported(durationFieldType21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period24 = period19.withYears(80);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(julianChronology11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(julianChronology16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property2 = dateTime1.dayOfWeek();
        org.joda.time.DateTime dateTime3 = property2.roundHalfFloorCopy();
        int int4 = dateTime3.getSecondOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.dayOfYear();
        org.joda.time.DateMidnight dateMidnight4 = property3.roundHalfEvenCopy();
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.plusWeeks((int) (byte) 10);
        org.joda.time.Days days7 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType8 = days7.getFieldType();
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight6.withFieldAdded(durationFieldType8, 26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval11 = new org.joda.time.Interval((java.lang.Object) dateMidnight10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No interval converter found for type: org.joda.time.DateMidnight");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertNotNull(dateMidnight10);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.setDayOfYear(8);
        int int3 = mutableDateTime0.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime0.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime6 = property4.addWrapField(0);
        mutableDateTime6.setTime((long) 32);
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 25 + "'", int3 == 25);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime6);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.Chronology chronology3 = julianChronology2.withUTC();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, (org.joda.time.Chronology) julianChronology2, locale4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology7 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone6);
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology10 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone9);
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology10);
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology10.weekyearOfCentury();
        int int13 = dateMidnight8.get(dateTimeField12);
        org.joda.time.field.SkipDateTimeField skipDateTimeField14 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) julianChronology2, dateTimeField12);
        int int15 = skipDateTimeField14.getMinimumValue();
        java.util.Locale locale17 = null;
        java.lang.String str18 = skipDateTimeField14.getAsShortText(26, locale17);
        long long21 = skipDateTimeField14.addWrapField((long) 'a', 13);
        long long23 = skipDateTimeField14.roundHalfCeiling((long) 0);
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(gregorianChronology7);
        org.junit.Assert.assertNotNull(gregorianChronology10);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 26 + "'", int13 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "26" + "'", str18, "26");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 410659200097L + "'", long21 == 410659200097L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-259200000L) + "'", long23 == (-259200000L));
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.Chronology chronology3 = julianChronology2.withUTC();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, (org.joda.time.Chronology) julianChronology2, locale4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology7 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone6);
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology10 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone9);
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology10);
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology10.weekyearOfCentury();
        int int13 = dateMidnight8.get(dateTimeField12);
        org.joda.time.field.SkipDateTimeField skipDateTimeField14 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) julianChronology2, dateTimeField12);
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay((org.joda.time.Chronology) julianChronology2);
        org.joda.time.Chronology chronology16 = julianChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField17 = julianChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField18 = julianChronology2.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(gregorianChronology7);
        org.junit.Assert.assertNotNull(gregorianChronology10);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 26 + "'", int13 == 26);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.printZeroIfSupported();
        periodFormatterBuilder1.clear();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder1.appendWeeks();
        java.lang.String[] strArray8 = new java.lang.String[] { "Wednesday", "1970-01-01T00:00:00.001Z", "UTC", "91" };
        java.lang.String[] strArray14 = new java.lang.String[] { "hourOfHalfday", "26", "hi!", "00:01:37.035", "Coordinated Universal Time" };
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder15 = periodFormatterBuilder3.appendSuffix(strArray8, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "Wednesday", "1970-01-01T00:00:00.001Z", "UTC", "91" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hourOfHalfday", "26", "hi!", "00:01:37.035", "Coordinated Universal Time" });
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale1 = null;
        java.lang.String str4 = nameProvider0.getName(locale1, "hi!", "1969-12-19T00:00:00.007Z/1969-12-19T00:00:00.097Z");
        org.junit.Assert.assertNotNull(nameProvider0);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.date();
        java.io.Writer writer1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.now();
        mutableDateTime2.addMonths((int) (short) 100);
        mutableDateTime2.setMillis((long) (byte) 1);
        java.lang.String str7 = mutableDateTime2.toString();
        org.joda.time.Instant instant8 = mutableDateTime2.toInstant();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(writer1, (org.joda.time.ReadableInstant) instant8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01T00:00:00.001Z" + "'", str7, "1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(instant8);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology1.dayOfYear();
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 31795200000L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2746894413240000000L + "'", long1 == 2746894413240000000L);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withYearOfEra(10);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.JulianChronology julianChronology5 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone4);
        org.joda.time.Chronology chronology6 = julianChronology5.withUTC();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, (org.joda.time.Chronology) julianChronology5, locale7);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property11 = dateTime10.dayOfWeek();
        int int12 = dateTime10.getWeekyear();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime14 = dateTime10.plus(readableDuration13);
        org.joda.time.DateTime.Property property15 = dateTime14.era();
        boolean boolean16 = dateTimeParserBucket8.restoreState((java.lang.Object) property15);
        org.joda.time.DateTimeZone dateTimeZone17 = dateTimeParserBucket8.getZone();
        org.joda.time.DateTime dateTime18 = localDate0.toDateTimeAtCurrentTime(dateTimeZone17);
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.plusMinutes((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = localDate0.compareTo((org.joda.time.ReadablePartial) localDateTime20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(julianChronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1970 + "'", int12 == 1970);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(localDateTime22);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.Chronology chronology3 = julianChronology2.withUTC();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, (org.joda.time.Chronology) julianChronology2, locale4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology7 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone6);
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology10 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone9);
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology10);
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology10.weekyearOfCentury();
        int int13 = dateMidnight8.get(dateTimeField12);
        org.joda.time.field.SkipDateTimeField skipDateTimeField14 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) julianChronology2, dateTimeField12);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property21 = dateTime19.property(dateTimeFieldType20);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.chrono.JulianChronology julianChronology23 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone22);
        org.joda.time.Chronology chronology24 = julianChronology23.withUTC();
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType20.getField((org.joda.time.Chronology) julianChronology23);
        org.joda.time.MutableInterval mutableInterval26 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology23);
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) (short) -1, (org.joda.time.Chronology) julianChronology23);
        java.util.Locale locale29 = null;
        java.lang.String str30 = skipDateTimeField14.getAsText((org.joda.time.ReadablePartial) localDateTime27, 0, locale29);
        org.joda.time.DurationField durationField31 = skipDateTimeField14.getRangeDurationField();
        org.joda.time.Days days32 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType33 = days32.getFieldType();
        org.joda.time.field.ScaledDurationField scaledDurationField35 = new org.joda.time.field.ScaledDurationField(durationField31, durationFieldType33, 1440);
        // The following exception was thrown during execution in test generation
        try {
            long long38 = scaledDurationField35.add((long) 70067048, (long) 86400);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 12441600000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(gregorianChronology7);
        org.junit.Assert.assertNotNull(gregorianChronology10);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 26 + "'", int13 == 26);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(julianChronology23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "0" + "'", str30, "0");
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(days32);
        org.junit.Assert.assertNotNull(durationFieldType33);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfMonth((int) (byte) 1);
        org.joda.time.TimeOfDay timeOfDay4 = dateTime3.toTimeOfDay();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property7 = dateTime6.dayOfWeek();
        int int8 = dateTime6.getWeekyear();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime6.plus(readableDuration9);
        org.joda.time.DateTime.Property property11 = dateTime10.era();
        boolean boolean13 = dateTime10.isBefore(26L);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Chronology chronology15 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime10, readableInstant14);
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay4.withChronologyRetainFields(chronology15);
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay16.minusSeconds((int) ' ');
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod();
        org.joda.time.ReadableInterval readableInterval20 = null;
        mutablePeriod19.add(readableInterval20);
        org.joda.time.TimeOfDay timeOfDay23 = timeOfDay18.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod19, 1970);
        org.joda.time.TimeOfDay timeOfDay25 = timeOfDay18.withMinuteOfHour(9);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1970 + "'", int8 == 1970);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(timeOfDay25);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        java.util.Set<java.lang.String> strSet1 = provider0.getAvailableIDs();
        org.junit.Assert.assertNotNull(provider0);
        org.junit.Assert.assertNotNull(strSet1);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longDate();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.FormatUtils.appendPaddedInteger(stringBuffer0, (int) (byte) 1, 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property3 = dateTime1.property(dateTimeFieldType2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.JulianChronology julianChronology5 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone4);
        org.joda.time.Chronology chronology6 = julianChronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType2.getField((org.joda.time.Chronology) julianChronology5);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeField7.getAsShortText((int) (byte) 0, locale9);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property14 = dateTime12.property(dateTimeFieldType13);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField18 = new org.joda.time.field.OffsetDateTimeField(dateTimeField7, dateTimeFieldType13, (int) (byte) -1, (int) (byte) -1, (-35));
        int int20 = offsetDateTimeField18.getLeapAmount((long) (short) 0);
        int int21 = offsetDateTimeField18.getMaximumValue();
        long long23 = offsetDateTimeField18.roundHalfEven((long) (short) 100);
        boolean boolean25 = offsetDateTimeField18.isLeap((long) 13);
        int int26 = offsetDateTimeField18.getOffset();
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(julianChronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-35) + "'", int21 == (-35));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.Days days2 = org.joda.time.Days.THREE;
        int[] intArray5 = gregorianChronology1.get((org.joda.time.ReadablePeriod) days2, (long) 0, (-1L));
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology1.dayOfMonth();
        org.joda.time.DurationField durationField7 = gregorianChronology1.years();
        org.joda.time.DurationField durationField8 = gregorianChronology1.hours();
        long long10 = durationField8.getMillis((long) 5);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0 });
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 18000000L + "'", long10 == 18000000L);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.fullTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.parse("100", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"100\" is malformed at \"0\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 100);
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod();
        mutablePeriod0.setMonths(0);
        mutablePeriod0.addMonths((int) (byte) -1);
        mutablePeriod0.add((long) '4');
        mutablePeriod0.setSeconds(10);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateHourMinuteSecondMillis();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.Chronology chronology3 = julianChronology2.withUTC();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, (org.joda.time.Chronology) julianChronology2, locale4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology7 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone6);
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology10 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone9);
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology10);
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology10.weekyearOfCentury();
        int int13 = dateMidnight8.get(dateTimeField12);
        org.joda.time.field.SkipDateTimeField skipDateTimeField14 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) julianChronology2, dateTimeField12);
        int int16 = skipDateTimeField14.getMaximumValue(101L);
        java.lang.String str17 = skipDateTimeField14.toString();
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(gregorianChronology7);
        org.junit.Assert.assertNotNull(gregorianChronology10);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 26 + "'", int13 == 26);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "DateTimeField[weekyearOfCentury]" + "'", str17, "DateTimeField[weekyearOfCentury]");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.joda.time.Hours hours0 = org.joda.time.Hours.SIX;
        org.junit.Assert.assertNotNull(hours0);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.ONE;
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.plus((org.joda.time.ReadablePeriod) weeks3);
        java.util.Date date5 = dateMidnight2.toDate();
        org.joda.time.YearMonthDay yearMonthDay6 = org.joda.time.YearMonthDay.fromDateFields(date5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = yearMonthDay6.toDateMidnight(dateTimeZone7);
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay6.plusMonths(8);
        org.joda.time.YearMonthDay.Property property11 = yearMonthDay6.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay12 = property11.withMinimumValue();
        org.joda.time.YearMonthDay yearMonthDay13 = property11.withMinimumValue();
        org.joda.time.YearMonthDay yearMonthDay15 = yearMonthDay13.plusDays(2);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Mon Mar 31 20:00:00 EDT 2025");
        org.junit.Assert.assertNotNull(yearMonthDay6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(yearMonthDay12);
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertNotNull(yearMonthDay15);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.joda.time.Months months0 = org.joda.time.Months.EIGHT;
        org.joda.time.Months months2 = months0.minus((int) ' ');
        org.joda.time.Months months4 = months0.minus((int) (byte) 1);
        org.junit.Assert.assertNotNull(months0);
        org.junit.Assert.assertNotNull(months2);
        org.junit.Assert.assertNotNull(months4);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property3 = dateTime1.property(dateTimeFieldType2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.JulianChronology julianChronology5 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone4);
        org.joda.time.Chronology chronology6 = julianChronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType2.getField((org.joda.time.Chronology) julianChronology5);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeField7.getAsShortText((int) (byte) 0, locale9);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property14 = dateTime12.property(dateTimeFieldType13);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField18 = new org.joda.time.field.OffsetDateTimeField(dateTimeField7, dateTimeFieldType13, (int) (byte) -1, (int) (byte) -1, (-35));
        int int20 = offsetDateTimeField18.getLeapAmount((long) (short) 0);
        org.joda.time.DateTimeField dateTimeField21 = org.joda.time.field.StrictDateTimeField.getInstance((org.joda.time.DateTimeField) offsetDateTimeField18);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property26 = dateTime24.property(dateTimeFieldType25);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.chrono.JulianChronology julianChronology28 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone27);
        org.joda.time.Chronology chronology29 = julianChronology28.withUTC();
        org.joda.time.DateTimeField dateTimeField30 = dateTimeFieldType25.getField((org.joda.time.Chronology) julianChronology28);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.Chronology chronology32 = julianChronology28.withZone(dateTimeZone31);
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime((long) '#', chronology32);
        org.joda.time.LocalTime localTime35 = localTime33.plusSeconds((int) 'a');
        int[] intArray39 = new int[] { 26, '#', 31 };
        int int40 = offsetDateTimeField18.getMinimumValue((org.joda.time.ReadablePartial) localTime35, intArray39);
        org.joda.time.LocalTime.Property property41 = localTime35.minuteOfHour();
        org.joda.time.LocalTime localTime42 = property41.roundCeilingCopy();
        org.joda.time.LocalTime localTime43 = property41.roundFloorCopy();
        org.joda.time.LocalTime localTime44 = property41.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(julianChronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(julianChronology28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { 26, 35, 31 });
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(localTime44);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.weekyear();
        int int4 = dateMidnight2.getDayOfWeek();
        org.joda.time.Chronology chronology5 = dateMidnight2.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight7 = dateMidnight2.withWeekOfWeekyear((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(chronology5);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.weekyear();
        int int4 = dateMidnight2.getDayOfWeek();
        org.joda.time.Chronology chronology5 = dateMidnight2.getChronology();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = property8.getFieldType();
        int int10 = dateMidnight2.get(dateTimeFieldType9);
        org.joda.time.IllegalFieldValueException illegalFieldValueException13 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType9, (java.lang.Number) (-1511999993L), "1970-01-01T00:00:00.001Z");
        java.lang.String str14 = illegalFieldValueException13.getIllegalStringValue();
        java.lang.Number number15 = illegalFieldValueException13.getIllegalNumberValue();
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + number15 + "' != '" + (-1511999993L) + "'", number15, (-1511999993L));
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfMonth((int) (byte) 1);
        org.joda.time.Instant instant4 = dateTime3.toInstant();
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardDays((long) 8);
        org.joda.time.Instant instant7 = instant4.minus((org.joda.time.ReadableDuration) duration6);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property11 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.chrono.JulianChronology julianChronology13 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone12);
        org.joda.time.Chronology chronology14 = julianChronology13.withUTC();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType10.getField((org.joda.time.Chronology) julianChronology13);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeField15.getAsShortText((int) (byte) 0, locale17);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property22 = dateTime20.property(dateTimeFieldType21);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField26 = new org.joda.time.field.OffsetDateTimeField(dateTimeField15, dateTimeFieldType21, (int) (byte) -1, (int) (byte) -1, (-35));
        int int28 = offsetDateTimeField26.getLeapAmount((long) (short) 0);
        org.joda.time.DateTimeField dateTimeField29 = org.joda.time.field.StrictDateTimeField.getInstance((org.joda.time.DateTimeField) offsetDateTimeField26);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property34 = dateTime32.property(dateTimeFieldType33);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.chrono.JulianChronology julianChronology36 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone35);
        org.joda.time.Chronology chronology37 = julianChronology36.withUTC();
        org.joda.time.DateTimeField dateTimeField38 = dateTimeFieldType33.getField((org.joda.time.Chronology) julianChronology36);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.Chronology chronology40 = julianChronology36.withZone(dateTimeZone39);
        org.joda.time.LocalTime localTime41 = new org.joda.time.LocalTime((long) '#', chronology40);
        org.joda.time.LocalTime localTime43 = localTime41.plusSeconds((int) 'a');
        int[] intArray47 = new int[] { 26, '#', 31 };
        int int48 = offsetDateTimeField26.getMinimumValue((org.joda.time.ReadablePartial) localTime43, intArray47);
        int int50 = offsetDateTimeField26.getMaximumValue(90L);
        int int51 = instant4.get((org.joda.time.DateTimeField) offsetDateTimeField26);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(julianChronology13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0" + "'", str18, "0");
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(julianChronology36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertArrayEquals(intArray47, new int[] { 26, 35, 31 });
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-35) + "'", int50 == (-35));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.Chronology chronology3 = julianChronology2.withUTC();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, (org.joda.time.Chronology) julianChronology2, locale4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology7 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone6);
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology10 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone9);
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology10);
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology10.weekyearOfCentury();
        int int13 = dateMidnight8.get(dateTimeField12);
        org.joda.time.field.SkipDateTimeField skipDateTimeField14 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) julianChronology2, dateTimeField12);
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay((org.joda.time.Chronology) julianChronology2);
        org.joda.time.Chronology chronology16 = julianChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField17 = julianChronology2.halfdayOfDay();
        java.lang.Object obj18 = null;
        boolean boolean19 = julianChronology2.equals(obj18);
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(gregorianChronology7);
        org.junit.Assert.assertNotNull(gregorianChronology10);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 26 + "'", int13 == 26);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone3);
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology4);
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology4.weekyearOfCentury();
        int int7 = dateMidnight2.get(dateTimeField6);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property10 = dateTime9.dayOfWeek();
        int int11 = dateTime9.getWeekyear();
        int int12 = dateTime9.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology14 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone13);
        org.joda.time.Days days15 = org.joda.time.Days.THREE;
        int[] intArray18 = gregorianChronology14.get((org.joda.time.ReadablePeriod) days15, (long) 0, (-1L));
        org.joda.time.Duration duration19 = days15.toStandardDuration();
        org.joda.time.DateTime dateTime21 = dateTime9.withDurationAdded((org.joda.time.ReadableDuration) duration19, 26);
        org.joda.time.Duration duration23 = duration19.multipliedBy((long) (short) 1);
        org.joda.time.Duration duration24 = duration23.toDuration();
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property27 = dateTime26.dayOfWeek();
        org.joda.time.format.PeriodFormatter periodFormatter28 = org.joda.time.format.ISOPeriodFormat.alternateExtended();
        org.joda.time.PeriodType periodType29 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.format.PeriodFormatter periodFormatter30 = periodFormatter28.withParseType(periodType29);
        org.joda.time.Period period31 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration23, (org.joda.time.ReadableInstant) dateTime26, periodType29);
        org.joda.time.Days days32 = org.joda.time.Days.daysBetween((org.joda.time.ReadableInstant) dateMidnight2, (org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.Days days34 = days32.minus(13);
        org.joda.time.Years years36 = org.joda.time.Years.years((int) (short) 0);
        org.joda.time.Years years38 = org.joda.time.Years.years((int) (short) 0);
        org.joda.time.Years years39 = years36.plus(years38);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = days34.compareTo((org.joda.time.base.BaseSingleFieldPeriod) years38);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.joda.time.Days cannot be compared to class org.joda.time.Years");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(gregorianChronology4);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 26 + "'", int7 == 26);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1970 + "'", int11 == 1970);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(gregorianChronology14);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(periodFormatter28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(periodFormatter30);
        org.junit.Assert.assertNotNull(days32);
        org.junit.Assert.assertNotNull(days34);
        org.junit.Assert.assertNotNull(years36);
        org.junit.Assert.assertNotNull(years38);
        org.junit.Assert.assertNotNull(years39);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.Days days2 = org.joda.time.Days.THREE;
        int[] intArray5 = gregorianChronology1.get((org.joda.time.ReadablePeriod) days2, (long) 0, (-1L));
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology1.dayOfMonth();
        org.joda.time.DurationField durationField7 = gregorianChronology1.eras();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology1.hourOfDay();
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0 });
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.ordinalDate();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((java.lang.Object) dateTimeZone0, dateTimeZone2);
        int int4 = mutableDateTime3.getRoundingMode();
        mutableDateTime3.addDays(0);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime3.setDayOfWeek((-86401));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -86401 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfMonth((int) (byte) 1);
        org.joda.time.TimeOfDay timeOfDay4 = dateTime3.toTimeOfDay();
        org.joda.time.DateTime dateTime5 = timeOfDay4.toDateTimeToday();
        long long6 = org.joda.time.DateTimeUtils.getInstantMillis((org.joda.time.ReadableInstant) dateTime5);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1743465600001L + "'", long6 == 1743465600001L);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.ONE;
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.plus((org.joda.time.ReadablePeriod) weeks3);
        java.util.Date date5 = dateMidnight2.toDate();
        org.joda.time.YearMonthDay yearMonthDay6 = org.joda.time.YearMonthDay.fromDateFields(date5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = yearMonthDay6.toDateMidnight(dateTimeZone7);
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay6.plusMonths(8);
        org.joda.time.YearMonthDay.Property property11 = yearMonthDay6.monthOfYear();
        org.joda.time.Period period13 = org.joda.time.Period.days(7);
        org.joda.time.Period period15 = period13.plusMonths(60);
        org.joda.time.YearMonthDay yearMonthDay17 = yearMonthDay6.withPeriodAdded((org.joda.time.ReadablePeriod) period13, (int) (short) 1);
        org.joda.time.YearMonthDay yearMonthDay19 = yearMonthDay6.minusYears((int) ' ');
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Mon Mar 31 20:00:00 EDT 2025");
        org.junit.Assert.assertNotNull(yearMonthDay6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(yearMonthDay17);
        org.junit.Assert.assertNotNull(yearMonthDay19);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendWeeks();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder2 = periodFormatterBuilder1.appendSecondsWithMillis();
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder2);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfMonth((int) (byte) 1);
        org.joda.time.TimeOfDay timeOfDay4 = dateTime3.toTimeOfDay();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property7 = dateTime6.dayOfWeek();
        int int8 = dateTime6.getWeekyear();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime6.plus(readableDuration9);
        org.joda.time.DateTime.Property property11 = dateTime10.era();
        boolean boolean13 = dateTime10.isBefore(26L);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Chronology chronology15 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime10, readableInstant14);
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay4.withChronologyRetainFields(chronology15);
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay16.minusSeconds((int) ' ');
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property22 = dateTime20.property(dateTimeFieldType21);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.chrono.JulianChronology julianChronology24 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone23);
        org.joda.time.Chronology chronology25 = julianChronology24.withUTC();
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType21.getField((org.joda.time.Chronology) julianChronology24);
        java.util.Locale locale28 = null;
        java.lang.String str29 = dateTimeField26.getAsShortText((int) (byte) 0, locale28);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property33 = dateTime31.property(dateTimeFieldType32);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField37 = new org.joda.time.field.OffsetDateTimeField(dateTimeField26, dateTimeFieldType32, (int) (byte) -1, (int) (byte) -1, (-35));
        int int39 = offsetDateTimeField37.getLeapAmount((long) (short) 0);
        org.joda.time.DateTimeField dateTimeField40 = org.joda.time.field.StrictDateTimeField.getInstance((org.joda.time.DateTimeField) offsetDateTimeField37);
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property45 = dateTime43.property(dateTimeFieldType44);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.chrono.JulianChronology julianChronology47 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone46);
        org.joda.time.Chronology chronology48 = julianChronology47.withUTC();
        org.joda.time.DateTimeField dateTimeField49 = dateTimeFieldType44.getField((org.joda.time.Chronology) julianChronology47);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.Chronology chronology51 = julianChronology47.withZone(dateTimeZone50);
        org.joda.time.LocalTime localTime52 = new org.joda.time.LocalTime((long) '#', chronology51);
        org.joda.time.LocalTime localTime54 = localTime52.plusSeconds((int) 'a');
        int[] intArray58 = new int[] { 26, '#', 31 };
        int int59 = offsetDateTimeField37.getMinimumValue((org.joda.time.ReadablePartial) localTime54, intArray58);
        org.joda.time.LocalTime.Property property60 = localTime54.minuteOfHour();
        org.joda.time.LocalTime localTime61 = property60.withMaximumValue();
        org.joda.time.Hours hours62 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadablePartial) timeOfDay18, (org.joda.time.ReadablePartial) localTime61);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1970 + "'", int8 == 1970);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(julianChronology24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "0" + "'", str29, "0");
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(julianChronology47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(localTime54);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertArrayEquals(intArray58, new int[] { 26, 35, 31 });
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(localTime61);
        org.junit.Assert.assertNotNull(hours62);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.millis();
        org.junit.Assert.assertNotNull(durationFieldType0);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property4 = dateTime2.property(dateTimeFieldType3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.JulianChronology julianChronology6 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone5);
        org.joda.time.Chronology chronology7 = julianChronology6.withUTC();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType3.getField((org.joda.time.Chronology) julianChronology6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.Chronology chronology10 = julianChronology6.withZone(dateTimeZone9);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((long) '#', chronology10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.LocalTime localTime13 = property12.roundFloorCopy();
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(julianChronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfWeek();
        mutableDateTime0.addMonths(26);
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime0.yearOfEra();
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property2 = dateTime1.dayOfWeek();
        int int3 = dateTime1.getWeekyear();
        org.joda.time.DateTime dateTime5 = dateTime1.minusDays(26);
        org.joda.time.DateTime.Property property6 = dateTime1.hourOfDay();
        boolean boolean8 = dateTime1.isAfter((long) (short) 1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1970 + "'", int3 == 1970);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.Chronology chronology3 = julianChronology2.withUTC();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, (org.joda.time.Chronology) julianChronology2, locale4);
        long long8 = dateTimeParserBucket5.computeMillis(true, "91");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = org.joda.time.format.DateTimeFormat.fullTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter9.withOffsetParsed();
        org.joda.time.format.DateTimeParser dateTimeParser11 = dateTimeFormatter10.getParser();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = dateTimeParserBucket5.parseMillis(dateTimeParser11, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeParser11);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property3 = dateTime1.property(dateTimeFieldType2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.JulianChronology julianChronology5 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone4);
        org.joda.time.Chronology chronology6 = julianChronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType2.getField((org.joda.time.Chronology) julianChronology5);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeField7.getAsShortText((int) (byte) 0, locale9);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property14 = dateTime12.property(dateTimeFieldType13);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField18 = new org.joda.time.field.OffsetDateTimeField(dateTimeField7, dateTimeFieldType13, (int) (byte) -1, (int) (byte) -1, (-35));
        int int20 = offsetDateTimeField18.getLeapAmount((long) (short) 0);
        org.joda.time.DateTimeField dateTimeField21 = org.joda.time.field.StrictDateTimeField.getInstance((org.joda.time.DateTimeField) offsetDateTimeField18);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property26 = dateTime24.property(dateTimeFieldType25);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.chrono.JulianChronology julianChronology28 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone27);
        org.joda.time.Chronology chronology29 = julianChronology28.withUTC();
        org.joda.time.DateTimeField dateTimeField30 = dateTimeFieldType25.getField((org.joda.time.Chronology) julianChronology28);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.Chronology chronology32 = julianChronology28.withZone(dateTimeZone31);
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime((long) '#', chronology32);
        org.joda.time.LocalTime localTime35 = localTime33.plusSeconds((int) 'a');
        int[] intArray39 = new int[] { 26, '#', 31 };
        int int40 = offsetDateTimeField18.getMinimumValue((org.joda.time.ReadablePartial) localTime35, intArray39);
        org.joda.time.LocalTime.Property property41 = localTime35.minuteOfHour();
        org.joda.time.LocalTime localTime42 = property41.withMaximumValue();
        org.joda.time.Seconds seconds43 = org.joda.time.Seconds.TWO;
        org.joda.time.LocalTime localTime44 = localTime42.minus((org.joda.time.ReadablePeriod) seconds43);
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate47 = localDate45.withYearOfEra(10);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.chrono.JulianChronology julianChronology50 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone49);
        org.joda.time.Chronology chronology51 = julianChronology50.withUTC();
        java.util.Locale locale52 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket53 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, (org.joda.time.Chronology) julianChronology50, locale52);
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property56 = dateTime55.dayOfWeek();
        int int57 = dateTime55.getWeekyear();
        org.joda.time.ReadableDuration readableDuration58 = null;
        org.joda.time.DateTime dateTime59 = dateTime55.plus(readableDuration58);
        org.joda.time.DateTime.Property property60 = dateTime59.era();
        boolean boolean61 = dateTimeParserBucket53.restoreState((java.lang.Object) property60);
        org.joda.time.DateTimeZone dateTimeZone62 = dateTimeParserBucket53.getZone();
        org.joda.time.DateTime dateTime63 = localDate45.toDateTimeAtCurrentTime(dateTimeZone62);
        org.joda.time.DateTime dateTime64 = org.joda.time.DateTime.now(dateTimeZone62);
        org.joda.time.LocalDate localDate65 = dateTime64.toLocalDate();
        // The following exception was thrown during execution in test generation
        try {
            int int66 = localTime42.compareTo((org.joda.time.ReadablePartial) localDate65);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(julianChronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(julianChronology28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { 26, 35, 31 });
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(seconds43);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(localDate47);
        org.junit.Assert.assertNotNull(julianChronology50);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1970 + "'", int57 == 1970);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(dateTimeZone62);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(localDate65);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.junit.Assert.assertNotNull(instant0);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property3 = dateTime1.property(dateTimeFieldType2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.JulianChronology julianChronology5 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone4);
        org.joda.time.Chronology chronology6 = julianChronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType2.getField((org.joda.time.Chronology) julianChronology5);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeField7.getAsShortText((int) (byte) 0, locale9);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property14 = dateTime12.property(dateTimeFieldType13);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField18 = new org.joda.time.field.OffsetDateTimeField(dateTimeField7, dateTimeFieldType13, (int) (byte) -1, (int) (byte) -1, (-35));
        int int20 = offsetDateTimeField18.getLeapAmount((long) (short) 0);
        org.joda.time.DateTimeField dateTimeField21 = org.joda.time.field.StrictDateTimeField.getInstance((org.joda.time.DateTimeField) offsetDateTimeField18);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property26 = dateTime24.property(dateTimeFieldType25);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.chrono.JulianChronology julianChronology28 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone27);
        org.joda.time.Chronology chronology29 = julianChronology28.withUTC();
        org.joda.time.DateTimeField dateTimeField30 = dateTimeFieldType25.getField((org.joda.time.Chronology) julianChronology28);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.Chronology chronology32 = julianChronology28.withZone(dateTimeZone31);
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime((long) '#', chronology32);
        org.joda.time.LocalTime localTime35 = localTime33.plusSeconds((int) 'a');
        int[] intArray39 = new int[] { 26, '#', 31 };
        int int40 = offsetDateTimeField18.getMinimumValue((org.joda.time.ReadablePartial) localTime35, intArray39);
        org.joda.time.LocalTime.Property property41 = localTime35.minuteOfHour();
        org.joda.time.LocalTime localTime42 = property41.roundCeilingCopy();
        org.joda.time.LocalTime localTime43 = property41.roundFloorCopy();
        int int44 = property41.get();
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(julianChronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(julianChronology28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { 26, 35, 31 });
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property2 = dateTime1.dayOfWeek();
        int int3 = dateTime1.getWeekyear();
        int int4 = dateTime1.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology6 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone5);
        org.joda.time.Days days7 = org.joda.time.Days.THREE;
        int[] intArray10 = gregorianChronology6.get((org.joda.time.ReadablePeriod) days7, (long) 0, (-1L));
        org.joda.time.Duration duration11 = days7.toStandardDuration();
        org.joda.time.DateTime dateTime13 = dateTime1.withDurationAdded((org.joda.time.ReadableDuration) duration11, 26);
        org.joda.time.Duration duration15 = duration11.multipliedBy((long) (short) 1);
        org.joda.time.Duration duration17 = duration11.multipliedBy((long) (-35));
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property23 = dateTime21.property(dateTimeFieldType22);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.chrono.JulianChronology julianChronology25 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone24);
        org.joda.time.Chronology chronology26 = julianChronology25.withUTC();
        org.joda.time.DateTimeField dateTimeField27 = dateTimeFieldType22.getField((org.joda.time.Chronology) julianChronology25);
        org.joda.time.MutableInterval mutableInterval28 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology25);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.chrono.JulianChronology julianChronology30 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone29);
        org.joda.time.Chronology chronology31 = julianChronology30.withUTC();
        mutableInterval28.setChronology((org.joda.time.Chronology) julianChronology30);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property38 = dateTime36.property(dateTimeFieldType37);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.chrono.JulianChronology julianChronology40 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone39);
        org.joda.time.Chronology chronology41 = julianChronology40.withUTC();
        org.joda.time.DateTimeField dateTimeField42 = dateTimeFieldType37.getField((org.joda.time.Chronology) julianChronology40);
        org.joda.time.MutableInterval mutableInterval43 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology40);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.chrono.JulianChronology julianChronology45 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone44);
        org.joda.time.Chronology chronology46 = julianChronology45.withUTC();
        mutableInterval43.setChronology((org.joda.time.Chronology) julianChronology45);
        mutableInterval43.setEndMillis((long) 'a');
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property52 = dateTime51.dayOfWeek();
        int int53 = dateTime51.getWeekyear();
        org.joda.time.ReadableDuration readableDuration54 = null;
        org.joda.time.DateTime dateTime55 = dateTime51.plus(readableDuration54);
        boolean boolean56 = mutableInterval43.contains((org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.Interval interval57 = mutableInterval43.toInterval();
        mutableInterval28.setInterval((org.joda.time.ReadableInterval) interval57);
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology60 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone59);
        org.joda.time.Days days61 = org.joda.time.Days.THREE;
        int[] intArray64 = gregorianChronology60.get((org.joda.time.ReadablePeriod) days61, (long) 0, (-1L));
        org.joda.time.Duration duration65 = days61.toStandardDuration();
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property68 = dateTime67.dayOfWeek();
        int int69 = dateTime67.getWeekyear();
        int int70 = dateTime67.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology72 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone71);
        org.joda.time.Days days73 = org.joda.time.Days.THREE;
        int[] intArray76 = gregorianChronology72.get((org.joda.time.ReadablePeriod) days73, (long) 0, (-1L));
        org.joda.time.Duration duration77 = days73.toStandardDuration();
        org.joda.time.DateTime dateTime79 = dateTime67.withDurationAdded((org.joda.time.ReadableDuration) duration77, 26);
        boolean boolean80 = duration65.isShorterThan((org.joda.time.ReadableDuration) duration77);
        org.joda.time.Interval interval81 = interval57.withDurationAfterStart((org.joda.time.ReadableDuration) duration65);
        int int82 = duration17.compareTo((org.joda.time.ReadableDuration) duration65);
        org.joda.time.MutablePeriod mutablePeriod83 = new org.joda.time.MutablePeriod();
        boolean boolean85 = mutablePeriod83.equals((java.lang.Object) (-1L));
        org.joda.time.DateTimeZone dateTimeZone86 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology87 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone86);
        org.joda.time.DateMidnight dateMidnight88 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology87);
        org.joda.time.DateMidnight.Property property89 = dateMidnight88.weekyear();
        int int90 = dateMidnight88.getDayOfWeek();
        org.joda.time.Chronology chronology91 = dateMidnight88.getChronology();
        org.joda.time.DateTime dateTime93 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property94 = dateTime93.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType95 = property94.getFieldType();
        int int96 = dateMidnight88.get(dateTimeFieldType95);
        org.joda.time.Interval interval97 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) mutablePeriod83, (org.joda.time.ReadableInstant) dateMidnight88);
        org.joda.time.Interval interval98 = duration65.toIntervalTo((org.joda.time.ReadableInstant) dateMidnight88);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1970 + "'", int3 == 1970);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(gregorianChronology6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(julianChronology25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(julianChronology30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(julianChronology40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(julianChronology45);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1970 + "'", int53 == 1970);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(interval57);
        org.junit.Assert.assertNotNull(gregorianChronology60);
        org.junit.Assert.assertNotNull(days61);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertArrayEquals(intArray64, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration65);
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1970 + "'", int69 == 1970);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(gregorianChronology72);
        org.junit.Assert.assertNotNull(days73);
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertArrayEquals(intArray76, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration77);
        org.junit.Assert.assertNotNull(dateTime79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(interval81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(gregorianChronology87);
        org.junit.Assert.assertNotNull(property89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 2 + "'", int90 == 2);
        org.junit.Assert.assertNotNull(chronology91);
        org.junit.Assert.assertNotNull(property94);
        org.junit.Assert.assertNotNull(dateTimeFieldType95);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 2 + "'", int96 == 2);
        org.junit.Assert.assertNotNull(interval98);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.joda.time.Months months0 = org.joda.time.Months.TWO;
        org.joda.time.Months months2 = months0.minus(86400);
        org.junit.Assert.assertNotNull(months0);
        org.junit.Assert.assertNotNull(months2);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property5 = dateTime3.property(dateTimeFieldType4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone6);
        org.joda.time.Chronology chronology8 = julianChronology7.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType4.getField((org.joda.time.Chronology) julianChronology7);
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology7);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.chrono.JulianChronology julianChronology12 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone11);
        org.joda.time.Chronology chronology13 = julianChronology12.withUTC();
        mutableInterval10.setChronology((org.joda.time.Chronology) julianChronology12);
        mutableInterval10.setEndMillis((long) 'a');
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property19 = dateTime18.dayOfWeek();
        int int20 = dateTime18.getWeekyear();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime22 = dateTime18.plus(readableDuration21);
        boolean boolean23 = mutableInterval10.contains((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.MutableInterval mutableInterval24 = mutableInterval10.copy();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology26 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone25);
        org.joda.time.Days days27 = org.joda.time.Days.THREE;
        int[] intArray30 = gregorianChronology26.get((org.joda.time.ReadablePeriod) days27, (long) 0, (-1L));
        java.lang.String str31 = gregorianChronology26.toString();
        mutableInterval10.setChronology((org.joda.time.Chronology) gregorianChronology26);
        org.joda.time.DateTimeField dateTimeField33 = gregorianChronology26.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long36 = dateTimeField33.setExtended(1512000000L, 32);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for clockhourOfHalfday must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(julianChronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(julianChronology12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1970 + "'", int20 == 1970);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(mutableInterval24);
        org.junit.Assert.assertNotNull(gregorianChronology26);
        org.junit.Assert.assertNotNull(days27);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 0 });
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "GregorianChronology[UTC]" + "'", str31, "GregorianChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField33);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-20274), 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: -20274");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes2 = minutes0.multipliedBy((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType4 = minutes0.getFieldType(86400000);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 86400000");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(minutes2);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property2 = dateTime1.dayOfWeek();
        int int3 = dateTime1.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone4);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology5);
        org.joda.time.DateMidnight.Property property7 = dateMidnight6.dayOfYear();
        org.joda.time.Period period8 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime1, (org.joda.time.ReadableInstant) dateMidnight6);
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod();
        boolean boolean11 = mutablePeriod9.equals((java.lang.Object) (-1L));
        mutablePeriod9.addMillis(1970);
        org.joda.time.Period period14 = period8.withFields((org.joda.time.ReadablePeriod) mutablePeriod9);
        int int15 = period14.getWeeks();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property3 = dateTime1.property(dateTimeFieldType2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.JulianChronology julianChronology5 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone4);
        org.joda.time.Chronology chronology6 = julianChronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType2.getField((org.joda.time.Chronology) julianChronology5);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeField7.getAsShortText((int) (byte) 0, locale9);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property14 = dateTime12.property(dateTimeFieldType13);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField18 = new org.joda.time.field.OffsetDateTimeField(dateTimeField7, dateTimeFieldType13, (int) (byte) -1, (int) (byte) -1, (-35));
        org.joda.time.DurationField durationField19 = offsetDateTimeField18.getLeapDurationField();
        int int21 = offsetDateTimeField18.get((long) 330958);
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.plusMinutes((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.minusWeeks(1970);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.plusMinutes((int) (byte) 100);
        org.joda.time.Hours hours32 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadablePartial) localDateTime27, (org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property37 = dateTime35.property(dateTimeFieldType36);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.chrono.JulianChronology julianChronology39 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone38);
        org.joda.time.Chronology chronology40 = julianChronology39.withUTC();
        org.joda.time.DateTimeField dateTimeField41 = dateTimeFieldType36.getField((org.joda.time.Chronology) julianChronology39);
        java.util.Locale locale43 = null;
        java.lang.String str44 = dateTimeField41.getAsShortText((int) (byte) 0, locale43);
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property48 = dateTime46.property(dateTimeFieldType47);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField52 = new org.joda.time.field.OffsetDateTimeField(dateTimeField41, dateTimeFieldType47, (int) (byte) -1, (int) (byte) -1, (-35));
        int int54 = offsetDateTimeField52.getLeapAmount((long) (short) 0);
        org.joda.time.DateTimeField dateTimeField55 = org.joda.time.field.StrictDateTimeField.getInstance((org.joda.time.DateTimeField) offsetDateTimeField52);
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType59 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property60 = dateTime58.property(dateTimeFieldType59);
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.chrono.JulianChronology julianChronology62 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone61);
        org.joda.time.Chronology chronology63 = julianChronology62.withUTC();
        org.joda.time.DateTimeField dateTimeField64 = dateTimeFieldType59.getField((org.joda.time.Chronology) julianChronology62);
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.Chronology chronology66 = julianChronology62.withZone(dateTimeZone65);
        org.joda.time.LocalTime localTime67 = new org.joda.time.LocalTime((long) '#', chronology66);
        org.joda.time.LocalTime localTime69 = localTime67.plusSeconds((int) 'a');
        int[] intArray73 = new int[] { 26, '#', 31 };
        int int74 = offsetDateTimeField52.getMinimumValue((org.joda.time.ReadablePartial) localTime69, intArray73);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray76 = offsetDateTimeField18.set((org.joda.time.ReadablePartial) localDateTime29, (int) (byte) 100, intArray73, 4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 4 for hourOfHalfday must be in the range [-1,-35]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(julianChronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNull(durationField19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(hours32);
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(julianChronology39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "0" + "'", str44, "0");
        org.junit.Assert.assertNotNull(dateTimeFieldType47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertNotNull(dateTimeFieldType59);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(julianChronology62);
        org.junit.Assert.assertNotNull(chronology63);
        org.junit.Assert.assertNotNull(dateTimeField64);
        org.junit.Assert.assertNotNull(chronology66);
        org.junit.Assert.assertNotNull(localTime69);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertArrayEquals(intArray73, new int[] { 26, 35, 31 });
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property3 = dateTime1.property(dateTimeFieldType2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.JulianChronology julianChronology5 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone4);
        org.joda.time.Chronology chronology6 = julianChronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType2.getField((org.joda.time.Chronology) julianChronology5);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeField7.getAsShortText((int) (byte) 0, locale9);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property14 = dateTime12.property(dateTimeFieldType13);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField18 = new org.joda.time.field.OffsetDateTimeField(dateTimeField7, dateTimeFieldType13, (int) (byte) -1, (int) (byte) -1, (-35));
        int int20 = offsetDateTimeField18.getLeapAmount((long) (short) 0);
        int int21 = offsetDateTimeField18.getMaximumValue();
        long long23 = offsetDateTimeField18.roundHalfEven((long) 60);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology25 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone24);
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology25);
        org.joda.time.Weeks weeks27 = org.joda.time.Weeks.ONE;
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.plus((org.joda.time.ReadablePeriod) weeks27);
        java.util.Date date29 = dateMidnight26.toDate();
        org.joda.time.YearMonthDay yearMonthDay30 = org.joda.time.YearMonthDay.fromDateFields(date29);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateMidnight dateMidnight32 = yearMonthDay30.toDateMidnight(dateTimeZone31);
        org.joda.time.YearMonthDay yearMonthDay34 = yearMonthDay30.plusMonths(8);
        org.joda.time.YearMonthDay.Property property35 = yearMonthDay30.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay36 = property35.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology38 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone37);
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology38);
        org.joda.time.Weeks weeks40 = org.joda.time.Weeks.ONE;
        org.joda.time.DateMidnight dateMidnight41 = dateMidnight39.plus((org.joda.time.ReadablePeriod) weeks40);
        java.util.Date date42 = dateMidnight39.toDate();
        org.joda.time.YearMonthDay yearMonthDay43 = org.joda.time.YearMonthDay.fromDateFields(date42);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateMidnight dateMidnight45 = yearMonthDay43.toDateMidnight(dateTimeZone44);
        org.joda.time.YearMonthDay yearMonthDay47 = yearMonthDay43.plusMonths(8);
        org.joda.time.YearMonthDay.Property property48 = yearMonthDay43.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay49 = property48.withMinimumValue();
        org.joda.time.YearMonthDay yearMonthDay50 = property48.withMinimumValue();
        org.joda.time.format.PeriodFormatter periodFormatter51 = org.joda.time.format.PeriodFormat.wordBased();
        java.util.Locale locale52 = periodFormatter51.getLocale();
        java.lang.String str53 = property48.getAsText(locale52);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str54 = offsetDateTimeField18.getAsText((org.joda.time.ReadablePartial) yearMonthDay36, locale52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'hourOfHalfday' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(julianChronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-35) + "'", int21 == (-35));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(gregorianChronology25);
        org.junit.Assert.assertNotNull(weeks27);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Mon Mar 31 20:00:00 EDT 2025");
        org.junit.Assert.assertNotNull(yearMonthDay30);
        org.junit.Assert.assertNotNull(dateMidnight32);
        org.junit.Assert.assertNotNull(yearMonthDay34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(yearMonthDay36);
        org.junit.Assert.assertNotNull(gregorianChronology38);
        org.junit.Assert.assertNotNull(weeks40);
        org.junit.Assert.assertNotNull(dateMidnight41);
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Mon Mar 31 20:00:00 EDT 2025");
        org.junit.Assert.assertNotNull(yearMonthDay43);
        org.junit.Assert.assertNotNull(dateMidnight45);
        org.junit.Assert.assertNotNull(yearMonthDay47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(yearMonthDay49);
        org.junit.Assert.assertNotNull(yearMonthDay50);
        org.junit.Assert.assertNotNull(periodFormatter51);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "March" + "'", str53, "March");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.Chronology chronology3 = julianChronology2.withUTC();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, (org.joda.time.Chronology) julianChronology2, locale4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology7 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone6);
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology10 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone9);
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology10);
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology10.weekyearOfCentury();
        int int13 = dateMidnight8.get(dateTimeField12);
        org.joda.time.field.SkipDateTimeField skipDateTimeField14 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) julianChronology2, dateTimeField12);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property21 = dateTime19.property(dateTimeFieldType20);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.chrono.JulianChronology julianChronology23 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone22);
        org.joda.time.Chronology chronology24 = julianChronology23.withUTC();
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType20.getField((org.joda.time.Chronology) julianChronology23);
        org.joda.time.MutableInterval mutableInterval26 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology23);
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) (short) -1, (org.joda.time.Chronology) julianChronology23);
        java.util.Locale locale29 = null;
        java.lang.String str30 = skipDateTimeField14.getAsText((org.joda.time.ReadablePartial) localDateTime27, 0, locale29);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology34 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone33);
        org.joda.time.DateMidnight dateMidnight35 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology34);
        org.joda.time.Weeks weeks36 = org.joda.time.Weeks.ONE;
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight35.plus((org.joda.time.ReadablePeriod) weeks36);
        java.util.Date date38 = dateMidnight35.toDate();
        org.joda.time.YearMonthDay yearMonthDay39 = org.joda.time.YearMonthDay.fromDateFields(date38);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateMidnight dateMidnight41 = yearMonthDay39.toDateMidnight(dateTimeZone40);
        org.joda.time.YearMonthDay yearMonthDay43 = yearMonthDay39.plusMonths(8);
        org.joda.time.YearMonthDay.Property property44 = yearMonthDay39.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay45 = property44.withMinimumValue();
        org.joda.time.YearMonthDay yearMonthDay46 = property44.withMinimumValue();
        org.joda.time.format.PeriodFormatter periodFormatter47 = org.joda.time.format.PeriodFormat.wordBased();
        java.util.Locale locale48 = periodFormatter47.getLocale();
        java.lang.String str49 = property44.getAsText(locale48);
        // The following exception was thrown during execution in test generation
        try {
            long long50 = skipDateTimeField14.set(2024L, "days", locale48);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"days\" for weekyearOfCentury is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(gregorianChronology7);
        org.junit.Assert.assertNotNull(gregorianChronology10);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 26 + "'", int13 == 26);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(julianChronology23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "0" + "'", str30, "0");
        org.junit.Assert.assertNotNull(gregorianChronology34);
        org.junit.Assert.assertNotNull(weeks36);
        org.junit.Assert.assertNotNull(dateMidnight37);
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Mon Mar 31 20:00:00 EDT 2025");
        org.junit.Assert.assertNotNull(yearMonthDay39);
        org.junit.Assert.assertNotNull(dateMidnight41);
        org.junit.Assert.assertNotNull(yearMonthDay43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(yearMonthDay45);
        org.junit.Assert.assertNotNull(yearMonthDay46);
        org.junit.Assert.assertNotNull(periodFormatter47);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "March" + "'", str49, "March");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property2 = dateTime1.dayOfWeek();
        int int3 = dateTime1.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone4);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology5);
        org.joda.time.DateMidnight.Property property7 = dateMidnight6.dayOfYear();
        org.joda.time.Period period8 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime1, (org.joda.time.ReadableInstant) dateMidnight6);
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod();
        boolean boolean11 = mutablePeriod9.equals((java.lang.Object) (-1L));
        mutablePeriod9.addMillis(1970);
        org.joda.time.Period period14 = period8.withFields((org.joda.time.ReadablePeriod) mutablePeriod9);
        java.lang.Object obj15 = mutablePeriod9.clone();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "PT1.970S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "PT1.970S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "PT1.970S");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.addMonths((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime0.setWeekOfWeekyear(1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime0);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.joda.time.Months months0 = org.joda.time.Months.SEVEN;
        org.junit.Assert.assertNotNull(months0);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property3 = dateTime1.property(dateTimeFieldType2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.JulianChronology julianChronology5 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone4);
        org.joda.time.Chronology chronology6 = julianChronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType2.getField((org.joda.time.Chronology) julianChronology5);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeField7.getAsShortText((int) (byte) 0, locale9);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property14 = dateTime12.property(dateTimeFieldType13);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField18 = new org.joda.time.field.OffsetDateTimeField(dateTimeField7, dateTimeFieldType13, (int) (byte) -1, (int) (byte) -1, (-35));
        int int20 = offsetDateTimeField18.getLeapAmount((long) (short) 0);
        long long22 = offsetDateTimeField18.roundFloor((long) (short) -1);
        int int25 = offsetDateTimeField18.getDifference((long) 8, (long) 70067048);
        long long27 = offsetDateTimeField18.roundFloor((long) '#');
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) (-1));
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property34 = dateTime32.property(dateTimeFieldType33);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.chrono.JulianChronology julianChronology36 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone35);
        org.joda.time.Chronology chronology37 = julianChronology36.withUTC();
        org.joda.time.DateTimeField dateTimeField38 = dateTimeFieldType33.getField((org.joda.time.Chronology) julianChronology36);
        org.joda.time.DurationField durationField39 = julianChronology36.halfdays();
        org.joda.time.Period period42 = new org.joda.time.Period((long) 31, (long) 25);
        int[] intArray44 = julianChronology36.get((org.joda.time.ReadablePeriod) period42, (-1924473598031L));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray46 = offsetDateTimeField18.addWrapPartial((org.joda.time.ReadablePartial) localDateTime29, 13, intArray44, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(julianChronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-3600000L) + "'", long22 == (-3600000L));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-19) + "'", int25 == (-19));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(julianChronology36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { 0, 0, (-3181), (-6), (-23), (-59), (-58), (-31) });
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.Days days2 = org.joda.time.Days.THREE;
        int[] intArray5 = gregorianChronology1.get((org.joda.time.ReadablePeriod) days2, (long) 0, (-1L));
        org.joda.time.DurationField durationField6 = gregorianChronology1.halfdays();
        org.joda.time.DurationField durationField7 = gregorianChronology1.weeks();
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0 });
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone1);
        org.joda.time.Days days3 = org.joda.time.Days.THREE;
        int[] intArray6 = gregorianChronology2.get((org.joda.time.ReadablePeriod) days3, (long) 0, (-1L));
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) 1969, (org.joda.time.Chronology) gregorianChronology2);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = gregorianChronology2.getDateTimeMillis(2025, (int) ' ', 84, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0 });
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.Chronology chronology3 = julianChronology2.withUTC();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, (org.joda.time.Chronology) julianChronology2, locale4);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfWeek();
        int int9 = dateTime7.getWeekyear();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime7.plus(readableDuration10);
        org.joda.time.DateTime.Property property12 = dateTime11.era();
        boolean boolean13 = dateTimeParserBucket5.restoreState((java.lang.Object) property12);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeParserBucket5.getZone();
        org.joda.time.DateTimeZone dateTimeZone15 = dateTimeParserBucket5.getZone();
        java.lang.String str16 = dateTimeZone15.getID();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone15);
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType18 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_15_BASED;
        org.joda.time.chrono.IslamicChronology islamicChronology19 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone15, leapYearPatternType18);
        // The following exception was thrown during execution in test generation
        try {
            long long24 = islamicChronology19.getDateTimeMillis((-1), (int) (short) 0, (int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for year must be in the range [0,292271023]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertNotNull(leapYearPatternType18);
        org.junit.Assert.assertNotNull(islamicChronology19);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.dayOfYear();
        org.joda.time.DateMidnight dateMidnight4 = property3.roundHalfEvenCopy();
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.withYearOfCentury(100);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MonthDay monthDay8 = new org.joda.time.MonthDay((java.lang.Object) dateMidnight4, chronology7);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray9 = monthDay8.getFieldTypes();
        int[] intArray13 = new int[] { '#', 80, 25 };
        org.joda.time.Days days17 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType18 = days17.getFieldType();
        org.joda.time.PeriodType periodType19 = days17.getPeriodType();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property25 = dateTime23.property(dateTimeFieldType24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.chrono.JulianChronology julianChronology27 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone26);
        org.joda.time.Chronology chronology28 = julianChronology27.withUTC();
        org.joda.time.DateTimeField dateTimeField29 = dateTimeFieldType24.getField((org.joda.time.Chronology) julianChronology27);
        org.joda.time.MutableInterval mutableInterval30 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology27);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.chrono.JulianChronology julianChronology32 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone31);
        org.joda.time.Chronology chronology33 = julianChronology32.withUTC();
        mutableInterval30.setChronology((org.joda.time.Chronology) julianChronology32);
        org.joda.time.Period period35 = new org.joda.time.Period((long) (byte) 0, periodType19, (org.joda.time.Chronology) julianChronology32);
        org.joda.time.PeriodType periodType36 = periodType19.withDaysRemoved();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology38 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone37);
        org.joda.time.Days days39 = org.joda.time.Days.THREE;
        int[] intArray42 = gregorianChronology38.get((org.joda.time.ReadablePeriod) days39, (long) 0, (-1L));
        org.joda.time.DateTimeField dateTimeField43 = gregorianChronology38.dayOfMonth();
        org.joda.time.DurationField durationField44 = gregorianChronology38.weeks();
        org.joda.time.DateTime dateTime45 = org.joda.time.DateTime.now((org.joda.time.Chronology) gregorianChronology38);
        org.joda.time.DateTimeField dateTimeField46 = gregorianChronology38.yearOfCentury();
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod(0L, (long) 1, periodType36, (org.joda.time.Chronology) gregorianChronology38);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial48 = new org.joda.time.Partial(dateTimeFieldTypeArray9, intArray13, (org.joda.time.Chronology) gregorianChronology38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Values array must be the same length as the types array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray9);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 35, 80, 25 });
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(julianChronology27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(julianChronology32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(gregorianChronology38);
        org.junit.Assert.assertNotNull(days39);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { 0 });
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(durationField44);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTimeField46);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.joda.time.Months months0 = org.joda.time.Months.FIVE;
        org.junit.Assert.assertNotNull(months0);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property3 = dateTime1.property(dateTimeFieldType2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.JulianChronology julianChronology5 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone4);
        org.joda.time.Chronology chronology6 = julianChronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType2.getField((org.joda.time.Chronology) julianChronology5);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeField7.getAsShortText((int) (byte) 0, locale9);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property14 = dateTime12.property(dateTimeFieldType13);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField18 = new org.joda.time.field.OffsetDateTimeField(dateTimeField7, dateTimeFieldType13, (int) (byte) -1, (int) (byte) -1, (-35));
        int int20 = offsetDateTimeField18.getLeapAmount((long) (short) 0);
        int int21 = offsetDateTimeField18.getMaximumValue();
        long long24 = offsetDateTimeField18.getDifferenceAsLong((long) 13, (long) 10);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime((long) 100, dateTimeZone26);
        org.joda.time.Days days28 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType29 = days28.getFieldType();
        boolean boolean30 = localTime27.isSupported(durationFieldType29);
        java.util.Locale locale32 = null;
        java.lang.String str33 = offsetDateTimeField18.getAsShortText((org.joda.time.ReadablePartial) localTime27, 31, locale32);
        // The following exception was thrown during execution in test generation
        try {
            long long36 = offsetDateTimeField18.add((long) 86400, (-1L));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10 for hourOfHalfday must be in the range [-1,-35]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(julianChronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-35) + "'", int21 == (-35));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(days28);
        org.junit.Assert.assertNotNull(durationFieldType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "31" + "'", str33, "31");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.ONE;
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.plus((org.joda.time.ReadablePeriod) weeks3);
        java.util.Date date5 = dateMidnight2.toDate();
        org.joda.time.YearMonthDay yearMonthDay6 = org.joda.time.YearMonthDay.fromDateFields(date5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = yearMonthDay6.toDateMidnight(dateTimeZone7);
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay6.plusMonths(8);
        org.joda.time.YearMonthDay.Property property11 = yearMonthDay6.monthOfYear();
        org.joda.time.Period period13 = org.joda.time.Period.days(7);
        org.joda.time.Period period15 = period13.plusMonths(60);
        org.joda.time.YearMonthDay yearMonthDay17 = yearMonthDay6.withPeriodAdded((org.joda.time.ReadablePeriod) period13, (int) (short) 1);
        int int18 = yearMonthDay6.getMonthOfYear();
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Mon Mar 31 20:00:00 EDT 2025");
        org.junit.Assert.assertNotNull(yearMonthDay6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(yearMonthDay17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.joda.time.Hours hours0 = org.joda.time.Hours.THREE;
        org.junit.Assert.assertNotNull(hours0);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfMonth((int) (byte) 1);
        org.joda.time.TimeOfDay timeOfDay4 = dateTime3.toTimeOfDay();
        int int5 = timeOfDay4.getMinuteOfHour();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property3 = dateTime1.property(dateTimeFieldType2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.JulianChronology julianChronology5 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone4);
        org.joda.time.Chronology chronology6 = julianChronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType2.getField((org.joda.time.Chronology) julianChronology5);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeField7.getAsShortText((int) (byte) 0, locale9);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property14 = dateTime12.property(dateTimeFieldType13);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField18 = new org.joda.time.field.OffsetDateTimeField(dateTimeField7, dateTimeFieldType13, (int) (byte) -1, (int) (byte) -1, (-35));
        int int20 = offsetDateTimeField18.getLeapAmount((long) (short) 0);
        org.joda.time.DateTimeField dateTimeField21 = org.joda.time.field.StrictDateTimeField.getInstance((org.joda.time.DateTimeField) offsetDateTimeField18);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property26 = dateTime24.property(dateTimeFieldType25);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.chrono.JulianChronology julianChronology28 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone27);
        org.joda.time.Chronology chronology29 = julianChronology28.withUTC();
        org.joda.time.DateTimeField dateTimeField30 = dateTimeFieldType25.getField((org.joda.time.Chronology) julianChronology28);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.Chronology chronology32 = julianChronology28.withZone(dateTimeZone31);
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime((long) '#', chronology32);
        org.joda.time.LocalTime localTime35 = localTime33.plusSeconds((int) 'a');
        int[] intArray39 = new int[] { 26, '#', 31 };
        int int40 = offsetDateTimeField18.getMinimumValue((org.joda.time.ReadablePartial) localTime35, intArray39);
        org.joda.time.LocalTime.Property property41 = localTime35.minuteOfHour();
        org.joda.time.LocalTime localTime42 = property41.getLocalTime();
        org.joda.time.Days days44 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType45 = days44.getFieldType();
        org.joda.time.PeriodType periodType46 = days44.getPeriodType();
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property52 = dateTime50.property(dateTimeFieldType51);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.chrono.JulianChronology julianChronology54 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone53);
        org.joda.time.Chronology chronology55 = julianChronology54.withUTC();
        org.joda.time.DateTimeField dateTimeField56 = dateTimeFieldType51.getField((org.joda.time.Chronology) julianChronology54);
        org.joda.time.MutableInterval mutableInterval57 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology54);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.chrono.JulianChronology julianChronology59 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone58);
        org.joda.time.Chronology chronology60 = julianChronology59.withUTC();
        mutableInterval57.setChronology((org.joda.time.Chronology) julianChronology59);
        org.joda.time.Period period62 = new org.joda.time.Period((long) (byte) 0, periodType46, (org.joda.time.Chronology) julianChronology59);
        org.joda.time.PeriodType periodType63 = periodType46.withDaysRemoved();
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType66 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property67 = dateTime65.property(dateTimeFieldType66);
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.chrono.JulianChronology julianChronology69 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone68);
        org.joda.time.Chronology chronology70 = julianChronology69.withUTC();
        org.joda.time.DateTimeField dateTimeField71 = dateTimeFieldType66.getField((org.joda.time.Chronology) julianChronology69);
        org.joda.time.DateTimeZone dateTimeZone72 = null;
        org.joda.time.Chronology chronology73 = julianChronology69.withZone(dateTimeZone72);
        org.joda.time.chrono.StrictChronology strictChronology74 = org.joda.time.chrono.StrictChronology.getInstance(chronology73);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod((java.lang.Object) property41, periodType46, (org.joda.time.Chronology) strictChronology74);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.LocalTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(julianChronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(julianChronology28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { 26, 35, 31 });
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(days44);
        org.junit.Assert.assertNotNull(durationFieldType45);
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertNotNull(dateTimeFieldType51);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(julianChronology54);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(julianChronology59);
        org.junit.Assert.assertNotNull(chronology60);
        org.junit.Assert.assertNotNull(periodType63);
        org.junit.Assert.assertNotNull(dateTimeFieldType66);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertNotNull(julianChronology69);
        org.junit.Assert.assertNotNull(chronology70);
        org.junit.Assert.assertNotNull(dateTimeField71);
        org.junit.Assert.assertNotNull(chronology73);
        org.junit.Assert.assertNotNull(strictChronology74);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod();
        boolean boolean2 = mutablePeriod0.equals((java.lang.Object) (-1L));
        int int3 = mutablePeriod0.getSeconds();
        mutablePeriod0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.weekDateTimeNoMillis();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = dateTimeFormatter0.parseLocalDateTime("1970-01-01T00:00:00.001Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"1970-01-01T00:00:00.001Z\" is malformed at \"-01-01T00:00:00.001Z\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate7 = localDate5.withYearOfEra(10);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.chrono.JulianChronology julianChronology10 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone9);
        org.joda.time.Chronology chronology11 = julianChronology10.withUTC();
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, (org.joda.time.Chronology) julianChronology10, locale12);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property16 = dateTime15.dayOfWeek();
        int int17 = dateTime15.getWeekyear();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.DateTime dateTime19 = dateTime15.plus(readableDuration18);
        org.joda.time.DateTime.Property property20 = dateTime19.era();
        boolean boolean21 = dateTimeParserBucket13.restoreState((java.lang.Object) property20);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeParserBucket13.getZone();
        org.joda.time.DateTime dateTime23 = localDate5.toDateTimeAtCurrentTime(dateTimeZone22);
        org.joda.time.DateTime dateTime24 = org.joda.time.DateTime.now(dateTimeZone22);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone25 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(32, 0, 25, 1440, 0, dateTimeZone22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1440 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(julianChronology10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1970 + "'", int17 == 1970);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(cachedDateTimeZone25);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.weekyear();
        org.joda.time.Interval interval4 = dateMidnight2.toInterval();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property7 = dateTime6.dayOfWeek();
        int int8 = dateTime6.getWeekyear();
        int int9 = dateTime6.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology11 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone10);
        org.joda.time.Days days12 = org.joda.time.Days.THREE;
        int[] intArray15 = gregorianChronology11.get((org.joda.time.ReadablePeriod) days12, (long) 0, (-1L));
        org.joda.time.Duration duration16 = days12.toStandardDuration();
        org.joda.time.DateTime dateTime18 = dateTime6.withDurationAdded((org.joda.time.ReadableDuration) duration16, 26);
        org.joda.time.Duration duration20 = duration16.multipliedBy((long) (short) 1);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight2.minus((org.joda.time.ReadableDuration) duration16);
        long long22 = duration16.getMillis();
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1970 + "'", int8 == 1970);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(gregorianChronology11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(dateMidnight21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 259200000L + "'", long22 == 259200000L);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.printZeroNever();
        java.lang.String[] strArray8 = new java.lang.String[] { "91", "millisOfDay", "Coordinated Universal Time", "10:59:59 o'clock PM ", "0", "1969-12-19T00:00:00.007Z/1969-12-19T00:00:00.097Z" };
        java.lang.String[] strArray15 = new java.lang.String[] { "2025-04-01", "UTC", "71", "millisOfDay", "26", "T23:59:28.001" };
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder16 = periodFormatterBuilder1.appendSuffix(strArray8, strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No field to apply suffix to");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "91", "millisOfDay", "Coordinated Universal Time", "10:59:59 o'clock PM ", "0", "1969-12-19T00:00:00.007Z/1969-12-19T00:00:00.097Z" });
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "2025-04-01", "UTC", "71", "millisOfDay", "26", "T23:59:28.001" });
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.Chronology chronology3 = julianChronology2.withUTC();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, (org.joda.time.Chronology) julianChronology2, locale4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology7 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone6);
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology10 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone9);
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology10);
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology10.weekyearOfCentury();
        int int13 = dateMidnight8.get(dateTimeField12);
        org.joda.time.field.SkipDateTimeField skipDateTimeField14 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) julianChronology2, dateTimeField12);
        int int16 = skipDateTimeField14.getMaximumValue(101L);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property20 = dateTime19.dayOfWeek();
        int int21 = dateTime19.getWeekyear();
        int int22 = dateTime19.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology24 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone23);
        org.joda.time.Days days25 = org.joda.time.Days.THREE;
        int[] intArray28 = gregorianChronology24.get((org.joda.time.ReadablePeriod) days25, (long) 0, (-1L));
        org.joda.time.Duration duration29 = days25.toStandardDuration();
        org.joda.time.DateTime dateTime31 = dateTime19.withDurationAdded((org.joda.time.ReadableDuration) duration29, 26);
        org.joda.time.Duration duration33 = duration29.multipliedBy((long) (short) 1);
        org.joda.time.Duration duration34 = duration33.toDuration();
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property37 = dateTime36.dayOfWeek();
        org.joda.time.format.PeriodFormatter periodFormatter38 = org.joda.time.format.ISOPeriodFormat.alternateExtended();
        org.joda.time.PeriodType periodType39 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.format.PeriodFormatter periodFormatter40 = periodFormatter38.withParseType(periodType39);
        org.joda.time.Period period41 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration33, (org.joda.time.ReadableInstant) dateTime36, periodType39);
        java.lang.String str42 = dateTime36.toString();
        org.joda.time.format.PeriodFormatter periodFormatter44 = org.joda.time.format.PeriodFormat.wordBased();
        java.util.Locale locale45 = periodFormatter44.getLocale();
        java.lang.String str46 = dateTime36.toString("00:01:37.035", locale45);
        java.lang.String str47 = skipDateTimeField14.getAsText(60, locale45);
        java.lang.String str49 = skipDateTimeField14.getAsShortText((long) (-19));
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(gregorianChronology7);
        org.junit.Assert.assertNotNull(gregorianChronology10);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 26 + "'", int13 == 26);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1970 + "'", int21 == 1970);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(gregorianChronology24);
        org.junit.Assert.assertNotNull(days25);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(periodFormatter38);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(periodFormatter40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "1970-01-01T00:00:00.001Z" + "'", str42, "1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(periodFormatter44);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "00:01:37.035" + "'", str46, "00:01:37.035");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "60" + "'", str47, "60");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "71" + "'", str49, "71");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.minutes(9);
        org.junit.Assert.assertNotNull(minutes1);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.Chronology chronology3 = julianChronology2.withUTC();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, (org.joda.time.Chronology) julianChronology2, locale4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology7 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone6);
        org.joda.time.Days days8 = org.joda.time.Days.THREE;
        int[] intArray11 = gregorianChronology7.get((org.joda.time.ReadablePeriod) days8, (long) 0, (-1L));
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology7.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField13 = gregorianChronology7.hourOfDay();
        dateTimeParserBucket5.saveField(dateTimeField13, (int) (short) -1);
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(gregorianChronology7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 0 });
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.weekyear();
        java.lang.String str4 = dateMidnight2.toString();
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2025-04-01T00:00:00.000Z" + "'", str4, "2025-04-01T00:00:00.000Z");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfMonth((int) (byte) 1);
        org.joda.time.Instant instant4 = dateTime3.toInstant();
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardDays((long) 8);
        org.joda.time.Instant instant7 = instant4.minus((org.joda.time.ReadableDuration) duration6);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property10 = dateTime9.dayOfWeek();
        int int11 = dateTime9.getWeekyear();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTime dateTime13 = dateTime9.plus(readableDuration12);
        org.joda.time.DateTime.Property property14 = dateTime13.era();
        boolean boolean16 = dateTime13.isBefore(26L);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property19 = dateTime18.dayOfWeek();
        int int20 = dateTime18.getWeekyear();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime22 = dateTime18.plus(readableDuration21);
        org.joda.time.DateTime.Property property23 = dateTime22.era();
        boolean boolean25 = dateTime22.isBefore(26L);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Chronology chronology27 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime22, readableInstant26);
        boolean boolean28 = dateTime13.isBefore(readableInstant26);
        org.joda.time.Duration duration29 = new org.joda.time.Duration((java.lang.Object) readableInstant26);
        boolean boolean30 = duration6.isLongerThan((org.joda.time.ReadableDuration) duration29);
        org.joda.time.MutableDateTime mutableDateTime31 = org.joda.time.MutableDateTime.now();
        mutableDateTime31.addMonths((int) (short) 100);
        org.joda.time.MutableInterval mutableInterval34 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration6, (org.joda.time.ReadableInstant) mutableDateTime31);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1970 + "'", int11 == 1970);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1970 + "'", int20 == 1970);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(mutableDateTime31);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfMonth((int) (byte) 1);
        org.joda.time.TimeOfDay timeOfDay4 = dateTime3.toTimeOfDay();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property7 = dateTime6.dayOfWeek();
        int int8 = dateTime6.getWeekyear();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime6.plus(readableDuration9);
        org.joda.time.DateTime.Property property11 = dateTime10.era();
        boolean boolean13 = dateTime10.isBefore(26L);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Chronology chronology15 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime10, readableInstant14);
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay4.withChronologyRetainFields(chronology15);
        org.joda.time.TimeOfDay.Property property17 = timeOfDay16.millisOfSecond();
        java.util.Locale locale18 = null;
        int int19 = property17.getMaximumTextLength(locale18);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime dateTime23 = dateTime21.withDayOfMonth((int) (byte) 1);
        org.joda.time.Instant instant24 = dateTime23.toInstant();
        int int25 = property17.compareTo((org.joda.time.ReadableInstant) instant24);
        java.lang.String str26 = property17.getAsShortText();
        org.joda.time.DateTimeField dateTimeField27 = property17.getField();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1970 + "'", int8 == 1970);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1" + "'", str26, "1");
        org.junit.Assert.assertNotNull(dateTimeField27);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfMonth((int) (byte) 1);
        org.joda.time.Instant instant4 = dateTime3.toInstant();
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardDays((long) 8);
        org.joda.time.Instant instant7 = instant4.minus((org.joda.time.ReadableDuration) duration6);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property10 = dateTime9.dayOfWeek();
        int int11 = dateTime9.getWeekyear();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTime dateTime13 = dateTime9.plus(readableDuration12);
        org.joda.time.DateTime.Property property14 = dateTime13.era();
        boolean boolean16 = dateTime13.isBefore(26L);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property19 = dateTime18.dayOfWeek();
        int int20 = dateTime18.getWeekyear();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime22 = dateTime18.plus(readableDuration21);
        org.joda.time.DateTime.Property property23 = dateTime22.era();
        boolean boolean25 = dateTime22.isBefore(26L);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Chronology chronology27 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime22, readableInstant26);
        boolean boolean28 = dateTime13.isBefore(readableInstant26);
        org.joda.time.Duration duration29 = new org.joda.time.Duration((java.lang.Object) readableInstant26);
        boolean boolean30 = duration6.isLongerThan((org.joda.time.ReadableDuration) duration29);
        org.joda.time.Duration duration31 = duration6.toDuration();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1970 + "'", int11 == 1970);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1970 + "'", int20 == 1970);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(duration31);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.Chronology chronology3 = julianChronology2.withUTC();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, (org.joda.time.Chronology) julianChronology2, locale4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology7 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone6);
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology10 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone9);
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology10);
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology10.weekyearOfCentury();
        int int13 = dateMidnight8.get(dateTimeField12);
        org.joda.time.field.SkipDateTimeField skipDateTimeField14 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) julianChronology2, dateTimeField12);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property21 = dateTime19.property(dateTimeFieldType20);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.chrono.JulianChronology julianChronology23 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone22);
        org.joda.time.Chronology chronology24 = julianChronology23.withUTC();
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType20.getField((org.joda.time.Chronology) julianChronology23);
        org.joda.time.MutableInterval mutableInterval26 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology23);
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) (short) -1, (org.joda.time.Chronology) julianChronology23);
        java.util.Locale locale29 = null;
        java.lang.String str30 = skipDateTimeField14.getAsText((org.joda.time.ReadablePartial) localDateTime27, 0, locale29);
        org.joda.time.DurationField durationField31 = skipDateTimeField14.getRangeDurationField();
        java.util.Locale locale33 = null;
        java.lang.String str34 = skipDateTimeField14.getAsShortText(1743465600001L, locale33);
        // The following exception was thrown during execution in test generation
        try {
            long long37 = skipDateTimeField14.add((long) (byte) 10, 410659200097L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 410659200097");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(gregorianChronology7);
        org.junit.Assert.assertNotNull(gregorianChronology10);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 26 + "'", int13 == 26);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(julianChronology23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "0" + "'", str30, "0");
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "26" + "'", str34, "26");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((org.joda.time.Chronology) gregorianChronology3);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.chrono.JulianChronology julianChronology8 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone7);
        org.joda.time.Chronology chronology9 = julianChronology8.withUTC();
        java.util.Locale locale10 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, (org.joda.time.Chronology) julianChronology8, locale10);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfWeek();
        int int15 = dateTime13.getWeekyear();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.DateTime dateTime17 = dateTime13.plus(readableDuration16);
        org.joda.time.DateTime.Property property18 = dateTime17.era();
        boolean boolean19 = dateTimeParserBucket11.restoreState((java.lang.Object) property18);
        org.joda.time.DateTimeZone dateTimeZone20 = dateTimeParserBucket11.getZone();
        long long24 = dateTimeZone20.convertLocalToUTC(26L, true, 1L);
        org.joda.time.Chronology chronology25 = gregorianChronology3.withZone(dateTimeZone20);
        org.joda.time.Period period26 = new org.joda.time.Period((long) 59, (long) 60, chronology25);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(julianChronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 26L + "'", long24 == 26L);
        org.junit.Assert.assertNotNull(chronology25);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        int int1 = dateMidnight0.getMonthOfYear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property3 = dateTime1.property(dateTimeFieldType2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.JulianChronology julianChronology5 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone4);
        org.joda.time.Chronology chronology6 = julianChronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType2.getField((org.joda.time.Chronology) julianChronology5);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeField7.getAsShortText((int) (byte) 0, locale9);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property14 = dateTime12.property(dateTimeFieldType13);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField18 = new org.joda.time.field.OffsetDateTimeField(dateTimeField7, dateTimeFieldType13, (int) (byte) -1, (int) (byte) -1, (-35));
        int int20 = offsetDateTimeField18.getLeapAmount((long) (short) 0);
        org.joda.time.DateTimeField dateTimeField21 = org.joda.time.field.StrictDateTimeField.getInstance((org.joda.time.DateTimeField) offsetDateTimeField18);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property26 = dateTime24.property(dateTimeFieldType25);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.chrono.JulianChronology julianChronology28 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone27);
        org.joda.time.Chronology chronology29 = julianChronology28.withUTC();
        org.joda.time.DateTimeField dateTimeField30 = dateTimeFieldType25.getField((org.joda.time.Chronology) julianChronology28);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.Chronology chronology32 = julianChronology28.withZone(dateTimeZone31);
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime((long) '#', chronology32);
        org.joda.time.LocalTime localTime35 = localTime33.plusSeconds((int) 'a');
        int[] intArray39 = new int[] { 26, '#', 31 };
        int int40 = offsetDateTimeField18.getMinimumValue((org.joda.time.ReadablePartial) localTime35, intArray39);
        org.joda.time.LocalTime.Property property41 = localTime35.minuteOfHour();
        org.joda.time.LocalTime localTime42 = property41.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField43 = property41.getField();
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(julianChronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(julianChronology28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { 26, 35, 31 });
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(dateTimeField43);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.joda.time.YearMonth yearMonth1 = new org.joda.time.YearMonth(101L);
        org.joda.time.YearMonth.Property property2 = yearMonth1.year();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property5 = dateTime4.dayOfWeek();
        org.joda.time.DateTime dateTime6 = property5.roundHalfFloorCopy();
        int int7 = property2.compareTo((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.YearMonth yearMonth9 = property2.setCopy((int) (byte) 1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(yearMonth9);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.joda.time.IllegalInstantException illegalInstantException2 = new org.joda.time.IllegalInstantException((long) 1969, "DurationField[halfdays]");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod();
        mutablePeriod0.setHours(5);
        int int3 = mutablePeriod0.getSeconds();
        mutablePeriod0.addSeconds(9);
        mutablePeriod0.addSeconds((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime dateTime3 = dateTime1.withYear((-35));
        org.joda.time.DateTime dateTime5 = dateTime1.plusMillis(1970);
        org.joda.time.DateTime dateTime7 = dateTime1.withMillisOfDay(330958);
        org.joda.time.DateTime.Property property8 = dateTime1.weekyear();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.joda.time.YearMonth yearMonth1 = new org.joda.time.YearMonth(101L);
        org.joda.time.YearMonth.Property property2 = yearMonth1.year();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property5 = dateTime4.dayOfWeek();
        org.joda.time.DateTime dateTime6 = property5.roundHalfFloorCopy();
        int int7 = property2.compareTo((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.format.PeriodFormatter periodFormatter9 = org.joda.time.format.PeriodFormat.wordBased();
        java.util.Locale locale10 = periodFormatter9.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth yearMonth11 = property2.setCopy("10:59:59 o'clock PM ", locale10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"10:59:59 o'clock PM \" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(periodFormatter9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_CA");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property2 = dateTime1.dayOfWeek();
        int int3 = dateTime1.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone4);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology5);
        org.joda.time.DateMidnight.Property property7 = dateMidnight6.dayOfYear();
        org.joda.time.Period period8 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime1, (org.joda.time.ReadableInstant) dateMidnight6);
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod();
        boolean boolean11 = mutablePeriod9.equals((java.lang.Object) (-1L));
        mutablePeriod9.addMillis(1970);
        org.joda.time.Period period14 = period8.withFields((org.joda.time.ReadablePeriod) mutablePeriod9);
        mutablePeriod9.addWeeks(2025);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property5 = dateTime3.property(dateTimeFieldType4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone6);
        org.joda.time.Chronology chronology8 = julianChronology7.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType4.getField((org.joda.time.Chronology) julianChronology7);
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology7);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.chrono.JulianChronology julianChronology12 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone11);
        org.joda.time.Chronology chronology13 = julianChronology12.withUTC();
        mutableInterval10.setChronology((org.joda.time.Chronology) julianChronology12);
        mutableInterval10.setEndMillis((long) 'a');
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property19 = dateTime18.dayOfWeek();
        int int20 = dateTime18.getWeekyear();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime22 = dateTime18.plus(readableDuration21);
        boolean boolean23 = mutableInterval10.contains((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.Days days24 = org.joda.time.Days.THREE;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property27 = dateTime26.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = property27.getFieldType();
        boolean boolean29 = days24.equals((java.lang.Object) property27);
        org.joda.time.DateTime dateTime30 = property27.getDateTime();
        org.joda.time.DateTime dateTime31 = dateTime30.withEarlierOffsetAtOverlap();
        mutableInterval10.setStart((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.DateTime.Property property33 = dateTime31.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime34 = dateTime31.toMutableDateTimeISO();
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(julianChronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(julianChronology12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1970 + "'", int20 == 1970);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(mutableDateTime34);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusHours((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.dayOfYear();
        org.joda.time.LocalDateTime.Property property5 = localDateTime3.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology7 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone6);
        org.joda.time.Days days8 = org.joda.time.Days.THREE;
        int[] intArray11 = gregorianChronology7.get((org.joda.time.ReadablePeriod) days8, (long) 0, (-1L));
        org.joda.time.Duration duration12 = days8.toStandardDuration();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime3.minus((org.joda.time.ReadableDuration) duration12);
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod();
        mutablePeriod14.addWeeks((-1));
        org.joda.time.LocalDateTime localDateTime18 = localDateTime13.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod14, 5);
        int int19 = localDateTime13.getMinuteOfHour();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(gregorianChronology7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 59 + "'", int19 == 59);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((java.lang.Object) dateTimeZone0, dateTimeZone2);
        int int4 = mutableDateTime3.getRoundingMode();
        mutableDateTime3.addDays(0);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime3.setDayOfMonth((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.Chronology chronology3 = julianChronology2.withUTC();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, (org.joda.time.Chronology) julianChronology2, locale4);
        long long8 = dateTimeParserBucket5.computeMillis(true, "91");
        long long11 = dateTimeParserBucket5.computeMillis(true, (java.lang.CharSequence) "P-1W");
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.Days days2 = org.joda.time.Days.THREE;
        int[] intArray5 = gregorianChronology1.get((org.joda.time.ReadablePeriod) days2, (long) 0, (-1L));
        org.joda.time.Duration duration6 = days2.toStandardDuration();
        java.math.RoundingMode roundingMode8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration9 = duration6.dividedBy((long) 84, roundingMode8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration6);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.joda.time.Days days1 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType2 = days1.getFieldType();
        org.joda.time.PeriodType periodType3 = days1.getPeriodType();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property9 = dateTime7.property(dateTimeFieldType8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.chrono.JulianChronology julianChronology11 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone10);
        org.joda.time.Chronology chronology12 = julianChronology11.withUTC();
        org.joda.time.DateTimeField dateTimeField13 = dateTimeFieldType8.getField((org.joda.time.Chronology) julianChronology11);
        org.joda.time.MutableInterval mutableInterval14 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology11);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.chrono.JulianChronology julianChronology16 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone15);
        org.joda.time.Chronology chronology17 = julianChronology16.withUTC();
        mutableInterval14.setChronology((org.joda.time.Chronology) julianChronology16);
        org.joda.time.Period period19 = new org.joda.time.Period((long) (byte) 0, periodType3, (org.joda.time.Chronology) julianChronology16);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology21 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone20);
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology21);
        org.joda.time.DateMidnight.Property property23 = dateMidnight22.dayOfYear();
        org.joda.time.DateMidnight dateMidnight24 = property23.roundHalfEvenCopy();
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight24.plusWeeks((int) (byte) 10);
        org.joda.time.Days days27 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType28 = days27.getFieldType();
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight26.withFieldAdded(durationFieldType28, 26);
        org.joda.time.Period period32 = period19.withFieldAdded(durationFieldType28, (int) (short) 1);
        int int33 = period32.size();
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(julianChronology11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(julianChronology16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(gregorianChronology21);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateMidnight24);
        org.junit.Assert.assertNotNull(dateMidnight26);
        org.junit.Assert.assertNotNull(days27);
        org.junit.Assert.assertNotNull(durationFieldType28);
        org.junit.Assert.assertNotNull(dateMidnight30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.Chronology chronology1 = iSOChronology0.withUTC();
        java.lang.String str2 = iSOChronology0.toString();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[UTC]" + "'", str2, "ISOChronology[UTC]");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks(10);
        org.junit.Assert.assertNotNull(weeks1);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.Days days2 = org.joda.time.Days.THREE;
        int[] intArray5 = gregorianChronology1.get((org.joda.time.ReadablePeriod) days2, (long) 0, (-1L));
        org.joda.time.Duration duration6 = days2.toStandardDuration();
        long long7 = duration6.getStandardSeconds();
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 259200L + "'", long7 == 259200L);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusHours((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusMillis(2);
        int int6 = localDateTime3.getYearOfEra();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1969 + "'", int6 == 1969);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.chrono.JulianChronology julianChronology8 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone7);
        org.joda.time.Chronology chronology9 = julianChronology8.withUTC();
        java.util.Locale locale10 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, (org.joda.time.Chronology) julianChronology8, locale10);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfWeek();
        int int15 = dateTime13.getWeekyear();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.DateTime dateTime17 = dateTime13.plus(readableDuration16);
        org.joda.time.DateTime.Property property18 = dateTime17.era();
        boolean boolean19 = dateTimeParserBucket11.restoreState((java.lang.Object) property18);
        org.joda.time.DateTimeZone dateTimeZone20 = dateTimeParserBucket11.getZone();
        org.joda.time.DateTimeZone dateTimeZone21 = dateTimeParserBucket11.getZone();
        java.lang.String str22 = dateTimeZone21.getID();
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(dateTimeZone21);
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType24 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_15_BASED;
        org.joda.time.chrono.IslamicChronology islamicChronology25 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone21, leapYearPatternType24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((int) '4', (int) (short) 10, (int) 'a', (-19), 19, 0, (org.joda.time.Chronology) islamicChronology25);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -19 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
        org.junit.Assert.assertNotNull(leapYearPatternType24);
        org.junit.Assert.assertNotNull(islamicChronology25);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        int int0 = org.joda.time.chrono.EthiopicChronology.EE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withYearOfEra(10);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.JulianChronology julianChronology5 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone4);
        org.joda.time.Chronology chronology6 = julianChronology5.withUTC();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, (org.joda.time.Chronology) julianChronology5, locale7);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property11 = dateTime10.dayOfWeek();
        int int12 = dateTime10.getWeekyear();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime14 = dateTime10.plus(readableDuration13);
        org.joda.time.DateTime.Property property15 = dateTime14.era();
        boolean boolean16 = dateTimeParserBucket8.restoreState((java.lang.Object) property15);
        org.joda.time.DateTimeZone dateTimeZone17 = dateTimeParserBucket8.getZone();
        org.joda.time.DateTime dateTime18 = localDate0.toDateTimeAtCurrentTime(dateTimeZone17);
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(dateTimeZone17);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone20 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone17);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime dateTime24 = dateTime22.withYear((-35));
        int int25 = dateTime22.getMinuteOfDay();
        org.joda.time.DateTime dateTime27 = dateTime22.withYearOfEra(7);
        int int28 = dateTime22.getWeekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType30 = dateTimeFieldType29.getRangeDurationType();
        boolean boolean31 = dateTime22.isSupported(dateTimeFieldType29);
        boolean boolean32 = cachedDateTimeZone20.equals((java.lang.Object) dateTime22);
        org.joda.time.Minutes minutes33 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes35 = minutes33.multipliedBy((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval36 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime22, (org.joda.time.ReadablePeriod) minutes33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater than the start instant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(julianChronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1970 + "'", int12 == 1970);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(cachedDateTimeZone20);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertNotNull(durationFieldType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(minutes33);
        org.junit.Assert.assertNotNull(minutes35);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property2 = dateTime1.dayOfWeek();
        int int3 = dateTime1.getWeekyear();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime1.plus(readableDuration4);
        org.joda.time.DateTime.Property property6 = dateTime5.era();
        int int7 = dateTime5.getHourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = dateTime5.withMinuteOfHour(60);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 60 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1970 + "'", int3 == 1970);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.joda.time.format.PeriodFormatter periodFormatter1 = org.joda.time.format.ISOPeriodFormat.alternateExtended();
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.format.PeriodFormatter periodFormatter3 = periodFormatter1.withParseType(periodType2);
        boolean boolean4 = periodFormatter3.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period5 = org.joda.time.Period.parse("DateTimeField[weekyearOfCentury]", periodFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"DateTimeField[weekyearOfCentury]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodFormatter1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodFormatter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.Chronology chronology3 = julianChronology2.withUTC();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, (org.joda.time.Chronology) julianChronology2, locale4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology7 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone6);
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology10 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone9);
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology10);
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology10.weekyearOfCentury();
        int int13 = dateMidnight8.get(dateTimeField12);
        org.joda.time.field.SkipDateTimeField skipDateTimeField14 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) julianChronology2, dateTimeField12);
        int int15 = skipDateTimeField14.getMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology17 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone16);
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology17);
        org.joda.time.DateMidnight.Property property19 = dateMidnight18.dayOfYear();
        org.joda.time.DateMidnight dateMidnight20 = property19.roundHalfEvenCopy();
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight20.withYearOfCentury(100);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MonthDay monthDay24 = new org.joda.time.MonthDay((java.lang.Object) dateMidnight20, chronology23);
        org.joda.time.MonthDay.Property property25 = monthDay24.monthOfYear();
        org.joda.time.Period period28 = new org.joda.time.Period((long) 31, (long) 25);
        org.joda.time.MonthDay monthDay29 = monthDay24.minus((org.joda.time.ReadablePeriod) period28);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology32 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone31);
        org.joda.time.Days days33 = org.joda.time.Days.THREE;
        int[] intArray36 = gregorianChronology32.get((org.joda.time.ReadablePeriod) days33, (long) 0, (-1L));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray38 = skipDateTimeField14.addWrapField((org.joda.time.ReadablePartial) monthDay29, 10, intArray36, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(gregorianChronology7);
        org.junit.Assert.assertNotNull(gregorianChronology10);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 26 + "'", int13 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(gregorianChronology17);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertNotNull(dateMidnight22);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(monthDay29);
        org.junit.Assert.assertNotNull(gregorianChronology32);
        org.junit.Assert.assertNotNull(days33);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { 0 });
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.weekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone4);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology5);
        org.joda.time.Weeks weeks7 = org.joda.time.Weeks.ONE;
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight6.plus((org.joda.time.ReadablePeriod) weeks7);
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight8.plusWeeks((int) (short) 100);
        boolean boolean11 = dateMidnight2.isBefore((org.joda.time.ReadableInstant) dateMidnight8);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.joda.time.IllegalFieldValueException illegalFieldValueException2 = new org.joda.time.IllegalFieldValueException("2025-04-01T00:00:00.000Z", "[]");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.printZeroNever();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder2 = periodFormatterBuilder1.appendMonths();
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder2);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        long long0 = org.joda.time.DateTimeUtils.currentTimeMillis();
// flaky "2) test0434(RegressionTest0)":         org.junit.Assert.assertTrue("'" + long0 + "' != '" + 1743535724466L + "'", long0 == 1743535724466L);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.now(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(mutableDateTime2);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.MIN_VALUE;
        org.joda.time.Seconds seconds2 = seconds0.plus((int) (byte) 0);
        org.joda.time.Seconds seconds3 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds5 = seconds3.minus(7);
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds8 = seconds6.minus(7);
        boolean boolean9 = seconds3.isGreaterThan(seconds6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds10 = seconds2.minus(seconds3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: -2147483648 + -2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property5 = dateTime3.property(dateTimeFieldType4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone6);
        org.joda.time.Chronology chronology8 = julianChronology7.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType4.getField((org.joda.time.Chronology) julianChronology7);
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology7);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.chrono.JulianChronology julianChronology12 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone11);
        org.joda.time.Chronology chronology13 = julianChronology12.withUTC();
        mutableInterval10.setChronology((org.joda.time.Chronology) julianChronology12);
        mutableInterval10.setEndMillis((long) 'a');
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property19 = dateTime18.dayOfWeek();
        int int20 = dateTime18.getWeekyear();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime22 = dateTime18.plus(readableDuration21);
        boolean boolean23 = mutableInterval10.contains((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.MutableInterval mutableInterval24 = mutableInterval10.copy();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology26 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone25);
        org.joda.time.Days days27 = org.joda.time.Days.THREE;
        int[] intArray30 = gregorianChronology26.get((org.joda.time.ReadablePeriod) days27, (long) 0, (-1L));
        java.lang.String str31 = gregorianChronology26.toString();
        mutableInterval10.setChronology((org.joda.time.Chronology) gregorianChronology26);
        org.joda.time.DateTimeField dateTimeField33 = gregorianChronology26.clockhourOfHalfday();
        long long35 = dateTimeField33.roundHalfCeiling((long) 82799999);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(julianChronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(julianChronology12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1970 + "'", int20 == 1970);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(mutableInterval24);
        org.junit.Assert.assertNotNull(gregorianChronology26);
        org.junit.Assert.assertNotNull(days27);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 0 });
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "GregorianChronology[UTC]" + "'", str31, "GregorianChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 82800000L + "'", long35 == 82800000L);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.joda.time.Duration duration1 = org.joda.time.Duration.millis(101L);
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.joda.time.Hours hours0 = org.joda.time.Hours.TWO;
        org.joda.time.DurationFieldType durationFieldType1 = hours0.getFieldType();
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(durationFieldType1);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((-86401), 82799999, (int) (byte) -1, 1970, (-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property3 = dateTime1.property(dateTimeFieldType2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.JulianChronology julianChronology5 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone4);
        org.joda.time.Chronology chronology6 = julianChronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType2.getField((org.joda.time.Chronology) julianChronology5);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeField7.getAsShortText((int) (byte) 0, locale9);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property14 = dateTime12.property(dateTimeFieldType13);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField18 = new org.joda.time.field.OffsetDateTimeField(dateTimeField7, dateTimeFieldType13, (int) (byte) -1, (int) (byte) -1, (-35));
        int int20 = offsetDateTimeField18.getLeapAmount((long) (short) 0);
        int int21 = offsetDateTimeField18.getMaximumValue();
        long long24 = offsetDateTimeField18.getDifferenceAsLong((long) 13, (long) 10);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property28 = dateTime26.property(dateTimeFieldType27);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.chrono.JulianChronology julianChronology30 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone29);
        org.joda.time.Chronology chronology31 = julianChronology30.withUTC();
        org.joda.time.DateTimeField dateTimeField32 = dateTimeFieldType27.getField((org.joda.time.Chronology) julianChronology30);
        java.util.Locale locale34 = null;
        java.lang.String str35 = dateTimeField32.getAsShortText((int) (byte) 0, locale34);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property39 = dateTime37.property(dateTimeFieldType38);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField43 = new org.joda.time.field.OffsetDateTimeField(dateTimeField32, dateTimeFieldType38, (int) (byte) -1, (int) (byte) -1, (-35));
        int int45 = offsetDateTimeField43.getLeapAmount((long) (short) 0);
        org.joda.time.DateTimeField dateTimeField46 = org.joda.time.field.StrictDateTimeField.getInstance((org.joda.time.DateTimeField) offsetDateTimeField43);
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property51 = dateTime49.property(dateTimeFieldType50);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.chrono.JulianChronology julianChronology53 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone52);
        org.joda.time.Chronology chronology54 = julianChronology53.withUTC();
        org.joda.time.DateTimeField dateTimeField55 = dateTimeFieldType50.getField((org.joda.time.Chronology) julianChronology53);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.Chronology chronology57 = julianChronology53.withZone(dateTimeZone56);
        org.joda.time.LocalTime localTime58 = new org.joda.time.LocalTime((long) '#', chronology57);
        org.joda.time.LocalTime localTime60 = localTime58.plusSeconds((int) 'a');
        int[] intArray64 = new int[] { 26, '#', 31 };
        int int65 = offsetDateTimeField43.getMinimumValue((org.joda.time.ReadablePartial) localTime60, intArray64);
        java.lang.String str66 = localTime60.toString();
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property70 = dateTime69.dayOfWeek();
        int int71 = dateTime69.getWeekyear();
        int int72 = dateTime69.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology74 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone73);
        org.joda.time.Days days75 = org.joda.time.Days.THREE;
        int[] intArray78 = gregorianChronology74.get((org.joda.time.ReadablePeriod) days75, (long) 0, (-1L));
        org.joda.time.Duration duration79 = days75.toStandardDuration();
        org.joda.time.DateTime dateTime81 = dateTime69.withDurationAdded((org.joda.time.ReadableDuration) duration79, 26);
        org.joda.time.Duration duration83 = duration79.multipliedBy((long) (short) 1);
        org.joda.time.Duration duration84 = duration83.toDuration();
        org.joda.time.DateTime dateTime86 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property87 = dateTime86.dayOfWeek();
        org.joda.time.format.PeriodFormatter periodFormatter88 = org.joda.time.format.ISOPeriodFormat.alternateExtended();
        org.joda.time.PeriodType periodType89 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.format.PeriodFormatter periodFormatter90 = periodFormatter88.withParseType(periodType89);
        org.joda.time.Period period91 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration83, (org.joda.time.ReadableInstant) dateTime86, periodType89);
        java.lang.String str92 = dateTime86.toString();
        org.joda.time.format.PeriodFormatter periodFormatter94 = org.joda.time.format.PeriodFormat.wordBased();
        java.util.Locale locale95 = periodFormatter94.getLocale();
        java.lang.String str96 = dateTime86.toString("00:01:37.035", locale95);
        java.lang.String str97 = offsetDateTimeField18.getAsShortText((org.joda.time.ReadablePartial) localTime60, 0, locale95);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(julianChronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-35) + "'", int21 == (-35));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(julianChronology30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "0" + "'", str35, "0");
        org.junit.Assert.assertNotNull(dateTimeFieldType38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeFieldType50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(julianChronology53);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertNotNull(chronology57);
        org.junit.Assert.assertNotNull(localTime60);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertArrayEquals(intArray64, new int[] { 26, 35, 31 });
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "00:01:37.035" + "'", str66, "00:01:37.035");
        org.junit.Assert.assertNotNull(property70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1970 + "'", int71 == 1970);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(gregorianChronology74);
        org.junit.Assert.assertNotNull(days75);
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertArrayEquals(intArray78, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration79);
        org.junit.Assert.assertNotNull(dateTime81);
        org.junit.Assert.assertNotNull(duration83);
        org.junit.Assert.assertNotNull(duration84);
        org.junit.Assert.assertNotNull(property87);
        org.junit.Assert.assertNotNull(periodFormatter88);
        org.junit.Assert.assertNotNull(periodType89);
        org.junit.Assert.assertNotNull(periodFormatter90);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "1970-01-01T00:00:00.001Z" + "'", str92, "1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(periodFormatter94);
        org.junit.Assert.assertNotNull(locale95);
        org.junit.Assert.assertEquals(locale95.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "00:01:37.035" + "'", str96, "00:01:37.035");
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "0" + "'", str97, "0");
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfMonth((int) (byte) 1);
        org.joda.time.Instant instant4 = dateTime3.toInstant();
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardDays((long) 8);
        org.joda.time.Instant instant7 = instant4.minus((org.joda.time.ReadableDuration) duration6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology10 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone9);
        org.joda.time.Days days11 = org.joda.time.Days.THREE;
        int[] intArray14 = gregorianChronology10.get((org.joda.time.ReadablePeriod) days11, (long) 0, (-1L));
        org.joda.time.DateTimeField dateTimeField15 = gregorianChronology10.dayOfMonth();
        org.joda.time.DurationField durationField16 = gregorianChronology10.millis();
        java.util.Locale locale17 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) 26, (org.joda.time.Chronology) gregorianChronology10, locale17);
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay((java.lang.Object) instant4, (org.joda.time.Chronology) gregorianChronology10);
        // The following exception was thrown during execution in test generation
        try {
            long long25 = gregorianChronology10.getDateTimeMillis((long) (byte) -1, 4, 100, (int) 'a', 330958);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(gregorianChronology10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 0 });
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(1970);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 1970");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDayTime();
        org.junit.Assert.assertNotNull(periodType0);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property4 = dateTime2.property(dateTimeFieldType3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.JulianChronology julianChronology6 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone5);
        org.joda.time.Chronology chronology7 = julianChronology6.withUTC();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType3.getField((org.joda.time.Chronology) julianChronology6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.Chronology chronology10 = julianChronology6.withZone(dateTimeZone9);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((long) '#', chronology10);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property15 = dateTime13.property(dateTimeFieldType14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.chrono.JulianChronology julianChronology17 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone16);
        org.joda.time.Chronology chronology18 = julianChronology17.withUTC();
        org.joda.time.DateTimeField dateTimeField19 = dateTimeFieldType14.getField((org.joda.time.Chronology) julianChronology17);
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeField19.getAsShortText((int) (byte) 0, locale21);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property26 = dateTime24.property(dateTimeFieldType25);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField30 = new org.joda.time.field.OffsetDateTimeField(dateTimeField19, dateTimeFieldType25, (int) (byte) -1, (int) (byte) -1, (-35));
        int int32 = offsetDateTimeField30.getLeapAmount((long) (short) 0);
        org.joda.time.DurationField durationField33 = offsetDateTimeField30.getRangeDurationField();
        org.joda.time.field.SkipUndoDateTimeField skipUndoDateTimeField34 = new org.joda.time.field.SkipUndoDateTimeField(chronology10, (org.joda.time.DateTimeField) offsetDateTimeField30);
        int int35 = skipUndoDateTimeField34.getMinimumValue();
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(julianChronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(julianChronology17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0" + "'", str22, "0");
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        int int0 = org.joda.time.DateTimeConstants.MILLIS_PER_WEEK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 604800000 + "'", int0 == 604800000);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.joda.time.Period period4 = new org.joda.time.Period(100, 60, 3, 25);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.Instant instant4 = gJChronology3.getGregorianCutover();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay5 = new org.joda.time.TimeOfDay(70067048, (-86401), 26, (org.joda.time.Chronology) gJChronology3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70067048 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(instant4);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.JulianChronology julianChronology1 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone0);
        org.joda.time.MonthDay monthDay2 = org.joda.time.MonthDay.now((org.joda.time.Chronology) julianChronology1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology1.monthOfYear();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology1.weekyearOfCentury();
        org.junit.Assert.assertNotNull(julianChronology1);
        org.junit.Assert.assertNotNull(monthDay2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property3 = dateTime1.property(dateTimeFieldType2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.JulianChronology julianChronology5 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone4);
        org.joda.time.Chronology chronology6 = julianChronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType2.getField((org.joda.time.Chronology) julianChronology5);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeField7.getAsShortText((int) (byte) 0, locale9);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property14 = dateTime12.property(dateTimeFieldType13);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField18 = new org.joda.time.field.OffsetDateTimeField(dateTimeField7, dateTimeFieldType13, (int) (byte) -1, (int) (byte) -1, (-35));
        int int20 = offsetDateTimeField18.getLeapAmount((long) (short) 0);
        org.joda.time.DateTimeField dateTimeField21 = org.joda.time.field.StrictDateTimeField.getInstance((org.joda.time.DateTimeField) offsetDateTimeField18);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property26 = dateTime24.property(dateTimeFieldType25);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.chrono.JulianChronology julianChronology28 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone27);
        org.joda.time.Chronology chronology29 = julianChronology28.withUTC();
        org.joda.time.DateTimeField dateTimeField30 = dateTimeFieldType25.getField((org.joda.time.Chronology) julianChronology28);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.Chronology chronology32 = julianChronology28.withZone(dateTimeZone31);
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime((long) '#', chronology32);
        org.joda.time.LocalTime localTime35 = localTime33.plusSeconds((int) 'a');
        int[] intArray39 = new int[] { 26, '#', 31 };
        int int40 = offsetDateTimeField18.getMinimumValue((org.joda.time.ReadablePartial) localTime35, intArray39);
        org.joda.time.LocalTime.Property property41 = localTime35.minuteOfHour();
        org.joda.time.LocalTime localTime42 = property41.withMaximumValue();
        org.joda.time.Seconds seconds43 = org.joda.time.Seconds.TWO;
        org.joda.time.LocalTime localTime44 = localTime42.minus((org.joda.time.ReadablePeriod) seconds43);
        org.joda.time.LocalTime localTime46 = localTime44.minusMinutes((int) (byte) 10);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(julianChronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(julianChronology28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { 26, 35, 31 });
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(seconds43);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(localTime46);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withHourOfDay((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        java.lang.Number number1 = null;
        org.joda.time.IllegalFieldValueException illegalFieldValueException4 = new org.joda.time.IllegalFieldValueException("", number1, (java.lang.Number) 70067048, (java.lang.Number) 100.0d);
        org.joda.time.DurationFieldType durationFieldType5 = illegalFieldValueException4.getDurationFieldType();
        org.junit.Assert.assertNull(durationFieldType5);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusHours((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology6 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone5);
        org.joda.time.Days days7 = org.joda.time.Days.THREE;
        int[] intArray10 = gregorianChronology6.get((org.joda.time.ReadablePeriod) days7, (long) 0, (-1L));
        org.joda.time.Duration duration11 = days7.toStandardDuration();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfWeek();
        int int15 = dateTime13.getWeekyear();
        int int16 = dateTime13.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology18 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone17);
        org.joda.time.Days days19 = org.joda.time.Days.THREE;
        int[] intArray22 = gregorianChronology18.get((org.joda.time.ReadablePeriod) days19, (long) 0, (-1L));
        org.joda.time.Duration duration23 = days19.toStandardDuration();
        org.joda.time.DateTime dateTime25 = dateTime13.withDurationAdded((org.joda.time.ReadableDuration) duration23, 26);
        boolean boolean26 = duration11.isShorterThan((org.joda.time.ReadableDuration) duration23);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology28 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone27);
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology28);
        org.joda.time.DateMidnight.Property property30 = dateMidnight29.dayOfYear();
        org.joda.time.DateMidnight dateMidnight31 = property30.roundHalfEvenCopy();
        org.joda.time.DateMidnight dateMidnight33 = dateMidnight31.plusWeeks((int) (byte) 10);
        org.joda.time.Period period34 = duration11.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight33);
        long long35 = property4.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight33);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(gregorianChronology6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(gregorianChronology18);
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(gregorianChronology28);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateMidnight31);
        org.junit.Assert.assertNotNull(dateMidnight33);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-20249L) + "'", long35 == (-20249L));
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime dateTime3 = dateTime1.withYearOfCentury(60);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = dateTime1.withDayOfWeek(82799999);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 82799999 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property2 = dateTime1.dayOfWeek();
        int int3 = dateTime1.getWeekyear();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime1.plus(readableDuration4);
        org.joda.time.DateTime.Property property6 = dateTime1.secondOfMinute();
        java.util.Locale locale7 = null;
        java.lang.String str8 = property6.getAsShortText(locale7);
        org.joda.time.DateTime dateTime9 = property6.withMaximumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1970 + "'", int3 == 1970);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property2 = dateTime1.dayOfWeek();
        int int3 = dateTime1.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone4);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology5);
        org.joda.time.DateMidnight.Property property7 = dateMidnight6.dayOfYear();
        org.joda.time.Period period8 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime1, (org.joda.time.ReadableInstant) dateMidnight6);
        org.joda.time.MutableDateTime mutableDateTime9 = dateMidnight6.toMutableDateTime();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Days days1 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType2 = days1.getFieldType();
        org.joda.time.LocalDate localDate4 = localDate0.withFieldAdded(durationFieldType2, 1);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.LocalDate localDate8 = localDate0.plusYears(13);
        int int9 = localDate8.getDayOfWeek();
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property5 = dateTime3.property(dateTimeFieldType4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone6);
        org.joda.time.Chronology chronology8 = julianChronology7.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType4.getField((org.joda.time.Chronology) julianChronology7);
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology7);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.chrono.JulianChronology julianChronology13 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone12);
        org.joda.time.Chronology chronology14 = julianChronology13.withUTC();
        java.util.Locale locale15 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, (org.joda.time.Chronology) julianChronology13, locale15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology18 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone17);
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology21 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone20);
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology21);
        org.joda.time.DateTimeField dateTimeField23 = gregorianChronology21.weekyearOfCentury();
        int int24 = dateMidnight19.get(dateTimeField23);
        org.joda.time.field.SkipDateTimeField skipDateTimeField25 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) julianChronology13, dateTimeField23);
        mutableInterval10.setChronology((org.joda.time.Chronology) julianChronology13);
        org.joda.time.Minutes minutes27 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) mutableInterval10);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(julianChronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(julianChronology13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(gregorianChronology18);
        org.junit.Assert.assertNotNull(gregorianChronology21);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 26 + "'", int24 == 26);
        org.junit.Assert.assertNotNull(minutes27);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.joda.time.DateMidnight dateMidnight0 = org.joda.time.DateMidnight.now();
        org.junit.Assert.assertNotNull(dateMidnight0);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property3 = dateTime1.property(dateTimeFieldType2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.JulianChronology julianChronology5 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone4);
        org.joda.time.Chronology chronology6 = julianChronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType2.getField((org.joda.time.Chronology) julianChronology5);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeField7.getAsShortText((int) (byte) 0, locale9);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property14 = dateTime12.property(dateTimeFieldType13);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField18 = new org.joda.time.field.OffsetDateTimeField(dateTimeField7, dateTimeFieldType13, (int) (byte) -1, (int) (byte) -1, (-35));
        int int20 = offsetDateTimeField18.getLeapAmount((long) (short) 0);
        org.joda.time.DateTimeField dateTimeField21 = org.joda.time.field.StrictDateTimeField.getInstance((org.joda.time.DateTimeField) offsetDateTimeField18);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property26 = dateTime24.property(dateTimeFieldType25);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.chrono.JulianChronology julianChronology28 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone27);
        org.joda.time.Chronology chronology29 = julianChronology28.withUTC();
        org.joda.time.DateTimeField dateTimeField30 = dateTimeFieldType25.getField((org.joda.time.Chronology) julianChronology28);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.Chronology chronology32 = julianChronology28.withZone(dateTimeZone31);
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime((long) '#', chronology32);
        org.joda.time.LocalTime localTime35 = localTime33.plusSeconds((int) 'a');
        int[] intArray39 = new int[] { 26, '#', 31 };
        int int40 = offsetDateTimeField18.getMinimumValue((org.joda.time.ReadablePartial) localTime35, intArray39);
        org.joda.time.LocalTime.Property property41 = localTime35.minuteOfHour();
        org.joda.time.LocalTime localTime42 = property41.getLocalTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime44 = property41.setCopy("Coordinated Universal Time");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Coordinated Universal Time\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(julianChronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(julianChronology28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { 26, 35, 31 });
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localTime42);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.dayOfYear();
        org.joda.time.DateMidnight dateMidnight5 = property3.addWrapFieldToCopy(13);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateMidnight5);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(10L);
        mutableDateTime1.setYear(80);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property3 = dateTime1.property(dateTimeFieldType2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.JulianChronology julianChronology5 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone4);
        org.joda.time.Chronology chronology6 = julianChronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType2.getField((org.joda.time.Chronology) julianChronology5);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeField7.getAsShortText((int) (byte) 0, locale9);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property14 = dateTime12.property(dateTimeFieldType13);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField18 = new org.joda.time.field.OffsetDateTimeField(dateTimeField7, dateTimeFieldType13, (int) (byte) -1, (int) (byte) -1, (-35));
        int int20 = offsetDateTimeField18.getLeapAmount((long) (short) 0);
        org.joda.time.DateTimeField dateTimeField21 = org.joda.time.field.StrictDateTimeField.getInstance((org.joda.time.DateTimeField) offsetDateTimeField18);
        // The following exception was thrown during execution in test generation
        try {
            long long24 = offsetDateTimeField18.set((long) 1969, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfHalfday must be in the range [-1,-35]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(julianChronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property3 = dateTime1.property(dateTimeFieldType2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.JulianChronology julianChronology5 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone4);
        org.joda.time.Chronology chronology6 = julianChronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType2.getField((org.joda.time.Chronology) julianChronology5);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeField7.getAsShortText((int) (byte) 0, locale9);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property14 = dateTime12.property(dateTimeFieldType13);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField18 = new org.joda.time.field.OffsetDateTimeField(dateTimeField7, dateTimeFieldType13, (int) (byte) -1, (int) (byte) -1, (-35));
        int int20 = offsetDateTimeField18.getLeapAmount((long) (short) 0);
        org.joda.time.DateTimeField dateTimeField21 = org.joda.time.field.StrictDateTimeField.getInstance((org.joda.time.DateTimeField) offsetDateTimeField18);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property26 = dateTime24.property(dateTimeFieldType25);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.chrono.JulianChronology julianChronology28 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone27);
        org.joda.time.Chronology chronology29 = julianChronology28.withUTC();
        org.joda.time.DateTimeField dateTimeField30 = dateTimeFieldType25.getField((org.joda.time.Chronology) julianChronology28);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.Chronology chronology32 = julianChronology28.withZone(dateTimeZone31);
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime((long) '#', chronology32);
        org.joda.time.LocalTime localTime35 = localTime33.plusSeconds((int) 'a');
        int[] intArray39 = new int[] { 26, '#', 31 };
        int int40 = offsetDateTimeField18.getMinimumValue((org.joda.time.ReadablePartial) localTime35, intArray39);
        org.joda.time.LocalTime.Property property41 = localTime35.minuteOfHour();
        org.joda.time.LocalTime localTime42 = property41.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime44 = localTime42.withMillisOfSecond((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(julianChronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(julianChronology28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { 26, 35, 31 });
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localTime42);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 13, 10L);
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod();
        boolean boolean5 = mutablePeriod3.equals((java.lang.Object) (-1L));
        mutablePeriod3.setPeriod(86400000, 13, (int) (byte) -1, (int) ' ', 26, (-35), (int) (short) -1, (int) (short) 100);
        org.joda.time.Days days16 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType17 = days16.getFieldType();
        org.joda.time.PeriodType periodType18 = days16.getPeriodType();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property24 = dateTime22.property(dateTimeFieldType23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.chrono.JulianChronology julianChronology26 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone25);
        org.joda.time.Chronology chronology27 = julianChronology26.withUTC();
        org.joda.time.DateTimeField dateTimeField28 = dateTimeFieldType23.getField((org.joda.time.Chronology) julianChronology26);
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology26);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.chrono.JulianChronology julianChronology31 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone30);
        org.joda.time.Chronology chronology32 = julianChronology31.withUTC();
        mutableInterval29.setChronology((org.joda.time.Chronology) julianChronology31);
        org.joda.time.Period period34 = new org.joda.time.Period((long) (byte) 0, periodType18, (org.joda.time.Chronology) julianChronology31);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology36 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone35);
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology36);
        org.joda.time.DateMidnight.Property property38 = dateMidnight37.dayOfYear();
        org.joda.time.DateMidnight dateMidnight39 = property38.roundHalfEvenCopy();
        org.joda.time.DateMidnight dateMidnight41 = dateMidnight39.plusWeeks((int) (byte) 10);
        org.joda.time.Days days42 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType43 = days42.getFieldType();
        org.joda.time.DateMidnight dateMidnight45 = dateMidnight41.withFieldAdded(durationFieldType43, 26);
        org.joda.time.Period period47 = period34.withFieldAdded(durationFieldType43, (int) (short) 1);
        boolean boolean48 = mutablePeriod3.isSupported(durationFieldType43);
        int int49 = period2.indexOf(durationFieldType43);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(julianChronology26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(julianChronology31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(gregorianChronology36);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(dateMidnight39);
        org.junit.Assert.assertNotNull(dateMidnight41);
        org.junit.Assert.assertNotNull(days42);
        org.junit.Assert.assertNotNull(durationFieldType43);
        org.junit.Assert.assertNotNull(dateMidnight45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 3 + "'", int49 == 3);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.setDayOfYear(8);
        int int3 = mutableDateTime0.getYearOfCentury();
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod();
        boolean boolean6 = mutablePeriod4.equals((java.lang.Object) (-1L));
        mutablePeriod4.addYears(100);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology10 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone9);
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology10);
        org.joda.time.DateMidnight.Property property12 = dateMidnight11.dayOfYear();
        org.joda.time.DateMidnight dateMidnight13 = property12.roundHalfEvenCopy();
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight13.plusWeeks((int) (byte) 10);
        org.joda.time.Days days16 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType17 = days16.getFieldType();
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight15.withFieldAdded(durationFieldType17, 26);
        mutablePeriod4.add(durationFieldType17, 1);
        mutableDateTime0.add(durationFieldType17, (-1));
        mutableDateTime0.setWeekyear(5);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property29 = dateTime27.property(dateTimeFieldType28);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.chrono.JulianChronology julianChronology31 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone30);
        org.joda.time.Chronology chronology32 = julianChronology31.withUTC();
        org.joda.time.DateTimeField dateTimeField33 = dateTimeFieldType28.getField((org.joda.time.Chronology) julianChronology31);
        java.util.Locale locale35 = null;
        java.lang.String str36 = dateTimeField33.getAsShortText((int) (byte) 0, locale35);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property40 = dateTime38.property(dateTimeFieldType39);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField44 = new org.joda.time.field.OffsetDateTimeField(dateTimeField33, dateTimeFieldType39, (int) (byte) -1, (int) (byte) -1, (-35));
        org.joda.time.Partial partial46 = new org.joda.time.Partial(dateTimeFieldType39, 2);
        mutableDateTime0.set(dateTimeFieldType39, (int) (short) 10);
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 25 + "'", int3 == 25);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(gregorianChronology10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(julianChronology31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "0" + "'", str36, "0");
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertNotNull(property40);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withYearOfEra(10);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.JulianChronology julianChronology5 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone4);
        org.joda.time.Chronology chronology6 = julianChronology5.withUTC();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, (org.joda.time.Chronology) julianChronology5, locale7);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property11 = dateTime10.dayOfWeek();
        int int12 = dateTime10.getWeekyear();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime14 = dateTime10.plus(readableDuration13);
        org.joda.time.DateTime.Property property15 = dateTime14.era();
        boolean boolean16 = dateTimeParserBucket8.restoreState((java.lang.Object) property15);
        org.joda.time.DateTimeZone dateTimeZone17 = dateTimeParserBucket8.getZone();
        org.joda.time.DateTime dateTime18 = localDate0.toDateTimeAtCurrentTime(dateTimeZone17);
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(dateTimeZone17);
        org.joda.time.chrono.GJChronology gJChronology20 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone17);
        java.lang.String str21 = dateTimeZone17.getID();
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(julianChronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1970 + "'", int12 == 1970);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(gJChronology20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property3 = dateTime1.property(dateTimeFieldType2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.JulianChronology julianChronology5 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone4);
        org.joda.time.Chronology chronology6 = julianChronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType2.getField((org.joda.time.Chronology) julianChronology5);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeField7.getAsShortText((int) (byte) 0, locale9);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property14 = dateTime12.property(dateTimeFieldType13);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField18 = new org.joda.time.field.OffsetDateTimeField(dateTimeField7, dateTimeFieldType13, (int) (byte) -1, (int) (byte) -1, (-35));
        org.joda.time.Partial partial20 = new org.joda.time.Partial(dateTimeFieldType13, 2);
        org.joda.time.Days days22 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType23 = days22.getFieldType();
        org.joda.time.PeriodType periodType24 = days22.getPeriodType();
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property30 = dateTime28.property(dateTimeFieldType29);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.chrono.JulianChronology julianChronology32 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone31);
        org.joda.time.Chronology chronology33 = julianChronology32.withUTC();
        org.joda.time.DateTimeField dateTimeField34 = dateTimeFieldType29.getField((org.joda.time.Chronology) julianChronology32);
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology32);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.chrono.JulianChronology julianChronology37 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone36);
        org.joda.time.Chronology chronology38 = julianChronology37.withUTC();
        mutableInterval35.setChronology((org.joda.time.Chronology) julianChronology37);
        org.joda.time.Period period40 = new org.joda.time.Period((long) (byte) 0, periodType24, (org.joda.time.Chronology) julianChronology37);
        org.joda.time.Partial partial41 = partial20.plus((org.joda.time.ReadablePeriod) period40);
        int int42 = period40.getMonths();
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(julianChronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(julianChronology32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(julianChronology37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(partial41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone4);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology5);
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(9, 1, 5, 5, (org.joda.time.Chronology) gregorianChronology5);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = gregorianChronology5.getDateTimeMillis((int) (short) 1, 1440, 50, (int) (short) 100, 26, 10, 12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology5);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.joda.time.Days days1 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType2 = days1.getFieldType();
        org.joda.time.PeriodType periodType3 = days1.getPeriodType();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property9 = dateTime7.property(dateTimeFieldType8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.chrono.JulianChronology julianChronology11 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone10);
        org.joda.time.Chronology chronology12 = julianChronology11.withUTC();
        org.joda.time.DateTimeField dateTimeField13 = dateTimeFieldType8.getField((org.joda.time.Chronology) julianChronology11);
        org.joda.time.MutableInterval mutableInterval14 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology11);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.chrono.JulianChronology julianChronology16 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone15);
        org.joda.time.Chronology chronology17 = julianChronology16.withUTC();
        mutableInterval14.setChronology((org.joda.time.Chronology) julianChronology16);
        org.joda.time.Period period19 = new org.joda.time.Period((long) (byte) 0, periodType3, (org.joda.time.Chronology) julianChronology16);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType21 = dateTimeFieldType20.getRangeDurationType();
        boolean boolean22 = period19.isSupported(durationFieldType21);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology24 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone23);
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology24);
        org.joda.time.Weeks weeks26 = org.joda.time.Weeks.ONE;
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight25.plus((org.joda.time.ReadablePeriod) weeks26);
        org.joda.time.DurationFieldType durationFieldType28 = org.joda.time.DurationFieldType.seconds();
        boolean boolean29 = weeks26.isSupported(durationFieldType28);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology31 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone30);
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology31);
        org.joda.time.DateMidnight.Property property33 = dateMidnight32.dayOfYear();
        org.joda.time.DateMidnight dateMidnight34 = property33.roundHalfEvenCopy();
        org.joda.time.DateMidnight dateMidnight36 = dateMidnight34.plusWeeks((int) (byte) 10);
        org.joda.time.Days days37 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType38 = days37.getFieldType();
        org.joda.time.DateMidnight dateMidnight40 = dateMidnight36.withFieldAdded(durationFieldType38, 26);
        org.joda.time.Period period43 = new org.joda.time.Period((long) 13, 10L);
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod();
        boolean boolean46 = mutablePeriod44.equals((java.lang.Object) (-1L));
        mutablePeriod44.setPeriod(86400000, 13, (int) (byte) -1, (int) ' ', 26, (-35), (int) (short) -1, (int) (short) 100);
        org.joda.time.Days days57 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType58 = days57.getFieldType();
        org.joda.time.PeriodType periodType59 = days57.getPeriodType();
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property65 = dateTime63.property(dateTimeFieldType64);
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.chrono.JulianChronology julianChronology67 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone66);
        org.joda.time.Chronology chronology68 = julianChronology67.withUTC();
        org.joda.time.DateTimeField dateTimeField69 = dateTimeFieldType64.getField((org.joda.time.Chronology) julianChronology67);
        org.joda.time.MutableInterval mutableInterval70 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology67);
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.chrono.JulianChronology julianChronology72 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone71);
        org.joda.time.Chronology chronology73 = julianChronology72.withUTC();
        mutableInterval70.setChronology((org.joda.time.Chronology) julianChronology72);
        org.joda.time.Period period75 = new org.joda.time.Period((long) (byte) 0, periodType59, (org.joda.time.Chronology) julianChronology72);
        org.joda.time.DateTimeZone dateTimeZone76 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology77 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone76);
        org.joda.time.DateMidnight dateMidnight78 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology77);
        org.joda.time.DateMidnight.Property property79 = dateMidnight78.dayOfYear();
        org.joda.time.DateMidnight dateMidnight80 = property79.roundHalfEvenCopy();
        org.joda.time.DateMidnight dateMidnight82 = dateMidnight80.plusWeeks((int) (byte) 10);
        org.joda.time.Days days83 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType84 = days83.getFieldType();
        org.joda.time.DateMidnight dateMidnight86 = dateMidnight82.withFieldAdded(durationFieldType84, 26);
        org.joda.time.Period period88 = period75.withFieldAdded(durationFieldType84, (int) (short) 1);
        boolean boolean89 = mutablePeriod44.isSupported(durationFieldType84);
        int int90 = period43.indexOf(durationFieldType84);
        org.joda.time.DurationFieldType[] durationFieldTypeArray91 = new org.joda.time.DurationFieldType[] { durationFieldType21, durationFieldType28, durationFieldType38, durationFieldType84 };
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.PeriodType periodType92 = org.joda.time.PeriodType.forFields(durationFieldTypeArray91);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: PeriodType does not support fields: [days]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(julianChronology11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(julianChronology16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(gregorianChronology24);
        org.junit.Assert.assertNotNull(weeks26);
        org.junit.Assert.assertNotNull(dateMidnight27);
        org.junit.Assert.assertNotNull(durationFieldType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(gregorianChronology31);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(dateMidnight34);
        org.junit.Assert.assertNotNull(dateMidnight36);
        org.junit.Assert.assertNotNull(days37);
        org.junit.Assert.assertNotNull(durationFieldType38);
        org.junit.Assert.assertNotNull(dateMidnight40);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(days57);
        org.junit.Assert.assertNotNull(durationFieldType58);
        org.junit.Assert.assertNotNull(periodType59);
        org.junit.Assert.assertNotNull(dateTimeFieldType64);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(julianChronology67);
        org.junit.Assert.assertNotNull(chronology68);
        org.junit.Assert.assertNotNull(dateTimeField69);
        org.junit.Assert.assertNotNull(julianChronology72);
        org.junit.Assert.assertNotNull(chronology73);
        org.junit.Assert.assertNotNull(gregorianChronology77);
        org.junit.Assert.assertNotNull(property79);
        org.junit.Assert.assertNotNull(dateMidnight80);
        org.junit.Assert.assertNotNull(dateMidnight82);
        org.junit.Assert.assertNotNull(days83);
        org.junit.Assert.assertNotNull(durationFieldType84);
        org.junit.Assert.assertNotNull(dateMidnight86);
        org.junit.Assert.assertNotNull(period88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 3 + "'", int90 == 3);
        org.junit.Assert.assertNotNull(durationFieldTypeArray91);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone1);
        org.joda.time.Days days3 = org.joda.time.Days.THREE;
        int[] intArray6 = gregorianChronology2.get((org.joda.time.ReadablePeriod) days3, (long) 0, (-1L));
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology2.dayOfMonth();
        org.joda.time.DurationField durationField8 = gregorianChronology2.years();
        org.joda.time.DurationField durationField9 = gregorianChronology2.hours();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.chrono.JulianChronology julianChronology11 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone10);
        org.joda.time.DurationField durationField12 = julianChronology11.seconds();
        int int13 = durationField9.compareTo(durationField12);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property17 = dateTime15.property(dateTimeFieldType16);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.chrono.JulianChronology julianChronology19 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone18);
        org.joda.time.Chronology chronology20 = julianChronology19.withUTC();
        org.joda.time.DateTimeField dateTimeField21 = dateTimeFieldType16.getField((org.joda.time.Chronology) julianChronology19);
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeField21.getAsShortText((int) (byte) 0, locale23);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property28 = dateTime26.property(dateTimeFieldType27);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField32 = new org.joda.time.field.OffsetDateTimeField(dateTimeField21, dateTimeFieldType27, (int) (byte) -1, (int) (byte) -1, (-35));
        int int34 = offsetDateTimeField32.getLeapAmount((long) (short) 0);
        org.joda.time.DurationField durationField35 = offsetDateTimeField32.getRangeDurationField();
        org.joda.time.field.PreciseDateTimeField preciseDateTimeField36 = new org.joda.time.field.PreciseDateTimeField(dateTimeFieldType0, durationField9, durationField35);
        long long38 = preciseDateTimeField36.roundHalfCeiling((-1511999993L));
        // The following exception was thrown during execution in test generation
        try {
            long long41 = preciseDateTimeField36.set((long) 12, 19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 19 for millisOfSecond must be in the range [0,11]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0 });
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(julianChronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(julianChronology19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "0" + "'", str24, "0");
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-1512000000L) + "'", long38 == (-1512000000L));
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property2 = dateTime1.dayOfWeek();
        int int3 = dateTime1.getWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.toDateTime();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property7 = dateTime6.dayOfWeek();
        org.joda.time.DateTime dateTime8 = property7.roundHalfFloorCopy();
        int int9 = dateTime4.compareTo((org.joda.time.ReadableInstant) dateTime8);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1970 + "'", int3 == 1970);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfWeek();
        mutableDateTime0.setSecondOfMinute(31);
        org.joda.time.Months months4 = org.joda.time.Months.ONE;
        org.joda.time.DurationFieldType durationFieldType5 = months4.getFieldType();
        mutableDateTime0.add(durationFieldType5, (int) (short) 0);
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(months4);
        org.junit.Assert.assertNotNull(durationFieldType5);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.setMillis((-1L));
        int int3 = mutableDateTime0.getDayOfWeek();
        int int4 = mutableDateTime0.getDayOfMonth();
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 31 + "'", int4 == 31);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property4 = dateTime2.property(dateTimeFieldType3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.JulianChronology julianChronology6 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone5);
        org.joda.time.Chronology chronology7 = julianChronology6.withUTC();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType3.getField((org.joda.time.Chronology) julianChronology6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.Chronology chronology10 = julianChronology6.withZone(dateTimeZone9);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((long) '#', chronology10);
        org.joda.time.LocalTime localTime13 = localTime11.plusSeconds((int) 'a');
        org.joda.time.DateTimeField[] dateTimeFieldArray14 = localTime11.getFields();
        org.joda.time.LocalTime localTime16 = localTime11.minusSeconds((-1));
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(julianChronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldArray14);
        org.junit.Assert.assertNotNull(localTime16);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(60, 1, 12, 1, 70067048);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70067048 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', 70067048, 1440, 86400);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withYearOfEra(10);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.JulianChronology julianChronology5 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone4);
        org.joda.time.Chronology chronology6 = julianChronology5.withUTC();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, (org.joda.time.Chronology) julianChronology5, locale7);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property11 = dateTime10.dayOfWeek();
        int int12 = dateTime10.getWeekyear();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime14 = dateTime10.plus(readableDuration13);
        org.joda.time.DateTime.Property property15 = dateTime14.era();
        boolean boolean16 = dateTimeParserBucket8.restoreState((java.lang.Object) property15);
        org.joda.time.DateTimeZone dateTimeZone17 = dateTimeParserBucket8.getZone();
        org.joda.time.DateTime dateTime18 = localDate0.toDateTimeAtCurrentTime(dateTimeZone17);
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(dateTimeZone17);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone20 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone17);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property23 = dateTime22.dayOfWeek();
        int int24 = dateTime22.getWeekyear();
        int int25 = dateTime22.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology27 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone26);
        org.joda.time.Days days28 = org.joda.time.Days.THREE;
        int[] intArray31 = gregorianChronology27.get((org.joda.time.ReadablePeriod) days28, (long) 0, (-1L));
        org.joda.time.Duration duration32 = days28.toStandardDuration();
        org.joda.time.DateTime dateTime34 = dateTime22.withDurationAdded((org.joda.time.ReadableDuration) duration32, 26);
        org.joda.time.Duration duration36 = duration32.multipliedBy((long) (short) 1);
        org.joda.time.Duration duration37 = duration36.toDuration();
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property40 = dateTime39.dayOfWeek();
        org.joda.time.format.PeriodFormatter periodFormatter41 = org.joda.time.format.ISOPeriodFormat.alternateExtended();
        org.joda.time.PeriodType periodType42 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.format.PeriodFormatter periodFormatter43 = periodFormatter41.withParseType(periodType42);
        org.joda.time.Period period44 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration36, (org.joda.time.ReadableInstant) dateTime39, periodType42);
        java.lang.String str45 = dateTime39.toString();
        boolean boolean47 = dateTime39.isEqual(10L);
        org.joda.time.DateTime dateTime49 = dateTime39.minus((long) 26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology51 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone17, (org.joda.time.ReadableInstant) dateTime49, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(julianChronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1970 + "'", int12 == 1970);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(cachedDateTimeZone20);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1970 + "'", int24 == 1970);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(gregorianChronology27);
        org.junit.Assert.assertNotNull(days28);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(periodFormatter41);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(periodFormatter43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "1970-01-01T00:00:00.001Z" + "'", str45, "1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(dateTime49);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.addMonths((int) (short) 100);
        mutableDateTime0.setMillis((long) (byte) 1);
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod();
        boolean boolean7 = mutablePeriod5.equals((java.lang.Object) (-1L));
        mutablePeriod5.setPeriod(86400000, 13, (int) (byte) -1, (int) ' ', 26, (-35), (int) (short) -1, (int) (short) 100);
        org.joda.time.Days days18 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType19 = days18.getFieldType();
        org.joda.time.PeriodType periodType20 = days18.getPeriodType();
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property26 = dateTime24.property(dateTimeFieldType25);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.chrono.JulianChronology julianChronology28 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone27);
        org.joda.time.Chronology chronology29 = julianChronology28.withUTC();
        org.joda.time.DateTimeField dateTimeField30 = dateTimeFieldType25.getField((org.joda.time.Chronology) julianChronology28);
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology28);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.chrono.JulianChronology julianChronology33 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone32);
        org.joda.time.Chronology chronology34 = julianChronology33.withUTC();
        mutableInterval31.setChronology((org.joda.time.Chronology) julianChronology33);
        org.joda.time.Period period36 = new org.joda.time.Period((long) (byte) 0, periodType20, (org.joda.time.Chronology) julianChronology33);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology38 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone37);
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology38);
        org.joda.time.DateMidnight.Property property40 = dateMidnight39.dayOfYear();
        org.joda.time.DateMidnight dateMidnight41 = property40.roundHalfEvenCopy();
        org.joda.time.DateMidnight dateMidnight43 = dateMidnight41.plusWeeks((int) (byte) 10);
        org.joda.time.Days days44 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType45 = days44.getFieldType();
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight43.withFieldAdded(durationFieldType45, 26);
        org.joda.time.Period period49 = period36.withFieldAdded(durationFieldType45, (int) (short) 1);
        boolean boolean50 = mutablePeriod5.isSupported(durationFieldType45);
        mutableDateTime0.add(durationFieldType45, 1440);
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime0.millisOfSecond();
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(days18);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(julianChronology28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(julianChronology33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(gregorianChronology38);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(dateMidnight41);
        org.junit.Assert.assertNotNull(dateMidnight43);
        org.junit.Assert.assertNotNull(days44);
        org.junit.Assert.assertNotNull(durationFieldType45);
        org.junit.Assert.assertNotNull(dateMidnight47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(property53);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Duration duration1 = minutes0.toStandardDuration();
        org.joda.time.Minutes minutes3 = minutes0.plus((int) (short) 1);
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(minutes3);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone1);
        org.joda.time.Days days3 = org.joda.time.Days.THREE;
        int[] intArray6 = gregorianChronology2.get((org.joda.time.ReadablePeriod) days3, (long) 0, (-1L));
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology2.dayOfMonth();
        org.joda.time.DurationField durationField8 = gregorianChronology2.millis();
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) 26, (org.joda.time.Chronology) gregorianChronology2, locale9);
        dateTimeParserBucket10.setOffset(0);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket10.getChronology();
        dateTimeParserBucket10.setOffset(8);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0 });
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property3 = dateTime1.property(dateTimeFieldType2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.JulianChronology julianChronology5 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone4);
        org.joda.time.Chronology chronology6 = julianChronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType2.getField((org.joda.time.Chronology) julianChronology5);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeField7.getAsShortText((int) (byte) 0, locale9);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property14 = dateTime12.property(dateTimeFieldType13);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField18 = new org.joda.time.field.OffsetDateTimeField(dateTimeField7, dateTimeFieldType13, (int) (byte) -1, (int) (byte) -1, (-35));
        org.joda.time.Partial partial20 = new org.joda.time.Partial(dateTimeFieldType13, 2);
        org.joda.time.Days days22 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType23 = days22.getFieldType();
        org.joda.time.PeriodType periodType24 = days22.getPeriodType();
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property30 = dateTime28.property(dateTimeFieldType29);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.chrono.JulianChronology julianChronology32 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone31);
        org.joda.time.Chronology chronology33 = julianChronology32.withUTC();
        org.joda.time.DateTimeField dateTimeField34 = dateTimeFieldType29.getField((org.joda.time.Chronology) julianChronology32);
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology32);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.chrono.JulianChronology julianChronology37 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone36);
        org.joda.time.Chronology chronology38 = julianChronology37.withUTC();
        mutableInterval35.setChronology((org.joda.time.Chronology) julianChronology37);
        org.joda.time.Period period40 = new org.joda.time.Period((long) (byte) 0, periodType24, (org.joda.time.Chronology) julianChronology37);
        org.joda.time.Partial partial41 = partial20.plus((org.joda.time.ReadablePeriod) period40);
        java.util.Locale locale43 = null;
        java.lang.String str44 = partial41.toString("2025-04-01", locale43);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial47 = partial41.withField(dateTimeFieldType45, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'null' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(julianChronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(julianChronology32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(julianChronology37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(partial41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "2025-04-01" + "'", str44, "2025-04-01");
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.setDayOfYear(8);
        mutableDateTime0.setDayOfYear(31);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property8 = dateTime6.property(dateTimeFieldType7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.chrono.JulianChronology julianChronology10 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone9);
        org.joda.time.Chronology chronology11 = julianChronology10.withUTC();
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType7.getField((org.joda.time.Chronology) julianChronology10);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeField12.getAsShortText((int) (byte) 0, locale14);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property19 = dateTime17.property(dateTimeFieldType18);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField23 = new org.joda.time.field.OffsetDateTimeField(dateTimeField12, dateTimeFieldType18, (int) (byte) -1, (int) (byte) -1, (-35));
        mutableDateTime0.setRounding((org.joda.time.DateTimeField) offsetDateTimeField23);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime0.setMonthOfYear(22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 22 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(julianChronology10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0" + "'", str15, "0");
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfMonth((int) (byte) 1);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime1.toMutableDateTimeISO();
        mutableDateTime4.setDate((long) 3);
        mutableDateTime4.setMillis(0L);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.Chronology chronology3 = julianChronology2.withUTC();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, (org.joda.time.Chronology) julianChronology2, locale4);
        org.joda.time.DateTimeField dateTimeField6 = julianChronology2.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology8 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone7);
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology8);
        org.joda.time.DateMidnight.Property property10 = dateMidnight9.dayOfYear();
        org.joda.time.DateMidnight dateMidnight11 = property10.roundHalfEvenCopy();
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight11.plusWeeks((int) (byte) 10);
        org.joda.time.Days days14 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType15 = days14.getFieldType();
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight13.withFieldAdded(durationFieldType15, 26);
        org.joda.time.LocalDate localDate18 = dateMidnight13.toLocalDate();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property23 = dateTime21.property(dateTimeFieldType22);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.chrono.JulianChronology julianChronology25 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone24);
        org.joda.time.Chronology chronology26 = julianChronology25.withUTC();
        org.joda.time.DateTimeField dateTimeField27 = dateTimeFieldType22.getField((org.joda.time.Chronology) julianChronology25);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.Chronology chronology29 = julianChronology25.withZone(dateTimeZone28);
        org.joda.time.chrono.StrictChronology strictChronology30 = org.joda.time.chrono.StrictChronology.getInstance(chronology29);
        org.joda.time.format.PeriodFormatter periodFormatter31 = org.joda.time.format.PeriodFormat.wordBased();
        java.util.Locale locale32 = periodFormatter31.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket((long) (-86401), chronology29, locale32, (java.lang.Integer) 1440, 7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = dateTimeField6.getAsText((org.joda.time.ReadablePartial) localDate18, locale32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'hourOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(gregorianChronology8);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(julianChronology25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(strictChronology30);
        org.junit.Assert.assertNotNull(periodFormatter31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en_CA");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusHours((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.dayOfYear();
        org.joda.time.LocalDateTime.Property property5 = localDateTime3.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology7 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone6);
        org.joda.time.Days days8 = org.joda.time.Days.THREE;
        int[] intArray11 = gregorianChronology7.get((org.joda.time.ReadablePeriod) days8, (long) 0, (-1L));
        org.joda.time.Duration duration12 = days8.toStandardDuration();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime3.minus((org.joda.time.ReadableDuration) duration12);
        org.joda.time.DateTime dateTime14 = localDateTime3.toDateTime();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property17 = dateTime16.dayOfWeek();
        int int18 = dateTime16.getWeekyear();
        int int19 = dateTime16.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology21 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone20);
        org.joda.time.Days days22 = org.joda.time.Days.THREE;
        int[] intArray25 = gregorianChronology21.get((org.joda.time.ReadablePeriod) days22, (long) 0, (-1L));
        org.joda.time.Duration duration26 = days22.toStandardDuration();
        org.joda.time.DateTime dateTime28 = dateTime16.withDurationAdded((org.joda.time.ReadableDuration) duration26, 26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime3.plus((org.joda.time.ReadableDuration) duration26);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(gregorianChronology7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1970 + "'", int18 == 1970);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(gregorianChronology21);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(localDateTime29);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusMinutes((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusDays(19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withDayOfMonth((-20274));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -20274 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 31, (long) 25);
        org.joda.time.MutablePeriod mutablePeriod3 = period2.toMutablePeriod();
        org.junit.Assert.assertNotNull(mutablePeriod3);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.joda.time.Days days1 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType2 = days1.getFieldType();
        org.joda.time.PeriodType periodType3 = days1.getPeriodType();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property9 = dateTime7.property(dateTimeFieldType8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.chrono.JulianChronology julianChronology11 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone10);
        org.joda.time.Chronology chronology12 = julianChronology11.withUTC();
        org.joda.time.DateTimeField dateTimeField13 = dateTimeFieldType8.getField((org.joda.time.Chronology) julianChronology11);
        org.joda.time.MutableInterval mutableInterval14 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology11);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.chrono.JulianChronology julianChronology16 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone15);
        org.joda.time.Chronology chronology17 = julianChronology16.withUTC();
        mutableInterval14.setChronology((org.joda.time.Chronology) julianChronology16);
        org.joda.time.Period period19 = new org.joda.time.Period((long) (byte) 0, periodType3, (org.joda.time.Chronology) julianChronology16);
        org.joda.time.Days days20 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType21 = days20.getFieldType();
        org.joda.time.PeriodType periodType22 = days20.getPeriodType();
        boolean boolean23 = periodType3.equals((java.lang.Object) periodType22);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime dateTime27 = dateTime25.withYear((-35));
        org.joda.time.DateTime dateTime29 = dateTime25.plusMillis(1970);
        org.joda.time.DateTime dateTime31 = dateTime25.withMillisOfDay(330958);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.DateTime dateTime34 = dateTime25.toDateTime(dateTimeZone33);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((java.lang.Object) periodType22, dateTimeZone33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(julianChronology11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(julianChronology16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTime34);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime dateTime3 = dateTime1.withYear((-35));
        org.joda.time.DateTime dateTime4 = dateTime1.toDateTime();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours1 = org.joda.time.Hours.parseHours("GregorianChronology[UTC]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"GregorianChronology[UTC]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.joda.time.chrono.ISOChronology iSOChronology6 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(4, 86400000, 0, 100, (int) (byte) 10, (int) '#', (org.joda.time.Chronology) iSOChronology6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology6);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        int int0 = org.joda.time.DateTimeConstants.SECONDS_PER_HOUR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3600 + "'", int0 == 3600);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        int int0 = org.joda.time.YearMonth.YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property3 = dateTime1.property(dateTimeFieldType2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.JulianChronology julianChronology5 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone4);
        org.joda.time.Chronology chronology6 = julianChronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType2.getField((org.joda.time.Chronology) julianChronology5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.Chronology chronology9 = julianChronology5.withZone(dateTimeZone8);
        org.joda.time.chrono.StrictChronology strictChronology10 = org.joda.time.chrono.StrictChronology.getInstance(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = strictChronology10.yearOfEra();
        org.joda.time.DateTimeField dateTimeField12 = strictChronology10.yearOfEra();
        org.joda.time.DateTimeField dateTimeField13 = strictChronology10.year();
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(julianChronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(strictChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.mediumTime();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.Chronology chronology3 = julianChronology2.withUTC();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, (org.joda.time.Chronology) julianChronology2, locale4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology7 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone6);
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology10 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone9);
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology10);
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology10.weekyearOfCentury();
        int int13 = dateMidnight8.get(dateTimeField12);
        org.joda.time.field.SkipDateTimeField skipDateTimeField14 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) julianChronology2, dateTimeField12);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property21 = dateTime19.property(dateTimeFieldType20);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.chrono.JulianChronology julianChronology23 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone22);
        org.joda.time.Chronology chronology24 = julianChronology23.withUTC();
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType20.getField((org.joda.time.Chronology) julianChronology23);
        org.joda.time.MutableInterval mutableInterval26 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology23);
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) (short) -1, (org.joda.time.Chronology) julianChronology23);
        java.util.Locale locale29 = null;
        java.lang.String str30 = skipDateTimeField14.getAsText((org.joda.time.ReadablePartial) localDateTime27, 0, locale29);
        org.joda.time.DurationField durationField31 = skipDateTimeField14.getRangeDurationField();
        boolean boolean32 = skipDateTimeField14.isLenient();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology34 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone33);
        org.joda.time.DateMidnight dateMidnight35 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology34);
        org.joda.time.Weeks weeks36 = org.joda.time.Weeks.ONE;
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight35.plus((org.joda.time.ReadablePeriod) weeks36);
        java.util.Date date38 = dateMidnight35.toDate();
        org.joda.time.YearMonthDay yearMonthDay39 = org.joda.time.YearMonthDay.fromDateFields(date38);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateMidnight dateMidnight41 = yearMonthDay39.toDateMidnight(dateTimeZone40);
        int[] intArray43 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray45 = skipDateTimeField14.addWrapField((org.joda.time.ReadablePartial) yearMonthDay39, 82799999, intArray43, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 82799999");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(gregorianChronology7);
        org.junit.Assert.assertNotNull(gregorianChronology10);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 26 + "'", int13 == 26);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(julianChronology23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "0" + "'", str30, "0");
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(gregorianChronology34);
        org.junit.Assert.assertNotNull(weeks36);
        org.junit.Assert.assertNotNull(dateMidnight37);
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Mon Mar 31 20:00:00 EDT 2025");
        org.junit.Assert.assertNotNull(yearMonthDay39);
        org.junit.Assert.assertNotNull(dateMidnight41);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] {});
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.weekyear();
        java.lang.String str2 = dateMidnight0.toString(dateTimeFormatter1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime4 = dateTimeFormatter1.parseDateTime("[]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"[]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2025" + "'", str2, "2025");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.printZeroNever();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder2 = periodFormatterBuilder0.appendMinutes();
        org.joda.time.format.PeriodPrinter periodPrinter3 = periodFormatterBuilder2.toPrinter();
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder2);
        org.junit.Assert.assertNotNull(periodPrinter3);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Days days1 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType2 = days1.getFieldType();
        org.joda.time.LocalDate localDate4 = localDate0.withFieldAdded(durationFieldType2, 1);
        org.joda.time.LocalDate.Property property5 = localDate4.era();
        org.joda.time.LocalDate localDate7 = localDate4.withYearOfCentury(0);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusHours((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusMillis(2);
        org.joda.time.Chronology chronology14 = localDateTime11.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = localDate7.isEqual((org.joda.time.ReadablePartial) localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(chronology14);
    }
}
