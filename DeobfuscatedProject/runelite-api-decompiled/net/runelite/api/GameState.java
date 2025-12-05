/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public enum GameState {
    UNKNOWN(-1),
    STARTING(0),
    LOGIN_SCREEN(10),
    LOGIN_SCREEN_AUTHENTICATOR(11),
    LOGGING_IN(20),
    LOADING(25),
    LOGGED_IN(30),
    CONNECTION_LOST(40),
    HOPPING(45);

    private static final Map<Integer, GameState> stateValueMap;
    private final int state;

    private GameState(int state) {
        this.state = state;
    }

    public static GameState of(int state) {
        return stateValueMap.getOrDefault(state, UNKNOWN);
    }

    public int getState() {
        return this.state;
    }

    static {
        stateValueMap = Arrays.stream(GameState.values()).collect(Collectors.toMap(gs -> gs.state, Function.identity()));
    }
}

