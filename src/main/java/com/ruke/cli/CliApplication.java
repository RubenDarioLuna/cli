package com.ruke.cli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring main class
 *
 * @author Spring Initializr
 * @version 1.0
 * @since 3/11/2021
 */
@SpringBootApplication
public class CliApplication
{
    public static void main(String[] args)
    {
        System.exit( SpringApplication.exit( SpringApplication.run( CliApplication.class, args ) ) );
    }
}

