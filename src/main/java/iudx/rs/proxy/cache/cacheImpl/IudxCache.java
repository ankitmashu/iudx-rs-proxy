package iudx.rs.proxy.cache.cacheImpl;

public interface IudxCache {

  public void put(String key, String value);

  public String get(String key);

  public void refreshCache();
}
