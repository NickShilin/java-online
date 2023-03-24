package ru.itsjava.collections.lists;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Класс Person должен: ")
public class PersonTest {

    public static final String DEFAULT_NAME = "Nick";
    public static final int DEFAULT_AGE = 26;
    public static final String NEW_NAME = "Julia";
    public static final int NEW_AGE = 16;
    public static final double ADULT = 18;


    @DisplayName(" корректно создаваться конструктором")
    @Test
    public void shouldHaveCorrectConstructor() {
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);

//        assertEquals(DEFAULT_NAME, actualPerson.getName());
//        assertEquals(DEFAULT_AGE, actualPerson.getAge());

        assertAll("actualPerson", () -> assertEquals(DEFAULT_NAME, actualPerson.getName()),
                () -> assertEquals(DEFAULT_AGE, actualPerson.getAge()));
    }

    @DisplayName(" корректно изменять возраст")
    @Test
    public void shouldHaveCorrectChangeAgePerson() {
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);
        actualPerson.birthday();

        assertEquals(DEFAULT_AGE + 1, actualPerson.getAge());
    }
    @DisplayName(" проверять соответствие возраста")
    @Test
    public void shouldCheckAgeForAlcohol(){
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);
        Person newPerson = new Person(NEW_NAME, NEW_AGE);
        assertFalse(newPerson.takeBeer());
        assertTrue(actualPerson.takeBeer());
        assertFalse(ADULT <= newPerson.getAge());
    }
}
