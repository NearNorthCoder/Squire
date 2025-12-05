/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Nameable
 *  net.runelite.api.NameableContainer
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.Nameable;
import net.runelite.api.NameableContainer;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSUser;
import net.runelite.rs.api.RSUsername;

public interface RSUserList<T extends Nameable>
extends NameableContainer<T> {
    @Import(value="array")
    public Nameable[] getNameables();

    @Import(value="getSize")
    public int getCount();

    @Import(value="capacity")
    public int getSize();

    @Import(value="getByUsername")
    public T findByName(RSUsername var1);

    public void rl$add(RSUsername var1, RSUsername var2);

    public void rl$remove(RSUser var1);
}

