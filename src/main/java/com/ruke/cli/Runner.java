package com.ruke.cli;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import picocli.CommandLine;
import picocli.CommandLine.IFactory;

/**
 * Class that initializes the picocli commands
 *
 * @author lunaru
 * @version 1.0
 * @since 3/11/2021
 */
@Component
public class Runner implements CommandLineRunner
{
    //#region Properties
    // auto-configured to inject PicocliSpringFactory
    private final IFactory _factory;
    private final Command _command;
    //#endregion

    //#region Constructors
    /**
     * Class constructor.
     * @param factory injected factory
     * @param command injected command
     */
    public Runner( IFactory factory, Command command )
    {
        this._factory = factory;
        this._command = command;
    }
    //#endregion

    //#region Methods
    @Override
    public void run(String... args)
    {
        CommandLine commandLine = new CommandLine( _command, _factory );
        commandLine.execute( args );
    }
    //#endregion
}
