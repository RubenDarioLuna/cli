package com.ruke.cli;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * Class to get the properties of any configuration file
 *
 * @author lunaru
 * @version 1.0
 * @since 3/20/2021
 */
@Component
public class Properties
{
    //#region Privates Attributes
    private static Environment _environment;
    //#endregion

    //#region Constructs
    /**
     * Class constructor.
     * @param environment injected Environment
     */
    public Properties( Environment environment )
    {
        this._environment = environment;
    }
    //endregion

    //#region Public Static Methods

    /**
     * Method to obtain the value of a property according to its name
     *
     * @param nameProperty name of the property to get
     * @return property value
     */
    public static String getProperty( String nameProperty )
    {
        if( _environment.containsProperty( nameProperty ) )
            return _environment.getProperty( nameProperty );
        else
            return nameProperty;
    }
    //#endregion
}
