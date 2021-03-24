package com.ruke.cli.commands;

import org.springframework.stereotype.Component;

import picocli.CommandLine;

/**
 * Command class that creates Spring projects with Spring Initializr API
 *
 * @author lunaru
 * @version 1.0
 * @since 3/13/2021
 */
@Component
@CommandLine.Command( name = "create",
        version = {
                "@|green,bg(white) Create Spring Microservice v1.0.0|@",
                "@|green,bg(white) Picocli: " + picocli.CommandLine.VERSION + "|@",
                "@|red,bg(white) JVM: ${java.version} (${java.vendor} ${java.vm.name} ${java.vm.version})|@",
                "@|red,bg(white) OS: ${os.name} ${os.version} ${os.arch}|@",
                "@|black,bg(white) (c) 2021|@"},
        header = "%n@|green,bg(white) Command create a microservice|@",
        description = "This command create a microservice with Spring Framework!.%n",
        mixinStandardHelpOptions = true )
//The mixinStandardHelpOptions attribute adds --help and --version options
public class CreateCommand extends BaseCommand implements Runnable
{
    //#region Properties
    //#endregion

    //#region Constructors
    /**
     * Class constructor.
     */
    public CreateCommand()
    {

    }
    //#endregion

    //#region Methods
    @Override
    public void run()
    {
        try
        {
            String data = requestData( "Hi! Insert name microservice: " );
            printlnMessage( "The microservice name is: " + data);
            printlnMessage( "Bye!" );
        }
        catch ( Exception e )
        {
            printMessage( "Ha ocurrido un error" );
        }
    }
    //#endregion
}
