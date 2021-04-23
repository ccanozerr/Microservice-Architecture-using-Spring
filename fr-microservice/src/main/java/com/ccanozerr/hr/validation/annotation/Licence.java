package com.ccanozerr.hr.validation.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.ccanozerr.hr.validation.validator.LicenceValidator;

@Target({ ElementType.FIELD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy=LicenceValidator.class)
public @interface Licence {
	String message() default "{validation.licence}";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
