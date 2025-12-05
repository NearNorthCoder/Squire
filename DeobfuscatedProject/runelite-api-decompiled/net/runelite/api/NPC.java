/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api;

import javax.annotation.Nullable;
import net.runelite.api.Actor;
import net.runelite.api.NPCComposition;
import net.runelite.api.NpcOverrides;

public interface NPC
extends Actor {
    @Override
    public int getId();

    @Override
    public String getName();

    @Override
    public int getCombatLevel();

    public int getIndex();

    public NPCComposition getComposition();

    @Nullable
    public NPCComposition getTransformedComposition();

    public void setTransformedComposition(NPCComposition var1);

    public int getTransformedId();

    public String getTransformedName();

    public int getTransformedLevel();

    public void setComposition(NPCComposition var1);

    public void onDefinitionChanged(NPCComposition var1);

    @Nullable
    public NpcOverrides getModelOverrides();

    @Nullable
    public NpcOverrides getChatheadOverrides();

    public short[] getOverheadIcons();
}

