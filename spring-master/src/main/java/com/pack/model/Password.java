package com.pack.model;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RUNTIME)
@Target({ FIELD, METHOD })
@Constraint(validatedBy=PasswordValidator.class)
public @interface Password {
	public String message() default "Password should be [A-Z][0-9][a-z]";  
    public Class<?>[] groups() default {};    
    public Class<? extends Payload>[] payload() default {}; 
	
}
