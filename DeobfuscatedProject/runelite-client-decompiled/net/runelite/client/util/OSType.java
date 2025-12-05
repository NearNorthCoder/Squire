/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.client.util;

public enum OSType {
    Windows,
    MacOS,
    Linux,
    Other;

    private static final OSType OS_TYPE;

    public static OSType getOSType() {
        return OS_TYPE;
    }

    static {
        String OS2 = System.getProperty("os.name", "generic").toLowerCase();
        OS_TYPE = OS2.contains("mac") || OS2.contains("darwin") ? MacOS : (OS2.contains("win") ? Windows : (OS2.contains("nux") ? Linux : Other));
    }
}

