/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.WidgetNode
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.WidgetNode;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSNode;

public interface RSInterfaceParent
extends RSNode,
WidgetNode {
    @Import(value="group")
    public int getId();

    @Import(value="type")
    public int getModalMode();
}

