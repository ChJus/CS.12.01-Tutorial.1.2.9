// Java 16+ supports records, which condenses
// record (getters, setters) into a single line.
// Todo to self: get up to date with Java 14+ new features.
public class WordPair {
  private String first;
  private String second;

  public WordPair(String first, String second) {
    this.first = first;
    this.second = second;
  }

  public String getFirst() {
    return first;
  }

  public String getSecond() {
    return second;
  }

  // Override Object class' equals() method.
  // Originally, would compare objects by their reference address,
  // rewritten to make WordPairs equivalent if their contents are the same.
  // Note this method is used implicitly by ArrayList.contains() to find if there exists an element.
  @Override
  public boolean equals(Object obj) {
    if (obj instanceof WordPair) // Check to see object being compared to is a WordPair
      return this.first.equals(((WordPair) obj).getFirst()) &&
          this.second.equals(((WordPair) obj).getSecond());
    else return false;
  }
}