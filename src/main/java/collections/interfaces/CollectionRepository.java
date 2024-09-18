package collections.interfaces;

import repositories.Repository;

 public abstract class ICollection<T>  implements Repository<T> {
     void add(T item);


}
