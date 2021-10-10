package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TruckDriversTest {


    private TruckDriversTest driver1;
    private TruckDriversTest driver2;
    private TruckDriversTest driver3;

    @BeforeEach
    void setUp() {

        driver1 = new TruckDriversTest();
        driver2 = new TruckDriversTest();
        driver3 = driver1;



    }
    //Object Equality
    @Test

    public void testObjectEquality() //shallow Comparison (==)
    {
        assertSame(driver1, driver3);

    }

    @Test

    public void testObjectEquality2()
    {
        assertSame(driver1, driver2);

    }

    //Object Identity
    @Test

    public void testObjectIdentity() //Deep comparison(.equals)
    {
        assertEquals(driver1,driver3);
    }
}