import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WordPairListTest {
  private WordPair wp;

  @BeforeEach
  void setUp() {
  }

  @AfterEach
  void tearDown() {
  }

  @Test
  void constructorOne() {
    String[] words = {"one", "two", "three"};
    WordPairList wp = new WordPairList(words);

    assertEquals(3, wp.getAllPairs().size());
    assertEquals("one", wp.getAllPairs().get(0).getFirst());
    assertEquals("two", wp.getAllPairs().get(0).getSecond());
    assertEquals("one", wp.getAllPairs().get(1).getFirst());
    assertEquals("three", wp.getAllPairs().get(1).getSecond());
    assertEquals("two", wp.getAllPairs().get(2).getFirst());
    assertEquals("three", wp.getAllPairs().get(2).getSecond());
  }

  @Test
  void constructorTwo() {
    String[] words = {"the", "more", "the", "merrier"};
    WordPairList wp = new WordPairList(words);

    assertEquals(6, wp.getAllPairs().size());
    assertEquals("the", wp.getAllPairs().get(0).getFirst());
    assertEquals("more", wp.getAllPairs().get(0).getSecond());
    assertEquals("the", wp.getAllPairs().get(1).getFirst());
    assertEquals("the", wp.getAllPairs().get(1).getSecond());
    assertEquals("the", wp.getAllPairs().get(2).getFirst());
    assertEquals("merrier", wp.getAllPairs().get(2).getSecond());
    assertEquals("more", wp.getAllPairs().get(3).getFirst());
    assertEquals("the", wp.getAllPairs().get(3).getSecond());
    assertEquals("more", wp.getAllPairs().get(4).getFirst());
    assertEquals("merrier", wp.getAllPairs().get(4).getSecond());
    assertEquals("the", wp.getAllPairs().get(5).getFirst());
    assertEquals("merrier", wp.getAllPairs().get(5).getSecond());
  }

  @Test
  void constructorThree() {
    String[] moreWords = {"the", "red", "fox", "the", "red"};
    WordPairList wp = new WordPairList(moreWords);

    assertEquals(10, wp.getAllPairs().size());
    assertEquals("the", wp.getAllPairs().get(0).getFirst());
    assertEquals("red", wp.getAllPairs().get(0).getSecond());
    assertEquals("the", wp.getAllPairs().get(1).getFirst());
    assertEquals("fox", wp.getAllPairs().get(1).getSecond());
    assertEquals("the", wp.getAllPairs().get(2).getFirst());
    assertEquals("the", wp.getAllPairs().get(2).getSecond());
    assertEquals("the", wp.getAllPairs().get(3).getFirst());
    assertEquals("red", wp.getAllPairs().get(3).getSecond());
    assertEquals("red", wp.getAllPairs().get(4).getFirst());
    assertEquals("fox", wp.getAllPairs().get(4).getSecond());
    assertEquals("red", wp.getAllPairs().get(5).getFirst());
    assertEquals("the", wp.getAllPairs().get(5).getSecond());

    assertEquals("red", wp.getAllPairs().get(6).getFirst());
    assertEquals("red", wp.getAllPairs().get(6).getSecond());
    assertEquals("fox", wp.getAllPairs().get(7).getFirst());
    assertEquals("the", wp.getAllPairs().get(7).getSecond());
    assertEquals("fox", wp.getAllPairs().get(8).getFirst());
    assertEquals("red", wp.getAllPairs().get(8).getSecond());
    assertEquals("the", wp.getAllPairs().get(9).getFirst());
    assertEquals("red", wp.getAllPairs().get(9).getSecond());
  }

  @Test
  void numMatchesOne() {
    String[] words = {"one", "two", "three"};
    WordPairList wp = new WordPairList(words);

    assertEquals(0, wp.numMatches());
  }

  @Test
  void numMatchesTwo() {
    String[] words = {"the", "more", "the", "merrier"};
    WordPairList wp = new WordPairList(words);

    assertEquals(1, wp.numMatches());
  }

  @Test
  void numMatchesThree() {
    String[] moreWords = {"the", "red", "fox", "the", "red"};
    WordPairList wp = new WordPairList(moreWords);

    assertEquals(2, wp.numMatches());
  }
}