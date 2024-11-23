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

}