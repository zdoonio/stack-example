package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class GroupsTest {

    @Test
    public void myTests() {
        assertTrue(Groups.groupCheck("()"));
        assertFalse(Groups.groupCheck("({"));
        assertFalse(Groups.groupCheck("(()"));
        assertFalse(Groups.groupCheck("({)}"));
        assertFalse(Groups.groupCheck("((()])"));
        assertTrue(Groups.groupCheck(""));
    }
}
