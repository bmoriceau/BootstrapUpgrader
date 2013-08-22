package com.turn.tools.boostrapupgrader.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
/**
 * Use basePackageClasses for scanning an enter package, cf javadoc
 * @author bmoriceau
 *
 */
@ComponentScan(basePackageClasses={com.turn.tools.boostrapupgrader.filemanager.FileLoader.class})
public class SpringConfiguration {

}
