package com.revature.aspects;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	private static Logger log = Logger.getLogger(LoggingAspect.class);
	
	@Before (value = "execution(* com.revature.*.*.*(..))")
	public void logBefore(JoinPoint joinPoint) {
		log.info("Before advice for: [" + joinPoint.getTarget().getClass() + ":" + joinPoint.getSignature().getName() + "]");
	}
	
	//@After(value = "execution(* com.revature.services.AnimeServiceImpl.getAllAnimeShows(..))")
	@After (value = "execution(* com.revature.*.*.*(..))")
	public void logAfter(JoinPoint joinPoint) {
		log.info("After advice for: [" + joinPoint.getTarget().getClass() + ":" + joinPoint.getSignature().getName() + "]");
	}
}
