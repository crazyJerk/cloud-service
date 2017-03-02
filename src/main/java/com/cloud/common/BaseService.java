package com.cloud.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.Validator;

import java.util.List;

/**
 * Created by lisu on 2017/2/28.
 */
@Transactional(readOnly = true)
public class BaseService<D extends BaseDao> {
    @Autowired
    protected D dao;
    @Autowired
    protected Validator validator;

    public String validate(Object target) {
        if (target == null)
            return "获取对象为NULL";
        BindingResult errors = new BeanPropertyBindingResult(target, target.getClass().getName());
        validator.validate(target, errors);
        if (errors != null && errors.hasErrors()) {
            List<ObjectError> allErrors = errors.getAllErrors();
            if (allErrors != null && allErrors.size() > 0)
                return allErrors.get(0).getDefaultMessage();
        }
        return null;
    }
}
