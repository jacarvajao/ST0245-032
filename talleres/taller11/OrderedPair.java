public class OrderedPair<K, V, C> implements Pair<K, V, C> {

  private K key;
  private V value;
  private C visit;

  public OrderedPair(K key, V value, C visit) {
    this.key = key;
    this.value = value;
    this.visit = visit;
  }

  public K getKey() { return key; }
  public V getValue() { return value; }
  public C getVisit() {return visit;}
}