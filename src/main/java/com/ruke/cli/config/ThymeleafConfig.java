package com.ruke.cli.config;

import com.ruke.cli.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;
import org.thymeleaf.templateresolver.ITemplateResolver;

/**
 * Class that configures the use of thymeleaf for templates in the required format and extension
 *
 * @author lunaru
 * @version 1.0
 * @since 3/20/2021
 */
@Configuration
public class ThymeleafConfig
{
    //#region Beans

    /**
     * Bean that loads a singleton instance to TemplateEngine's Spring container
     *
     * @return instance to be able to inject TemplateEngine
     */
    @Bean(name = "textTemplateEngine")
    public TemplateEngine textTemplateEngine()
    {
        TemplateEngine templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolver( templateResolver() );
        return templateEngine;
    }

    /**
     * Bean that loads a singleton instance to Context's Spring container
     *
     * @return instance to be able to inject Context
     */
    @Bean(name = "contextTemplateEngine")
    public Context contextTemplateEngine()
    {
        return new Context();
    }
    //#endregion

    //#region Methods

    /**
     * Method that specifies: prefix, suffix, type/mode and character encoding of the templates to use
     *
     * @return ITemplateResolver specifications on the type of templates to use
     */
    private ITemplateResolver templateResolver()
    {
        ClassLoaderTemplateResolver templateResolver = new ClassLoaderTemplateResolver();
        templateResolver.setPrefix( Properties.getProperty( "spring.thymeleaf.prefix" ) );
        templateResolver.setSuffix( Properties.getProperty( "spring.thymeleaf.suffix" ) );
        templateResolver.setTemplateMode( TemplateMode.TEXT );
        templateResolver.setCharacterEncoding( Properties.getProperty( "spring.thymeleaf.encoding" ) );
        templateResolver.setCheckExistence( true );
        templateResolver.setCacheable( false );

        return templateResolver;
    }
    //#endregion
}
