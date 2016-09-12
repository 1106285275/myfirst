package com.people.utils;

import javax.swing.text.DefaultEditorKit.BeepAction;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.annotation.AnnotatedGenericBeanDefinition;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionHolder;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReaderUtils;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.context.annotation.Configuration;

import com.people.entity.ShanhyA;
import com.people.entity.ShanhyB;

@Configuration
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor{
	
	private BeanNameGenerator beanNameGenerator;

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
		System.out.println("======================postProcessBeanFactory========================");
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("=====================Registry==============");
		registryBean(registry, "shanhyA", ShanhyA.class);
		registryBean(registry, "shanhyB", ShanhyB.class);
		
	}
	
	public void registryBean(BeanDefinitionRegistry beanDefinitionRegistry,String name,Class<?>beanClass){
		AnnotatedBeanDefinition annotatedBeanDefinition = new AnnotatedGenericBeanDefinition(beanClass);
		String beanName = name!=null ?name:beanNameGenerator.generateBeanName(annotatedBeanDefinition, beanDefinitionRegistry);
		BeanDefinitionHolder beanDefinitionHolder =new BeanDefinitionHolder(annotatedBeanDefinition, beanName);
		BeanDefinitionReaderUtils.registerBeanDefinition(beanDefinitionHolder, beanDefinitionRegistry);
	}

}
