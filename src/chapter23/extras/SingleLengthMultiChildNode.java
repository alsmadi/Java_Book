package chapter23.extras;

import chapter23.lightweight_trie-master.lightweight_trie-master.src.java.com.rapleaf.lightweight_trie.*;

public class SingleLengthMultiChildNode<V> extends AbstractMultiChildNode<V> {
  private final char prefix;

  protected SingleLengthMultiChildNode(char prefix, V value, AbstractNode<V>[] children) {
    super(value, children);
    this.prefix = prefix;
  }

  @Override
  public char[] getPrefix() {
    return new char[]{prefix};
  }

  @Override
  public char getPrefixFirst() {
    return prefix;
  }
}
