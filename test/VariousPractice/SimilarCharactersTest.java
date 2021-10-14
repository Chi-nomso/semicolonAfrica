package VariousPractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimilarCharactersTest {

    @Test
    public void elementsAreOfSimilarCharactersTest(){

        String letters = "aadrin";
        assertFalse(SimilarCharacters.SameCharacter.checkIfCharactersAreSimilar(letters));
    }


}