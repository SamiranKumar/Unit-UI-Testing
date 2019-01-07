package com.skh.shomu.android_testing.util;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.skh.shomu.android_testing.util.FirstNameExtractor.extractFirstName;
import static com.skh.shomu.android_testing.util.FirstNameExtractor.extractFirstNameWithTrim;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FirstNameExtractorTest {

    private static String FULL_NAME_DEMO = "Samiran Kumar";


    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void extractFirstName_EmptyString_ReturnEmptyString() {
        assertThat(extractFirstName(""), is(""));
    }


    @Test
    public void extractFirstName_DifferentString_ReturnEmptyString() {
      //  assertThat(extractFirstName("Samiran"), is(FULL_NAME_DEMO));
        assertThat(extractFirstName("Samiran Kumar"), is(FULL_NAME_DEMO));

    }


    @Test
    public void extractFirstName_WithSpaceDifferentString_ReturnEmptyString() {
      /*
        assertThat(extractFirstName("Samiran "), is(FULL_NAME_DEMO));
        assertThat(extractFirstName(" Samiran"), is(FULL_NAME_DEMO));
        assertThat(extractFirstName(" Samiran "), is(FULL_NAME_DEMO));
        assertThat(extractFirstName("Samiran  Kumar"), is(FULL_NAME_DEMO));
        assertThat(extractFirstName(" Samiran  Kumar"), is(FULL_NAME_DEMO));
        assertThat(extractFirstName(" Samiran  Kumar "), is(FULL_NAME_DEMO));
*/
    }


    @Test
    public void extractFirstName_FullNameString_ReturnEmptyString() {
        assertThat(extractFirstName("Samiran Kumar"), is(FULL_NAME_DEMO));
    }






    @Test
    public void extractFirstNameWithTrim_WithSpaceDifferentString_ReturnEmptyString() {
      //  assertThat(extractFirstNameWithTrim("Samiran "), is(FULL_NAME_DEMO));
      //  assertThat(extractFirstNameWithTrim(" Samiran"), is(FULL_NAME_DEMO));
     //   assertThat(extractFirstNameWithTrim(" Samiran "), is(FULL_NAME_DEMO));
        assertThat(extractFirstNameWithTrim("Samiran Kumar   "), is(FULL_NAME_DEMO));
        assertThat(extractFirstNameWithTrim("  Samiran Kumar   "), is(FULL_NAME_DEMO));
       // assertThat(extractFirstNameWithTrim(" Samiran  Kumar"), is(FULL_NAME_DEMO));
      //  assertThat(extractFirstNameWithTrim(" Samiran  Kumar "), is(FULL_NAME_DEMO));

    }


}