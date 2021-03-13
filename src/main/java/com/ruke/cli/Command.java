package com.ruke.cli;

import org.springframework.stereotype.Component;

import picocli.CommandLine;

/**
 * Picocli main command
 *
 * @author lunaru
 * @version 1.0
 * @since 3/11/2021
 */
@Component
@CommandLine.Command( name = "main",
        version = {
                "\n-----------------------------------------------------------------------------------------\n",
                "@|green,bg(white) Microservice Generator Cli 1.0.0|@",
                "@|green,bg(white) Picocli: " + picocli.CommandLine.VERSION + "|@",
                "@|red,bg(white) JVM: ${java.version} (${java.vendor} ${java.vm.name} ${java.vm.version})|@",
                "@|red,bg(white) OS: ${os.name} ${os.version} ${os.arch}|@",
                "@|black,bg(white) (c) 2021|@",
                "\n-----------------------------------------------------------------------------------------\n"
        },
        header = "%n@|green,bg(white) Cli Application with Spring Boot, picocli and Thymeleaf|@",
        description = "Microservice Generator Cli.%n",
        subcommands = { CreateCommand.class },
        mixinStandardHelpOptions = true )
//The mixinStandardHelpOptions attribute adds --help and --version options
public class Command
{
}
