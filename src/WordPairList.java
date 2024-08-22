import java.util.ArrayList;

public class WordPairList {
  private ArrayList<WordPair> allPairs;

  public WordPairList(String[] words) {
    allPairs = new ArrayList<>(); // initialize

    // Loop through WordPairs with two 'points', systematically
    // moving through the array with the second pointer being always
    // at the right of the first pointer.
    for (int i = 0; i < words.length - 1; i++) {
      for (int j = i + 1; j < words.length; j++) {
        allPairs.add(new WordPair(words[i], words[j]));
      }
    }
  }

  public ArrayList<WordPair> getAllPairs() {
    return allPairs;
  }

  // Counts the number of duplicates
  // e.g., if there are three of the same elements, there are two duplicates/matches
  public int numMatches() {
    int matches = 0;

    // Keep looping through until the list is empty
    while (!allPairs.isEmpty()) {
      // Remove the first element
      WordPair slot = allPairs.removeFirst();

      // If allPairs still contains a WordPair identical to slot
      // (see equals() override in WordPair), then remove that duplicate and increment matches.
      if (allPairs.contains(slot)) {
        while (allPairs.contains(slot)) {
          allPairs.remove(slot);
          matches++;
        }
      }
    }

    return matches;
  }
}
