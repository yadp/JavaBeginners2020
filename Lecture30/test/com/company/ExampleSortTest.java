package com.company;

import org.junit.jupiter.api.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ExampleSortTest {

    ExampleSort exampleSort;

    @BeforeAll
    static void startup(){
        System.out.println("Before All Tests");
    }

    @AfterAll //AfterClass
    static void shutdown(){
        System.out.println("After all tests");
    }

    @BeforeEach //Before
    void setUp() {
        System.out.println("Before Each");
        exampleSort = new ExampleSort(new ArrayList<>());
    }

    @AfterEach //After
    void tearDown() {
        System.out.println("After Each");
    }

    @Test
    @DisplayName(value = "This is a positive test")
    void addPositiveInt() {
        exampleSort.addInt(1);
        exampleSort.addInt(2);
        assertEquals(1,exampleSort.getIntegerList().get(0));
        assertNotEquals(2,exampleSort.getIntegerList().get(0));
        assertTrue(exampleSort.booleanMethod());

    }

    @Test
    @DisplayName(value = "This is a positive test")
    void removeOnPosition(){
        exampleSort.addInt(1);
        exampleSort.addInt(2);

        exampleSort.removePosition(0);

        assertEquals(2, exampleSort.getIntegerList().get(0));
        assertEquals(1,exampleSort.getIntegerList().size());
    }

    @Test
    void addNegativeInt(){

        assertThrows(IllegalArgumentException.class,() -> {
            exampleSort.addInt(-1);
            exampleSort.addInt(-2);

        });
        exampleSort.addInt((int)1L);
        assertEquals(3,exampleSort.sortList().size());
        assertEquals(-1,exampleSort.getIntegerList().get(0));

    }

    @Test
    void sortList() {
    }

    @Test
    @Disabled
    void testToString() {
        exampleSort.addInt(1);
        exampleSort.addInt(2);
        exampleSort.addInt(3);
        assertEquals("ExampleSort{integerList=[1, 2, 3]}",exampleSort.toString());
    }
}