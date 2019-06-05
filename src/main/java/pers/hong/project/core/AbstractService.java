package pers.hong.project.core;

import org.apache.ibatis.exceptions.TooManyResultsException;
import org.springframework.beans.factory.annotation.Autowired;
import pers.hong.project.common.ServiceException;
import tk.mybatis.mapper.entity.Condition;

import javax.sql.DataSource;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * @Description: 通用Service的抽象类实现
 * @Auther: zwh
 * @Date: 2018/10/18
 */
public abstract class AbstractService<T> implements Service<T> {
    @Autowired
    protected Mapper<T> mapper;

    private Class<T> clazz;


    public AbstractService() {
        ParameterizedType parameterizedType = (ParameterizedType) this.getClass().getGenericSuperclass();
        clazz = (Class<T>) parameterizedType.getActualTypeArguments()[0];
    }

    @Override
    public T findById(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public T findBy(String fieldName, Object value,String fieldName1, Object value1) throws TooManyResultsException {
        try {
            T model = clazz.newInstance();
            Field field = clazz.getDeclaredField(fieldName);
            Field field1 = clazz.getDeclaredField(fieldName1);
            field.setAccessible(true);
            field1.setAccessible(true);
            field.set(model, value);
            field1.set(model, value1);
            return mapper.selectOne(model);
        } catch (ReflectiveOperationException e) {
            throw new ServiceException(e.getMessage(), e);
        }
    }

    @Override
    public List<T> findByCondition(Condition condition) {
        return mapper.selectByCondition(condition);
    }

    @Override
    public List<T> findAll() {
        return mapper.selectAll();
    }

    @Override
    public void save(T model) {
        mapper.insert(model);
    }

    @Override
    public void save(List<T> models) {
        mapper.insertList(models);
    }

    @Override
    public void deleteById(Integer id) {
        mapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteBatch(String ids) {
        mapper.deleteByIds(ids);
    }

    @Override
    public void update(T model) {
        mapper.updateByPrimaryKeySelective(model);
    }
}
