/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.IterableHashTable
 *  net.runelite.api.NPCComposition
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.IterableHashTable;
import net.runelite.api.NPCComposition;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSIterableNodeHashTable;

public interface RSNPCComposition
extends NPCComposition {
    @Import(value="name")
    public String getName();

    @Import(value="models")
    public int[] getModels();

    @Import(value="actions")
    public String[] getActions();

    @Import(value="isClickable")
    public boolean isClickable();

    @Import(value="isInteractable")
    public boolean isInteractible();

    @Import(value="drawMapDot")
    public boolean isMinimapVisible();

    @Import(value="id")
    public int getId();

    @Import(value="combatLevel")
    public int getCombatLevel();

    @Import(value="transforms")
    public int[] getConfigs();

    @Import(value="transform")
    public RSNPCComposition transform();

    @Import(value="size")
    public int getSize();

    @Import(value="recolorFrom")
    public short[] getColorToReplace();

    @Import(value="recolorTo")
    public short[] getColorToReplaceWith();

    @Import(value="widthScale")
    public int getWidthScale();

    @Import(value="heightScale")
    public int getHeightScale();

    @Import(value="transformVarbit")
    public int getTransformVarbit();

    @Import(value="transformVarp")
    public int getTransformVarp();

    @Import(value="isFollower")
    public boolean isFollower();

    default public int getRsOverheadIcon() {
        return this.getRsOverheadIcons()[0];
    }

    @Import(value="overheadIcons")
    public short[] getRsOverheadIcons();

    @Import(value="params")
    public RSIterableNodeHashTable getParams();

    @Import(value="params")
    public void setParams(IterableHashTable var1);

    @Import(value="params")
    public void setParams(RSIterableNodeHashTable var1);
}

