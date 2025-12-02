/*
 * Decompiled with CFR 0.152.
 */
package net.unethicalite.api.script.blocking_events;

public static interface LoginEvent.State {
    public static final int MAIN_MENU = 0;
    public static final int BETA_WORLD = 1;
    public static final int ENTER_CREDENTIALS = 2;
    public static final int INVALID_CREDENTIALS = 3;
    public static final int AUTHENTICATOR = 4;
    public static final int DISABLED = 14;
    public static final int BEEN_DISCONNECTED = 24;
}
