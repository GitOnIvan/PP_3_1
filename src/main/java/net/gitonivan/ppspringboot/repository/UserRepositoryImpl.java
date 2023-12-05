package net.gitonivan.ppspringboot.repository;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import net.gitonivan.ppspringboot.model.User;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<User> getUsersList() {

        return entityManager.createQuery("select u from User u ", User.class).getResultList();
    }

    @Override
    public User getUserByID(long id) {
        TypedQuery<User> query = entityManager.createQuery("select u from User u where u.id =:id", User.class);
        query.setParameter("id", id);

        return query.getSingleResult();
    }


    @Override
    public void addNewUser(User user) {
        entityManager.persist(user);

    }


    @Override
    public void updateUser(long id, User updatedUser) {
        User userToBeUpdate = getUserByID(id);

        userToBeUpdate.setName(updatedUser.getName());
        userToBeUpdate.setAge(updatedUser.getAge());
        userToBeUpdate.setLastname(updatedUser.getLastname());
        userToBeUpdate.setSex(updatedUser.getSex());


    }

    @Override
    public void deleteUser(long id) {
        User entityToDelete = getUserByID(id);
        entityManager.remove(entityToDelete);


    }
}
