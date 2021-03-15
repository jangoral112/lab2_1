package edu.iis.mto.bsearch;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BinarySearchTest {

    @BeforeEach
    void setUp() throws Exception {}

    @Test
    void test() {
        fail("Not yet implemented");
    }

    @Test
    void shouldFindElementInSingleElementArray() {
        // given
        int key = 12;
        int[] sequence = {12};

        boolean expectedFindStatus = true;
        int expectedPosition = 0;

        // when
        SearchResult searchResult = BinarySearch.search(key, sequence);

        // then
        assertEquals(expectedFindStatus, searchResult.isFound());
        assertEquals(expectedPosition, searchResult.getPosition());
        assertEquals(key, sequence[searchResult.getPosition()]);
    }

}
