package md.orange.academy.example.solid.dao;

public interface GenericDao<T, R> {

  void save(T player);

  T getPlayer(R input);

  void performAction(R input);
}
