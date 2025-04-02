import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
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
        org.joda.time.DurationField durationField22 = chronology19.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime21", (dateTime1.compareTo(dateTime21) == 0) == dateTime1.equals(dateTime21));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
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
        org.joda.time.DateTimeField dateTimeField22 = chronology19.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime21", (dateTime1.compareTo(dateTime21) == 0) == dateTime1.equals(dateTime21));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
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
        int int22 = dateTime5.getHourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime21", (dateTime5.compareTo(dateTime21) == 0) == dateTime5.equals(dateTime21));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
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
        org.joda.time.DateTime dateTime22 = dateTime21.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime21", (dateTime1.compareTo(dateTime21) == 0) == dateTime1.equals(dateTime21));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
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
        org.joda.time.DateTimeField dateTimeField22 = chronology19.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime21", (dateTime1.compareTo(dateTime21) == 0) == dateTime1.equals(dateTime21));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
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
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.MutableDateTime mutableDateTime23 = org.joda.time.MutableDateTime.now(dateTimeZone22);
        org.joda.time.Chronology chronology24 = gJChronology20.withZone(dateTimeZone22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and mutableDateTime23", (dateTime19.compareTo(mutableDateTime23) == 0) == dateTime19.equals(mutableDateTime23));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
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
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.chrono.JulianChronology julianChronology36 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone35);
        org.joda.time.Chronology chronology37 = julianChronology36.withUTC();
        org.joda.time.DurationField durationField38 = julianChronology36.weekyears();
        mutablePeriod0.add((long) 'a', (org.joda.time.Chronology) julianChronology36);
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime dateTime43 = dateTime41.withYear((-35));
        org.joda.time.DateTime dateTime45 = dateTime41.plusMillis(1970);
        org.joda.time.DateTime dateTime47 = dateTime41.withMillisOfDay(330958);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.DateTime dateTime50 = dateTime41.toDateTime(dateTimeZone49);
        org.joda.time.Chronology chronology51 = julianChronology36.withZone(dateTimeZone49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and dateTime50", (dateTime21.compareTo(dateTime50) == 0) == dateTime21.equals(dateTime50));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
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
        org.joda.time.MutableDateTime mutableDateTime22 = org.joda.time.MutableDateTime.now();
        mutableDateTime22.addMonths((int) (short) 100);
        mutableDateTime22.setYear(26);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property33 = dateTime31.property(dateTimeFieldType32);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.chrono.JulianChronology julianChronology35 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone34);
        org.joda.time.Chronology chronology36 = julianChronology35.withUTC();
        org.joda.time.DateTimeField dateTimeField37 = dateTimeFieldType32.getField((org.joda.time.Chronology) julianChronology35);
        org.joda.time.MutableInterval mutableInterval38 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology35);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.chrono.JulianChronology julianChronology40 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone39);
        org.joda.time.Chronology chronology41 = julianChronology40.withUTC();
        mutableInterval38.setChronology((org.joda.time.Chronology) julianChronology40);
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight((long) 4, (org.joda.time.Chronology) julianChronology40);
        org.joda.time.DateMidnight dateMidnight45 = dateMidnight43.plusYears(100);
        mutableDateTime22.setDate((org.joda.time.ReadableInstant) dateMidnight45);
        org.joda.time.DateMidnight dateMidnight48 = dateMidnight45.plusYears(59);
        org.joda.time.Period period49 = duration16.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight2 and dateMidnight43", (dateMidnight2.compareTo(dateMidnight43) == 0) == dateMidnight2.equals(dateMidnight43));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.joda.time.Days days0 = org.joda.time.Days.THREE;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property3.getFieldType();
        boolean boolean5 = days0.equals((java.lang.Object) property3);
        org.joda.time.DateTime dateTime6 = property3.getDateTime();
        org.joda.time.DurationField durationField7 = property3.getDurationField();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology9 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone8);
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology9);
        org.joda.time.DateMidnight.Property property11 = dateMidnight10.dayOfYear();
        org.joda.time.DateMidnight dateMidnight12 = property11.roundHalfEvenCopy();
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight12.plusWeeks((int) (byte) 10);
        org.joda.time.Days days15 = org.joda.time.Days.THREE;
        org.joda.time.DurationFieldType durationFieldType16 = days15.getFieldType();
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight14.withFieldAdded(durationFieldType16, 26);
        org.joda.time.DateMidnight.Property property19 = dateMidnight18.dayOfWeek();
        int int20 = property3.getDifference((org.joda.time.ReadableInstant) dateMidnight18);
        org.joda.time.DateTime dateTime21 = property3.roundHalfFloorCopy();
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
        int int42 = offsetDateTimeField40.getLeapAmount((long) (short) 0);
        org.joda.time.DateTimeField dateTimeField43 = org.joda.time.field.StrictDateTimeField.getInstance((org.joda.time.DateTimeField) offsetDateTimeField40);
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property48 = dateTime46.property(dateTimeFieldType47);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.chrono.JulianChronology julianChronology50 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone49);
        org.joda.time.Chronology chronology51 = julianChronology50.withUTC();
        org.joda.time.DateTimeField dateTimeField52 = dateTimeFieldType47.getField((org.joda.time.Chronology) julianChronology50);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.Chronology chronology54 = julianChronology50.withZone(dateTimeZone53);
        org.joda.time.LocalTime localTime55 = new org.joda.time.LocalTime((long) '#', chronology54);
        org.joda.time.LocalTime localTime57 = localTime55.plusSeconds((int) 'a');
        int[] intArray61 = new int[] { 26, '#', 31 };
        int int62 = offsetDateTimeField40.getMinimumValue((org.joda.time.ReadablePartial) localTime57, intArray61);
        org.joda.time.LocalTime.Property property63 = localTime57.minuteOfHour();
        org.joda.time.LocalTime localTime64 = property63.roundCeilingCopy();
        org.joda.time.LocalTime localTime66 = localTime64.plusSeconds(32);
        org.joda.time.DateTime dateTime67 = dateTime21.withTime(localTime66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight10 and dateTime21", (dateMidnight10.compareTo(dateTime21) == 0) == dateMidnight10.equals(dateTime21));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
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
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.chrono.JulianChronology julianChronology24 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone23);
        org.joda.time.Chronology chronology25 = julianChronology24.withUTC();
        java.util.Locale locale26 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, (org.joda.time.Chronology) julianChronology24, locale26);
        org.joda.time.YearMonthDay yearMonthDay28 = yearMonthDay19.withChronologyRetainFields((org.joda.time.Chronology) julianChronology24);
        org.joda.time.YearMonthDay yearMonthDay30 = yearMonthDay19.withYear(70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on yearMonthDay19 and yearMonthDay28", (yearMonthDay19.compareTo(yearMonthDay28) == 0) == yearMonthDay19.equals(yearMonthDay28));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime dateTime3 = dateTime1.withYear((-35));
        org.joda.time.DateTime dateTime5 = dateTime1.plusMillis(1970);
        org.joda.time.DateTime dateTime7 = dateTime1.withMillisOfDay(330958);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.DateTime dateTime10 = dateTime1.toDateTime(dateTimeZone9);
        long long12 = dateTimeZone9.nextTransition(259200000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime10", (dateTime1.compareTo(dateTime10) == 0) == dateTime1.equals(dateTime10));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
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
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod();
        boolean boolean15 = mutablePeriod13.equals((java.lang.Object) (-1L));
        mutablePeriod13.setPeriod(86400000, 13, (int) (byte) -1, (int) ' ', 26, (-35), (int) (short) -1, (int) (short) 100);
        org.joda.time.YearMonthDay yearMonthDay25 = yearMonthDay12.minus((org.joda.time.ReadablePeriod) mutablePeriod13);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.chrono.JulianChronology julianChronology28 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone27);
        org.joda.time.Chronology chronology29 = julianChronology28.withUTC();
        java.util.Locale locale30 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, (org.joda.time.Chronology) julianChronology28, locale30);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property34 = dateTime33.dayOfWeek();
        int int35 = dateTime33.getWeekyear();
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.DateTime dateTime37 = dateTime33.plus(readableDuration36);
        org.joda.time.DateTime.Property property38 = dateTime37.era();
        boolean boolean39 = dateTimeParserBucket31.restoreState((java.lang.Object) property38);
        org.joda.time.DateTimeZone dateTimeZone40 = dateTimeParserBucket31.getZone();
        org.joda.time.DateTimeZone dateTimeZone41 = dateTimeParserBucket31.getZone();
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight(dateTimeZone41);
        org.joda.time.Interval interval43 = yearMonthDay12.toInterval(dateTimeZone41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight2 and dateMidnight42", (dateMidnight2.compareTo(dateMidnight42) == 0) == dateMidnight2.equals(dateMidnight42));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property2 = dateTime1.dayOfWeek();
        int int3 = dateTime1.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone4);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight((org.joda.time.Chronology) gregorianChronology5);
        org.joda.time.DateMidnight.Property property7 = dateMidnight6.dayOfYear();
        org.joda.time.Period period8 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime1, (org.joda.time.ReadableInstant) dateMidnight6);
        org.joda.time.MutableDateTime mutableDateTime9 = dateMidnight6.toMutableDateTime();
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.Instant instant11 = gJChronology10.getGregorianCutover();
        org.joda.time.DurationField durationField12 = gJChronology10.seconds();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology14 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone13);
        org.joda.time.Days days15 = org.joda.time.Days.THREE;
        int[] intArray18 = gregorianChronology14.get((org.joda.time.ReadablePeriod) days15, (long) 0, (-1L));
        org.joda.time.DateTimeField dateTimeField19 = gregorianChronology14.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = gregorianChronology14.monthOfYear();
        int int21 = gregorianChronology14.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeZone dateTimeZone22 = gregorianChronology14.getZone();
        org.joda.time.Chronology chronology23 = gJChronology10.withZone(dateTimeZone22);
        mutableDateTime9.setChronology(chronology23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight6 and mutableDateTime9", (dateMidnight6.compareTo(mutableDateTime9) == 0) == dateMidnight6.equals(mutableDateTime9));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
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
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.chrono.JulianChronology julianChronology24 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone23);
        org.joda.time.Chronology chronology25 = julianChronology24.withUTC();
        java.util.Locale locale26 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, (org.joda.time.Chronology) julianChronology24, locale26);
        org.joda.time.YearMonthDay yearMonthDay28 = yearMonthDay19.withChronologyRetainFields((org.joda.time.Chronology) julianChronology24);
        org.joda.time.MutableDateTime mutableDateTime29 = org.joda.time.MutableDateTime.now();
        mutableDateTime29.setDayOfYear(8);
        mutableDateTime29.setDayOfYear(31);
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime29.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime36 = property34.add((long) (-19));
        org.joda.time.MutableDateTime mutableDateTime38 = property34.add((-19));
        org.joda.time.Duration duration40 = org.joda.time.Duration.standardDays((long) 8);
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property46 = dateTime44.property(dateTimeFieldType45);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.chrono.JulianChronology julianChronology48 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone47);
        org.joda.time.Chronology chronology49 = julianChronology48.withUTC();
        org.joda.time.DateTimeField dateTimeField50 = dateTimeFieldType45.getField((org.joda.time.Chronology) julianChronology48);
        org.joda.time.MutableInterval mutableInterval51 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology48);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.chrono.JulianChronology julianChronology53 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone52);
        org.joda.time.Chronology chronology54 = julianChronology53.withUTC();
        mutableInterval51.setChronology((org.joda.time.Chronology) julianChronology53);
        mutableInterval51.setEndMillis((long) 'a');
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property60 = dateTime59.dayOfWeek();
        int int61 = dateTime59.getWeekyear();
        org.joda.time.ReadableDuration readableDuration62 = null;
        org.joda.time.DateTime dateTime63 = dateTime59.plus(readableDuration62);
        boolean boolean64 = mutableInterval51.contains((org.joda.time.ReadableInstant) dateTime63);
        org.joda.time.Days days65 = org.joda.time.Days.THREE;
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTime.Property property68 = dateTime67.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = property68.getFieldType();
        boolean boolean70 = days65.equals((java.lang.Object) property68);
        org.joda.time.DateTime dateTime71 = property68.getDateTime();
        org.joda.time.DateTime dateTime72 = dateTime71.withEarlierOffsetAtOverlap();
        mutableInterval51.setStart((org.joda.time.ReadableInstant) dateTime72);
        org.joda.time.DateTime.Property property74 = dateTime72.dayOfYear();
        org.joda.time.Period period75 = duration40.toPeriodFrom((org.joda.time.ReadableInstant) dateTime72);
        org.joda.time.DateTime.Property property76 = dateTime72.hourOfDay();
        org.joda.time.DateTime dateTime81 = new org.joda.time.DateTime((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType82 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property83 = dateTime81.property(dateTimeFieldType82);
        org.joda.time.DateTimeZone dateTimeZone84 = null;
        org.joda.time.chrono.JulianChronology julianChronology85 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone84);
        org.joda.time.Chronology chronology86 = julianChronology85.withUTC();
        org.joda.time.DateTimeField dateTimeField87 = dateTimeFieldType82.getField((org.joda.time.Chronology) julianChronology85);
        org.joda.time.MutableInterval mutableInterval88 = new org.joda.time.MutableInterval((long) 7, (long) 31, (org.joda.time.Chronology) julianChronology85);
        org.joda.time.LocalDateTime localDateTime89 = new org.joda.time.LocalDateTime((long) (short) -1, (org.joda.time.Chronology) julianChronology85);
        org.joda.time.DateTimeZone dateTimeZone90 = julianChronology85.getZone();
        org.joda.time.DateTime dateTime91 = dateTime72.withZone(dateTimeZone90);
        mutableDateTime38.setZoneRetainFields(dateTimeZone90);
        org.joda.time.Chronology chronology93 = julianChronology24.withZone(dateTimeZone90);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on yearMonthDay19 and yearMonthDay28", (yearMonthDay19.compareTo(yearMonthDay28) == 0) == yearMonthDay19.equals(yearMonthDay28));
    }
}

