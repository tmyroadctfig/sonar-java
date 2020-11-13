package org.sonar.java.checks.helpers;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class MapBuilder<K, V> {

  public static <K, V> MapBuilder<K,V> newMap() {
    return new MapBuilder<>();
  }

  private final Map<K, V> map;

  private MapBuilder() {
    this.map = new HashMap<>();
  }

  public MapBuilder<K, V> add(K key, V value) {
    map.put(key, value);
    return this;
  }

  public Map<K, V> build() {
    return Collections.unmodifiableMap(map);
  }
}
