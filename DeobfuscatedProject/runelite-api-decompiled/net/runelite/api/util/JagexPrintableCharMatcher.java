/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api.util;

import com.google.common.base.CharMatcher;

class JagexPrintableCharMatcher
extends CharMatcher {
    JagexPrintableCharMatcher() {
    }

    @Override
    public boolean matches(char c) {
        return c >= ' ' && c <= '~' || c == '\u0080' || c >= '\u00a0' && c <= '\u00ff';
    }
}

