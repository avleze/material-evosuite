/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 13 23:39:47 GMT 2020
 */

package es.uca.muiisc.psi;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import es.uca.muiisc.psi.Guest;
import es.uca.muiisc.psi.Hostel;
import java.time.Clock;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZoneOffset;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.time.MockClock;
import org.evosuite.runtime.mock.java.time.MockLocalDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Hostel_ESTest extends Hostel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Hostel hostel0 = new Hostel();
      LocalDate localDate0 = MockLocalDate.ofEpochDay(0);
      Guest guest0 = new Guest((String) null, (String) null, "~(<Z&4j(Nq^^OXvO!f9", localDate0, "");
      hostel0.makeReservation(0, localDate0, localDate0, guest0);
      LocalDate localDate1 = MockLocalDate.ofEpochDay(317L);
      hostel0.makeReservation(0, localDate0, localDate1, guest0);
      assertEquals("", guest0.getPhoneNumber());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Hostel hostel0 = new Hostel();
      LocalDate localDate0 = MockLocalDate.ofEpochDay(0);
      Guest guest0 = new Guest((String) null, (String) null, "~(<Z&4j(Nq^^OXvO!f9", localDate0, "");
      hostel0.makeReservation(0, localDate0, localDate0, guest0);
      ZoneOffset zoneOffset0 = ZoneOffset.UTC;
      LocalDate localDate1 = MockLocalDate.now((ZoneId) zoneOffset0);
      hostel0.makeReservation(0, localDate1, localDate0, guest0);
      assertFalse(localDate1.equals((Object)localDate0));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Hostel hostel0 = new Hostel();
      Guest guest0 = new Guest("(_SK='}17F", "", "", (LocalDate) null, "");
      hostel0.makeReservation(0, (LocalDate) null, (LocalDate) null, guest0);
      // Undeclared exception!
      try { 
        hostel0.makeReservation(0, (LocalDate) null, (LocalDate) null, guest0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("es.uca.muiisc.psi.Hostel", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Hostel hostel0 = new Hostel();
      Clock clock0 = MockClock.systemUTC();
      LocalDate localDate0 = MockLocalDate.now(clock0);
      Guest guest0 = new Guest("-fHh[iE", "-fHh[iE", "es.uca.muiisc.psi.Guest", localDate0, "");
      // Undeclared exception!
      try { 
        hostel0.makeReservation((-1), localDate0, localDate0, guest0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("es.uca.muiisc.psi.Hostel", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Hostel hostel0 = new Hostel();
      LocalDate localDate0 = MockLocalDate.ofEpochDay(317L);
      ZoneOffset zoneOffset0 = ZoneOffset.UTC;
      LocalDate localDate1 = MockLocalDate.now((ZoneId) zoneOffset0);
      Guest guest0 = new Guest("es.uca.muiisc.psi.Room", "'Z?oKKBCl`9", "'Z?oKKBCl`9", localDate1, "'Z?oKKBCl`9");
      System.setCurrentTimeMillis(0);
      LocalDate localDate2 = MockLocalDate.now((ZoneId) zoneOffset0);
      hostel0.makeReservation(0, localDate2, localDate1, guest0);
      hostel0.makeReservation(0, localDate0, localDate0, guest0);
      assertFalse(localDate0.equals((Object)localDate1));
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Hostel hostel0 = new Hostel();
      LocalDate localDate0 = MockLocalDate.ofEpochDay(0);
      Guest guest0 = new Guest((String) null, (String) null, "~(<Z&4j(Nq^^OXvO!f9", localDate0, "");
      hostel0.makeReservation(0, localDate0, localDate0, guest0);
      LocalDate localDate1 = MockLocalDate.ofEpochDay(317L);
      ZoneOffset zoneOffset0 = ZoneOffset.UTC;
      LocalDate localDate2 = MockLocalDate.now((ZoneId) zoneOffset0);
      hostel0.makeReservation(0, localDate1, localDate2, guest0);
      assertNull(guest0.getFirstName());
  }
}
