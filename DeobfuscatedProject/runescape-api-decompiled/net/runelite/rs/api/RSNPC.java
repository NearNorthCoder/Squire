/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.NPC;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSActor;
import net.runelite.rs.api.RSNPCComposition;
import net.runelite.rs.api.RSNPCOverheads;
import net.runelite.rs.api.RSNpcOverrides;

public interface RSNPC
extends RSActor,
NPC {
    @Import(value="definition")
    public RSNPCComposition getComposition();

    @Import(value="definition")
    public void setComposition(RSNPCComposition var1);

    public void setIndex(int var1);

    @Import(value="modelOverrides")
    public RSNpcOverrides getModelOverrides();

    @Import(value="chatHeadOverrides")
    public RSNpcOverrides getChatheadOverrides();

    @Import(value="overheads")
    public RSNPCOverheads getOverheads();
}

