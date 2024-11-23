package jlin2.examples.localtesting

import org.junit.Assert.*
import org.junit.Test

class EmailValidatorTest {
    @Test
    fun toTestValidEmailWithFormat(){
        assertTrue(EmailValidator.isValidEmail("123@abc.com"))
    }
    @Test
    fun toTestValidEmailWithSubdomain(){
        assertTrue(EmailValidator.isValidEmail("123@abc.co.ca"))
    }
    @Test
    fun toTestValidEmailWithIncorrectDomain(){
        assertFalse(EmailValidator.isValidEmail("123@abc"))
    }
    @Test
    fun toTestValidEmailWithDoubleDots(){
        assertFalse(EmailValidator.isValidEmail("123@abc..com"))
    }

    @Test
    fun toTestValidEmailWithoutUsername(){
        assertFalse(EmailValidator.isValidEmail("@abc.com"))
    }
    @Test
    fun toTestValidEmailWithoutDomain(){
        assertFalse(EmailValidator.isValidEmail("testing123"))
    }

    @Test
    fun toTestValidEmailWithEmptyString(){
        assertFalse(EmailValidator.isValidEmail(""))
    }
    @Test
    fun toTestValidEmailWithNullValues(){
        assertFalse(EmailValidator.isValidEmail(null))
    }
}