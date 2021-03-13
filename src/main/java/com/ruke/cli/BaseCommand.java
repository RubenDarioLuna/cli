package com.ruke.cli;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

import picocli.CommandLine;

/**
 * Abstract class for subcommands
 *
 * @author lunaru
 * @version 1.0
 * @since 3/13/2021
 */
public abstract class BaseCommand
{
    //#region Properties
    @CommandLine.ParentCommand
    protected Command _parent;

    private Console _console;
    //#endregion

    //#region Constructors
    /**
     * Class constructor.
     */
    public BaseCommand()
    {
        _console = System.console();
    }
    //#endregion

    //#region Methods

    /**
     *
     * @param message
     */
    protected void printlnMessage( String message )
    {
        _console.printf( message + "\n" );
    }

    /**
     *
     * @param message
     */
    protected void printMessage( String message )
    {
        _console.printf( message );
    }

    /**
     *
     * @param message
     */
    protected void formatMessage( String message )
    {
        _console.format( message );
    }

    /**
     *
     * @return
     */
    protected String requestData()
    {
        return _console.readLine();
    }

    /**
     *
     * @param message
     * @return
     */
    protected String requestData( String message )
    {
        return _console.readLine( message );
    }

    /**
     *
     * @return
     */
    protected char[] requestPassword()
    {
        return _console.readPassword();
    }

    /**
     *
     * @param message
     * @return
     */
    protected char[] requestPassword( String message )
    {
        return _console.readPassword( message );
    }

    /**
     *
     */
    protected void writer()
    {
        _console.writer();
    }
    //#endregion
}
