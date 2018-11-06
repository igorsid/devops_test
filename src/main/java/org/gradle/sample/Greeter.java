package org.gradle.sample;

import java.io.InputStream;
import org.apache.log4j.LogManager;
import org.apache.commons.io.IOUtils;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Greeter {
    public String getGreeting() throws Exception {
        LogManager.getRootLogger().info("generating greeting.");
        InputStream greetingStr = getClass().getResourceAsStream("/greeting.txt");
        try {
            return IOUtils.toString(greetingStr).trim();
        }
        finally {
            greetingStr.close();
        }
    }
    public String getServerip() throws Exception {
        try {
            return InetAddress.getLocalHost().getHostAddress();
        }
        finally {
        }
    }
}
