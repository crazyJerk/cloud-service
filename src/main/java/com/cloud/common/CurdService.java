package com.cloud.common;

import org.springframework.transaction.annotation.Transactional;

/**
 * Created by lisu on 2017/2/28.
 */
@Transactional(readOnly = true)
public class CurdService<D extends CurdDao<T>, T extends BaseEntity> extends BaseService<D> {
}
