package datastructure.tree;

public interface IMyTreeMap<K, V> {

    IMyTreeMap<K, V> put(K key, V value);

    V get(K key);

    boolean containsKey(K key);

    boolean empty();

    int size();

    IMyTreeMap<K, V> removeAll();
}