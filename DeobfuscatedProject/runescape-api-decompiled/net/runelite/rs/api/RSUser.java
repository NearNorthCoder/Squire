/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Nameable
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.Nameable;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSUsername;

public interface RSUser
extends Nameable,
Comparable<Nameable> {
    @Import(value="username")
    public RSUsername getRsName();

    @Import(value="previousUsername")
    public RSUsername getRsPrevName();
}

