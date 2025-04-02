import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property2 = dateTime1.dayOfWeek();
        int int3 = dateTime1.getWeekyear();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime1.plus(readableDuration4);
        org.joda.time.DateTime.Property property6 = dateTime5.minuteOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology9 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone8);
        org.joda.time.Days days10 = org.joda.time.Days.THREE;
        int[] intArray13 = gregorianChronology9.get((org.joda.time.ReadablePeriod) days10, (long) 0, (-1L));
        org.joda.time.DateTimeField dateTimeField14 = gregorianChronology9.dayOfMonth();
        org.joda.time.DurationField durationField15 = gregorianChronology9.years();
        org.joda.time.DurationField durationField16 = gregorianChronology9.hours();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.chrono.JulianChronology julianChronology18 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone17);
        org.joda.time.DurationField durationField19 = julianChronology18.seconds();
        int int20 = durationField16.compareTo(durationField19);
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
        org.joda.time.DurationField durationField42 = offsetDateTimeField39.getRangeDurationField();
        org.joda.time.field.PreciseDateTimeField preciseDateTimeField43 = new org.joda.time.field.PreciseDateTimeField(dateTimeFieldType7, durationField16, durationField42);
        boolean boolean44 = dateTime5.isSupported(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1970 + "'", int3 == 1970);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(gregorianChronology9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 0 });
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(julianChronology18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(julianChronology26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "0" + "'", str31, "0");
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withYearOfEra(10);
        int int3 = localDate2.getYearOfCentury();
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod();
        mutablePeriod0.addWeeks((-1));
        org.joda.time.MutablePeriod mutablePeriod3 = mutablePeriod0.toMutablePeriod();
        org.junit.Assert.assertNotNull(mutablePeriod3);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.joda.time.Period period1 = org.joda.time.Period.days(7);
        org.joda.time.Period period3 = period1.plusMonths(60);
        org.joda.time.Period period5 = period3.minusDays((-86401));
        int int7 = period5.getValue(1);
        org.joda.time.Period period9 = period5.minusMinutes((-86401));
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertNotNull(period9);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withYearOfEra(10);
        java.lang.String str3 = localDate0.toString();
        org.junit.Assert.assertNotNull(localDate2);
// flaky "1) test1005(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
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
        java.lang.String str24 = timeOfDay18.toString();
        org.joda.time.LocalTime localTime25 = timeOfDay18.toLocalTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime27 = localTime25.withSecondOfMinute((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
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
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "T23:59:28.001" + "'", str24, "T23:59:28.001");
        org.junit.Assert.assertNotNull(localTime25);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property3 = dateTime1.property(dateTimeFieldType2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.JulianChronology julianChronology5 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone4);
        org.joda.time.Chronology chronology6 = julianChronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType2.getField((org.joda.time.Chronology) julianChronology5);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeField7.getAsShortText((int) (byte) 0, locale9);
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
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property32 = dateTime30.property(dateTimeFieldType31);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.chrono.JulianChronology julianChronology34 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone33);
        org.joda.time.Chronology chronology35 = julianChronology34.withUTC();
        org.joda.time.DateTimeField dateTimeField36 = dateTimeFieldType31.getField((org.joda.time.Chronology) julianChronology34);
        org.joda.time.MutableInterval mutableInterval37 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology34);
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((long) (short) -1, (org.joda.time.Chronology) julianChronology34);
        java.util.Locale locale40 = null;
        java.lang.String str41 = skipDateTimeField25.getAsText((org.joda.time.ReadablePartial) localDateTime38, 0, locale40);
        org.joda.time.DurationField durationField42 = skipDateTimeField25.getRangeDurationField();
        org.joda.time.Days days43 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType44 = days43.getFieldType();
        org.joda.time.field.ScaledDurationField scaledDurationField46 = new org.joda.time.field.ScaledDurationField(durationField42, durationFieldType44, 1440);
        long long48 = durationField42.getValueAsLong((long) 9);
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField51 = new org.joda.time.field.DividedDateTimeField(dateTimeField7, durationField42, dateTimeFieldType49, 19);
        org.joda.time.DurationField durationField52 = dividedDateTimeField51.getRangeDurationField();
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(julianChronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(julianChronology13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(gregorianChronology18);
        org.junit.Assert.assertNotNull(gregorianChronology21);
        org.junit.Assert.assertNotNull(dateTimeField23);
// flaky "2) test1007(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 71 + "'", int24 == 71);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(julianChronology34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "0" + "'", str41, "0");
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertNotNull(days43);
        org.junit.Assert.assertNotNull(durationFieldType44);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertNotNull(dateTimeFieldType49);
        org.junit.Assert.assertNotNull(durationField52);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
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
        org.joda.time.DateTimeZone dateTimeZone27 = julianChronology13.getZone();
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property31 = dateTime29.property(dateTimeFieldType30);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.chrono.JulianChronology julianChronology33 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone32);
        org.joda.time.Chronology chronology34 = julianChronology33.withUTC();
        org.joda.time.DateTimeField dateTimeField35 = dateTimeFieldType30.getField((org.joda.time.Chronology) julianChronology33);
        java.util.Locale locale37 = null;
        java.lang.String str38 = dateTimeField35.getAsShortText((int) (byte) 0, locale37);
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property42 = dateTime40.property(dateTimeFieldType41);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField46 = new org.joda.time.field.OffsetDateTimeField(dateTimeField35, dateTimeFieldType41, (int) (byte) -1, (int) (byte) -1, (-35));
        int int48 = offsetDateTimeField46.getLeapAmount((long) (short) 0);
        org.joda.time.DateTimeField dateTimeField49 = org.joda.time.field.StrictDateTimeField.getInstance((org.joda.time.DateTimeField) offsetDateTimeField46);
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property54 = dateTime52.property(dateTimeFieldType53);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.chrono.JulianChronology julianChronology56 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone55);
        org.joda.time.Chronology chronology57 = julianChronology56.withUTC();
        org.joda.time.DateTimeField dateTimeField58 = dateTimeFieldType53.getField((org.joda.time.Chronology) julianChronology56);
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.Chronology chronology60 = julianChronology56.withZone(dateTimeZone59);
        org.joda.time.LocalTime localTime61 = new org.joda.time.LocalTime((long) '#', chronology60);
        org.joda.time.LocalTime localTime63 = localTime61.plusSeconds((int) 'a');
        int[] intArray67 = new int[] { 26, '#', 31 };
        int int68 = offsetDateTimeField46.getMinimumValue((org.joda.time.ReadablePartial) localTime63, intArray67);
        org.joda.time.Months months69 = org.joda.time.Months.TWO;
        org.joda.time.LocalTime localTime70 = localTime63.minus((org.joda.time.ReadablePeriod) months69);
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology72 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone71);
        org.joda.time.DateMidnight dateMidnight73 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology72);
        org.joda.time.DateTimeField dateTimeField74 = gregorianChronology72.weekyearOfCentury();
        org.joda.time.Months months75 = org.joda.time.Months.ONE;
        org.joda.time.DurationFieldType durationFieldType76 = months75.getFieldType();
        int[] intArray78 = gregorianChronology72.get((org.joda.time.ReadablePeriod) months75, (long) 6);
        // The following exception was thrown during execution in test generation
        try {
            julianChronology13.validate((org.joda.time.ReadablePartial) localTime70, intArray78);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
// flaky "3) test1008(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 71 + "'", int24 == 71);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(julianChronology33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "0" + "'", str38, "0");
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(dateTimeFieldType53);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(julianChronology56);
        org.junit.Assert.assertNotNull(chronology57);
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertNotNull(chronology60);
        org.junit.Assert.assertNotNull(localTime63);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertArrayEquals(intArray67, new int[] { 26, 35, 31 });
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(months69);
        org.junit.Assert.assertNotNull(localTime70);
        org.junit.Assert.assertNotNull(gregorianChronology72);
        org.junit.Assert.assertNotNull(dateTimeField74);
        org.junit.Assert.assertNotNull(months75);
        org.junit.Assert.assertNotNull(durationFieldType76);
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertArrayEquals(intArray78, new int[] { 0 });
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
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
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((java.lang.Object) dateTimeZone24, dateTimeZone26);
        int int28 = mutableDateTime27.getRoundingMode();
        mutableInterval10.setEnd((org.joda.time.ReadableInstant) mutableDateTime27);
        mutableDateTime27.addDays(100);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone2);
        org.joda.time.Days days4 = org.joda.time.Days.THREE;
        int[] intArray7 = gregorianChronology3.get((org.joda.time.ReadablePeriod) days4, (long) 0, (-1L));
        org.joda.time.DurationField durationField8 = gregorianChronology3.halfdays();
        org.joda.time.Chronology chronology9 = gregorianChronology3.withUTC();
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.now((org.joda.time.Chronology) gregorianChronology3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval11 = new org.joda.time.Interval((long) 5, 1L, (org.joda.time.Chronology) gregorianChronology3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater than the start instant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 0 });
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localDate10);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
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
        org.joda.time.DurationField durationField21 = gJChronology20.seconds();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology20.dayOfWeek();
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
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime2 = property1.roundFloor();
        mutableDateTime2.addYears((int) (short) 1);
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(mutableDateTime2);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod();
        mutablePeriod0.setHours(5);
        int int3 = mutablePeriod0.getSeconds();
        mutablePeriod0.addSeconds(9);
        org.joda.time.MutableDateTime mutableDateTime6 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.dayOfWeek();
        org.joda.time.Interval interval8 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) mutablePeriod0, (org.joda.time.ReadableInstant) mutableDateTime6);
        mutableDateTime6.addMillis((int) '4');
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology12 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone11);
        org.joda.time.Days days13 = org.joda.time.Days.THREE;
        int[] intArray16 = gregorianChronology12.get((org.joda.time.ReadablePeriod) days13, (long) 0, (-1L));
        org.joda.time.Duration duration17 = days13.toStandardDuration();
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
        boolean boolean32 = duration17.isShorterThan((org.joda.time.ReadableDuration) duration29);
        org.joda.time.Duration duration34 = duration29.plus(90L);
        org.joda.time.Duration duration36 = duration34.withMillis((-1512000000L));
        long long37 = duration34.getMillis();
        mutableDateTime6.add((org.joda.time.ReadableDuration) duration34, 3600);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(gregorianChronology12);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1970 + "'", int21 == 1970);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(gregorianChronology24);
        org.junit.Assert.assertNotNull(days25);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 259200090L + "'", long37 == 259200090L);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.joda.time.JodaTimePermission jodaTimePermission1 = new org.joda.time.JodaTimePermission("00:01:37.035");
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property5 = dateTime3.property(dateTimeFieldType4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone6);
        org.joda.time.Chronology chronology8 = julianChronology7.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType4.getField((org.joda.time.Chronology) julianChronology7);
        java.lang.String str10 = dateTimeFieldType4.toString();
        jodaTimePermission1.checkGuard((java.lang.Object) str10);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(julianChronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hourOfHalfday" + "'", str10, "hourOfHalfday");
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 12);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.minutes();
        org.junit.Assert.assertNotNull(periodType0);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.minutes(6240);
        org.junit.Assert.assertNotNull(minutes1);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.dayOfYear();
        org.joda.time.DateMidnight dateMidnight4 = property3.roundHalfEvenCopy();
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.withYearOfCentury(100);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MonthDay monthDay8 = new org.joda.time.MonthDay((java.lang.Object) dateMidnight4, chronology7);
        org.joda.time.MonthDay.Property property9 = monthDay8.monthOfYear();
        org.joda.time.Period period12 = new org.joda.time.Period((long) 31, (long) 25);
        org.joda.time.MonthDay monthDay13 = monthDay8.minus((org.joda.time.ReadablePeriod) period12);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray14 = monthDay8.getFieldTypes();
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(monthDay13);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray14);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.dayOfYear();
        org.joda.time.DateMidnight dateMidnight4 = property3.roundHalfEvenCopy();
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.withYearOfCentury(100);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight4.withDurationAdded(readableDuration7, 31);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight11 = dateMidnight4.withCenturyOfEra((-4));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -4 for centuryOfEra must be in the range [1,2922790]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(dateMidnight9);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.JulianChronology julianChronology1 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone0);
        org.joda.time.Chronology chronology2 = julianChronology1.withUTC();
        org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay(chronology2);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay3.plusMonths(80);
        int int6 = yearMonthDay3.getDayOfMonth();
        org.junit.Assert.assertNotNull(julianChronology1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property2 = dateTime1.dayOfWeek();
        int int3 = dateTime1.getWeekyear();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime1.plus(readableDuration4);
        org.joda.time.DateTime.Property property6 = dateTime5.era();
        boolean boolean8 = dateTime5.isBefore(26L);
        org.joda.time.DateTimeZone dateTimeZone9 = dateTime5.getZone();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1970 + "'", int3 == 1970);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTimeZone9);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        int int0 = org.joda.time.DateTimeConstants.MINUTES_PER_WEEK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10080 + "'", int0 == 10080);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime dateTime3 = dateTime1.plusMonths(0);
        org.joda.time.DateTime dateTime4 = dateTime1.toDateTimeISO();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property8 = dateTime6.property(dateTimeFieldType7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.chrono.JulianChronology julianChronology10 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone9);
        org.joda.time.Chronology chronology11 = julianChronology10.withUTC();
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType7.getField((org.joda.time.Chronology) julianChronology10);
        org.joda.time.DurationField durationField13 = julianChronology10.halfdays();
        long long14 = durationField13.getUnitMillis();
        boolean boolean15 = dateTime1.equals((java.lang.Object) durationField13);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology18 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone17);
        org.joda.time.Days days19 = org.joda.time.Days.THREE;
        int[] intArray22 = gregorianChronology18.get((org.joda.time.ReadablePeriod) days19, (long) 0, (-1L));
        org.joda.time.DateTimeField dateTimeField23 = gregorianChronology18.dayOfMonth();
        org.joda.time.DurationField durationField24 = gregorianChronology18.millis();
        java.util.Locale locale25 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((long) 26, (org.joda.time.Chronology) gregorianChronology18, locale25);
        org.joda.time.Chronology chronology27 = gregorianChronology18.withUTC();
        org.joda.time.DateTimeField dateTimeField28 = gregorianChronology18.year();
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime((org.joda.time.Chronology) gregorianChronology18);
        org.joda.time.DateTime dateTime30 = dateTime1.withTime(localTime29);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(julianChronology10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 43200000L + "'", long14 == 43200000L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(gregorianChronology18);
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 0 });
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTime30);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod();
        boolean boolean2 = mutablePeriod0.equals((java.lang.Object) (-1L));
        mutablePeriod0.addYears(100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology6 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone5);
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology6);
        org.joda.time.DateMidnight.Property property8 = dateMidnight7.dayOfYear();
        org.joda.time.DateMidnight dateMidnight9 = property8.roundHalfEvenCopy();
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.plusWeeks((int) (byte) 10);
        org.joda.time.Days days12 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType13 = days12.getFieldType();
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight11.withFieldAdded(durationFieldType13, 26);
        mutablePeriod0.add(durationFieldType13, 1);
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
        mutablePeriod0.add((org.joda.time.ReadableInterval) mutableInterval28);
        mutableInterval28.setEndMillis((long) 86400);
        mutableInterval28.setStartMillis((-61565698800000L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology6);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(julianChronology25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(julianChronology30);
        org.junit.Assert.assertNotNull(chronology31);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.printZeroNever();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder0.maximumParsedDigits(2);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = periodFormatterBuilder3.appendWeeks();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder5 = periodFormatterBuilder4.appendSecondsWithOptionalMillis();
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder4);
        org.junit.Assert.assertNotNull(periodFormatterBuilder5);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property4 = dateTime2.property(dateTimeFieldType3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.JulianChronology julianChronology6 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone5);
        org.joda.time.Chronology chronology7 = julianChronology6.withUTC();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType3.getField((org.joda.time.Chronology) julianChronology6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.Chronology chronology10 = julianChronology6.withZone(dateTimeZone9);
        org.joda.time.chrono.StrictChronology strictChronology11 = org.joda.time.chrono.StrictChronology.getInstance(chronology10);
        org.joda.time.format.PeriodFormatter periodFormatter12 = org.joda.time.format.PeriodFormat.wordBased();
        java.util.Locale locale13 = periodFormatter12.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (-86401), chronology10, locale13, (java.lang.Integer) 1440, 7);
        dateTimeParserBucket16.setOffset(23);
        dateTimeParserBucket16.setOffset((int) (byte) 10);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(julianChronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(strictChronology11);
        org.junit.Assert.assertNotNull(periodFormatter12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_CA");
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-61962191999997L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -61962191999997");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
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
        org.joda.time.PeriodType periodType22 = periodType5.withDaysRemoved();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology24 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone23);
        org.joda.time.Days days25 = org.joda.time.Days.THREE;
        int[] intArray28 = gregorianChronology24.get((org.joda.time.ReadablePeriod) days25, (long) 0, (-1L));
        org.joda.time.DateTimeField dateTimeField29 = gregorianChronology24.dayOfMonth();
        org.joda.time.DurationField durationField30 = gregorianChronology24.weeks();
        org.joda.time.DateTime dateTime31 = org.joda.time.DateTime.now((org.joda.time.Chronology) gregorianChronology24);
        org.joda.time.DateTimeField dateTimeField32 = gregorianChronology24.yearOfCentury();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(0L, (long) 1, periodType22, (org.joda.time.Chronology) gregorianChronology24);
        org.joda.time.MutableDateTime mutableDateTime34 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime34.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime36 = property35.roundFloor();
        int int37 = mutableDateTime36.getYear();
        mutableDateTime36.addDays(1969);
        boolean boolean40 = mutablePeriod33.equals((java.lang.Object) mutableDateTime36);
        int[] intArray41 = mutablePeriod33.getValues();
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
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(gregorianChronology24);
        org.junit.Assert.assertNotNull(days25);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 0 });
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(mutableDateTime36);
// flaky "4) test1028(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1970 + "'", int37 == 1970);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] {});
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = ethiopicChronology0.getDateTimeMillis(86400000, 86400000, (int) (byte) -1, 5, 20179, 1975, 3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 20179 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth yearMonth1 = org.joda.time.YearMonth.fromCalendarFields(calendar0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The calendar must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 100, dateTimeZone1);
        boolean boolean4 = localTime2.equals((java.lang.Object) 26);
        int int5 = localTime2.size();
        org.joda.time.LocalTime localTime7 = localTime2.withMillisOfDay((int) (short) 10);
        int int8 = localTime2.getMinuteOfHour();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.ONE;
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.plus((org.joda.time.ReadablePeriod) weeks3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.plusWeeks((int) (short) 100);
        org.joda.time.DateMidnight.Property property7 = dateMidnight6.weekyear();
        org.joda.time.DateMidnight dateMidnight8 = property7.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateMidnight8);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
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
        org.joda.time.Chronology chronology20 = instant4.getChronology();
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
        org.junit.Assert.assertNotNull(chronology20);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.DateMidnight.Property property4 = dateMidnight3.dayOfYear();
        org.joda.time.DateMidnight dateMidnight5 = property4.roundHalfEvenCopy();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.withYearOfCentury(100);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight5.withDurationAdded(readableDuration8, 31);
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = org.joda.time.format.ISODateTimeFormat.dateHourMinuteSecondFraction();
        boolean boolean14 = dateTimeZone12.equals((java.lang.Object) dateTimeFormatter13);
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight10.withZoneRetainFields(dateTimeZone12);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) 80, dateTimeZone12);
        org.joda.time.YearMonth yearMonth17 = org.joda.time.YearMonth.now(dateTimeZone12);
        long long19 = dateTimeZone12.nextTransition(0L);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(yearMonth17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.Days days2 = org.joda.time.Days.THREE;
        int[] intArray5 = gregorianChronology1.get((org.joda.time.ReadablePeriod) days2, (long) 0, (-1L));
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology1.dayOfMonth();
        org.joda.time.DurationField durationField7 = gregorianChronology1.eras();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology1.era();
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology1.dayOfMonth();
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0 });
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.joda.time.format.PeriodFormatter periodFormatter0 = org.joda.time.format.ISOPeriodFormat.alternateExtendedWithWeeks();
        org.joda.time.format.PeriodParser periodParser1 = periodFormatter0.getParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period3 = periodFormatter0.parsePeriod("minuteOfHour");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"minuteOfHour\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodFormatter0);
        org.junit.Assert.assertNotNull(periodParser1);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime.Property property1 = localTime0.hourOfDay();
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(property1);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        int int0 = org.joda.time.DateTimeConstants.TUESDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.joda.time.Instant instant1 = org.joda.time.Instant.ofEpochMilli((long) 1000);
        org.junit.Assert.assertNotNull(instant1);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate();
        org.joda.time.Days days3 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType4 = days3.getFieldType();
        org.joda.time.LocalDate localDate6 = localDate2.withFieldAdded(durationFieldType4, 1);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtCurrentTime(dateTimeZone7);
        org.joda.time.Chronology chronology9 = localDate2.getChronology();
        org.joda.time.Period period10 = new org.joda.time.Period((long) (-19), (-3600000L), chronology9);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        java.lang.Object obj0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(obj0);
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.junit.Assert.assertNotNull(chronology2);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.Days days2 = org.joda.time.Days.THREE;
        int[] intArray5 = gregorianChronology1.get((org.joda.time.ReadablePeriod) days2, (long) 0, (-1L));
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology1.dayOfMonth();
        org.joda.time.DurationField durationField7 = gregorianChronology1.weeks();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology9 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone8);
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology9);
        org.joda.time.DateMidnight.Property property11 = dateMidnight10.dayOfYear();
        org.joda.time.DateMidnight dateMidnight12 = property11.roundHalfEvenCopy();
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight12.withYearOfCentury(100);
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.Instant instant16 = gJChronology15.getGregorianCutover();
        org.joda.time.DurationField durationField17 = gJChronology15.seconds();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology19 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone18);
        org.joda.time.Days days20 = org.joda.time.Days.THREE;
        int[] intArray23 = gregorianChronology19.get((org.joda.time.ReadablePeriod) days20, (long) 0, (-1L));
        org.joda.time.DateTimeField dateTimeField24 = gregorianChronology19.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField25 = gregorianChronology19.monthOfYear();
        int int26 = gregorianChronology19.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeZone dateTimeZone27 = gregorianChronology19.getZone();
        org.joda.time.Chronology chronology28 = gJChronology15.withZone(dateTimeZone27);
        org.joda.time.MutableDateTime mutableDateTime29 = dateMidnight12.toMutableDateTime(dateTimeZone27);
        org.joda.time.Chronology chronology30 = gregorianChronology1.withZone(dateTimeZone27);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0 });
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(gregorianChronology9);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(gJChronology15);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(gregorianChronology19);
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 0 });
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(chronology30);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusHours((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.dayOfYear();
        org.joda.time.LocalDateTime.Property property5 = localDateTime3.dayOfMonth();
        int int6 = localDateTime3.getEra();
        org.joda.time.LocalDateTime.Property property7 = localDateTime3.era();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime3.minusMinutes(3);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusSeconds(39);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.joda.time.Days days0 = org.joda.time.Days.THREE;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property3.getFieldType();
        boolean boolean5 = days0.equals((java.lang.Object) property3);
        org.joda.time.DateTime dateTime6 = property3.getDateTime();
        org.joda.time.DateTime dateTime7 = property3.getDateTime();
        java.lang.String str8 = property3.toString();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Property[dayOfWeek]" + "'", str8, "Property[dayOfWeek]");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
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
        org.joda.time.YearMonthDay yearMonthDay23 = yearMonthDay21.minusMonths(4);
        org.joda.time.YearMonthDay yearMonthDay25 = yearMonthDay23.plusMonths(25);
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
        org.junit.Assert.assertNotNull(yearMonthDay23);
        org.junit.Assert.assertNotNull(yearMonthDay25);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
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
        org.joda.time.Instant instant11 = dateMidnight2.toInstant();
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(property3);
// flaky "5) test1046(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(instant11);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.hourMinuteSecondFraction();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((-35), 19, (int) (short) 100, (int) (byte) 100, 25, 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(0, (int) '#', 3, 23);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.LocalDate localDate3 = localDate0.plusDays(20179);
        org.joda.time.LocalDate.Property property4 = localDate0.year();
        org.joda.time.LocalDate localDate6 = property4.addToCopy(5999999);
        org.joda.time.LocalDate localDate7 = property4.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate8 = property4.withMinimumValue();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.junit.Assert.assertNotNull(days0);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicWeekDateTimeNoMillis();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
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
        java.lang.String str36 = scaledDurationField35.getName();
        long long37 = scaledDurationField35.getUnitMillis();
        org.joda.time.DurationFieldType durationFieldType38 = scaledDurationField35.getType();
        long long40 = scaledDurationField35.getValueAsLong((long) 80);
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(gregorianChronology7);
        org.junit.Assert.assertNotNull(gregorianChronology10);
        org.junit.Assert.assertNotNull(dateTimeField12);
// flaky "6) test1053(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 71 + "'", int13 == 71);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(julianChronology23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "0" + "'", str30, "0");
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(days32);
        org.junit.Assert.assertNotNull(durationFieldType33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "days" + "'", str36, "days");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 4544201088000000L + "'", long37 == 4544201088000000L);
        org.junit.Assert.assertNotNull(durationFieldType38);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.setDayOfYear(8);
        int int3 = mutableDateTime0.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime0.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfCeiling();
        org.joda.time.DateTimeField dateTimeField6 = property4.getField();
        org.junit.Assert.assertNotNull(mutableDateTime0);
// flaky "7) test1054(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 70 + "'", int3 == 70);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.LocalDate localDate3 = localDate0.plusDays(20179);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra(5999999);
        org.joda.time.LocalDate localDate7 = localDate3.plusYears((int) (byte) -1);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusMinutes((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusWeeks(1970);
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusMinutes((int) (byte) 100);
        org.joda.time.Hours hours10 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadablePartial) localDateTime5, (org.joda.time.ReadablePartial) localDateTime7);
        int int11 = localDateTime5.size();
        org.joda.time.LocalDateTime.Property property12 = localDateTime5.millisOfDay();
        org.joda.time.LocalDateTime localDateTime13 = property12.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int15 = localDateTime13.get(dateTimeFieldType14);
        java.lang.String str16 = dateTimeFieldType14.getName();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 39 + "'", int15 == 39);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "minuteOfHour" + "'", str16, "minuteOfHour");
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.Instant instant1 = gJChronology0.getGregorianCutover();
        org.joda.time.DurationField durationField2 = gJChronology0.seconds();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone3);
        org.joda.time.Days days5 = org.joda.time.Days.THREE;
        int[] intArray8 = gregorianChronology4.get((org.joda.time.ReadablePeriod) days5, (long) 0, (-1L));
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology4.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology4.monthOfYear();
        int int11 = gregorianChronology4.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeZone dateTimeZone12 = gregorianChronology4.getZone();
        org.joda.time.Chronology chronology13 = gJChronology0.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField14 = gJChronology0.years();
        org.joda.time.DurationField durationField15 = gJChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology0.centuryOfEra();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(gregorianChronology4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 0 });
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Days days1 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType2 = days1.getFieldType();
        org.joda.time.LocalDate localDate4 = localDate0.withFieldAdded(durationFieldType2, 1);
        int int5 = localDate4.getYear();
        int int6 = localDate4.getEra();
        boolean boolean7 = org.joda.time.DateTimeUtils.isContiguous((org.joda.time.ReadablePartial) localDate4);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(localDate4);
// flaky "8) test1059(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1970 + "'", int5 == 1970);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.joda.time.YearMonth yearMonth1 = new org.joda.time.YearMonth(101L);
        org.joda.time.Weeks weeks2 = org.joda.time.Weeks.ZERO;
        org.joda.time.YearMonth yearMonth3 = yearMonth1.plus((org.joda.time.ReadablePeriod) weeks2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone4);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology5);
        org.joda.time.Weeks weeks7 = org.joda.time.Weeks.ONE;
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight6.plus((org.joda.time.ReadablePeriod) weeks7);
        int int9 = weeks7.getWeeks();
        org.joda.time.Weeks weeks10 = weeks2.minus(weeks7);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(yearMonth3);
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(weeks10);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property5 = dateTime3.property(dateTimeFieldType4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone6);
        org.joda.time.Chronology chronology8 = julianChronology7.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType4.getField((org.joda.time.Chronology) julianChronology7);
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology7);
        org.joda.time.DateTime dateTime11 = mutableInterval10.getStart();
        org.joda.time.MutableDateTime mutableDateTime12 = org.joda.time.MutableDateTime.now();
        mutableDateTime12.addMonths((int) (short) 100);
        mutableDateTime12.setMillis((long) (byte) 1);
        java.lang.String str17 = mutableDateTime12.toString();
        org.joda.time.Instant instant18 = mutableDateTime12.toInstant();
        boolean boolean19 = mutableInterval10.contains((org.joda.time.ReadableInstant) instant18);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(julianChronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1970-01-01T00:00:00.001Z" + "'", str17, "1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(instant18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
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
        org.joda.time.TimeOfDay.Property property24 = timeOfDay18.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay26 = property24.addNoWrapToCopy(604800000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Maximum value exceeded for add");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(property24);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth yearMonth1 = org.joda.time.YearMonth.fromDateFields(date0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullTime();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone2);
        org.joda.time.Chronology chronology4 = julianChronology3.withUTC();
        java.util.Locale locale5 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, (org.joda.time.Chronology) julianChronology3, locale5);
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property9 = dateTime8.dayOfWeek();
        int int10 = dateTime8.getWeekyear();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.plus(readableDuration11);
        org.joda.time.DateTime.Property property13 = dateTime12.era();
        boolean boolean14 = dateTimeParserBucket6.restoreState((java.lang.Object) property13);
        org.joda.time.DateTimeZone dateTimeZone15 = dateTimeParserBucket6.getZone();
        org.joda.time.DateTimeZone dateTimeZone16 = dateTimeParserBucket6.getZone();
        java.lang.String str17 = dateTimeZone16.getID();
        org.joda.time.chrono.GregorianChronology gregorianChronology18 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.chrono.JulianChronology julianChronology20 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone19);
        org.joda.time.MonthDay monthDay21 = org.joda.time.MonthDay.now((org.joda.time.Chronology) julianChronology20);
        org.joda.time.DateTimeZone dateTimeZone22 = julianChronology20.getZone();
        long long24 = dateTimeZone16.getMillisKeepLocal(dateTimeZone22, 259200000L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter0.withZone(dateTimeZone22);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology26 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone22);
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType27 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_15_BASED;
        org.joda.time.chrono.IslamicChronology islamicChronology28 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone22, leapYearPatternType27);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1970 + "'", int10 == 1970);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertNotNull(gregorianChronology18);
        org.junit.Assert.assertNotNull(julianChronology20);
        org.junit.Assert.assertNotNull(monthDay21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 259200000L + "'", long24 == 259200000L);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(ethiopicChronology26);
        org.junit.Assert.assertNotNull(leapYearPatternType27);
        org.junit.Assert.assertNotNull(islamicChronology28);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property2 = dateTime1.dayOfWeek();
        int int3 = dateTime1.getWeekyear();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime1.plus(readableDuration4);
        org.joda.time.DateTime dateTime7 = dateTime5.minusMillis((-1));
        int int8 = dateTime5.getSecondOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1970 + "'", int3 == 1970);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
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
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology14 = localDate13.getChronology();
        org.joda.time.LocalDate localDate16 = localDate13.plusDays(20179);
        org.joda.time.LocalDate localDate18 = localDate16.withMonthOfYear(7);
        int int19 = localDate16.getYearOfCentury();
        int[] intArray21 = strictChronology10.get((org.joda.time.ReadablePartial) localDate16, (long) 20179);
        org.joda.time.DurationField durationField22 = strictChronology10.weekyears();
        // The following exception was thrown during execution in test generation
        try {
            long long28 = strictChronology10.getDateTimeMillis((long) 31, (int) ' ', (-19), 2, 10080);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(julianChronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(strictChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
// flaky "9) test1066(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 25 + "'", int19 == 25);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 1969, 12, 19 });
        org.junit.Assert.assertNotNull(durationField22);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property4 = dateTime2.property(dateTimeFieldType3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.JulianChronology julianChronology6 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone5);
        org.joda.time.Chronology chronology7 = julianChronology6.withUTC();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType3.getField((org.joda.time.Chronology) julianChronology6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.Chronology chronology10 = julianChronology6.withZone(dateTimeZone9);
        org.joda.time.chrono.StrictChronology strictChronology11 = org.joda.time.chrono.StrictChronology.getInstance(chronology10);
        org.joda.time.format.PeriodFormatter periodFormatter12 = org.joda.time.format.PeriodFormat.wordBased();
        java.util.Locale locale13 = periodFormatter12.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (-86401), chronology10, locale13, (java.lang.Integer) 1440, 7);
        dateTimeParserBucket16.setOffset(23);
        java.util.Locale locale19 = dateTimeParserBucket16.getLocale();
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(julianChronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(strictChronology11);
        org.junit.Assert.assertNotNull(periodFormatter12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_CA");
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
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
        java.lang.Integer int14 = dateTimeParserBucket5.getPivotYear();
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(int14);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) 19, 2746894413240000000L);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property5 = dateTime4.dayOfWeek();
        int int6 = dateTime4.getWeekyear();
        int int7 = dateTime4.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology9 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone8);
        org.joda.time.Days days10 = org.joda.time.Days.THREE;
        int[] intArray13 = gregorianChronology9.get((org.joda.time.ReadablePeriod) days10, (long) 0, (-1L));
        org.joda.time.Duration duration14 = days10.toStandardDuration();
        org.joda.time.DateTime dateTime16 = dateTime4.withDurationAdded((org.joda.time.ReadableDuration) duration14, 26);
        org.joda.time.Duration duration18 = duration14.multipliedBy((long) (short) 1);
        boolean boolean19 = duration2.isEqual((org.joda.time.ReadableDuration) duration18);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(gregorianChronology9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property5 = dateTime3.property(dateTimeFieldType4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone6);
        org.joda.time.Chronology chronology8 = julianChronology7.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType4.getField((org.joda.time.Chronology) julianChronology7);
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology7);
        org.joda.time.DateTime dateTime11 = mutableInterval10.getStart();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusHours((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.dayOfYear();
        org.joda.time.LocalDateTime.Property property17 = localDateTime15.dayOfMonth();
        int int18 = localDateTime15.getEra();
        int int19 = localDateTime15.getCenturyOfEra();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime dateTime23 = dateTime21.withDayOfMonth((int) (byte) 1);
        org.joda.time.Instant instant24 = dateTime23.toInstant();
        org.joda.time.Duration duration26 = org.joda.time.Duration.standardDays((long) 8);
        org.joda.time.Instant instant27 = instant24.minus((org.joda.time.ReadableDuration) duration26);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property30 = dateTime29.dayOfWeek();
        int int31 = dateTime29.getWeekyear();
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.DateTime dateTime33 = dateTime29.plus(readableDuration32);
        org.joda.time.DateTime.Property property34 = dateTime33.era();
        boolean boolean36 = dateTime33.isBefore(26L);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property39 = dateTime38.dayOfWeek();
        int int40 = dateTime38.getWeekyear();
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.DateTime dateTime42 = dateTime38.plus(readableDuration41);
        org.joda.time.DateTime.Property property43 = dateTime42.era();
        boolean boolean45 = dateTime42.isBefore(26L);
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.Chronology chronology47 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime42, readableInstant46);
        boolean boolean48 = dateTime33.isBefore(readableInstant46);
        org.joda.time.Duration duration49 = new org.joda.time.Duration((java.lang.Object) readableInstant46);
        boolean boolean50 = duration26.isLongerThan((org.joda.time.ReadableDuration) duration49);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime15.minus((org.joda.time.ReadableDuration) duration26);
        mutableInterval10.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration26);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(julianChronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 19 + "'", int19 == 19);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(instant27);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1970 + "'", int31 == 1970);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1970 + "'", int40 == 1970);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(localDateTime51);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.LocalDate localDate3 = localDate0.plusDays(20179);
        java.lang.String str4 = localDate3.toString();
        org.joda.time.LocalDate localDate6 = localDate3.withWeekOfWeekyear(50);
        org.joda.time.LocalDate localDate8 = localDate3.minusYears(82799999);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(localDate3);
// flaky "10) test1071(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2025-04-01" + "'", str4, "2025-04-01");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Days days1 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType2 = days1.getFieldType();
        org.joda.time.LocalDate localDate4 = localDate0.withFieldAdded(durationFieldType2, 1);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray7 = localDate0.getFieldTypes();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate10 = localDate8.withYearOfEra(10);
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
        org.joda.time.DateTime dateTime26 = localDate8.toDateTimeAtCurrentTime(dateTimeZone25);
        org.joda.time.DateTime dateTime27 = org.joda.time.DateTime.now(dateTimeZone25);
        org.joda.time.LocalDate localDate28 = dateTime27.toLocalDate();
        int int29 = localDate0.compareTo((org.joda.time.ReadablePartial) localDate28);
        org.joda.time.LocalDate.Property property30 = localDate28.yearOfEra();
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray7);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(julianChronology13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1970 + "'", int20 == 1970);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(property30);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.joda.time.Days days0 = org.joda.time.Days.THREE;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property3.getFieldType();
        boolean boolean5 = days0.equals((java.lang.Object) property3);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = property3.getFieldType();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime dateTime10 = dateTime8.withYear((-35));
        org.joda.time.DateTime dateTime12 = dateTime8.plusMillis(1970);
        int int13 = property3.compareTo((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.Chronology chronology14 = dateTime12.getChronology();
        org.joda.time.DateTime dateTime16 = dateTime12.minusYears((int) (byte) 0);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone1);
        org.joda.time.Days days3 = org.joda.time.Days.THREE;
        int[] intArray6 = gregorianChronology2.get((org.joda.time.ReadablePeriod) days3, (long) 0, (-1L));
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology2.dayOfMonth();
        org.joda.time.DurationField durationField8 = gregorianChronology2.millis();
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) 26, (org.joda.time.Chronology) gregorianChronology2, locale9);
        org.joda.time.Chronology chronology11 = gregorianChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology2.year();
        org.joda.time.DateTimeField dateTimeField13 = gregorianChronology2.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField15 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField13, dateTimeFieldType14);
        long long18 = zeroIsMaxDateTimeField15.addWrapField(4544201088000000L, (-35));
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0 });
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 4544201174399965L + "'", long18 == 4544201174399965L);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property3 = dateTime1.property(dateTimeFieldType2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.JulianChronology julianChronology5 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone4);
        org.joda.time.Chronology chronology6 = julianChronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType2.getField((org.joda.time.Chronology) julianChronology5);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeField7.getAsShortText((int) (byte) 0, locale9);
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
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property32 = dateTime30.property(dateTimeFieldType31);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.chrono.JulianChronology julianChronology34 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone33);
        org.joda.time.Chronology chronology35 = julianChronology34.withUTC();
        org.joda.time.DateTimeField dateTimeField36 = dateTimeFieldType31.getField((org.joda.time.Chronology) julianChronology34);
        org.joda.time.MutableInterval mutableInterval37 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology34);
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((long) (short) -1, (org.joda.time.Chronology) julianChronology34);
        java.util.Locale locale40 = null;
        java.lang.String str41 = skipDateTimeField25.getAsText((org.joda.time.ReadablePartial) localDateTime38, 0, locale40);
        org.joda.time.DurationField durationField42 = skipDateTimeField25.getRangeDurationField();
        org.joda.time.Days days43 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType44 = days43.getFieldType();
        org.joda.time.field.ScaledDurationField scaledDurationField46 = new org.joda.time.field.ScaledDurationField(durationField42, durationFieldType44, 1440);
        long long48 = durationField42.getValueAsLong((long) 9);
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField51 = new org.joda.time.field.DividedDateTimeField(dateTimeField7, durationField42, dateTimeFieldType49, 19);
        org.joda.time.DurationFieldType durationFieldType52 = durationField42.getType();
        long long55 = durationField42.add(31L, 1969);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(julianChronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(julianChronology13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(gregorianChronology18);
        org.junit.Assert.assertNotNull(gregorianChronology21);
        org.junit.Assert.assertNotNull(dateTimeField23);
// flaky "11) test1075(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 71 + "'", int24 == 71);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(julianChronology34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "0" + "'", str41, "0");
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertNotNull(days43);
        org.junit.Assert.assertNotNull(durationFieldType44);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertNotNull(dateTimeFieldType49);
        org.junit.Assert.assertNotNull(durationFieldType52);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 6213563913600031L + "'", long55 == 6213563913600031L);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
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
        org.joda.time.chrono.GJChronology gJChronology22 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.Instant instant23 = gJChronology22.getGregorianCutover();
        org.joda.time.DurationField durationField24 = gJChronology22.seconds();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology26 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone25);
        org.joda.time.Days days27 = org.joda.time.Days.THREE;
        int[] intArray30 = gregorianChronology26.get((org.joda.time.ReadablePeriod) days27, (long) 0, (-1L));
        org.joda.time.DateTimeField dateTimeField31 = gregorianChronology26.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField32 = gregorianChronology26.monthOfYear();
        int int33 = gregorianChronology26.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeZone dateTimeZone34 = gregorianChronology26.getZone();
        org.joda.time.Chronology chronology35 = gJChronology22.withZone(dateTimeZone34);
        org.joda.time.DateTime dateTime36 = yearMonthDay19.toDateTimeAtCurrentTime(dateTimeZone34);
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
        org.junit.Assert.assertNotNull(gJChronology22);
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(gregorianChronology26);
        org.junit.Assert.assertNotNull(days27);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 0 });
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTime36);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicTTimeNoMillis();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property2 = dateTime1.dayOfWeek();
        int int3 = dateTime1.getWeekyear();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime1.plus(readableDuration4);
        org.joda.time.DateTime.Property property6 = dateTime5.minuteOfDay();
        org.joda.time.Hours hours7 = org.joda.time.Hours.TWO;
        org.joda.time.DateTime dateTime9 = dateTime5.withPeriodAdded((org.joda.time.ReadablePeriod) hours7, (int) (byte) 1);
        org.joda.time.Hours hours11 = hours7.plus(0);
        org.joda.time.Hours hours13 = hours11.multipliedBy(2070);
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.halfdays();
        int int15 = hours11.get(durationFieldType14);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1970 + "'", int3 == 1970);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(hours7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(hours11);
        org.junit.Assert.assertNotNull(hours13);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property2 = dateTime1.dayOfWeek();
        int int3 = dateTime1.getWeekyear();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime1.plus(readableDuration4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.Days days8 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType9 = days8.getFieldType();
        org.joda.time.PeriodType periodType10 = days8.getPeriodType();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property16 = dateTime14.property(dateTimeFieldType15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.chrono.JulianChronology julianChronology18 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone17);
        org.joda.time.Chronology chronology19 = julianChronology18.withUTC();
        org.joda.time.DateTimeField dateTimeField20 = dateTimeFieldType15.getField((org.joda.time.Chronology) julianChronology18);
        org.joda.time.MutableInterval mutableInterval21 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology18);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.chrono.JulianChronology julianChronology23 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone22);
        org.joda.time.Chronology chronology24 = julianChronology23.withUTC();
        mutableInterval21.setChronology((org.joda.time.Chronology) julianChronology23);
        org.joda.time.Period period26 = new org.joda.time.Period((long) (byte) 0, periodType10, (org.joda.time.Chronology) julianChronology23);
        org.joda.time.Days days27 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType28 = days27.getFieldType();
        org.joda.time.PeriodType periodType29 = days27.getPeriodType();
        boolean boolean30 = periodType10.equals((java.lang.Object) periodType29);
        org.joda.time.Period period31 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime5, readableDuration6, periodType10);
        org.joda.time.DurationFieldType durationFieldType32 = org.joda.time.DurationFieldType.eras();
        boolean boolean33 = periodType10.isSupported(durationFieldType32);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1970 + "'", int3 == 1970);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(julianChronology18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(julianChronology23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(days27);
        org.junit.Assert.assertNotNull(durationFieldType28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(durationFieldType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone4);
        org.joda.time.Days days6 = org.joda.time.Days.THREE;
        int[] intArray9 = gregorianChronology5.get((org.joda.time.ReadablePeriod) days6, (long) 0, (-1L));
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology5.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((-20274), 2025, 32, 70, (org.joda.time.Chronology) gregorianChronology5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -20274 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 0 });
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
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
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property19 = dateTime18.dayOfWeek();
        int int20 = dateTime18.getWeekyear();
        int int21 = dateTime18.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology23 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone22);
        org.joda.time.Days days24 = org.joda.time.Days.THREE;
        int[] intArray27 = gregorianChronology23.get((org.joda.time.ReadablePeriod) days24, (long) 0, (-1L));
        org.joda.time.Duration duration28 = days24.toStandardDuration();
        org.joda.time.DateTime dateTime30 = dateTime18.withDurationAdded((org.joda.time.ReadableDuration) duration28, 26);
        org.joda.time.Duration duration32 = duration28.multipliedBy((long) (short) 1);
        org.joda.time.Duration duration33 = duration32.toDuration();
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property36 = dateTime35.dayOfWeek();
        org.joda.time.format.PeriodFormatter periodFormatter37 = org.joda.time.format.ISOPeriodFormat.alternateExtended();
        org.joda.time.PeriodType periodType38 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.format.PeriodFormatter periodFormatter39 = periodFormatter37.withParseType(periodType38);
        org.joda.time.Period period40 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration32, (org.joda.time.ReadableInstant) dateTime35, periodType38);
        java.lang.String str41 = dateTime35.toString();
        org.joda.time.format.PeriodFormatter periodFormatter43 = org.joda.time.format.PeriodFormat.wordBased();
        java.util.Locale locale44 = periodFormatter43.getLocale();
        java.lang.String str45 = dateTime35.toString("00:01:37.035", locale44);
        long long46 = skipDateTimeField14.set((long) 32, "60", locale44);
        int int47 = skipDateTimeField14.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime49.plusMinutes((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.minusWeeks(1970);
        org.joda.time.DateTime dateTime54 = localDateTime51.toDateTime();
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property59 = dateTime57.property(dateTimeFieldType58);
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.chrono.JulianChronology julianChronology61 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone60);
        org.joda.time.Chronology chronology62 = julianChronology61.withUTC();
        org.joda.time.DateTimeField dateTimeField63 = dateTimeFieldType58.getField((org.joda.time.Chronology) julianChronology61);
        org.joda.time.DurationField durationField64 = julianChronology61.halfdays();
        org.joda.time.Period period67 = new org.joda.time.Period((long) 31, (long) 25);
        int[] intArray69 = julianChronology61.get((org.joda.time.ReadablePeriod) period67, (-1924473598031L));
        int[] intArray71 = skipDateTimeField14.addWrapPartial((org.joda.time.ReadablePartial) localDateTime51, 0, intArray69, (int) ' ');
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(gregorianChronology7);
        org.junit.Assert.assertNotNull(gregorianChronology10);
        org.junit.Assert.assertNotNull(dateTimeField12);
// flaky "12) test1081(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 71 + "'", int13 == 71);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1970 + "'", int20 == 1970);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(gregorianChronology23);
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(periodFormatter37);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(periodFormatter39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "1970-01-01T00:00:00.001Z" + "'", str41, "1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(periodFormatter43);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "00:01:37.035" + "'", str45, "00:01:37.035");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-347155199968L) + "'", long46 == (-347155199968L));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTimeFieldType58);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(julianChronology61);
        org.junit.Assert.assertNotNull(chronology62);
        org.junit.Assert.assertNotNull(dateTimeField63);
        org.junit.Assert.assertNotNull(durationField64);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertArrayEquals(intArray69, new int[] { 32, 1, 1, 0, (-23), (-59), (-58), (-31) });
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertArrayEquals(intArray71, new int[] { 32, 1, 1, 0, (-23), (-59), (-58), (-31) });
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
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
        org.joda.time.format.PeriodFormatter periodFormatter14 = org.joda.time.format.PeriodFormat.wordBased();
        java.util.Locale locale15 = periodFormatter14.getLocale();
        java.lang.String str16 = property11.getAsText(locale15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay18 = property11.setCopy(1000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1000 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(date5);
// flaky "13) test1082(RegressionTest2)":         org.junit.Assert.assertEquals(date5.toString(), "Wed Dec 31 19:00:00 EST 1969");
        org.junit.Assert.assertNotNull(yearMonthDay6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(yearMonthDay12);
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertNotNull(periodFormatter14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_CA");
// flaky "1) test1082(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "December" + "'", str16, "December");
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Days days1 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType2 = days1.getFieldType();
        org.joda.time.LocalDate localDate4 = localDate0.withFieldAdded(durationFieldType2, 1);
        org.joda.time.LocalDate.Property property5 = localDate4.era();
        org.joda.time.LocalDate localDate6 = property5.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = property5.setCopy((-292275054));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.joda.time.Days days0 = org.joda.time.Days.THREE;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property3.getFieldType();
        boolean boolean5 = days0.equals((java.lang.Object) property3);
        org.joda.time.DateTime dateTime6 = property3.getDateTime();
        org.joda.time.DateTime dateTime7 = property3.getDateTime();
        org.joda.time.DateTime dateTime9 = dateTime7.plusMillis(59);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.JulianChronology julianChronology1 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone0);
        org.joda.time.Chronology chronology2 = julianChronology1.withUTC();
        org.joda.time.DurationField durationField3 = julianChronology1.weekyears();
        org.joda.time.Chronology chronology4 = julianChronology1.withUTC();
        org.junit.Assert.assertNotNull(julianChronology1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusMinutes((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusWeeks(1970);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusMinutes(2);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withYearOfCentury(7);
        org.joda.time.DateTime dateTime10 = localDateTime9.toDateTime();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod();
        mutablePeriod0.setHours(5);
        int int3 = mutablePeriod0.getSeconds();
        mutablePeriod0.addSeconds(9);
        org.joda.time.MutableDateTime mutableDateTime6 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.dayOfWeek();
        org.joda.time.Interval interval8 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) mutablePeriod0, (org.joda.time.ReadableInstant) mutableDateTime6);
        org.joda.time.MutableInterval mutableInterval9 = interval8.toMutableInterval();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableInterval9);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone4);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology5);
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(9, 1, 5, 5, (org.joda.time.Chronology) gregorianChronology5);
        org.joda.time.TimeOfDay.Property property8 = timeOfDay7.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay10 = property8.addNoWrapToCopy(1969);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay12 = property8.setCopy("DateTimeField[weekyearOfCentury]");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"DateTimeField[weekyearOfCentury]\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(timeOfDay10);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.Days days2 = org.joda.time.Days.THREE;
        int[] intArray5 = gregorianChronology1.get((org.joda.time.ReadablePeriod) days2, (long) 0, (-1L));
        java.lang.String str6 = gregorianChronology1.toString();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology1.year();
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0 });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GregorianChronology[UTC]" + "'", str6, "GregorianChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateTime();
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = dateTimeFormatter0.getPrinter();
        java.lang.StringBuffer stringBuffer2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology4 = localDate3.getChronology();
        org.joda.time.LocalDate localDate6 = localDate3.plusDays(20179);
        java.lang.String str7 = localDate6.toString();
        org.joda.time.LocalDate localDate9 = localDate6.withWeekOfWeekyear(50);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.chrono.JulianChronology julianChronology12 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone11);
        org.joda.time.Chronology chronology13 = julianChronology12.withUTC();
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, (org.joda.time.Chronology) julianChronology12, locale14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology17 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone16);
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology20 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone19);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology20);
        org.joda.time.DateTimeField dateTimeField22 = gregorianChronology20.weekyearOfCentury();
        int int23 = dateMidnight18.get(dateTimeField22);
        org.joda.time.field.SkipDateTimeField skipDateTimeField24 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) julianChronology12, dateTimeField22);
        int int26 = skipDateTimeField24.getMaximumValue(101L);
        long long29 = skipDateTimeField24.set((long) 1969, (int) (byte) 10);
        java.lang.String str31 = skipDateTimeField24.getAsShortText((long) 2);
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.plusHours((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.dayOfYear();
        org.joda.time.LocalDateTime.Property property37 = localDateTime35.dayOfMonth();
        int int38 = localDateTime35.getEra();
        org.joda.time.LocalDateTime.Property property39 = localDateTime35.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.chrono.JulianChronology julianChronology42 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone41);
        org.joda.time.Chronology chronology43 = julianChronology42.withUTC();
        java.util.Locale locale44 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket45 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, (org.joda.time.Chronology) julianChronology42, locale44);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology47 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone46);
        org.joda.time.DateMidnight dateMidnight48 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology47);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology50 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone49);
        org.joda.time.DateMidnight dateMidnight51 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology50);
        org.joda.time.DateTimeField dateTimeField52 = gregorianChronology50.weekyearOfCentury();
        int int53 = dateMidnight48.get(dateTimeField52);
        org.joda.time.field.SkipDateTimeField skipDateTimeField54 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) julianChronology42, dateTimeField52);
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property59 = dateTime58.dayOfWeek();
        int int60 = dateTime58.getWeekyear();
        int int61 = dateTime58.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology63 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone62);
        org.joda.time.Days days64 = org.joda.time.Days.THREE;
        int[] intArray67 = gregorianChronology63.get((org.joda.time.ReadablePeriod) days64, (long) 0, (-1L));
        org.joda.time.Duration duration68 = days64.toStandardDuration();
        org.joda.time.DateTime dateTime70 = dateTime58.withDurationAdded((org.joda.time.ReadableDuration) duration68, 26);
        org.joda.time.Duration duration72 = duration68.multipliedBy((long) (short) 1);
        org.joda.time.Duration duration73 = duration72.toDuration();
        org.joda.time.DateTime dateTime75 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property76 = dateTime75.dayOfWeek();
        org.joda.time.format.PeriodFormatter periodFormatter77 = org.joda.time.format.ISOPeriodFormat.alternateExtended();
        org.joda.time.PeriodType periodType78 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.format.PeriodFormatter periodFormatter79 = periodFormatter77.withParseType(periodType78);
        org.joda.time.Period period80 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration72, (org.joda.time.ReadableInstant) dateTime75, periodType78);
        java.lang.String str81 = dateTime75.toString();
        org.joda.time.format.PeriodFormatter periodFormatter83 = org.joda.time.format.PeriodFormat.wordBased();
        java.util.Locale locale84 = periodFormatter83.getLocale();
        java.lang.String str85 = dateTime75.toString("00:01:37.035", locale84);
        long long86 = skipDateTimeField54.set((long) 32, "60", locale84);
        java.lang.String str87 = skipDateTimeField24.getAsShortText((org.joda.time.ReadablePartial) localDateTime35, locale84);
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter1.printTo(stringBuffer2, (org.joda.time.ReadablePartial) localDate9, locale84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimePrinter1);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(localDate6);
// flaky "14) test1090(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2025-04-01" + "'", str7, "2025-04-01");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(julianChronology12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(gregorianChronology17);
        org.junit.Assert.assertNotNull(gregorianChronology20);
        org.junit.Assert.assertNotNull(dateTimeField22);
// flaky "2) test1090(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 71 + "'", int23 == 71);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1924473598031L) + "'", long29 == (-1924473598031L));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "71" + "'", str31, "71");
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(julianChronology42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(gregorianChronology47);
        org.junit.Assert.assertNotNull(gregorianChronology50);
        org.junit.Assert.assertNotNull(dateTimeField52);
// flaky "1) test1090(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int53 + "' != '" + 71 + "'", int53 == 71);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1970 + "'", int60 == 1970);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(gregorianChronology63);
        org.junit.Assert.assertNotNull(days64);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertArrayEquals(intArray67, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration68);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertNotNull(duration72);
        org.junit.Assert.assertNotNull(duration73);
        org.junit.Assert.assertNotNull(property76);
        org.junit.Assert.assertNotNull(periodFormatter77);
        org.junit.Assert.assertNotNull(periodType78);
        org.junit.Assert.assertNotNull(periodFormatter79);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "1970-01-01T00:00:00.001Z" + "'", str81, "1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(periodFormatter83);
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "00:01:37.035" + "'", str85, "00:01:37.035");
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + (-347155199968L) + "'", long86 == (-347155199968L));
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "69" + "'", str87, "69");
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.joda.time.format.PeriodFormatter periodFormatter0 = org.joda.time.format.ISOPeriodFormat.alternateExtended();
        java.io.Writer writer1 = null;
        org.joda.time.Months months2 = org.joda.time.Months.ONE;
        org.joda.time.DurationFieldType durationFieldType3 = months2.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter0.printTo(writer1, (org.joda.time.ReadablePeriod) months2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodFormatter0);
        org.junit.Assert.assertNotNull(months2);
        org.junit.Assert.assertNotNull(durationFieldType3);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
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
        org.joda.time.chrono.CopticChronology copticChronology19 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone15);
        long long21 = dateTimeZone15.convertUTCToLocal(0L);
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
        org.junit.Assert.assertNotNull(copticChronology19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.joda.time.Months months0 = org.joda.time.Months.TEN;
        org.joda.time.Months months1 = months0.negated();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = months0.getValue(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(months0);
        org.junit.Assert.assertNotNull(months1);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
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
        int int16 = dateTimeZone14.getOffsetFromLocal(35L);
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.Days days2 = org.joda.time.Days.THREE;
        int[] intArray5 = gregorianChronology1.get((org.joda.time.ReadablePeriod) days2, (long) 0, (-1L));
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology1.monthOfYear();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology1.yearOfCentury();
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0 });
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay();
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Years years1 = org.joda.time.Years.parseYears("+00:00:00.035");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+00:00:00.035\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(31, 10080, 10, (-86401), 86400, 7, 7, 70);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.THREE;
        org.junit.Assert.assertNotNull(minutes0);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(9, (-292275054), (int) 'a', (int) 'a', 84, (-86401), 2070, 604800000);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.MIN_VALUE;
        boolean boolean2 = minutes0.isGreaterThan(minutes1);
        org.joda.time.Minutes minutes4 = minutes0.dividedBy((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds5 = minutes0.toStandardSeconds();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -2147483648 * 60");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(minutes4);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.MAX_VALUE;
        org.junit.Assert.assertNotNull(minutes0);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
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
        org.joda.time.Days days41 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType42 = days41.getFieldType();
        boolean boolean43 = localTime35.equals((java.lang.Object) durationFieldType42);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType45 = localTime35.getFieldType((-35));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -35");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(days41);
        org.junit.Assert.assertNotNull(durationFieldType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusHours((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.weekOfWeekyear();
        org.joda.time.Days days8 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType9 = days8.getFieldType();
        org.joda.time.PeriodType periodType10 = days8.getPeriodType();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property16 = dateTime14.property(dateTimeFieldType15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.chrono.JulianChronology julianChronology18 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone17);
        org.joda.time.Chronology chronology19 = julianChronology18.withUTC();
        org.joda.time.DateTimeField dateTimeField20 = dateTimeFieldType15.getField((org.joda.time.Chronology) julianChronology18);
        org.joda.time.MutableInterval mutableInterval21 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology18);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.chrono.JulianChronology julianChronology23 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone22);
        org.joda.time.Chronology chronology24 = julianChronology23.withUTC();
        mutableInterval21.setChronology((org.joda.time.Chronology) julianChronology23);
        org.joda.time.Period period26 = new org.joda.time.Period((long) (byte) 0, periodType10, (org.joda.time.Chronology) julianChronology23);
        org.joda.time.PeriodType periodType27 = periodType10.withDaysRemoved();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology29 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone28);
        org.joda.time.Days days30 = org.joda.time.Days.THREE;
        int[] intArray33 = gregorianChronology29.get((org.joda.time.ReadablePeriod) days30, (long) 0, (-1L));
        org.joda.time.DateTimeField dateTimeField34 = gregorianChronology29.dayOfMonth();
        org.joda.time.DurationField durationField35 = gregorianChronology29.weeks();
        org.joda.time.DateTime dateTime36 = org.joda.time.DateTime.now((org.joda.time.Chronology) gregorianChronology29);
        org.joda.time.DateTimeField dateTimeField37 = gregorianChronology29.yearOfCentury();
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod(0L, (long) 1, periodType27, (org.joda.time.Chronology) gregorianChronology29);
        org.joda.time.MutableDateTime mutableDateTime39 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime39.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime41 = property40.roundFloor();
        int int42 = mutableDateTime41.getYear();
        mutableDateTime41.addDays(1969);
        boolean boolean45 = mutablePeriod38.equals((java.lang.Object) mutableDateTime41);
        int int46 = property4.getDifference((org.joda.time.ReadableInstant) mutableDateTime41);
        org.joda.time.LocalDateTime localDateTime47 = property4.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(julianChronology18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(julianChronology23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(gregorianChronology29);
        org.junit.Assert.assertNotNull(days30);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { 0 });
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(mutableDateTime39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(mutableDateTime41);
// flaky "15) test1106(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1970 + "'", int42 == 1970);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
// flaky "3) test1106(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-281) + "'", int46 == (-281));
        org.junit.Assert.assertNotNull(localDateTime47);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.setDayOfYear(8);
        mutableDateTime0.setDayOfYear(31);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        mutableDateTime0.setZone(dateTimeZone5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = mutableDateTime0.toString("March");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: r");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime0);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.dayOfYear();
        org.joda.time.DateMidnight dateMidnight4 = property3.roundHalfEvenCopy();
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.withYearOfCentury(100);
        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.Instant instant8 = gJChronology7.getGregorianCutover();
        org.joda.time.DurationField durationField9 = gJChronology7.seconds();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology11 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone10);
        org.joda.time.Days days12 = org.joda.time.Days.THREE;
        int[] intArray15 = gregorianChronology11.get((org.joda.time.ReadablePeriod) days12, (long) 0, (-1L));
        org.joda.time.DateTimeField dateTimeField16 = gregorianChronology11.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField17 = gregorianChronology11.monthOfYear();
        int int18 = gregorianChronology11.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeZone dateTimeZone19 = gregorianChronology11.getZone();
        org.joda.time.Chronology chronology20 = gJChronology7.withZone(dateTimeZone19);
        org.joda.time.MutableDateTime mutableDateTime21 = dateMidnight4.toMutableDateTime(dateTimeZone19);
        mutableDateTime21.setMinuteOfHour((int) ' ');
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(gJChronology7);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(gregorianChronology11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 0 });
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(mutableDateTime21);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.Days days2 = org.joda.time.Days.THREE;
        int[] intArray5 = gregorianChronology1.get((org.joda.time.ReadablePeriod) days2, (long) 0, (-1L));
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology1.hourOfDay();
        org.joda.time.DurationField durationField8 = gregorianChronology1.minutes();
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0 });
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.LocalDate localDate3 = localDate0.plusDays(20179);
        org.joda.time.LocalDate localDate5 = localDate3.withMonthOfYear(7);
        org.joda.time.LocalDate.Property property6 = localDate3.era();
        int int7 = localDate3.getYear();
        int int8 = localDate3.getEra();
        org.joda.time.LocalDate localDate10 = localDate3.withDayOfYear(26);
        java.util.Date date11 = localDate3.toDate();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
// flaky "16) test1110(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2025 + "'", int7 == 2025);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(date11);
// flaky "4) test1110(RegressionTest2)":         org.junit.Assert.assertEquals(date11.toString(), "Tue Apr 01 00:00:00 EDT 2025");
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
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
        long long24 = offsetDateTimeField18.getDifferenceAsLong((long) (byte) 0, (-3600000L));
        int int26 = offsetDateTimeField18.getMaximumValue((long) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-35) + "'", int26 == (-35));
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
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
        org.joda.time.chrono.CopticChronology copticChronology19 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone15);
        // The following exception was thrown during execution in test generation
        try {
            long long27 = copticChronology19.getDateTimeMillis(84, 32, 330958, 31, 80, 1969, 1969);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 31 for hourOfDay must be in the range [0,23]");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Coordinated Universal Time" + "'", str18, "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(copticChronology19);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusMinutes((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusWeeks(1970);
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusMinutes((int) (byte) 100);
        org.joda.time.Hours hours10 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadablePartial) localDateTime5, (org.joda.time.ReadablePartial) localDateTime7);
        int int11 = localDateTime5.size();
        org.joda.time.LocalDateTime.Property property12 = localDateTime5.millisOfDay();
        org.joda.time.LocalDateTime localDateTime13 = property12.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.Days days2 = org.joda.time.Days.THREE;
        int[] intArray5 = gregorianChronology1.get((org.joda.time.ReadablePeriod) days2, (long) 0, (-1L));
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology1.dayOfMonth();
        org.joda.time.DurationField durationField7 = gregorianChronology1.years();
        org.joda.time.DurationField durationField8 = gregorianChronology1.hours();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.chrono.JulianChronology julianChronology10 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone9);
        org.joda.time.DurationField durationField11 = julianChronology10.seconds();
        int int12 = durationField8.compareTo(durationField11);
        long long15 = durationField8.getDifferenceAsLong((long) '4', 0L);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0 });
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(julianChronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days1 = org.joda.time.Days.parseDays("2080-06-30");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2080-06-30\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
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
        org.joda.time.DateTimeField dateTimeField17 = julianChronology2.year();
        org.joda.time.chrono.StrictChronology strictChronology18 = org.joda.time.chrono.StrictChronology.getInstance((org.joda.time.Chronology) julianChronology2);
        org.joda.time.DurationField durationField19 = strictChronology18.eras();
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(gregorianChronology7);
        org.junit.Assert.assertNotNull(gregorianChronology10);
        org.junit.Assert.assertNotNull(dateTimeField12);
// flaky "17) test1116(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 71 + "'", int13 == 71);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(strictChronology18);
        org.junit.Assert.assertNotNull(durationField19);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.YearMonth yearMonth2 = new org.joda.time.YearMonth(101L);
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.ZERO;
        org.joda.time.YearMonth yearMonth4 = yearMonth2.plus((org.joda.time.ReadablePeriod) weeks3);
        org.joda.time.Duration duration5 = weeks3.toStandardDuration();
        org.joda.time.Weeks weeks7 = weeks3.minus((-19));
        boolean boolean8 = copticChronology0.equals((java.lang.Object) (-19));
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(yearMonth4);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property2 = dateTime1.dayOfWeek();
        int int3 = dateTime1.getWeekyear();
        org.joda.time.DateTime dateTime5 = dateTime1.minusDays(26);
        boolean boolean6 = dateTime1.isAfterNow();
        org.joda.time.DateTime dateTime7 = dateTime1.toDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = dateTime7.withDate(60, 71, (-35));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 71 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1970 + "'", int3 == 1970);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTime7);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
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
        org.joda.time.LocalTime localTime43 = property41.withMinimumValue();
        org.joda.time.LocalTime localTime45 = property41.addCopy((int) '4');
        org.joda.time.LocalTime localTime47 = property41.addCopy((long) 7);
        int int48 = localTime47.getHourOfDay();
        org.joda.time.Minutes minutes49 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes50 = org.joda.time.Minutes.MIN_VALUE;
        boolean boolean51 = minutes49.isGreaterThan(minutes50);
        org.joda.time.LocalTime localTime53 = localTime47.withPeriodAdded((org.joda.time.ReadablePeriod) minutes50, 22);
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
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(minutes49);
        org.junit.Assert.assertNotNull(minutes50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(localTime53);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GregorianChronology gregorianChronology20 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone15, 86400);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 86400");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Coordinated Universal Time" + "'", str18, "Coordinated Universal Time");
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.Days days2 = org.joda.time.Days.THREE;
        int[] intArray5 = gregorianChronology1.get((org.joda.time.ReadablePeriod) days2, (long) 0, (-1L));
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = gregorianChronology1.getZone();
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay((org.joda.time.Chronology) gregorianChronology1);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0 });
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property6 = dateTime4.property(dateTimeFieldType5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.chrono.JulianChronology julianChronology8 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone7);
        org.joda.time.Chronology chronology9 = julianChronology8.withUTC();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType5.getField((org.joda.time.Chronology) julianChronology8);
        org.joda.time.MutableInterval mutableInterval11 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology8);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) (short) -1, (org.joda.time.Chronology) julianChronology8);
        org.joda.time.DateTimeZone dateTimeZone13 = julianChronology8.getZone();
        org.joda.time.Days days14 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType15 = days14.getFieldType();
        org.joda.time.PeriodType periodType16 = days14.getPeriodType();
        boolean boolean17 = dateTimeZone13.equals((java.lang.Object) periodType16);
        long long20 = dateTimeZone13.convertLocalToUTC(1736364564229L, true);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(julianChronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1736364564229L + "'", long20 == 1736364564229L);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 100, dateTimeZone1);
        org.joda.time.Days days3 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType4 = days3.getFieldType();
        boolean boolean5 = localTime2.isSupported(durationFieldType4);
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
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone21.getName((long) 59, locale23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime((java.lang.Object) boolean5, dateTimeZone21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(julianChronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Coordinated Universal Time" + "'", str24, "Coordinated Universal Time");
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
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
        java.lang.String str20 = islamicChronology19.toString();
        org.joda.time.Chronology chronology21 = islamicChronology19.withUTC();
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology19.hourOfDay();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "IslamicChronology[UTC]" + "'", str20, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeParser dateTimeParser2 = dateTimeFormatter1.getParser();
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter1.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter1.withDefaultYear(80);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeParser2);
        org.junit.Assert.assertNotNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Days days1 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType2 = days1.getFieldType();
        org.joda.time.LocalDate localDate4 = localDate0.withFieldAdded(durationFieldType2, 1);
        org.joda.time.LocalDate.Property property5 = localDate4.era();
        org.joda.time.LocalDate localDate7 = localDate4.withYearOfCentury(0);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate10 = localDate8.withYearOfEra(10);
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
        org.joda.time.DateTime dateTime26 = localDate8.toDateTimeAtCurrentTime(dateTimeZone25);
        org.joda.time.DateTime dateTime27 = org.joda.time.DateTime.now(dateTimeZone25);
        org.joda.time.chrono.GJChronology gJChronology28 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone25);
        org.joda.time.DateTime dateTime29 = localDate4.toDateTimeAtStartOfDay(dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology31 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone30);
        org.joda.time.Days days32 = org.joda.time.Days.THREE;
        int[] intArray35 = gregorianChronology31.get((org.joda.time.ReadablePeriod) days32, (long) 0, (-1L));
        org.joda.time.Duration duration36 = days32.toStandardDuration();
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property39 = dateTime38.dayOfWeek();
        int int40 = dateTime38.getWeekyear();
        int int41 = dateTime38.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology43 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone42);
        org.joda.time.Days days44 = org.joda.time.Days.THREE;
        int[] intArray47 = gregorianChronology43.get((org.joda.time.ReadablePeriod) days44, (long) 0, (-1L));
        org.joda.time.Duration duration48 = days44.toStandardDuration();
        org.joda.time.DateTime dateTime50 = dateTime38.withDurationAdded((org.joda.time.ReadableDuration) duration48, 26);
        boolean boolean51 = duration36.isShorterThan((org.joda.time.ReadableDuration) duration48);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology53 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone52);
        org.joda.time.DateMidnight dateMidnight54 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology53);
        org.joda.time.DateMidnight.Property property55 = dateMidnight54.dayOfYear();
        org.joda.time.DateMidnight dateMidnight56 = property55.roundHalfEvenCopy();
        org.joda.time.DateMidnight dateMidnight58 = dateMidnight56.plusWeeks((int) (byte) 10);
        org.joda.time.Period period59 = duration36.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight58);
        org.joda.time.DateTime dateTime60 = dateTime29.minus((org.joda.time.ReadableDuration) duration36);
        org.joda.time.DateTime dateTime62 = dateTime60.withMonthOfYear(7);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(julianChronology13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1970 + "'", int20 == 1970);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(gJChronology28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(gregorianChronology31);
        org.junit.Assert.assertNotNull(days32);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1970 + "'", int40 == 1970);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(gregorianChronology43);
        org.junit.Assert.assertNotNull(days44);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertArrayEquals(intArray47, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(gregorianChronology53);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(dateMidnight56);
        org.junit.Assert.assertNotNull(dateMidnight58);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(dateTime62);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
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
        long long25 = offsetDateTimeField18.remainder(1736364564229L);
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
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1764229L + "'", long25 == 1764229L);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.joda.time.Instant instant1 = org.joda.time.Instant.ofEpochSecond(259200100L);
        org.junit.Assert.assertNotNull(instant1);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology1.dayOfYear();
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology1);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        org.joda.time.Days days0 = org.joda.time.Days.THREE;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property3.getFieldType();
        boolean boolean5 = days0.equals((java.lang.Object) property3);
        org.joda.time.DateTime dateTime6 = property3.getDateTime();
        org.joda.time.DateTime.Property property7 = dateTime6.era();
        org.joda.time.DateTime dateTime9 = dateTime6.minusMinutes((int) (short) 10);
        boolean boolean11 = dateTime6.isEqual(0L);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds2 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds4 = seconds2.minus(7);
        int int5 = seconds2.getSeconds();
        org.joda.time.Seconds seconds6 = seconds1.minus(seconds2);
        boolean boolean7 = seconds0.isGreaterThan(seconds6);
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.LocalDate localDate3 = localDate0.plusDays(20179);
        org.joda.time.LocalDate.Property property4 = localDate0.year();
        org.joda.time.LocalDate localDate6 = localDate0.withEra((int) (byte) 1);
        int int7 = localDate6.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate6);
// flaky "18) test1132(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
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
        org.joda.time.Days days24 = org.joda.time.Days.THREE;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property27 = dateTime26.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = property27.getFieldType();
        boolean boolean29 = days24.equals((java.lang.Object) property27);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = property27.getFieldType();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime dateTime34 = dateTime32.withYear((-35));
        org.joda.time.DateTime dateTime36 = dateTime32.plusMillis(1970);
        int int37 = property27.compareTo((org.joda.time.ReadableInstant) dateTime36);
        mutableDateTime0.setTime((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property41 = dateTime40.dayOfWeek();
        int int42 = dateTime40.getWeekyear();
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.DateTime dateTime44 = dateTime40.plus(readableDuration43);
        org.joda.time.DateTime.Property property45 = dateTime44.era();
        boolean boolean47 = dateTime44.isBefore(26L);
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property50 = dateTime49.dayOfWeek();
        int int51 = dateTime49.getWeekyear();
        org.joda.time.ReadableDuration readableDuration52 = null;
        org.joda.time.DateTime dateTime53 = dateTime49.plus(readableDuration52);
        org.joda.time.DateTime.Property property54 = dateTime53.era();
        boolean boolean56 = dateTime53.isBefore(26L);
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.Chronology chronology58 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime53, readableInstant57);
        boolean boolean59 = dateTime44.isBefore(readableInstant57);
        org.joda.time.Duration duration60 = new org.joda.time.Duration((java.lang.Object) readableInstant57);
        mutableDateTime0.add((org.joda.time.ReadableDuration) duration60);
        org.junit.Assert.assertNotNull(mutableDateTime0);
// flaky "19) test1133(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 70 + "'", int3 == 70);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(gregorianChronology10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1970 + "'", int42 == 1970);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1970 + "'", int51 == 1970);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(chronology58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusHours((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.dayOfYear();
        org.joda.time.LocalDateTime.Property property5 = localDateTime3.dayOfMonth();
        int int6 = localDateTime3.getEra();
        int int7 = localDateTime3.getCenturyOfEra();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime dateTime11 = dateTime9.withDayOfMonth((int) (byte) 1);
        org.joda.time.Instant instant12 = dateTime11.toInstant();
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardDays((long) 8);
        org.joda.time.Instant instant15 = instant12.minus((org.joda.time.ReadableDuration) duration14);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property18 = dateTime17.dayOfWeek();
        int int19 = dateTime17.getWeekyear();
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.DateTime dateTime21 = dateTime17.plus(readableDuration20);
        org.joda.time.DateTime.Property property22 = dateTime21.era();
        boolean boolean24 = dateTime21.isBefore(26L);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property27 = dateTime26.dayOfWeek();
        int int28 = dateTime26.getWeekyear();
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.DateTime dateTime30 = dateTime26.plus(readableDuration29);
        org.joda.time.DateTime.Property property31 = dateTime30.era();
        boolean boolean33 = dateTime30.isBefore(26L);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.Chronology chronology35 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime30, readableInstant34);
        boolean boolean36 = dateTime21.isBefore(readableInstant34);
        org.joda.time.Duration duration37 = new org.joda.time.Duration((java.lang.Object) readableInstant34);
        boolean boolean38 = duration14.isLongerThan((org.joda.time.ReadableDuration) duration37);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime3.minus((org.joda.time.ReadableDuration) duration14);
        org.joda.time.LocalDateTime.Property property40 = localDateTime3.weekyear();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 19 + "'", int7 == 19);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1970 + "'", int19 == 1970);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1970 + "'", int28 == 1970);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(property40);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.Partial partial2 = new org.joda.time.Partial((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DurationField durationField3 = gregorianChronology1.centuries();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = gregorianChronology1.getDateTimeMillis(2070, (int) (byte) 10, 0, (-19), 1975, 0, 6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -19 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(durationField3);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
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
        org.joda.time.PeriodType periodType22 = periodType5.withDaysRemoved();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology24 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone23);
        org.joda.time.Days days25 = org.joda.time.Days.THREE;
        int[] intArray28 = gregorianChronology24.get((org.joda.time.ReadablePeriod) days25, (long) 0, (-1L));
        org.joda.time.DateTimeField dateTimeField29 = gregorianChronology24.dayOfMonth();
        org.joda.time.DurationField durationField30 = gregorianChronology24.weeks();
        org.joda.time.DateTime dateTime31 = org.joda.time.DateTime.now((org.joda.time.Chronology) gregorianChronology24);
        org.joda.time.DateTimeField dateTimeField32 = gregorianChronology24.yearOfCentury();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(0L, (long) 1, periodType22, (org.joda.time.Chronology) gregorianChronology24);
        org.joda.time.MutableDateTime mutableDateTime34 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime34.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime36 = property35.roundFloor();
        int int37 = mutableDateTime36.getYear();
        mutableDateTime36.addDays(1969);
        boolean boolean40 = mutablePeriod33.equals((java.lang.Object) mutableDateTime36);
        mutableDateTime36.setHourOfDay(12);
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
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(gregorianChronology24);
        org.junit.Assert.assertNotNull(days25);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 0 });
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(mutableDateTime36);
// flaky "20) test1136(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1970 + "'", int37 == 1970);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
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
        int[] intArray11 = mutablePeriod5.getValues();
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(property3);
// flaky "21) test1137(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 0, 0, 0, 3, 0, 0, 0, 0 });
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod();
        mutablePeriod0.setMonths(0);
        mutablePeriod0.addMonths((int) (byte) -1);
        mutablePeriod0.setPeriod((-347155199968L));
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property12 = dateTime10.property(dateTimeFieldType11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.chrono.JulianChronology julianChronology14 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone13);
        org.joda.time.Chronology chronology15 = julianChronology14.withUTC();
        org.joda.time.DateTimeField dateTimeField16 = dateTimeFieldType11.getField((org.joda.time.Chronology) julianChronology14);
        org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology14);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.chrono.JulianChronology julianChronology19 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone18);
        org.joda.time.Chronology chronology20 = julianChronology19.withUTC();
        mutableInterval17.setChronology((org.joda.time.Chronology) julianChronology19);
        mutableInterval17.setEndMillis((long) 'a');
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property26 = dateTime25.dayOfWeek();
        int int27 = dateTime25.getWeekyear();
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.DateTime dateTime29 = dateTime25.plus(readableDuration28);
        boolean boolean30 = mutableInterval17.contains((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.Interval interval31 = mutableInterval17.toInterval();
        org.joda.time.ReadableInterval readableInterval32 = null;
        boolean boolean33 = mutableInterval17.isBefore(readableInterval32);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology35 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone34);
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology35);
        org.joda.time.DateMidnight.Property property37 = dateMidnight36.weekyear();
        int int38 = dateMidnight36.getDayOfWeek();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod();
        org.joda.time.Days days40 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType41 = days40.getFieldType();
        org.joda.time.PeriodType periodType42 = days40.getPeriodType();
        mutablePeriod39.add((org.joda.time.ReadablePeriod) days40);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight36.plus((org.joda.time.ReadablePeriod) mutablePeriod39);
        org.joda.time.DateMidnight.Property property45 = dateMidnight44.weekOfWeekyear();
        boolean boolean46 = mutableInterval17.contains((org.joda.time.ReadableInstant) dateMidnight44);
        mutablePeriod0.add((org.joda.time.ReadableInterval) mutableInterval17);
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime49.plusMinutes((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.minusDays(19);
        int int54 = localDateTime53.getSecondOfMinute();
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property58 = dateTime56.property(dateTimeFieldType57);
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.chrono.JulianChronology julianChronology60 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone59);
        org.joda.time.Chronology chronology61 = julianChronology60.withUTC();
        org.joda.time.DateTimeField dateTimeField62 = dateTimeFieldType57.getField((org.joda.time.Chronology) julianChronology60);
        int int63 = localDateTime53.indexOf(dateTimeFieldType57);
        org.joda.time.DurationFieldType durationFieldType64 = dateTimeFieldType57.getRangeDurationType();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod0.set(durationFieldType64, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'halfdays'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(julianChronology14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(julianChronology19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1970 + "'", int27 == 1970);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(interval31);
// flaky "22) test1138(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(gregorianChronology35);
        org.junit.Assert.assertNotNull(property37);
// flaky "5) test1138(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int38 + "' != '" + 4 + "'", int38 == 4);
        org.junit.Assert.assertNotNull(days40);
        org.junit.Assert.assertNotNull(durationFieldType41);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(dateMidnight44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 59 + "'", int54 == 59);
        org.junit.Assert.assertNotNull(dateTimeFieldType57);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(julianChronology60);
        org.junit.Assert.assertNotNull(chronology61);
        org.junit.Assert.assertNotNull(dateTimeField62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(durationFieldType64);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        org.joda.time.Days days0 = org.joda.time.Days.THREE;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property3.getFieldType();
        boolean boolean5 = days0.equals((java.lang.Object) property3);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = property3.getFieldType();
        org.joda.time.DateTime dateTime8 = property3.addToCopy(70067048);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = property3.setCopy(604800000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 604800000 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
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
        java.lang.String str20 = islamicChronology19.toString();
        org.joda.time.Chronology chronology21 = islamicChronology19.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            long long26 = islamicChronology19.getDateTimeMillis(2080, (int) (byte) 100, 12, 1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "IslamicChronology[UTC]" + "'", str20, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(chronology21);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.setMillis((-1L));
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime dateTime6 = dateTime4.withYearOfCentury(60);
        mutableDateTime0.setMillis((org.joda.time.ReadableInstant) dateTime6);
        java.util.Date date8 = dateTime6.toDate();
        org.joda.time.YearMonth yearMonth9 = org.joda.time.YearMonth.fromDateFields(date8);
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Dec 31 19:00:00 EST 1959");
        org.junit.Assert.assertNotNull(yearMonth9);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
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
            long long27 = islamicChronology19.getDateTimeMillis((int) (short) 100, 6240, (int) (byte) 0, 19, 0, 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6240 for monthOfYear must be in the range [1,12]");
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
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
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
        org.joda.time.LocalTime localTime44 = property41.addCopy(86400);
        int int45 = property41.getMinimumValueOverall();
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
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
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
        boolean boolean36 = scaledDurationField35.isSupported();
        long long38 = scaledDurationField35.getMillis(35L);
        org.joda.time.DurationFieldType durationFieldType39 = scaledDurationField35.getType();
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(gregorianChronology7);
        org.junit.Assert.assertNotNull(gregorianChronology10);
        org.junit.Assert.assertNotNull(dateTimeField12);
// flaky "23) test1144(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 71 + "'", int13 == 71);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(julianChronology23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "0" + "'", str30, "0");
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(days32);
        org.junit.Assert.assertNotNull(durationFieldType33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 159047038080000000L + "'", long38 == 159047038080000000L);
        org.junit.Assert.assertNotNull(durationFieldType39);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone1);
        org.joda.time.Days days3 = org.joda.time.Days.THREE;
        int[] intArray6 = gregorianChronology2.get((org.joda.time.ReadablePeriod) days3, (long) 0, (-1L));
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology2.dayOfMonth();
        org.joda.time.DurationField durationField8 = gregorianChronology2.millis();
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) 26, (org.joda.time.Chronology) gregorianChronology2, locale9);
        org.joda.time.Chronology chronology11 = gregorianChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology2.year();
        org.joda.time.DateTimeField dateTimeField13 = gregorianChronology2.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField15 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField13, dateTimeFieldType14);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusMinutes((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.minusSeconds((int) (short) 0);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property25 = dateTime23.property(dateTimeFieldType24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.chrono.JulianChronology julianChronology27 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone26);
        org.joda.time.Chronology chronology28 = julianChronology27.withUTC();
        org.joda.time.DateTimeField dateTimeField29 = dateTimeFieldType24.getField((org.joda.time.Chronology) julianChronology27);
        org.joda.time.DurationField durationField30 = julianChronology27.halfdays();
        org.joda.time.Period period33 = new org.joda.time.Period((long) 31, (long) 25);
        int[] intArray35 = julianChronology27.get((org.joda.time.ReadablePeriod) period33, (-1924473598031L));
        int int36 = zeroIsMaxDateTimeField15.getMinimumValue((org.joda.time.ReadablePartial) localDateTime21, intArray35);
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate();
        org.joda.time.Days days38 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType39 = days38.getFieldType();
        org.joda.time.LocalDate localDate41 = localDate37.withFieldAdded(durationFieldType39, 1);
        org.joda.time.LocalDate.Property property42 = localDate41.era();
        org.joda.time.LocalDate localDate44 = localDate41.withYearOfCentury(0);
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
        org.joda.time.chrono.GJChronology gJChronology65 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone62);
        org.joda.time.DateTime dateTime66 = localDate41.toDateTimeAtStartOfDay(dateTimeZone62);
        org.joda.time.DateTime dateTime70 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType71 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property72 = dateTime70.property(dateTimeFieldType71);
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        org.joda.time.chrono.JulianChronology julianChronology74 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone73);
        org.joda.time.Chronology chronology75 = julianChronology74.withUTC();
        org.joda.time.DateTimeField dateTimeField76 = dateTimeFieldType71.getField((org.joda.time.Chronology) julianChronology74);
        org.joda.time.DateTimeZone dateTimeZone77 = null;
        org.joda.time.Chronology chronology78 = julianChronology74.withZone(dateTimeZone77);
        org.joda.time.LocalTime localTime79 = new org.joda.time.LocalTime((long) '#', chronology78);
        org.joda.time.LocalTime localTime81 = localTime79.plusSeconds((int) 'a');
        int[] intArray82 = localTime81.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray84 = zeroIsMaxDateTimeField15.addWrapField((org.joda.time.ReadablePartial) localDate41, (-20274), intArray82, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -20274");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0 });
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(julianChronology27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { 0, 0, (-3181), (-6), (-23), (-59), (-58), (-31) });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(days38);
        org.junit.Assert.assertNotNull(durationFieldType39);
        org.junit.Assert.assertNotNull(localDate41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(localDate44);
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
        org.junit.Assert.assertNotNull(gJChronology65);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(dateTimeFieldType71);
        org.junit.Assert.assertNotNull(property72);
        org.junit.Assert.assertNotNull(julianChronology74);
        org.junit.Assert.assertNotNull(chronology75);
        org.junit.Assert.assertNotNull(dateTimeField76);
        org.junit.Assert.assertNotNull(chronology78);
        org.junit.Assert.assertNotNull(localTime81);
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertArrayEquals(intArray82, new int[] { 0, 1, 37, 35 });
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
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
        org.joda.time.PeriodType periodType20 = periodType3.withDaysRemoved();
        java.lang.String str21 = periodType20.getName();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod();
        org.joda.time.Days days23 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType24 = days23.getFieldType();
        org.joda.time.PeriodType periodType25 = days23.getPeriodType();
        mutablePeriod22.add((org.joda.time.ReadablePeriod) days23);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod();
        boolean boolean29 = mutablePeriod27.equals((java.lang.Object) (-1L));
        mutablePeriod27.setPeriod(86400000, 13, (int) (byte) -1, (int) ' ', 26, (-35), (int) (short) -1, (int) (short) 100);
        org.joda.time.Days days40 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType41 = days40.getFieldType();
        org.joda.time.PeriodType periodType42 = days40.getPeriodType();
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property48 = dateTime46.property(dateTimeFieldType47);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.chrono.JulianChronology julianChronology50 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone49);
        org.joda.time.Chronology chronology51 = julianChronology50.withUTC();
        org.joda.time.DateTimeField dateTimeField52 = dateTimeFieldType47.getField((org.joda.time.Chronology) julianChronology50);
        org.joda.time.MutableInterval mutableInterval53 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology50);
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.chrono.JulianChronology julianChronology55 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone54);
        org.joda.time.Chronology chronology56 = julianChronology55.withUTC();
        mutableInterval53.setChronology((org.joda.time.Chronology) julianChronology55);
        org.joda.time.Period period58 = new org.joda.time.Period((long) (byte) 0, periodType42, (org.joda.time.Chronology) julianChronology55);
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology60 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone59);
        org.joda.time.DateMidnight dateMidnight61 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology60);
        org.joda.time.DateMidnight.Property property62 = dateMidnight61.dayOfYear();
        org.joda.time.DateMidnight dateMidnight63 = property62.roundHalfEvenCopy();
        org.joda.time.DateMidnight dateMidnight65 = dateMidnight63.plusWeeks((int) (byte) 10);
        org.joda.time.Days days66 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType67 = days66.getFieldType();
        org.joda.time.DateMidnight dateMidnight69 = dateMidnight65.withFieldAdded(durationFieldType67, 26);
        org.joda.time.Period period71 = period58.withFieldAdded(durationFieldType67, (int) (short) 1);
        boolean boolean72 = mutablePeriod27.isSupported(durationFieldType67);
        int int73 = mutablePeriod22.get(durationFieldType67);
        int int74 = periodType20.indexOf(durationFieldType67);
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
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "DaysNoDays" + "'", str21, "DaysNoDays");
        org.junit.Assert.assertNotNull(days23);
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(days40);
        org.junit.Assert.assertNotNull(durationFieldType41);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(dateTimeFieldType47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(julianChronology50);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(julianChronology55);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(gregorianChronology60);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(dateMidnight63);
        org.junit.Assert.assertNotNull(dateMidnight65);
        org.junit.Assert.assertNotNull(days66);
        org.junit.Assert.assertNotNull(durationFieldType67);
        org.junit.Assert.assertNotNull(dateMidnight69);
        org.junit.Assert.assertNotNull(period71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 3 + "'", int73 == 3);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
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
        long long34 = cachedDateTimeZone20.previousTransition((long) (short) 100);
        org.joda.time.DateMidnight dateMidnight35 = new org.joda.time.DateMidnight((org.joda.time.DateTimeZone) cachedDateTimeZone20);
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
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 100L + "'", long34 == 100L);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
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
        // The following exception was thrown during execution in test generation
        try {
            long long35 = skipDateTimeField14.set((long) (-4), 1969);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1969 for weekyearOfCentury must be in the range [1,100]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(gregorianChronology7);
        org.junit.Assert.assertNotNull(gregorianChronology10);
        org.junit.Assert.assertNotNull(dateTimeField12);
// flaky "24) test1148(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 71 + "'", int13 == 71);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(julianChronology23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "0" + "'", str30, "0");
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
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
        long long37 = scaledDurationField35.getMillis((long) (-19));
        long long40 = scaledDurationField35.getValueAsLong((long) 39, 82800000L);
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(gregorianChronology7);
        org.junit.Assert.assertNotNull(gregorianChronology10);
        org.junit.Assert.assertNotNull(dateTimeField12);
// flaky "25) test1149(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 71 + "'", int13 == 71);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(julianChronology23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "0" + "'", str30, "0");
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(days32);
        org.junit.Assert.assertNotNull(durationFieldType33);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-86339820672000000L) + "'", long37 == (-86339820672000000L));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
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
        org.joda.time.Period period25 = period23.withDays(0);
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
        org.junit.Assert.assertNotNull(period25);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Days days1 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType2 = days1.getFieldType();
        org.joda.time.LocalDate localDate4 = localDate0.withFieldAdded(durationFieldType2, 1);
        org.joda.time.LocalDate.Property property5 = localDate4.era();
        org.joda.time.LocalDate localDate7 = localDate4.withYearOfCentury(0);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate10 = localDate8.withYearOfEra(10);
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
        org.joda.time.DateTime dateTime26 = localDate8.toDateTimeAtCurrentTime(dateTimeZone25);
        org.joda.time.DateTime dateTime27 = org.joda.time.DateTime.now(dateTimeZone25);
        org.joda.time.chrono.GJChronology gJChronology28 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone25);
        org.joda.time.DateTime dateTime29 = localDate4.toDateTimeAtStartOfDay(dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology31 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone30);
        org.joda.time.Days days32 = org.joda.time.Days.THREE;
        int[] intArray35 = gregorianChronology31.get((org.joda.time.ReadablePeriod) days32, (long) 0, (-1L));
        org.joda.time.Duration duration36 = days32.toStandardDuration();
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property39 = dateTime38.dayOfWeek();
        int int40 = dateTime38.getWeekyear();
        int int41 = dateTime38.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology43 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone42);
        org.joda.time.Days days44 = org.joda.time.Days.THREE;
        int[] intArray47 = gregorianChronology43.get((org.joda.time.ReadablePeriod) days44, (long) 0, (-1L));
        org.joda.time.Duration duration48 = days44.toStandardDuration();
        org.joda.time.DateTime dateTime50 = dateTime38.withDurationAdded((org.joda.time.ReadableDuration) duration48, 26);
        boolean boolean51 = duration36.isShorterThan((org.joda.time.ReadableDuration) duration48);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology53 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone52);
        org.joda.time.DateMidnight dateMidnight54 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology53);
        org.joda.time.DateMidnight.Property property55 = dateMidnight54.dayOfYear();
        org.joda.time.DateMidnight dateMidnight56 = property55.roundHalfEvenCopy();
        org.joda.time.DateMidnight dateMidnight58 = dateMidnight56.plusWeeks((int) (byte) 10);
        org.joda.time.Period period59 = duration36.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight58);
        org.joda.time.DateTime dateTime60 = dateTime29.minus((org.joda.time.ReadableDuration) duration36);
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime dateTime64 = dateTime62.withDayOfMonth((int) (byte) 1);
        org.joda.time.Instant instant65 = dateTime64.toInstant();
        org.joda.time.Duration duration67 = org.joda.time.Duration.standardDays((long) 8);
        org.joda.time.Instant instant68 = instant65.minus((org.joda.time.ReadableDuration) duration67);
        org.joda.time.format.PeriodFormatter periodFormatter69 = org.joda.time.format.ISOPeriodFormat.alternateExtended();
        org.joda.time.PeriodType periodType70 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.format.PeriodFormatter periodFormatter71 = periodFormatter69.withParseType(periodType70);
        org.joda.time.PeriodType periodType72 = periodFormatter71.getParseType();
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime29, (org.joda.time.ReadableInstant) instant68, periodType72);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod73.setHours(2080);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'hours'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(julianChronology13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1970 + "'", int20 == 1970);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(gJChronology28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(gregorianChronology31);
        org.junit.Assert.assertNotNull(days32);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1970 + "'", int40 == 1970);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(gregorianChronology43);
        org.junit.Assert.assertNotNull(days44);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertArrayEquals(intArray47, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(gregorianChronology53);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(dateMidnight56);
        org.junit.Assert.assertNotNull(dateMidnight58);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(instant65);
        org.junit.Assert.assertNotNull(duration67);
        org.junit.Assert.assertNotNull(instant68);
        org.junit.Assert.assertNotNull(periodFormatter69);
        org.junit.Assert.assertNotNull(periodType70);
        org.junit.Assert.assertNotNull(periodFormatter71);
        org.junit.Assert.assertNotNull(periodType72);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.Period period2 = new org.joda.time.Period((long) 39, periodType1);
        java.lang.String str3 = periodType1.toString();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PeriodType[YearDayTime]" + "'", str3, "PeriodType[YearDayTime]");
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.joda.time.Months months0 = org.joda.time.Months.THREE;
        org.junit.Assert.assertNotNull(months0);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.setMillis((-1L));
        int int3 = mutableDateTime0.getDayOfWeek();
        int int4 = mutableDateTime0.getMinuteOfHour();
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusHours((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone6);
        org.joda.time.Chronology chronology8 = julianChronology7.withUTC();
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, (org.joda.time.Chronology) julianChronology7, locale9);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property13 = dateTime12.dayOfWeek();
        int int14 = dateTime12.getWeekyear();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime16 = dateTime12.plus(readableDuration15);
        org.joda.time.DateTime.Property property17 = dateTime16.era();
        boolean boolean18 = dateTimeParserBucket10.restoreState((java.lang.Object) property17);
        java.util.Locale locale19 = dateTimeParserBucket10.getLocale();
        java.lang.String str20 = property4.getAsShortText(locale19);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(julianChronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1970 + "'", int14 == 1970);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "365" + "'", str20, "365");
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MIN_VALUE;
        org.junit.Assert.assertNotNull(weeks0);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
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
        int int42 = offsetDateTimeField18.getMaximumValue(90L);
        long long44 = offsetDateTimeField18.roundHalfEven((long) 5);
        long long46 = offsetDateTimeField18.roundCeiling((-3600000L));
        long long48 = offsetDateTimeField18.roundFloor(259200090L);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-35) + "'", int42 == (-35));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-3600000L) + "'", long46 == (-3600000L));
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 259200000L + "'", long48 == 259200000L);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
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
        org.joda.time.DateTimeField dateTimeField13 = property11.getField();
        long long15 = dateTimeField13.roundHalfEven((long) (-35));
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(date5);
// flaky "26) test1159(RegressionTest2)":         org.junit.Assert.assertEquals(date5.toString(), "Wed Dec 31 19:00:00 EST 1969");
        org.junit.Assert.assertNotNull(yearMonthDay6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(yearMonthDay12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology2.weekyearOfCentury();
        org.joda.time.Period period5 = new org.joda.time.Period(obj0, (org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology2.year();
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.joda.time.Period period1 = org.joda.time.Period.hours(12);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        org.joda.time.Period period1 = org.joda.time.Period.days(7);
        org.joda.time.Period period3 = period1.plusMonths(60);
        org.joda.time.Period period5 = period3.minusDays((-86401));
        org.joda.time.Period period7 = period3.withYears((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours8 = period7.toStandardHours();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Hours as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = org.joda.time.DateTimeUtils.SYSTEM_MILLIS_PROVIDER;
        org.junit.Assert.assertNotNull(millisProvider0);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.addMonths((int) (short) 100);
        mutableDateTime0.setYear(26);
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
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) 4, (org.joda.time.Chronology) julianChronology18);
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight21.plusYears(100);
        mutableDateTime0.setDate((org.joda.time.ReadableInstant) dateMidnight23);
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight23.plusYears(59);
        org.joda.time.Minutes minutes27 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Duration duration28 = minutes27.toStandardDuration();
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight23.plus((org.joda.time.ReadablePeriod) minutes27);
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(julianChronology13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(julianChronology18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateMidnight23);
        org.junit.Assert.assertNotNull(dateMidnight26);
        org.junit.Assert.assertNotNull(minutes27);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(dateMidnight29);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(259200100L);
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.days();
        org.junit.Assert.assertNotNull(durationFieldType0);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property3 = dateTime1.property(dateTimeFieldType2);
        int int4 = dateTime1.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.JulianChronology julianChronology6 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone5);
        org.joda.time.MonthDay monthDay7 = org.joda.time.MonthDay.now((org.joda.time.Chronology) julianChronology6);
        org.joda.time.DateTimeZone dateTimeZone8 = julianChronology6.getZone();
        org.joda.time.DateTime dateTime9 = dateTime1.withZoneRetainFields(dateTimeZone8);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime1);
        int int11 = dateTime1.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(julianChronology6);
        org.junit.Assert.assertNotNull(monthDay7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Days days1 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType2 = days1.getFieldType();
        org.joda.time.LocalDate localDate4 = localDate0.withFieldAdded(durationFieldType2, 1);
        org.joda.time.DateTime dateTime5 = localDate4.toDateTimeAtStartOfDay();
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTime5);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusHours((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusMillis(2);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.withYear(6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.weekOfWeekyear();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.setDayOfYear(8);
        mutableDateTime0.addSeconds((int) (short) -1);
        mutableDateTime0.setMillisOfDay(1970);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime0.millisOfSecond();
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) ' ', 50, 23, (int) (byte) 1, (int) (short) 100, (-86401), 60, (int) (byte) -1);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
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
        boolean boolean23 = offsetDateTimeField18.isLeap(90L);
        int int25 = offsetDateTimeField18.getMaximumValue((long) 80);
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-35) + "'", int25 == (-35));
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime2 = property1.roundFloor();
        int int3 = mutableDateTime2.getYear();
        mutableDateTime2.addDays(1969);
        int int6 = mutableDateTime2.getWeekyear();
        mutableDateTime2.addWeekyears(10);
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(mutableDateTime2);
// flaky "27) test1173(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1970 + "'", int3 == 1970);
// flaky "6) test1173(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1975 + "'", int6 == 1975);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
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
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod();
        boolean boolean26 = mutablePeriod24.equals((java.lang.Object) (-1L));
        mutablePeriod24.setPeriod(86400000, 13, (int) (byte) -1, (int) ' ', 26, (-35), (int) (short) -1, (int) (short) 100);
        org.joda.time.Days days37 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType38 = days37.getFieldType();
        org.joda.time.PeriodType periodType39 = days37.getPeriodType();
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
        org.joda.time.Period period55 = new org.joda.time.Period((long) (byte) 0, periodType39, (org.joda.time.Chronology) julianChronology52);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology57 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone56);
        org.joda.time.DateMidnight dateMidnight58 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology57);
        org.joda.time.DateMidnight.Property property59 = dateMidnight58.dayOfYear();
        org.joda.time.DateMidnight dateMidnight60 = property59.roundHalfEvenCopy();
        org.joda.time.DateMidnight dateMidnight62 = dateMidnight60.plusWeeks((int) (byte) 10);
        org.joda.time.Days days63 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType64 = days63.getFieldType();
        org.joda.time.DateMidnight dateMidnight66 = dateMidnight62.withFieldAdded(durationFieldType64, 26);
        org.joda.time.Period period68 = period55.withFieldAdded(durationFieldType64, (int) (short) 1);
        boolean boolean69 = mutablePeriod24.isSupported(durationFieldType64);
        boolean boolean70 = periodType22.isSupported(durationFieldType64);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(days37);
        org.junit.Assert.assertNotNull(durationFieldType38);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(julianChronology47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(julianChronology52);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(gregorianChronology57);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(dateMidnight60);
        org.junit.Assert.assertNotNull(dateMidnight62);
        org.junit.Assert.assertNotNull(days63);
        org.junit.Assert.assertNotNull(durationFieldType64);
        org.junit.Assert.assertNotNull(dateMidnight66);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
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
        org.joda.time.DateMidnight.Property property11 = dateMidnight10.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusHours((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology18 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone17);
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology18);
        org.joda.time.DateMidnight.Property property20 = dateMidnight19.dayOfYear();
        org.joda.time.DateMidnight dateMidnight21 = property20.roundHalfEvenCopy();
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight21.plusWeeks((int) (byte) 10);
        org.joda.time.Days days24 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType25 = days24.getFieldType();
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight23.withFieldAdded(durationFieldType25, 26);
        boolean boolean28 = localDateTime15.isSupported(durationFieldType25);
        int int29 = property11.compareTo((org.joda.time.ReadablePartial) localDateTime15);
        org.joda.time.DateMidnight dateMidnight31 = property11.addToCopy(86400);
        org.joda.time.DateMidnight dateMidnight33 = property11.addWrapFieldToCopy(1969);
        org.joda.time.DateMidnight dateMidnight35 = dateMidnight33.withMillis((long) (-4));
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(property3);
// flaky "28) test1175(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(gregorianChronology18);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateMidnight21);
        org.junit.Assert.assertNotNull(dateMidnight23);
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertNotNull(dateMidnight27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
// flaky "7) test1175(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(dateMidnight31);
        org.junit.Assert.assertNotNull(dateMidnight33);
        org.junit.Assert.assertNotNull(dateMidnight35);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.Partial partial2 = new org.joda.time.Partial((org.joda.time.Chronology) gregorianChronology1);
        java.lang.String str3 = partial2.toStringList();
        org.joda.time.Chronology chronology4 = partial2.getChronology();
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chronology4);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay(1970, 7, 50);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 50 for dayOfMonth must not be larger than 31");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays(4544201088000000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 4544201088000000 * 86400000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
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
        org.joda.time.DateTimeZone dateTimeZone27 = julianChronology13.getZone();
        org.joda.time.DurationField durationField28 = julianChronology13.minutes();
        org.joda.time.DateTimeZone dateTimeZone29 = julianChronology13.getZone();
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
// flaky "29) test1180(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 71 + "'", int24 == 71);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
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
        org.joda.time.PeriodType periodType22 = periodType5.withDaysRemoved();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology24 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone23);
        org.joda.time.Days days25 = org.joda.time.Days.THREE;
        int[] intArray28 = gregorianChronology24.get((org.joda.time.ReadablePeriod) days25, (long) 0, (-1L));
        org.joda.time.DateTimeField dateTimeField29 = gregorianChronology24.dayOfMonth();
        org.joda.time.DurationField durationField30 = gregorianChronology24.weeks();
        org.joda.time.DateTime dateTime31 = org.joda.time.DateTime.now((org.joda.time.Chronology) gregorianChronology24);
        org.joda.time.DateTimeField dateTimeField32 = gregorianChronology24.yearOfCentury();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(0L, (long) 1, periodType22, (org.joda.time.Chronology) gregorianChronology24);
        org.joda.time.DateTimeField dateTimeField34 = gregorianChronology24.hourOfHalfday();
        org.joda.time.TimeOfDay timeOfDay35 = new org.joda.time.TimeOfDay((org.joda.time.Chronology) gregorianChronology24);
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
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(gregorianChronology24);
        org.junit.Assert.assertNotNull(days25);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 0 });
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField34);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
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
        org.joda.time.DateTimeField dateTimeField13 = property11.getField();
        org.joda.time.YearMonthDay yearMonthDay14 = property11.getYearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay16 = yearMonthDay14.minusMonths(1975);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(date5);
// flaky "30) test1182(RegressionTest2)":         org.junit.Assert.assertEquals(date5.toString(), "Wed Dec 31 19:00:00 EST 1969");
        org.junit.Assert.assertNotNull(yearMonthDay6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(yearMonthDay12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(yearMonthDay14);
        org.junit.Assert.assertNotNull(yearMonthDay16);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property6 = dateTime4.property(dateTimeFieldType5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.chrono.JulianChronology julianChronology8 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone7);
        org.joda.time.Chronology chronology9 = julianChronology8.withUTC();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType5.getField((org.joda.time.Chronology) julianChronology8);
        org.joda.time.MutableInterval mutableInterval11 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology8);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) (short) -1, (org.joda.time.Chronology) julianChronology8);
        int int13 = localDateTime12.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withMonthOfYear(2);
        org.joda.time.LocalDateTime.Property property16 = localDateTime12.millisOfDay();
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(julianChronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1969 + "'", int13 == 1969);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property2 = dateTime1.dayOfWeek();
        int int3 = dateTime1.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone4);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology5);
        org.joda.time.DateMidnight.Property property7 = dateMidnight6.dayOfYear();
        org.joda.time.Period period8 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime1, (org.joda.time.ReadableInstant) dateMidnight6);
        int int9 = dateMidnight6.getYearOfEra();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(property7);
// flaky "31) test1184(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusMinutes((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusWeeks(1970);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusMinutes(2);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withDayOfYear((int) ' ');
        org.joda.time.LocalDateTime.Property property10 = localDateTime5.yearOfCentury();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(6, 6, 3600);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3600 for secondOfMinute must not be larger than 59");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone1);
        org.joda.time.Days days3 = org.joda.time.Days.THREE;
        int[] intArray6 = gregorianChronology2.get((org.joda.time.ReadablePeriod) days3, (long) 0, (-1L));
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology2.dayOfMonth();
        org.joda.time.DurationField durationField8 = gregorianChronology2.millis();
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) 26, (org.joda.time.Chronology) gregorianChronology2, locale9);
        org.joda.time.Chronology chronology11 = gregorianChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology2.year();
        org.joda.time.DateTimeField dateTimeField13 = gregorianChronology2.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField15 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField13, dateTimeFieldType14);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusMinutes((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.minusSeconds((int) (short) 0);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property25 = dateTime23.property(dateTimeFieldType24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.chrono.JulianChronology julianChronology27 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone26);
        org.joda.time.Chronology chronology28 = julianChronology27.withUTC();
        org.joda.time.DateTimeField dateTimeField29 = dateTimeFieldType24.getField((org.joda.time.Chronology) julianChronology27);
        org.joda.time.DurationField durationField30 = julianChronology27.halfdays();
        org.joda.time.Period period33 = new org.joda.time.Period((long) 31, (long) 25);
        int[] intArray35 = julianChronology27.get((org.joda.time.ReadablePeriod) period33, (-1924473598031L));
        int int36 = zeroIsMaxDateTimeField15.getMinimumValue((org.joda.time.ReadablePartial) localDateTime21, intArray35);
        int int38 = zeroIsMaxDateTimeField15.getMinimumValue((long) 50);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0 });
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(julianChronology27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { 0, 0, (-3181), (-6), (-23), (-59), (-58), (-31) });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 9);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.LocalDate localDate3 = localDate0.plusDays(20179);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra(5999999);
        int int6 = localDate3.getYearOfCentury();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
// flaky "32) test1189(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusMinutes((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusWeeks(1970);
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusMinutes((int) (byte) 100);
        org.joda.time.Hours hours10 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadablePartial) localDateTime5, (org.joda.time.ReadablePartial) localDateTime7);
        int int11 = localDateTime5.size();
        org.joda.time.LocalDateTime.Property property12 = localDateTime5.millisOfDay();
        org.joda.time.LocalDateTime localDateTime13 = property12.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int15 = localDateTime13.get(dateTimeFieldType14);
        int int16 = localDateTime13.getDayOfWeek();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 39 + "'", int15 == 39);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology8 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone7);
        org.joda.time.Partial partial9 = new org.joda.time.Partial((org.joda.time.Chronology) gregorianChronology8);
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology8.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField11 = gregorianChronology8.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(3600, (-4), (int) (short) 100, 292271022, 6240, 1970, (int) (short) 100, (org.joda.time.Chronology) gregorianChronology8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292271022 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology8);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property2 = dateTime1.dayOfWeek();
        int int3 = dateTime1.getWeekyear();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime1.plus(readableDuration4);
        org.joda.time.DateTime.Property property6 = dateTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology8 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone7);
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology8);
        org.joda.time.DateMidnight.Property property10 = dateMidnight9.dayOfYear();
        org.joda.time.DateMidnight dateMidnight11 = property10.roundHalfEvenCopy();
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight11.plusWeeks((int) (byte) 10);
        boolean boolean14 = dateTime1.isEqual((org.joda.time.ReadableInstant) dateMidnight11);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight11.withField(dateTimeFieldType15, (int) (byte) 0);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1970 + "'", int3 == 1970);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(gregorianChronology8);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(dateMidnight17);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
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
        org.joda.time.Period period16 = period8.withWeeks((int) (short) -1);
        org.joda.time.Period period18 = period16.withSeconds(9);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod();
        boolean boolean2 = mutablePeriod0.equals((java.lang.Object) (-1L));
        int int3 = mutablePeriod0.getSeconds();
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod();
        boolean boolean6 = mutablePeriod4.equals((java.lang.Object) (-1L));
        mutablePeriod4.addYears(100);
        org.joda.time.format.PeriodFormatter periodFormatter9 = org.joda.time.format.ISOPeriodFormat.alternate();
        java.lang.String str10 = mutablePeriod4.toString(periodFormatter9);
        java.lang.String str11 = mutablePeriod0.toString(periodFormatter9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(periodFormatter9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "P01000000T000000" + "'", str10, "P01000000T000000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "P00000000T000000" + "'", str11, "P00000000T000000");
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) 7);
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.Partial partial2 = new org.joda.time.Partial((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DurationField durationField3 = gregorianChronology1.centuries();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfWeek();
        int int7 = dateTime5.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology9 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone8);
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology9);
        org.joda.time.DateMidnight.Property property11 = dateMidnight10.dayOfYear();
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableInstant) dateMidnight10);
        org.joda.time.DateTime dateTime13 = dateTime5.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology15 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((java.lang.Object) dateTimeZone14, dateTimeZone16);
        int int18 = mutableDateTime17.getRoundingMode();
        mutableDateTime17.addWeekyears((int) '4');
        mutableDateTime17.addHours((int) (short) 1);
        mutableDateTime17.setMillisOfDay(100);
        int int25 = dateTime13.compareTo((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology27 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone26);
        org.joda.time.Days days28 = org.joda.time.Days.THREE;
        int[] intArray31 = gregorianChronology27.get((org.joda.time.ReadablePeriod) days28, (long) 0, (-1L));
        org.joda.time.Duration duration32 = days28.toStandardDuration();
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property35 = dateTime34.dayOfWeek();
        int int36 = dateTime34.getWeekyear();
        int int37 = dateTime34.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology39 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone38);
        org.joda.time.Days days40 = org.joda.time.Days.THREE;
        int[] intArray43 = gregorianChronology39.get((org.joda.time.ReadablePeriod) days40, (long) 0, (-1L));
        org.joda.time.Duration duration44 = days40.toStandardDuration();
        org.joda.time.DateTime dateTime46 = dateTime34.withDurationAdded((org.joda.time.ReadableDuration) duration44, 26);
        boolean boolean47 = duration32.isShorterThan((org.joda.time.ReadableDuration) duration44);
        org.joda.time.Duration duration48 = duration32.negated();
        org.joda.time.PeriodType periodType49 = org.joda.time.PeriodType.millis();
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime17, (org.joda.time.ReadableDuration) duration32, periodType49);
        long long53 = gregorianChronology1.add((org.joda.time.ReadablePeriod) mutablePeriod50, (long) 100, (int) (byte) 1);
        mutablePeriod50.setPeriod((long) (short) 0, (long) 1440);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(gregorianChronology9);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(gregorianChronology15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(gregorianChronology27);
        org.junit.Assert.assertNotNull(days28);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1970 + "'", int36 == 1970);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(gregorianChronology39);
        org.junit.Assert.assertNotNull(days40);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertNotNull(periodType49);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 259200100L + "'", long53 == 259200100L);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod();
        org.joda.time.ReadableInterval readableInterval1 = null;
        mutablePeriod0.add(readableInterval1);
        mutablePeriod0.addHours(26);
        mutablePeriod0.addMillis(60);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfMonth((int) (byte) 1);
        org.joda.time.TimeOfDay timeOfDay4 = dateTime3.toTimeOfDay();
        org.joda.time.DateTime dateTime5 = timeOfDay4.toDateTimeToday();
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths(0);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property7 = dateTime5.property(dateTimeFieldType6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.JulianChronology julianChronology9 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone8);
        org.joda.time.Chronology chronology10 = julianChronology9.withUTC();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType6.getField((org.joda.time.Chronology) julianChronology9);
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology9);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.chrono.JulianChronology julianChronology15 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone14);
        org.joda.time.Chronology chronology16 = julianChronology15.withUTC();
        java.util.Locale locale17 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, (org.joda.time.Chronology) julianChronology15, locale17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology20 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone19);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology20);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology23 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone22);
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology23);
        org.joda.time.DateTimeField dateTimeField25 = gregorianChronology23.weekyearOfCentury();
        int int26 = dateMidnight21.get(dateTimeField25);
        org.joda.time.field.SkipDateTimeField skipDateTimeField27 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) julianChronology15, dateTimeField25);
        mutableInterval12.setChronology((org.joda.time.Chronology) julianChronology15);
        org.joda.time.DateTimeZone dateTimeZone29 = julianChronology15.getZone();
        org.joda.time.Interval interval30 = new org.joda.time.Interval((long) 22, (long) 86400000, dateTimeZone29);
        long long32 = dateTimeZone29.nextTransition((long) 32);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(julianChronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(julianChronology15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(gregorianChronology20);
        org.junit.Assert.assertNotNull(gregorianChronology23);
        org.junit.Assert.assertNotNull(dateTimeField25);
// flaky "33) test1199(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 71 + "'", int26 == 71);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 32L + "'", long32 == 32L);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
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
        long long40 = preciseDateTimeField36.roundCeiling((-61565702399975L));
        // The following exception was thrown during execution in test generation
        try {
            long long43 = preciseDateTimeField36.set(82800000L, 1975);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1975 for millisOfSecond must be in the range [0,11]");
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
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-61565698800000L) + "'", long40 == (-61565698800000L));
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.ONE;
        int int1 = weeks0.getWeeks();
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth(101L);
        org.joda.time.Weeks weeks4 = org.joda.time.Weeks.ZERO;
        org.joda.time.YearMonth yearMonth5 = yearMonth3.plus((org.joda.time.ReadablePeriod) weeks4);
        org.joda.time.Weeks weeks6 = weeks0.plus(weeks4);
        org.joda.time.Weeks weeks7 = org.joda.time.Weeks.ZERO;
        boolean boolean8 = weeks0.isLessThan(weeks7);
        org.joda.time.Weeks weeks10 = weeks0.minus(5999999);
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(weeks10);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.dayOfYear();
        java.lang.String str4 = property3.getAsString();
        org.joda.time.DateMidnight dateMidnight6 = property3.addToCopy((long) 25);
        boolean boolean7 = property3.isLeap();
        org.joda.time.DateMidnight dateMidnight9 = property3.setCopy("1");
        org.joda.time.DateMidnight dateMidnight10 = property3.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(property3);
// flaky "34) test1202(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(dateMidnight10);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        org.joda.time.YearMonth yearMonth1 = new org.joda.time.YearMonth(101L);
        org.joda.time.YearMonth.Property property2 = yearMonth1.year();
        int int3 = yearMonth1.size();
        int int4 = yearMonth1.getYear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1970 + "'", int4 == 1970);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.printZeroNever();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder2 = periodFormatterBuilder0.appendMonths();
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder2);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
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
        org.joda.time.LocalTime localTime44 = property41.addCopy(86400);
        org.joda.time.LocalTime localTime46 = localTime44.plusSeconds((-20274));
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
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(localTime46);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.setDayOfYear(8);
        mutableDateTime0.setWeekOfWeekyear(13);
        mutableDateTime0.setTime((long) 4);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime0.dayOfMonth();
        mutableDateTime0.addYears(0);
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicWeekDate();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusMinutes((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusWeeks(1970);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusMinutes((int) (byte) 100);
        org.joda.time.Hours hours11 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadablePartial) localDateTime6, (org.joda.time.ReadablePartial) localDateTime8);
        int int12 = localDateTime6.getEra();
        java.lang.String str13 = dateTimeFormatter0.print((org.joda.time.ReadablePartial) localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(hours11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1932W134" + "'", str13, "1932W134");
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.Days days2 = org.joda.time.Days.THREE;
        int[] intArray5 = gregorianChronology1.get((org.joda.time.ReadablePeriod) days2, (long) 0, (-1L));
        java.lang.String str6 = gregorianChronology1.toString();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod();
        org.joda.time.Days days8 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType9 = days8.getFieldType();
        org.joda.time.PeriodType periodType10 = days8.getPeriodType();
        mutablePeriod7.add((org.joda.time.ReadablePeriod) days8);
        int int12 = mutablePeriod7.getMillis();
        long long15 = gregorianChronology1.add((org.joda.time.ReadablePeriod) mutablePeriod7, (long) 19, 3600);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0 });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GregorianChronology[UTC]" + "'", str6, "GregorianChronology[UTC]");
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 933120000019L + "'", long15 == 933120000019L);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.setDayOfYear(8);
        mutableDateTime0.addSeconds((int) (short) -1);
        mutableDateTime0.setDate((long) 2070);
        org.junit.Assert.assertNotNull(mutableDateTime0);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property13 = dateTime11.property(dateTimeFieldType12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.chrono.JulianChronology julianChronology15 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone14);
        org.joda.time.Chronology chronology16 = julianChronology15.withUTC();
        org.joda.time.DateTimeField dateTimeField17 = dateTimeFieldType12.getField((org.joda.time.Chronology) julianChronology15);
        org.joda.time.MutableInterval mutableInterval18 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology15);
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) (short) -1, (org.joda.time.Chronology) julianChronology15);
        org.joda.time.DateTimeZone dateTimeZone20 = julianChronology15.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology21 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(60, (int) (short) 1, 50, 10080, 70, 2070, (int) (short) -1, dateTimeZone20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10080 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(julianChronology15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(iSOChronology21);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property4 = dateTime2.property(dateTimeFieldType3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.JulianChronology julianChronology6 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone5);
        org.joda.time.Chronology chronology7 = julianChronology6.withUTC();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType3.getField((org.joda.time.Chronology) julianChronology6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.Chronology chronology10 = julianChronology6.withZone(dateTimeZone9);
        org.joda.time.chrono.StrictChronology strictChronology11 = org.joda.time.chrono.StrictChronology.getInstance(chronology10);
        org.joda.time.YearMonth yearMonth12 = new org.joda.time.YearMonth((long) 1970, (org.joda.time.Chronology) strictChronology11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = yearMonth12.toString("P-1W");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(julianChronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(strictChronology11);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
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
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay16.plusMillis((int) (byte) 10);
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
        org.junit.Assert.assertNotNull(timeOfDay20);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
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
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate();
        org.joda.time.Days days25 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType26 = days25.getFieldType();
        org.joda.time.LocalDate localDate28 = localDate24.withFieldAdded(durationFieldType26, 1);
        org.joda.time.DateTime dateTime30 = dateTime22.withFieldAdded(durationFieldType26, 50);
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
        org.junit.Assert.assertNotNull(days25);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(dateTime30);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.dayOfYear();
        java.lang.String str4 = property3.getAsString();
        org.joda.time.DateMidnight dateMidnight6 = property3.addToCopy((long) 25);
        boolean boolean7 = property3.isLeap();
        org.joda.time.DateMidnight dateMidnight8 = property3.roundCeilingCopy();
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(property3);
// flaky "35) test1214(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateMidnight8);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
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
        org.joda.time.DateTimeField dateTimeField14 = julianChronology5.weekyear();
        org.joda.time.DateTimeField dateTimeField15 = julianChronology5.centuryOfEra();
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(julianChronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 0, 0, (-3181), (-6), (-23), (-59), (-58), (-31) });
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("Wednesday", 1000);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder11 = dateTimeZoneBuilder0.addCutover(2025, '#', 2, 20179, (int) (short) 10, true, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
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
        long long19 = skipDateTimeField14.set((long) 1969, (int) (byte) 10);
        java.lang.String str21 = skipDateTimeField14.getAsShortText((long) 2);
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.plusHours((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.dayOfYear();
        org.joda.time.LocalDateTime.Property property27 = localDateTime25.dayOfMonth();
        int int28 = localDateTime25.getEra();
        org.joda.time.LocalDateTime.Property property29 = localDateTime25.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.chrono.JulianChronology julianChronology32 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone31);
        org.joda.time.Chronology chronology33 = julianChronology32.withUTC();
        java.util.Locale locale34 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, (org.joda.time.Chronology) julianChronology32, locale34);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology37 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone36);
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology37);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology40 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone39);
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology40);
        org.joda.time.DateTimeField dateTimeField42 = gregorianChronology40.weekyearOfCentury();
        int int43 = dateMidnight38.get(dateTimeField42);
        org.joda.time.field.SkipDateTimeField skipDateTimeField44 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) julianChronology32, dateTimeField42);
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property49 = dateTime48.dayOfWeek();
        int int50 = dateTime48.getWeekyear();
        int int51 = dateTime48.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology53 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone52);
        org.joda.time.Days days54 = org.joda.time.Days.THREE;
        int[] intArray57 = gregorianChronology53.get((org.joda.time.ReadablePeriod) days54, (long) 0, (-1L));
        org.joda.time.Duration duration58 = days54.toStandardDuration();
        org.joda.time.DateTime dateTime60 = dateTime48.withDurationAdded((org.joda.time.ReadableDuration) duration58, 26);
        org.joda.time.Duration duration62 = duration58.multipliedBy((long) (short) 1);
        org.joda.time.Duration duration63 = duration62.toDuration();
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property66 = dateTime65.dayOfWeek();
        org.joda.time.format.PeriodFormatter periodFormatter67 = org.joda.time.format.ISOPeriodFormat.alternateExtended();
        org.joda.time.PeriodType periodType68 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.format.PeriodFormatter periodFormatter69 = periodFormatter67.withParseType(periodType68);
        org.joda.time.Period period70 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration62, (org.joda.time.ReadableInstant) dateTime65, periodType68);
        java.lang.String str71 = dateTime65.toString();
        org.joda.time.format.PeriodFormatter periodFormatter73 = org.joda.time.format.PeriodFormat.wordBased();
        java.util.Locale locale74 = periodFormatter73.getLocale();
        java.lang.String str75 = dateTime65.toString("00:01:37.035", locale74);
        long long76 = skipDateTimeField44.set((long) 32, "60", locale74);
        java.lang.String str77 = skipDateTimeField14.getAsShortText((org.joda.time.ReadablePartial) localDateTime25, locale74);
        org.joda.time.LocalDate localDate78 = new org.joda.time.LocalDate();
        // The following exception was thrown during execution in test generation
        try {
            int int79 = localDateTime25.compareTo((org.joda.time.ReadablePartial) localDate78);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(gregorianChronology7);
        org.junit.Assert.assertNotNull(gregorianChronology10);
        org.junit.Assert.assertNotNull(dateTimeField12);
// flaky "36) test1217(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 71 + "'", int13 == 71);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1924473598031L) + "'", long19 == (-1924473598031L));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "71" + "'", str21, "71");
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(julianChronology32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(gregorianChronology37);
        org.junit.Assert.assertNotNull(gregorianChronology40);
        org.junit.Assert.assertNotNull(dateTimeField42);
// flaky "8) test1217(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int43 + "' != '" + 71 + "'", int43 == 71);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1970 + "'", int50 == 1970);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(gregorianChronology53);
        org.junit.Assert.assertNotNull(days54);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration58);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(duration62);
        org.junit.Assert.assertNotNull(duration63);
        org.junit.Assert.assertNotNull(property66);
        org.junit.Assert.assertNotNull(periodFormatter67);
        org.junit.Assert.assertNotNull(periodType68);
        org.junit.Assert.assertNotNull(periodFormatter69);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "1970-01-01T00:00:00.001Z" + "'", str71, "1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(periodFormatter73);
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "00:01:37.035" + "'", str75, "00:01:37.035");
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + (-347155199968L) + "'", long76 == (-347155199968L));
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "69" + "'", str77, "69");
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withYearOfEra(10);
        org.joda.time.LocalDate.Property property3 = localDate0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = property3.getField();
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        java.lang.String str0 = org.joda.time.DateTimeZone.DEFAULT_TZ_DATA_PATH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "org/joda/time/tz/data" + "'", str0, "org/joda/time/tz/data");
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        java.lang.Number number1 = null;
        org.joda.time.IllegalFieldValueException illegalFieldValueException4 = new org.joda.time.IllegalFieldValueException("", number1, (java.lang.Number) 70067048, (java.lang.Number) 100.0d);
        java.lang.Number number5 = illegalFieldValueException4.getUpperBound();
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 100.0d + "'", number5, 100.0d);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours1 = org.joda.time.Hours.parseHours("\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"??1970?\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.ONE;
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.plus((org.joda.time.ReadablePeriod) weeks3);
        java.util.Date date5 = dateMidnight2.toDate();
        org.joda.time.TimeOfDay timeOfDay6 = org.joda.time.TimeOfDay.fromDateFields(date5);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(date5);
// flaky "37) test1222(RegressionTest2)":         org.junit.Assert.assertEquals(date5.toString(), "Wed Dec 31 19:00:00 EST 1969");
        org.junit.Assert.assertNotNull(timeOfDay6);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.ONE;
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.plus((org.joda.time.ReadablePeriod) weeks3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.plusWeeks((int) (short) 100);
        org.joda.time.DateMidnight.Property property7 = dateMidnight6.weekyear();
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
        org.joda.time.LocalTime.Property property20 = localTime19.secondOfMinute();
        org.joda.time.LocalTime localTime22 = property20.addCopy(86400000L);
        boolean boolean23 = dateMidnight6.equals((java.lang.Object) 86400000L);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(julianChronology14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology1.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.JulianChronology julianChronology6 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone5);
        org.joda.time.Chronology chronology7 = julianChronology6.withUTC();
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, (org.joda.time.Chronology) julianChronology6, locale8);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property12 = dateTime11.dayOfWeek();
        int int13 = dateTime11.getWeekyear();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime15 = dateTime11.plus(readableDuration14);
        org.joda.time.DateTime.Property property16 = dateTime15.era();
        boolean boolean17 = dateTimeParserBucket9.restoreState((java.lang.Object) property16);
        org.joda.time.DateTimeZone dateTimeZone18 = dateTimeParserBucket9.getZone();
        long long22 = dateTimeZone18.convertLocalToUTC(26L, true, 1L);
        org.joda.time.Chronology chronology23 = gregorianChronology1.withZone(dateTimeZone18);
        int int25 = dateTimeZone18.getStandardOffset((long) 59);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.EthiopicChronology ethiopicChronology27 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone18, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(julianChronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1970 + "'", int13 == 1970);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 26L + "'", long22 == 26L);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.MIN_VALUE;
        org.joda.time.Seconds seconds2 = seconds0.plus((int) (byte) 0);
        org.joda.time.DurationFieldType durationFieldType3 = seconds2.getFieldType();
        org.joda.time.Seconds seconds4 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds6 = seconds4.minus(7);
        org.joda.time.Seconds seconds7 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds9 = seconds7.minus(7);
        boolean boolean10 = seconds4.isGreaterThan(seconds7);
        boolean boolean11 = seconds2.isGreaterThan(seconds4);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusMinutes((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minusDays(19);
        int int18 = localDateTime17.getSecondOfMinute();
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property22 = dateTime20.property(dateTimeFieldType21);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.chrono.JulianChronology julianChronology24 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone23);
        org.joda.time.Chronology chronology25 = julianChronology24.withUTC();
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType21.getField((org.joda.time.Chronology) julianChronology24);
        int int27 = localDateTime17.indexOf(dateTimeFieldType21);
        org.joda.time.DurationFieldType durationFieldType28 = dateTimeFieldType21.getRangeDurationType();
        int int29 = seconds4.get(durationFieldType28);
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 59 + "'", int18 == 59);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(julianChronology24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(durationFieldType28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
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
        org.joda.time.Period period16 = period8.withWeeks((int) (short) -1);
        int int17 = period8.getMonths();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
// flaky "38) test1226(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        org.joda.time.YearMonth yearMonth1 = new org.joda.time.YearMonth(101L);
        org.joda.time.YearMonth.Property property2 = yearMonth1.year();
        int int3 = yearMonth1.size();
        org.joda.time.YearMonth yearMonth5 = yearMonth1.plusYears((-19));
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(yearMonth5);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        org.joda.time.format.PeriodFormatter periodFormatter0 = org.joda.time.format.ISOPeriodFormat.alternateExtended();
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.format.PeriodFormatter periodFormatter2 = periodFormatter0.withParseType(periodType1);
        org.joda.time.PeriodType periodType3 = periodFormatter2.getParseType();
        boolean boolean4 = periodFormatter2.isParser();
        org.junit.Assert.assertNotNull(periodFormatter0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodFormatter2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
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
        org.joda.time.Days days21 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType22 = days21.getFieldType();
        org.joda.time.PeriodType periodType23 = days21.getPeriodType();
        boolean boolean24 = periodType4.equals((java.lang.Object) periodType23);
        org.joda.time.Period period25 = new org.joda.time.Period((long) 13, periodType23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period27 = period25.minusHours(23);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
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
        mutablePeriod5.clear();
        mutablePeriod5.setMonths(70067048);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology15 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone14);
        org.joda.time.Days days16 = org.joda.time.Days.THREE;
        int[] intArray19 = gregorianChronology15.get((org.joda.time.ReadablePeriod) days16, (long) 0, (-1L));
        org.joda.time.Duration duration20 = days16.toStandardDuration();
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
        boolean boolean35 = duration20.isShorterThan((org.joda.time.ReadableDuration) duration32);
        org.joda.time.Duration duration37 = duration32.plus(90L);
        org.joda.time.Duration duration39 = duration37.withMillis((-1512000000L));
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology41 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone40);
        org.joda.time.Partial partial42 = new org.joda.time.Partial((org.joda.time.Chronology) gregorianChronology41);
        org.joda.time.DurationField durationField43 = gregorianChronology41.centuries();
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property46 = dateTime45.dayOfWeek();
        int int47 = dateTime45.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology49 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone48);
        org.joda.time.DateMidnight dateMidnight50 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology49);
        org.joda.time.DateMidnight.Property property51 = dateMidnight50.dayOfYear();
        org.joda.time.Period period52 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime45, (org.joda.time.ReadableInstant) dateMidnight50);
        org.joda.time.DateTime dateTime53 = dateTime45.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology55 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone54);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime((java.lang.Object) dateTimeZone54, dateTimeZone56);
        int int58 = mutableDateTime57.getRoundingMode();
        mutableDateTime57.addWeekyears((int) '4');
        mutableDateTime57.addHours((int) (short) 1);
        mutableDateTime57.setMillisOfDay(100);
        int int65 = dateTime53.compareTo((org.joda.time.ReadableInstant) mutableDateTime57);
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology67 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone66);
        org.joda.time.Days days68 = org.joda.time.Days.THREE;
        int[] intArray71 = gregorianChronology67.get((org.joda.time.ReadablePeriod) days68, (long) 0, (-1L));
        org.joda.time.Duration duration72 = days68.toStandardDuration();
        org.joda.time.DateTime dateTime74 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property75 = dateTime74.dayOfWeek();
        int int76 = dateTime74.getWeekyear();
        int int77 = dateTime74.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone78 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology79 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone78);
        org.joda.time.Days days80 = org.joda.time.Days.THREE;
        int[] intArray83 = gregorianChronology79.get((org.joda.time.ReadablePeriod) days80, (long) 0, (-1L));
        org.joda.time.Duration duration84 = days80.toStandardDuration();
        org.joda.time.DateTime dateTime86 = dateTime74.withDurationAdded((org.joda.time.ReadableDuration) duration84, 26);
        boolean boolean87 = duration72.isShorterThan((org.joda.time.ReadableDuration) duration84);
        org.joda.time.Duration duration88 = duration72.negated();
        org.joda.time.PeriodType periodType89 = org.joda.time.PeriodType.millis();
        org.joda.time.MutablePeriod mutablePeriod90 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime57, (org.joda.time.ReadableDuration) duration72, periodType89);
        long long93 = gregorianChronology41.add((org.joda.time.ReadablePeriod) mutablePeriod90, (long) 100, (int) (byte) 1);
        mutablePeriod5.setPeriod((org.joda.time.ReadableDuration) duration39, (org.joda.time.Chronology) gregorianChronology41);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(property3);
// flaky "39) test1231(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(gregorianChronology15);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1970 + "'", int24 == 1970);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(gregorianChronology27);
        org.junit.Assert.assertNotNull(days28);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(gregorianChronology41);
        org.junit.Assert.assertNotNull(durationField43);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(gregorianChronology49);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(gregorianChronology55);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(gregorianChronology67);
        org.junit.Assert.assertNotNull(days68);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertArrayEquals(intArray71, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration72);
        org.junit.Assert.assertNotNull(property75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1970 + "'", int76 == 1970);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(gregorianChronology79);
        org.junit.Assert.assertNotNull(days80);
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertArrayEquals(intArray83, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration84);
        org.junit.Assert.assertNotNull(dateTime86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(duration88);
        org.junit.Assert.assertNotNull(periodType89);
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 259200100L + "'", long93 == 259200100L);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay(5, 13, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 13 for monthOfYear must not be larger than 12");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property3 = dateTime1.property(dateTimeFieldType2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.JulianChronology julianChronology5 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone4);
        org.joda.time.Chronology chronology6 = julianChronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType2.getField((org.joda.time.Chronology) julianChronology5);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeField7.getAsShortText((int) (byte) 0, locale9);
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
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property32 = dateTime30.property(dateTimeFieldType31);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.chrono.JulianChronology julianChronology34 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone33);
        org.joda.time.Chronology chronology35 = julianChronology34.withUTC();
        org.joda.time.DateTimeField dateTimeField36 = dateTimeFieldType31.getField((org.joda.time.Chronology) julianChronology34);
        org.joda.time.MutableInterval mutableInterval37 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology34);
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((long) (short) -1, (org.joda.time.Chronology) julianChronology34);
        java.util.Locale locale40 = null;
        java.lang.String str41 = skipDateTimeField25.getAsText((org.joda.time.ReadablePartial) localDateTime38, 0, locale40);
        org.joda.time.DurationField durationField42 = skipDateTimeField25.getRangeDurationField();
        org.joda.time.Days days43 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType44 = days43.getFieldType();
        org.joda.time.field.ScaledDurationField scaledDurationField46 = new org.joda.time.field.ScaledDurationField(durationField42, durationFieldType44, 1440);
        long long48 = durationField42.getValueAsLong((long) 9);
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField51 = new org.joda.time.field.DividedDateTimeField(dateTimeField7, durationField42, dateTimeFieldType49, 19);
        boolean boolean53 = dividedDateTimeField51.isLeap(0L);
        long long55 = dividedDateTimeField51.roundHalfEven(97L);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(julianChronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(julianChronology13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(gregorianChronology18);
        org.junit.Assert.assertNotNull(gregorianChronology21);
        org.junit.Assert.assertNotNull(dateTimeField23);
// flaky "40) test1233(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 71 + "'", int24 == 71);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(julianChronology34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "0" + "'", str41, "0");
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertNotNull(days43);
        org.junit.Assert.assertNotNull(durationFieldType44);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertNotNull(dateTimeFieldType49);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
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
        int int42 = offsetDateTimeField18.getMaximumValue(90L);
        java.lang.String str43 = offsetDateTimeField18.toString();
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-35) + "'", int42 == (-35));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "DateTimeField[hourOfHalfday]" + "'", str43, "DateTimeField[hourOfHalfday]");
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
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
        org.joda.time.Duration duration23 = org.joda.time.Duration.standardHours((long) 26);
        org.joda.time.Duration duration24 = duration16.plus((org.joda.time.ReadableDuration) duration23);
        long long25 = org.joda.time.DateTimeUtils.getDurationMillis((org.joda.time.ReadableDuration) duration16);
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
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 259200000L + "'", long25 == 259200000L);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusHours((int) (byte) -1);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.LocalDate localDate7 = localDate4.plusDays(20179);
        java.lang.String str8 = localDate7.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = localDateTime3.compareTo((org.joda.time.ReadablePartial) localDate7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(localDate7);
// flaky "41) test1236(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2025-04-01" + "'", str8, "2025-04-01");
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfWeek();
        org.joda.time.DateTime dateTime4 = property3.roundHalfFloorCopy();
        int int5 = dateTimeZone0.getOffset((org.joda.time.ReadableInstant) dateTime4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = dateTime4.withHourOfDay((-86401));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -86401 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusMinutes((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusWeeks(1970);
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusMinutes((int) (byte) 100);
        org.joda.time.Hours hours10 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadablePartial) localDateTime5, (org.joda.time.ReadablePartial) localDateTime7);
        int int11 = localDateTime5.size();
        int int12 = localDateTime5.getCenturyOfEra();
        boolean boolean13 = org.joda.time.DateTimeUtils.isContiguous((org.joda.time.ReadablePartial) localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 19 + "'", int12 == 19);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property3 = dateTime1.property(dateTimeFieldType2);
        int int4 = dateTime1.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.JulianChronology julianChronology6 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone5);
        org.joda.time.MonthDay monthDay7 = org.joda.time.MonthDay.now((org.joda.time.Chronology) julianChronology6);
        org.joda.time.DateTimeZone dateTimeZone8 = julianChronology6.getZone();
        org.joda.time.DateTime dateTime9 = dateTime1.withZoneRetainFields(dateTimeZone8);
        long long11 = dateTimeZone8.convertUTCToLocal(2746894413240000000L);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(julianChronology6);
        org.junit.Assert.assertNotNull(monthDay7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2746894413240000000L + "'", long11 == 2746894413240000000L);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        java.lang.Number number1 = null;
        org.joda.time.IllegalFieldValueException illegalFieldValueException4 = new org.joda.time.IllegalFieldValueException("DurationField[halfdays]", number1, (java.lang.Number) (-1L), (java.lang.Number) 31);
        java.lang.String str5 = illegalFieldValueException4.getFieldName();
        java.lang.Throwable[] throwableArray6 = illegalFieldValueException4.getSuppressed();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DurationField[halfdays]" + "'", str5, "DurationField[halfdays]");
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.IllegalFieldValueException illegalFieldValueException4 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType0, (java.lang.Number) 100.0d, (java.lang.Number) 100, (java.lang.Number) 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.parse("69");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"69\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromCalendarFields(calendar0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The calendar must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.addMonths((int) (short) 100);
        mutableDateTime0.setMillisOfSecond(2);
        org.junit.Assert.assertNotNull(mutableDateTime0);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
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
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology14 = localDate13.getChronology();
        org.joda.time.LocalDate localDate16 = localDate13.plusDays(20179);
        org.joda.time.LocalDate localDate18 = localDate16.withMonthOfYear(7);
        int int19 = localDate16.getYearOfCentury();
        int[] intArray21 = strictChronology10.get((org.joda.time.ReadablePartial) localDate16, (long) 20179);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.Chronology chronology23 = strictChronology10.withZone(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(julianChronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(strictChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
// flaky "42) test1246(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 25 + "'", int19 == 25);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 1969, 12, 19 });
        org.junit.Assert.assertNotNull(chronology23);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
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
        int int15 = localDateTime3.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime3.plusSeconds((int) '4');
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 82799999 + "'", int15 == 82799999);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        org.joda.time.Days days0 = org.joda.time.Days.MIN_VALUE;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours1 = days0.toStandardHours();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -2147483648 * 24");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days0);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
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
        long long23 = skipDateTimeField14.remainder((long) 60);
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(gregorianChronology7);
        org.junit.Assert.assertNotNull(gregorianChronology10);
        org.junit.Assert.assertNotNull(dateTimeField12);
// flaky "43) test1249(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 71 + "'", int13 == 71);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "26" + "'", str18, "26");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 410659200097L + "'", long21 == 410659200097L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 259200060L + "'", long23 == 259200060L);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
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
        org.joda.time.MutableInterval mutableInterval63 = new org.joda.time.MutableInterval((long) (byte) 10, (long) 10);
        boolean boolean64 = mutableInterval10.isEqual((org.joda.time.ReadableInterval) mutableInterval63);
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
// flaky "44) test1250(RegressionTest2)":         org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
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
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
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
        int int21 = localDateTime18.getYearOfEra();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1969 + "'", int21 == 1969);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
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
        org.joda.time.Months months32 = org.joda.time.Months.TWELVE;
        org.joda.time.DurationFieldType durationFieldType33 = months32.getFieldType();
        org.joda.time.field.ScaledDurationField scaledDurationField35 = new org.joda.time.field.ScaledDurationField(durationField31, durationFieldType33, 5999999);
        long long37 = scaledDurationField35.getValueAsLong((long) (-86401));
        long long39 = scaledDurationField35.getValueAsLong((long) '4');
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(gregorianChronology7);
        org.junit.Assert.assertNotNull(gregorianChronology10);
        org.junit.Assert.assertNotNull(dateTimeField12);
// flaky "45) test1252(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 71 + "'", int13 == 71);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(julianChronology23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "0" + "'", str30, "0");
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(months32);
        org.junit.Assert.assertNotNull(durationFieldType33);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
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
        org.joda.time.DateTimeField dateTimeField13 = property11.getField();
        org.joda.time.YearMonthDay yearMonthDay14 = property11.getYearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay16 = property11.addToCopy(4);
        org.joda.time.DateTimeField dateTimeField17 = property11.getField();
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(date5);
// flaky "46) test1253(RegressionTest2)":         org.junit.Assert.assertEquals(date5.toString(), "Wed Dec 31 19:00:00 EST 1969");
        org.junit.Assert.assertNotNull(yearMonthDay6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(yearMonthDay12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(yearMonthDay14);
        org.junit.Assert.assertNotNull(yearMonthDay16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property2 = dateTime1.dayOfWeek();
        int int3 = dateTime1.getMillisOfSecond();
        org.joda.time.DateTime.Property property4 = dateTime1.yearOfEra();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.ONE;
        int int1 = weeks0.getWeeks();
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth(101L);
        org.joda.time.Weeks weeks4 = org.joda.time.Weeks.ZERO;
        org.joda.time.YearMonth yearMonth5 = yearMonth3.plus((org.joda.time.ReadablePeriod) weeks4);
        org.joda.time.Weeks weeks6 = weeks0.plus(weeks4);
        org.joda.time.Weeks weeks8 = weeks4.multipliedBy(10);
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(weeks8);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
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
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight2.plus((long) 1000);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(property3);
// flaky "47) test1256(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(dateMidnight12);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
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
        int int37 = preciseDateTimeField36.getMinimumValue();
        boolean boolean38 = preciseDateTimeField36.isLenient();
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("2025");
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTime();
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(mutableDateTime2);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        org.joda.time.JodaTimePermission jodaTimePermission1 = new org.joda.time.JodaTimePermission("71");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology3);
        org.joda.time.DateMidnight.Property property5 = dateMidnight4.weekyear();
        org.joda.time.DateMidnight.Property property6 = dateMidnight4.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight7 = property6.withMaximumValue();
        jodaTimePermission1.checkGuard((java.lang.Object) property6);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateMidnight7);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.minutes(1000);
        org.junit.Assert.assertNotNull(minutes1);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (short) 1, (int) ' ', 82799999);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1 for weekyear must be in the range [32,82799999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        org.joda.time.YearMonth yearMonth1 = new org.joda.time.YearMonth(101L);
        org.joda.time.YearMonth.Property property2 = yearMonth1.year();
        org.joda.time.YearMonth yearMonth4 = yearMonth1.plusYears(2025);
        java.lang.String str6 = yearMonth1.toString("00:01:37.035");
        org.joda.time.YearMonth yearMonth8 = yearMonth1.plusMonths(86400000);
        int int9 = yearMonth8.size();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(yearMonth4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00:01:37.035" + "'", str6, "00:01:37.035");
        org.junit.Assert.assertNotNull(yearMonth8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.joda.time.format.DateTimeFormat.patternForStyle("Thursday", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style specification: Thursday");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.setDayOfYear(8);
        int int3 = mutableDateTime0.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime0.centuryOfEra();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime0.secondOfDay();
        org.junit.Assert.assertNotNull(mutableDateTime0);
// flaky "48) test1264(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 70 + "'", int3 == 70);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.Duration duration2 = new org.joda.time.Duration(2746894413240000000L);
        boolean boolean3 = ethiopicChronology0.equals((java.lang.Object) duration2);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate6 = localDate4.withYearOfEra(10);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.JulianChronology julianChronology9 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone8);
        org.joda.time.Chronology chronology10 = julianChronology9.withUTC();
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, (org.joda.time.Chronology) julianChronology9, locale11);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property15 = dateTime14.dayOfWeek();
        int int16 = dateTime14.getWeekyear();
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime18 = dateTime14.plus(readableDuration17);
        org.joda.time.DateTime.Property property19 = dateTime18.era();
        boolean boolean20 = dateTimeParserBucket12.restoreState((java.lang.Object) property19);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTimeParserBucket12.getZone();
        org.joda.time.DateTime dateTime22 = localDate4.toDateTimeAtCurrentTime(dateTimeZone21);
        org.joda.time.Chronology chronology23 = ethiopicChronology0.withZone(dateTimeZone21);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(julianChronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1970 + "'", int16 == 1970);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(chronology23);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.Chronology chronology3 = julianChronology2.withUTC();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, (org.joda.time.Chronology) julianChronology2, locale4);
        org.joda.time.MutableDateTime mutableDateTime6 = org.joda.time.MutableDateTime.now();
        mutableDateTime6.setDayOfYear(8);
        mutableDateTime6.setDayOfYear(31);
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
        mutableDateTime6.setRounding((org.joda.time.DateTimeField) offsetDateTimeField29);
        boolean boolean31 = julianChronology2.equals((java.lang.Object) mutableDateTime6);
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(julianChronology16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0" + "'", str21, "0");
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
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
        java.lang.String str36 = skipDateTimeField14.getAsText((long) 0);
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(gregorianChronology7);
        org.junit.Assert.assertNotNull(gregorianChronology10);
        org.junit.Assert.assertNotNull(dateTimeField12);
// flaky "49) test1267(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 71 + "'", int13 == 71);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(julianChronology23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "0" + "'", str30, "0");
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "26" + "'", str34, "26");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "71" + "'", str36, "71");
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
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
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(dateTimeZone15);
        org.joda.time.MonthDay monthDay17 = org.joda.time.MonthDay.now(dateTimeZone15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.CopticChronology copticChronology19 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone15, 1440);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 1440");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(monthDay17);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.JulianChronology julianChronology1 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone0);
        org.joda.time.MonthDay monthDay2 = org.joda.time.MonthDay.now((org.joda.time.Chronology) julianChronology1);
        int[] intArray3 = monthDay2.getValues();
        org.joda.time.MonthDay.Property property4 = monthDay2.dayOfMonth();
        org.junit.Assert.assertNotNull(julianChronology1);
        org.junit.Assert.assertNotNull(monthDay2);
        org.junit.Assert.assertNotNull(intArray3);
// flaky "50) test1269(RegressionTest2)":         org.junit.Assert.assertArrayEquals(intArray3, new int[] { 12, 19 });
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
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
        org.joda.time.Interval interval25 = interval24.toInterval();
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property31 = dateTime29.property(dateTimeFieldType30);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.chrono.JulianChronology julianChronology33 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone32);
        org.joda.time.Chronology chronology34 = julianChronology33.withUTC();
        org.joda.time.DateTimeField dateTimeField35 = dateTimeFieldType30.getField((org.joda.time.Chronology) julianChronology33);
        org.joda.time.MutableInterval mutableInterval36 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology33);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.chrono.JulianChronology julianChronology38 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone37);
        org.joda.time.Chronology chronology39 = julianChronology38.withUTC();
        mutableInterval36.setChronology((org.joda.time.Chronology) julianChronology38);
        mutableInterval36.setEndMillis((long) 'a');
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property45 = dateTime44.dayOfWeek();
        int int46 = dateTime44.getWeekyear();
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.DateTime dateTime48 = dateTime44.plus(readableDuration47);
        boolean boolean49 = mutableInterval36.contains((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.Days days50 = org.joda.time.Days.THREE;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property53 = dateTime52.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = property53.getFieldType();
        boolean boolean55 = days50.equals((java.lang.Object) property53);
        org.joda.time.DateTime dateTime56 = property53.getDateTime();
        org.joda.time.DateTime dateTime57 = dateTime56.withEarlierOffsetAtOverlap();
        mutableInterval36.setStart((org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.Interval interval59 = interval24.overlap((org.joda.time.ReadableInterval) mutableInterval36);
        org.joda.time.DateTime dateTime60 = mutableInterval36.getStart();
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
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(julianChronology33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(julianChronology38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1970 + "'", int46 == 1970);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(days50);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(dateTimeFieldType54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(interval59);
        org.junit.Assert.assertNotNull(dateTime60);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property2 = dateTime1.dayOfWeek();
        int int3 = dateTime1.getWeekyear();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime1.plus(readableDuration4);
        org.joda.time.DateTime.Property property6 = dateTime5.minuteOfDay();
        org.joda.time.Hours hours7 = org.joda.time.Hours.TWO;
        org.joda.time.DateTime dateTime9 = dateTime5.withPeriodAdded((org.joda.time.ReadablePeriod) hours7, (int) (byte) 1);
        org.joda.time.Hours hours11 = hours7.plus(0);
        org.joda.time.DurationFieldType durationFieldType13 = hours11.getFieldType(0);
        org.joda.time.Hours hours14 = hours11.negated();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1970 + "'", int3 == 1970);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(hours7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(hours11);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertNotNull(hours14);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(3600, 2, 31);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3600 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        org.joda.time.Duration duration1 = new org.joda.time.Duration((long) (-292275054));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((java.lang.Object) duration1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.Duration");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
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
        int int22 = offsetDateTimeField18.getOffset();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.chrono.JulianChronology julianChronology26 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone25);
        org.joda.time.Chronology chronology27 = julianChronology26.withUTC();
        java.util.Locale locale28 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, (org.joda.time.Chronology) julianChronology26, locale28);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology31 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone30);
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology31);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology34 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone33);
        org.joda.time.DateMidnight dateMidnight35 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology34);
        org.joda.time.DateTimeField dateTimeField36 = gregorianChronology34.weekyearOfCentury();
        int int37 = dateMidnight32.get(dateTimeField36);
        org.joda.time.field.SkipDateTimeField skipDateTimeField38 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) julianChronology26, dateTimeField36);
        int int40 = skipDateTimeField38.getMaximumValue(101L);
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property44 = dateTime43.dayOfWeek();
        int int45 = dateTime43.getWeekyear();
        int int46 = dateTime43.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology48 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone47);
        org.joda.time.Days days49 = org.joda.time.Days.THREE;
        int[] intArray52 = gregorianChronology48.get((org.joda.time.ReadablePeriod) days49, (long) 0, (-1L));
        org.joda.time.Duration duration53 = days49.toStandardDuration();
        org.joda.time.DateTime dateTime55 = dateTime43.withDurationAdded((org.joda.time.ReadableDuration) duration53, 26);
        org.joda.time.Duration duration57 = duration53.multipliedBy((long) (short) 1);
        org.joda.time.Duration duration58 = duration57.toDuration();
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property61 = dateTime60.dayOfWeek();
        org.joda.time.format.PeriodFormatter periodFormatter62 = org.joda.time.format.ISOPeriodFormat.alternateExtended();
        org.joda.time.PeriodType periodType63 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.format.PeriodFormatter periodFormatter64 = periodFormatter62.withParseType(periodType63);
        org.joda.time.Period period65 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration57, (org.joda.time.ReadableInstant) dateTime60, periodType63);
        java.lang.String str66 = dateTime60.toString();
        org.joda.time.format.PeriodFormatter periodFormatter68 = org.joda.time.format.PeriodFormat.wordBased();
        java.util.Locale locale69 = periodFormatter68.getLocale();
        java.lang.String str70 = dateTime60.toString("00:01:37.035", locale69);
        java.lang.String str71 = skipDateTimeField38.getAsText(60, locale69);
        java.lang.String str72 = offsetDateTimeField18.getAsText((-1), locale69);
        org.joda.time.format.PeriodFormatter periodFormatter73 = org.joda.time.format.PeriodFormat.wordBased(locale69);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(julianChronology26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(gregorianChronology31);
        org.junit.Assert.assertNotNull(gregorianChronology34);
        org.junit.Assert.assertNotNull(dateTimeField36);
// flaky "51) test1274(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 71 + "'", int37 == 71);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1970 + "'", int45 == 1970);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(gregorianChronology48);
        org.junit.Assert.assertNotNull(days49);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(duration57);
        org.junit.Assert.assertNotNull(duration58);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(periodFormatter62);
        org.junit.Assert.assertNotNull(periodType63);
        org.junit.Assert.assertNotNull(periodFormatter64);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "1970-01-01T00:00:00.001Z" + "'", str66, "1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(periodFormatter68);
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "00:01:37.035" + "'", str70, "00:01:37.035");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "60" + "'", str71, "60");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "-1" + "'", str72, "-1");
        org.junit.Assert.assertNotNull(periodFormatter73);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod();
        boolean boolean2 = mutablePeriod0.equals((java.lang.Object) (-1L));
        mutablePeriod0.addYears(100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology6 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone5);
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology6);
        org.joda.time.DateMidnight.Property property8 = dateMidnight7.dayOfYear();
        org.joda.time.DateMidnight dateMidnight9 = property8.roundHalfEvenCopy();
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.plusWeeks((int) (byte) 10);
        org.joda.time.Days days12 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType13 = days12.getFieldType();
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight11.withFieldAdded(durationFieldType13, 26);
        mutablePeriod0.add(durationFieldType13, 1);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime dateTime21 = dateTime19.withYear((-35));
        int int22 = dateTime19.getMinuteOfDay();
        org.joda.time.DateTime dateTime24 = dateTime19.withYearOfEra(7);
        org.joda.time.Duration duration25 = mutablePeriod0.toDurationTo((org.joda.time.ReadableInstant) dateTime24);
        int int26 = dateTime24.getMonthOfYear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology6);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
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
        org.joda.time.LocalTime localTime43 = property41.roundCeilingCopy();
        org.joda.time.LocalTime localTime45 = property41.addCopy(86400000);
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
        org.junit.Assert.assertNotNull(localTime45);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology2.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone6);
        org.joda.time.Chronology chronology8 = julianChronology7.withUTC();
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, (org.joda.time.Chronology) julianChronology7, locale9);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property13 = dateTime12.dayOfWeek();
        int int14 = dateTime12.getWeekyear();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime16 = dateTime12.plus(readableDuration15);
        org.joda.time.DateTime.Property property17 = dateTime16.era();
        boolean boolean18 = dateTimeParserBucket10.restoreState((java.lang.Object) property17);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeParserBucket10.getZone();
        long long23 = dateTimeZone19.convertLocalToUTC(26L, true, 1L);
        org.joda.time.Chronology chronology24 = gregorianChronology2.withZone(dateTimeZone19);
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight(43200000L, dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology27 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone26);
        org.joda.time.Days days28 = org.joda.time.Days.THREE;
        int[] intArray31 = gregorianChronology27.get((org.joda.time.ReadablePeriod) days28, (long) 0, (-1L));
        org.joda.time.Duration duration32 = days28.toStandardDuration();
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property35 = dateTime34.dayOfWeek();
        int int36 = dateTime34.getWeekyear();
        int int37 = dateTime34.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology39 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone38);
        org.joda.time.Days days40 = org.joda.time.Days.THREE;
        int[] intArray43 = gregorianChronology39.get((org.joda.time.ReadablePeriod) days40, (long) 0, (-1L));
        org.joda.time.Duration duration44 = days40.toStandardDuration();
        org.joda.time.DateTime dateTime46 = dateTime34.withDurationAdded((org.joda.time.ReadableDuration) duration44, 26);
        boolean boolean47 = duration32.isShorterThan((org.joda.time.ReadableDuration) duration44);
        org.joda.time.Duration duration49 = duration44.plus(90L);
        org.joda.time.DateMidnight dateMidnight50 = dateMidnight25.minus((org.joda.time.ReadableDuration) duration49);
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime52.plusMinutes((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime54.minusWeeks(1970);
        int int57 = localDateTime56.getDayOfMonth();
        org.joda.time.DateMidnight dateMidnight58 = dateMidnight25.withFields((org.joda.time.ReadablePartial) localDateTime56);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(julianChronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1970 + "'", int14 == 1970);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 26L + "'", long23 == 26L);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(gregorianChronology27);
        org.junit.Assert.assertNotNull(days28);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1970 + "'", int36 == 1970);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(gregorianChronology39);
        org.junit.Assert.assertNotNull(days40);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertNotNull(dateMidnight50);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 31 + "'", int57 == 31);
        org.junit.Assert.assertNotNull(dateMidnight58);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property2 = dateTime1.dayOfWeek();
        int int3 = dateTime1.getWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = dateTime1.withDayOfYear(604800000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 604800000 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1970 + "'", int3 == 1970);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
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
        org.joda.time.Months months32 = org.joda.time.Months.TWELVE;
        org.joda.time.DurationFieldType durationFieldType33 = months32.getFieldType();
        org.joda.time.field.ScaledDurationField scaledDurationField35 = new org.joda.time.field.ScaledDurationField(durationField31, durationFieldType33, 5999999);
        long long37 = scaledDurationField35.getValueAsLong((long) (-86401));
        // The following exception was thrown during execution in test generation
        try {
            long long40 = scaledDurationField35.add((long) 5999999, (-1511999993L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -907199844600000700");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(gregorianChronology7);
        org.junit.Assert.assertNotNull(gregorianChronology10);
        org.junit.Assert.assertNotNull(dateTimeField12);
// flaky "52) test1279(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 71 + "'", int13 == 71);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(julianChronology23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "0" + "'", str30, "0");
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(months32);
        org.junit.Assert.assertNotNull(durationFieldType33);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        org.joda.time.format.PeriodFormatter periodFormatter8 = org.joda.time.format.ISOPeriodFormat.alternateExtended();
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.format.PeriodFormatter periodFormatter10 = periodFormatter8.withParseType(periodType9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(20179, (int) (byte) 1, 25, 70, 0, 23, 604800000, 292271022, periodType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weeks'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodFormatter8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodFormatter10);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod();
        mutablePeriod0.setPeriod((long) 8);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone1);
        org.joda.time.Days days3 = org.joda.time.Days.THREE;
        int[] intArray6 = gregorianChronology2.get((org.joda.time.ReadablePeriod) days3, (long) 0, (-1L));
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology2.dayOfMonth();
        org.joda.time.DurationField durationField8 = gregorianChronology2.millis();
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) 26, (org.joda.time.Chronology) gregorianChronology2, locale9);
        org.joda.time.Chronology chronology11 = gregorianChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology2.year();
        org.joda.time.DateTimeField dateTimeField13 = gregorianChronology2.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField15 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField13, dateTimeFieldType14);
        int int16 = zeroIsMaxDateTimeField15.getMinimumValue();
        org.joda.time.YearMonth yearMonth18 = new org.joda.time.YearMonth(101L);
        org.joda.time.YearMonth.Property property19 = yearMonth18.year();
        org.joda.time.YearMonth yearMonth21 = yearMonth18.plusYears(2025);
        int int22 = zeroIsMaxDateTimeField15.getMaximumValue((org.joda.time.ReadablePartial) yearMonth21);
        int int23 = zeroIsMaxDateTimeField15.getMinimumValue();
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0 });
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(yearMonth21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 86400000 + "'", int22 == 86400000);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusYears(86400000);
        org.junit.Assert.assertNotNull(localDateTime2);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfWeek();
        mutableDateTime0.addMonths(26);
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime0.year();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime0.setDayOfMonth((-19));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -19 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone2);
        org.joda.time.Chronology chronology4 = julianChronology3.withUTC();
        java.util.Locale locale5 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, (org.joda.time.Chronology) julianChronology3, locale5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology8 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone7);
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology11 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone10);
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology11);
        org.joda.time.DateTimeField dateTimeField13 = gregorianChronology11.weekyearOfCentury();
        int int14 = dateMidnight9.get(dateTimeField13);
        org.joda.time.field.SkipDateTimeField skipDateTimeField15 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) julianChronology3, dateTimeField13);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property22 = dateTime20.property(dateTimeFieldType21);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.chrono.JulianChronology julianChronology24 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone23);
        org.joda.time.Chronology chronology25 = julianChronology24.withUTC();
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType21.getField((org.joda.time.Chronology) julianChronology24);
        org.joda.time.MutableInterval mutableInterval27 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology24);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) (short) -1, (org.joda.time.Chronology) julianChronology24);
        java.util.Locale locale30 = null;
        java.lang.String str31 = skipDateTimeField15.getAsText((org.joda.time.ReadablePartial) localDateTime28, 0, locale30);
        org.joda.time.DurationField durationField32 = skipDateTimeField15.getRangeDurationField();
        org.joda.time.Days days33 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType34 = days33.getFieldType();
        org.joda.time.field.ScaledDurationField scaledDurationField36 = new org.joda.time.field.ScaledDurationField(durationField32, durationFieldType34, 1440);
        java.lang.String str37 = scaledDurationField36.getName();
        long long38 = scaledDurationField36.getUnitMillis();
        org.joda.time.DurationFieldType durationFieldType39 = scaledDurationField36.getType();
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.plusHours((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property44 = localDateTime43.dayOfYear();
        org.joda.time.LocalDateTime.Property property45 = localDateTime43.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology47 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone46);
        org.joda.time.Days days48 = org.joda.time.Days.THREE;
        int[] intArray51 = gregorianChronology47.get((org.joda.time.ReadablePeriod) days48, (long) 0, (-1L));
        org.joda.time.Duration duration52 = days48.toStandardDuration();
        org.joda.time.LocalDateTime localDateTime53 = localDateTime43.minus((org.joda.time.ReadableDuration) duration52);
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod();
        mutablePeriod54.addWeeks((-1));
        org.joda.time.LocalDateTime localDateTime58 = localDateTime53.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod54, 5);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime58.minusMinutes(32);
        org.joda.time.Partial partial61 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDateTime60);
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.chrono.JulianChronology julianChronology64 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone63);
        org.joda.time.Chronology chronology65 = julianChronology64.withUTC();
        java.util.Locale locale66 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket67 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, (org.joda.time.Chronology) julianChronology64, locale66);
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property70 = dateTime69.dayOfWeek();
        int int71 = dateTime69.getWeekyear();
        org.joda.time.ReadableDuration readableDuration72 = null;
        org.joda.time.DateTime dateTime73 = dateTime69.plus(readableDuration72);
        org.joda.time.DateTime.Property property74 = dateTime73.era();
        boolean boolean75 = dateTimeParserBucket67.restoreState((java.lang.Object) property74);
        org.joda.time.DateTimeFieldType dateTimeFieldType76 = property74.getFieldType();
        org.joda.time.Partial partial77 = partial61.without(dateTimeFieldType76);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter78 = partial61.getFormatter();
        boolean boolean79 = scaledDurationField36.equals((java.lang.Object) dateTimeFormatter78);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime80 = org.joda.time.MutableDateTime.parse("+00:00:00.035", dateTimeFormatter78);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+00:00:00.035\" is malformed at \":00:00.035\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(gregorianChronology8);
        org.junit.Assert.assertNotNull(gregorianChronology11);
        org.junit.Assert.assertNotNull(dateTimeField13);
// flaky "53) test1285(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 71 + "'", int14 == 71);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(julianChronology24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "0" + "'", str31, "0");
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(days33);
        org.junit.Assert.assertNotNull(durationFieldType34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "days" + "'", str37, "days");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 4544201088000000L + "'", long38 == 4544201088000000L);
        org.junit.Assert.assertNotNull(durationFieldType39);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(gregorianChronology47);
        org.junit.Assert.assertNotNull(days48);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(localDateTime60);
        org.junit.Assert.assertNotNull(julianChronology64);
        org.junit.Assert.assertNotNull(chronology65);
        org.junit.Assert.assertNotNull(property70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1970 + "'", int71 == 1970);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertNotNull(property74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType76);
        org.junit.Assert.assertNotNull(partial77);
        org.junit.Assert.assertNotNull(dateTimeFormatter78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Days days1 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType2 = days1.getFieldType();
        org.joda.time.LocalDate localDate4 = localDate0.withFieldAdded(durationFieldType2, 1);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray7 = localDate0.getFieldTypes();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate10 = localDate8.withYearOfEra(10);
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
        org.joda.time.DateTime dateTime26 = localDate8.toDateTimeAtCurrentTime(dateTimeZone25);
        org.joda.time.DateTime dateTime27 = org.joda.time.DateTime.now(dateTimeZone25);
        org.joda.time.LocalDate localDate28 = dateTime27.toLocalDate();
        int int29 = localDate0.compareTo((org.joda.time.ReadablePartial) localDate28);
        int int30 = localDate28.getYearOfCentury();
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray7);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(julianChronology13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1970 + "'", int20 == 1970);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
// flaky "54) test1286(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 70 + "'", int30 == 70);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.DateTimeZone dateTimeZone3 = dateTimeZoneBuilder0.toDateTimeZone("Property[dayOfWeek]", true);
        org.junit.Assert.assertNotNull(dateTimeZone3);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property2 = dateTime1.dayOfWeek();
        int int3 = dateTime1.getWeekyear();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime1.plus(readableDuration4);
        org.joda.time.DateTime.Property property6 = dateTime1.secondOfMinute();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1970 + "'", int3 == 1970);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology1.millisOfDay();
        org.joda.time.DurationField durationField4 = gregorianChronology1.eras();
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        org.joda.time.Days days0 = org.joda.time.Days.THREE;
        org.joda.time.Days days2 = days0.minus((int) (short) 1);
        org.joda.time.Days days4 = days2.minus((-19));
        org.joda.time.Days days6 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType7 = days6.getFieldType();
        org.joda.time.PeriodType periodType8 = days6.getPeriodType();
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
        org.joda.time.Period period24 = new org.joda.time.Period((long) (byte) 0, periodType8, (org.joda.time.Chronology) julianChronology21);
        org.joda.time.Days days25 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType26 = days25.getFieldType();
        org.joda.time.PeriodType periodType27 = days25.getPeriodType();
        boolean boolean28 = periodType8.equals((java.lang.Object) periodType27);
        org.joda.time.PeriodType periodType29 = periodType8.withYearsRemoved();
        org.joda.time.PeriodType periodType30 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        org.joda.time.chrono.ISOChronology iSOChronology31 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.Chronology chronology32 = iSOChronology31.withUTC();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((java.lang.Object) days2, periodType8, (org.joda.time.Chronology) iSOChronology31);
        org.joda.time.Chronology chronology34 = iSOChronology31.withUTC();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.chrono.JulianChronology julianChronology37 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone36);
        org.joda.time.Chronology chronology38 = julianChronology37.withUTC();
        java.util.Locale locale39 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, (org.joda.time.Chronology) julianChronology37, locale39);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology42 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone41);
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology42);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology45 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone44);
        org.joda.time.DateMidnight dateMidnight46 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology45);
        org.joda.time.DateTimeField dateTimeField47 = gregorianChronology45.weekyearOfCentury();
        int int48 = dateMidnight43.get(dateTimeField47);
        org.joda.time.field.SkipDateTimeField skipDateTimeField49 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) julianChronology37, dateTimeField47);
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property56 = dateTime54.property(dateTimeFieldType55);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.chrono.JulianChronology julianChronology58 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone57);
        org.joda.time.Chronology chronology59 = julianChronology58.withUTC();
        org.joda.time.DateTimeField dateTimeField60 = dateTimeFieldType55.getField((org.joda.time.Chronology) julianChronology58);
        org.joda.time.MutableInterval mutableInterval61 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology58);
        org.joda.time.LocalDateTime localDateTime62 = new org.joda.time.LocalDateTime((long) (short) -1, (org.joda.time.Chronology) julianChronology58);
        java.util.Locale locale64 = null;
        java.lang.String str65 = skipDateTimeField49.getAsText((org.joda.time.ReadablePartial) localDateTime62, 0, locale64);
        boolean boolean66 = iSOChronology31.equals((java.lang.Object) 0);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(julianChronology16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(julianChronology21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(days25);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(iSOChronology31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(julianChronology37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(gregorianChronology42);
        org.junit.Assert.assertNotNull(gregorianChronology45);
        org.junit.Assert.assertNotNull(dateTimeField47);
// flaky "55) test1290(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int48 + "' != '" + 71 + "'", int48 == 71);
        org.junit.Assert.assertNotNull(dateTimeFieldType55);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(julianChronology58);
        org.junit.Assert.assertNotNull(chronology59);
        org.junit.Assert.assertNotNull(dateTimeField60);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "0" + "'", str65, "0");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        org.joda.time.Days days0 = org.joda.time.Days.THREE;
        org.joda.time.Days days2 = days0.minus((int) (short) 1);
        org.joda.time.Days days4 = days2.minus((-19));
        org.joda.time.Days days6 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType7 = days6.getFieldType();
        org.joda.time.PeriodType periodType8 = days6.getPeriodType();
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
        org.joda.time.Period period24 = new org.joda.time.Period((long) (byte) 0, periodType8, (org.joda.time.Chronology) julianChronology21);
        org.joda.time.Days days25 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType26 = days25.getFieldType();
        org.joda.time.PeriodType periodType27 = days25.getPeriodType();
        boolean boolean28 = periodType8.equals((java.lang.Object) periodType27);
        org.joda.time.PeriodType periodType29 = periodType8.withYearsRemoved();
        org.joda.time.PeriodType periodType30 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        org.joda.time.chrono.ISOChronology iSOChronology31 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.Chronology chronology32 = iSOChronology31.withUTC();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((java.lang.Object) days2, periodType8, (org.joda.time.Chronology) iSOChronology31);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod33.setHours(12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'hours'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(julianChronology16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(julianChronology21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(days25);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(iSOChronology31);
        org.junit.Assert.assertNotNull(chronology32);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.dateTime();
        boolean boolean2 = dateTimeFormatter1.isParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.parse("26", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"26\" is too short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.dayOfYear();
        org.joda.time.DateMidnight dateMidnight4 = property3.roundHalfEvenCopy();
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.withYearOfCentury(100);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight4.withDurationAdded(readableDuration7, 31);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property12 = dateTime11.dayOfWeek();
        int int13 = dateTime11.getWeekyear();
        int int14 = dateTime11.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology16 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone15);
        org.joda.time.Days days17 = org.joda.time.Days.THREE;
        int[] intArray20 = gregorianChronology16.get((org.joda.time.ReadablePeriod) days17, (long) 0, (-1L));
        org.joda.time.Duration duration21 = days17.toStandardDuration();
        org.joda.time.DateTime dateTime23 = dateTime11.withDurationAdded((org.joda.time.ReadableDuration) duration21, 26);
        org.joda.time.Duration duration25 = duration21.multipliedBy((long) (short) 1);
        org.joda.time.Duration duration26 = duration25.toDuration();
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight9.plus((org.joda.time.ReadableDuration) duration25);
        org.joda.time.Days days28 = org.joda.time.Days.THREE;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property31 = dateTime30.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = property31.getFieldType();
        boolean boolean33 = days28.equals((java.lang.Object) property31);
        org.joda.time.DateTime dateTime34 = property31.getDateTime();
        org.joda.time.DateTime.Property property35 = dateTime34.era();
        org.joda.time.DateTime dateTime37 = dateTime34.withHourOfDay(12);
        org.joda.time.PeriodType periodType38 = org.joda.time.PeriodType.weeks();
        org.joda.time.Period period39 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration25, (org.joda.time.ReadableInstant) dateTime37, periodType38);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period41 = period39.minusMillis(604800000);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1970 + "'", int13 == 1970);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(gregorianChronology16);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(dateMidnight27);
        org.junit.Assert.assertNotNull(days28);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(periodType38);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.Days days2 = org.joda.time.Days.THREE;
        int[] intArray5 = gregorianChronology1.get((org.joda.time.ReadablePeriod) days2, (long) 0, (-1L));
        org.joda.time.Duration duration6 = days2.toStandardDuration();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property9 = dateTime8.dayOfWeek();
        int int10 = dateTime8.getWeekyear();
        int int11 = dateTime8.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology13 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone12);
        org.joda.time.Days days14 = org.joda.time.Days.THREE;
        int[] intArray17 = gregorianChronology13.get((org.joda.time.ReadablePeriod) days14, (long) 0, (-1L));
        org.joda.time.Duration duration18 = days14.toStandardDuration();
        org.joda.time.DateTime dateTime20 = dateTime8.withDurationAdded((org.joda.time.ReadableDuration) duration18, 26);
        boolean boolean21 = duration6.isShorterThan((org.joda.time.ReadableDuration) duration18);
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.plusHours((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.dayOfYear();
        org.joda.time.LocalDateTime.Property property27 = localDateTime25.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology29 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone28);
        org.joda.time.Days days30 = org.joda.time.Days.THREE;
        int[] intArray33 = gregorianChronology29.get((org.joda.time.ReadablePeriod) days30, (long) 0, (-1L));
        org.joda.time.Duration duration34 = days30.toStandardDuration();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime25.minus((org.joda.time.ReadableDuration) duration34);
        org.joda.time.Duration duration36 = duration6.minus((org.joda.time.ReadableDuration) duration34);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property39 = dateTime38.dayOfWeek();
        int int40 = dateTime38.getWeekyear();
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.DateTime dateTime42 = dateTime38.plus(readableDuration41);
        org.joda.time.DateTime dateTime44 = dateTime42.minusMillis((-1));
        org.joda.time.Instant instant45 = dateTime44.toInstant();
        org.joda.time.Instant instant47 = instant45.withMillis((long) 0);
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
        org.joda.time.Duration duration62 = duration59.abs();
        org.joda.time.Instant instant64 = instant45.withDurationAdded((org.joda.time.ReadableDuration) duration62, (int) '#');
        boolean boolean65 = duration6.isLongerThan((org.joda.time.ReadableDuration) duration62);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1970 + "'", int10 == 1970);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(gregorianChronology13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(gregorianChronology29);
        org.junit.Assert.assertNotNull(days30);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1970 + "'", int40 == 1970);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(instant45);
        org.junit.Assert.assertNotNull(instant47);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1970 + "'", int51 == 1970);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(gregorianChronology54);
        org.junit.Assert.assertNotNull(days55);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertArrayEquals(intArray58, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration59);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(duration62);
        org.junit.Assert.assertNotNull(instant64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getYear();
        org.junit.Assert.assertNotNull(localDate0);
// flaky "56) test1295(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1970 + "'", int1 == 1970);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Days days1 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType2 = days1.getFieldType();
        org.joda.time.LocalDate localDate4 = localDate0.withFieldAdded(durationFieldType2, 1);
        org.joda.time.LocalDate.Property property5 = localDate4.era();
        org.joda.time.LocalDate localDate6 = property5.withMinimumValue();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = localDate6.toString("2025-04-01T00:00:00.000Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
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
        org.joda.time.DateTimeZone dateTimeZone14 = julianChronology5.getZone();
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(julianChronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 0, 0, (-3181), (-6), (-23), (-59), (-58), (-31) });
        org.junit.Assert.assertNotNull(dateTimeZone14);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.Days days2 = org.joda.time.Days.THREE;
        int[] intArray5 = gregorianChronology1.get((org.joda.time.ReadablePeriod) days2, (long) 0, (-1L));
        org.joda.time.DurationField durationField6 = gregorianChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology1.yearOfEra();
        org.joda.time.DurationField durationField8 = gregorianChronology1.centuries();
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0 });
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
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
        long long21 = skipDateTimeField14.addWrapField(100L, 13);
        java.lang.String str22 = skipDateTimeField14.getName();
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(gregorianChronology7);
        org.junit.Assert.assertNotNull(gregorianChronology10);
        org.junit.Assert.assertNotNull(dateTimeField12);
// flaky "57) test1299(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 71 + "'", int13 == 71);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "26" + "'", str18, "26");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 410659200100L + "'", long21 == 410659200100L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "weekyearOfCentury" + "'", str22, "weekyearOfCentury");
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        org.joda.time.Days days0 = org.joda.time.Days.THREE;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property3.getFieldType();
        boolean boolean5 = days0.equals((java.lang.Object) property3);
        org.joda.time.DateTime dateTime6 = property3.getDateTime();
        org.joda.time.DurationField durationField7 = property3.getDurationField();
        org.joda.time.DateTime dateTime8 = property3.withMaximumValue();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod();
        mutablePeriod9.addWeeks(13);
        org.joda.time.DateTime dateTime12 = dateTime8.plus((org.joda.time.ReadablePeriod) mutablePeriod9);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone1);
        org.joda.time.Days days3 = org.joda.time.Days.THREE;
        int[] intArray6 = gregorianChronology2.get((org.joda.time.ReadablePeriod) days3, (long) 0, (-1L));
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology2.dayOfMonth();
        org.joda.time.DurationField durationField8 = gregorianChronology2.millis();
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) 26, (org.joda.time.Chronology) gregorianChronology2, locale9);
        org.joda.time.Chronology chronology11 = gregorianChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = gregorianChronology2.secondOfMinute();
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0 });
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
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
        java.lang.String str36 = scaledDurationField35.getName();
        long long37 = scaledDurationField35.getUnitMillis();
        org.joda.time.DurationFieldType durationFieldType38 = scaledDurationField35.getType();
        long long40 = scaledDurationField35.getValueAsLong(259200090L);
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(gregorianChronology7);
        org.junit.Assert.assertNotNull(gregorianChronology10);
        org.junit.Assert.assertNotNull(dateTimeField12);
// flaky "58) test1302(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 71 + "'", int13 == 71);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(julianChronology23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "0" + "'", str30, "0");
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(days32);
        org.junit.Assert.assertNotNull(durationFieldType33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "days" + "'", str36, "days");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 4544201088000000L + "'", long37 == 4544201088000000L);
        org.junit.Assert.assertNotNull(durationFieldType38);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
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
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(dateTimeZone15);
        org.joda.time.chrono.GregorianChronology gregorianChronology18 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology21 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone15, 1736364564229L, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 12");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(gregorianChronology18);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
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
        org.joda.time.TimeOfDay timeOfDay34 = new org.joda.time.TimeOfDay((org.joda.time.Chronology) gregorianChronology26);
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
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
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
        org.joda.time.DurationField durationField35 = skipUndoDateTimeField34.getLeapDurationField();
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
        org.junit.Assert.assertNull(durationField35);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.Days days2 = org.joda.time.Days.THREE;
        int[] intArray5 = gregorianChronology1.get((org.joda.time.ReadablePeriod) days2, (long) 0, (-1L));
        org.joda.time.DurationField durationField6 = gregorianChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology1.yearOfEra();
        org.joda.time.DurationField durationField8 = gregorianChronology1.hours();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology10 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone9);
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology10);
        org.joda.time.DateMidnight.Property property12 = dateMidnight11.dayOfYear();
        org.joda.time.DateMidnight dateMidnight13 = property12.roundHalfEvenCopy();
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight13.withYearOfCentury(100);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MonthDay monthDay17 = new org.joda.time.MonthDay((java.lang.Object) dateMidnight13, chronology16);
        int[] intArray19 = gregorianChronology1.get((org.joda.time.ReadablePartial) monthDay17, (long) 84);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DurationField durationField21 = gregorianChronology1.years();
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0 });
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(gregorianChronology10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 1, 1 });
        org.junit.Assert.assertNotNull(durationField21);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        org.joda.time.Period period1 = org.joda.time.Period.days(7);
        org.joda.time.Period period3 = period1.plusMonths(60);
        org.joda.time.Period period5 = period3.minusDays((-86401));
        org.joda.time.Period period7 = period3.withYears((int) '#');
        org.joda.time.Period period9 = period7.minusHours(5);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
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
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval((long) (byte) 10, (long) 10);
        org.joda.time.Interval interval36 = mutableInterval35.toInterval();
        mutableInterval10.setInterval((org.joda.time.ReadableInterval) mutableInterval35);
        org.joda.time.DateTime dateTime38 = mutableInterval10.getEnd();
        org.joda.time.Duration duration39 = mutableInterval10.toDuration();
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
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(duration39);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
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
        org.joda.time.DurationField durationField34 = gregorianChronology26.years();
        org.joda.time.DateTimeField dateTimeField35 = gregorianChronology26.clockhourOfHalfday();
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
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.dayOfYear();
        int int3 = localDateTime1.getYearOfEra();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1969 + "'", int3 == 1969);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.LocalDate localDate3 = localDate0.plusDays(20179);
        org.joda.time.LocalDate localDate5 = localDate3.withMonthOfYear(7);
        org.joda.time.LocalDate.Property property6 = localDate3.era();
        int int7 = localDate3.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology9 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone8);
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology9);
        org.joda.time.Weeks weeks11 = org.joda.time.Weeks.ONE;
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.plus((org.joda.time.ReadablePeriod) weeks11);
        java.util.Date date13 = dateMidnight10.toDate();
        org.joda.time.YearMonthDay yearMonthDay14 = org.joda.time.YearMonthDay.fromDateFields(date13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateMidnight dateMidnight16 = yearMonthDay14.toDateMidnight(dateTimeZone15);
        org.joda.time.YearMonthDay yearMonthDay18 = yearMonthDay14.plusMonths(8);
        org.joda.time.YearMonthDay.Property property19 = yearMonthDay14.monthOfYear();
        org.joda.time.Period period21 = org.joda.time.Period.days(7);
        org.joda.time.Period period23 = period21.plusMonths(60);
        org.joda.time.YearMonthDay yearMonthDay25 = yearMonthDay14.withPeriodAdded((org.joda.time.ReadablePeriod) period21, (int) (short) 1);
        int int26 = yearMonthDay25.size();
        org.joda.time.Period period27 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate3, (org.joda.time.ReadablePartial) yearMonthDay25);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
// flaky "59) test1312(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2025 + "'", int7 == 2025);
        org.junit.Assert.assertNotNull(gregorianChronology9);
        org.junit.Assert.assertNotNull(weeks11);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(date13);
// flaky "9) test1312(RegressionTest2)":         org.junit.Assert.assertEquals(date13.toString(), "Wed Dec 31 19:00:00 EST 1969");
        org.junit.Assert.assertNotNull(yearMonthDay14);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(yearMonthDay18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(yearMonthDay25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        org.joda.time.Period period1 = org.joda.time.Period.days(7);
        org.joda.time.Period period3 = period1.plusMonths(60);
        org.joda.time.Period period5 = period3.minusDays((-86401));
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.Days days7 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType8 = days7.getFieldType();
        org.joda.time.LocalDate localDate10 = localDate6.withFieldAdded(durationFieldType8, 1);
        boolean boolean11 = period3.isSupported(durationFieldType8);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
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
        org.joda.time.TimeOfDay.Property property19 = timeOfDay16.hourOfDay();
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
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod();
        mutablePeriod0.setHours(5);
        int int3 = mutablePeriod0.getSeconds();
        mutablePeriod0.addSeconds(9);
        org.joda.time.MutableDateTime mutableDateTime6 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.dayOfWeek();
        org.joda.time.Interval interval8 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) mutablePeriod0, (org.joda.time.ReadableInstant) mutableDateTime6);
        mutablePeriod0.setPeriod((-259200000L));
        mutablePeriod0.addMillis(32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property2 = dateTime1.dayOfWeek();
        int int3 = dateTime1.getWeekyear();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime1.plus(readableDuration4);
        org.joda.time.DateTime.Property property6 = dateTime5.minuteOfDay();
        org.joda.time.Hours hours7 = org.joda.time.Hours.TWO;
        org.joda.time.DateTime dateTime9 = dateTime5.withPeriodAdded((org.joda.time.ReadablePeriod) hours7, (int) (byte) 1);
        org.joda.time.Hours hours11 = hours7.plus(0);
        org.joda.time.Hours hours13 = hours11.multipliedBy(2070);
        org.joda.time.PeriodType periodType14 = hours11.getPeriodType();
        org.joda.time.Hours hours15 = org.joda.time.Hours.FOUR;
        org.joda.time.Hours hours17 = hours15.dividedBy((int) (short) -1);
        boolean boolean18 = hours11.isLessThan(hours17);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1970 + "'", int3 == 1970);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(hours7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(hours11);
        org.junit.Assert.assertNotNull(hours13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(hours15);
        org.junit.Assert.assertNotNull(hours17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        org.joda.time.Years years1 = org.joda.time.Years.years((int) (short) 0);
        org.joda.time.Years years3 = org.joda.time.Years.years((int) (short) 0);
        org.joda.time.Years years4 = years1.plus(years3);
        int int5 = years3.getYears();
        org.joda.time.Years years6 = years3.negated();
        org.junit.Assert.assertNotNull(years1);
        org.junit.Assert.assertNotNull(years3);
        org.junit.Assert.assertNotNull(years4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(years6);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        org.joda.time.Days days0 = org.joda.time.Days.THREE;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property3.getFieldType();
        boolean boolean5 = days0.equals((java.lang.Object) property3);
        org.joda.time.DurationField durationField6 = property3.getDurationField();
        java.lang.String str7 = durationField6.toString();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DurationField[days]" + "'", str7, "DurationField[days]");
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        int int0 = org.joda.time.DateTimeConstants.HOURS_PER_WEEK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 168 + "'", int0 == 168);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
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
        org.joda.time.DateTimeField dateTimeField26 = property17.getField();
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
        org.junit.Assert.assertNotNull(dateTimeField26);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property2 = dateTime1.dayOfWeek();
        int int3 = dateTime1.getWeekyear();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime1.plus(readableDuration4);
        org.joda.time.DateTime.Property property6 = dateTime5.era();
        int int7 = dateTime5.getHourOfDay();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property10 = dateTime9.dayOfWeek();
        int int11 = dateTime9.getWeekyear();
        org.joda.time.DateTime dateTime13 = dateTime9.minusDays(26);
        org.joda.time.DateTime.Property property14 = dateTime9.hourOfDay();
        org.joda.time.DateTime.Property property15 = dateTime9.millisOfDay();
        org.joda.time.Minutes minutes16 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.Duration duration17 = minutes16.toStandardDuration();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1970 + "'", int3 == 1970);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1970 + "'", int11 == 1970);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertNotNull(duration17);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.fullTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter1.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone3 = dateTimeFormatter2.getZone();
        boolean boolean4 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronology();
        java.lang.Integer int6 = dateTimeFormatter2.getPivotYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.parse("", dateTimeFormatter2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property2 = dateTime1.dayOfWeek();
        int int3 = dateTime1.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone4);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology5);
        org.joda.time.DateMidnight.Property property7 = dateMidnight6.dayOfYear();
        org.joda.time.Period period8 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime1, (org.joda.time.ReadableInstant) dateMidnight6);
        org.joda.time.Period period10 = period8.plusMonths((-281));
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
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
        org.joda.time.DurationField durationField13 = property11.getRangeDurationField();
        org.joda.time.YearMonthDay yearMonthDay14 = property11.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        java.lang.String str17 = dateTimeZone16.toString();
        org.joda.time.DateTime dateTime18 = org.joda.time.DateTime.now(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = yearMonthDay14.toDateTimeAtCurrentTime(dateTimeZone16);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(date5);
// flaky "60) test1324(RegressionTest2)":         org.junit.Assert.assertEquals(date5.toString(), "Wed Dec 31 19:00:00 EST 1969");
        org.junit.Assert.assertNotNull(yearMonthDay6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(yearMonthDay12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(yearMonthDay14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.035" + "'", str17, "+00:00:00.035");
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        org.joda.time.tz.ZoneInfoLogger.set(true);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
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
        org.joda.time.DateTime dateTime20 = dateTime18.minus((long) 50);
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
        org.junit.Assert.assertNotNull(dateTime20);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        org.joda.time.DateTimeComparator dateTimeComparator0 = org.joda.time.DateTimeComparator.getDateOnlyInstance();
        java.util.Comparator<java.lang.Object> objComparator1 = dateTimeComparator0.reversed();
        org.junit.Assert.assertNotNull(dateTimeComparator0);
        org.junit.Assert.assertNotNull(objComparator1);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
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
        int int42 = offsetDateTimeField18.getMaximumValue(90L);
        org.joda.time.DurationField durationField43 = offsetDateTimeField18.getRangeDurationField();
        // The following exception was thrown during execution in test generation
        try {
            long long46 = offsetDateTimeField18.add(259200090L, 330958);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 9 for hourOfHalfday must be in the range [-1,-35]");
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-35) + "'", int42 == (-35));
        org.junit.Assert.assertNotNull(durationField43);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 19);
        int int2 = timeOfDay1.getMinuteOfHour();
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay1.minusMillis((-19));
        org.joda.time.TimeOfDay.Property property5 = timeOfDay4.millisOfSecond();
        int int6 = property5.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay8 = property5.addToCopy(3600);
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(timeOfDay8);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicOrdinalDateTimeNoMillis();
        java.lang.Appendable appendable1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology3);
        org.joda.time.Weeks weeks5 = org.joda.time.Weeks.ONE;
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.plus((org.joda.time.ReadablePeriod) weeks5);
        java.util.Date date7 = dateMidnight4.toDate();
        org.joda.time.YearMonthDay yearMonthDay8 = org.joda.time.YearMonthDay.fromDateFields(date7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateMidnight dateMidnight10 = yearMonthDay8.toDateMidnight(dateTimeZone9);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(appendable1, (org.joda.time.ReadableInstant) dateMidnight10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(date7);
// flaky "61) test1330(RegressionTest2)":         org.junit.Assert.assertEquals(date7.toString(), "Wed Dec 31 19:00:00 EST 1969");
        org.junit.Assert.assertNotNull(yearMonthDay8);
        org.junit.Assert.assertNotNull(dateMidnight10);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
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
        org.joda.time.Duration duration68 = org.joda.time.Duration.standardSeconds(410659200100L);
        org.joda.time.Interval interval69 = interval64.withDurationAfterStart((org.joda.time.ReadableDuration) duration68);
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
        org.junit.Assert.assertNotNull(duration68);
        org.junit.Assert.assertNotNull(interval69);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
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
        org.joda.time.DateTimeField dateTimeField35 = org.joda.time.field.StrictDateTimeField.getInstance((org.joda.time.DateTimeField) offsetDateTimeField32);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property40 = dateTime38.property(dateTimeFieldType39);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.chrono.JulianChronology julianChronology42 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone41);
        org.joda.time.Chronology chronology43 = julianChronology42.withUTC();
        org.joda.time.DateTimeField dateTimeField44 = dateTimeFieldType39.getField((org.joda.time.Chronology) julianChronology42);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.Chronology chronology46 = julianChronology42.withZone(dateTimeZone45);
        org.joda.time.LocalTime localTime47 = new org.joda.time.LocalTime((long) '#', chronology46);
        org.joda.time.LocalTime localTime49 = localTime47.plusSeconds((int) 'a');
        int[] intArray53 = new int[] { 26, '#', 31 };
        int int54 = offsetDateTimeField32.getMinimumValue((org.joda.time.ReadablePartial) localTime49, intArray53);
        org.joda.time.Days days55 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType56 = days55.getFieldType();
        boolean boolean57 = localTime49.equals((java.lang.Object) durationFieldType56);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime59 = localTime13.withFieldAdded(durationFieldType56, 3600);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'days' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(julianChronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(julianChronology19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "0" + "'", str24, "0");
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(julianChronology42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertArrayEquals(intArray53, new int[] { 26, 35, 31 });
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(days55);
        org.junit.Assert.assertNotNull(durationFieldType56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.dayOfYear();
        org.joda.time.DateMidnight dateMidnight4 = property3.roundHalfEvenCopy();
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.plusWeeks((int) (byte) 10);
        org.joda.time.Weeks weeks8 = org.joda.time.Weeks.weeks(8);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight4.plus((org.joda.time.ReadablePeriod) weeks8);
        int int10 = dateMidnight4.getDayOfMonth();
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(weeks8);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.ONE;
        int int1 = weeks0.getWeeks();
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth(101L);
        org.joda.time.Weeks weeks4 = org.joda.time.Weeks.ZERO;
        org.joda.time.YearMonth yearMonth5 = yearMonth3.plus((org.joda.time.ReadablePeriod) weeks4);
        org.joda.time.Weeks weeks6 = weeks0.plus(weeks4);
        int int7 = weeks6.getWeeks();
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.Days days2 = org.joda.time.Days.THREE;
        int[] intArray5 = gregorianChronology1.get((org.joda.time.ReadablePeriod) days2, (long) 0, (-1L));
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology1.dayOfMonth();
        org.joda.time.Chronology chronology7 = gregorianChronology1.withUTC();
        org.joda.time.YearMonth yearMonth8 = new org.joda.time.YearMonth(chronology7);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0 });
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((java.lang.Object) dateTimeZone0, dateTimeZone2);
        int int4 = mutableDateTime3.getRoundingMode();
        mutableDateTime3.addWeekyears((int) '4');
        mutableDateTime3.addHours((int) (short) 1);
        mutableDateTime3.setMillisOfDay(100);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusMinutes((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusWeeks(1970);
        org.joda.time.DateTime dateTime17 = localDateTime14.toDateTime();
        org.joda.time.Days days18 = org.joda.time.Days.daysBetween((org.joda.time.ReadableInstant) mutableDateTime3, (org.joda.time.ReadableInstant) dateTime17);
        mutableDateTime3.addMillis(50);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(days18);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Days days1 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType2 = days1.getFieldType();
        org.joda.time.LocalDate localDate4 = localDate0.withFieldAdded(durationFieldType2, 1);
        org.joda.time.LocalDate.Property property5 = localDate4.era();
        org.joda.time.LocalDate localDate6 = property5.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = property5.setCopy("weekyearOfCentury");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"weekyearOfCentury\" for era is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.addMonths((int) (short) 100);
        mutableDateTime0.addYears((int) (byte) 100);
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
        org.joda.time.DurationField durationField24 = offsetDateTimeField23.getLeapDurationField();
        mutableDateTime0.setRounding((org.joda.time.DateTimeField) offsetDateTimeField23);
        mutableDateTime0.addMinutes(5999999);
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(julianChronology10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0" + "'", str15, "0");
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNull(durationField24);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.Chronology chronology2 = localDate0.getChronology();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(chronology2);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.Days days2 = org.joda.time.Days.THREE;
        int[] intArray5 = gregorianChronology1.get((org.joda.time.ReadablePeriod) days2, (long) 0, (-1L));
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology1.monthOfYear();
        org.joda.time.field.DelegatedDateTimeField delegatedDateTimeField8 = new org.joda.time.field.DelegatedDateTimeField(dateTimeField7);
        long long10 = delegatedDateTimeField8.roundHalfFloor((long) 3);
        org.joda.time.DurationField durationField11 = delegatedDateTimeField8.getRangeDurationField();
        long long14 = durationField11.getMillis((int) (short) -1, (-4544201088000000L));
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0 });
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-31536000000L) + "'", long14 == (-31536000000L));
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.Days days2 = org.joda.time.Days.THREE;
        int[] intArray5 = gregorianChronology1.get((org.joda.time.ReadablePeriod) days2, (long) 0, (-1L));
        org.joda.time.DurationField durationField6 = gregorianChronology1.halfdays();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = gregorianChronology1.getDateTimeMillis((int) 'a', (int) (byte) 0, 32, 10080, (int) (byte) 0, 39, 2070);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10080 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0 });
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
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
        org.joda.time.ReadablePartial readablePartial31 = null;
        java.util.Locale locale33 = null;
        java.lang.String str34 = skipDateTimeField14.getAsShortText(readablePartial31, 100, locale33);
        java.lang.String str36 = skipDateTimeField14.getAsShortText((long) 2070);
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(gregorianChronology7);
        org.junit.Assert.assertNotNull(gregorianChronology10);
        org.junit.Assert.assertNotNull(dateTimeField12);
// flaky "62) test1342(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 71 + "'", int13 == 71);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(julianChronology23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "0" + "'", str30, "0");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "100" + "'", str34, "100");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "71" + "'", str36, "71");
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.junit.Assert.assertNotNull(islamicChronology0);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        org.joda.time.Days days0 = org.joda.time.Days.THREE;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property3.getFieldType();
        boolean boolean5 = days0.equals((java.lang.Object) property3);
        org.joda.time.DateTime dateTime6 = property3.getDateTime();
        org.joda.time.DateTime.Property property7 = dateTime6.era();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology9 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone8);
        org.joda.time.Days days10 = org.joda.time.Days.THREE;
        int[] intArray13 = gregorianChronology9.get((org.joda.time.ReadablePeriod) days10, (long) 0, (-1L));
        org.joda.time.Duration duration14 = days10.toStandardDuration();
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
        boolean boolean29 = duration14.isShorterThan((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Duration duration30 = duration14.negated();
        long long31 = org.joda.time.DateTimeUtils.getDurationMillis((org.joda.time.ReadableDuration) duration30);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime6, (org.joda.time.ReadableDuration) duration30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater than the start instant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(gregorianChronology9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1970 + "'", int18 == 1970);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(gregorianChronology21);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-259200000L) + "'", long31 == (-259200000L));
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.JulianChronology julianChronology1 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone0);
        org.joda.time.MonthDay monthDay2 = org.joda.time.MonthDay.now((org.joda.time.Chronology) julianChronology1);
        org.joda.time.MonthDay.Property property3 = monthDay2.monthOfYear();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfWeek();
        int int7 = dateTime5.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology9 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone8);
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology9);
        org.joda.time.DateMidnight.Property property11 = dateMidnight10.dayOfYear();
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableInstant) dateMidnight10);
        int int13 = property3.compareTo((org.joda.time.ReadableInstant) dateMidnight10);
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now();
        mutableDateTime14.setDayOfYear(8);
        mutableDateTime14.setDayOfYear(31);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        mutableDateTime14.setZone(dateTimeZone19);
        mutableDateTime14.setDayOfYear(26);
        org.joda.time.Seconds seconds23 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant) dateMidnight10, (org.joda.time.ReadableInstant) mutableDateTime14);
        org.junit.Assert.assertNotNull(julianChronology1);
        org.junit.Assert.assertNotNull(monthDay2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(gregorianChronology9);
        org.junit.Assert.assertNotNull(property11);
// flaky "63) test1345(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(seconds23);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        java.lang.Object obj0 = null;
        org.joda.time.Interval interval1 = new org.joda.time.Interval(obj0);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.dayOfMonth();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.Instant instant1 = gJChronology0.getGregorianCutover();
        long long6 = gJChronology0.getDateTimeMillis(19, (int) (byte) 1, 25, 25);
        long long10 = gJChronology0.add(1743535724466L, (long) 1, 3);
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-61565702399975L) + "'", long6 == (-61565702399975L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1743535724469L + "'", long10 == 1743535724469L);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property2 = dateTime1.dayOfWeek();
        int int3 = dateTime1.getWeekyear();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime1.plus(readableDuration4);
        org.joda.time.DateTime.Property property6 = dateTime5.minuteOfDay();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod();
        boolean boolean9 = mutablePeriod7.equals((java.lang.Object) (-1L));
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology11 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone10);
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology11);
        org.joda.time.DateMidnight.Property property13 = dateMidnight12.weekyear();
        int int14 = dateMidnight12.getDayOfWeek();
        org.joda.time.Chronology chronology15 = dateMidnight12.getChronology();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property18 = dateTime17.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = property18.getFieldType();
        int int20 = dateMidnight12.get(dateTimeFieldType19);
        org.joda.time.Interval interval21 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) mutablePeriod7, (org.joda.time.ReadableInstant) dateMidnight12);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property25 = dateTime23.property(dateTimeFieldType24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.chrono.JulianChronology julianChronology27 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone26);
        org.joda.time.Chronology chronology28 = julianChronology27.withUTC();
        org.joda.time.DateTimeField dateTimeField29 = dateTimeFieldType24.getField((org.joda.time.Chronology) julianChronology27);
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTimeField29.getAsShortText((int) (byte) 0, locale31);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property36 = dateTime34.property(dateTimeFieldType35);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField40 = new org.joda.time.field.OffsetDateTimeField(dateTimeField29, dateTimeFieldType35, (int) (byte) -1, (int) (byte) -1, (-35));
        org.joda.time.Partial partial42 = new org.joda.time.Partial(dateTimeFieldType35, 2);
        int int43 = dateMidnight12.get(dateTimeFieldType35);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime45 = dateTime5.withField(dateTimeFieldType35, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfHalfday must be in the range [0,11]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1970 + "'", int3 == 1970);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(gregorianChronology11);
        org.junit.Assert.assertNotNull(property13);
// flaky "64) test1349(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
// flaky "10) test1349(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(julianChronology27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "0" + "'", str32, "0");
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.TWO;
        java.lang.String str1 = minutes0.toString();
        int int2 = minutes0.size();
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "PT2M" + "'", str1, "PT2M");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
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
        int int43 = property41.getMaximumValue();
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
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 59 + "'", int43 == 59);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone1);
        org.joda.time.Days days3 = org.joda.time.Days.THREE;
        int[] intArray6 = gregorianChronology2.get((org.joda.time.ReadablePeriod) days3, (long) 0, (-1L));
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology2.dayOfMonth();
        org.joda.time.DurationField durationField8 = gregorianChronology2.millis();
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) 26, (org.joda.time.Chronology) gregorianChronology2, locale9);
        org.joda.time.DurationField durationField11 = gregorianChronology2.centuries();
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0 });
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        org.joda.time.YearMonth yearMonth1 = new org.joda.time.YearMonth(101L);
        org.joda.time.YearMonth.Property property2 = yearMonth1.year();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property5 = dateTime4.dayOfWeek();
        org.joda.time.DateTime dateTime6 = property5.roundHalfFloorCopy();
        int int7 = property2.compareTo((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.YearMonth yearMonth9 = property2.addWrapFieldToCopy(2);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(yearMonth9);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property2 = dateTime1.dayOfWeek();
        int int3 = dateTime1.getWeekyear();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime1.plus(readableDuration4);
        org.joda.time.DateTime.Property property6 = dateTime5.minuteOfDay();
        org.joda.time.Hours hours7 = org.joda.time.Hours.TWO;
        org.joda.time.DateTime dateTime9 = dateTime5.withPeriodAdded((org.joda.time.ReadablePeriod) hours7, (int) (byte) 1);
        int int10 = dateTime9.getYear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1970 + "'", int3 == 1970);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(hours7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1970 + "'", int10 == 1970);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) -1, chronology1);
        java.lang.Object obj3 = null;
        boolean boolean4 = dateMidnight2.equals(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullTime();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone2);
        org.joda.time.Chronology chronology4 = julianChronology3.withUTC();
        java.util.Locale locale5 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, (org.joda.time.Chronology) julianChronology3, locale5);
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property9 = dateTime8.dayOfWeek();
        int int10 = dateTime8.getWeekyear();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.plus(readableDuration11);
        org.joda.time.DateTime.Property property13 = dateTime12.era();
        boolean boolean14 = dateTimeParserBucket6.restoreState((java.lang.Object) property13);
        org.joda.time.DateTimeZone dateTimeZone15 = dateTimeParserBucket6.getZone();
        org.joda.time.DateTimeZone dateTimeZone16 = dateTimeParserBucket6.getZone();
        java.lang.String str17 = dateTimeZone16.getID();
        org.joda.time.chrono.GregorianChronology gregorianChronology18 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.chrono.JulianChronology julianChronology20 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone19);
        org.joda.time.MonthDay monthDay21 = org.joda.time.MonthDay.now((org.joda.time.Chronology) julianChronology20);
        org.joda.time.DateTimeZone dateTimeZone22 = julianChronology20.getZone();
        long long24 = dateTimeZone16.getMillisKeepLocal(dateTimeZone22, 259200000L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter0.withZone(dateTimeZone22);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology26 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.chrono.JulianChronology julianChronology29 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone28);
        org.joda.time.Chronology chronology30 = julianChronology29.withUTC();
        java.util.Locale locale31 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, (org.joda.time.Chronology) julianChronology29, locale31);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property35 = dateTime34.dayOfWeek();
        int int36 = dateTime34.getWeekyear();
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.DateTime dateTime38 = dateTime34.plus(readableDuration37);
        org.joda.time.DateTime.Property property39 = dateTime38.era();
        boolean boolean40 = dateTimeParserBucket32.restoreState((java.lang.Object) property39);
        org.joda.time.DateTimeZone dateTimeZone41 = dateTimeParserBucket32.getZone();
        org.joda.time.DateTimeZone dateTimeZone42 = dateTimeParserBucket32.getZone();
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight(dateTimeZone42);
        org.joda.time.MonthDay monthDay44 = org.joda.time.MonthDay.now(dateTimeZone42);
        org.joda.time.Chronology chronology45 = ethiopicChronology26.withZone(dateTimeZone42);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1970 + "'", int10 == 1970);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertNotNull(gregorianChronology18);
        org.junit.Assert.assertNotNull(julianChronology20);
        org.junit.Assert.assertNotNull(monthDay21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 259200000L + "'", long24 == 259200000L);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(ethiopicChronology26);
        org.junit.Assert.assertNotNull(julianChronology29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1970 + "'", int36 == 1970);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertNotNull(monthDay44);
        org.junit.Assert.assertNotNull(chronology45);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime2 = property1.roundFloor();
        mutableDateTime2.addMonths(2025);
        int int5 = mutableDateTime2.getEra();
        mutableDateTime2.addWeekyears(0);
        java.lang.Object obj8 = mutableDateTime2.clone();
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(obj8);
// flaky "65) test1357(RegressionTest2)":         org.junit.Assert.assertEquals(obj8.toString(), "2138-10-01T00:00:00.000Z");
// flaky "11) test1357(RegressionTest2)":         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "2138-10-01T00:00:00.000Z");
// flaky "2) test1357(RegressionTest2)":         org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "2138-10-01T00:00:00.000Z");
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
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
        org.joda.time.PeriodType periodType20 = periodType3.withMinutesRemoved();
        int int21 = periodType20.size();
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
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = buddhistChronology0.hours();
        java.lang.String str2 = buddhistChronology0.toString();
        org.junit.Assert.assertNotNull(buddhistChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "BuddhistChronology[UTC]" + "'", str2, "BuddhistChronology[UTC]");
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.MAX_VALUE;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds3 = seconds1.plus((int) ' ');
        org.joda.time.Seconds seconds4 = seconds0.minus(seconds1);
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(seconds4);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.setMillis((-1L));
        int int3 = mutableDateTime0.getDayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now();
        mutableDateTime4.addMonths((int) (short) 100);
        mutableDateTime4.addYears((int) (byte) 100);
        int int9 = mutableDateTime0.compareTo((org.joda.time.ReadableInstant) mutableDateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod();
        org.joda.time.Days days1 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType2 = days1.getFieldType();
        org.joda.time.PeriodType periodType3 = days1.getPeriodType();
        mutablePeriod0.add((org.joda.time.ReadablePeriod) days1);
        int int5 = mutablePeriod0.getHours();
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod();
        boolean boolean8 = mutablePeriod6.equals((java.lang.Object) (-1L));
        mutablePeriod6.setPeriod(86400000, 13, (int) (byte) -1, (int) ' ', 26, (-35), (int) (short) -1, (int) (short) 100);
        org.joda.time.Days days19 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType20 = days19.getFieldType();
        org.joda.time.PeriodType periodType21 = days19.getPeriodType();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property27 = dateTime25.property(dateTimeFieldType26);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.chrono.JulianChronology julianChronology29 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone28);
        org.joda.time.Chronology chronology30 = julianChronology29.withUTC();
        org.joda.time.DateTimeField dateTimeField31 = dateTimeFieldType26.getField((org.joda.time.Chronology) julianChronology29);
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology29);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.chrono.JulianChronology julianChronology34 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone33);
        org.joda.time.Chronology chronology35 = julianChronology34.withUTC();
        mutableInterval32.setChronology((org.joda.time.Chronology) julianChronology34);
        org.joda.time.Period period37 = new org.joda.time.Period((long) (byte) 0, periodType21, (org.joda.time.Chronology) julianChronology34);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology39 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone38);
        org.joda.time.DateMidnight dateMidnight40 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology39);
        org.joda.time.DateMidnight.Property property41 = dateMidnight40.dayOfYear();
        org.joda.time.DateMidnight dateMidnight42 = property41.roundHalfEvenCopy();
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight42.plusWeeks((int) (byte) 10);
        org.joda.time.Days days45 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType46 = days45.getFieldType();
        org.joda.time.DateMidnight dateMidnight48 = dateMidnight44.withFieldAdded(durationFieldType46, 26);
        org.joda.time.Period period50 = period37.withFieldAdded(durationFieldType46, (int) (short) 1);
        boolean boolean51 = mutablePeriod6.isSupported(durationFieldType46);
        boolean boolean52 = mutablePeriod0.isSupported(durationFieldType46);
        org.joda.time.IllegalFieldValueException illegalFieldValueException56 = new org.joda.time.IllegalFieldValueException(durationFieldType46, (java.lang.Number) 10, (java.lang.Number) (-4544201088000000L), (java.lang.Number) 3600);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(julianChronology29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(julianChronology34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(gregorianChronology39);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(dateMidnight42);
        org.junit.Assert.assertNotNull(dateMidnight44);
        org.junit.Assert.assertNotNull(days45);
        org.junit.Assert.assertNotNull(durationFieldType46);
        org.junit.Assert.assertNotNull(dateMidnight48);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
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
        int int43 = property41.getMinimumValue();
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
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
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
        org.joda.time.DateTimeField dateTimeField33 = skipDateTimeField14.getWrappedField();
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(gregorianChronology7);
        org.junit.Assert.assertNotNull(gregorianChronology10);
        org.junit.Assert.assertNotNull(dateTimeField12);
// flaky "66) test1364(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 71 + "'", int13 == 71);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(julianChronology23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "0" + "'", str30, "0");
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(dateTimeField33);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusSeconds((int) (short) 0);
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
        org.joda.time.DateTimeZone dateTimeZone18 = dateTimeParserBucket8.getZone();
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone18.getName((long) 59, locale20);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property27 = dateTime25.property(dateTimeFieldType26);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.chrono.JulianChronology julianChronology29 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone28);
        org.joda.time.Chronology chronology30 = julianChronology29.withUTC();
        org.joda.time.DateTimeField dateTimeField31 = dateTimeFieldType26.getField((org.joda.time.Chronology) julianChronology29);
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology29);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.chrono.JulianChronology julianChronology34 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone33);
        org.joda.time.Chronology chronology35 = julianChronology34.withUTC();
        mutableInterval32.setChronology((org.joda.time.Chronology) julianChronology34);
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property42 = dateTime40.property(dateTimeFieldType41);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.chrono.JulianChronology julianChronology44 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone43);
        org.joda.time.Chronology chronology45 = julianChronology44.withUTC();
        org.joda.time.DateTimeField dateTimeField46 = dateTimeFieldType41.getField((org.joda.time.Chronology) julianChronology44);
        org.joda.time.MutableInterval mutableInterval47 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology44);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.chrono.JulianChronology julianChronology49 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone48);
        org.joda.time.Chronology chronology50 = julianChronology49.withUTC();
        mutableInterval47.setChronology((org.joda.time.Chronology) julianChronology49);
        boolean boolean52 = mutableInterval32.overlaps((org.joda.time.ReadableInterval) mutableInterval47);
        boolean boolean53 = dateTimeZone18.equals((java.lang.Object) mutableInterval47);
        boolean boolean54 = localDateTime0.equals((java.lang.Object) mutableInterval47);
        org.joda.time.LocalDateTime.Property property55 = localDateTime0.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime57 = property55.setCopy("Wednesday");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Wednesday\" for weekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(julianChronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1970 + "'", int12 == 1970);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Coordinated Universal Time" + "'", str21, "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(julianChronology29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(julianChronology34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(julianChronology44);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(julianChronology49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(property55);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 100, dateTimeZone1);
        boolean boolean4 = localTime2.equals((java.lang.Object) 26);
        int int5 = localTime2.getMillisOfDay();
        org.joda.time.LocalTime localTime7 = localTime2.plusMillis(1970);
        org.joda.time.LocalTime localTime9 = localTime2.minusMinutes(0);
        org.joda.time.LocalTime.Property property10 = localTime9.hourOfDay();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        org.joda.time.Period period1 = org.joda.time.Period.weeks((int) (byte) 0);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone1);
        org.joda.time.Days days3 = org.joda.time.Days.THREE;
        int[] intArray6 = gregorianChronology2.get((org.joda.time.ReadablePeriod) days3, (long) 0, (-1L));
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) 1969, (org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfMonth();
        org.joda.time.DateTime dateTime10 = property8.addToCopy(0);
        int int11 = dateTime10.getSecondOfMinute();
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0 });
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
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
        boolean boolean19 = hours10.equals((java.lang.Object) dateTimeFieldType13);
        org.joda.time.Hours hours20 = org.joda.time.Hours.FOUR;
        org.joda.time.Hours hours22 = hours20.dividedBy((int) (short) -1);
        org.joda.time.Hours hours23 = hours10.plus(hours20);
        org.joda.time.Hours hours25 = hours20.plus(3);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(julianChronology16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(hours20);
        org.junit.Assert.assertNotNull(hours22);
        org.junit.Assert.assertNotNull(hours23);
        org.junit.Assert.assertNotNull(hours25);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.mediumDate();
        boolean boolean1 = dateTimeFormatter0.isParser();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusHours((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusMillis(2);
        org.joda.time.Chronology chronology7 = localDateTime4.getChronology();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) 2070, chronology7);
        int int9 = dateTime8.getSecondOfDay();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.printZeroIfSupported();
        periodFormatterBuilder1.clear();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder1.printZeroRarelyFirst();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder5 = periodFormatterBuilder1.appendLiteral("1969-12-19T00:00:00.007Z/1969-12-19T00:00:00.097Z");
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder5);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone1);
        org.joda.time.Days days3 = org.joda.time.Days.THREE;
        int[] intArray6 = gregorianChronology2.get((org.joda.time.ReadablePeriod) days3, (long) 0, (-1L));
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology2.dayOfMonth();
        org.joda.time.DurationField durationField8 = gregorianChronology2.millis();
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) 26, (org.joda.time.Chronology) gregorianChronology2, locale9);
        org.joda.time.Chronology chronology11 = gregorianChronology2.withUTC();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.chrono.JulianChronology julianChronology14 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone13);
        org.joda.time.Chronology chronology15 = julianChronology14.withUTC();
        java.util.Locale locale16 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, (org.joda.time.Chronology) julianChronology14, locale16);
        org.joda.time.DateTimeField dateTimeField18 = julianChronology14.hourOfDay();
        org.joda.time.field.SkipDateTimeField skipDateTimeField20 = new org.joda.time.field.SkipDateTimeField(chronology11, dateTimeField18, (-1));
        long long23 = skipDateTimeField20.addWrapField(1512000000L, 604800000);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0 });
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(julianChronology14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1512000000L + "'", long23 == 1512000000L);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
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
        java.lang.String str24 = timeOfDay18.toString();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime((long) 100, dateTimeZone26);
        org.joda.time.Days days28 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType29 = days28.getFieldType();
        boolean boolean30 = localTime27.isSupported(durationFieldType29);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay32 = timeOfDay18.withFieldAdded(durationFieldType29, 168);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'days' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "T23:59:28.001" + "'", str24, "T23:59:28.001");
        org.junit.Assert.assertNotNull(days28);
        org.junit.Assert.assertNotNull(durationFieldType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime dateTime3 = dateTime1.withYear((-35));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = dateTime1.withDayOfYear((-20274));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -20274 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
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
        int int22 = offsetDateTimeField18.get((long) 3);
        int int23 = offsetDateTimeField18.getMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            long long26 = offsetDateTimeField18.add((long) 31, (long) 1969);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-35) + "'", int23 == (-35));
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime dateTime3 = dateTime1.plusMonths(0);
        org.joda.time.DateTime dateTime4 = dateTime1.toDateTimeISO();
        org.joda.time.DateTime dateTime6 = dateTime1.plusMillis(0);
        org.joda.time.DateTime.Property property7 = dateTime6.era();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
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
            long long24 = offsetDateTimeField18.add(1743535724466L, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6 for hourOfHalfday must be in the range [-1,-35]");
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
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property5 = dateTime3.property(dateTimeFieldType4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone6);
        org.joda.time.Chronology chronology8 = julianChronology7.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType4.getField((org.joda.time.Chronology) julianChronology7);
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology7);
        org.joda.time.DateTimeField dateTimeField11 = julianChronology7.yearOfCentury();
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(julianChronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfMonth((int) (byte) 1);
        org.joda.time.TimeOfDay timeOfDay4 = dateTime3.toTimeOfDay();
        org.joda.time.DateTime dateTime6 = dateTime3.plusMillis((-4));
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
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
        org.joda.time.YearMonthDay yearMonthDay19 = yearMonthDay6.withDayOfMonth(1);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(date5);
// flaky "67) test1381(RegressionTest2)":         org.junit.Assert.assertEquals(date5.toString(), "Wed Dec 31 19:00:00 EST 1969");
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
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime2 = property1.roundFloor();
        int int3 = mutableDateTime2.getYear();
        mutableDateTime2.addDays(1969);
        mutableDateTime2.setMillisOfSecond((int) (short) 0);
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(mutableDateTime2);
// flaky "68) test1382(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1970 + "'", int3 == 1970);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod();
        boolean boolean2 = mutablePeriod0.equals((java.lang.Object) (-1L));
        mutablePeriod0.addYears(100);
        org.joda.time.format.PeriodFormatter periodFormatter5 = org.joda.time.format.ISOPeriodFormat.alternate();
        java.lang.String str6 = mutablePeriod0.toString(periodFormatter5);
        java.util.Locale locale7 = periodFormatter5.getLocale();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "P01000000T000000" + "'", str6, "P01000000T000000");
        org.junit.Assert.assertNull(locale7);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        org.joda.time.Days days0 = org.joda.time.Days.ZERO;
        org.joda.time.Days days1 = org.joda.time.Days.THREE;
        org.joda.time.Days days3 = days1.minus((int) (short) 1);
        org.joda.time.Days days5 = days3.minus((-19));
        org.joda.time.Days days6 = days0.plus(days3);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days6);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime dateTime5 = dateTime3.withDayOfMonth((int) (byte) 1);
        org.joda.time.TimeOfDay timeOfDay6 = dateTime5.toTimeOfDay();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property9 = dateTime8.dayOfWeek();
        int int10 = dateTime8.getWeekyear();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.plus(readableDuration11);
        org.joda.time.DateTime.Property property13 = dateTime12.era();
        boolean boolean15 = dateTime12.isBefore(26L);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Chronology chronology17 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime12, readableInstant16);
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay6.withChronologyRetainFields(chronology17);
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay18.minusSeconds((int) ' ');
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod();
        org.joda.time.ReadableInterval readableInterval22 = null;
        mutablePeriod21.add(readableInterval22);
        org.joda.time.TimeOfDay timeOfDay25 = timeOfDay20.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod21, 1970);
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod();
        boolean boolean28 = mutablePeriod26.equals((java.lang.Object) (-1L));
        mutablePeriod26.addDays(26);
        java.lang.Object obj31 = mutablePeriod26.clone();
        org.joda.time.TimeOfDay timeOfDay32 = timeOfDay20.plus((org.joda.time.ReadablePeriod) mutablePeriod26);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = localDate0.compareTo((org.joda.time.ReadablePartial) timeOfDay32);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1970 + "'", int10 == 1970);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "P26D");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "P26D");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "P26D");
        org.junit.Assert.assertNotNull(timeOfDay32);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
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
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight2.withYear(13);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(property3);
// flaky "69) test1386(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(dateMidnight12);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap0 = org.joda.time.DateTimeUtils.getDefaultTimeZoneNames();
        org.joda.time.DateTimeUtils.setDefaultTimeZoneNames(strMap0);
        org.joda.time.DateTimeUtils.setDefaultTimeZoneNames(strMap0);
        org.junit.Assert.assertNotNull(strMap0);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = gregorianChronology1.getZone();
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicDate();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withYearOfEra(10);
        org.joda.time.LocalDate.Property property3 = localDate0.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property3.getFieldType();
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateTimeNoMillis();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
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
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Days days19 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType20 = days19.getFieldType();
        org.joda.time.PeriodType periodType21 = days19.getPeriodType();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property27 = dateTime25.property(dateTimeFieldType26);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.chrono.JulianChronology julianChronology29 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone28);
        org.joda.time.Chronology chronology30 = julianChronology29.withUTC();
        org.joda.time.DateTimeField dateTimeField31 = dateTimeFieldType26.getField((org.joda.time.Chronology) julianChronology29);
        org.joda.time.MutableInterval mutableInterval32 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology29);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.chrono.JulianChronology julianChronology34 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone33);
        org.joda.time.Chronology chronology35 = julianChronology34.withUTC();
        mutableInterval32.setChronology((org.joda.time.Chronology) julianChronology34);
        org.joda.time.Period period37 = new org.joda.time.Period((long) (byte) 0, periodType21, (org.joda.time.Chronology) julianChronology34);
        org.joda.time.PeriodType periodType38 = periodType21.withDaysRemoved();
        org.joda.time.Period period39 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration15, readableInstant17, periodType38);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType41 = period39.getFieldType(60);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 60");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(julianChronology29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(julianChronology34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(periodType38);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusHours((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.dayOfYear();
        org.joda.time.LocalDateTime.Property property5 = localDateTime3.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime6 = property5.getLocalDateTime();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays((long) 8);
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
        mutableInterval12.setEndMillis((long) 'a');
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property21 = dateTime20.dayOfWeek();
        int int22 = dateTime20.getWeekyear();
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.DateTime dateTime24 = dateTime20.plus(readableDuration23);
        boolean boolean25 = mutableInterval12.contains((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.Days days26 = org.joda.time.Days.THREE;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property29 = dateTime28.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = property29.getFieldType();
        boolean boolean31 = days26.equals((java.lang.Object) property29);
        org.joda.time.DateTime dateTime32 = property29.getDateTime();
        org.joda.time.DateTime dateTime33 = dateTime32.withEarlierOffsetAtOverlap();
        mutableInterval12.setStart((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTime.Property property35 = dateTime33.dayOfYear();
        org.joda.time.Period period36 = duration1.toPeriodFrom((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.Period period37 = period36.toPeriod();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(julianChronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(julianChronology14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1970 + "'", int22 == 1970);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(days26);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period37);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays((long) 8);
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
        mutableInterval12.setEndMillis((long) 'a');
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property21 = dateTime20.dayOfWeek();
        int int22 = dateTime20.getWeekyear();
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.DateTime dateTime24 = dateTime20.plus(readableDuration23);
        boolean boolean25 = mutableInterval12.contains((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.Days days26 = org.joda.time.Days.THREE;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property29 = dateTime28.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = property29.getFieldType();
        boolean boolean31 = days26.equals((java.lang.Object) property29);
        org.joda.time.DateTime dateTime32 = property29.getDateTime();
        org.joda.time.DateTime dateTime33 = dateTime32.withEarlierOffsetAtOverlap();
        mutableInterval12.setStart((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTime.Property property35 = dateTime33.dayOfYear();
        org.joda.time.Period period36 = duration1.toPeriodFrom((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTime.Property property37 = dateTime33.hourOfDay();
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property44 = dateTime42.property(dateTimeFieldType43);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.chrono.JulianChronology julianChronology46 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone45);
        org.joda.time.Chronology chronology47 = julianChronology46.withUTC();
        org.joda.time.DateTimeField dateTimeField48 = dateTimeFieldType43.getField((org.joda.time.Chronology) julianChronology46);
        org.joda.time.MutableInterval mutableInterval49 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology46);
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime((long) (short) -1, (org.joda.time.Chronology) julianChronology46);
        org.joda.time.DateTimeZone dateTimeZone51 = julianChronology46.getZone();
        org.joda.time.DateTime dateTime52 = dateTime33.withZone(dateTimeZone51);
        org.joda.time.DateTime dateTime54 = dateTime52.plusHours(12);
        org.joda.time.MutableDateTime mutableDateTime55 = org.joda.time.MutableDateTime.now();
        mutableDateTime55.setDayOfYear(8);
        mutableDateTime55.setDayOfYear(31);
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        mutableDateTime55.setZone(dateTimeZone60);
        org.joda.time.LocalDateTime localDateTime63 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime65 = localDateTime63.plusHours((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property66 = localDateTime65.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone67 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology68 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone67);
        org.joda.time.DateMidnight dateMidnight69 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology68);
        org.joda.time.DateMidnight.Property property70 = dateMidnight69.dayOfYear();
        org.joda.time.DateMidnight dateMidnight71 = property70.roundHalfEvenCopy();
        org.joda.time.DateMidnight dateMidnight73 = dateMidnight71.plusWeeks((int) (byte) 10);
        org.joda.time.Days days74 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType75 = days74.getFieldType();
        org.joda.time.DateMidnight dateMidnight77 = dateMidnight73.withFieldAdded(durationFieldType75, 26);
        boolean boolean78 = localDateTime65.isSupported(durationFieldType75);
        mutableDateTime55.add(durationFieldType75, (int) '#');
        org.joda.time.DateTime dateTime82 = dateTime52.withFieldAdded(durationFieldType75, (-19));
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(julianChronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(julianChronology14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1970 + "'", int22 == 1970);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(days26);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(dateTimeFieldType43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(julianChronology46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(mutableDateTime55);
        org.junit.Assert.assertNotNull(localDateTime65);
        org.junit.Assert.assertNotNull(property66);
        org.junit.Assert.assertNotNull(gregorianChronology68);
        org.junit.Assert.assertNotNull(property70);
        org.junit.Assert.assertNotNull(dateMidnight71);
        org.junit.Assert.assertNotNull(dateMidnight73);
        org.junit.Assert.assertNotNull(days74);
        org.junit.Assert.assertNotNull(durationFieldType75);
        org.junit.Assert.assertNotNull(dateMidnight77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(dateTime82);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
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
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod();
        boolean boolean26 = mutablePeriod24.equals((java.lang.Object) (-1L));
        mutablePeriod24.addDays(26);
        java.lang.Object obj29 = mutablePeriod24.clone();
        org.joda.time.TimeOfDay timeOfDay30 = timeOfDay18.plus((org.joda.time.ReadablePeriod) mutablePeriod24);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay33 = timeOfDay18.withField(dateTimeFieldType31, 86400);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86400 for millisOfSecond must be in the range [0,999]");
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
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "P26D");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "P26D");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "P26D");
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight((-86401), 0, 6240, dateTimeZone3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
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
        long long49 = skipDateTimeField14.roundFloor((long) 59);
        java.lang.String str51 = skipDateTimeField14.getAsShortText(0L);
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(gregorianChronology7);
        org.junit.Assert.assertNotNull(gregorianChronology10);
        org.junit.Assert.assertNotNull(dateTimeField12);
// flaky "70) test1398(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 71 + "'", int13 == 71);
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
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-259200000L) + "'", long49 == (-259200000L));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "71" + "'", str51, "71");
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusMinutes(23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth yearMonth4 = new org.joda.time.YearMonth((java.lang.Object) 23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.Days days2 = org.joda.time.Days.THREE;
        int[] intArray5 = gregorianChronology1.get((org.joda.time.ReadablePeriod) days2, (long) 0, (-1L));
        org.joda.time.DurationField durationField6 = gregorianChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology1.yearOfEra();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((org.joda.time.Chronology) gregorianChronology1);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0 });
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicDateTimeNoMillis();
        boolean boolean1 = dateTimeFormatter0.isParser();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusSeconds((int) (short) 0);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.weekOfWeekyear();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-1511999993L), 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1512000003L) + "'", long2 == (-1512000003L));
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) -1, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = dateMidnight2.getZone();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property7 = dateTime5.property(dateTimeFieldType6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.JulianChronology julianChronology9 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone8);
        org.joda.time.Chronology chronology10 = julianChronology9.withUTC();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType6.getField((org.joda.time.Chronology) julianChronology9);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.Chronology chronology13 = julianChronology9.withZone(dateTimeZone12);
        org.joda.time.chrono.StrictChronology strictChronology14 = org.joda.time.chrono.StrictChronology.getInstance(chronology13);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate17 = localDate15.withYearOfEra(10);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.chrono.JulianChronology julianChronology20 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone19);
        org.joda.time.Chronology chronology21 = julianChronology20.withUTC();
        java.util.Locale locale22 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, (org.joda.time.Chronology) julianChronology20, locale22);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property26 = dateTime25.dayOfWeek();
        int int27 = dateTime25.getWeekyear();
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.DateTime dateTime29 = dateTime25.plus(readableDuration28);
        org.joda.time.DateTime.Property property30 = dateTime29.era();
        boolean boolean31 = dateTimeParserBucket23.restoreState((java.lang.Object) property30);
        org.joda.time.DateTimeZone dateTimeZone32 = dateTimeParserBucket23.getZone();
        org.joda.time.DateTime dateTime33 = localDate15.toDateTimeAtCurrentTime(dateTimeZone32);
        org.joda.time.DateTime dateTime34 = org.joda.time.DateTime.now(dateTimeZone32);
        org.joda.time.Chronology chronology35 = strictChronology14.withZone(dateTimeZone32);
        org.joda.time.DateTime dateTime36 = dateMidnight2.toDateTime(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(julianChronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(strictChronology14);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(julianChronology20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1970 + "'", int27 == 1970);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTime36);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
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
        boolean boolean32 = skipDateTimeField14.isLeap((long) (-4));
        int int34 = skipDateTimeField14.get(0L);
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(gregorianChronology7);
        org.junit.Assert.assertNotNull(gregorianChronology10);
        org.junit.Assert.assertNotNull(dateTimeField12);
// flaky "71) test1405(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 71 + "'", int13 == 71);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(julianChronology23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "0" + "'", str30, "0");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 71 + "'", int34 == 71);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfWeek();
        org.joda.time.DateTime dateTime4 = property3.roundHalfFloorCopy();
        int int5 = dateTimeZone0.getOffset((org.joda.time.ReadableInstant) dateTime4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0, 23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 23");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days1 = org.joda.time.Days.parseDays("1970-01-01");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"1970-01-01\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
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
        int int45 = localTime44.getMillisOfSecond();
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 35 + "'", int45 == 35);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.Chronology chronology3 = julianChronology2.withUTC();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, (org.joda.time.Chronology) julianChronology2, locale4);
        org.joda.time.DateTimeField dateTimeField6 = julianChronology2.centuryOfEra();
        java.lang.String str7 = julianChronology2.toString();
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JulianChronology[UTC]" + "'", str7, "JulianChronology[UTC]");
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
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
        org.joda.time.TimeOfDay timeOfDay19 = property17.addToCopy((int) (short) -1);
        org.joda.time.TimeOfDay timeOfDay21 = timeOfDay19.plusHours(6);
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        org.joda.time.DateTime dateTime24 = timeOfDay21.toDateTimeToday(dateTimeZone23);
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
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTime24);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
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
        org.joda.time.Days days21 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType22 = days21.getFieldType();
        org.joda.time.PeriodType periodType23 = days21.getPeriodType();
        boolean boolean24 = periodType4.equals((java.lang.Object) periodType23);
        org.joda.time.Period period25 = new org.joda.time.Period((long) 13, periodType23);
        org.joda.time.Period period27 = period25.minusWeeks(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period29 = period25.minusHours(100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(period27);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.dayOfYear();
        org.joda.time.DateMidnight dateMidnight4 = property3.roundHalfEvenCopy();
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.withYearOfCentury(100);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight4.withDurationAdded(readableDuration7, 31);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology11 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone10);
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology11);
        org.joda.time.DateMidnight.Property property13 = dateMidnight12.dayOfYear();
        org.joda.time.DateMidnight dateMidnight14 = property13.roundHalfEvenCopy();
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.withYearOfCentury(100);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight14.withDurationAdded(readableDuration17, 31);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property22 = dateTime21.dayOfWeek();
        int int23 = dateTime21.getWeekyear();
        int int24 = dateTime21.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology26 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone25);
        org.joda.time.Days days27 = org.joda.time.Days.THREE;
        int[] intArray30 = gregorianChronology26.get((org.joda.time.ReadablePeriod) days27, (long) 0, (-1L));
        org.joda.time.Duration duration31 = days27.toStandardDuration();
        org.joda.time.DateTime dateTime33 = dateTime21.withDurationAdded((org.joda.time.ReadableDuration) duration31, 26);
        org.joda.time.Duration duration35 = duration31.multipliedBy((long) (short) 1);
        org.joda.time.Duration duration36 = duration35.toDuration();
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight19.plus((org.joda.time.ReadableDuration) duration35);
        org.joda.time.Days days38 = org.joda.time.Days.THREE;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property41 = dateTime40.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = property41.getFieldType();
        boolean boolean43 = days38.equals((java.lang.Object) property41);
        org.joda.time.DateTime dateTime44 = property41.getDateTime();
        org.joda.time.DateTime.Property property45 = dateTime44.era();
        org.joda.time.DateTime dateTime47 = dateTime44.withHourOfDay(12);
        org.joda.time.PeriodType periodType48 = org.joda.time.PeriodType.weeks();
        org.joda.time.Period period49 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration35, (org.joda.time.ReadableInstant) dateTime47, periodType48);
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight4, (org.joda.time.ReadableDuration) duration35);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(gregorianChronology11);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1970 + "'", int23 == 1970);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(gregorianChronology26);
        org.junit.Assert.assertNotNull(days27);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(dateMidnight37);
        org.junit.Assert.assertNotNull(days38);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(periodType48);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.Days days2 = org.joda.time.Days.THREE;
        int[] intArray5 = gregorianChronology1.get((org.joda.time.ReadablePeriod) days2, (long) 0, (-1L));
        org.joda.time.Duration duration6 = days2.toStandardDuration();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property9 = dateTime8.dayOfWeek();
        int int10 = dateTime8.getWeekyear();
        int int11 = dateTime8.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology13 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone12);
        org.joda.time.Days days14 = org.joda.time.Days.THREE;
        int[] intArray17 = gregorianChronology13.get((org.joda.time.ReadablePeriod) days14, (long) 0, (-1L));
        org.joda.time.Duration duration18 = days14.toStandardDuration();
        org.joda.time.DateTime dateTime20 = dateTime8.withDurationAdded((org.joda.time.ReadableDuration) duration18, 26);
        boolean boolean21 = duration6.isShorterThan((org.joda.time.ReadableDuration) duration18);
        org.joda.time.Duration duration23 = duration18.plus(90L);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology26 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone25);
        org.joda.time.DateTimeField dateTimeField27 = gregorianChronology26.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((org.joda.time.Chronology) gregorianChronology26);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.chrono.JulianChronology julianChronology31 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone30);
        org.joda.time.Chronology chronology32 = julianChronology31.withUTC();
        java.util.Locale locale33 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, (org.joda.time.Chronology) julianChronology31, locale33);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property37 = dateTime36.dayOfWeek();
        int int38 = dateTime36.getWeekyear();
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.DateTime dateTime40 = dateTime36.plus(readableDuration39);
        org.joda.time.DateTime.Property property41 = dateTime40.era();
        boolean boolean42 = dateTimeParserBucket34.restoreState((java.lang.Object) property41);
        org.joda.time.DateTimeZone dateTimeZone43 = dateTimeParserBucket34.getZone();
        long long47 = dateTimeZone43.convertLocalToUTC(26L, true, 1L);
        org.joda.time.Chronology chronology48 = gregorianChronology26.withZone(dateTimeZone43);
        org.joda.time.DateMidnight dateMidnight49 = new org.joda.time.DateMidnight(43200000L, dateTimeZone43);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology51 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone50);
        org.joda.time.Days days52 = org.joda.time.Days.THREE;
        int[] intArray55 = gregorianChronology51.get((org.joda.time.ReadablePeriod) days52, (long) 0, (-1L));
        org.joda.time.Duration duration56 = days52.toStandardDuration();
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property59 = dateTime58.dayOfWeek();
        int int60 = dateTime58.getWeekyear();
        int int61 = dateTime58.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology63 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone62);
        org.joda.time.Days days64 = org.joda.time.Days.THREE;
        int[] intArray67 = gregorianChronology63.get((org.joda.time.ReadablePeriod) days64, (long) 0, (-1L));
        org.joda.time.Duration duration68 = days64.toStandardDuration();
        org.joda.time.DateTime dateTime70 = dateTime58.withDurationAdded((org.joda.time.ReadableDuration) duration68, 26);
        boolean boolean71 = duration56.isShorterThan((org.joda.time.ReadableDuration) duration68);
        org.joda.time.Duration duration73 = duration68.plus(90L);
        org.joda.time.DateMidnight dateMidnight74 = dateMidnight49.minus((org.joda.time.ReadableDuration) duration73);
        org.joda.time.Interval interval75 = duration18.toIntervalFrom((org.joda.time.ReadableInstant) dateMidnight74);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1970 + "'", int10 == 1970);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(gregorianChronology13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(gregorianChronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(julianChronology31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1970 + "'", int38 == 1970);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 26L + "'", long47 == 26L);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(gregorianChronology51);
        org.junit.Assert.assertNotNull(days52);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertArrayEquals(intArray55, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1970 + "'", int60 == 1970);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(gregorianChronology63);
        org.junit.Assert.assertNotNull(days64);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertArrayEquals(intArray67, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration68);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(duration73);
        org.junit.Assert.assertNotNull(dateMidnight74);
        org.junit.Assert.assertNotNull(interval75);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.LocalDate localDate3 = localDate0.plusDays(20179);
        java.lang.String str4 = localDate0.toString();
        int int5 = localDate0.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(localDate3);
// flaky "72) test1414(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
// flaky "12) test1414(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
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
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology29 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone28);
        org.joda.time.Days days30 = org.joda.time.Days.THREE;
        int[] intArray33 = gregorianChronology29.get((org.joda.time.ReadablePeriod) days30, (long) 0, (-1L));
        org.joda.time.DateTimeField dateTimeField34 = gregorianChronology29.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField35 = gregorianChronology29.monthOfYear();
        org.joda.time.field.DelegatedDateTimeField delegatedDateTimeField36 = new org.joda.time.field.DelegatedDateTimeField(dateTimeField35);
        long long38 = delegatedDateTimeField36.roundHalfFloor((long) 3);
        org.joda.time.ReadablePartial readablePartial39 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property46 = dateTime44.property(dateTimeFieldType45);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.chrono.JulianChronology julianChronology48 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone47);
        org.joda.time.Chronology chronology49 = julianChronology48.withUTC();
        org.joda.time.DateTimeField dateTimeField50 = dateTimeFieldType45.getField((org.joda.time.Chronology) julianChronology48);
        org.joda.time.MutableInterval mutableInterval51 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology48);
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime((long) (short) -1, (org.joda.time.Chronology) julianChronology48);
        org.joda.time.DateTimeZone dateTimeZone53 = julianChronology48.getZone();
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime55.plusHours((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property58 = localDateTime57.dayOfYear();
        org.joda.time.LocalDateTime.Property property59 = localDateTime57.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology61 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone60);
        org.joda.time.Days days62 = org.joda.time.Days.THREE;
        int[] intArray65 = gregorianChronology61.get((org.joda.time.ReadablePeriod) days62, (long) 0, (-1L));
        org.joda.time.Duration duration66 = days62.toStandardDuration();
        org.joda.time.LocalDateTime localDateTime67 = localDateTime57.minus((org.joda.time.ReadableDuration) duration66);
        int[] intArray69 = julianChronology48.get((org.joda.time.ReadablePartial) localDateTime57, (long) (byte) 1);
        int int70 = delegatedDateTimeField36.getMaximumValue(readablePartial39, intArray69);
        julianChronology13.validate((org.joda.time.ReadablePartial) localDateTime27, intArray69);
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
// flaky "73) test1415(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 71 + "'", int24 == 71);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(gregorianChronology29);
        org.junit.Assert.assertNotNull(days30);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { 0 });
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(dateTimeFieldType45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(julianChronology48);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(gregorianChronology61);
        org.junit.Assert.assertNotNull(days62);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertArrayEquals(intArray65, new int[] { 0 });
        org.junit.Assert.assertNotNull(duration66);
        org.junit.Assert.assertNotNull(localDateTime67);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertArrayEquals(intArray69, new int[] { 1969, 12, 19, 1 });
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 12 + "'", int70 == 12);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        org.joda.time.Days days0 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType1 = days0.getFieldType();
        org.joda.time.PeriodType periodType2 = days0.getPeriodType();
        org.joda.time.PeriodType periodType3 = periodType2.withSecondsRemoved();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
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
        org.joda.time.chrono.CopticChronology copticChronology19 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.chrono.JulianChronology julianChronology22 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone21);
        org.joda.time.Chronology chronology23 = julianChronology22.withUTC();
        java.util.Locale locale24 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, (org.joda.time.Chronology) julianChronology22, locale24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology27 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone26);
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology27);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology30 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone29);
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology30);
        org.joda.time.DateTimeField dateTimeField32 = gregorianChronology30.weekyearOfCentury();
        int int33 = dateMidnight28.get(dateTimeField32);
        org.joda.time.field.SkipDateTimeField skipDateTimeField34 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) julianChronology22, dateTimeField32);
        org.joda.time.YearMonthDay yearMonthDay35 = new org.joda.time.YearMonthDay((org.joda.time.Chronology) julianChronology22);
        org.joda.time.Chronology chronology36 = julianChronology22.withUTC();
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
        org.joda.time.DateTime dateTime63 = yearMonthDay47.toDateTimeAtCurrentTime(dateTimeZone62);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone64 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone62);
        org.joda.time.Chronology chronology65 = julianChronology22.withZone(dateTimeZone62);
        org.joda.time.Chronology chronology66 = copticChronology19.withZone(dateTimeZone62);
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
        org.junit.Assert.assertNotNull(copticChronology19);
        org.junit.Assert.assertNotNull(julianChronology22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(gregorianChronology27);
        org.junit.Assert.assertNotNull(gregorianChronology30);
        org.junit.Assert.assertNotNull(dateTimeField32);
// flaky "74) test1417(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 71 + "'", int33 == 71);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(gregorianChronology38);
        org.junit.Assert.assertNotNull(weeks40);
        org.junit.Assert.assertNotNull(dateMidnight41);
        org.junit.Assert.assertNotNull(date42);
// flaky "13) test1417(RegressionTest2)":         org.junit.Assert.assertEquals(date42.toString(), "Wed Dec 31 19:00:00 EST 1969");
        org.junit.Assert.assertNotNull(yearMonthDay43);
        org.junit.Assert.assertNotNull(dateMidnight45);
        org.junit.Assert.assertNotNull(yearMonthDay47);
        org.junit.Assert.assertNotNull(julianChronology50);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1970 + "'", int57 == 1970);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(dateTimeZone62);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(cachedDateTimeZone64);
        org.junit.Assert.assertNotNull(chronology65);
        org.junit.Assert.assertNotNull(chronology66);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
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
        int int49 = skipDateTimeField14.get((long) 6);
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(gregorianChronology7);
        org.junit.Assert.assertNotNull(gregorianChronology10);
        org.junit.Assert.assertNotNull(dateTimeField12);
// flaky "75) test1418(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 71 + "'", int13 == 71);
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
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 71 + "'", int49 == 71);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 26);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        org.joda.time.Years years0 = org.joda.time.Years.MIN_VALUE;
        org.joda.time.Period period1 = years0.toPeriod();
        org.junit.Assert.assertNotNull(years0);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
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
        org.joda.time.DateTimeField dateTimeField14 = julianChronology5.weekyear();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology17 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone16);
        org.joda.time.Days days18 = org.joda.time.Days.THREE;
        int[] intArray21 = gregorianChronology17.get((org.joda.time.ReadablePeriod) days18, (long) 0, (-1L));
        org.joda.time.DurationField durationField22 = gregorianChronology17.halfdays();
        org.joda.time.Chronology chronology23 = gregorianChronology17.withUTC();
        org.joda.time.MonthDay monthDay24 = new org.joda.time.MonthDay((long) (byte) 1, (org.joda.time.Chronology) gregorianChronology17);
        org.joda.time.DateTimeField dateTimeField25 = gregorianChronology17.minuteOfDay();
        org.joda.time.field.SkipDateTimeField skipDateTimeField26 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) julianChronology5, dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(julianChronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 0, 0, (-3181), (-6), (-23), (-59), (-58), (-31) });
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(gregorianChronology17);
        org.junit.Assert.assertNotNull(days18);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 0 });
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeField25);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.printZeroNever();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder2 = periodFormatterBuilder0.appendMinutes();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = periodFormatterBuilder2.appendSuffix("0");
        org.joda.time.format.PeriodFormatter periodFormatter5 = org.joda.time.format.PeriodFormat.getDefault();
        org.joda.time.format.PeriodPrinter periodPrinter6 = periodFormatter5.getPrinter();
        org.joda.time.format.PeriodFormatter periodFormatter7 = org.joda.time.format.ISOPeriodFormat.alternateExtendedWithWeeks();
        org.joda.time.format.PeriodParser periodParser8 = periodFormatter7.getParser();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder9 = periodFormatterBuilder4.append(periodPrinter6, periodParser8);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder10 = periodFormatterBuilder9.printZeroRarelyFirst();
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder2);
        org.junit.Assert.assertNotNull(periodFormatterBuilder4);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertNotNull(periodPrinter6);
        org.junit.Assert.assertNotNull(periodFormatter7);
        org.junit.Assert.assertNotNull(periodParser8);
        org.junit.Assert.assertNotNull(periodFormatterBuilder9);
        org.junit.Assert.assertNotNull(periodFormatterBuilder10);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfMonth((int) (byte) 1);
        org.joda.time.TimeOfDay timeOfDay4 = dateTime3.toTimeOfDay();
        int int5 = dateTime3.getMinuteOfDay();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
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
        org.joda.time.MutableInterval mutableInterval69 = new org.joda.time.MutableInterval((long) (byte) 10, (long) 10);
        org.joda.time.Interval interval70 = mutableInterval69.toInterval();
        boolean boolean71 = interval24.isBefore((org.joda.time.ReadableInterval) mutableInterval69);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval73 = interval24.withStartMillis(159047038080000000L);
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
        org.junit.Assert.assertNotNull(interval70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
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
        org.joda.time.DurationFieldType durationFieldType45 = org.joda.time.DurationFieldType.seconds();
        java.lang.String str46 = durationFieldType45.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial48 = partial41.withFieldAddWrapped(durationFieldType45, 59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'seconds' is not supported");
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
        org.junit.Assert.assertNotNull(durationFieldType45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "seconds" + "'", str46, "seconds");
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.dayOfYear();
        org.joda.time.DateMidnight dateMidnight4 = property3.getDateMidnight();
        org.joda.time.DateMidnight dateMidnight5 = property3.roundCeilingCopy();
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateMidnight5);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.printZeroNever();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder2 = periodFormatterBuilder1.appendDays();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder5 = periodFormatterBuilder1.appendPrefix("26", "31");
        org.joda.time.format.PeriodFormatter periodFormatter6 = org.joda.time.format.ISOPeriodFormat.alternateExtended();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.format.PeriodFormatter periodFormatter8 = periodFormatter6.withParseType(periodType7);
        boolean boolean9 = periodFormatter8.isPrinter();
        org.joda.time.format.PeriodPrinter periodPrinter10 = periodFormatter8.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder11 = periodFormatterBuilder5.append(periodFormatter8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Prefix not followed by field");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder2);
        org.junit.Assert.assertNotNull(periodFormatterBuilder5);
        org.junit.Assert.assertNotNull(periodFormatter6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(periodPrinter10);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod();
        boolean boolean2 = mutablePeriod0.equals((java.lang.Object) (-1L));
        mutablePeriod0.addYears(100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology6 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone5);
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology6);
        org.joda.time.DateMidnight.Property property8 = dateMidnight7.dayOfYear();
        org.joda.time.DateMidnight dateMidnight9 = property8.roundHalfEvenCopy();
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.plusWeeks((int) (byte) 10);
        org.joda.time.Days days12 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType13 = days12.getFieldType();
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight11.withFieldAdded(durationFieldType13, 26);
        mutablePeriod0.add(durationFieldType13, 1);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime dateTime21 = dateTime19.withYear((-35));
        int int22 = dateTime19.getMinuteOfDay();
        org.joda.time.DateTime dateTime24 = dateTime19.withYearOfEra(7);
        org.joda.time.Duration duration25 = mutablePeriod0.toDurationTo((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.MutableDateTime mutableDateTime26 = org.joda.time.MutableDateTime.now();
        mutableDateTime26.setDayOfYear(8);
        int int29 = mutableDateTime26.getYearOfCentury();
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod();
        boolean boolean32 = mutablePeriod30.equals((java.lang.Object) (-1L));
        mutablePeriod30.addYears(100);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology36 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone35);
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology36);
        org.joda.time.DateMidnight.Property property38 = dateMidnight37.dayOfYear();
        org.joda.time.DateMidnight dateMidnight39 = property38.roundHalfEvenCopy();
        org.joda.time.DateMidnight dateMidnight41 = dateMidnight39.plusWeeks((int) (byte) 10);
        org.joda.time.Days days42 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType43 = days42.getFieldType();
        org.joda.time.DateMidnight dateMidnight45 = dateMidnight41.withFieldAdded(durationFieldType43, 26);
        mutablePeriod30.add(durationFieldType43, 1);
        mutableDateTime26.add(durationFieldType43, (-1));
        org.joda.time.Period period50 = duration25.toPeriodTo((org.joda.time.ReadableInstant) mutableDateTime26);
        long long51 = duration25.getStandardMinutes();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology6);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(mutableDateTime26);
// flaky "76) test1428(RegressionTest2)":         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 70 + "'", int29 == 70);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(gregorianChronology36);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(dateMidnight39);
        org.junit.Assert.assertNotNull(dateMidnight41);
        org.junit.Assert.assertNotNull(days42);
        org.junit.Assert.assertNotNull(durationFieldType43);
        org.junit.Assert.assertNotNull(dateMidnight45);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 52597440L + "'", long51 == 52597440L);
    }
}
