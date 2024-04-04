package com.example.demo;

import org.junit.jupiter.api.*;

public class JUnitCycleTest {
    // Before All, 1회 실행되기 때문에 static 형태
    @BeforeAll
    static void beforeAll() {
        System.out.println("@BeforeAll");
    }
    // Before Each
    @BeforeEach
    public void beforeEach() {
        System.out.println("@beforeEach");
    }

    @Test
    public void test1() {
        System.out.println("test1");
    }

    @Test
    public void test2() {
        System.out.println("test2");
    }

    @Test
    public void test3() {
        System.out.println("test3");
    }

    // After All
    @AfterAll
    static void afterAll(){
        System.out.println("@AfterAll");
    }
    // After Each
    @AfterEach
    public void afterEach() {
        System.out.println("@afterEach");
    }
}
