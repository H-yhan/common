
package com.tuya.penglai.assembler;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.cglib.beans.BeanCopier;

/**
 * Created by smartbruce on 2017/3/30.
 */
public class BaseAssembler {

	static Map<Class, BeanCopier> copierMap = new ConcurrentHashMap<>();

	static BeanCopier getBeanCopier(Class fromClazz, Class toClazz) {
		BeanCopier beanCopier = copierMap.get(fromClazz);
		if (beanCopier == null) {
			beanCopier = BeanCopier.create(fromClazz, toClazz, false);
			copierMap.put(fromClazz, beanCopier);
		}
		return beanCopier;
	}

	public static <F, T> T assemble(F from, Class<T> toClazz) {
		if (from == null) {
			return null;
		}
		try {
			T to = toClazz.newInstance();
			getBeanCopier(from.getClass(), toClazz).copy(from, to, null);
			return to;
		} catch (Exception e) {
			return null;
		}
	}
}
